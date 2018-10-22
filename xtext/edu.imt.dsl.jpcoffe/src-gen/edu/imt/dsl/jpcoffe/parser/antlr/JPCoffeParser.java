/*
 * generated by Xtext 2.15.0
 */
package edu.imt.dsl.jpcoffe.parser.antlr;

import com.google.inject.Inject;
import edu.imt.dsl.jpcoffe.parser.antlr.internal.InternalJPCoffeParser;
import edu.imt.dsl.jpcoffe.services.JPCoffeGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class JPCoffeParser extends AbstractAntlrParser {

	@Inject
	private JPCoffeGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalJPCoffeParser createParser(XtextTokenStream stream) {
		return new InternalJPCoffeParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Main";
	}

	public JPCoffeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JPCoffeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
