package edu.imt.dsl.jpcoffe.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import edu.imt.dsl.jpcoffe.services.JPCoffeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJPCoffeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MAJ_WORD", "RULE_WORD", "RULE_TITLE_LINE", "RULE_STRING", "RULE_INT", "RULE_METRIC_UNIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'Recipe'", "'{'", "'}'", "'For'", "'people'", "'Ingredients'", "'*'", "'Tools'", "'Steps'", "'->'", "'.'", "','"
    };
    public static final int RULE_METRIC_UNIT=9;
    public static final int RULE_WORD=5;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_WS=12;
    public static final int RULE_MAJ_WORD=4;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_TITLE_LINE=6;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJPCoffeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJPCoffeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJPCoffeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJPCoffe.g"; }


    	private JPCoffeGrammarAccess grammarAccess;

    	public void setGrammarAccess(JPCoffeGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMain"
    // InternalJPCoffe.g:53:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalJPCoffe.g:54:1: ( ruleMain EOF )
            // InternalJPCoffe.g:55:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalJPCoffe.g:62:1: ruleMain : ( ruleRecipe ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:66:2: ( ( ruleRecipe ) )
            // InternalJPCoffe.g:67:2: ( ruleRecipe )
            {
            // InternalJPCoffe.g:67:2: ( ruleRecipe )
            // InternalJPCoffe.g:68:3: ruleRecipe
            {
             before(grammarAccess.getMainAccess().getRecipeParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getMainAccess().getRecipeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleRecipe"
    // InternalJPCoffe.g:78:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // InternalJPCoffe.g:79:1: ( ruleRecipe EOF )
            // InternalJPCoffe.g:80:1: ruleRecipe EOF
            {
             before(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_1);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // InternalJPCoffe.g:87:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:91:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // InternalJPCoffe.g:92:2: ( ( rule__Recipe__Group__0 ) )
            {
            // InternalJPCoffe.g:92:2: ( ( rule__Recipe__Group__0 ) )
            // InternalJPCoffe.g:93:3: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // InternalJPCoffe.g:94:3: ( rule__Recipe__Group__0 )
            // InternalJPCoffe.g:94:4: rule__Recipe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "entryRulePortionNB"
    // InternalJPCoffe.g:103:1: entryRulePortionNB : rulePortionNB EOF ;
    public final void entryRulePortionNB() throws RecognitionException {
        try {
            // InternalJPCoffe.g:104:1: ( rulePortionNB EOF )
            // InternalJPCoffe.g:105:1: rulePortionNB EOF
            {
             before(grammarAccess.getPortionNBRule()); 
            pushFollow(FOLLOW_1);
            rulePortionNB();

            state._fsp--;

             after(grammarAccess.getPortionNBRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePortionNB"


    // $ANTLR start "rulePortionNB"
    // InternalJPCoffe.g:112:1: rulePortionNB : ( ( rule__PortionNB__Group__0 ) ) ;
    public final void rulePortionNB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:116:2: ( ( ( rule__PortionNB__Group__0 ) ) )
            // InternalJPCoffe.g:117:2: ( ( rule__PortionNB__Group__0 ) )
            {
            // InternalJPCoffe.g:117:2: ( ( rule__PortionNB__Group__0 ) )
            // InternalJPCoffe.g:118:3: ( rule__PortionNB__Group__0 )
            {
             before(grammarAccess.getPortionNBAccess().getGroup()); 
            // InternalJPCoffe.g:119:3: ( rule__PortionNB__Group__0 )
            // InternalJPCoffe.g:119:4: rule__PortionNB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PortionNB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortionNBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePortionNB"


    // $ANTLR start "entryRuleIngredientsBlock"
    // InternalJPCoffe.g:128:1: entryRuleIngredientsBlock : ruleIngredientsBlock EOF ;
    public final void entryRuleIngredientsBlock() throws RecognitionException {
        try {
            // InternalJPCoffe.g:129:1: ( ruleIngredientsBlock EOF )
            // InternalJPCoffe.g:130:1: ruleIngredientsBlock EOF
            {
             before(grammarAccess.getIngredientsBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleIngredientsBlock();

            state._fsp--;

             after(grammarAccess.getIngredientsBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIngredientsBlock"


    // $ANTLR start "ruleIngredientsBlock"
    // InternalJPCoffe.g:137:1: ruleIngredientsBlock : ( ( rule__IngredientsBlock__Group__0 ) ) ;
    public final void ruleIngredientsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:141:2: ( ( ( rule__IngredientsBlock__Group__0 ) ) )
            // InternalJPCoffe.g:142:2: ( ( rule__IngredientsBlock__Group__0 ) )
            {
            // InternalJPCoffe.g:142:2: ( ( rule__IngredientsBlock__Group__0 ) )
            // InternalJPCoffe.g:143:3: ( rule__IngredientsBlock__Group__0 )
            {
             before(grammarAccess.getIngredientsBlockAccess().getGroup()); 
            // InternalJPCoffe.g:144:3: ( rule__IngredientsBlock__Group__0 )
            // InternalJPCoffe.g:144:4: rule__IngredientsBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IngredientsBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientsBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredientsBlock"


    // $ANTLR start "entryRuleIngredient"
    // InternalJPCoffe.g:153:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // InternalJPCoffe.g:154:1: ( ruleIngredient EOF )
            // InternalJPCoffe.g:155:1: ruleIngredient EOF
            {
             before(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getIngredientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalJPCoffe.g:162:1: ruleIngredient : ( ( rule__Ingredient__Group__0 ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:166:2: ( ( ( rule__Ingredient__Group__0 ) ) )
            // InternalJPCoffe.g:167:2: ( ( rule__Ingredient__Group__0 ) )
            {
            // InternalJPCoffe.g:167:2: ( ( rule__Ingredient__Group__0 ) )
            // InternalJPCoffe.g:168:3: ( rule__Ingredient__Group__0 )
            {
             before(grammarAccess.getIngredientAccess().getGroup()); 
            // InternalJPCoffe.g:169:3: ( rule__Ingredient__Group__0 )
            // InternalJPCoffe.g:169:4: rule__Ingredient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleQuantity"
    // InternalJPCoffe.g:178:1: entryRuleQuantity : ruleQuantity EOF ;
    public final void entryRuleQuantity() throws RecognitionException {
        try {
            // InternalJPCoffe.g:179:1: ( ruleQuantity EOF )
            // InternalJPCoffe.g:180:1: ruleQuantity EOF
            {
             before(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantity();

            state._fsp--;

             after(grammarAccess.getQuantityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuantity"


    // $ANTLR start "ruleQuantity"
    // InternalJPCoffe.g:187:1: ruleQuantity : ( ( rule__Quantity__Group__0 ) ) ;
    public final void ruleQuantity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:191:2: ( ( ( rule__Quantity__Group__0 ) ) )
            // InternalJPCoffe.g:192:2: ( ( rule__Quantity__Group__0 ) )
            {
            // InternalJPCoffe.g:192:2: ( ( rule__Quantity__Group__0 ) )
            // InternalJPCoffe.g:193:3: ( rule__Quantity__Group__0 )
            {
             before(grammarAccess.getQuantityAccess().getGroup()); 
            // InternalJPCoffe.g:194:3: ( rule__Quantity__Group__0 )
            // InternalJPCoffe.g:194:4: rule__Quantity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "entryRuleToolsBlock"
    // InternalJPCoffe.g:203:1: entryRuleToolsBlock : ruleToolsBlock EOF ;
    public final void entryRuleToolsBlock() throws RecognitionException {
        try {
            // InternalJPCoffe.g:204:1: ( ruleToolsBlock EOF )
            // InternalJPCoffe.g:205:1: ruleToolsBlock EOF
            {
             before(grammarAccess.getToolsBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleToolsBlock();

            state._fsp--;

             after(grammarAccess.getToolsBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleToolsBlock"


    // $ANTLR start "ruleToolsBlock"
    // InternalJPCoffe.g:212:1: ruleToolsBlock : ( ( rule__ToolsBlock__Group__0 ) ) ;
    public final void ruleToolsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:216:2: ( ( ( rule__ToolsBlock__Group__0 ) ) )
            // InternalJPCoffe.g:217:2: ( ( rule__ToolsBlock__Group__0 ) )
            {
            // InternalJPCoffe.g:217:2: ( ( rule__ToolsBlock__Group__0 ) )
            // InternalJPCoffe.g:218:3: ( rule__ToolsBlock__Group__0 )
            {
             before(grammarAccess.getToolsBlockAccess().getGroup()); 
            // InternalJPCoffe.g:219:3: ( rule__ToolsBlock__Group__0 )
            // InternalJPCoffe.g:219:4: rule__ToolsBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ToolsBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToolsBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleToolsBlock"


    // $ANTLR start "entryRuleTool"
    // InternalJPCoffe.g:228:1: entryRuleTool : ruleTool EOF ;
    public final void entryRuleTool() throws RecognitionException {
        try {
            // InternalJPCoffe.g:229:1: ( ruleTool EOF )
            // InternalJPCoffe.g:230:1: ruleTool EOF
            {
             before(grammarAccess.getToolRule()); 
            pushFollow(FOLLOW_1);
            ruleTool();

            state._fsp--;

             after(grammarAccess.getToolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTool"


    // $ANTLR start "ruleTool"
    // InternalJPCoffe.g:237:1: ruleTool : ( ( rule__Tool__Group__0 ) ) ;
    public final void ruleTool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:241:2: ( ( ( rule__Tool__Group__0 ) ) )
            // InternalJPCoffe.g:242:2: ( ( rule__Tool__Group__0 ) )
            {
            // InternalJPCoffe.g:242:2: ( ( rule__Tool__Group__0 ) )
            // InternalJPCoffe.g:243:3: ( rule__Tool__Group__0 )
            {
             before(grammarAccess.getToolAccess().getGroup()); 
            // InternalJPCoffe.g:244:3: ( rule__Tool__Group__0 )
            // InternalJPCoffe.g:244:4: rule__Tool__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tool__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTool"


    // $ANTLR start "entryRuleStepsBlock"
    // InternalJPCoffe.g:253:1: entryRuleStepsBlock : ruleStepsBlock EOF ;
    public final void entryRuleStepsBlock() throws RecognitionException {
        try {
            // InternalJPCoffe.g:254:1: ( ruleStepsBlock EOF )
            // InternalJPCoffe.g:255:1: ruleStepsBlock EOF
            {
             before(grammarAccess.getStepsBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleStepsBlock();

            state._fsp--;

             after(grammarAccess.getStepsBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStepsBlock"


    // $ANTLR start "ruleStepsBlock"
    // InternalJPCoffe.g:262:1: ruleStepsBlock : ( ( rule__StepsBlock__Group__0 ) ) ;
    public final void ruleStepsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:266:2: ( ( ( rule__StepsBlock__Group__0 ) ) )
            // InternalJPCoffe.g:267:2: ( ( rule__StepsBlock__Group__0 ) )
            {
            // InternalJPCoffe.g:267:2: ( ( rule__StepsBlock__Group__0 ) )
            // InternalJPCoffe.g:268:3: ( rule__StepsBlock__Group__0 )
            {
             before(grammarAccess.getStepsBlockAccess().getGroup()); 
            // InternalJPCoffe.g:269:3: ( rule__StepsBlock__Group__0 )
            // InternalJPCoffe.g:269:4: rule__StepsBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StepsBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepsBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStepsBlock"


    // $ANTLR start "entryRuleStep"
    // InternalJPCoffe.g:278:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalJPCoffe.g:279:1: ( ruleStep EOF )
            // InternalJPCoffe.g:280:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalJPCoffe.g:287:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:291:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalJPCoffe.g:292:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalJPCoffe.g:292:2: ( ( rule__Step__Group__0 ) )
            // InternalJPCoffe.g:293:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalJPCoffe.g:294:3: ( rule__Step__Group__0 )
            // InternalJPCoffe.g:294:4: rule__Step__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleNAME"
    // InternalJPCoffe.g:303:1: entryRuleNAME : ruleNAME EOF ;
    public final void entryRuleNAME() throws RecognitionException {
        try {
            // InternalJPCoffe.g:304:1: ( ruleNAME EOF )
            // InternalJPCoffe.g:305:1: ruleNAME EOF
            {
             before(grammarAccess.getNAMERule()); 
            pushFollow(FOLLOW_1);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getNAMERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNAME"


    // $ANTLR start "ruleNAME"
    // InternalJPCoffe.g:312:1: ruleNAME : ( ( rule__NAME__Group__0 ) ) ;
    public final void ruleNAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:316:2: ( ( ( rule__NAME__Group__0 ) ) )
            // InternalJPCoffe.g:317:2: ( ( rule__NAME__Group__0 ) )
            {
            // InternalJPCoffe.g:317:2: ( ( rule__NAME__Group__0 ) )
            // InternalJPCoffe.g:318:3: ( rule__NAME__Group__0 )
            {
             before(grammarAccess.getNAMEAccess().getGroup()); 
            // InternalJPCoffe.g:319:3: ( rule__NAME__Group__0 )
            // InternalJPCoffe.g:319:4: rule__NAME__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NAME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNAMEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNAME"


    // $ANTLR start "entryRuleTEXT"
    // InternalJPCoffe.g:328:1: entryRuleTEXT : ruleTEXT EOF ;
    public final void entryRuleTEXT() throws RecognitionException {
        try {
            // InternalJPCoffe.g:329:1: ( ruleTEXT EOF )
            // InternalJPCoffe.g:330:1: ruleTEXT EOF
            {
             before(grammarAccess.getTEXTRule()); 
            pushFollow(FOLLOW_1);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getTEXTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTEXT"


    // $ANTLR start "ruleTEXT"
    // InternalJPCoffe.g:337:1: ruleTEXT : ( ( ( rule__TEXT__Alternatives ) ) ( ( rule__TEXT__Alternatives )* ) ) ;
    public final void ruleTEXT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:341:2: ( ( ( ( rule__TEXT__Alternatives ) ) ( ( rule__TEXT__Alternatives )* ) ) )
            // InternalJPCoffe.g:342:2: ( ( ( rule__TEXT__Alternatives ) ) ( ( rule__TEXT__Alternatives )* ) )
            {
            // InternalJPCoffe.g:342:2: ( ( ( rule__TEXT__Alternatives ) ) ( ( rule__TEXT__Alternatives )* ) )
            // InternalJPCoffe.g:343:3: ( ( rule__TEXT__Alternatives ) ) ( ( rule__TEXT__Alternatives )* )
            {
            // InternalJPCoffe.g:343:3: ( ( rule__TEXT__Alternatives ) )
            // InternalJPCoffe.g:344:4: ( rule__TEXT__Alternatives )
            {
             before(grammarAccess.getTEXTAccess().getAlternatives()); 
            // InternalJPCoffe.g:345:4: ( rule__TEXT__Alternatives )
            // InternalJPCoffe.g:345:5: rule__TEXT__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__TEXT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTEXTAccess().getAlternatives()); 

            }

            // InternalJPCoffe.g:348:3: ( ( rule__TEXT__Alternatives )* )
            // InternalJPCoffe.g:349:4: ( rule__TEXT__Alternatives )*
            {
             before(grammarAccess.getTEXTAccess().getAlternatives()); 
            // InternalJPCoffe.g:350:4: ( rule__TEXT__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_MAJ_WORD && LA1_0<=RULE_WORD)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJPCoffe.g:350:5: rule__TEXT__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TEXT__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTEXTAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTEXT"


    // $ANTLR start "rule__TEXT__Alternatives"
    // InternalJPCoffe.g:359:1: rule__TEXT__Alternatives : ( ( RULE_MAJ_WORD ) | ( RULE_WORD ) );
    public final void rule__TEXT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:363:1: ( ( RULE_MAJ_WORD ) | ( RULE_WORD ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_MAJ_WORD) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_WORD) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJPCoffe.g:364:2: ( RULE_MAJ_WORD )
                    {
                    // InternalJPCoffe.g:364:2: ( RULE_MAJ_WORD )
                    // InternalJPCoffe.g:365:3: RULE_MAJ_WORD
                    {
                     before(grammarAccess.getTEXTAccess().getMAJ_WORDTerminalRuleCall_0()); 
                    match(input,RULE_MAJ_WORD,FOLLOW_2); 
                     after(grammarAccess.getTEXTAccess().getMAJ_WORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPCoffe.g:370:2: ( RULE_WORD )
                    {
                    // InternalJPCoffe.g:370:2: ( RULE_WORD )
                    // InternalJPCoffe.g:371:3: RULE_WORD
                    {
                     before(grammarAccess.getTEXTAccess().getWORDTerminalRuleCall_1()); 
                    match(input,RULE_WORD,FOLLOW_2); 
                     after(grammarAccess.getTEXTAccess().getWORDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEXT__Alternatives"


    // $ANTLR start "rule__Recipe__Group__0"
    // InternalJPCoffe.g:380:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:384:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // InternalJPCoffe.g:385:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Recipe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__0"


    // $ANTLR start "rule__Recipe__Group__0__Impl"
    // InternalJPCoffe.g:392:1: rule__Recipe__Group__0__Impl : ( 'Recipe' ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:396:1: ( ( 'Recipe' ) )
            // InternalJPCoffe.g:397:1: ( 'Recipe' )
            {
            // InternalJPCoffe.g:397:1: ( 'Recipe' )
            // InternalJPCoffe.g:398:2: 'Recipe'
            {
             before(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__0__Impl"


    // $ANTLR start "rule__Recipe__Group__1"
    // InternalJPCoffe.g:407:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:411:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // InternalJPCoffe.g:412:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Recipe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__1"


    // $ANTLR start "rule__Recipe__Group__1__Impl"
    // InternalJPCoffe.g:419:1: rule__Recipe__Group__1__Impl : ( ( rule__Recipe__NameAssignment_1 ) ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:423:1: ( ( ( rule__Recipe__NameAssignment_1 ) ) )
            // InternalJPCoffe.g:424:1: ( ( rule__Recipe__NameAssignment_1 ) )
            {
            // InternalJPCoffe.g:424:1: ( ( rule__Recipe__NameAssignment_1 ) )
            // InternalJPCoffe.g:425:2: ( rule__Recipe__NameAssignment_1 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_1()); 
            // InternalJPCoffe.g:426:2: ( rule__Recipe__NameAssignment_1 )
            // InternalJPCoffe.g:426:3: rule__Recipe__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__1__Impl"


    // $ANTLR start "rule__Recipe__Group__2"
    // InternalJPCoffe.g:434:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:438:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // InternalJPCoffe.g:439:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Recipe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__2"


    // $ANTLR start "rule__Recipe__Group__2__Impl"
    // InternalJPCoffe.g:446:1: rule__Recipe__Group__2__Impl : ( '{' ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:450:1: ( ( '{' ) )
            // InternalJPCoffe.g:451:1: ( '{' )
            {
            // InternalJPCoffe.g:451:1: ( '{' )
            // InternalJPCoffe.g:452:2: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__2__Impl"


    // $ANTLR start "rule__Recipe__Group__3"
    // InternalJPCoffe.g:461:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:465:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // InternalJPCoffe.g:466:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Recipe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__3"


    // $ANTLR start "rule__Recipe__Group__3__Impl"
    // InternalJPCoffe.g:473:1: rule__Recipe__Group__3__Impl : ( ( rule__Recipe__PortionAssignment_3 ) ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:477:1: ( ( ( rule__Recipe__PortionAssignment_3 ) ) )
            // InternalJPCoffe.g:478:1: ( ( rule__Recipe__PortionAssignment_3 ) )
            {
            // InternalJPCoffe.g:478:1: ( ( rule__Recipe__PortionAssignment_3 ) )
            // InternalJPCoffe.g:479:2: ( rule__Recipe__PortionAssignment_3 )
            {
             before(grammarAccess.getRecipeAccess().getPortionAssignment_3()); 
            // InternalJPCoffe.g:480:2: ( rule__Recipe__PortionAssignment_3 )
            // InternalJPCoffe.g:480:3: rule__Recipe__PortionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__PortionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getPortionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__3__Impl"


    // $ANTLR start "rule__Recipe__Group__4"
    // InternalJPCoffe.g:488:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:492:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // InternalJPCoffe.g:493:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Recipe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__4"


    // $ANTLR start "rule__Recipe__Group__4__Impl"
    // InternalJPCoffe.g:500:1: rule__Recipe__Group__4__Impl : ( ( rule__Recipe__IngredientsAssignment_4 ) ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:504:1: ( ( ( rule__Recipe__IngredientsAssignment_4 ) ) )
            // InternalJPCoffe.g:505:1: ( ( rule__Recipe__IngredientsAssignment_4 ) )
            {
            // InternalJPCoffe.g:505:1: ( ( rule__Recipe__IngredientsAssignment_4 ) )
            // InternalJPCoffe.g:506:2: ( rule__Recipe__IngredientsAssignment_4 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_4()); 
            // InternalJPCoffe.g:507:2: ( rule__Recipe__IngredientsAssignment_4 )
            // InternalJPCoffe.g:507:3: rule__Recipe__IngredientsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__IngredientsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__4__Impl"


    // $ANTLR start "rule__Recipe__Group__5"
    // InternalJPCoffe.g:515:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:519:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // InternalJPCoffe.g:520:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Recipe__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__5"


    // $ANTLR start "rule__Recipe__Group__5__Impl"
    // InternalJPCoffe.g:527:1: rule__Recipe__Group__5__Impl : ( ( rule__Recipe__ToolsAssignment_5 ) ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:531:1: ( ( ( rule__Recipe__ToolsAssignment_5 ) ) )
            // InternalJPCoffe.g:532:1: ( ( rule__Recipe__ToolsAssignment_5 ) )
            {
            // InternalJPCoffe.g:532:1: ( ( rule__Recipe__ToolsAssignment_5 ) )
            // InternalJPCoffe.g:533:2: ( rule__Recipe__ToolsAssignment_5 )
            {
             before(grammarAccess.getRecipeAccess().getToolsAssignment_5()); 
            // InternalJPCoffe.g:534:2: ( rule__Recipe__ToolsAssignment_5 )
            // InternalJPCoffe.g:534:3: rule__Recipe__ToolsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__ToolsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getToolsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__5__Impl"


    // $ANTLR start "rule__Recipe__Group__6"
    // InternalJPCoffe.g:542:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:546:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // InternalJPCoffe.g:547:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Recipe__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__6"


    // $ANTLR start "rule__Recipe__Group__6__Impl"
    // InternalJPCoffe.g:554:1: rule__Recipe__Group__6__Impl : ( ( rule__Recipe__StepsAssignment_6 ) ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:558:1: ( ( ( rule__Recipe__StepsAssignment_6 ) ) )
            // InternalJPCoffe.g:559:1: ( ( rule__Recipe__StepsAssignment_6 ) )
            {
            // InternalJPCoffe.g:559:1: ( ( rule__Recipe__StepsAssignment_6 ) )
            // InternalJPCoffe.g:560:2: ( rule__Recipe__StepsAssignment_6 )
            {
             before(grammarAccess.getRecipeAccess().getStepsAssignment_6()); 
            // InternalJPCoffe.g:561:2: ( rule__Recipe__StepsAssignment_6 )
            // InternalJPCoffe.g:561:3: rule__Recipe__StepsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__StepsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getStepsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__6__Impl"


    // $ANTLR start "rule__Recipe__Group__7"
    // InternalJPCoffe.g:569:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:573:1: ( rule__Recipe__Group__7__Impl )
            // InternalJPCoffe.g:574:2: rule__Recipe__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__7"


    // $ANTLR start "rule__Recipe__Group__7__Impl"
    // InternalJPCoffe.g:580:1: rule__Recipe__Group__7__Impl : ( '}' ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:584:1: ( ( '}' ) )
            // InternalJPCoffe.g:585:1: ( '}' )
            {
            // InternalJPCoffe.g:585:1: ( '}' )
            // InternalJPCoffe.g:586:2: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__7__Impl"


    // $ANTLR start "rule__PortionNB__Group__0"
    // InternalJPCoffe.g:596:1: rule__PortionNB__Group__0 : rule__PortionNB__Group__0__Impl rule__PortionNB__Group__1 ;
    public final void rule__PortionNB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:600:1: ( rule__PortionNB__Group__0__Impl rule__PortionNB__Group__1 )
            // InternalJPCoffe.g:601:2: rule__PortionNB__Group__0__Impl rule__PortionNB__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__PortionNB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PortionNB__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortionNB__Group__0"


    // $ANTLR start "rule__PortionNB__Group__0__Impl"
    // InternalJPCoffe.g:608:1: rule__PortionNB__Group__0__Impl : ( 'For' ) ;
    public final void rule__PortionNB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:612:1: ( ( 'For' ) )
            // InternalJPCoffe.g:613:1: ( 'For' )
            {
            // InternalJPCoffe.g:613:1: ( 'For' )
            // InternalJPCoffe.g:614:2: 'For'
            {
             before(grammarAccess.getPortionNBAccess().getForKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPortionNBAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortionNB__Group__0__Impl"


    // $ANTLR start "rule__PortionNB__Group__1"
    // InternalJPCoffe.g:623:1: rule__PortionNB__Group__1 : rule__PortionNB__Group__1__Impl rule__PortionNB__Group__2 ;
    public final void rule__PortionNB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:627:1: ( rule__PortionNB__Group__1__Impl rule__PortionNB__Group__2 )
            // InternalJPCoffe.g:628:2: rule__PortionNB__Group__1__Impl rule__PortionNB__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PortionNB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PortionNB__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortionNB__Group__1"


    // $ANTLR start "rule__PortionNB__Group__1__Impl"
    // InternalJPCoffe.g:635:1: rule__PortionNB__Group__1__Impl : ( ( rule__PortionNB__NbAssignment_1 ) ) ;
    public final void rule__PortionNB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:639:1: ( ( ( rule__PortionNB__NbAssignment_1 ) ) )
            // InternalJPCoffe.g:640:1: ( ( rule__PortionNB__NbAssignment_1 ) )
            {
            // InternalJPCoffe.g:640:1: ( ( rule__PortionNB__NbAssignment_1 ) )
            // InternalJPCoffe.g:641:2: ( rule__PortionNB__NbAssignment_1 )
            {
             before(grammarAccess.getPortionNBAccess().getNbAssignment_1()); 
            // InternalJPCoffe.g:642:2: ( rule__PortionNB__NbAssignment_1 )
            // InternalJPCoffe.g:642:3: rule__PortionNB__NbAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PortionNB__NbAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortionNBAccess().getNbAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortionNB__Group__1__Impl"


    // $ANTLR start "rule__PortionNB__Group__2"
    // InternalJPCoffe.g:650:1: rule__PortionNB__Group__2 : rule__PortionNB__Group__2__Impl ;
    public final void rule__PortionNB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:654:1: ( rule__PortionNB__Group__2__Impl )
            // InternalJPCoffe.g:655:2: rule__PortionNB__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PortionNB__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortionNB__Group__2"


    // $ANTLR start "rule__PortionNB__Group__2__Impl"
    // InternalJPCoffe.g:661:1: rule__PortionNB__Group__2__Impl : ( ( 'people' )? ) ;
    public final void rule__PortionNB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:665:1: ( ( ( 'people' )? ) )
            // InternalJPCoffe.g:666:1: ( ( 'people' )? )
            {
            // InternalJPCoffe.g:666:1: ( ( 'people' )? )
            // InternalJPCoffe.g:667:2: ( 'people' )?
            {
             before(grammarAccess.getPortionNBAccess().getPeopleKeyword_2()); 
            // InternalJPCoffe.g:668:2: ( 'people' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJPCoffe.g:668:3: 'people'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPortionNBAccess().getPeopleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortionNB__Group__2__Impl"


    // $ANTLR start "rule__IngredientsBlock__Group__0"
    // InternalJPCoffe.g:677:1: rule__IngredientsBlock__Group__0 : rule__IngredientsBlock__Group__0__Impl rule__IngredientsBlock__Group__1 ;
    public final void rule__IngredientsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:681:1: ( rule__IngredientsBlock__Group__0__Impl rule__IngredientsBlock__Group__1 )
            // InternalJPCoffe.g:682:2: rule__IngredientsBlock__Group__0__Impl rule__IngredientsBlock__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__IngredientsBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngredientsBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientsBlock__Group__0"


    // $ANTLR start "rule__IngredientsBlock__Group__0__Impl"
    // InternalJPCoffe.g:689:1: rule__IngredientsBlock__Group__0__Impl : ( () ) ;
    public final void rule__IngredientsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:693:1: ( ( () ) )
            // InternalJPCoffe.g:694:1: ( () )
            {
            // InternalJPCoffe.g:694:1: ( () )
            // InternalJPCoffe.g:695:2: ()
            {
             before(grammarAccess.getIngredientsBlockAccess().getIngredientsBlockAction_0()); 
            // InternalJPCoffe.g:696:2: ()
            // InternalJPCoffe.g:696:3: 
            {
            }

             after(grammarAccess.getIngredientsBlockAccess().getIngredientsBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientsBlock__Group__0__Impl"


    // $ANTLR start "rule__IngredientsBlock__Group__1"
    // InternalJPCoffe.g:704:1: rule__IngredientsBlock__Group__1 : rule__IngredientsBlock__Group__1__Impl rule__IngredientsBlock__Group__2 ;
    public final void rule__IngredientsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:708:1: ( rule__IngredientsBlock__Group__1__Impl rule__IngredientsBlock__Group__2 )
            // InternalJPCoffe.g:709:2: rule__IngredientsBlock__Group__1__Impl rule__IngredientsBlock__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__IngredientsBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngredientsBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientsBlock__Group__1"


    // $ANTLR start "rule__IngredientsBlock__Group__1__Impl"
    // InternalJPCoffe.g:716:1: rule__IngredientsBlock__Group__1__Impl : ( 'Ingredients' ) ;
    public final void rule__IngredientsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:720:1: ( ( 'Ingredients' ) )
            // InternalJPCoffe.g:721:1: ( 'Ingredients' )
            {
            // InternalJPCoffe.g:721:1: ( 'Ingredients' )
            // InternalJPCoffe.g:722:2: 'Ingredients'
            {
             before(grammarAccess.getIngredientsBlockAccess().getIngredientsKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIngredientsBlockAccess().getIngredientsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientsBlock__Group__1__Impl"


    // $ANTLR start "rule__IngredientsBlock__Group__2"
    // InternalJPCoffe.g:731:1: rule__IngredientsBlock__Group__2 : rule__IngredientsBlock__Group__2__Impl rule__IngredientsBlock__Group__3 ;
    public final void rule__IngredientsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:735:1: ( rule__IngredientsBlock__Group__2__Impl rule__IngredientsBlock__Group__3 )
            // InternalJPCoffe.g:736:2: rule__IngredientsBlock__Group__2__Impl rule__IngredientsBlock__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__IngredientsBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngredientsBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientsBlock__Group__2"


    // $ANTLR start "rule__IngredientsBlock__Group__2__Impl"
    // InternalJPCoffe.g:743:1: rule__IngredientsBlock__Group__2__Impl : ( RULE_TITLE_LINE ) ;
    public final void rule__IngredientsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:747:1: ( ( RULE_TITLE_LINE ) )
            // InternalJPCoffe.g:748:1: ( RULE_TITLE_LINE )
            {
            // InternalJPCoffe.g:748:1: ( RULE_TITLE_LINE )
            // InternalJPCoffe.g:749:2: RULE_TITLE_LINE
            {
             before(grammarAccess.getIngredientsBlockAccess().getTITLE_LINETerminalRuleCall_2()); 
            match(input,RULE_TITLE_LINE,FOLLOW_2); 
             after(grammarAccess.getIngredientsBlockAccess().getTITLE_LINETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientsBlock__Group__2__Impl"


    // $ANTLR start "rule__IngredientsBlock__Group__3"
    // InternalJPCoffe.g:758:1: rule__IngredientsBlock__Group__3 : rule__IngredientsBlock__Group__3__Impl ;
    public final void rule__IngredientsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:762:1: ( rule__IngredientsBlock__Group__3__Impl )
            // InternalJPCoffe.g:763:2: rule__IngredientsBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IngredientsBlock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientsBlock__Group__3"


    // $ANTLR start "rule__IngredientsBlock__Group__3__Impl"
    // InternalJPCoffe.g:769:1: rule__IngredientsBlock__Group__3__Impl : ( ( rule__IngredientsBlock__IngredientsListAssignment_3 )* ) ;
    public final void rule__IngredientsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:773:1: ( ( ( rule__IngredientsBlock__IngredientsListAssignment_3 )* ) )
            // InternalJPCoffe.g:774:1: ( ( rule__IngredientsBlock__IngredientsListAssignment_3 )* )
            {
            // InternalJPCoffe.g:774:1: ( ( rule__IngredientsBlock__IngredientsListAssignment_3 )* )
            // InternalJPCoffe.g:775:2: ( rule__IngredientsBlock__IngredientsListAssignment_3 )*
            {
             before(grammarAccess.getIngredientsBlockAccess().getIngredientsListAssignment_3()); 
            // InternalJPCoffe.g:776:2: ( rule__IngredientsBlock__IngredientsListAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJPCoffe.g:776:3: rule__IngredientsBlock__IngredientsListAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__IngredientsBlock__IngredientsListAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getIngredientsBlockAccess().getIngredientsListAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientsBlock__Group__3__Impl"


    // $ANTLR start "rule__Ingredient__Group__0"
    // InternalJPCoffe.g:785:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:789:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // InternalJPCoffe.g:790:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Ingredient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__0"


    // $ANTLR start "rule__Ingredient__Group__0__Impl"
    // InternalJPCoffe.g:797:1: rule__Ingredient__Group__0__Impl : ( '*' ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:801:1: ( ( '*' ) )
            // InternalJPCoffe.g:802:1: ( '*' )
            {
            // InternalJPCoffe.g:802:1: ( '*' )
            // InternalJPCoffe.g:803:2: '*'
            {
             before(grammarAccess.getIngredientAccess().getAsteriskKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__0__Impl"


    // $ANTLR start "rule__Ingredient__Group__1"
    // InternalJPCoffe.g:812:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:816:1: ( rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 )
            // InternalJPCoffe.g:817:2: rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Ingredient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__1"


    // $ANTLR start "rule__Ingredient__Group__1__Impl"
    // InternalJPCoffe.g:824:1: rule__Ingredient__Group__1__Impl : ( ( rule__Ingredient__NameAssignment_1 ) ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:828:1: ( ( ( rule__Ingredient__NameAssignment_1 ) ) )
            // InternalJPCoffe.g:829:1: ( ( rule__Ingredient__NameAssignment_1 ) )
            {
            // InternalJPCoffe.g:829:1: ( ( rule__Ingredient__NameAssignment_1 ) )
            // InternalJPCoffe.g:830:2: ( rule__Ingredient__NameAssignment_1 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_1()); 
            // InternalJPCoffe.g:831:2: ( rule__Ingredient__NameAssignment_1 )
            // InternalJPCoffe.g:831:3: rule__Ingredient__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__1__Impl"


    // $ANTLR start "rule__Ingredient__Group__2"
    // InternalJPCoffe.g:839:1: rule__Ingredient__Group__2 : rule__Ingredient__Group__2__Impl ;
    public final void rule__Ingredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:843:1: ( rule__Ingredient__Group__2__Impl )
            // InternalJPCoffe.g:844:2: rule__Ingredient__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__2"


    // $ANTLR start "rule__Ingredient__Group__2__Impl"
    // InternalJPCoffe.g:850:1: rule__Ingredient__Group__2__Impl : ( ( rule__Ingredient__QuantityAssignment_2 )? ) ;
    public final void rule__Ingredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:854:1: ( ( ( rule__Ingredient__QuantityAssignment_2 )? ) )
            // InternalJPCoffe.g:855:1: ( ( rule__Ingredient__QuantityAssignment_2 )? )
            {
            // InternalJPCoffe.g:855:1: ( ( rule__Ingredient__QuantityAssignment_2 )? )
            // InternalJPCoffe.g:856:2: ( rule__Ingredient__QuantityAssignment_2 )?
            {
             before(grammarAccess.getIngredientAccess().getQuantityAssignment_2()); 
            // InternalJPCoffe.g:857:2: ( rule__Ingredient__QuantityAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJPCoffe.g:857:3: rule__Ingredient__QuantityAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredient__QuantityAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredientAccess().getQuantityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__2__Impl"


    // $ANTLR start "rule__Quantity__Group__0"
    // InternalJPCoffe.g:866:1: rule__Quantity__Group__0 : rule__Quantity__Group__0__Impl rule__Quantity__Group__1 ;
    public final void rule__Quantity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:870:1: ( rule__Quantity__Group__0__Impl rule__Quantity__Group__1 )
            // InternalJPCoffe.g:871:2: rule__Quantity__Group__0__Impl rule__Quantity__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Quantity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantity__Group__0"


    // $ANTLR start "rule__Quantity__Group__0__Impl"
    // InternalJPCoffe.g:878:1: rule__Quantity__Group__0__Impl : ( ( rule__Quantity__AmountAssignment_0 ) ) ;
    public final void rule__Quantity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:882:1: ( ( ( rule__Quantity__AmountAssignment_0 ) ) )
            // InternalJPCoffe.g:883:1: ( ( rule__Quantity__AmountAssignment_0 ) )
            {
            // InternalJPCoffe.g:883:1: ( ( rule__Quantity__AmountAssignment_0 ) )
            // InternalJPCoffe.g:884:2: ( rule__Quantity__AmountAssignment_0 )
            {
             before(grammarAccess.getQuantityAccess().getAmountAssignment_0()); 
            // InternalJPCoffe.g:885:2: ( rule__Quantity__AmountAssignment_0 )
            // InternalJPCoffe.g:885:3: rule__Quantity__AmountAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__AmountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuantityAccess().getAmountAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantity__Group__0__Impl"


    // $ANTLR start "rule__Quantity__Group__1"
    // InternalJPCoffe.g:893:1: rule__Quantity__Group__1 : rule__Quantity__Group__1__Impl ;
    public final void rule__Quantity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:897:1: ( rule__Quantity__Group__1__Impl )
            // InternalJPCoffe.g:898:2: rule__Quantity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantity__Group__1"


    // $ANTLR start "rule__Quantity__Group__1__Impl"
    // InternalJPCoffe.g:904:1: rule__Quantity__Group__1__Impl : ( ( rule__Quantity__UnitAssignment_1 )? ) ;
    public final void rule__Quantity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:908:1: ( ( ( rule__Quantity__UnitAssignment_1 )? ) )
            // InternalJPCoffe.g:909:1: ( ( rule__Quantity__UnitAssignment_1 )? )
            {
            // InternalJPCoffe.g:909:1: ( ( rule__Quantity__UnitAssignment_1 )? )
            // InternalJPCoffe.g:910:2: ( rule__Quantity__UnitAssignment_1 )?
            {
             before(grammarAccess.getQuantityAccess().getUnitAssignment_1()); 
            // InternalJPCoffe.g:911:2: ( rule__Quantity__UnitAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_METRIC_UNIT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJPCoffe.g:911:3: rule__Quantity__UnitAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Quantity__UnitAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuantityAccess().getUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantity__Group__1__Impl"


    // $ANTLR start "rule__ToolsBlock__Group__0"
    // InternalJPCoffe.g:920:1: rule__ToolsBlock__Group__0 : rule__ToolsBlock__Group__0__Impl rule__ToolsBlock__Group__1 ;
    public final void rule__ToolsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:924:1: ( rule__ToolsBlock__Group__0__Impl rule__ToolsBlock__Group__1 )
            // InternalJPCoffe.g:925:2: rule__ToolsBlock__Group__0__Impl rule__ToolsBlock__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ToolsBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToolsBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolsBlock__Group__0"


    // $ANTLR start "rule__ToolsBlock__Group__0__Impl"
    // InternalJPCoffe.g:932:1: rule__ToolsBlock__Group__0__Impl : ( () ) ;
    public final void rule__ToolsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:936:1: ( ( () ) )
            // InternalJPCoffe.g:937:1: ( () )
            {
            // InternalJPCoffe.g:937:1: ( () )
            // InternalJPCoffe.g:938:2: ()
            {
             before(grammarAccess.getToolsBlockAccess().getToolsBlockAction_0()); 
            // InternalJPCoffe.g:939:2: ()
            // InternalJPCoffe.g:939:3: 
            {
            }

             after(grammarAccess.getToolsBlockAccess().getToolsBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolsBlock__Group__0__Impl"


    // $ANTLR start "rule__ToolsBlock__Group__1"
    // InternalJPCoffe.g:947:1: rule__ToolsBlock__Group__1 : rule__ToolsBlock__Group__1__Impl rule__ToolsBlock__Group__2 ;
    public final void rule__ToolsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:951:1: ( rule__ToolsBlock__Group__1__Impl rule__ToolsBlock__Group__2 )
            // InternalJPCoffe.g:952:2: rule__ToolsBlock__Group__1__Impl rule__ToolsBlock__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ToolsBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToolsBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolsBlock__Group__1"


    // $ANTLR start "rule__ToolsBlock__Group__1__Impl"
    // InternalJPCoffe.g:959:1: rule__ToolsBlock__Group__1__Impl : ( 'Tools' ) ;
    public final void rule__ToolsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:963:1: ( ( 'Tools' ) )
            // InternalJPCoffe.g:964:1: ( 'Tools' )
            {
            // InternalJPCoffe.g:964:1: ( 'Tools' )
            // InternalJPCoffe.g:965:2: 'Tools'
            {
             before(grammarAccess.getToolsBlockAccess().getToolsKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getToolsBlockAccess().getToolsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolsBlock__Group__1__Impl"


    // $ANTLR start "rule__ToolsBlock__Group__2"
    // InternalJPCoffe.g:974:1: rule__ToolsBlock__Group__2 : rule__ToolsBlock__Group__2__Impl rule__ToolsBlock__Group__3 ;
    public final void rule__ToolsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:978:1: ( rule__ToolsBlock__Group__2__Impl rule__ToolsBlock__Group__3 )
            // InternalJPCoffe.g:979:2: rule__ToolsBlock__Group__2__Impl rule__ToolsBlock__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ToolsBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToolsBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolsBlock__Group__2"


    // $ANTLR start "rule__ToolsBlock__Group__2__Impl"
    // InternalJPCoffe.g:986:1: rule__ToolsBlock__Group__2__Impl : ( RULE_TITLE_LINE ) ;
    public final void rule__ToolsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:990:1: ( ( RULE_TITLE_LINE ) )
            // InternalJPCoffe.g:991:1: ( RULE_TITLE_LINE )
            {
            // InternalJPCoffe.g:991:1: ( RULE_TITLE_LINE )
            // InternalJPCoffe.g:992:2: RULE_TITLE_LINE
            {
             before(grammarAccess.getToolsBlockAccess().getTITLE_LINETerminalRuleCall_2()); 
            match(input,RULE_TITLE_LINE,FOLLOW_2); 
             after(grammarAccess.getToolsBlockAccess().getTITLE_LINETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolsBlock__Group__2__Impl"


    // $ANTLR start "rule__ToolsBlock__Group__3"
    // InternalJPCoffe.g:1001:1: rule__ToolsBlock__Group__3 : rule__ToolsBlock__Group__3__Impl ;
    public final void rule__ToolsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1005:1: ( rule__ToolsBlock__Group__3__Impl )
            // InternalJPCoffe.g:1006:2: rule__ToolsBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToolsBlock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolsBlock__Group__3"


    // $ANTLR start "rule__ToolsBlock__Group__3__Impl"
    // InternalJPCoffe.g:1012:1: rule__ToolsBlock__Group__3__Impl : ( ( rule__ToolsBlock__ToolsListAssignment_3 )* ) ;
    public final void rule__ToolsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1016:1: ( ( ( rule__ToolsBlock__ToolsListAssignment_3 )* ) )
            // InternalJPCoffe.g:1017:1: ( ( rule__ToolsBlock__ToolsListAssignment_3 )* )
            {
            // InternalJPCoffe.g:1017:1: ( ( rule__ToolsBlock__ToolsListAssignment_3 )* )
            // InternalJPCoffe.g:1018:2: ( rule__ToolsBlock__ToolsListAssignment_3 )*
            {
             before(grammarAccess.getToolsBlockAccess().getToolsListAssignment_3()); 
            // InternalJPCoffe.g:1019:2: ( rule__ToolsBlock__ToolsListAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJPCoffe.g:1019:3: rule__ToolsBlock__ToolsListAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ToolsBlock__ToolsListAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getToolsBlockAccess().getToolsListAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolsBlock__Group__3__Impl"


    // $ANTLR start "rule__Tool__Group__0"
    // InternalJPCoffe.g:1028:1: rule__Tool__Group__0 : rule__Tool__Group__0__Impl rule__Tool__Group__1 ;
    public final void rule__Tool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1032:1: ( rule__Tool__Group__0__Impl rule__Tool__Group__1 )
            // InternalJPCoffe.g:1033:2: rule__Tool__Group__0__Impl rule__Tool__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Tool__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tool__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tool__Group__0"


    // $ANTLR start "rule__Tool__Group__0__Impl"
    // InternalJPCoffe.g:1040:1: rule__Tool__Group__0__Impl : ( '*' ) ;
    public final void rule__Tool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1044:1: ( ( '*' ) )
            // InternalJPCoffe.g:1045:1: ( '*' )
            {
            // InternalJPCoffe.g:1045:1: ( '*' )
            // InternalJPCoffe.g:1046:2: '*'
            {
             before(grammarAccess.getToolAccess().getAsteriskKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getToolAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tool__Group__0__Impl"


    // $ANTLR start "rule__Tool__Group__1"
    // InternalJPCoffe.g:1055:1: rule__Tool__Group__1 : rule__Tool__Group__1__Impl ;
    public final void rule__Tool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1059:1: ( rule__Tool__Group__1__Impl )
            // InternalJPCoffe.g:1060:2: rule__Tool__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tool__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tool__Group__1"


    // $ANTLR start "rule__Tool__Group__1__Impl"
    // InternalJPCoffe.g:1066:1: rule__Tool__Group__1__Impl : ( ( rule__Tool__NameAssignment_1 ) ) ;
    public final void rule__Tool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1070:1: ( ( ( rule__Tool__NameAssignment_1 ) ) )
            // InternalJPCoffe.g:1071:1: ( ( rule__Tool__NameAssignment_1 ) )
            {
            // InternalJPCoffe.g:1071:1: ( ( rule__Tool__NameAssignment_1 ) )
            // InternalJPCoffe.g:1072:2: ( rule__Tool__NameAssignment_1 )
            {
             before(grammarAccess.getToolAccess().getNameAssignment_1()); 
            // InternalJPCoffe.g:1073:2: ( rule__Tool__NameAssignment_1 )
            // InternalJPCoffe.g:1073:3: rule__Tool__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tool__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getToolAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tool__Group__1__Impl"


    // $ANTLR start "rule__StepsBlock__Group__0"
    // InternalJPCoffe.g:1082:1: rule__StepsBlock__Group__0 : rule__StepsBlock__Group__0__Impl rule__StepsBlock__Group__1 ;
    public final void rule__StepsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1086:1: ( rule__StepsBlock__Group__0__Impl rule__StepsBlock__Group__1 )
            // InternalJPCoffe.g:1087:2: rule__StepsBlock__Group__0__Impl rule__StepsBlock__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__StepsBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepsBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepsBlock__Group__0"


    // $ANTLR start "rule__StepsBlock__Group__0__Impl"
    // InternalJPCoffe.g:1094:1: rule__StepsBlock__Group__0__Impl : ( () ) ;
    public final void rule__StepsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1098:1: ( ( () ) )
            // InternalJPCoffe.g:1099:1: ( () )
            {
            // InternalJPCoffe.g:1099:1: ( () )
            // InternalJPCoffe.g:1100:2: ()
            {
             before(grammarAccess.getStepsBlockAccess().getStepsBlockAction_0()); 
            // InternalJPCoffe.g:1101:2: ()
            // InternalJPCoffe.g:1101:3: 
            {
            }

             after(grammarAccess.getStepsBlockAccess().getStepsBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepsBlock__Group__0__Impl"


    // $ANTLR start "rule__StepsBlock__Group__1"
    // InternalJPCoffe.g:1109:1: rule__StepsBlock__Group__1 : rule__StepsBlock__Group__1__Impl rule__StepsBlock__Group__2 ;
    public final void rule__StepsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1113:1: ( rule__StepsBlock__Group__1__Impl rule__StepsBlock__Group__2 )
            // InternalJPCoffe.g:1114:2: rule__StepsBlock__Group__1__Impl rule__StepsBlock__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__StepsBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepsBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepsBlock__Group__1"


    // $ANTLR start "rule__StepsBlock__Group__1__Impl"
    // InternalJPCoffe.g:1121:1: rule__StepsBlock__Group__1__Impl : ( 'Steps' ) ;
    public final void rule__StepsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1125:1: ( ( 'Steps' ) )
            // InternalJPCoffe.g:1126:1: ( 'Steps' )
            {
            // InternalJPCoffe.g:1126:1: ( 'Steps' )
            // InternalJPCoffe.g:1127:2: 'Steps'
            {
             before(grammarAccess.getStepsBlockAccess().getStepsKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStepsBlockAccess().getStepsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepsBlock__Group__1__Impl"


    // $ANTLR start "rule__StepsBlock__Group__2"
    // InternalJPCoffe.g:1136:1: rule__StepsBlock__Group__2 : rule__StepsBlock__Group__2__Impl rule__StepsBlock__Group__3 ;
    public final void rule__StepsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1140:1: ( rule__StepsBlock__Group__2__Impl rule__StepsBlock__Group__3 )
            // InternalJPCoffe.g:1141:2: rule__StepsBlock__Group__2__Impl rule__StepsBlock__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__StepsBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepsBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepsBlock__Group__2"


    // $ANTLR start "rule__StepsBlock__Group__2__Impl"
    // InternalJPCoffe.g:1148:1: rule__StepsBlock__Group__2__Impl : ( RULE_TITLE_LINE ) ;
    public final void rule__StepsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1152:1: ( ( RULE_TITLE_LINE ) )
            // InternalJPCoffe.g:1153:1: ( RULE_TITLE_LINE )
            {
            // InternalJPCoffe.g:1153:1: ( RULE_TITLE_LINE )
            // InternalJPCoffe.g:1154:2: RULE_TITLE_LINE
            {
             before(grammarAccess.getStepsBlockAccess().getTITLE_LINETerminalRuleCall_2()); 
            match(input,RULE_TITLE_LINE,FOLLOW_2); 
             after(grammarAccess.getStepsBlockAccess().getTITLE_LINETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepsBlock__Group__2__Impl"


    // $ANTLR start "rule__StepsBlock__Group__3"
    // InternalJPCoffe.g:1163:1: rule__StepsBlock__Group__3 : rule__StepsBlock__Group__3__Impl ;
    public final void rule__StepsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1167:1: ( rule__StepsBlock__Group__3__Impl )
            // InternalJPCoffe.g:1168:2: rule__StepsBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepsBlock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepsBlock__Group__3"


    // $ANTLR start "rule__StepsBlock__Group__3__Impl"
    // InternalJPCoffe.g:1174:1: rule__StepsBlock__Group__3__Impl : ( ( rule__StepsBlock__StepsListAssignment_3 )* ) ;
    public final void rule__StepsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1178:1: ( ( ( rule__StepsBlock__StepsListAssignment_3 )* ) )
            // InternalJPCoffe.g:1179:1: ( ( rule__StepsBlock__StepsListAssignment_3 )* )
            {
            // InternalJPCoffe.g:1179:1: ( ( rule__StepsBlock__StepsListAssignment_3 )* )
            // InternalJPCoffe.g:1180:2: ( rule__StepsBlock__StepsListAssignment_3 )*
            {
             before(grammarAccess.getStepsBlockAccess().getStepsListAssignment_3()); 
            // InternalJPCoffe.g:1181:2: ( rule__StepsBlock__StepsListAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJPCoffe.g:1181:3: rule__StepsBlock__StepsListAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__StepsBlock__StepsListAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStepsBlockAccess().getStepsListAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepsBlock__Group__3__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // InternalJPCoffe.g:1190:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1194:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalJPCoffe.g:1195:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0"


    // $ANTLR start "rule__Step__Group__0__Impl"
    // InternalJPCoffe.g:1202:1: rule__Step__Group__0__Impl : ( '{' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1206:1: ( ( '{' ) )
            // InternalJPCoffe.g:1207:1: ( '{' )
            {
            // InternalJPCoffe.g:1207:1: ( '{' )
            // InternalJPCoffe.g:1208:2: '{'
            {
             before(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0__Impl"


    // $ANTLR start "rule__Step__Group__1"
    // InternalJPCoffe.g:1217:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1221:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalJPCoffe.g:1222:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1"


    // $ANTLR start "rule__Step__Group__1__Impl"
    // InternalJPCoffe.g:1229:1: rule__Step__Group__1__Impl : ( ( rule__Step__PredAssignment_1 )? ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1233:1: ( ( ( rule__Step__PredAssignment_1 )? ) )
            // InternalJPCoffe.g:1234:1: ( ( rule__Step__PredAssignment_1 )? )
            {
            // InternalJPCoffe.g:1234:1: ( ( rule__Step__PredAssignment_1 )? )
            // InternalJPCoffe.g:1235:2: ( rule__Step__PredAssignment_1 )?
            {
             before(grammarAccess.getStepAccess().getPredAssignment_1()); 
            // InternalJPCoffe.g:1236:2: ( rule__Step__PredAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJPCoffe.g:1236:3: rule__Step__PredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__PredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStepAccess().getPredAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1__Impl"


    // $ANTLR start "rule__Step__Group__2"
    // InternalJPCoffe.g:1244:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1248:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalJPCoffe.g:1249:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Step__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2"


    // $ANTLR start "rule__Step__Group__2__Impl"
    // InternalJPCoffe.g:1256:1: rule__Step__Group__2__Impl : ( ( rule__Step__Group_2__0 )* ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1260:1: ( ( ( rule__Step__Group_2__0 )* ) )
            // InternalJPCoffe.g:1261:1: ( ( rule__Step__Group_2__0 )* )
            {
            // InternalJPCoffe.g:1261:1: ( ( rule__Step__Group_2__0 )* )
            // InternalJPCoffe.g:1262:2: ( rule__Step__Group_2__0 )*
            {
             before(grammarAccess.getStepAccess().getGroup_2()); 
            // InternalJPCoffe.g:1263:2: ( rule__Step__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJPCoffe.g:1263:3: rule__Step__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Step__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStepAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__3"
    // InternalJPCoffe.g:1271:1: rule__Step__Group__3 : rule__Step__Group__3__Impl rule__Step__Group__4 ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1275:1: ( rule__Step__Group__3__Impl rule__Step__Group__4 )
            // InternalJPCoffe.g:1276:2: rule__Step__Group__3__Impl rule__Step__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Step__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3"


    // $ANTLR start "rule__Step__Group__3__Impl"
    // InternalJPCoffe.g:1283:1: rule__Step__Group__3__Impl : ( '}' ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1287:1: ( ( '}' ) )
            // InternalJPCoffe.g:1288:1: ( '}' )
            {
            // InternalJPCoffe.g:1288:1: ( '}' )
            // InternalJPCoffe.g:1289:2: '}'
            {
             before(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3__Impl"


    // $ANTLR start "rule__Step__Group__4"
    // InternalJPCoffe.g:1298:1: rule__Step__Group__4 : rule__Step__Group__4__Impl rule__Step__Group__5 ;
    public final void rule__Step__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1302:1: ( rule__Step__Group__4__Impl rule__Step__Group__5 )
            // InternalJPCoffe.g:1303:2: rule__Step__Group__4__Impl rule__Step__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Step__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__4"


    // $ANTLR start "rule__Step__Group__4__Impl"
    // InternalJPCoffe.g:1310:1: rule__Step__Group__4__Impl : ( '->' ) ;
    public final void rule__Step__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1314:1: ( ( '->' ) )
            // InternalJPCoffe.g:1315:1: ( '->' )
            {
            // InternalJPCoffe.g:1315:1: ( '->' )
            // InternalJPCoffe.g:1316:2: '->'
            {
             before(grammarAccess.getStepAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__4__Impl"


    // $ANTLR start "rule__Step__Group__5"
    // InternalJPCoffe.g:1325:1: rule__Step__Group__5 : rule__Step__Group__5__Impl rule__Step__Group__6 ;
    public final void rule__Step__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1329:1: ( rule__Step__Group__5__Impl rule__Step__Group__6 )
            // InternalJPCoffe.g:1330:2: rule__Step__Group__5__Impl rule__Step__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Step__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__5"


    // $ANTLR start "rule__Step__Group__5__Impl"
    // InternalJPCoffe.g:1337:1: rule__Step__Group__5__Impl : ( ( rule__Step__NumAssignment_5 ) ) ;
    public final void rule__Step__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1341:1: ( ( ( rule__Step__NumAssignment_5 ) ) )
            // InternalJPCoffe.g:1342:1: ( ( rule__Step__NumAssignment_5 ) )
            {
            // InternalJPCoffe.g:1342:1: ( ( rule__Step__NumAssignment_5 ) )
            // InternalJPCoffe.g:1343:2: ( rule__Step__NumAssignment_5 )
            {
             before(grammarAccess.getStepAccess().getNumAssignment_5()); 
            // InternalJPCoffe.g:1344:2: ( rule__Step__NumAssignment_5 )
            // InternalJPCoffe.g:1344:3: rule__Step__NumAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Step__NumAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getNumAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__5__Impl"


    // $ANTLR start "rule__Step__Group__6"
    // InternalJPCoffe.g:1352:1: rule__Step__Group__6 : rule__Step__Group__6__Impl rule__Step__Group__7 ;
    public final void rule__Step__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1356:1: ( rule__Step__Group__6__Impl rule__Step__Group__7 )
            // InternalJPCoffe.g:1357:2: rule__Step__Group__6__Impl rule__Step__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Step__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__6"


    // $ANTLR start "rule__Step__Group__6__Impl"
    // InternalJPCoffe.g:1364:1: rule__Step__Group__6__Impl : ( '.' ) ;
    public final void rule__Step__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1368:1: ( ( '.' ) )
            // InternalJPCoffe.g:1369:1: ( '.' )
            {
            // InternalJPCoffe.g:1369:1: ( '.' )
            // InternalJPCoffe.g:1370:2: '.'
            {
             before(grammarAccess.getStepAccess().getFullStopKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getFullStopKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__6__Impl"


    // $ANTLR start "rule__Step__Group__7"
    // InternalJPCoffe.g:1379:1: rule__Step__Group__7 : rule__Step__Group__7__Impl ;
    public final void rule__Step__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1383:1: ( rule__Step__Group__7__Impl )
            // InternalJPCoffe.g:1384:2: rule__Step__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__7"


    // $ANTLR start "rule__Step__Group__7__Impl"
    // InternalJPCoffe.g:1390:1: rule__Step__Group__7__Impl : ( ( rule__Step__TextAssignment_7 ) ) ;
    public final void rule__Step__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1394:1: ( ( ( rule__Step__TextAssignment_7 ) ) )
            // InternalJPCoffe.g:1395:1: ( ( rule__Step__TextAssignment_7 ) )
            {
            // InternalJPCoffe.g:1395:1: ( ( rule__Step__TextAssignment_7 ) )
            // InternalJPCoffe.g:1396:2: ( rule__Step__TextAssignment_7 )
            {
             before(grammarAccess.getStepAccess().getTextAssignment_7()); 
            // InternalJPCoffe.g:1397:2: ( rule__Step__TextAssignment_7 )
            // InternalJPCoffe.g:1397:3: rule__Step__TextAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Step__TextAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getTextAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__7__Impl"


    // $ANTLR start "rule__Step__Group_2__0"
    // InternalJPCoffe.g:1406:1: rule__Step__Group_2__0 : rule__Step__Group_2__0__Impl rule__Step__Group_2__1 ;
    public final void rule__Step__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1410:1: ( rule__Step__Group_2__0__Impl rule__Step__Group_2__1 )
            // InternalJPCoffe.g:1411:2: rule__Step__Group_2__0__Impl rule__Step__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Step__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_2__0"


    // $ANTLR start "rule__Step__Group_2__0__Impl"
    // InternalJPCoffe.g:1418:1: rule__Step__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Step__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1422:1: ( ( ',' ) )
            // InternalJPCoffe.g:1423:1: ( ',' )
            {
            // InternalJPCoffe.g:1423:1: ( ',' )
            // InternalJPCoffe.g:1424:2: ','
            {
             before(grammarAccess.getStepAccess().getCommaKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_2__0__Impl"


    // $ANTLR start "rule__Step__Group_2__1"
    // InternalJPCoffe.g:1433:1: rule__Step__Group_2__1 : rule__Step__Group_2__1__Impl ;
    public final void rule__Step__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1437:1: ( rule__Step__Group_2__1__Impl )
            // InternalJPCoffe.g:1438:2: rule__Step__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_2__1"


    // $ANTLR start "rule__Step__Group_2__1__Impl"
    // InternalJPCoffe.g:1444:1: rule__Step__Group_2__1__Impl : ( ( rule__Step__PredAssignment_2_1 ) ) ;
    public final void rule__Step__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1448:1: ( ( ( rule__Step__PredAssignment_2_1 ) ) )
            // InternalJPCoffe.g:1449:1: ( ( rule__Step__PredAssignment_2_1 ) )
            {
            // InternalJPCoffe.g:1449:1: ( ( rule__Step__PredAssignment_2_1 ) )
            // InternalJPCoffe.g:1450:2: ( rule__Step__PredAssignment_2_1 )
            {
             before(grammarAccess.getStepAccess().getPredAssignment_2_1()); 
            // InternalJPCoffe.g:1451:2: ( rule__Step__PredAssignment_2_1 )
            // InternalJPCoffe.g:1451:3: rule__Step__PredAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__PredAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getPredAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_2__1__Impl"


    // $ANTLR start "rule__NAME__Group__0"
    // InternalJPCoffe.g:1460:1: rule__NAME__Group__0 : rule__NAME__Group__0__Impl rule__NAME__Group__1 ;
    public final void rule__NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1464:1: ( rule__NAME__Group__0__Impl rule__NAME__Group__1 )
            // InternalJPCoffe.g:1465:2: rule__NAME__Group__0__Impl rule__NAME__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__NAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NAME__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAME__Group__0"


    // $ANTLR start "rule__NAME__Group__0__Impl"
    // InternalJPCoffe.g:1472:1: rule__NAME__Group__0__Impl : ( RULE_MAJ_WORD ) ;
    public final void rule__NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1476:1: ( ( RULE_MAJ_WORD ) )
            // InternalJPCoffe.g:1477:1: ( RULE_MAJ_WORD )
            {
            // InternalJPCoffe.g:1477:1: ( RULE_MAJ_WORD )
            // InternalJPCoffe.g:1478:2: RULE_MAJ_WORD
            {
             before(grammarAccess.getNAMEAccess().getMAJ_WORDTerminalRuleCall_0()); 
            match(input,RULE_MAJ_WORD,FOLLOW_2); 
             after(grammarAccess.getNAMEAccess().getMAJ_WORDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAME__Group__0__Impl"


    // $ANTLR start "rule__NAME__Group__1"
    // InternalJPCoffe.g:1487:1: rule__NAME__Group__1 : rule__NAME__Group__1__Impl ;
    public final void rule__NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1491:1: ( rule__NAME__Group__1__Impl )
            // InternalJPCoffe.g:1492:2: rule__NAME__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NAME__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAME__Group__1"


    // $ANTLR start "rule__NAME__Group__1__Impl"
    // InternalJPCoffe.g:1498:1: rule__NAME__Group__1__Impl : ( ( RULE_WORD )* ) ;
    public final void rule__NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1502:1: ( ( ( RULE_WORD )* ) )
            // InternalJPCoffe.g:1503:1: ( ( RULE_WORD )* )
            {
            // InternalJPCoffe.g:1503:1: ( ( RULE_WORD )* )
            // InternalJPCoffe.g:1504:2: ( RULE_WORD )*
            {
             before(grammarAccess.getNAMEAccess().getWORDTerminalRuleCall_1()); 
            // InternalJPCoffe.g:1505:2: ( RULE_WORD )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WORD) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJPCoffe.g:1505:3: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getNAMEAccess().getWORDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAME__Group__1__Impl"


    // $ANTLR start "rule__Recipe__NameAssignment_1"
    // InternalJPCoffe.g:1514:1: rule__Recipe__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Recipe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1518:1: ( ( RULE_STRING ) )
            // InternalJPCoffe.g:1519:2: ( RULE_STRING )
            {
            // InternalJPCoffe.g:1519:2: ( RULE_STRING )
            // InternalJPCoffe.g:1520:3: RULE_STRING
            {
             before(grammarAccess.getRecipeAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__NameAssignment_1"


    // $ANTLR start "rule__Recipe__PortionAssignment_3"
    // InternalJPCoffe.g:1529:1: rule__Recipe__PortionAssignment_3 : ( rulePortionNB ) ;
    public final void rule__Recipe__PortionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1533:1: ( ( rulePortionNB ) )
            // InternalJPCoffe.g:1534:2: ( rulePortionNB )
            {
            // InternalJPCoffe.g:1534:2: ( rulePortionNB )
            // InternalJPCoffe.g:1535:3: rulePortionNB
            {
             before(grammarAccess.getRecipeAccess().getPortionPortionNBParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePortionNB();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getPortionPortionNBParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__PortionAssignment_3"


    // $ANTLR start "rule__Recipe__IngredientsAssignment_4"
    // InternalJPCoffe.g:1544:1: rule__Recipe__IngredientsAssignment_4 : ( ruleIngredientsBlock ) ;
    public final void rule__Recipe__IngredientsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1548:1: ( ( ruleIngredientsBlock ) )
            // InternalJPCoffe.g:1549:2: ( ruleIngredientsBlock )
            {
            // InternalJPCoffe.g:1549:2: ( ruleIngredientsBlock )
            // InternalJPCoffe.g:1550:3: ruleIngredientsBlock
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientsBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredientsBlock();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientsIngredientsBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientsAssignment_4"


    // $ANTLR start "rule__Recipe__ToolsAssignment_5"
    // InternalJPCoffe.g:1559:1: rule__Recipe__ToolsAssignment_5 : ( ruleToolsBlock ) ;
    public final void rule__Recipe__ToolsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1563:1: ( ( ruleToolsBlock ) )
            // InternalJPCoffe.g:1564:2: ( ruleToolsBlock )
            {
            // InternalJPCoffe.g:1564:2: ( ruleToolsBlock )
            // InternalJPCoffe.g:1565:3: ruleToolsBlock
            {
             before(grammarAccess.getRecipeAccess().getToolsToolsBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleToolsBlock();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getToolsToolsBlockParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__ToolsAssignment_5"


    // $ANTLR start "rule__Recipe__StepsAssignment_6"
    // InternalJPCoffe.g:1574:1: rule__Recipe__StepsAssignment_6 : ( ruleStepsBlock ) ;
    public final void rule__Recipe__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1578:1: ( ( ruleStepsBlock ) )
            // InternalJPCoffe.g:1579:2: ( ruleStepsBlock )
            {
            // InternalJPCoffe.g:1579:2: ( ruleStepsBlock )
            // InternalJPCoffe.g:1580:3: ruleStepsBlock
            {
             before(grammarAccess.getRecipeAccess().getStepsStepsBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStepsBlock();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getStepsStepsBlockParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__StepsAssignment_6"


    // $ANTLR start "rule__PortionNB__NbAssignment_1"
    // InternalJPCoffe.g:1589:1: rule__PortionNB__NbAssignment_1 : ( RULE_INT ) ;
    public final void rule__PortionNB__NbAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1593:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:1594:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:1594:2: ( RULE_INT )
            // InternalJPCoffe.g:1595:3: RULE_INT
            {
             before(grammarAccess.getPortionNBAccess().getNbINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPortionNBAccess().getNbINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortionNB__NbAssignment_1"


    // $ANTLR start "rule__IngredientsBlock__IngredientsListAssignment_3"
    // InternalJPCoffe.g:1604:1: rule__IngredientsBlock__IngredientsListAssignment_3 : ( ruleIngredient ) ;
    public final void rule__IngredientsBlock__IngredientsListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1608:1: ( ( ruleIngredient ) )
            // InternalJPCoffe.g:1609:2: ( ruleIngredient )
            {
            // InternalJPCoffe.g:1609:2: ( ruleIngredient )
            // InternalJPCoffe.g:1610:3: ruleIngredient
            {
             before(grammarAccess.getIngredientsBlockAccess().getIngredientsListIngredientParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getIngredientsBlockAccess().getIngredientsListIngredientParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientsBlock__IngredientsListAssignment_3"


    // $ANTLR start "rule__Ingredient__NameAssignment_1"
    // InternalJPCoffe.g:1619:1: rule__Ingredient__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Ingredient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1623:1: ( ( ruleNAME ) )
            // InternalJPCoffe.g:1624:2: ( ruleNAME )
            {
            // InternalJPCoffe.g:1624:2: ( ruleNAME )
            // InternalJPCoffe.g:1625:3: ruleNAME
            {
             before(grammarAccess.getIngredientAccess().getNameNAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getNameNAMEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__NameAssignment_1"


    // $ANTLR start "rule__Ingredient__QuantityAssignment_2"
    // InternalJPCoffe.g:1634:1: rule__Ingredient__QuantityAssignment_2 : ( ruleQuantity ) ;
    public final void rule__Ingredient__QuantityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1638:1: ( ( ruleQuantity ) )
            // InternalJPCoffe.g:1639:2: ( ruleQuantity )
            {
            // InternalJPCoffe.g:1639:2: ( ruleQuantity )
            // InternalJPCoffe.g:1640:3: ruleQuantity
            {
             before(grammarAccess.getIngredientAccess().getQuantityQuantityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantity();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getQuantityQuantityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__QuantityAssignment_2"


    // $ANTLR start "rule__Quantity__AmountAssignment_0"
    // InternalJPCoffe.g:1649:1: rule__Quantity__AmountAssignment_0 : ( RULE_INT ) ;
    public final void rule__Quantity__AmountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1653:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:1654:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:1654:2: ( RULE_INT )
            // InternalJPCoffe.g:1655:3: RULE_INT
            {
             before(grammarAccess.getQuantityAccess().getAmountINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQuantityAccess().getAmountINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantity__AmountAssignment_0"


    // $ANTLR start "rule__Quantity__UnitAssignment_1"
    // InternalJPCoffe.g:1664:1: rule__Quantity__UnitAssignment_1 : ( RULE_METRIC_UNIT ) ;
    public final void rule__Quantity__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1668:1: ( ( RULE_METRIC_UNIT ) )
            // InternalJPCoffe.g:1669:2: ( RULE_METRIC_UNIT )
            {
            // InternalJPCoffe.g:1669:2: ( RULE_METRIC_UNIT )
            // InternalJPCoffe.g:1670:3: RULE_METRIC_UNIT
            {
             before(grammarAccess.getQuantityAccess().getUnitMETRIC_UNITTerminalRuleCall_1_0()); 
            match(input,RULE_METRIC_UNIT,FOLLOW_2); 
             after(grammarAccess.getQuantityAccess().getUnitMETRIC_UNITTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantity__UnitAssignment_1"


    // $ANTLR start "rule__ToolsBlock__ToolsListAssignment_3"
    // InternalJPCoffe.g:1679:1: rule__ToolsBlock__ToolsListAssignment_3 : ( ruleTool ) ;
    public final void rule__ToolsBlock__ToolsListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1683:1: ( ( ruleTool ) )
            // InternalJPCoffe.g:1684:2: ( ruleTool )
            {
            // InternalJPCoffe.g:1684:2: ( ruleTool )
            // InternalJPCoffe.g:1685:3: ruleTool
            {
             before(grammarAccess.getToolsBlockAccess().getToolsListToolParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTool();

            state._fsp--;

             after(grammarAccess.getToolsBlockAccess().getToolsListToolParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolsBlock__ToolsListAssignment_3"


    // $ANTLR start "rule__Tool__NameAssignment_1"
    // InternalJPCoffe.g:1694:1: rule__Tool__NameAssignment_1 : ( ruleNAME ) ;
    public final void rule__Tool__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1698:1: ( ( ruleNAME ) )
            // InternalJPCoffe.g:1699:2: ( ruleNAME )
            {
            // InternalJPCoffe.g:1699:2: ( ruleNAME )
            // InternalJPCoffe.g:1700:3: ruleNAME
            {
             before(grammarAccess.getToolAccess().getNameNAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getToolAccess().getNameNAMEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tool__NameAssignment_1"


    // $ANTLR start "rule__StepsBlock__StepsListAssignment_3"
    // InternalJPCoffe.g:1709:1: rule__StepsBlock__StepsListAssignment_3 : ( ruleStep ) ;
    public final void rule__StepsBlock__StepsListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1713:1: ( ( ruleStep ) )
            // InternalJPCoffe.g:1714:2: ( ruleStep )
            {
            // InternalJPCoffe.g:1714:2: ( ruleStep )
            // InternalJPCoffe.g:1715:3: ruleStep
            {
             before(grammarAccess.getStepsBlockAccess().getStepsListStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepsBlockAccess().getStepsListStepParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepsBlock__StepsListAssignment_3"


    // $ANTLR start "rule__Step__PredAssignment_1"
    // InternalJPCoffe.g:1724:1: rule__Step__PredAssignment_1 : ( RULE_INT ) ;
    public final void rule__Step__PredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1728:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:1729:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:1729:2: ( RULE_INT )
            // InternalJPCoffe.g:1730:3: RULE_INT
            {
             before(grammarAccess.getStepAccess().getPredINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getPredINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__PredAssignment_1"


    // $ANTLR start "rule__Step__PredAssignment_2_1"
    // InternalJPCoffe.g:1739:1: rule__Step__PredAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Step__PredAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1743:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:1744:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:1744:2: ( RULE_INT )
            // InternalJPCoffe.g:1745:3: RULE_INT
            {
             before(grammarAccess.getStepAccess().getPredINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getPredINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__PredAssignment_2_1"


    // $ANTLR start "rule__Step__NumAssignment_5"
    // InternalJPCoffe.g:1754:1: rule__Step__NumAssignment_5 : ( RULE_INT ) ;
    public final void rule__Step__NumAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1758:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:1759:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:1759:2: ( RULE_INT )
            // InternalJPCoffe.g:1760:3: RULE_INT
            {
             before(grammarAccess.getStepAccess().getNumINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getNumINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__NumAssignment_5"


    // $ANTLR start "rule__Step__TextAssignment_7"
    // InternalJPCoffe.g:1769:1: rule__Step__TextAssignment_7 : ( ruleTEXT ) ;
    public final void rule__Step__TextAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1773:1: ( ( ruleTEXT ) )
            // InternalJPCoffe.g:1774:2: ( ruleTEXT )
            {
            // InternalJPCoffe.g:1774:2: ( ruleTEXT )
            // InternalJPCoffe.g:1775:3: ruleTEXT
            {
             before(grammarAccess.getStepAccess().getTextTEXTParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getStepAccess().getTextTEXTParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TextAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001008100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000022L});

}