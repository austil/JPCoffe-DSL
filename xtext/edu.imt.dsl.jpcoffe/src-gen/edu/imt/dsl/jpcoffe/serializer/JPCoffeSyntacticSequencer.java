/*
 * generated by Xtext 2.15.0
 */
package edu.imt.dsl.jpcoffe.serializer;

import com.google.inject.Inject;
import edu.imt.dsl.jpcoffe.services.JPCoffeGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class JPCoffeSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JPCoffeGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PortionNB_PeopleKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JPCoffeGrammarAccess) access;
		match_PortionNB_PeopleKeyword_2_q = new TokenAlias(false, true, grammarAccess.getPortionNBAccess().getPeopleKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getTITLE_LINERule())
			return getTITLE_LINEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal TITLE_LINE : ("-")+;
	 */
	protected String getTITLE_LINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_PortionNB_PeopleKeyword_2_q.equals(syntax))
				emit_PortionNB_PeopleKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'people'?
	 *
	 * This ambiguous syntax occurs at:
	 *     nb=INT (ambiguity) (rule end)
	 */
	protected void emit_PortionNB_PeopleKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
