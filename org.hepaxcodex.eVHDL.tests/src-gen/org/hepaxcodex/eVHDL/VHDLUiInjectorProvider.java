/*
* generated by Xtext
*/
package org.hepaxcodex.eVHDL;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class VHDLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.hepaxcodex.eVHDL.ui.internal.VHDLActivator.getInstance().getInjector("org.hepaxcodex.eVHDL.VHDL");
	}
	
}