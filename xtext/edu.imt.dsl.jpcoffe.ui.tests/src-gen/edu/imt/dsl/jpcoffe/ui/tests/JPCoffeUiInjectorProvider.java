/*
 * generated by Xtext 2.15.0
 */
package edu.imt.dsl.jpcoffe.ui.tests;

import com.google.inject.Injector;
import edu.imt.dsl.jpcoffe.ui.internal.JpcoffeActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class JPCoffeUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return JpcoffeActivator.getInstance().getInjector("edu.imt.dsl.jpcoffe.JPCoffe");
	}

}
