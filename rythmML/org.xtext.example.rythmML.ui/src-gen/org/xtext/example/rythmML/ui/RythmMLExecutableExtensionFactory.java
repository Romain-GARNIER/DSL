/*
 * generated by Xtext
 */
package org.xtext.example.rythmML.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.rythmML.ui.internal.RythmMLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RythmMLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RythmMLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RythmMLActivator.getInstance().getInjector(RythmMLActivator.ORG_XTEXT_EXAMPLE_RYTHMML_RYTHMML);
	}
	
}
