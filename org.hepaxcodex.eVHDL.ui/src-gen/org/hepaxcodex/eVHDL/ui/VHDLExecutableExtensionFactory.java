/*
 * generated by Xtext
 */
package org.hepaxcodex.eVHDL.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class VHDLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.hepaxcodex.eVHDL.ui.internal.VHDLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.hepaxcodex.eVHDL.ui.internal.VHDLActivator.getInstance().getInjector("org.hepaxcodex.eVHDL.VHDL");
	}
	
}
