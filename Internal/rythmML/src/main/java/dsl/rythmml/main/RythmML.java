package main.java.dsl.rythmml.main;

import main.java.dsl.rythmml.RythmMLDSL;

import java.io.File;

/**
 * This main takes one argument: the path to the Groovy script file to execute.
 * This Groovy script file must follow GroovuinoML DSL's rules.
 * 
 * "We've Got A Groovy Thing Goin'"!
 * 
 * @author Thomas Moreau
 */
public class RythmML {
	public static void main(String[] args) {
		RythmMLDSL dsl = new RythmMLDSL();
		if(args.length > 0) {
			dsl.eval(new File(args[0]));
		} else {
			System.out.println("/!\\ Missing arg: Please specify the path to a Groovy script file to execute");
		}
	}
}
