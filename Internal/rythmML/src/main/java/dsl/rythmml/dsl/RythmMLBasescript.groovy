package main.java.dsl.rythmml.dsl

abstract class RythmMLBasescript extends Script {

	def sequence(String name){
		((RythmMLBinding) this.getBinding()).getGroovuinoMLModel()
	}
	
	// export name
	def export(String name) {
		println(((RythmMLBinding) this.getBinding()).getGroovuinoMLModel().generateCode(name).toString())
	}
	
	// disable run method while running
	int count = 0
	abstract void scriptBody()
	def run() {
		if(count == 0) {
			count++
			scriptBody()
		} else {
			println "Run method is disabled"
		}
	}
}
