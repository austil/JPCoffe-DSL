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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NEW_LINE", "RULE_TITLE_LINE", "RULE_SPACE", "RULE_NAME", "RULE_INT", "RULE_METRIC_UNIT", "RULE_TEXT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Recipe'", "'{'", "'}'", "'For'", "'people'", "'Ingredients'", "'*'", "'Tools'", "'Steps'", "'->'", "'.'", "','"
    };
    public static final int RULE_METRIC_UNIT=10;
    public static final int RULE_NAME=8;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_SPACE=7;
    public static final int EOF=-1;
    public static final int RULE_ID=12;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NEW_LINE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int RULE_TITLE_LINE=6;
    public static final int RULE_TEXT=11;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalJPCoffe.g:62:1: ruleMain : ( ( ( rule__Main__RecipesAssignment ) ) ( ( rule__Main__RecipesAssignment )* ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:66:2: ( ( ( ( rule__Main__RecipesAssignment ) ) ( ( rule__Main__RecipesAssignment )* ) ) )
            // InternalJPCoffe.g:67:2: ( ( ( rule__Main__RecipesAssignment ) ) ( ( rule__Main__RecipesAssignment )* ) )
            {
            // InternalJPCoffe.g:67:2: ( ( ( rule__Main__RecipesAssignment ) ) ( ( rule__Main__RecipesAssignment )* ) )
            // InternalJPCoffe.g:68:3: ( ( rule__Main__RecipesAssignment ) ) ( ( rule__Main__RecipesAssignment )* )
            {
            // InternalJPCoffe.g:68:3: ( ( rule__Main__RecipesAssignment ) )
            // InternalJPCoffe.g:69:4: ( rule__Main__RecipesAssignment )
            {
             before(grammarAccess.getMainAccess().getRecipesAssignment()); 
            // InternalJPCoffe.g:70:4: ( rule__Main__RecipesAssignment )
            // InternalJPCoffe.g:70:5: rule__Main__RecipesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Main__RecipesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getRecipesAssignment()); 

            }

            // InternalJPCoffe.g:73:3: ( ( rule__Main__RecipesAssignment )* )
            // InternalJPCoffe.g:74:4: ( rule__Main__RecipesAssignment )*
            {
             before(grammarAccess.getMainAccess().getRecipesAssignment()); 
            // InternalJPCoffe.g:75:4: ( rule__Main__RecipesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJPCoffe.g:75:5: rule__Main__RecipesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Main__RecipesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getRecipesAssignment()); 

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleRecipe"
    // InternalJPCoffe.g:85:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // InternalJPCoffe.g:86:1: ( ruleRecipe EOF )
            // InternalJPCoffe.g:87:1: ruleRecipe EOF
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
    // InternalJPCoffe.g:94:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:98:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // InternalJPCoffe.g:99:2: ( ( rule__Recipe__Group__0 ) )
            {
            // InternalJPCoffe.g:99:2: ( ( rule__Recipe__Group__0 ) )
            // InternalJPCoffe.g:100:3: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // InternalJPCoffe.g:101:3: ( rule__Recipe__Group__0 )
            // InternalJPCoffe.g:101:4: rule__Recipe__Group__0
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
    // InternalJPCoffe.g:110:1: entryRulePortionNB : rulePortionNB EOF ;
    public final void entryRulePortionNB() throws RecognitionException {
        try {
            // InternalJPCoffe.g:111:1: ( rulePortionNB EOF )
            // InternalJPCoffe.g:112:1: rulePortionNB EOF
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
    // InternalJPCoffe.g:119:1: rulePortionNB : ( ( rule__PortionNB__Group__0 ) ) ;
    public final void rulePortionNB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:123:2: ( ( ( rule__PortionNB__Group__0 ) ) )
            // InternalJPCoffe.g:124:2: ( ( rule__PortionNB__Group__0 ) )
            {
            // InternalJPCoffe.g:124:2: ( ( rule__PortionNB__Group__0 ) )
            // InternalJPCoffe.g:125:3: ( rule__PortionNB__Group__0 )
            {
             before(grammarAccess.getPortionNBAccess().getGroup()); 
            // InternalJPCoffe.g:126:3: ( rule__PortionNB__Group__0 )
            // InternalJPCoffe.g:126:4: rule__PortionNB__Group__0
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
    // InternalJPCoffe.g:135:1: entryRuleIngredientsBlock : ruleIngredientsBlock EOF ;
    public final void entryRuleIngredientsBlock() throws RecognitionException {
        try {
            // InternalJPCoffe.g:136:1: ( ruleIngredientsBlock EOF )
            // InternalJPCoffe.g:137:1: ruleIngredientsBlock EOF
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
    // InternalJPCoffe.g:144:1: ruleIngredientsBlock : ( ( rule__IngredientsBlock__Group__0 ) ) ;
    public final void ruleIngredientsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:148:2: ( ( ( rule__IngredientsBlock__Group__0 ) ) )
            // InternalJPCoffe.g:149:2: ( ( rule__IngredientsBlock__Group__0 ) )
            {
            // InternalJPCoffe.g:149:2: ( ( rule__IngredientsBlock__Group__0 ) )
            // InternalJPCoffe.g:150:3: ( rule__IngredientsBlock__Group__0 )
            {
             before(grammarAccess.getIngredientsBlockAccess().getGroup()); 
            // InternalJPCoffe.g:151:3: ( rule__IngredientsBlock__Group__0 )
            // InternalJPCoffe.g:151:4: rule__IngredientsBlock__Group__0
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
    // InternalJPCoffe.g:160:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // InternalJPCoffe.g:161:1: ( ruleIngredient EOF )
            // InternalJPCoffe.g:162:1: ruleIngredient EOF
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
    // InternalJPCoffe.g:169:1: ruleIngredient : ( ( rule__Ingredient__Group__0 ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:173:2: ( ( ( rule__Ingredient__Group__0 ) ) )
            // InternalJPCoffe.g:174:2: ( ( rule__Ingredient__Group__0 ) )
            {
            // InternalJPCoffe.g:174:2: ( ( rule__Ingredient__Group__0 ) )
            // InternalJPCoffe.g:175:3: ( rule__Ingredient__Group__0 )
            {
             before(grammarAccess.getIngredientAccess().getGroup()); 
            // InternalJPCoffe.g:176:3: ( rule__Ingredient__Group__0 )
            // InternalJPCoffe.g:176:4: rule__Ingredient__Group__0
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
    // InternalJPCoffe.g:185:1: entryRuleQuantity : ruleQuantity EOF ;
    public final void entryRuleQuantity() throws RecognitionException {
        try {
            // InternalJPCoffe.g:186:1: ( ruleQuantity EOF )
            // InternalJPCoffe.g:187:1: ruleQuantity EOF
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
    // InternalJPCoffe.g:194:1: ruleQuantity : ( ( rule__Quantity__Group__0 ) ) ;
    public final void ruleQuantity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:198:2: ( ( ( rule__Quantity__Group__0 ) ) )
            // InternalJPCoffe.g:199:2: ( ( rule__Quantity__Group__0 ) )
            {
            // InternalJPCoffe.g:199:2: ( ( rule__Quantity__Group__0 ) )
            // InternalJPCoffe.g:200:3: ( rule__Quantity__Group__0 )
            {
             before(grammarAccess.getQuantityAccess().getGroup()); 
            // InternalJPCoffe.g:201:3: ( rule__Quantity__Group__0 )
            // InternalJPCoffe.g:201:4: rule__Quantity__Group__0
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
    // InternalJPCoffe.g:210:1: entryRuleToolsBlock : ruleToolsBlock EOF ;
    public final void entryRuleToolsBlock() throws RecognitionException {
        try {
            // InternalJPCoffe.g:211:1: ( ruleToolsBlock EOF )
            // InternalJPCoffe.g:212:1: ruleToolsBlock EOF
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
    // InternalJPCoffe.g:219:1: ruleToolsBlock : ( ( rule__ToolsBlock__Group__0 ) ) ;
    public final void ruleToolsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:223:2: ( ( ( rule__ToolsBlock__Group__0 ) ) )
            // InternalJPCoffe.g:224:2: ( ( rule__ToolsBlock__Group__0 ) )
            {
            // InternalJPCoffe.g:224:2: ( ( rule__ToolsBlock__Group__0 ) )
            // InternalJPCoffe.g:225:3: ( rule__ToolsBlock__Group__0 )
            {
             before(grammarAccess.getToolsBlockAccess().getGroup()); 
            // InternalJPCoffe.g:226:3: ( rule__ToolsBlock__Group__0 )
            // InternalJPCoffe.g:226:4: rule__ToolsBlock__Group__0
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
    // InternalJPCoffe.g:235:1: entryRuleTool : ruleTool EOF ;
    public final void entryRuleTool() throws RecognitionException {
        try {
            // InternalJPCoffe.g:236:1: ( ruleTool EOF )
            // InternalJPCoffe.g:237:1: ruleTool EOF
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
    // InternalJPCoffe.g:244:1: ruleTool : ( ( rule__Tool__Group__0 ) ) ;
    public final void ruleTool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:248:2: ( ( ( rule__Tool__Group__0 ) ) )
            // InternalJPCoffe.g:249:2: ( ( rule__Tool__Group__0 ) )
            {
            // InternalJPCoffe.g:249:2: ( ( rule__Tool__Group__0 ) )
            // InternalJPCoffe.g:250:3: ( rule__Tool__Group__0 )
            {
             before(grammarAccess.getToolAccess().getGroup()); 
            // InternalJPCoffe.g:251:3: ( rule__Tool__Group__0 )
            // InternalJPCoffe.g:251:4: rule__Tool__Group__0
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
    // InternalJPCoffe.g:260:1: entryRuleStepsBlock : ruleStepsBlock EOF ;
    public final void entryRuleStepsBlock() throws RecognitionException {
        try {
            // InternalJPCoffe.g:261:1: ( ruleStepsBlock EOF )
            // InternalJPCoffe.g:262:1: ruleStepsBlock EOF
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
    // InternalJPCoffe.g:269:1: ruleStepsBlock : ( ( rule__StepsBlock__Group__0 ) ) ;
    public final void ruleStepsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:273:2: ( ( ( rule__StepsBlock__Group__0 ) ) )
            // InternalJPCoffe.g:274:2: ( ( rule__StepsBlock__Group__0 ) )
            {
            // InternalJPCoffe.g:274:2: ( ( rule__StepsBlock__Group__0 ) )
            // InternalJPCoffe.g:275:3: ( rule__StepsBlock__Group__0 )
            {
             before(grammarAccess.getStepsBlockAccess().getGroup()); 
            // InternalJPCoffe.g:276:3: ( rule__StepsBlock__Group__0 )
            // InternalJPCoffe.g:276:4: rule__StepsBlock__Group__0
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
    // InternalJPCoffe.g:285:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalJPCoffe.g:286:1: ( ruleStep EOF )
            // InternalJPCoffe.g:287:1: ruleStep EOF
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
    // InternalJPCoffe.g:294:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:298:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalJPCoffe.g:299:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalJPCoffe.g:299:2: ( ( rule__Step__Group__0 ) )
            // InternalJPCoffe.g:300:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalJPCoffe.g:301:3: ( rule__Step__Group__0 )
            // InternalJPCoffe.g:301:4: rule__Step__Group__0
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


    // $ANTLR start "rule__Recipe__Group__0"
    // InternalJPCoffe.g:309:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:313:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // InternalJPCoffe.g:314:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
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
    // InternalJPCoffe.g:321:1: rule__Recipe__Group__0__Impl : ( 'Recipe' ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:325:1: ( ( 'Recipe' ) )
            // InternalJPCoffe.g:326:1: ( 'Recipe' )
            {
            // InternalJPCoffe.g:326:1: ( 'Recipe' )
            // InternalJPCoffe.g:327:2: 'Recipe'
            {
             before(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalJPCoffe.g:336:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:340:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // InternalJPCoffe.g:341:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
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
    // InternalJPCoffe.g:348:1: rule__Recipe__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:352:1: ( ( RULE_STRING ) )
            // InternalJPCoffe.g:353:1: ( RULE_STRING )
            {
            // InternalJPCoffe.g:353:1: ( RULE_STRING )
            // InternalJPCoffe.g:354:2: RULE_STRING
            {
             before(grammarAccess.getRecipeAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getSTRINGTerminalRuleCall_1()); 

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
    // InternalJPCoffe.g:363:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:367:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // InternalJPCoffe.g:368:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
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
    // InternalJPCoffe.g:375:1: rule__Recipe__Group__2__Impl : ( '{' ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:379:1: ( ( '{' ) )
            // InternalJPCoffe.g:380:1: ( '{' )
            {
            // InternalJPCoffe.g:380:1: ( '{' )
            // InternalJPCoffe.g:381:2: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalJPCoffe.g:390:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:394:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // InternalJPCoffe.g:395:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
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
    // InternalJPCoffe.g:402:1: rule__Recipe__Group__3__Impl : ( rulePortionNB ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:406:1: ( ( rulePortionNB ) )
            // InternalJPCoffe.g:407:1: ( rulePortionNB )
            {
            // InternalJPCoffe.g:407:1: ( rulePortionNB )
            // InternalJPCoffe.g:408:2: rulePortionNB
            {
             before(grammarAccess.getRecipeAccess().getPortionNBParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            rulePortionNB();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getPortionNBParserRuleCall_3()); 

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
    // InternalJPCoffe.g:417:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:421:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // InternalJPCoffe.g:422:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
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
    // InternalJPCoffe.g:429:1: rule__Recipe__Group__4__Impl : ( ruleIngredientsBlock ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:433:1: ( ( ruleIngredientsBlock ) )
            // InternalJPCoffe.g:434:1: ( ruleIngredientsBlock )
            {
            // InternalJPCoffe.g:434:1: ( ruleIngredientsBlock )
            // InternalJPCoffe.g:435:2: ruleIngredientsBlock
            {
             before(grammarAccess.getRecipeAccess().getIngredientsBlockParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleIngredientsBlock();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientsBlockParserRuleCall_4()); 

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
    // InternalJPCoffe.g:444:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:448:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // InternalJPCoffe.g:449:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
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
    // InternalJPCoffe.g:456:1: rule__Recipe__Group__5__Impl : ( ruleToolsBlock ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:460:1: ( ( ruleToolsBlock ) )
            // InternalJPCoffe.g:461:1: ( ruleToolsBlock )
            {
            // InternalJPCoffe.g:461:1: ( ruleToolsBlock )
            // InternalJPCoffe.g:462:2: ruleToolsBlock
            {
             before(grammarAccess.getRecipeAccess().getToolsBlockParserRuleCall_5()); 
            pushFollow(FOLLOW_2);
            ruleToolsBlock();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getToolsBlockParserRuleCall_5()); 

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
    // InternalJPCoffe.g:471:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:475:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // InternalJPCoffe.g:476:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
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
    // InternalJPCoffe.g:483:1: rule__Recipe__Group__6__Impl : ( ruleStepsBlock ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:487:1: ( ( ruleStepsBlock ) )
            // InternalJPCoffe.g:488:1: ( ruleStepsBlock )
            {
            // InternalJPCoffe.g:488:1: ( ruleStepsBlock )
            // InternalJPCoffe.g:489:2: ruleStepsBlock
            {
             before(grammarAccess.getRecipeAccess().getStepsBlockParserRuleCall_6()); 
            pushFollow(FOLLOW_2);
            ruleStepsBlock();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getStepsBlockParserRuleCall_6()); 

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
    // InternalJPCoffe.g:498:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:502:1: ( rule__Recipe__Group__7__Impl )
            // InternalJPCoffe.g:503:2: rule__Recipe__Group__7__Impl
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
    // InternalJPCoffe.g:509:1: rule__Recipe__Group__7__Impl : ( '}' ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:513:1: ( ( '}' ) )
            // InternalJPCoffe.g:514:1: ( '}' )
            {
            // InternalJPCoffe.g:514:1: ( '}' )
            // InternalJPCoffe.g:515:2: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
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
    // InternalJPCoffe.g:525:1: rule__PortionNB__Group__0 : rule__PortionNB__Group__0__Impl rule__PortionNB__Group__1 ;
    public final void rule__PortionNB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:529:1: ( rule__PortionNB__Group__0__Impl rule__PortionNB__Group__1 )
            // InternalJPCoffe.g:530:2: rule__PortionNB__Group__0__Impl rule__PortionNB__Group__1
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
    // InternalJPCoffe.g:537:1: rule__PortionNB__Group__0__Impl : ( 'For' ) ;
    public final void rule__PortionNB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:541:1: ( ( 'For' ) )
            // InternalJPCoffe.g:542:1: ( 'For' )
            {
            // InternalJPCoffe.g:542:1: ( 'For' )
            // InternalJPCoffe.g:543:2: 'For'
            {
             before(grammarAccess.getPortionNBAccess().getForKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalJPCoffe.g:552:1: rule__PortionNB__Group__1 : rule__PortionNB__Group__1__Impl rule__PortionNB__Group__2 ;
    public final void rule__PortionNB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:556:1: ( rule__PortionNB__Group__1__Impl rule__PortionNB__Group__2 )
            // InternalJPCoffe.g:557:2: rule__PortionNB__Group__1__Impl rule__PortionNB__Group__2
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
    // InternalJPCoffe.g:564:1: rule__PortionNB__Group__1__Impl : ( ( rule__PortionNB__NbAssignment_1 ) ) ;
    public final void rule__PortionNB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:568:1: ( ( ( rule__PortionNB__NbAssignment_1 ) ) )
            // InternalJPCoffe.g:569:1: ( ( rule__PortionNB__NbAssignment_1 ) )
            {
            // InternalJPCoffe.g:569:1: ( ( rule__PortionNB__NbAssignment_1 ) )
            // InternalJPCoffe.g:570:2: ( rule__PortionNB__NbAssignment_1 )
            {
             before(grammarAccess.getPortionNBAccess().getNbAssignment_1()); 
            // InternalJPCoffe.g:571:2: ( rule__PortionNB__NbAssignment_1 )
            // InternalJPCoffe.g:571:3: rule__PortionNB__NbAssignment_1
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
    // InternalJPCoffe.g:579:1: rule__PortionNB__Group__2 : rule__PortionNB__Group__2__Impl ;
    public final void rule__PortionNB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:583:1: ( rule__PortionNB__Group__2__Impl )
            // InternalJPCoffe.g:584:2: rule__PortionNB__Group__2__Impl
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
    // InternalJPCoffe.g:590:1: rule__PortionNB__Group__2__Impl : ( ( 'people' )? ) ;
    public final void rule__PortionNB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:594:1: ( ( ( 'people' )? ) )
            // InternalJPCoffe.g:595:1: ( ( 'people' )? )
            {
            // InternalJPCoffe.g:595:1: ( ( 'people' )? )
            // InternalJPCoffe.g:596:2: ( 'people' )?
            {
             before(grammarAccess.getPortionNBAccess().getPeopleKeyword_2()); 
            // InternalJPCoffe.g:597:2: ( 'people' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalJPCoffe.g:597:3: 'people'
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalJPCoffe.g:606:1: rule__IngredientsBlock__Group__0 : rule__IngredientsBlock__Group__0__Impl rule__IngredientsBlock__Group__1 ;
    public final void rule__IngredientsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:610:1: ( rule__IngredientsBlock__Group__0__Impl rule__IngredientsBlock__Group__1 )
            // InternalJPCoffe.g:611:2: rule__IngredientsBlock__Group__0__Impl rule__IngredientsBlock__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalJPCoffe.g:618:1: rule__IngredientsBlock__Group__0__Impl : ( 'Ingredients' ) ;
    public final void rule__IngredientsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:622:1: ( ( 'Ingredients' ) )
            // InternalJPCoffe.g:623:1: ( 'Ingredients' )
            {
            // InternalJPCoffe.g:623:1: ( 'Ingredients' )
            // InternalJPCoffe.g:624:2: 'Ingredients'
            {
             before(grammarAccess.getIngredientsBlockAccess().getIngredientsKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIngredientsBlockAccess().getIngredientsKeyword_0()); 

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
    // $ANTLR end "rule__IngredientsBlock__Group__0__Impl"


    // $ANTLR start "rule__IngredientsBlock__Group__1"
    // InternalJPCoffe.g:633:1: rule__IngredientsBlock__Group__1 : rule__IngredientsBlock__Group__1__Impl rule__IngredientsBlock__Group__2 ;
    public final void rule__IngredientsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:637:1: ( rule__IngredientsBlock__Group__1__Impl rule__IngredientsBlock__Group__2 )
            // InternalJPCoffe.g:638:2: rule__IngredientsBlock__Group__1__Impl rule__IngredientsBlock__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalJPCoffe.g:645:1: rule__IngredientsBlock__Group__1__Impl : ( RULE_NEW_LINE ) ;
    public final void rule__IngredientsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:649:1: ( ( RULE_NEW_LINE ) )
            // InternalJPCoffe.g:650:1: ( RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:650:1: ( RULE_NEW_LINE )
            // InternalJPCoffe.g:651:2: RULE_NEW_LINE
            {
             before(grammarAccess.getIngredientsBlockAccess().getNEW_LINETerminalRuleCall_1()); 
            match(input,RULE_NEW_LINE,FOLLOW_2); 
             after(grammarAccess.getIngredientsBlockAccess().getNEW_LINETerminalRuleCall_1()); 

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
    // InternalJPCoffe.g:660:1: rule__IngredientsBlock__Group__2 : rule__IngredientsBlock__Group__2__Impl rule__IngredientsBlock__Group__3 ;
    public final void rule__IngredientsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:664:1: ( rule__IngredientsBlock__Group__2__Impl rule__IngredientsBlock__Group__3 )
            // InternalJPCoffe.g:665:2: rule__IngredientsBlock__Group__2__Impl rule__IngredientsBlock__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalJPCoffe.g:672:1: rule__IngredientsBlock__Group__2__Impl : ( RULE_TITLE_LINE ) ;
    public final void rule__IngredientsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:676:1: ( ( RULE_TITLE_LINE ) )
            // InternalJPCoffe.g:677:1: ( RULE_TITLE_LINE )
            {
            // InternalJPCoffe.g:677:1: ( RULE_TITLE_LINE )
            // InternalJPCoffe.g:678:2: RULE_TITLE_LINE
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
    // InternalJPCoffe.g:687:1: rule__IngredientsBlock__Group__3 : rule__IngredientsBlock__Group__3__Impl rule__IngredientsBlock__Group__4 ;
    public final void rule__IngredientsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:691:1: ( rule__IngredientsBlock__Group__3__Impl rule__IngredientsBlock__Group__4 )
            // InternalJPCoffe.g:692:2: rule__IngredientsBlock__Group__3__Impl rule__IngredientsBlock__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__IngredientsBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngredientsBlock__Group__4();

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
    // InternalJPCoffe.g:699:1: rule__IngredientsBlock__Group__3__Impl : ( RULE_NEW_LINE ) ;
    public final void rule__IngredientsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:703:1: ( ( RULE_NEW_LINE ) )
            // InternalJPCoffe.g:704:1: ( RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:704:1: ( RULE_NEW_LINE )
            // InternalJPCoffe.g:705:2: RULE_NEW_LINE
            {
             before(grammarAccess.getIngredientsBlockAccess().getNEW_LINETerminalRuleCall_3()); 
            match(input,RULE_NEW_LINE,FOLLOW_2); 
             after(grammarAccess.getIngredientsBlockAccess().getNEW_LINETerminalRuleCall_3()); 

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


    // $ANTLR start "rule__IngredientsBlock__Group__4"
    // InternalJPCoffe.g:714:1: rule__IngredientsBlock__Group__4 : rule__IngredientsBlock__Group__4__Impl rule__IngredientsBlock__Group__5 ;
    public final void rule__IngredientsBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:718:1: ( rule__IngredientsBlock__Group__4__Impl rule__IngredientsBlock__Group__5 )
            // InternalJPCoffe.g:719:2: rule__IngredientsBlock__Group__4__Impl rule__IngredientsBlock__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__IngredientsBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngredientsBlock__Group__5();

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
    // $ANTLR end "rule__IngredientsBlock__Group__4"


    // $ANTLR start "rule__IngredientsBlock__Group__4__Impl"
    // InternalJPCoffe.g:726:1: rule__IngredientsBlock__Group__4__Impl : ( ( ruleIngredient )* ) ;
    public final void rule__IngredientsBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:730:1: ( ( ( ruleIngredient )* ) )
            // InternalJPCoffe.g:731:1: ( ( ruleIngredient )* )
            {
            // InternalJPCoffe.g:731:1: ( ( ruleIngredient )* )
            // InternalJPCoffe.g:732:2: ( ruleIngredient )*
            {
             before(grammarAccess.getIngredientsBlockAccess().getIngredientParserRuleCall_4()); 
            // InternalJPCoffe.g:733:2: ( ruleIngredient )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJPCoffe.g:733:3: ruleIngredient
            	    {
            	    pushFollow(FOLLOW_16);
            	    ruleIngredient();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getIngredientsBlockAccess().getIngredientParserRuleCall_4()); 

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
    // $ANTLR end "rule__IngredientsBlock__Group__4__Impl"


    // $ANTLR start "rule__IngredientsBlock__Group__5"
    // InternalJPCoffe.g:741:1: rule__IngredientsBlock__Group__5 : rule__IngredientsBlock__Group__5__Impl ;
    public final void rule__IngredientsBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:745:1: ( rule__IngredientsBlock__Group__5__Impl )
            // InternalJPCoffe.g:746:2: rule__IngredientsBlock__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IngredientsBlock__Group__5__Impl();

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
    // $ANTLR end "rule__IngredientsBlock__Group__5"


    // $ANTLR start "rule__IngredientsBlock__Group__5__Impl"
    // InternalJPCoffe.g:752:1: rule__IngredientsBlock__Group__5__Impl : ( RULE_NEW_LINE ) ;
    public final void rule__IngredientsBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:756:1: ( ( RULE_NEW_LINE ) )
            // InternalJPCoffe.g:757:1: ( RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:757:1: ( RULE_NEW_LINE )
            // InternalJPCoffe.g:758:2: RULE_NEW_LINE
            {
             before(grammarAccess.getIngredientsBlockAccess().getNEW_LINETerminalRuleCall_5()); 
            match(input,RULE_NEW_LINE,FOLLOW_2); 
             after(grammarAccess.getIngredientsBlockAccess().getNEW_LINETerminalRuleCall_5()); 

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
    // $ANTLR end "rule__IngredientsBlock__Group__5__Impl"


    // $ANTLR start "rule__Ingredient__Group__0"
    // InternalJPCoffe.g:768:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:772:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // InternalJPCoffe.g:773:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalJPCoffe.g:780:1: rule__Ingredient__Group__0__Impl : ( '*' ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:784:1: ( ( '*' ) )
            // InternalJPCoffe.g:785:1: ( '*' )
            {
            // InternalJPCoffe.g:785:1: ( '*' )
            // InternalJPCoffe.g:786:2: '*'
            {
             before(grammarAccess.getIngredientAccess().getAsteriskKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalJPCoffe.g:795:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:799:1: ( rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 )
            // InternalJPCoffe.g:800:2: rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalJPCoffe.g:807:1: rule__Ingredient__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:811:1: ( ( RULE_SPACE ) )
            // InternalJPCoffe.g:812:1: ( RULE_SPACE )
            {
            // InternalJPCoffe.g:812:1: ( RULE_SPACE )
            // InternalJPCoffe.g:813:2: RULE_SPACE
            {
             before(grammarAccess.getIngredientAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getSPACETerminalRuleCall_1()); 

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
    // InternalJPCoffe.g:822:1: rule__Ingredient__Group__2 : rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 ;
    public final void rule__Ingredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:826:1: ( rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 )
            // InternalJPCoffe.g:827:2: rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Ingredient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__3();

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
    // InternalJPCoffe.g:834:1: rule__Ingredient__Group__2__Impl : ( RULE_NAME ) ;
    public final void rule__Ingredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:838:1: ( ( RULE_NAME ) )
            // InternalJPCoffe.g:839:1: ( RULE_NAME )
            {
            // InternalJPCoffe.g:839:1: ( RULE_NAME )
            // InternalJPCoffe.g:840:2: RULE_NAME
            {
             before(grammarAccess.getIngredientAccess().getNAMETerminalRuleCall_2()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getNAMETerminalRuleCall_2()); 

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


    // $ANTLR start "rule__Ingredient__Group__3"
    // InternalJPCoffe.g:849:1: rule__Ingredient__Group__3 : rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4 ;
    public final void rule__Ingredient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:853:1: ( rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4 )
            // InternalJPCoffe.g:854:2: rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Ingredient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__4();

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
    // $ANTLR end "rule__Ingredient__Group__3"


    // $ANTLR start "rule__Ingredient__Group__3__Impl"
    // InternalJPCoffe.g:861:1: rule__Ingredient__Group__3__Impl : ( ruleQuantity ) ;
    public final void rule__Ingredient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:865:1: ( ( ruleQuantity ) )
            // InternalJPCoffe.g:866:1: ( ruleQuantity )
            {
            // InternalJPCoffe.g:866:1: ( ruleQuantity )
            // InternalJPCoffe.g:867:2: ruleQuantity
            {
             before(grammarAccess.getIngredientAccess().getQuantityParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleQuantity();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getQuantityParserRuleCall_3()); 

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
    // $ANTLR end "rule__Ingredient__Group__3__Impl"


    // $ANTLR start "rule__Ingredient__Group__4"
    // InternalJPCoffe.g:876:1: rule__Ingredient__Group__4 : rule__Ingredient__Group__4__Impl ;
    public final void rule__Ingredient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:880:1: ( rule__Ingredient__Group__4__Impl )
            // InternalJPCoffe.g:881:2: rule__Ingredient__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__4__Impl();

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
    // $ANTLR end "rule__Ingredient__Group__4"


    // $ANTLR start "rule__Ingredient__Group__4__Impl"
    // InternalJPCoffe.g:887:1: rule__Ingredient__Group__4__Impl : ( RULE_NEW_LINE ) ;
    public final void rule__Ingredient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:891:1: ( ( RULE_NEW_LINE ) )
            // InternalJPCoffe.g:892:1: ( RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:892:1: ( RULE_NEW_LINE )
            // InternalJPCoffe.g:893:2: RULE_NEW_LINE
            {
             before(grammarAccess.getIngredientAccess().getNEW_LINETerminalRuleCall_4()); 
            match(input,RULE_NEW_LINE,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getNEW_LINETerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Ingredient__Group__4__Impl"


    // $ANTLR start "rule__Quantity__Group__0"
    // InternalJPCoffe.g:903:1: rule__Quantity__Group__0 : rule__Quantity__Group__0__Impl rule__Quantity__Group__1 ;
    public final void rule__Quantity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:907:1: ( rule__Quantity__Group__0__Impl rule__Quantity__Group__1 )
            // InternalJPCoffe.g:908:2: rule__Quantity__Group__0__Impl rule__Quantity__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalJPCoffe.g:915:1: rule__Quantity__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Quantity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:919:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:920:1: ( RULE_INT )
            {
            // InternalJPCoffe.g:920:1: ( RULE_INT )
            // InternalJPCoffe.g:921:2: RULE_INT
            {
             before(grammarAccess.getQuantityAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQuantityAccess().getINTTerminalRuleCall_0()); 

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
    // InternalJPCoffe.g:930:1: rule__Quantity__Group__1 : rule__Quantity__Group__1__Impl ;
    public final void rule__Quantity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:934:1: ( rule__Quantity__Group__1__Impl )
            // InternalJPCoffe.g:935:2: rule__Quantity__Group__1__Impl
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
    // InternalJPCoffe.g:941:1: rule__Quantity__Group__1__Impl : ( ( RULE_METRIC_UNIT )? ) ;
    public final void rule__Quantity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:945:1: ( ( ( RULE_METRIC_UNIT )? ) )
            // InternalJPCoffe.g:946:1: ( ( RULE_METRIC_UNIT )? )
            {
            // InternalJPCoffe.g:946:1: ( ( RULE_METRIC_UNIT )? )
            // InternalJPCoffe.g:947:2: ( RULE_METRIC_UNIT )?
            {
             before(grammarAccess.getQuantityAccess().getMETRIC_UNITTerminalRuleCall_1()); 
            // InternalJPCoffe.g:948:2: ( RULE_METRIC_UNIT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_METRIC_UNIT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJPCoffe.g:948:3: RULE_METRIC_UNIT
                    {
                    match(input,RULE_METRIC_UNIT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQuantityAccess().getMETRIC_UNITTerminalRuleCall_1()); 

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
    // InternalJPCoffe.g:957:1: rule__ToolsBlock__Group__0 : rule__ToolsBlock__Group__0__Impl rule__ToolsBlock__Group__1 ;
    public final void rule__ToolsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:961:1: ( rule__ToolsBlock__Group__0__Impl rule__ToolsBlock__Group__1 )
            // InternalJPCoffe.g:962:2: rule__ToolsBlock__Group__0__Impl rule__ToolsBlock__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalJPCoffe.g:969:1: rule__ToolsBlock__Group__0__Impl : ( 'Tools' ) ;
    public final void rule__ToolsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:973:1: ( ( 'Tools' ) )
            // InternalJPCoffe.g:974:1: ( 'Tools' )
            {
            // InternalJPCoffe.g:974:1: ( 'Tools' )
            // InternalJPCoffe.g:975:2: 'Tools'
            {
             before(grammarAccess.getToolsBlockAccess().getToolsKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getToolsBlockAccess().getToolsKeyword_0()); 

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
    // $ANTLR end "rule__ToolsBlock__Group__0__Impl"


    // $ANTLR start "rule__ToolsBlock__Group__1"
    // InternalJPCoffe.g:984:1: rule__ToolsBlock__Group__1 : rule__ToolsBlock__Group__1__Impl rule__ToolsBlock__Group__2 ;
    public final void rule__ToolsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:988:1: ( rule__ToolsBlock__Group__1__Impl rule__ToolsBlock__Group__2 )
            // InternalJPCoffe.g:989:2: rule__ToolsBlock__Group__1__Impl rule__ToolsBlock__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalJPCoffe.g:996:1: rule__ToolsBlock__Group__1__Impl : ( RULE_NEW_LINE ) ;
    public final void rule__ToolsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1000:1: ( ( RULE_NEW_LINE ) )
            // InternalJPCoffe.g:1001:1: ( RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:1001:1: ( RULE_NEW_LINE )
            // InternalJPCoffe.g:1002:2: RULE_NEW_LINE
            {
             before(grammarAccess.getToolsBlockAccess().getNEW_LINETerminalRuleCall_1()); 
            match(input,RULE_NEW_LINE,FOLLOW_2); 
             after(grammarAccess.getToolsBlockAccess().getNEW_LINETerminalRuleCall_1()); 

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
    // InternalJPCoffe.g:1011:1: rule__ToolsBlock__Group__2 : rule__ToolsBlock__Group__2__Impl rule__ToolsBlock__Group__3 ;
    public final void rule__ToolsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1015:1: ( rule__ToolsBlock__Group__2__Impl rule__ToolsBlock__Group__3 )
            // InternalJPCoffe.g:1016:2: rule__ToolsBlock__Group__2__Impl rule__ToolsBlock__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalJPCoffe.g:1023:1: rule__ToolsBlock__Group__2__Impl : ( RULE_TITLE_LINE ) ;
    public final void rule__ToolsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1027:1: ( ( RULE_TITLE_LINE ) )
            // InternalJPCoffe.g:1028:1: ( RULE_TITLE_LINE )
            {
            // InternalJPCoffe.g:1028:1: ( RULE_TITLE_LINE )
            // InternalJPCoffe.g:1029:2: RULE_TITLE_LINE
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
    // InternalJPCoffe.g:1038:1: rule__ToolsBlock__Group__3 : rule__ToolsBlock__Group__3__Impl rule__ToolsBlock__Group__4 ;
    public final void rule__ToolsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1042:1: ( rule__ToolsBlock__Group__3__Impl rule__ToolsBlock__Group__4 )
            // InternalJPCoffe.g:1043:2: rule__ToolsBlock__Group__3__Impl rule__ToolsBlock__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ToolsBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToolsBlock__Group__4();

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
    // InternalJPCoffe.g:1050:1: rule__ToolsBlock__Group__3__Impl : ( RULE_NEW_LINE ) ;
    public final void rule__ToolsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1054:1: ( ( RULE_NEW_LINE ) )
            // InternalJPCoffe.g:1055:1: ( RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:1055:1: ( RULE_NEW_LINE )
            // InternalJPCoffe.g:1056:2: RULE_NEW_LINE
            {
             before(grammarAccess.getToolsBlockAccess().getNEW_LINETerminalRuleCall_3()); 
            match(input,RULE_NEW_LINE,FOLLOW_2); 
             after(grammarAccess.getToolsBlockAccess().getNEW_LINETerminalRuleCall_3()); 

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


    // $ANTLR start "rule__ToolsBlock__Group__4"
    // InternalJPCoffe.g:1065:1: rule__ToolsBlock__Group__4 : rule__ToolsBlock__Group__4__Impl rule__ToolsBlock__Group__5 ;
    public final void rule__ToolsBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1069:1: ( rule__ToolsBlock__Group__4__Impl rule__ToolsBlock__Group__5 )
            // InternalJPCoffe.g:1070:2: rule__ToolsBlock__Group__4__Impl rule__ToolsBlock__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ToolsBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToolsBlock__Group__5();

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
    // $ANTLR end "rule__ToolsBlock__Group__4"


    // $ANTLR start "rule__ToolsBlock__Group__4__Impl"
    // InternalJPCoffe.g:1077:1: rule__ToolsBlock__Group__4__Impl : ( ( ruleTool )* ) ;
    public final void rule__ToolsBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1081:1: ( ( ( ruleTool )* ) )
            // InternalJPCoffe.g:1082:1: ( ( ruleTool )* )
            {
            // InternalJPCoffe.g:1082:1: ( ( ruleTool )* )
            // InternalJPCoffe.g:1083:2: ( ruleTool )*
            {
             before(grammarAccess.getToolsBlockAccess().getToolParserRuleCall_4()); 
            // InternalJPCoffe.g:1084:2: ( ruleTool )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJPCoffe.g:1084:3: ruleTool
            	    {
            	    pushFollow(FOLLOW_16);
            	    ruleTool();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getToolsBlockAccess().getToolParserRuleCall_4()); 

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
    // $ANTLR end "rule__ToolsBlock__Group__4__Impl"


    // $ANTLR start "rule__ToolsBlock__Group__5"
    // InternalJPCoffe.g:1092:1: rule__ToolsBlock__Group__5 : rule__ToolsBlock__Group__5__Impl ;
    public final void rule__ToolsBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1096:1: ( rule__ToolsBlock__Group__5__Impl )
            // InternalJPCoffe.g:1097:2: rule__ToolsBlock__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToolsBlock__Group__5__Impl();

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
    // $ANTLR end "rule__ToolsBlock__Group__5"


    // $ANTLR start "rule__ToolsBlock__Group__5__Impl"
    // InternalJPCoffe.g:1103:1: rule__ToolsBlock__Group__5__Impl : ( RULE_NEW_LINE ) ;
    public final void rule__ToolsBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1107:1: ( ( RULE_NEW_LINE ) )
            // InternalJPCoffe.g:1108:1: ( RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:1108:1: ( RULE_NEW_LINE )
            // InternalJPCoffe.g:1109:2: RULE_NEW_LINE
            {
             before(grammarAccess.getToolsBlockAccess().getNEW_LINETerminalRuleCall_5()); 
            match(input,RULE_NEW_LINE,FOLLOW_2); 
             after(grammarAccess.getToolsBlockAccess().getNEW_LINETerminalRuleCall_5()); 

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
    // $ANTLR end "rule__ToolsBlock__Group__5__Impl"


    // $ANTLR start "rule__Tool__Group__0"
    // InternalJPCoffe.g:1119:1: rule__Tool__Group__0 : rule__Tool__Group__0__Impl rule__Tool__Group__1 ;
    public final void rule__Tool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1123:1: ( rule__Tool__Group__0__Impl rule__Tool__Group__1 )
            // InternalJPCoffe.g:1124:2: rule__Tool__Group__0__Impl rule__Tool__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalJPCoffe.g:1131:1: rule__Tool__Group__0__Impl : ( '*' ) ;
    public final void rule__Tool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1135:1: ( ( '*' ) )
            // InternalJPCoffe.g:1136:1: ( '*' )
            {
            // InternalJPCoffe.g:1136:1: ( '*' )
            // InternalJPCoffe.g:1137:2: '*'
            {
             before(grammarAccess.getToolAccess().getAsteriskKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalJPCoffe.g:1146:1: rule__Tool__Group__1 : rule__Tool__Group__1__Impl rule__Tool__Group__2 ;
    public final void rule__Tool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1150:1: ( rule__Tool__Group__1__Impl rule__Tool__Group__2 )
            // InternalJPCoffe.g:1151:2: rule__Tool__Group__1__Impl rule__Tool__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Tool__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tool__Group__2();

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
    // InternalJPCoffe.g:1158:1: rule__Tool__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__Tool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1162:1: ( ( RULE_SPACE ) )
            // InternalJPCoffe.g:1163:1: ( RULE_SPACE )
            {
            // InternalJPCoffe.g:1163:1: ( RULE_SPACE )
            // InternalJPCoffe.g:1164:2: RULE_SPACE
            {
             before(grammarAccess.getToolAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getToolAccess().getSPACETerminalRuleCall_1()); 

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


    // $ANTLR start "rule__Tool__Group__2"
    // InternalJPCoffe.g:1173:1: rule__Tool__Group__2 : rule__Tool__Group__2__Impl rule__Tool__Group__3 ;
    public final void rule__Tool__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1177:1: ( rule__Tool__Group__2__Impl rule__Tool__Group__3 )
            // InternalJPCoffe.g:1178:2: rule__Tool__Group__2__Impl rule__Tool__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Tool__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tool__Group__3();

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
    // $ANTLR end "rule__Tool__Group__2"


    // $ANTLR start "rule__Tool__Group__2__Impl"
    // InternalJPCoffe.g:1185:1: rule__Tool__Group__2__Impl : ( RULE_NAME ) ;
    public final void rule__Tool__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1189:1: ( ( RULE_NAME ) )
            // InternalJPCoffe.g:1190:1: ( RULE_NAME )
            {
            // InternalJPCoffe.g:1190:1: ( RULE_NAME )
            // InternalJPCoffe.g:1191:2: RULE_NAME
            {
             before(grammarAccess.getToolAccess().getNAMETerminalRuleCall_2()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getToolAccess().getNAMETerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Tool__Group__2__Impl"


    // $ANTLR start "rule__Tool__Group__3"
    // InternalJPCoffe.g:1200:1: rule__Tool__Group__3 : rule__Tool__Group__3__Impl ;
    public final void rule__Tool__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1204:1: ( rule__Tool__Group__3__Impl )
            // InternalJPCoffe.g:1205:2: rule__Tool__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tool__Group__3__Impl();

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
    // $ANTLR end "rule__Tool__Group__3"


    // $ANTLR start "rule__Tool__Group__3__Impl"
    // InternalJPCoffe.g:1211:1: rule__Tool__Group__3__Impl : ( RULE_NEW_LINE ) ;
    public final void rule__Tool__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1215:1: ( ( RULE_NEW_LINE ) )
            // InternalJPCoffe.g:1216:1: ( RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:1216:1: ( RULE_NEW_LINE )
            // InternalJPCoffe.g:1217:2: RULE_NEW_LINE
            {
             before(grammarAccess.getToolAccess().getNEW_LINETerminalRuleCall_3()); 
            match(input,RULE_NEW_LINE,FOLLOW_2); 
             after(grammarAccess.getToolAccess().getNEW_LINETerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Tool__Group__3__Impl"


    // $ANTLR start "rule__StepsBlock__Group__0"
    // InternalJPCoffe.g:1227:1: rule__StepsBlock__Group__0 : rule__StepsBlock__Group__0__Impl rule__StepsBlock__Group__1 ;
    public final void rule__StepsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1231:1: ( rule__StepsBlock__Group__0__Impl rule__StepsBlock__Group__1 )
            // InternalJPCoffe.g:1232:2: rule__StepsBlock__Group__0__Impl rule__StepsBlock__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalJPCoffe.g:1239:1: rule__StepsBlock__Group__0__Impl : ( 'Steps' ) ;
    public final void rule__StepsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1243:1: ( ( 'Steps' ) )
            // InternalJPCoffe.g:1244:1: ( 'Steps' )
            {
            // InternalJPCoffe.g:1244:1: ( 'Steps' )
            // InternalJPCoffe.g:1245:2: 'Steps'
            {
             before(grammarAccess.getStepsBlockAccess().getStepsKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStepsBlockAccess().getStepsKeyword_0()); 

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
    // $ANTLR end "rule__StepsBlock__Group__0__Impl"


    // $ANTLR start "rule__StepsBlock__Group__1"
    // InternalJPCoffe.g:1254:1: rule__StepsBlock__Group__1 : rule__StepsBlock__Group__1__Impl rule__StepsBlock__Group__2 ;
    public final void rule__StepsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1258:1: ( rule__StepsBlock__Group__1__Impl rule__StepsBlock__Group__2 )
            // InternalJPCoffe.g:1259:2: rule__StepsBlock__Group__1__Impl rule__StepsBlock__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalJPCoffe.g:1266:1: rule__StepsBlock__Group__1__Impl : ( RULE_NEW_LINE ) ;
    public final void rule__StepsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1270:1: ( ( RULE_NEW_LINE ) )
            // InternalJPCoffe.g:1271:1: ( RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:1271:1: ( RULE_NEW_LINE )
            // InternalJPCoffe.g:1272:2: RULE_NEW_LINE
            {
             before(grammarAccess.getStepsBlockAccess().getNEW_LINETerminalRuleCall_1()); 
            match(input,RULE_NEW_LINE,FOLLOW_2); 
             after(grammarAccess.getStepsBlockAccess().getNEW_LINETerminalRuleCall_1()); 

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
    // InternalJPCoffe.g:1281:1: rule__StepsBlock__Group__2 : rule__StepsBlock__Group__2__Impl rule__StepsBlock__Group__3 ;
    public final void rule__StepsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1285:1: ( rule__StepsBlock__Group__2__Impl rule__StepsBlock__Group__3 )
            // InternalJPCoffe.g:1286:2: rule__StepsBlock__Group__2__Impl rule__StepsBlock__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalJPCoffe.g:1293:1: rule__StepsBlock__Group__2__Impl : ( RULE_TITLE_LINE ) ;
    public final void rule__StepsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1297:1: ( ( RULE_TITLE_LINE ) )
            // InternalJPCoffe.g:1298:1: ( RULE_TITLE_LINE )
            {
            // InternalJPCoffe.g:1298:1: ( RULE_TITLE_LINE )
            // InternalJPCoffe.g:1299:2: RULE_TITLE_LINE
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
    // InternalJPCoffe.g:1308:1: rule__StepsBlock__Group__3 : rule__StepsBlock__Group__3__Impl rule__StepsBlock__Group__4 ;
    public final void rule__StepsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1312:1: ( rule__StepsBlock__Group__3__Impl rule__StepsBlock__Group__4 )
            // InternalJPCoffe.g:1313:2: rule__StepsBlock__Group__3__Impl rule__StepsBlock__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__StepsBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepsBlock__Group__4();

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
    // InternalJPCoffe.g:1320:1: rule__StepsBlock__Group__3__Impl : ( RULE_NEW_LINE ) ;
    public final void rule__StepsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1324:1: ( ( RULE_NEW_LINE ) )
            // InternalJPCoffe.g:1325:1: ( RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:1325:1: ( RULE_NEW_LINE )
            // InternalJPCoffe.g:1326:2: RULE_NEW_LINE
            {
             before(grammarAccess.getStepsBlockAccess().getNEW_LINETerminalRuleCall_3()); 
            match(input,RULE_NEW_LINE,FOLLOW_2); 
             after(grammarAccess.getStepsBlockAccess().getNEW_LINETerminalRuleCall_3()); 

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


    // $ANTLR start "rule__StepsBlock__Group__4"
    // InternalJPCoffe.g:1335:1: rule__StepsBlock__Group__4 : rule__StepsBlock__Group__4__Impl rule__StepsBlock__Group__5 ;
    public final void rule__StepsBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1339:1: ( rule__StepsBlock__Group__4__Impl rule__StepsBlock__Group__5 )
            // InternalJPCoffe.g:1340:2: rule__StepsBlock__Group__4__Impl rule__StepsBlock__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__StepsBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepsBlock__Group__5();

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
    // $ANTLR end "rule__StepsBlock__Group__4"


    // $ANTLR start "rule__StepsBlock__Group__4__Impl"
    // InternalJPCoffe.g:1347:1: rule__StepsBlock__Group__4__Impl : ( ( ruleStep )* ) ;
    public final void rule__StepsBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1351:1: ( ( ( ruleStep )* ) )
            // InternalJPCoffe.g:1352:1: ( ( ruleStep )* )
            {
            // InternalJPCoffe.g:1352:1: ( ( ruleStep )* )
            // InternalJPCoffe.g:1353:2: ( ruleStep )*
            {
             before(grammarAccess.getStepsBlockAccess().getStepParserRuleCall_4()); 
            // InternalJPCoffe.g:1354:2: ( ruleStep )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJPCoffe.g:1354:3: ruleStep
            	    {
            	    pushFollow(FOLLOW_21);
            	    ruleStep();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStepsBlockAccess().getStepParserRuleCall_4()); 

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
    // $ANTLR end "rule__StepsBlock__Group__4__Impl"


    // $ANTLR start "rule__StepsBlock__Group__5"
    // InternalJPCoffe.g:1362:1: rule__StepsBlock__Group__5 : rule__StepsBlock__Group__5__Impl ;
    public final void rule__StepsBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1366:1: ( rule__StepsBlock__Group__5__Impl )
            // InternalJPCoffe.g:1367:2: rule__StepsBlock__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepsBlock__Group__5__Impl();

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
    // $ANTLR end "rule__StepsBlock__Group__5"


    // $ANTLR start "rule__StepsBlock__Group__5__Impl"
    // InternalJPCoffe.g:1373:1: rule__StepsBlock__Group__5__Impl : ( RULE_NEW_LINE ) ;
    public final void rule__StepsBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1377:1: ( ( RULE_NEW_LINE ) )
            // InternalJPCoffe.g:1378:1: ( RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:1378:1: ( RULE_NEW_LINE )
            // InternalJPCoffe.g:1379:2: RULE_NEW_LINE
            {
             before(grammarAccess.getStepsBlockAccess().getNEW_LINETerminalRuleCall_5()); 
            match(input,RULE_NEW_LINE,FOLLOW_2); 
             after(grammarAccess.getStepsBlockAccess().getNEW_LINETerminalRuleCall_5()); 

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
    // $ANTLR end "rule__StepsBlock__Group__5__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // InternalJPCoffe.g:1389:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1393:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalJPCoffe.g:1394:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalJPCoffe.g:1401:1: rule__Step__Group__0__Impl : ( '{' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1405:1: ( ( '{' ) )
            // InternalJPCoffe.g:1406:1: ( '{' )
            {
            // InternalJPCoffe.g:1406:1: ( '{' )
            // InternalJPCoffe.g:1407:2: '{'
            {
             before(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalJPCoffe.g:1416:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1420:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalJPCoffe.g:1421:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalJPCoffe.g:1428:1: rule__Step__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1432:1: ( ( ( RULE_INT )? ) )
            // InternalJPCoffe.g:1433:1: ( ( RULE_INT )? )
            {
            // InternalJPCoffe.g:1433:1: ( ( RULE_INT )? )
            // InternalJPCoffe.g:1434:2: ( RULE_INT )?
            {
             before(grammarAccess.getStepAccess().getINTTerminalRuleCall_1()); 
            // InternalJPCoffe.g:1435:2: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJPCoffe.g:1435:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getStepAccess().getINTTerminalRuleCall_1()); 

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
    // InternalJPCoffe.g:1443:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1447:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalJPCoffe.g:1448:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalJPCoffe.g:1455:1: rule__Step__Group__2__Impl : ( ( rule__Step__Group_2__0 )* ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1459:1: ( ( ( rule__Step__Group_2__0 )* ) )
            // InternalJPCoffe.g:1460:1: ( ( rule__Step__Group_2__0 )* )
            {
            // InternalJPCoffe.g:1460:1: ( ( rule__Step__Group_2__0 )* )
            // InternalJPCoffe.g:1461:2: ( rule__Step__Group_2__0 )*
            {
             before(grammarAccess.getStepAccess().getGroup_2()); 
            // InternalJPCoffe.g:1462:2: ( rule__Step__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJPCoffe.g:1462:3: rule__Step__Group_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Step__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalJPCoffe.g:1470:1: rule__Step__Group__3 : rule__Step__Group__3__Impl rule__Step__Group__4 ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1474:1: ( rule__Step__Group__3__Impl rule__Step__Group__4 )
            // InternalJPCoffe.g:1475:2: rule__Step__Group__3__Impl rule__Step__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalJPCoffe.g:1482:1: rule__Step__Group__3__Impl : ( '}' ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1486:1: ( ( '}' ) )
            // InternalJPCoffe.g:1487:1: ( '}' )
            {
            // InternalJPCoffe.g:1487:1: ( '}' )
            // InternalJPCoffe.g:1488:2: '}'
            {
             before(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalJPCoffe.g:1497:1: rule__Step__Group__4 : rule__Step__Group__4__Impl rule__Step__Group__5 ;
    public final void rule__Step__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1501:1: ( rule__Step__Group__4__Impl rule__Step__Group__5 )
            // InternalJPCoffe.g:1502:2: rule__Step__Group__4__Impl rule__Step__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalJPCoffe.g:1509:1: rule__Step__Group__4__Impl : ( RULE_SPACE ) ;
    public final void rule__Step__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1513:1: ( ( RULE_SPACE ) )
            // InternalJPCoffe.g:1514:1: ( RULE_SPACE )
            {
            // InternalJPCoffe.g:1514:1: ( RULE_SPACE )
            // InternalJPCoffe.g:1515:2: RULE_SPACE
            {
             before(grammarAccess.getStepAccess().getSPACETerminalRuleCall_4()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getSPACETerminalRuleCall_4()); 

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
    // InternalJPCoffe.g:1524:1: rule__Step__Group__5 : rule__Step__Group__5__Impl rule__Step__Group__6 ;
    public final void rule__Step__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1528:1: ( rule__Step__Group__5__Impl rule__Step__Group__6 )
            // InternalJPCoffe.g:1529:2: rule__Step__Group__5__Impl rule__Step__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalJPCoffe.g:1536:1: rule__Step__Group__5__Impl : ( '->' ) ;
    public final void rule__Step__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1540:1: ( ( '->' ) )
            // InternalJPCoffe.g:1541:1: ( '->' )
            {
            // InternalJPCoffe.g:1541:1: ( '->' )
            // InternalJPCoffe.g:1542:2: '->'
            {
             before(grammarAccess.getStepAccess().getHyphenMinusGreaterThanSignKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getHyphenMinusGreaterThanSignKeyword_5()); 

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
    // InternalJPCoffe.g:1551:1: rule__Step__Group__6 : rule__Step__Group__6__Impl rule__Step__Group__7 ;
    public final void rule__Step__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1555:1: ( rule__Step__Group__6__Impl rule__Step__Group__7 )
            // InternalJPCoffe.g:1556:2: rule__Step__Group__6__Impl rule__Step__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalJPCoffe.g:1563:1: rule__Step__Group__6__Impl : ( RULE_SPACE ) ;
    public final void rule__Step__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1567:1: ( ( RULE_SPACE ) )
            // InternalJPCoffe.g:1568:1: ( RULE_SPACE )
            {
            // InternalJPCoffe.g:1568:1: ( RULE_SPACE )
            // InternalJPCoffe.g:1569:2: RULE_SPACE
            {
             before(grammarAccess.getStepAccess().getSPACETerminalRuleCall_6()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getSPACETerminalRuleCall_6()); 

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
    // InternalJPCoffe.g:1578:1: rule__Step__Group__7 : rule__Step__Group__7__Impl rule__Step__Group__8 ;
    public final void rule__Step__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1582:1: ( rule__Step__Group__7__Impl rule__Step__Group__8 )
            // InternalJPCoffe.g:1583:2: rule__Step__Group__7__Impl rule__Step__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Step__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__8();

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
    // InternalJPCoffe.g:1590:1: rule__Step__Group__7__Impl : ( RULE_INT ) ;
    public final void rule__Step__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1594:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:1595:1: ( RULE_INT )
            {
            // InternalJPCoffe.g:1595:1: ( RULE_INT )
            // InternalJPCoffe.g:1596:2: RULE_INT
            {
             before(grammarAccess.getStepAccess().getINTTerminalRuleCall_7()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getINTTerminalRuleCall_7()); 

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


    // $ANTLR start "rule__Step__Group__8"
    // InternalJPCoffe.g:1605:1: rule__Step__Group__8 : rule__Step__Group__8__Impl rule__Step__Group__9 ;
    public final void rule__Step__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1609:1: ( rule__Step__Group__8__Impl rule__Step__Group__9 )
            // InternalJPCoffe.g:1610:2: rule__Step__Group__8__Impl rule__Step__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Step__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__9();

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
    // $ANTLR end "rule__Step__Group__8"


    // $ANTLR start "rule__Step__Group__8__Impl"
    // InternalJPCoffe.g:1617:1: rule__Step__Group__8__Impl : ( '.' ) ;
    public final void rule__Step__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1621:1: ( ( '.' ) )
            // InternalJPCoffe.g:1622:1: ( '.' )
            {
            // InternalJPCoffe.g:1622:1: ( '.' )
            // InternalJPCoffe.g:1623:2: '.'
            {
             before(grammarAccess.getStepAccess().getFullStopKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getFullStopKeyword_8()); 

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
    // $ANTLR end "rule__Step__Group__8__Impl"


    // $ANTLR start "rule__Step__Group__9"
    // InternalJPCoffe.g:1632:1: rule__Step__Group__9 : rule__Step__Group__9__Impl rule__Step__Group__10 ;
    public final void rule__Step__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1636:1: ( rule__Step__Group__9__Impl rule__Step__Group__10 )
            // InternalJPCoffe.g:1637:2: rule__Step__Group__9__Impl rule__Step__Group__10
            {
            pushFollow(FOLLOW_26);
            rule__Step__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__10();

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
    // $ANTLR end "rule__Step__Group__9"


    // $ANTLR start "rule__Step__Group__9__Impl"
    // InternalJPCoffe.g:1644:1: rule__Step__Group__9__Impl : ( RULE_SPACE ) ;
    public final void rule__Step__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1648:1: ( ( RULE_SPACE ) )
            // InternalJPCoffe.g:1649:1: ( RULE_SPACE )
            {
            // InternalJPCoffe.g:1649:1: ( RULE_SPACE )
            // InternalJPCoffe.g:1650:2: RULE_SPACE
            {
             before(grammarAccess.getStepAccess().getSPACETerminalRuleCall_9()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getSPACETerminalRuleCall_9()); 

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
    // $ANTLR end "rule__Step__Group__9__Impl"


    // $ANTLR start "rule__Step__Group__10"
    // InternalJPCoffe.g:1659:1: rule__Step__Group__10 : rule__Step__Group__10__Impl rule__Step__Group__11 ;
    public final void rule__Step__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1663:1: ( rule__Step__Group__10__Impl rule__Step__Group__11 )
            // InternalJPCoffe.g:1664:2: rule__Step__Group__10__Impl rule__Step__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Step__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__11();

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
    // $ANTLR end "rule__Step__Group__10"


    // $ANTLR start "rule__Step__Group__10__Impl"
    // InternalJPCoffe.g:1671:1: rule__Step__Group__10__Impl : ( RULE_TEXT ) ;
    public final void rule__Step__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1675:1: ( ( RULE_TEXT ) )
            // InternalJPCoffe.g:1676:1: ( RULE_TEXT )
            {
            // InternalJPCoffe.g:1676:1: ( RULE_TEXT )
            // InternalJPCoffe.g:1677:2: RULE_TEXT
            {
             before(grammarAccess.getStepAccess().getTEXTTerminalRuleCall_10()); 
            match(input,RULE_TEXT,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getTEXTTerminalRuleCall_10()); 

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
    // $ANTLR end "rule__Step__Group__10__Impl"


    // $ANTLR start "rule__Step__Group__11"
    // InternalJPCoffe.g:1686:1: rule__Step__Group__11 : rule__Step__Group__11__Impl ;
    public final void rule__Step__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1690:1: ( rule__Step__Group__11__Impl )
            // InternalJPCoffe.g:1691:2: rule__Step__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__11__Impl();

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
    // $ANTLR end "rule__Step__Group__11"


    // $ANTLR start "rule__Step__Group__11__Impl"
    // InternalJPCoffe.g:1697:1: rule__Step__Group__11__Impl : ( RULE_NEW_LINE ) ;
    public final void rule__Step__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1701:1: ( ( RULE_NEW_LINE ) )
            // InternalJPCoffe.g:1702:1: ( RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:1702:1: ( RULE_NEW_LINE )
            // InternalJPCoffe.g:1703:2: RULE_NEW_LINE
            {
             before(grammarAccess.getStepAccess().getNEW_LINETerminalRuleCall_11()); 
            match(input,RULE_NEW_LINE,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getNEW_LINETerminalRuleCall_11()); 

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
    // $ANTLR end "rule__Step__Group__11__Impl"


    // $ANTLR start "rule__Step__Group_2__0"
    // InternalJPCoffe.g:1713:1: rule__Step__Group_2__0 : rule__Step__Group_2__0__Impl rule__Step__Group_2__1 ;
    public final void rule__Step__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1717:1: ( rule__Step__Group_2__0__Impl rule__Step__Group_2__1 )
            // InternalJPCoffe.g:1718:2: rule__Step__Group_2__0__Impl rule__Step__Group_2__1
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
    // InternalJPCoffe.g:1725:1: rule__Step__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Step__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1729:1: ( ( ',' ) )
            // InternalJPCoffe.g:1730:1: ( ',' )
            {
            // InternalJPCoffe.g:1730:1: ( ',' )
            // InternalJPCoffe.g:1731:2: ','
            {
             before(grammarAccess.getStepAccess().getCommaKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJPCoffe.g:1740:1: rule__Step__Group_2__1 : rule__Step__Group_2__1__Impl ;
    public final void rule__Step__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1744:1: ( rule__Step__Group_2__1__Impl )
            // InternalJPCoffe.g:1745:2: rule__Step__Group_2__1__Impl
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
    // InternalJPCoffe.g:1751:1: rule__Step__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__Step__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1755:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:1756:1: ( RULE_INT )
            {
            // InternalJPCoffe.g:1756:1: ( RULE_INT )
            // InternalJPCoffe.g:1757:2: RULE_INT
            {
             before(grammarAccess.getStepAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getINTTerminalRuleCall_2_1()); 

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


    // $ANTLR start "rule__Main__RecipesAssignment"
    // InternalJPCoffe.g:1767:1: rule__Main__RecipesAssignment : ( ruleRecipe ) ;
    public final void rule__Main__RecipesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1771:1: ( ( ruleRecipe ) )
            // InternalJPCoffe.g:1772:2: ( ruleRecipe )
            {
            // InternalJPCoffe.g:1772:2: ( ruleRecipe )
            // InternalJPCoffe.g:1773:3: ruleRecipe
            {
             before(grammarAccess.getMainAccess().getRecipesRecipeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getMainAccess().getRecipesRecipeParserRuleCall_0()); 

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
    // $ANTLR end "rule__Main__RecipesAssignment"


    // $ANTLR start "rule__PortionNB__NbAssignment_1"
    // InternalJPCoffe.g:1782:1: rule__PortionNB__NbAssignment_1 : ( RULE_INT ) ;
    public final void rule__PortionNB__NbAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1786:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:1787:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:1787:2: ( RULE_INT )
            // InternalJPCoffe.g:1788:3: RULE_INT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010080200L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000800L});

}