package main.java.dsl.rythmml.dsl

import main.java.dsl.rythmml.model.InstrumentDSL
import main.java.dsl.rythmml.model.NoteValue
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.SecureASTCustomizer

class RythmMLDSL {
	private GroovyShell shell
	private CompilerConfiguration configuration
	private RythmMLBinding binding
	private RythmMLBasescript basescript

	RythmMLDSL() {
		binding = new RythmMLBinding()
		binding.setRythmMLModel(new RythmMLModel(binding));
		configuration = getDSLConfiguration()
		configuration.setScriptBaseClass("main.java.dsl.rythmml.dsl.RythmMLBasescript")
		shell = new GroovyShell(configuration)
		
		binding.setVariable("piano", InstrumentDSL.Piano)
		binding.setVariable("electric guitar", InstrumentDSL.ElectricGuitar)
		binding.setVariable("drum", InstrumentDSL.Drum)

		binding.setVariable("do", NoteValue.Do)
		binding.setVariable("do#", NoteValue.DoX)
		binding.setVariable("re", NoteValue.Re)
		binding.setVariable("re#", NoteValue.ReX)
		binding.setVariable("mi", NoteValue.Mi)
		binding.setVariable("fa", NoteValue.Fa)
		binding.setVariable("fa#", NoteValue.FaX)
		binding.setVariable("sol", NoteValue.Sol)
		binding.setVariable("sol#", NoteValue.SolX)
		binding.setVariable("la", NoteValue.La)
		binding.setVariable("la#", NoteValue.LaX)
		binding.setVariable("si", NoteValue.Si)
		binding.setVariable("acoustic bass drum", NoteValue.AcousticBassDrum)
		binding.setVariable("bd", NoteValue.BassDrum1)
		binding.setVariable("ch", NoteValue.ClosedHiHat)
		binding.setVariable("sd", NoteValue.AcousticSnare)
		binding.setVariable("rc", NoteValue.RideCymbal1)
	}
	
	private static CompilerConfiguration getDSLConfiguration() {
		def secure = new SecureASTCustomizer()
		secure.with {
			//disallow closure creation
			closuresAllowed = false
			//disallow method definitions
			methodDefinitionAllowed = true
			//empty white list => forbid imports
			importsWhitelist = [
				'java.lang.*'
			]
			staticImportsWhitelist = []
			staticStarImportsWhitelist= []
			//language tokens disallowed
//			tokensBlacklist= []
			//language tokens allowed
			tokensWhitelist= []
			//types allowed to be used  (including primitive types)
			constantTypesClassesWhiteList= [
				int, Integer, Number, Integer.TYPE, String, Object
			]
			//classes who are allowed to be receivers of method calls
			receiversClassesWhiteList= [
				int, Number, Integer, String, Object
			]
		}
		
		def configuration = new CompilerConfiguration()
		configuration.addCompilationCustomizers(secure)
		
		return configuration
	}
	
	void eval(File scriptFile) {
		Script script = shell.parse(scriptFile)
		
		binding.setScript(script)
		script.setBinding(binding)
		
		script.run()
	}
}
