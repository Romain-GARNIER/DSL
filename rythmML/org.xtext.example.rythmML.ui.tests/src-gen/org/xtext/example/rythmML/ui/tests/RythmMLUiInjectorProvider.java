/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.rythmML.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.rythmML.ui.internal.RythmMLActivator;

public class RythmMLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RythmMLActivator.getInstance().getInjector("org.xtext.example.rythmML.RythmML");
	}

}
