/*
 * generated by Xtext
 */
package org.xtext.example.rythmML;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class RythmMLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return org.xtext.example.rythmML.ui.internal.RythmMLActivator.getInstance().getInjector("org.xtext.example.rythmML.RythmML");
	}

}