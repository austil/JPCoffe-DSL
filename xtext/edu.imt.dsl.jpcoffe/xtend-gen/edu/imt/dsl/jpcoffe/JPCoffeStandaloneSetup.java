/**
 * generated by Xtext 2.15.0
 */
package edu.imt.dsl.jpcoffe;

import edu.imt.dsl.jpcoffe.JPCoffeStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class JPCoffeStandaloneSetup extends JPCoffeStandaloneSetupGenerated {
  public static void doSetup() {
    new JPCoffeStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
