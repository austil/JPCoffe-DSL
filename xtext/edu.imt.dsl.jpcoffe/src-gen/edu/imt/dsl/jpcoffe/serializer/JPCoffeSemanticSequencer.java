/*
 * generated by Xtext 2.15.0
 */
package edu.imt.dsl.jpcoffe.serializer;

import com.google.inject.Inject;
import edu.imt.dsl.jpcoffe.jPCoffe.JPCoffePackage;
import edu.imt.dsl.jpcoffe.jPCoffe.Main;
import edu.imt.dsl.jpcoffe.jPCoffe.PortionNB;
import edu.imt.dsl.jpcoffe.services.JPCoffeGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class JPCoffeSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JPCoffeGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == JPCoffePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JPCoffePackage.MAIN:
				sequence_Main(context, (Main) semanticObject); 
				return; 
			case JPCoffePackage.PORTION_NB:
				sequence_PortionNB(context, (PortionNB) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Main returns Main
	 *
	 * Constraint:
	 *     recipes+=Recipe+
	 */
	protected void sequence_Main(ISerializationContext context, Main semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Recipe returns PortionNB
	 *     PortionNB returns PortionNB
	 *
	 * Constraint:
	 *     nb=INT
	 */
	protected void sequence_PortionNB(ISerializationContext context, PortionNB semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JPCoffePackage.Literals.PORTION_NB__NB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPCoffePackage.Literals.PORTION_NB__NB));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPortionNBAccess().getNbINTTerminalRuleCall_1_0(), semanticObject.getNb());
		feeder.finish();
	}
	
	
}
