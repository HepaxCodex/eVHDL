
package org.hepaxcodex.eVHDL;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class VHDLStandaloneSetup extends VHDLStandaloneSetupGenerated{

	public static void doSetup() {
		new VHDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

