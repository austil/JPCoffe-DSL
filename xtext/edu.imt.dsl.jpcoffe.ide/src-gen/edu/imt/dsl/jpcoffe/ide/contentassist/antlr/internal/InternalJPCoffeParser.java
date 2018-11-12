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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MAJ_WORD", "RULE_WORD", "RULE_INT", "RULE_STRING", "RULE_TITLE_LINE", "RULE_METRIC_UNIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'use'", "'recipe'", "'in'", "'Recipe'", "'{'", "'}'", "'For'", "'people'", "'Ingredients'", "'*'", "'GROUP'", "'['", "']'", "'AS'", "'OR'", "'Tools'", "'Steps'", "'->'", "'.'", "'IF'", "'THEN'", "','"
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
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_MAJ_WORD=4;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_TITLE_LINE=8;
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
    // InternalJPCoffe.g:62:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:66:2: ( ( ( rule__Main__Group__0 ) ) )
            // InternalJPCoffe.g:67:2: ( ( rule__Main__Group__0 ) )
            {
            // InternalJPCoffe.g:67:2: ( ( rule__Main__Group__0 ) )
            // InternalJPCoffe.g:68:3: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // InternalJPCoffe.g:69:3: ( rule__Main__Group__0 )
            // InternalJPCoffe.g:69:4: rule__Main__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

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


    // $ANTLR start "entryRuleImport"
    // InternalJPCoffe.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalJPCoffe.g:79:1: ( ruleImport EOF )
            // InternalJPCoffe.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalJPCoffe.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalJPCoffe.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalJPCoffe.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalJPCoffe.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalJPCoffe.g:94:3: ( rule__Import__Group__0 )
            // InternalJPCoffe.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleRecipe"
    // InternalJPCoffe.g:103:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // InternalJPCoffe.g:104:1: ( ruleRecipe EOF )
            // InternalJPCoffe.g:105:1: ruleRecipe EOF
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
    // InternalJPCoffe.g:112:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:116:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // InternalJPCoffe.g:117:2: ( ( rule__Recipe__Group__0 ) )
            {
            // InternalJPCoffe.g:117:2: ( ( rule__Recipe__Group__0 ) )
            // InternalJPCoffe.g:118:3: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // InternalJPCoffe.g:119:3: ( rule__Recipe__Group__0 )
            // InternalJPCoffe.g:119:4: rule__Recipe__Group__0
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
    // InternalJPCoffe.g:128:1: entryRulePortionNB : rulePortionNB EOF ;
    public final void entryRulePortionNB() throws RecognitionException {
        try {
            // InternalJPCoffe.g:129:1: ( rulePortionNB EOF )
            // InternalJPCoffe.g:130:1: rulePortionNB EOF
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
    // InternalJPCoffe.g:137:1: rulePortionNB : ( ( rule__PortionNB__Group__0 ) ) ;
    public final void rulePortionNB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:141:2: ( ( ( rule__PortionNB__Group__0 ) ) )
            // InternalJPCoffe.g:142:2: ( ( rule__PortionNB__Group__0 ) )
            {
            // InternalJPCoffe.g:142:2: ( ( rule__PortionNB__Group__0 ) )
            // InternalJPCoffe.g:143:3: ( rule__PortionNB__Group__0 )
            {
             before(grammarAccess.getPortionNBAccess().getGroup()); 
            // InternalJPCoffe.g:144:3: ( rule__PortionNB__Group__0 )
            // InternalJPCoffe.g:144:4: rule__PortionNB__Group__0
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
    // InternalJPCoffe.g:153:1: entryRuleIngredientsBlock : ruleIngredientsBlock EOF ;
    public final void entryRuleIngredientsBlock() throws RecognitionException {
        try {
            // InternalJPCoffe.g:154:1: ( ruleIngredientsBlock EOF )
            // InternalJPCoffe.g:155:1: ruleIngredientsBlock EOF
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
    // InternalJPCoffe.g:162:1: ruleIngredientsBlock : ( ( rule__IngredientsBlock__Group__0 ) ) ;
    public final void ruleIngredientsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:166:2: ( ( ( rule__IngredientsBlock__Group__0 ) ) )
            // InternalJPCoffe.g:167:2: ( ( rule__IngredientsBlock__Group__0 ) )
            {
            // InternalJPCoffe.g:167:2: ( ( rule__IngredientsBlock__Group__0 ) )
            // InternalJPCoffe.g:168:3: ( rule__IngredientsBlock__Group__0 )
            {
             before(grammarAccess.getIngredientsBlockAccess().getGroup()); 
            // InternalJPCoffe.g:169:3: ( rule__IngredientsBlock__Group__0 )
            // InternalJPCoffe.g:169:4: rule__IngredientsBlock__Group__0
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


    // $ANTLR start "entryRuleIngredientsGroup"
    // InternalJPCoffe.g:178:1: entryRuleIngredientsGroup : ruleIngredientsGroup EOF ;
    public final void entryRuleIngredientsGroup() throws RecognitionException {
        try {
            // InternalJPCoffe.g:179:1: ( ruleIngredientsGroup EOF )
            // InternalJPCoffe.g:180:1: ruleIngredientsGroup EOF
            {
             before(grammarAccess.getIngredientsGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleIngredientsGroup();

            state._fsp--;

             after(grammarAccess.getIngredientsGroupRule()); 
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
    // $ANTLR end "entryRuleIngredientsGroup"


    // $ANTLR start "ruleIngredientsGroup"
    // InternalJPCoffe.g:187:1: ruleIngredientsGroup : ( ( rule__IngredientsGroup__Group__0 ) ) ;
    public final void ruleIngredientsGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:191:2: ( ( ( rule__IngredientsGroup__Group__0 ) ) )
            // InternalJPCoffe.g:192:2: ( ( rule__IngredientsGroup__Group__0 ) )
            {
            // InternalJPCoffe.g:192:2: ( ( rule__IngredientsGroup__Group__0 ) )
            // InternalJPCoffe.g:193:3: ( rule__IngredientsGroup__Group__0 )
            {
             before(grammarAccess.getIngredientsGroupAccess().getGroup()); 
            // InternalJPCoffe.g:194:3: ( rule__IngredientsGroup__Group__0 )
            // InternalJPCoffe.g:194:4: rule__IngredientsGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IngredientsGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientsGroupAccess().getGroup()); 

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
    // $ANTLR end "ruleIngredientsGroup"


    // $ANTLR start "entryRuleIngredient"
    // InternalJPCoffe.g:203:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // InternalJPCoffe.g:204:1: ( ruleIngredient EOF )
            // InternalJPCoffe.g:205:1: ruleIngredient EOF
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
    // InternalJPCoffe.g:212:1: ruleIngredient : ( ( rule__Ingredient__Group__0 ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:216:2: ( ( ( rule__Ingredient__Group__0 ) ) )
            // InternalJPCoffe.g:217:2: ( ( rule__Ingredient__Group__0 ) )
            {
            // InternalJPCoffe.g:217:2: ( ( rule__Ingredient__Group__0 ) )
            // InternalJPCoffe.g:218:3: ( rule__Ingredient__Group__0 )
            {
             before(grammarAccess.getIngredientAccess().getGroup()); 
            // InternalJPCoffe.g:219:3: ( rule__Ingredient__Group__0 )
            // InternalJPCoffe.g:219:4: rule__Ingredient__Group__0
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
    // InternalJPCoffe.g:228:1: entryRuleQuantity : ruleQuantity EOF ;
    public final void entryRuleQuantity() throws RecognitionException {
        try {
            // InternalJPCoffe.g:229:1: ( ruleQuantity EOF )
            // InternalJPCoffe.g:230:1: ruleQuantity EOF
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
    // InternalJPCoffe.g:237:1: ruleQuantity : ( ( rule__Quantity__Group__0 ) ) ;
    public final void ruleQuantity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:241:2: ( ( ( rule__Quantity__Group__0 ) ) )
            // InternalJPCoffe.g:242:2: ( ( rule__Quantity__Group__0 ) )
            {
            // InternalJPCoffe.g:242:2: ( ( rule__Quantity__Group__0 ) )
            // InternalJPCoffe.g:243:3: ( rule__Quantity__Group__0 )
            {
             before(grammarAccess.getQuantityAccess().getGroup()); 
            // InternalJPCoffe.g:244:3: ( rule__Quantity__Group__0 )
            // InternalJPCoffe.g:244:4: rule__Quantity__Group__0
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
    // InternalJPCoffe.g:253:1: entryRuleToolsBlock : ruleToolsBlock EOF ;
    public final void entryRuleToolsBlock() throws RecognitionException {
        try {
            // InternalJPCoffe.g:254:1: ( ruleToolsBlock EOF )
            // InternalJPCoffe.g:255:1: ruleToolsBlock EOF
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
    // InternalJPCoffe.g:262:1: ruleToolsBlock : ( ( rule__ToolsBlock__Group__0 ) ) ;
    public final void ruleToolsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:266:2: ( ( ( rule__ToolsBlock__Group__0 ) ) )
            // InternalJPCoffe.g:267:2: ( ( rule__ToolsBlock__Group__0 ) )
            {
            // InternalJPCoffe.g:267:2: ( ( rule__ToolsBlock__Group__0 ) )
            // InternalJPCoffe.g:268:3: ( rule__ToolsBlock__Group__0 )
            {
             before(grammarAccess.getToolsBlockAccess().getGroup()); 
            // InternalJPCoffe.g:269:3: ( rule__ToolsBlock__Group__0 )
            // InternalJPCoffe.g:269:4: rule__ToolsBlock__Group__0
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
    // InternalJPCoffe.g:278:1: entryRuleTool : ruleTool EOF ;
    public final void entryRuleTool() throws RecognitionException {
        try {
            // InternalJPCoffe.g:279:1: ( ruleTool EOF )
            // InternalJPCoffe.g:280:1: ruleTool EOF
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
    // InternalJPCoffe.g:287:1: ruleTool : ( ( rule__Tool__Group__0 ) ) ;
    public final void ruleTool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:291:2: ( ( ( rule__Tool__Group__0 ) ) )
            // InternalJPCoffe.g:292:2: ( ( rule__Tool__Group__0 ) )
            {
            // InternalJPCoffe.g:292:2: ( ( rule__Tool__Group__0 ) )
            // InternalJPCoffe.g:293:3: ( rule__Tool__Group__0 )
            {
             before(grammarAccess.getToolAccess().getGroup()); 
            // InternalJPCoffe.g:294:3: ( rule__Tool__Group__0 )
            // InternalJPCoffe.g:294:4: rule__Tool__Group__0
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
    // InternalJPCoffe.g:303:1: entryRuleStepsBlock : ruleStepsBlock EOF ;
    public final void entryRuleStepsBlock() throws RecognitionException {
        try {
            // InternalJPCoffe.g:304:1: ( ruleStepsBlock EOF )
            // InternalJPCoffe.g:305:1: ruleStepsBlock EOF
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
    // InternalJPCoffe.g:312:1: ruleStepsBlock : ( ( rule__StepsBlock__Group__0 ) ) ;
    public final void ruleStepsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:316:2: ( ( ( rule__StepsBlock__Group__0 ) ) )
            // InternalJPCoffe.g:317:2: ( ( rule__StepsBlock__Group__0 ) )
            {
            // InternalJPCoffe.g:317:2: ( ( rule__StepsBlock__Group__0 ) )
            // InternalJPCoffe.g:318:3: ( rule__StepsBlock__Group__0 )
            {
             before(grammarAccess.getStepsBlockAccess().getGroup()); 
            // InternalJPCoffe.g:319:3: ( rule__StepsBlock__Group__0 )
            // InternalJPCoffe.g:319:4: rule__StepsBlock__Group__0
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


    // $ANTLR start "entryRuleConditionalStep"
    // InternalJPCoffe.g:328:1: entryRuleConditionalStep : ruleConditionalStep EOF ;
    public final void entryRuleConditionalStep() throws RecognitionException {
        try {
            // InternalJPCoffe.g:329:1: ( ruleConditionalStep EOF )
            // InternalJPCoffe.g:330:1: ruleConditionalStep EOF
            {
             before(grammarAccess.getConditionalStepRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalStep();

            state._fsp--;

             after(grammarAccess.getConditionalStepRule()); 
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
    // $ANTLR end "entryRuleConditionalStep"


    // $ANTLR start "ruleConditionalStep"
    // InternalJPCoffe.g:337:1: ruleConditionalStep : ( ( rule__ConditionalStep__Group__0 ) ) ;
    public final void ruleConditionalStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:341:2: ( ( ( rule__ConditionalStep__Group__0 ) ) )
            // InternalJPCoffe.g:342:2: ( ( rule__ConditionalStep__Group__0 ) )
            {
            // InternalJPCoffe.g:342:2: ( ( rule__ConditionalStep__Group__0 ) )
            // InternalJPCoffe.g:343:3: ( rule__ConditionalStep__Group__0 )
            {
             before(grammarAccess.getConditionalStepAccess().getGroup()); 
            // InternalJPCoffe.g:344:3: ( rule__ConditionalStep__Group__0 )
            // InternalJPCoffe.g:344:4: rule__ConditionalStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStepAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionalStep"


    // $ANTLR start "entryRuleStep"
    // InternalJPCoffe.g:353:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalJPCoffe.g:354:1: ( ruleStep EOF )
            // InternalJPCoffe.g:355:1: ruleStep EOF
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
    // InternalJPCoffe.g:362:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:366:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalJPCoffe.g:367:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalJPCoffe.g:367:2: ( ( rule__Step__Group__0 ) )
            // InternalJPCoffe.g:368:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalJPCoffe.g:369:3: ( rule__Step__Group__0 )
            // InternalJPCoffe.g:369:4: rule__Step__Group__0
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
    // InternalJPCoffe.g:378:1: entryRuleNAME : ruleNAME EOF ;
    public final void entryRuleNAME() throws RecognitionException {
        try {
            // InternalJPCoffe.g:379:1: ( ruleNAME EOF )
            // InternalJPCoffe.g:380:1: ruleNAME EOF
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
    // InternalJPCoffe.g:387:1: ruleNAME : ( ( rule__NAME__Group__0 ) ) ;
    public final void ruleNAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:391:2: ( ( ( rule__NAME__Group__0 ) ) )
            // InternalJPCoffe.g:392:2: ( ( rule__NAME__Group__0 ) )
            {
            // InternalJPCoffe.g:392:2: ( ( rule__NAME__Group__0 ) )
            // InternalJPCoffe.g:393:3: ( rule__NAME__Group__0 )
            {
             before(grammarAccess.getNAMEAccess().getGroup()); 
            // InternalJPCoffe.g:394:3: ( rule__NAME__Group__0 )
            // InternalJPCoffe.g:394:4: rule__NAME__Group__0
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
    // InternalJPCoffe.g:403:1: entryRuleTEXT : ruleTEXT EOF ;
    public final void entryRuleTEXT() throws RecognitionException {
        try {
            // InternalJPCoffe.g:404:1: ( ruleTEXT EOF )
            // InternalJPCoffe.g:405:1: ruleTEXT EOF
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
    // InternalJPCoffe.g:412:1: ruleTEXT : ( ( ( rule__TEXT__Alternatives ) ) ( ( rule__TEXT__Alternatives )* ) ) ;
    public final void ruleTEXT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:416:2: ( ( ( ( rule__TEXT__Alternatives ) ) ( ( rule__TEXT__Alternatives )* ) ) )
            // InternalJPCoffe.g:417:2: ( ( ( rule__TEXT__Alternatives ) ) ( ( rule__TEXT__Alternatives )* ) )
            {
            // InternalJPCoffe.g:417:2: ( ( ( rule__TEXT__Alternatives ) ) ( ( rule__TEXT__Alternatives )* ) )
            // InternalJPCoffe.g:418:3: ( ( rule__TEXT__Alternatives ) ) ( ( rule__TEXT__Alternatives )* )
            {
            // InternalJPCoffe.g:418:3: ( ( rule__TEXT__Alternatives ) )
            // InternalJPCoffe.g:419:4: ( rule__TEXT__Alternatives )
            {
             before(grammarAccess.getTEXTAccess().getAlternatives()); 
            // InternalJPCoffe.g:420:4: ( rule__TEXT__Alternatives )
            // InternalJPCoffe.g:420:5: rule__TEXT__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__TEXT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTEXTAccess().getAlternatives()); 

            }

            // InternalJPCoffe.g:423:3: ( ( rule__TEXT__Alternatives )* )
            // InternalJPCoffe.g:424:4: ( rule__TEXT__Alternatives )*
            {
             before(grammarAccess.getTEXTAccess().getAlternatives()); 
            // InternalJPCoffe.g:425:4: ( rule__TEXT__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_MAJ_WORD && LA1_0<=RULE_INT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJPCoffe.g:425:5: rule__TEXT__Alternatives
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


    // $ANTLR start "rule__IngredientsBlock__IngredientsListAlternatives_3_0"
    // InternalJPCoffe.g:434:1: rule__IngredientsBlock__IngredientsListAlternatives_3_0 : ( ( ruleIngredientsGroup ) | ( ruleIngredient ) );
    public final void rule__IngredientsBlock__IngredientsListAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:438:1: ( ( ruleIngredientsGroup ) | ( ruleIngredient ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_MAJ_WORD) ) {
                    alt2=2;
                }
                else if ( (LA2_1==23) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJPCoffe.g:439:2: ( ruleIngredientsGroup )
                    {
                    // InternalJPCoffe.g:439:2: ( ruleIngredientsGroup )
                    // InternalJPCoffe.g:440:3: ruleIngredientsGroup
                    {
                     before(grammarAccess.getIngredientsBlockAccess().getIngredientsListIngredientsGroupParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIngredientsGroup();

                    state._fsp--;

                     after(grammarAccess.getIngredientsBlockAccess().getIngredientsListIngredientsGroupParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPCoffe.g:445:2: ( ruleIngredient )
                    {
                    // InternalJPCoffe.g:445:2: ( ruleIngredient )
                    // InternalJPCoffe.g:446:3: ruleIngredient
                    {
                     before(grammarAccess.getIngredientsBlockAccess().getIngredientsListIngredientParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIngredient();

                    state._fsp--;

                     after(grammarAccess.getIngredientsBlockAccess().getIngredientsListIngredientParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__IngredientsBlock__IngredientsListAlternatives_3_0"


    // $ANTLR start "rule__StepsBlock__StepsListAlternatives_3_0"
    // InternalJPCoffe.g:455:1: rule__StepsBlock__StepsListAlternatives_3_0 : ( ( ruleConditionalStep ) | ( ruleStep ) );
    public final void rule__StepsBlock__StepsListAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:459:1: ( ( ruleConditionalStep ) | ( ruleStep ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalJPCoffe.g:460:2: ( ruleConditionalStep )
                    {
                    // InternalJPCoffe.g:460:2: ( ruleConditionalStep )
                    // InternalJPCoffe.g:461:3: ruleConditionalStep
                    {
                     before(grammarAccess.getStepsBlockAccess().getStepsListConditionalStepParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionalStep();

                    state._fsp--;

                     after(grammarAccess.getStepsBlockAccess().getStepsListConditionalStepParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPCoffe.g:466:2: ( ruleStep )
                    {
                    // InternalJPCoffe.g:466:2: ( ruleStep )
                    // InternalJPCoffe.g:467:3: ruleStep
                    {
                     before(grammarAccess.getStepsBlockAccess().getStepsListStepParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStep();

                    state._fsp--;

                     after(grammarAccess.getStepsBlockAccess().getStepsListStepParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__StepsBlock__StepsListAlternatives_3_0"


    // $ANTLR start "rule__TEXT__Alternatives"
    // InternalJPCoffe.g:476:1: rule__TEXT__Alternatives : ( ( RULE_MAJ_WORD ) | ( RULE_WORD ) | ( RULE_INT ) );
    public final void rule__TEXT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:480:1: ( ( RULE_MAJ_WORD ) | ( RULE_WORD ) | ( RULE_INT ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_MAJ_WORD:
                {
                alt4=1;
                }
                break;
            case RULE_WORD:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalJPCoffe.g:481:2: ( RULE_MAJ_WORD )
                    {
                    // InternalJPCoffe.g:481:2: ( RULE_MAJ_WORD )
                    // InternalJPCoffe.g:482:3: RULE_MAJ_WORD
                    {
                     before(grammarAccess.getTEXTAccess().getMAJ_WORDTerminalRuleCall_0()); 
                    match(input,RULE_MAJ_WORD,FOLLOW_2); 
                     after(grammarAccess.getTEXTAccess().getMAJ_WORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJPCoffe.g:487:2: ( RULE_WORD )
                    {
                    // InternalJPCoffe.g:487:2: ( RULE_WORD )
                    // InternalJPCoffe.g:488:3: RULE_WORD
                    {
                     before(grammarAccess.getTEXTAccess().getWORDTerminalRuleCall_1()); 
                    match(input,RULE_WORD,FOLLOW_2); 
                     after(grammarAccess.getTEXTAccess().getWORDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJPCoffe.g:493:2: ( RULE_INT )
                    {
                    // InternalJPCoffe.g:493:2: ( RULE_INT )
                    // InternalJPCoffe.g:494:3: RULE_INT
                    {
                     before(grammarAccess.getTEXTAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getTEXTAccess().getINTTerminalRuleCall_2()); 

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


    // $ANTLR start "rule__Main__Group__0"
    // InternalJPCoffe.g:503:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:507:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalJPCoffe.g:508:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__1();

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
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // InternalJPCoffe.g:515:1: rule__Main__Group__0__Impl : ( ( rule__Main__ImportsAssignment_0 )* ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:519:1: ( ( ( rule__Main__ImportsAssignment_0 )* ) )
            // InternalJPCoffe.g:520:1: ( ( rule__Main__ImportsAssignment_0 )* )
            {
            // InternalJPCoffe.g:520:1: ( ( rule__Main__ImportsAssignment_0 )* )
            // InternalJPCoffe.g:521:2: ( rule__Main__ImportsAssignment_0 )*
            {
             before(grammarAccess.getMainAccess().getImportsAssignment_0()); 
            // InternalJPCoffe.g:522:2: ( rule__Main__ImportsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJPCoffe.g:522:3: rule__Main__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Main__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // InternalJPCoffe.g:530:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:534:1: ( rule__Main__Group__1__Impl )
            // InternalJPCoffe.g:535:2: rule__Main__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__1__Impl();

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
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // InternalJPCoffe.g:541:1: rule__Main__Group__1__Impl : ( ( ( rule__Main__RecipesAssignment_1 ) ) ( ( rule__Main__RecipesAssignment_1 )* ) ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:545:1: ( ( ( ( rule__Main__RecipesAssignment_1 ) ) ( ( rule__Main__RecipesAssignment_1 )* ) ) )
            // InternalJPCoffe.g:546:1: ( ( ( rule__Main__RecipesAssignment_1 ) ) ( ( rule__Main__RecipesAssignment_1 )* ) )
            {
            // InternalJPCoffe.g:546:1: ( ( ( rule__Main__RecipesAssignment_1 ) ) ( ( rule__Main__RecipesAssignment_1 )* ) )
            // InternalJPCoffe.g:547:2: ( ( rule__Main__RecipesAssignment_1 ) ) ( ( rule__Main__RecipesAssignment_1 )* )
            {
            // InternalJPCoffe.g:547:2: ( ( rule__Main__RecipesAssignment_1 ) )
            // InternalJPCoffe.g:548:3: ( rule__Main__RecipesAssignment_1 )
            {
             before(grammarAccess.getMainAccess().getRecipesAssignment_1()); 
            // InternalJPCoffe.g:549:3: ( rule__Main__RecipesAssignment_1 )
            // InternalJPCoffe.g:549:4: rule__Main__RecipesAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__Main__RecipesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getRecipesAssignment_1()); 

            }

            // InternalJPCoffe.g:552:2: ( ( rule__Main__RecipesAssignment_1 )* )
            // InternalJPCoffe.g:553:3: ( rule__Main__RecipesAssignment_1 )*
            {
             before(grammarAccess.getMainAccess().getRecipesAssignment_1()); 
            // InternalJPCoffe.g:554:3: ( rule__Main__RecipesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJPCoffe.g:554:4: rule__Main__RecipesAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Main__RecipesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getRecipesAssignment_1()); 

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
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalJPCoffe.g:564:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:568:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalJPCoffe.g:569:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalJPCoffe.g:576:1: rule__Import__Group__0__Impl : ( 'use' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:580:1: ( ( 'use' ) )
            // InternalJPCoffe.g:581:1: ( 'use' )
            {
            // InternalJPCoffe.g:581:1: ( 'use' )
            // InternalJPCoffe.g:582:2: 'use'
            {
             before(grammarAccess.getImportAccess().getUseKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getUseKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalJPCoffe.g:591:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:595:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalJPCoffe.g:596:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalJPCoffe.g:603:1: rule__Import__Group__1__Impl : ( 'recipe' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:607:1: ( ( 'recipe' ) )
            // InternalJPCoffe.g:608:1: ( 'recipe' )
            {
            // InternalJPCoffe.g:608:1: ( 'recipe' )
            // InternalJPCoffe.g:609:2: 'recipe'
            {
             before(grammarAccess.getImportAccess().getRecipeKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getRecipeKeyword_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalJPCoffe.g:618:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:622:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalJPCoffe.g:623:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Import__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__3();

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
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalJPCoffe.g:630:1: rule__Import__Group__2__Impl : ( ruleNAME ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:634:1: ( ( ruleNAME ) )
            // InternalJPCoffe.g:635:1: ( ruleNAME )
            {
            // InternalJPCoffe.g:635:1: ( ruleNAME )
            // InternalJPCoffe.g:636:2: ruleNAME
            {
             before(grammarAccess.getImportAccess().getNAMEParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getImportAccess().getNAMEParserRuleCall_2()); 

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
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__3"
    // InternalJPCoffe.g:645:1: rule__Import__Group__3 : rule__Import__Group__3__Impl rule__Import__Group__4 ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:649:1: ( rule__Import__Group__3__Impl rule__Import__Group__4 )
            // InternalJPCoffe.g:650:2: rule__Import__Group__3__Impl rule__Import__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Import__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__4();

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
    // $ANTLR end "rule__Import__Group__3"


    // $ANTLR start "rule__Import__Group__3__Impl"
    // InternalJPCoffe.g:657:1: rule__Import__Group__3__Impl : ( 'in' ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:661:1: ( ( 'in' ) )
            // InternalJPCoffe.g:662:1: ( 'in' )
            {
            // InternalJPCoffe.g:662:1: ( 'in' )
            // InternalJPCoffe.g:663:2: 'in'
            {
             before(grammarAccess.getImportAccess().getInKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getInKeyword_3()); 

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
    // $ANTLR end "rule__Import__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__4"
    // InternalJPCoffe.g:672:1: rule__Import__Group__4 : rule__Import__Group__4__Impl ;
    public final void rule__Import__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:676:1: ( rule__Import__Group__4__Impl )
            // InternalJPCoffe.g:677:2: rule__Import__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__4__Impl();

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
    // $ANTLR end "rule__Import__Group__4"


    // $ANTLR start "rule__Import__Group__4__Impl"
    // InternalJPCoffe.g:683:1: rule__Import__Group__4__Impl : ( RULE_STRING ) ;
    public final void rule__Import__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:687:1: ( ( RULE_STRING ) )
            // InternalJPCoffe.g:688:1: ( RULE_STRING )
            {
            // InternalJPCoffe.g:688:1: ( RULE_STRING )
            // InternalJPCoffe.g:689:2: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getSTRINGTerminalRuleCall_4()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getSTRINGTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Import__Group__4__Impl"


    // $ANTLR start "rule__Recipe__Group__0"
    // InternalJPCoffe.g:699:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:703:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // InternalJPCoffe.g:704:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalJPCoffe.g:711:1: rule__Recipe__Group__0__Impl : ( 'Recipe' ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:715:1: ( ( 'Recipe' ) )
            // InternalJPCoffe.g:716:1: ( 'Recipe' )
            {
            // InternalJPCoffe.g:716:1: ( 'Recipe' )
            // InternalJPCoffe.g:717:2: 'Recipe'
            {
             before(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalJPCoffe.g:726:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:730:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // InternalJPCoffe.g:731:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalJPCoffe.g:738:1: rule__Recipe__Group__1__Impl : ( ( rule__Recipe__NameAssignment_1 ) ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:742:1: ( ( ( rule__Recipe__NameAssignment_1 ) ) )
            // InternalJPCoffe.g:743:1: ( ( rule__Recipe__NameAssignment_1 ) )
            {
            // InternalJPCoffe.g:743:1: ( ( rule__Recipe__NameAssignment_1 ) )
            // InternalJPCoffe.g:744:2: ( rule__Recipe__NameAssignment_1 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_1()); 
            // InternalJPCoffe.g:745:2: ( rule__Recipe__NameAssignment_1 )
            // InternalJPCoffe.g:745:3: rule__Recipe__NameAssignment_1
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
    // InternalJPCoffe.g:753:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:757:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // InternalJPCoffe.g:758:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalJPCoffe.g:765:1: rule__Recipe__Group__2__Impl : ( '{' ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:769:1: ( ( '{' ) )
            // InternalJPCoffe.g:770:1: ( '{' )
            {
            // InternalJPCoffe.g:770:1: ( '{' )
            // InternalJPCoffe.g:771:2: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalJPCoffe.g:780:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:784:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // InternalJPCoffe.g:785:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalJPCoffe.g:792:1: rule__Recipe__Group__3__Impl : ( ( rule__Recipe__PortionAssignment_3 ) ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:796:1: ( ( ( rule__Recipe__PortionAssignment_3 ) ) )
            // InternalJPCoffe.g:797:1: ( ( rule__Recipe__PortionAssignment_3 ) )
            {
            // InternalJPCoffe.g:797:1: ( ( rule__Recipe__PortionAssignment_3 ) )
            // InternalJPCoffe.g:798:2: ( rule__Recipe__PortionAssignment_3 )
            {
             before(grammarAccess.getRecipeAccess().getPortionAssignment_3()); 
            // InternalJPCoffe.g:799:2: ( rule__Recipe__PortionAssignment_3 )
            // InternalJPCoffe.g:799:3: rule__Recipe__PortionAssignment_3
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
    // InternalJPCoffe.g:807:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:811:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // InternalJPCoffe.g:812:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalJPCoffe.g:819:1: rule__Recipe__Group__4__Impl : ( ( rule__Recipe__IngredientsAssignment_4 ) ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:823:1: ( ( ( rule__Recipe__IngredientsAssignment_4 ) ) )
            // InternalJPCoffe.g:824:1: ( ( rule__Recipe__IngredientsAssignment_4 ) )
            {
            // InternalJPCoffe.g:824:1: ( ( rule__Recipe__IngredientsAssignment_4 ) )
            // InternalJPCoffe.g:825:2: ( rule__Recipe__IngredientsAssignment_4 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_4()); 
            // InternalJPCoffe.g:826:2: ( rule__Recipe__IngredientsAssignment_4 )
            // InternalJPCoffe.g:826:3: rule__Recipe__IngredientsAssignment_4
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
    // InternalJPCoffe.g:834:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:838:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // InternalJPCoffe.g:839:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalJPCoffe.g:846:1: rule__Recipe__Group__5__Impl : ( ( rule__Recipe__ToolsAssignment_5 ) ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:850:1: ( ( ( rule__Recipe__ToolsAssignment_5 ) ) )
            // InternalJPCoffe.g:851:1: ( ( rule__Recipe__ToolsAssignment_5 ) )
            {
            // InternalJPCoffe.g:851:1: ( ( rule__Recipe__ToolsAssignment_5 ) )
            // InternalJPCoffe.g:852:2: ( rule__Recipe__ToolsAssignment_5 )
            {
             before(grammarAccess.getRecipeAccess().getToolsAssignment_5()); 
            // InternalJPCoffe.g:853:2: ( rule__Recipe__ToolsAssignment_5 )
            // InternalJPCoffe.g:853:3: rule__Recipe__ToolsAssignment_5
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
    // InternalJPCoffe.g:861:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:865:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // InternalJPCoffe.g:866:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalJPCoffe.g:873:1: rule__Recipe__Group__6__Impl : ( ( rule__Recipe__StepsAssignment_6 ) ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:877:1: ( ( ( rule__Recipe__StepsAssignment_6 ) ) )
            // InternalJPCoffe.g:878:1: ( ( rule__Recipe__StepsAssignment_6 ) )
            {
            // InternalJPCoffe.g:878:1: ( ( rule__Recipe__StepsAssignment_6 ) )
            // InternalJPCoffe.g:879:2: ( rule__Recipe__StepsAssignment_6 )
            {
             before(grammarAccess.getRecipeAccess().getStepsAssignment_6()); 
            // InternalJPCoffe.g:880:2: ( rule__Recipe__StepsAssignment_6 )
            // InternalJPCoffe.g:880:3: rule__Recipe__StepsAssignment_6
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
    // InternalJPCoffe.g:888:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:892:1: ( rule__Recipe__Group__7__Impl )
            // InternalJPCoffe.g:893:2: rule__Recipe__Group__7__Impl
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
    // InternalJPCoffe.g:899:1: rule__Recipe__Group__7__Impl : ( '}' ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:903:1: ( ( '}' ) )
            // InternalJPCoffe.g:904:1: ( '}' )
            {
            // InternalJPCoffe.g:904:1: ( '}' )
            // InternalJPCoffe.g:905:2: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
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
    // InternalJPCoffe.g:915:1: rule__PortionNB__Group__0 : rule__PortionNB__Group__0__Impl rule__PortionNB__Group__1 ;
    public final void rule__PortionNB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:919:1: ( rule__PortionNB__Group__0__Impl rule__PortionNB__Group__1 )
            // InternalJPCoffe.g:920:2: rule__PortionNB__Group__0__Impl rule__PortionNB__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalJPCoffe.g:927:1: rule__PortionNB__Group__0__Impl : ( 'For' ) ;
    public final void rule__PortionNB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:931:1: ( ( 'For' ) )
            // InternalJPCoffe.g:932:1: ( 'For' )
            {
            // InternalJPCoffe.g:932:1: ( 'For' )
            // InternalJPCoffe.g:933:2: 'For'
            {
             before(grammarAccess.getPortionNBAccess().getForKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalJPCoffe.g:942:1: rule__PortionNB__Group__1 : rule__PortionNB__Group__1__Impl rule__PortionNB__Group__2 ;
    public final void rule__PortionNB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:946:1: ( rule__PortionNB__Group__1__Impl rule__PortionNB__Group__2 )
            // InternalJPCoffe.g:947:2: rule__PortionNB__Group__1__Impl rule__PortionNB__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalJPCoffe.g:954:1: rule__PortionNB__Group__1__Impl : ( ( rule__PortionNB__NbAssignment_1 ) ) ;
    public final void rule__PortionNB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:958:1: ( ( ( rule__PortionNB__NbAssignment_1 ) ) )
            // InternalJPCoffe.g:959:1: ( ( rule__PortionNB__NbAssignment_1 ) )
            {
            // InternalJPCoffe.g:959:1: ( ( rule__PortionNB__NbAssignment_1 ) )
            // InternalJPCoffe.g:960:2: ( rule__PortionNB__NbAssignment_1 )
            {
             before(grammarAccess.getPortionNBAccess().getNbAssignment_1()); 
            // InternalJPCoffe.g:961:2: ( rule__PortionNB__NbAssignment_1 )
            // InternalJPCoffe.g:961:3: rule__PortionNB__NbAssignment_1
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
    // InternalJPCoffe.g:969:1: rule__PortionNB__Group__2 : rule__PortionNB__Group__2__Impl ;
    public final void rule__PortionNB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:973:1: ( rule__PortionNB__Group__2__Impl )
            // InternalJPCoffe.g:974:2: rule__PortionNB__Group__2__Impl
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
    // InternalJPCoffe.g:980:1: rule__PortionNB__Group__2__Impl : ( ( 'people' )? ) ;
    public final void rule__PortionNB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:984:1: ( ( ( 'people' )? ) )
            // InternalJPCoffe.g:985:1: ( ( 'people' )? )
            {
            // InternalJPCoffe.g:985:1: ( ( 'people' )? )
            // InternalJPCoffe.g:986:2: ( 'people' )?
            {
             before(grammarAccess.getPortionNBAccess().getPeopleKeyword_2()); 
            // InternalJPCoffe.g:987:2: ( 'people' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJPCoffe.g:987:3: 'people'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalJPCoffe.g:996:1: rule__IngredientsBlock__Group__0 : rule__IngredientsBlock__Group__0__Impl rule__IngredientsBlock__Group__1 ;
    public final void rule__IngredientsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1000:1: ( rule__IngredientsBlock__Group__0__Impl rule__IngredientsBlock__Group__1 )
            // InternalJPCoffe.g:1001:2: rule__IngredientsBlock__Group__0__Impl rule__IngredientsBlock__Group__1
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
    // InternalJPCoffe.g:1008:1: rule__IngredientsBlock__Group__0__Impl : ( () ) ;
    public final void rule__IngredientsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1012:1: ( ( () ) )
            // InternalJPCoffe.g:1013:1: ( () )
            {
            // InternalJPCoffe.g:1013:1: ( () )
            // InternalJPCoffe.g:1014:2: ()
            {
             before(grammarAccess.getIngredientsBlockAccess().getIngredientsBlockAction_0()); 
            // InternalJPCoffe.g:1015:2: ()
            // InternalJPCoffe.g:1015:3: 
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
    // InternalJPCoffe.g:1023:1: rule__IngredientsBlock__Group__1 : rule__IngredientsBlock__Group__1__Impl rule__IngredientsBlock__Group__2 ;
    public final void rule__IngredientsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1027:1: ( rule__IngredientsBlock__Group__1__Impl rule__IngredientsBlock__Group__2 )
            // InternalJPCoffe.g:1028:2: rule__IngredientsBlock__Group__1__Impl rule__IngredientsBlock__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalJPCoffe.g:1035:1: rule__IngredientsBlock__Group__1__Impl : ( 'Ingredients' ) ;
    public final void rule__IngredientsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1039:1: ( ( 'Ingredients' ) )
            // InternalJPCoffe.g:1040:1: ( 'Ingredients' )
            {
            // InternalJPCoffe.g:1040:1: ( 'Ingredients' )
            // InternalJPCoffe.g:1041:2: 'Ingredients'
            {
             before(grammarAccess.getIngredientsBlockAccess().getIngredientsKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalJPCoffe.g:1050:1: rule__IngredientsBlock__Group__2 : rule__IngredientsBlock__Group__2__Impl rule__IngredientsBlock__Group__3 ;
    public final void rule__IngredientsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1054:1: ( rule__IngredientsBlock__Group__2__Impl rule__IngredientsBlock__Group__3 )
            // InternalJPCoffe.g:1055:2: rule__IngredientsBlock__Group__2__Impl rule__IngredientsBlock__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalJPCoffe.g:1062:1: rule__IngredientsBlock__Group__2__Impl : ( RULE_TITLE_LINE ) ;
    public final void rule__IngredientsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1066:1: ( ( RULE_TITLE_LINE ) )
            // InternalJPCoffe.g:1067:1: ( RULE_TITLE_LINE )
            {
            // InternalJPCoffe.g:1067:1: ( RULE_TITLE_LINE )
            // InternalJPCoffe.g:1068:2: RULE_TITLE_LINE
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
    // InternalJPCoffe.g:1077:1: rule__IngredientsBlock__Group__3 : rule__IngredientsBlock__Group__3__Impl ;
    public final void rule__IngredientsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1081:1: ( rule__IngredientsBlock__Group__3__Impl )
            // InternalJPCoffe.g:1082:2: rule__IngredientsBlock__Group__3__Impl
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
    // InternalJPCoffe.g:1088:1: rule__IngredientsBlock__Group__3__Impl : ( ( rule__IngredientsBlock__IngredientsListAssignment_3 )* ) ;
    public final void rule__IngredientsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1092:1: ( ( ( rule__IngredientsBlock__IngredientsListAssignment_3 )* ) )
            // InternalJPCoffe.g:1093:1: ( ( rule__IngredientsBlock__IngredientsListAssignment_3 )* )
            {
            // InternalJPCoffe.g:1093:1: ( ( rule__IngredientsBlock__IngredientsListAssignment_3 )* )
            // InternalJPCoffe.g:1094:2: ( rule__IngredientsBlock__IngredientsListAssignment_3 )*
            {
             before(grammarAccess.getIngredientsBlockAccess().getIngredientsListAssignment_3()); 
            // InternalJPCoffe.g:1095:2: ( rule__IngredientsBlock__IngredientsListAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJPCoffe.g:1095:3: rule__IngredientsBlock__IngredientsListAssignment_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__IngredientsBlock__IngredientsListAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "rule__IngredientsGroup__Group__0"
    // InternalJPCoffe.g:1104:1: rule__IngredientsGroup__Group__0 : rule__IngredientsGroup__Group__0__Impl rule__IngredientsGroup__Group__1 ;
    public final void rule__IngredientsGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1108:1: ( rule__IngredientsGroup__Group__0__Impl rule__IngredientsGroup__Group__1 )
            // InternalJPCoffe.g:1109:2: rule__IngredientsGroup__Group__0__Impl rule__IngredientsGroup__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__IngredientsGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngredientsGroup__Group__1();

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
    // $ANTLR end "rule__IngredientsGroup__Group__0"


    // $ANTLR start "rule__IngredientsGroup__Group__0__Impl"
    // InternalJPCoffe.g:1116:1: rule__IngredientsGroup__Group__0__Impl : ( '*' ) ;
    public final void rule__IngredientsGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1120:1: ( ( '*' ) )
            // InternalJPCoffe.g:1121:1: ( '*' )
            {
            // InternalJPCoffe.g:1121:1: ( '*' )
            // InternalJPCoffe.g:1122:2: '*'
            {
             before(grammarAccess.getIngredientsGroupAccess().getAsteriskKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIngredientsGroupAccess().getAsteriskKeyword_0()); 

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
    // $ANTLR end "rule__IngredientsGroup__Group__0__Impl"


    // $ANTLR start "rule__IngredientsGroup__Group__1"
    // InternalJPCoffe.g:1131:1: rule__IngredientsGroup__Group__1 : rule__IngredientsGroup__Group__1__Impl rule__IngredientsGroup__Group__2 ;
    public final void rule__IngredientsGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1135:1: ( rule__IngredientsGroup__Group__1__Impl rule__IngredientsGroup__Group__2 )
            // InternalJPCoffe.g:1136:2: rule__IngredientsGroup__Group__1__Impl rule__IngredientsGroup__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__IngredientsGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngredientsGroup__Group__2();

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
    // $ANTLR end "rule__IngredientsGroup__Group__1"


    // $ANTLR start "rule__IngredientsGroup__Group__1__Impl"
    // InternalJPCoffe.g:1143:1: rule__IngredientsGroup__Group__1__Impl : ( 'GROUP' ) ;
    public final void rule__IngredientsGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1147:1: ( ( 'GROUP' ) )
            // InternalJPCoffe.g:1148:1: ( 'GROUP' )
            {
            // InternalJPCoffe.g:1148:1: ( 'GROUP' )
            // InternalJPCoffe.g:1149:2: 'GROUP'
            {
             before(grammarAccess.getIngredientsGroupAccess().getGROUPKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIngredientsGroupAccess().getGROUPKeyword_1()); 

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
    // $ANTLR end "rule__IngredientsGroup__Group__1__Impl"


    // $ANTLR start "rule__IngredientsGroup__Group__2"
    // InternalJPCoffe.g:1158:1: rule__IngredientsGroup__Group__2 : rule__IngredientsGroup__Group__2__Impl rule__IngredientsGroup__Group__3 ;
    public final void rule__IngredientsGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1162:1: ( rule__IngredientsGroup__Group__2__Impl rule__IngredientsGroup__Group__3 )
            // InternalJPCoffe.g:1163:2: rule__IngredientsGroup__Group__2__Impl rule__IngredientsGroup__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__IngredientsGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngredientsGroup__Group__3();

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
    // $ANTLR end "rule__IngredientsGroup__Group__2"


    // $ANTLR start "rule__IngredientsGroup__Group__2__Impl"
    // InternalJPCoffe.g:1170:1: rule__IngredientsGroup__Group__2__Impl : ( ( rule__IngredientsGroup__NameAssignment_2 ) ) ;
    public final void rule__IngredientsGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1174:1: ( ( ( rule__IngredientsGroup__NameAssignment_2 ) ) )
            // InternalJPCoffe.g:1175:1: ( ( rule__IngredientsGroup__NameAssignment_2 ) )
            {
            // InternalJPCoffe.g:1175:1: ( ( rule__IngredientsGroup__NameAssignment_2 ) )
            // InternalJPCoffe.g:1176:2: ( rule__IngredientsGroup__NameAssignment_2 )
            {
             before(grammarAccess.getIngredientsGroupAccess().getNameAssignment_2()); 
            // InternalJPCoffe.g:1177:2: ( rule__IngredientsGroup__NameAssignment_2 )
            // InternalJPCoffe.g:1177:3: rule__IngredientsGroup__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IngredientsGroup__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIngredientsGroupAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__IngredientsGroup__Group__2__Impl"


    // $ANTLR start "rule__IngredientsGroup__Group__3"
    // InternalJPCoffe.g:1185:1: rule__IngredientsGroup__Group__3 : rule__IngredientsGroup__Group__3__Impl rule__IngredientsGroup__Group__4 ;
    public final void rule__IngredientsGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1189:1: ( rule__IngredientsGroup__Group__3__Impl rule__IngredientsGroup__Group__4 )
            // InternalJPCoffe.g:1190:2: rule__IngredientsGroup__Group__3__Impl rule__IngredientsGroup__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__IngredientsGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngredientsGroup__Group__4();

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
    // $ANTLR end "rule__IngredientsGroup__Group__3"


    // $ANTLR start "rule__IngredientsGroup__Group__3__Impl"
    // InternalJPCoffe.g:1197:1: rule__IngredientsGroup__Group__3__Impl : ( '[' ) ;
    public final void rule__IngredientsGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1201:1: ( ( '[' ) )
            // InternalJPCoffe.g:1202:1: ( '[' )
            {
            // InternalJPCoffe.g:1202:1: ( '[' )
            // InternalJPCoffe.g:1203:2: '['
            {
             before(grammarAccess.getIngredientsGroupAccess().getLeftSquareBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIngredientsGroupAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__IngredientsGroup__Group__3__Impl"


    // $ANTLR start "rule__IngredientsGroup__Group__4"
    // InternalJPCoffe.g:1212:1: rule__IngredientsGroup__Group__4 : rule__IngredientsGroup__Group__4__Impl rule__IngredientsGroup__Group__5 ;
    public final void rule__IngredientsGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1216:1: ( rule__IngredientsGroup__Group__4__Impl rule__IngredientsGroup__Group__5 )
            // InternalJPCoffe.g:1217:2: rule__IngredientsGroup__Group__4__Impl rule__IngredientsGroup__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__IngredientsGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngredientsGroup__Group__5();

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
    // $ANTLR end "rule__IngredientsGroup__Group__4"


    // $ANTLR start "rule__IngredientsGroup__Group__4__Impl"
    // InternalJPCoffe.g:1224:1: rule__IngredientsGroup__Group__4__Impl : ( ( rule__IngredientsGroup__IngredientsListAssignment_4 )* ) ;
    public final void rule__IngredientsGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1228:1: ( ( ( rule__IngredientsGroup__IngredientsListAssignment_4 )* ) )
            // InternalJPCoffe.g:1229:1: ( ( rule__IngredientsGroup__IngredientsListAssignment_4 )* )
            {
            // InternalJPCoffe.g:1229:1: ( ( rule__IngredientsGroup__IngredientsListAssignment_4 )* )
            // InternalJPCoffe.g:1230:2: ( rule__IngredientsGroup__IngredientsListAssignment_4 )*
            {
             before(grammarAccess.getIngredientsGroupAccess().getIngredientsListAssignment_4()); 
            // InternalJPCoffe.g:1231:2: ( rule__IngredientsGroup__IngredientsListAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJPCoffe.g:1231:3: rule__IngredientsGroup__IngredientsListAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__IngredientsGroup__IngredientsListAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getIngredientsGroupAccess().getIngredientsListAssignment_4()); 

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
    // $ANTLR end "rule__IngredientsGroup__Group__4__Impl"


    // $ANTLR start "rule__IngredientsGroup__Group__5"
    // InternalJPCoffe.g:1239:1: rule__IngredientsGroup__Group__5 : rule__IngredientsGroup__Group__5__Impl rule__IngredientsGroup__Group__6 ;
    public final void rule__IngredientsGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1243:1: ( rule__IngredientsGroup__Group__5__Impl rule__IngredientsGroup__Group__6 )
            // InternalJPCoffe.g:1244:2: rule__IngredientsGroup__Group__5__Impl rule__IngredientsGroup__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__IngredientsGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngredientsGroup__Group__6();

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
    // $ANTLR end "rule__IngredientsGroup__Group__5"


    // $ANTLR start "rule__IngredientsGroup__Group__5__Impl"
    // InternalJPCoffe.g:1251:1: rule__IngredientsGroup__Group__5__Impl : ( ']' ) ;
    public final void rule__IngredientsGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1255:1: ( ( ']' ) )
            // InternalJPCoffe.g:1256:1: ( ']' )
            {
            // InternalJPCoffe.g:1256:1: ( ']' )
            // InternalJPCoffe.g:1257:2: ']'
            {
             before(grammarAccess.getIngredientsGroupAccess().getRightSquareBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIngredientsGroupAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__IngredientsGroup__Group__5__Impl"


    // $ANTLR start "rule__IngredientsGroup__Group__6"
    // InternalJPCoffe.g:1266:1: rule__IngredientsGroup__Group__6 : rule__IngredientsGroup__Group__6__Impl ;
    public final void rule__IngredientsGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1270:1: ( rule__IngredientsGroup__Group__6__Impl )
            // InternalJPCoffe.g:1271:2: rule__IngredientsGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IngredientsGroup__Group__6__Impl();

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
    // $ANTLR end "rule__IngredientsGroup__Group__6"


    // $ANTLR start "rule__IngredientsGroup__Group__6__Impl"
    // InternalJPCoffe.g:1277:1: rule__IngredientsGroup__Group__6__Impl : ( ( rule__IngredientsGroup__QuantityAssignment_6 )? ) ;
    public final void rule__IngredientsGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1281:1: ( ( ( rule__IngredientsGroup__QuantityAssignment_6 )? ) )
            // InternalJPCoffe.g:1282:1: ( ( rule__IngredientsGroup__QuantityAssignment_6 )? )
            {
            // InternalJPCoffe.g:1282:1: ( ( rule__IngredientsGroup__QuantityAssignment_6 )? )
            // InternalJPCoffe.g:1283:2: ( rule__IngredientsGroup__QuantityAssignment_6 )?
            {
             before(grammarAccess.getIngredientsGroupAccess().getQuantityAssignment_6()); 
            // InternalJPCoffe.g:1284:2: ( rule__IngredientsGroup__QuantityAssignment_6 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJPCoffe.g:1284:3: rule__IngredientsGroup__QuantityAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__IngredientsGroup__QuantityAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredientsGroupAccess().getQuantityAssignment_6()); 

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
    // $ANTLR end "rule__IngredientsGroup__Group__6__Impl"


    // $ANTLR start "rule__Ingredient__Group__0"
    // InternalJPCoffe.g:1293:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1297:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // InternalJPCoffe.g:1298:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalJPCoffe.g:1305:1: rule__Ingredient__Group__0__Impl : ( '*' ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1309:1: ( ( '*' ) )
            // InternalJPCoffe.g:1310:1: ( '*' )
            {
            // InternalJPCoffe.g:1310:1: ( '*' )
            // InternalJPCoffe.g:1311:2: '*'
            {
             before(grammarAccess.getIngredientAccess().getAsteriskKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalJPCoffe.g:1320:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1324:1: ( rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 )
            // InternalJPCoffe.g:1325:2: rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalJPCoffe.g:1332:1: rule__Ingredient__Group__1__Impl : ( ( rule__Ingredient__Group_1__0 )? ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1336:1: ( ( ( rule__Ingredient__Group_1__0 )? ) )
            // InternalJPCoffe.g:1337:1: ( ( rule__Ingredient__Group_1__0 )? )
            {
            // InternalJPCoffe.g:1337:1: ( ( rule__Ingredient__Group_1__0 )? )
            // InternalJPCoffe.g:1338:2: ( rule__Ingredient__Group_1__0 )?
            {
             before(grammarAccess.getIngredientAccess().getGroup_1()); 
            // InternalJPCoffe.g:1339:2: ( rule__Ingredient__Group_1__0 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalJPCoffe.g:1339:3: rule__Ingredient__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredient__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredientAccess().getGroup_1()); 

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
    // InternalJPCoffe.g:1347:1: rule__Ingredient__Group__2 : rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 ;
    public final void rule__Ingredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1351:1: ( rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 )
            // InternalJPCoffe.g:1352:2: rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalJPCoffe.g:1359:1: rule__Ingredient__Group__2__Impl : ( ( rule__Ingredient__NameAssignment_2 ) ) ;
    public final void rule__Ingredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1363:1: ( ( ( rule__Ingredient__NameAssignment_2 ) ) )
            // InternalJPCoffe.g:1364:1: ( ( rule__Ingredient__NameAssignment_2 ) )
            {
            // InternalJPCoffe.g:1364:1: ( ( rule__Ingredient__NameAssignment_2 ) )
            // InternalJPCoffe.g:1365:2: ( rule__Ingredient__NameAssignment_2 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_2()); 
            // InternalJPCoffe.g:1366:2: ( rule__Ingredient__NameAssignment_2 )
            // InternalJPCoffe.g:1366:3: rule__Ingredient__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNameAssignment_2()); 

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
    // InternalJPCoffe.g:1374:1: rule__Ingredient__Group__3 : rule__Ingredient__Group__3__Impl ;
    public final void rule__Ingredient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1378:1: ( rule__Ingredient__Group__3__Impl )
            // InternalJPCoffe.g:1379:2: rule__Ingredient__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__3__Impl();

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
    // InternalJPCoffe.g:1385:1: rule__Ingredient__Group__3__Impl : ( ( rule__Ingredient__QuantityAssignment_3 )? ) ;
    public final void rule__Ingredient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1389:1: ( ( ( rule__Ingredient__QuantityAssignment_3 )? ) )
            // InternalJPCoffe.g:1390:1: ( ( rule__Ingredient__QuantityAssignment_3 )? )
            {
            // InternalJPCoffe.g:1390:1: ( ( rule__Ingredient__QuantityAssignment_3 )? )
            // InternalJPCoffe.g:1391:2: ( rule__Ingredient__QuantityAssignment_3 )?
            {
             before(grammarAccess.getIngredientAccess().getQuantityAssignment_3()); 
            // InternalJPCoffe.g:1392:2: ( rule__Ingredient__QuantityAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJPCoffe.g:1392:3: rule__Ingredient__QuantityAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredient__QuantityAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredientAccess().getQuantityAssignment_3()); 

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


    // $ANTLR start "rule__Ingredient__Group_1__0"
    // InternalJPCoffe.g:1401:1: rule__Ingredient__Group_1__0 : rule__Ingredient__Group_1__0__Impl rule__Ingredient__Group_1__1 ;
    public final void rule__Ingredient__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1405:1: ( rule__Ingredient__Group_1__0__Impl rule__Ingredient__Group_1__1 )
            // InternalJPCoffe.g:1406:2: rule__Ingredient__Group_1__0__Impl rule__Ingredient__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Ingredient__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_1__1();

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
    // $ANTLR end "rule__Ingredient__Group_1__0"


    // $ANTLR start "rule__Ingredient__Group_1__0__Impl"
    // InternalJPCoffe.g:1413:1: rule__Ingredient__Group_1__0__Impl : ( ( rule__Ingredient__OriginalNameAssignment_1_0 ) ) ;
    public final void rule__Ingredient__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1417:1: ( ( ( rule__Ingredient__OriginalNameAssignment_1_0 ) ) )
            // InternalJPCoffe.g:1418:1: ( ( rule__Ingredient__OriginalNameAssignment_1_0 ) )
            {
            // InternalJPCoffe.g:1418:1: ( ( rule__Ingredient__OriginalNameAssignment_1_0 ) )
            // InternalJPCoffe.g:1419:2: ( rule__Ingredient__OriginalNameAssignment_1_0 )
            {
             before(grammarAccess.getIngredientAccess().getOriginalNameAssignment_1_0()); 
            // InternalJPCoffe.g:1420:2: ( rule__Ingredient__OriginalNameAssignment_1_0 )
            // InternalJPCoffe.g:1420:3: rule__Ingredient__OriginalNameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__OriginalNameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getOriginalNameAssignment_1_0()); 

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
    // $ANTLR end "rule__Ingredient__Group_1__0__Impl"


    // $ANTLR start "rule__Ingredient__Group_1__1"
    // InternalJPCoffe.g:1428:1: rule__Ingredient__Group_1__1 : rule__Ingredient__Group_1__1__Impl rule__Ingredient__Group_1__2 ;
    public final void rule__Ingredient__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1432:1: ( rule__Ingredient__Group_1__1__Impl rule__Ingredient__Group_1__2 )
            // InternalJPCoffe.g:1433:2: rule__Ingredient__Group_1__1__Impl rule__Ingredient__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__Ingredient__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_1__2();

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
    // $ANTLR end "rule__Ingredient__Group_1__1"


    // $ANTLR start "rule__Ingredient__Group_1__1__Impl"
    // InternalJPCoffe.g:1440:1: rule__Ingredient__Group_1__1__Impl : ( ( rule__Ingredient__Group_1_1__0 )* ) ;
    public final void rule__Ingredient__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1444:1: ( ( ( rule__Ingredient__Group_1_1__0 )* ) )
            // InternalJPCoffe.g:1445:1: ( ( rule__Ingredient__Group_1_1__0 )* )
            {
            // InternalJPCoffe.g:1445:1: ( ( rule__Ingredient__Group_1_1__0 )* )
            // InternalJPCoffe.g:1446:2: ( rule__Ingredient__Group_1_1__0 )*
            {
             before(grammarAccess.getIngredientAccess().getGroup_1_1()); 
            // InternalJPCoffe.g:1447:2: ( rule__Ingredient__Group_1_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJPCoffe.g:1447:3: rule__Ingredient__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Ingredient__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getIngredientAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Ingredient__Group_1__1__Impl"


    // $ANTLR start "rule__Ingredient__Group_1__2"
    // InternalJPCoffe.g:1455:1: rule__Ingredient__Group_1__2 : rule__Ingredient__Group_1__2__Impl ;
    public final void rule__Ingredient__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1459:1: ( rule__Ingredient__Group_1__2__Impl )
            // InternalJPCoffe.g:1460:2: rule__Ingredient__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_1__2__Impl();

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
    // $ANTLR end "rule__Ingredient__Group_1__2"


    // $ANTLR start "rule__Ingredient__Group_1__2__Impl"
    // InternalJPCoffe.g:1466:1: rule__Ingredient__Group_1__2__Impl : ( 'AS' ) ;
    public final void rule__Ingredient__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1470:1: ( ( 'AS' ) )
            // InternalJPCoffe.g:1471:1: ( 'AS' )
            {
            // InternalJPCoffe.g:1471:1: ( 'AS' )
            // InternalJPCoffe.g:1472:2: 'AS'
            {
             before(grammarAccess.getIngredientAccess().getASKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getASKeyword_1_2()); 

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
    // $ANTLR end "rule__Ingredient__Group_1__2__Impl"


    // $ANTLR start "rule__Ingredient__Group_1_1__0"
    // InternalJPCoffe.g:1482:1: rule__Ingredient__Group_1_1__0 : rule__Ingredient__Group_1_1__0__Impl rule__Ingredient__Group_1_1__1 ;
    public final void rule__Ingredient__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1486:1: ( rule__Ingredient__Group_1_1__0__Impl rule__Ingredient__Group_1_1__1 )
            // InternalJPCoffe.g:1487:2: rule__Ingredient__Group_1_1__0__Impl rule__Ingredient__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Ingredient__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_1_1__1();

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
    // $ANTLR end "rule__Ingredient__Group_1_1__0"


    // $ANTLR start "rule__Ingredient__Group_1_1__0__Impl"
    // InternalJPCoffe.g:1494:1: rule__Ingredient__Group_1_1__0__Impl : ( 'OR' ) ;
    public final void rule__Ingredient__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1498:1: ( ( 'OR' ) )
            // InternalJPCoffe.g:1499:1: ( 'OR' )
            {
            // InternalJPCoffe.g:1499:1: ( 'OR' )
            // InternalJPCoffe.g:1500:2: 'OR'
            {
             before(grammarAccess.getIngredientAccess().getORKeyword_1_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getORKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Ingredient__Group_1_1__0__Impl"


    // $ANTLR start "rule__Ingredient__Group_1_1__1"
    // InternalJPCoffe.g:1509:1: rule__Ingredient__Group_1_1__1 : rule__Ingredient__Group_1_1__1__Impl ;
    public final void rule__Ingredient__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1513:1: ( rule__Ingredient__Group_1_1__1__Impl )
            // InternalJPCoffe.g:1514:2: rule__Ingredient__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Ingredient__Group_1_1__1"


    // $ANTLR start "rule__Ingredient__Group_1_1__1__Impl"
    // InternalJPCoffe.g:1520:1: rule__Ingredient__Group_1_1__1__Impl : ( ( rule__Ingredient__OriginalNameAssignment_1_1_1 ) ) ;
    public final void rule__Ingredient__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1524:1: ( ( ( rule__Ingredient__OriginalNameAssignment_1_1_1 ) ) )
            // InternalJPCoffe.g:1525:1: ( ( rule__Ingredient__OriginalNameAssignment_1_1_1 ) )
            {
            // InternalJPCoffe.g:1525:1: ( ( rule__Ingredient__OriginalNameAssignment_1_1_1 ) )
            // InternalJPCoffe.g:1526:2: ( rule__Ingredient__OriginalNameAssignment_1_1_1 )
            {
             before(grammarAccess.getIngredientAccess().getOriginalNameAssignment_1_1_1()); 
            // InternalJPCoffe.g:1527:2: ( rule__Ingredient__OriginalNameAssignment_1_1_1 )
            // InternalJPCoffe.g:1527:3: rule__Ingredient__OriginalNameAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__OriginalNameAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getOriginalNameAssignment_1_1_1()); 

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
    // $ANTLR end "rule__Ingredient__Group_1_1__1__Impl"


    // $ANTLR start "rule__Quantity__Group__0"
    // InternalJPCoffe.g:1536:1: rule__Quantity__Group__0 : rule__Quantity__Group__0__Impl rule__Quantity__Group__1 ;
    public final void rule__Quantity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1540:1: ( rule__Quantity__Group__0__Impl rule__Quantity__Group__1 )
            // InternalJPCoffe.g:1541:2: rule__Quantity__Group__0__Impl rule__Quantity__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalJPCoffe.g:1548:1: rule__Quantity__Group__0__Impl : ( ( rule__Quantity__AmountAssignment_0 ) ) ;
    public final void rule__Quantity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1552:1: ( ( ( rule__Quantity__AmountAssignment_0 ) ) )
            // InternalJPCoffe.g:1553:1: ( ( rule__Quantity__AmountAssignment_0 ) )
            {
            // InternalJPCoffe.g:1553:1: ( ( rule__Quantity__AmountAssignment_0 ) )
            // InternalJPCoffe.g:1554:2: ( rule__Quantity__AmountAssignment_0 )
            {
             before(grammarAccess.getQuantityAccess().getAmountAssignment_0()); 
            // InternalJPCoffe.g:1555:2: ( rule__Quantity__AmountAssignment_0 )
            // InternalJPCoffe.g:1555:3: rule__Quantity__AmountAssignment_0
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
    // InternalJPCoffe.g:1563:1: rule__Quantity__Group__1 : rule__Quantity__Group__1__Impl ;
    public final void rule__Quantity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1567:1: ( rule__Quantity__Group__1__Impl )
            // InternalJPCoffe.g:1568:2: rule__Quantity__Group__1__Impl
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
    // InternalJPCoffe.g:1574:1: rule__Quantity__Group__1__Impl : ( ( rule__Quantity__UnitAssignment_1 )? ) ;
    public final void rule__Quantity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1578:1: ( ( ( rule__Quantity__UnitAssignment_1 )? ) )
            // InternalJPCoffe.g:1579:1: ( ( rule__Quantity__UnitAssignment_1 )? )
            {
            // InternalJPCoffe.g:1579:1: ( ( rule__Quantity__UnitAssignment_1 )? )
            // InternalJPCoffe.g:1580:2: ( rule__Quantity__UnitAssignment_1 )?
            {
             before(grammarAccess.getQuantityAccess().getUnitAssignment_1()); 
            // InternalJPCoffe.g:1581:2: ( rule__Quantity__UnitAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_METRIC_UNIT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJPCoffe.g:1581:3: rule__Quantity__UnitAssignment_1
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
    // InternalJPCoffe.g:1590:1: rule__ToolsBlock__Group__0 : rule__ToolsBlock__Group__0__Impl rule__ToolsBlock__Group__1 ;
    public final void rule__ToolsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1594:1: ( rule__ToolsBlock__Group__0__Impl rule__ToolsBlock__Group__1 )
            // InternalJPCoffe.g:1595:2: rule__ToolsBlock__Group__0__Impl rule__ToolsBlock__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalJPCoffe.g:1602:1: rule__ToolsBlock__Group__0__Impl : ( () ) ;
    public final void rule__ToolsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1606:1: ( ( () ) )
            // InternalJPCoffe.g:1607:1: ( () )
            {
            // InternalJPCoffe.g:1607:1: ( () )
            // InternalJPCoffe.g:1608:2: ()
            {
             before(grammarAccess.getToolsBlockAccess().getToolsBlockAction_0()); 
            // InternalJPCoffe.g:1609:2: ()
            // InternalJPCoffe.g:1609:3: 
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
    // InternalJPCoffe.g:1617:1: rule__ToolsBlock__Group__1 : rule__ToolsBlock__Group__1__Impl rule__ToolsBlock__Group__2 ;
    public final void rule__ToolsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1621:1: ( rule__ToolsBlock__Group__1__Impl rule__ToolsBlock__Group__2 )
            // InternalJPCoffe.g:1622:2: rule__ToolsBlock__Group__1__Impl rule__ToolsBlock__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalJPCoffe.g:1629:1: rule__ToolsBlock__Group__1__Impl : ( 'Tools' ) ;
    public final void rule__ToolsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1633:1: ( ( 'Tools' ) )
            // InternalJPCoffe.g:1634:1: ( 'Tools' )
            {
            // InternalJPCoffe.g:1634:1: ( 'Tools' )
            // InternalJPCoffe.g:1635:2: 'Tools'
            {
             before(grammarAccess.getToolsBlockAccess().getToolsKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJPCoffe.g:1644:1: rule__ToolsBlock__Group__2 : rule__ToolsBlock__Group__2__Impl rule__ToolsBlock__Group__3 ;
    public final void rule__ToolsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1648:1: ( rule__ToolsBlock__Group__2__Impl rule__ToolsBlock__Group__3 )
            // InternalJPCoffe.g:1649:2: rule__ToolsBlock__Group__2__Impl rule__ToolsBlock__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalJPCoffe.g:1656:1: rule__ToolsBlock__Group__2__Impl : ( RULE_TITLE_LINE ) ;
    public final void rule__ToolsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1660:1: ( ( RULE_TITLE_LINE ) )
            // InternalJPCoffe.g:1661:1: ( RULE_TITLE_LINE )
            {
            // InternalJPCoffe.g:1661:1: ( RULE_TITLE_LINE )
            // InternalJPCoffe.g:1662:2: RULE_TITLE_LINE
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
    // InternalJPCoffe.g:1671:1: rule__ToolsBlock__Group__3 : rule__ToolsBlock__Group__3__Impl ;
    public final void rule__ToolsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1675:1: ( rule__ToolsBlock__Group__3__Impl )
            // InternalJPCoffe.g:1676:2: rule__ToolsBlock__Group__3__Impl
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
    // InternalJPCoffe.g:1682:1: rule__ToolsBlock__Group__3__Impl : ( ( rule__ToolsBlock__ToolsListAssignment_3 )* ) ;
    public final void rule__ToolsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1686:1: ( ( ( rule__ToolsBlock__ToolsListAssignment_3 )* ) )
            // InternalJPCoffe.g:1687:1: ( ( rule__ToolsBlock__ToolsListAssignment_3 )* )
            {
            // InternalJPCoffe.g:1687:1: ( ( rule__ToolsBlock__ToolsListAssignment_3 )* )
            // InternalJPCoffe.g:1688:2: ( rule__ToolsBlock__ToolsListAssignment_3 )*
            {
             before(grammarAccess.getToolsBlockAccess().getToolsListAssignment_3()); 
            // InternalJPCoffe.g:1689:2: ( rule__ToolsBlock__ToolsListAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJPCoffe.g:1689:3: rule__ToolsBlock__ToolsListAssignment_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ToolsBlock__ToolsListAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalJPCoffe.g:1698:1: rule__Tool__Group__0 : rule__Tool__Group__0__Impl rule__Tool__Group__1 ;
    public final void rule__Tool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1702:1: ( rule__Tool__Group__0__Impl rule__Tool__Group__1 )
            // InternalJPCoffe.g:1703:2: rule__Tool__Group__0__Impl rule__Tool__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalJPCoffe.g:1710:1: rule__Tool__Group__0__Impl : ( '*' ) ;
    public final void rule__Tool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1714:1: ( ( '*' ) )
            // InternalJPCoffe.g:1715:1: ( '*' )
            {
            // InternalJPCoffe.g:1715:1: ( '*' )
            // InternalJPCoffe.g:1716:2: '*'
            {
             before(grammarAccess.getToolAccess().getAsteriskKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalJPCoffe.g:1725:1: rule__Tool__Group__1 : rule__Tool__Group__1__Impl rule__Tool__Group__2 ;
    public final void rule__Tool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1729:1: ( rule__Tool__Group__1__Impl rule__Tool__Group__2 )
            // InternalJPCoffe.g:1730:2: rule__Tool__Group__1__Impl rule__Tool__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalJPCoffe.g:1737:1: rule__Tool__Group__1__Impl : ( ( rule__Tool__Group_1__0 )? ) ;
    public final void rule__Tool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1741:1: ( ( ( rule__Tool__Group_1__0 )? ) )
            // InternalJPCoffe.g:1742:1: ( ( rule__Tool__Group_1__0 )? )
            {
            // InternalJPCoffe.g:1742:1: ( ( rule__Tool__Group_1__0 )? )
            // InternalJPCoffe.g:1743:2: ( rule__Tool__Group_1__0 )?
            {
             before(grammarAccess.getToolAccess().getGroup_1()); 
            // InternalJPCoffe.g:1744:2: ( rule__Tool__Group_1__0 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalJPCoffe.g:1744:3: rule__Tool__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tool__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getToolAccess().getGroup_1()); 

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
    // InternalJPCoffe.g:1752:1: rule__Tool__Group__2 : rule__Tool__Group__2__Impl ;
    public final void rule__Tool__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1756:1: ( rule__Tool__Group__2__Impl )
            // InternalJPCoffe.g:1757:2: rule__Tool__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tool__Group__2__Impl();

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
    // InternalJPCoffe.g:1763:1: rule__Tool__Group__2__Impl : ( ( rule__Tool__NameAssignment_2 ) ) ;
    public final void rule__Tool__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1767:1: ( ( ( rule__Tool__NameAssignment_2 ) ) )
            // InternalJPCoffe.g:1768:1: ( ( rule__Tool__NameAssignment_2 ) )
            {
            // InternalJPCoffe.g:1768:1: ( ( rule__Tool__NameAssignment_2 ) )
            // InternalJPCoffe.g:1769:2: ( rule__Tool__NameAssignment_2 )
            {
             before(grammarAccess.getToolAccess().getNameAssignment_2()); 
            // InternalJPCoffe.g:1770:2: ( rule__Tool__NameAssignment_2 )
            // InternalJPCoffe.g:1770:3: rule__Tool__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Tool__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getToolAccess().getNameAssignment_2()); 

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


    // $ANTLR start "rule__Tool__Group_1__0"
    // InternalJPCoffe.g:1779:1: rule__Tool__Group_1__0 : rule__Tool__Group_1__0__Impl rule__Tool__Group_1__1 ;
    public final void rule__Tool__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1783:1: ( rule__Tool__Group_1__0__Impl rule__Tool__Group_1__1 )
            // InternalJPCoffe.g:1784:2: rule__Tool__Group_1__0__Impl rule__Tool__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Tool__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tool__Group_1__1();

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
    // $ANTLR end "rule__Tool__Group_1__0"


    // $ANTLR start "rule__Tool__Group_1__0__Impl"
    // InternalJPCoffe.g:1791:1: rule__Tool__Group_1__0__Impl : ( ( rule__Tool__OriginalNameAssignment_1_0 ) ) ;
    public final void rule__Tool__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1795:1: ( ( ( rule__Tool__OriginalNameAssignment_1_0 ) ) )
            // InternalJPCoffe.g:1796:1: ( ( rule__Tool__OriginalNameAssignment_1_0 ) )
            {
            // InternalJPCoffe.g:1796:1: ( ( rule__Tool__OriginalNameAssignment_1_0 ) )
            // InternalJPCoffe.g:1797:2: ( rule__Tool__OriginalNameAssignment_1_0 )
            {
             before(grammarAccess.getToolAccess().getOriginalNameAssignment_1_0()); 
            // InternalJPCoffe.g:1798:2: ( rule__Tool__OriginalNameAssignment_1_0 )
            // InternalJPCoffe.g:1798:3: rule__Tool__OriginalNameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Tool__OriginalNameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getToolAccess().getOriginalNameAssignment_1_0()); 

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
    // $ANTLR end "rule__Tool__Group_1__0__Impl"


    // $ANTLR start "rule__Tool__Group_1__1"
    // InternalJPCoffe.g:1806:1: rule__Tool__Group_1__1 : rule__Tool__Group_1__1__Impl ;
    public final void rule__Tool__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1810:1: ( rule__Tool__Group_1__1__Impl )
            // InternalJPCoffe.g:1811:2: rule__Tool__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tool__Group_1__1__Impl();

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
    // $ANTLR end "rule__Tool__Group_1__1"


    // $ANTLR start "rule__Tool__Group_1__1__Impl"
    // InternalJPCoffe.g:1817:1: rule__Tool__Group_1__1__Impl : ( 'AS' ) ;
    public final void rule__Tool__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1821:1: ( ( 'AS' ) )
            // InternalJPCoffe.g:1822:1: ( 'AS' )
            {
            // InternalJPCoffe.g:1822:1: ( 'AS' )
            // InternalJPCoffe.g:1823:2: 'AS'
            {
             before(grammarAccess.getToolAccess().getASKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getToolAccess().getASKeyword_1_1()); 

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
    // $ANTLR end "rule__Tool__Group_1__1__Impl"


    // $ANTLR start "rule__StepsBlock__Group__0"
    // InternalJPCoffe.g:1833:1: rule__StepsBlock__Group__0 : rule__StepsBlock__Group__0__Impl rule__StepsBlock__Group__1 ;
    public final void rule__StepsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1837:1: ( rule__StepsBlock__Group__0__Impl rule__StepsBlock__Group__1 )
            // InternalJPCoffe.g:1838:2: rule__StepsBlock__Group__0__Impl rule__StepsBlock__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalJPCoffe.g:1845:1: rule__StepsBlock__Group__0__Impl : ( () ) ;
    public final void rule__StepsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1849:1: ( ( () ) )
            // InternalJPCoffe.g:1850:1: ( () )
            {
            // InternalJPCoffe.g:1850:1: ( () )
            // InternalJPCoffe.g:1851:2: ()
            {
             before(grammarAccess.getStepsBlockAccess().getStepsBlockAction_0()); 
            // InternalJPCoffe.g:1852:2: ()
            // InternalJPCoffe.g:1852:3: 
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
    // InternalJPCoffe.g:1860:1: rule__StepsBlock__Group__1 : rule__StepsBlock__Group__1__Impl rule__StepsBlock__Group__2 ;
    public final void rule__StepsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1864:1: ( rule__StepsBlock__Group__1__Impl rule__StepsBlock__Group__2 )
            // InternalJPCoffe.g:1865:2: rule__StepsBlock__Group__1__Impl rule__StepsBlock__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalJPCoffe.g:1872:1: rule__StepsBlock__Group__1__Impl : ( 'Steps' ) ;
    public final void rule__StepsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1876:1: ( ( 'Steps' ) )
            // InternalJPCoffe.g:1877:1: ( 'Steps' )
            {
            // InternalJPCoffe.g:1877:1: ( 'Steps' )
            // InternalJPCoffe.g:1878:2: 'Steps'
            {
             before(grammarAccess.getStepsBlockAccess().getStepsKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalJPCoffe.g:1887:1: rule__StepsBlock__Group__2 : rule__StepsBlock__Group__2__Impl rule__StepsBlock__Group__3 ;
    public final void rule__StepsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1891:1: ( rule__StepsBlock__Group__2__Impl rule__StepsBlock__Group__3 )
            // InternalJPCoffe.g:1892:2: rule__StepsBlock__Group__2__Impl rule__StepsBlock__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalJPCoffe.g:1899:1: rule__StepsBlock__Group__2__Impl : ( RULE_TITLE_LINE ) ;
    public final void rule__StepsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1903:1: ( ( RULE_TITLE_LINE ) )
            // InternalJPCoffe.g:1904:1: ( RULE_TITLE_LINE )
            {
            // InternalJPCoffe.g:1904:1: ( RULE_TITLE_LINE )
            // InternalJPCoffe.g:1905:2: RULE_TITLE_LINE
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
    // InternalJPCoffe.g:1914:1: rule__StepsBlock__Group__3 : rule__StepsBlock__Group__3__Impl ;
    public final void rule__StepsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1918:1: ( rule__StepsBlock__Group__3__Impl )
            // InternalJPCoffe.g:1919:2: rule__StepsBlock__Group__3__Impl
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
    // InternalJPCoffe.g:1925:1: rule__StepsBlock__Group__3__Impl : ( ( rule__StepsBlock__StepsListAssignment_3 )* ) ;
    public final void rule__StepsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1929:1: ( ( ( rule__StepsBlock__StepsListAssignment_3 )* ) )
            // InternalJPCoffe.g:1930:1: ( ( rule__StepsBlock__StepsListAssignment_3 )* )
            {
            // InternalJPCoffe.g:1930:1: ( ( rule__StepsBlock__StepsListAssignment_3 )* )
            // InternalJPCoffe.g:1931:2: ( rule__StepsBlock__StepsListAssignment_3 )*
            {
             before(grammarAccess.getStepsBlockAccess().getStepsListAssignment_3()); 
            // InternalJPCoffe.g:1932:2: ( rule__StepsBlock__StepsListAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJPCoffe.g:1932:3: rule__StepsBlock__StepsListAssignment_3
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__StepsBlock__StepsListAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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


    // $ANTLR start "rule__ConditionalStep__Group__0"
    // InternalJPCoffe.g:1941:1: rule__ConditionalStep__Group__0 : rule__ConditionalStep__Group__0__Impl rule__ConditionalStep__Group__1 ;
    public final void rule__ConditionalStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1945:1: ( rule__ConditionalStep__Group__0__Impl rule__ConditionalStep__Group__1 )
            // InternalJPCoffe.g:1946:2: rule__ConditionalStep__Group__0__Impl rule__ConditionalStep__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ConditionalStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group__1();

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
    // $ANTLR end "rule__ConditionalStep__Group__0"


    // $ANTLR start "rule__ConditionalStep__Group__0__Impl"
    // InternalJPCoffe.g:1953:1: rule__ConditionalStep__Group__0__Impl : ( '{' ) ;
    public final void rule__ConditionalStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1957:1: ( ( '{' ) )
            // InternalJPCoffe.g:1958:1: ( '{' )
            {
            // InternalJPCoffe.g:1958:1: ( '{' )
            // InternalJPCoffe.g:1959:2: '{'
            {
             before(grammarAccess.getConditionalStepAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConditionalStepAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__ConditionalStep__Group__0__Impl"


    // $ANTLR start "rule__ConditionalStep__Group__1"
    // InternalJPCoffe.g:1968:1: rule__ConditionalStep__Group__1 : rule__ConditionalStep__Group__1__Impl rule__ConditionalStep__Group__2 ;
    public final void rule__ConditionalStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1972:1: ( rule__ConditionalStep__Group__1__Impl rule__ConditionalStep__Group__2 )
            // InternalJPCoffe.g:1973:2: rule__ConditionalStep__Group__1__Impl rule__ConditionalStep__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__ConditionalStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group__2();

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
    // $ANTLR end "rule__ConditionalStep__Group__1"


    // $ANTLR start "rule__ConditionalStep__Group__1__Impl"
    // InternalJPCoffe.g:1980:1: rule__ConditionalStep__Group__1__Impl : ( ( rule__ConditionalStep__PredAssignment_1 )? ) ;
    public final void rule__ConditionalStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1984:1: ( ( ( rule__ConditionalStep__PredAssignment_1 )? ) )
            // InternalJPCoffe.g:1985:1: ( ( rule__ConditionalStep__PredAssignment_1 )? )
            {
            // InternalJPCoffe.g:1985:1: ( ( rule__ConditionalStep__PredAssignment_1 )? )
            // InternalJPCoffe.g:1986:2: ( rule__ConditionalStep__PredAssignment_1 )?
            {
             before(grammarAccess.getConditionalStepAccess().getPredAssignment_1()); 
            // InternalJPCoffe.g:1987:2: ( rule__ConditionalStep__PredAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJPCoffe.g:1987:3: rule__ConditionalStep__PredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionalStep__PredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionalStepAccess().getPredAssignment_1()); 

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
    // $ANTLR end "rule__ConditionalStep__Group__1__Impl"


    // $ANTLR start "rule__ConditionalStep__Group__2"
    // InternalJPCoffe.g:1995:1: rule__ConditionalStep__Group__2 : rule__ConditionalStep__Group__2__Impl rule__ConditionalStep__Group__3 ;
    public final void rule__ConditionalStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:1999:1: ( rule__ConditionalStep__Group__2__Impl rule__ConditionalStep__Group__3 )
            // InternalJPCoffe.g:2000:2: rule__ConditionalStep__Group__2__Impl rule__ConditionalStep__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__ConditionalStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group__3();

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
    // $ANTLR end "rule__ConditionalStep__Group__2"


    // $ANTLR start "rule__ConditionalStep__Group__2__Impl"
    // InternalJPCoffe.g:2007:1: rule__ConditionalStep__Group__2__Impl : ( ( rule__ConditionalStep__Group_2__0 )* ) ;
    public final void rule__ConditionalStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2011:1: ( ( ( rule__ConditionalStep__Group_2__0 )* ) )
            // InternalJPCoffe.g:2012:1: ( ( rule__ConditionalStep__Group_2__0 )* )
            {
            // InternalJPCoffe.g:2012:1: ( ( rule__ConditionalStep__Group_2__0 )* )
            // InternalJPCoffe.g:2013:2: ( rule__ConditionalStep__Group_2__0 )*
            {
             before(grammarAccess.getConditionalStepAccess().getGroup_2()); 
            // InternalJPCoffe.g:2014:2: ( rule__ConditionalStep__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalJPCoffe.g:2014:3: rule__ConditionalStep__Group_2__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__ConditionalStep__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getConditionalStepAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ConditionalStep__Group__2__Impl"


    // $ANTLR start "rule__ConditionalStep__Group__3"
    // InternalJPCoffe.g:2022:1: rule__ConditionalStep__Group__3 : rule__ConditionalStep__Group__3__Impl rule__ConditionalStep__Group__4 ;
    public final void rule__ConditionalStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2026:1: ( rule__ConditionalStep__Group__3__Impl rule__ConditionalStep__Group__4 )
            // InternalJPCoffe.g:2027:2: rule__ConditionalStep__Group__3__Impl rule__ConditionalStep__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__ConditionalStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group__4();

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
    // $ANTLR end "rule__ConditionalStep__Group__3"


    // $ANTLR start "rule__ConditionalStep__Group__3__Impl"
    // InternalJPCoffe.g:2034:1: rule__ConditionalStep__Group__3__Impl : ( '}' ) ;
    public final void rule__ConditionalStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2038:1: ( ( '}' ) )
            // InternalJPCoffe.g:2039:1: ( '}' )
            {
            // InternalJPCoffe.g:2039:1: ( '}' )
            // InternalJPCoffe.g:2040:2: '}'
            {
             before(grammarAccess.getConditionalStepAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConditionalStepAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ConditionalStep__Group__3__Impl"


    // $ANTLR start "rule__ConditionalStep__Group__4"
    // InternalJPCoffe.g:2049:1: rule__ConditionalStep__Group__4 : rule__ConditionalStep__Group__4__Impl rule__ConditionalStep__Group__5 ;
    public final void rule__ConditionalStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2053:1: ( rule__ConditionalStep__Group__4__Impl rule__ConditionalStep__Group__5 )
            // InternalJPCoffe.g:2054:2: rule__ConditionalStep__Group__4__Impl rule__ConditionalStep__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__ConditionalStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group__5();

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
    // $ANTLR end "rule__ConditionalStep__Group__4"


    // $ANTLR start "rule__ConditionalStep__Group__4__Impl"
    // InternalJPCoffe.g:2061:1: rule__ConditionalStep__Group__4__Impl : ( '->' ) ;
    public final void rule__ConditionalStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2065:1: ( ( '->' ) )
            // InternalJPCoffe.g:2066:1: ( '->' )
            {
            // InternalJPCoffe.g:2066:1: ( '->' )
            // InternalJPCoffe.g:2067:2: '->'
            {
             before(grammarAccess.getConditionalStepAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConditionalStepAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

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
    // $ANTLR end "rule__ConditionalStep__Group__4__Impl"


    // $ANTLR start "rule__ConditionalStep__Group__5"
    // InternalJPCoffe.g:2076:1: rule__ConditionalStep__Group__5 : rule__ConditionalStep__Group__5__Impl rule__ConditionalStep__Group__6 ;
    public final void rule__ConditionalStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2080:1: ( rule__ConditionalStep__Group__5__Impl rule__ConditionalStep__Group__6 )
            // InternalJPCoffe.g:2081:2: rule__ConditionalStep__Group__5__Impl rule__ConditionalStep__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__ConditionalStep__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group__6();

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
    // $ANTLR end "rule__ConditionalStep__Group__5"


    // $ANTLR start "rule__ConditionalStep__Group__5__Impl"
    // InternalJPCoffe.g:2088:1: rule__ConditionalStep__Group__5__Impl : ( ( rule__ConditionalStep__NumAssignment_5 ) ) ;
    public final void rule__ConditionalStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2092:1: ( ( ( rule__ConditionalStep__NumAssignment_5 ) ) )
            // InternalJPCoffe.g:2093:1: ( ( rule__ConditionalStep__NumAssignment_5 ) )
            {
            // InternalJPCoffe.g:2093:1: ( ( rule__ConditionalStep__NumAssignment_5 ) )
            // InternalJPCoffe.g:2094:2: ( rule__ConditionalStep__NumAssignment_5 )
            {
             before(grammarAccess.getConditionalStepAccess().getNumAssignment_5()); 
            // InternalJPCoffe.g:2095:2: ( rule__ConditionalStep__NumAssignment_5 )
            // InternalJPCoffe.g:2095:3: rule__ConditionalStep__NumAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalStep__NumAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStepAccess().getNumAssignment_5()); 

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
    // $ANTLR end "rule__ConditionalStep__Group__5__Impl"


    // $ANTLR start "rule__ConditionalStep__Group__6"
    // InternalJPCoffe.g:2103:1: rule__ConditionalStep__Group__6 : rule__ConditionalStep__Group__6__Impl rule__ConditionalStep__Group__7 ;
    public final void rule__ConditionalStep__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2107:1: ( rule__ConditionalStep__Group__6__Impl rule__ConditionalStep__Group__7 )
            // InternalJPCoffe.g:2108:2: rule__ConditionalStep__Group__6__Impl rule__ConditionalStep__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__ConditionalStep__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group__7();

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
    // $ANTLR end "rule__ConditionalStep__Group__6"


    // $ANTLR start "rule__ConditionalStep__Group__6__Impl"
    // InternalJPCoffe.g:2115:1: rule__ConditionalStep__Group__6__Impl : ( '.' ) ;
    public final void rule__ConditionalStep__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2119:1: ( ( '.' ) )
            // InternalJPCoffe.g:2120:1: ( '.' )
            {
            // InternalJPCoffe.g:2120:1: ( '.' )
            // InternalJPCoffe.g:2121:2: '.'
            {
             before(grammarAccess.getConditionalStepAccess().getFullStopKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConditionalStepAccess().getFullStopKeyword_6()); 

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
    // $ANTLR end "rule__ConditionalStep__Group__6__Impl"


    // $ANTLR start "rule__ConditionalStep__Group__7"
    // InternalJPCoffe.g:2130:1: rule__ConditionalStep__Group__7 : rule__ConditionalStep__Group__7__Impl rule__ConditionalStep__Group__8 ;
    public final void rule__ConditionalStep__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2134:1: ( rule__ConditionalStep__Group__7__Impl rule__ConditionalStep__Group__8 )
            // InternalJPCoffe.g:2135:2: rule__ConditionalStep__Group__7__Impl rule__ConditionalStep__Group__8
            {
            pushFollow(FOLLOW_35);
            rule__ConditionalStep__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group__8();

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
    // $ANTLR end "rule__ConditionalStep__Group__7"


    // $ANTLR start "rule__ConditionalStep__Group__7__Impl"
    // InternalJPCoffe.g:2142:1: rule__ConditionalStep__Group__7__Impl : ( 'IF' ) ;
    public final void rule__ConditionalStep__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2146:1: ( ( 'IF' ) )
            // InternalJPCoffe.g:2147:1: ( 'IF' )
            {
            // InternalJPCoffe.g:2147:1: ( 'IF' )
            // InternalJPCoffe.g:2148:2: 'IF'
            {
             before(grammarAccess.getConditionalStepAccess().getIFKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConditionalStepAccess().getIFKeyword_7()); 

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
    // $ANTLR end "rule__ConditionalStep__Group__7__Impl"


    // $ANTLR start "rule__ConditionalStep__Group__8"
    // InternalJPCoffe.g:2157:1: rule__ConditionalStep__Group__8 : rule__ConditionalStep__Group__8__Impl rule__ConditionalStep__Group__9 ;
    public final void rule__ConditionalStep__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2161:1: ( rule__ConditionalStep__Group__8__Impl rule__ConditionalStep__Group__9 )
            // InternalJPCoffe.g:2162:2: rule__ConditionalStep__Group__8__Impl rule__ConditionalStep__Group__9
            {
            pushFollow(FOLLOW_36);
            rule__ConditionalStep__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group__9();

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
    // $ANTLR end "rule__ConditionalStep__Group__8"


    // $ANTLR start "rule__ConditionalStep__Group__8__Impl"
    // InternalJPCoffe.g:2169:1: rule__ConditionalStep__Group__8__Impl : ( ( rule__ConditionalStep__ConditionAssignment_8 ) ) ;
    public final void rule__ConditionalStep__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2173:1: ( ( ( rule__ConditionalStep__ConditionAssignment_8 ) ) )
            // InternalJPCoffe.g:2174:1: ( ( rule__ConditionalStep__ConditionAssignment_8 ) )
            {
            // InternalJPCoffe.g:2174:1: ( ( rule__ConditionalStep__ConditionAssignment_8 ) )
            // InternalJPCoffe.g:2175:2: ( rule__ConditionalStep__ConditionAssignment_8 )
            {
             before(grammarAccess.getConditionalStepAccess().getConditionAssignment_8()); 
            // InternalJPCoffe.g:2176:2: ( rule__ConditionalStep__ConditionAssignment_8 )
            // InternalJPCoffe.g:2176:3: rule__ConditionalStep__ConditionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalStep__ConditionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStepAccess().getConditionAssignment_8()); 

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
    // $ANTLR end "rule__ConditionalStep__Group__8__Impl"


    // $ANTLR start "rule__ConditionalStep__Group__9"
    // InternalJPCoffe.g:2184:1: rule__ConditionalStep__Group__9 : rule__ConditionalStep__Group__9__Impl rule__ConditionalStep__Group__10 ;
    public final void rule__ConditionalStep__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2188:1: ( rule__ConditionalStep__Group__9__Impl rule__ConditionalStep__Group__10 )
            // InternalJPCoffe.g:2189:2: rule__ConditionalStep__Group__9__Impl rule__ConditionalStep__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__ConditionalStep__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group__10();

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
    // $ANTLR end "rule__ConditionalStep__Group__9"


    // $ANTLR start "rule__ConditionalStep__Group__9__Impl"
    // InternalJPCoffe.g:2196:1: rule__ConditionalStep__Group__9__Impl : ( 'THEN' ) ;
    public final void rule__ConditionalStep__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2200:1: ( ( 'THEN' ) )
            // InternalJPCoffe.g:2201:1: ( 'THEN' )
            {
            // InternalJPCoffe.g:2201:1: ( 'THEN' )
            // InternalJPCoffe.g:2202:2: 'THEN'
            {
             before(grammarAccess.getConditionalStepAccess().getTHENKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConditionalStepAccess().getTHENKeyword_9()); 

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
    // $ANTLR end "rule__ConditionalStep__Group__9__Impl"


    // $ANTLR start "rule__ConditionalStep__Group__10"
    // InternalJPCoffe.g:2211:1: rule__ConditionalStep__Group__10 : rule__ConditionalStep__Group__10__Impl ;
    public final void rule__ConditionalStep__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2215:1: ( rule__ConditionalStep__Group__10__Impl )
            // InternalJPCoffe.g:2216:2: rule__ConditionalStep__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group__10__Impl();

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
    // $ANTLR end "rule__ConditionalStep__Group__10"


    // $ANTLR start "rule__ConditionalStep__Group__10__Impl"
    // InternalJPCoffe.g:2222:1: rule__ConditionalStep__Group__10__Impl : ( ( rule__ConditionalStep__ToAssignment_10 ) ) ;
    public final void rule__ConditionalStep__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2226:1: ( ( ( rule__ConditionalStep__ToAssignment_10 ) ) )
            // InternalJPCoffe.g:2227:1: ( ( rule__ConditionalStep__ToAssignment_10 ) )
            {
            // InternalJPCoffe.g:2227:1: ( ( rule__ConditionalStep__ToAssignment_10 ) )
            // InternalJPCoffe.g:2228:2: ( rule__ConditionalStep__ToAssignment_10 )
            {
             before(grammarAccess.getConditionalStepAccess().getToAssignment_10()); 
            // InternalJPCoffe.g:2229:2: ( rule__ConditionalStep__ToAssignment_10 )
            // InternalJPCoffe.g:2229:3: rule__ConditionalStep__ToAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalStep__ToAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStepAccess().getToAssignment_10()); 

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
    // $ANTLR end "rule__ConditionalStep__Group__10__Impl"


    // $ANTLR start "rule__ConditionalStep__Group_2__0"
    // InternalJPCoffe.g:2238:1: rule__ConditionalStep__Group_2__0 : rule__ConditionalStep__Group_2__0__Impl rule__ConditionalStep__Group_2__1 ;
    public final void rule__ConditionalStep__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2242:1: ( rule__ConditionalStep__Group_2__0__Impl rule__ConditionalStep__Group_2__1 )
            // InternalJPCoffe.g:2243:2: rule__ConditionalStep__Group_2__0__Impl rule__ConditionalStep__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__ConditionalStep__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group_2__1();

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
    // $ANTLR end "rule__ConditionalStep__Group_2__0"


    // $ANTLR start "rule__ConditionalStep__Group_2__0__Impl"
    // InternalJPCoffe.g:2250:1: rule__ConditionalStep__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ConditionalStep__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2254:1: ( ( ',' ) )
            // InternalJPCoffe.g:2255:1: ( ',' )
            {
            // InternalJPCoffe.g:2255:1: ( ',' )
            // InternalJPCoffe.g:2256:2: ','
            {
             before(grammarAccess.getConditionalStepAccess().getCommaKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConditionalStepAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__ConditionalStep__Group_2__0__Impl"


    // $ANTLR start "rule__ConditionalStep__Group_2__1"
    // InternalJPCoffe.g:2265:1: rule__ConditionalStep__Group_2__1 : rule__ConditionalStep__Group_2__1__Impl ;
    public final void rule__ConditionalStep__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2269:1: ( rule__ConditionalStep__Group_2__1__Impl )
            // InternalJPCoffe.g:2270:2: rule__ConditionalStep__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalStep__Group_2__1__Impl();

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
    // $ANTLR end "rule__ConditionalStep__Group_2__1"


    // $ANTLR start "rule__ConditionalStep__Group_2__1__Impl"
    // InternalJPCoffe.g:2276:1: rule__ConditionalStep__Group_2__1__Impl : ( ( rule__ConditionalStep__PredAssignment_2_1 ) ) ;
    public final void rule__ConditionalStep__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2280:1: ( ( ( rule__ConditionalStep__PredAssignment_2_1 ) ) )
            // InternalJPCoffe.g:2281:1: ( ( rule__ConditionalStep__PredAssignment_2_1 ) )
            {
            // InternalJPCoffe.g:2281:1: ( ( rule__ConditionalStep__PredAssignment_2_1 ) )
            // InternalJPCoffe.g:2282:2: ( rule__ConditionalStep__PredAssignment_2_1 )
            {
             before(grammarAccess.getConditionalStepAccess().getPredAssignment_2_1()); 
            // InternalJPCoffe.g:2283:2: ( rule__ConditionalStep__PredAssignment_2_1 )
            // InternalJPCoffe.g:2283:3: rule__ConditionalStep__PredAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalStep__PredAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStepAccess().getPredAssignment_2_1()); 

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
    // $ANTLR end "rule__ConditionalStep__Group_2__1__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // InternalJPCoffe.g:2292:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2296:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalJPCoffe.g:2297:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalJPCoffe.g:2304:1: rule__Step__Group__0__Impl : ( '{' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2308:1: ( ( '{' ) )
            // InternalJPCoffe.g:2309:1: ( '{' )
            {
            // InternalJPCoffe.g:2309:1: ( '{' )
            // InternalJPCoffe.g:2310:2: '{'
            {
             before(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalJPCoffe.g:2319:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2323:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalJPCoffe.g:2324:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalJPCoffe.g:2331:1: rule__Step__Group__1__Impl : ( ( rule__Step__PredAssignment_1 )? ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2335:1: ( ( ( rule__Step__PredAssignment_1 )? ) )
            // InternalJPCoffe.g:2336:1: ( ( rule__Step__PredAssignment_1 )? )
            {
            // InternalJPCoffe.g:2336:1: ( ( rule__Step__PredAssignment_1 )? )
            // InternalJPCoffe.g:2337:2: ( rule__Step__PredAssignment_1 )?
            {
             before(grammarAccess.getStepAccess().getPredAssignment_1()); 
            // InternalJPCoffe.g:2338:2: ( rule__Step__PredAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJPCoffe.g:2338:3: rule__Step__PredAssignment_1
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
    // InternalJPCoffe.g:2346:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2350:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalJPCoffe.g:2351:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalJPCoffe.g:2358:1: rule__Step__Group__2__Impl : ( ( rule__Step__Group_2__0 )* ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2362:1: ( ( ( rule__Step__Group_2__0 )* ) )
            // InternalJPCoffe.g:2363:1: ( ( rule__Step__Group_2__0 )* )
            {
            // InternalJPCoffe.g:2363:1: ( ( rule__Step__Group_2__0 )* )
            // InternalJPCoffe.g:2364:2: ( rule__Step__Group_2__0 )*
            {
             before(grammarAccess.getStepAccess().getGroup_2()); 
            // InternalJPCoffe.g:2365:2: ( rule__Step__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalJPCoffe.g:2365:3: rule__Step__Group_2__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Step__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalJPCoffe.g:2373:1: rule__Step__Group__3 : rule__Step__Group__3__Impl rule__Step__Group__4 ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2377:1: ( rule__Step__Group__3__Impl rule__Step__Group__4 )
            // InternalJPCoffe.g:2378:2: rule__Step__Group__3__Impl rule__Step__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalJPCoffe.g:2385:1: rule__Step__Group__3__Impl : ( '}' ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2389:1: ( ( '}' ) )
            // InternalJPCoffe.g:2390:1: ( '}' )
            {
            // InternalJPCoffe.g:2390:1: ( '}' )
            // InternalJPCoffe.g:2391:2: '}'
            {
             before(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalJPCoffe.g:2400:1: rule__Step__Group__4 : rule__Step__Group__4__Impl rule__Step__Group__5 ;
    public final void rule__Step__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2404:1: ( rule__Step__Group__4__Impl rule__Step__Group__5 )
            // InternalJPCoffe.g:2405:2: rule__Step__Group__4__Impl rule__Step__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalJPCoffe.g:2412:1: rule__Step__Group__4__Impl : ( '->' ) ;
    public final void rule__Step__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2416:1: ( ( '->' ) )
            // InternalJPCoffe.g:2417:1: ( '->' )
            {
            // InternalJPCoffe.g:2417:1: ( '->' )
            // InternalJPCoffe.g:2418:2: '->'
            {
             before(grammarAccess.getStepAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalJPCoffe.g:2427:1: rule__Step__Group__5 : rule__Step__Group__5__Impl rule__Step__Group__6 ;
    public final void rule__Step__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2431:1: ( rule__Step__Group__5__Impl rule__Step__Group__6 )
            // InternalJPCoffe.g:2432:2: rule__Step__Group__5__Impl rule__Step__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalJPCoffe.g:2439:1: rule__Step__Group__5__Impl : ( ( rule__Step__NumAssignment_5 ) ) ;
    public final void rule__Step__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2443:1: ( ( ( rule__Step__NumAssignment_5 ) ) )
            // InternalJPCoffe.g:2444:1: ( ( rule__Step__NumAssignment_5 ) )
            {
            // InternalJPCoffe.g:2444:1: ( ( rule__Step__NumAssignment_5 ) )
            // InternalJPCoffe.g:2445:2: ( rule__Step__NumAssignment_5 )
            {
             before(grammarAccess.getStepAccess().getNumAssignment_5()); 
            // InternalJPCoffe.g:2446:2: ( rule__Step__NumAssignment_5 )
            // InternalJPCoffe.g:2446:3: rule__Step__NumAssignment_5
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
    // InternalJPCoffe.g:2454:1: rule__Step__Group__6 : rule__Step__Group__6__Impl rule__Step__Group__7 ;
    public final void rule__Step__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2458:1: ( rule__Step__Group__6__Impl rule__Step__Group__7 )
            // InternalJPCoffe.g:2459:2: rule__Step__Group__6__Impl rule__Step__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalJPCoffe.g:2466:1: rule__Step__Group__6__Impl : ( '.' ) ;
    public final void rule__Step__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2470:1: ( ( '.' ) )
            // InternalJPCoffe.g:2471:1: ( '.' )
            {
            // InternalJPCoffe.g:2471:1: ( '.' )
            // InternalJPCoffe.g:2472:2: '.'
            {
             before(grammarAccess.getStepAccess().getFullStopKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalJPCoffe.g:2481:1: rule__Step__Group__7 : rule__Step__Group__7__Impl ;
    public final void rule__Step__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2485:1: ( rule__Step__Group__7__Impl )
            // InternalJPCoffe.g:2486:2: rule__Step__Group__7__Impl
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
    // InternalJPCoffe.g:2492:1: rule__Step__Group__7__Impl : ( ( rule__Step__TextAssignment_7 ) ) ;
    public final void rule__Step__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2496:1: ( ( ( rule__Step__TextAssignment_7 ) ) )
            // InternalJPCoffe.g:2497:1: ( ( rule__Step__TextAssignment_7 ) )
            {
            // InternalJPCoffe.g:2497:1: ( ( rule__Step__TextAssignment_7 ) )
            // InternalJPCoffe.g:2498:2: ( rule__Step__TextAssignment_7 )
            {
             before(grammarAccess.getStepAccess().getTextAssignment_7()); 
            // InternalJPCoffe.g:2499:2: ( rule__Step__TextAssignment_7 )
            // InternalJPCoffe.g:2499:3: rule__Step__TextAssignment_7
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
    // InternalJPCoffe.g:2508:1: rule__Step__Group_2__0 : rule__Step__Group_2__0__Impl rule__Step__Group_2__1 ;
    public final void rule__Step__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2512:1: ( rule__Step__Group_2__0__Impl rule__Step__Group_2__1 )
            // InternalJPCoffe.g:2513:2: rule__Step__Group_2__0__Impl rule__Step__Group_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalJPCoffe.g:2520:1: rule__Step__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Step__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2524:1: ( ( ',' ) )
            // InternalJPCoffe.g:2525:1: ( ',' )
            {
            // InternalJPCoffe.g:2525:1: ( ',' )
            // InternalJPCoffe.g:2526:2: ','
            {
             before(grammarAccess.getStepAccess().getCommaKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalJPCoffe.g:2535:1: rule__Step__Group_2__1 : rule__Step__Group_2__1__Impl ;
    public final void rule__Step__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2539:1: ( rule__Step__Group_2__1__Impl )
            // InternalJPCoffe.g:2540:2: rule__Step__Group_2__1__Impl
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
    // InternalJPCoffe.g:2546:1: rule__Step__Group_2__1__Impl : ( ( rule__Step__PredAssignment_2_1 ) ) ;
    public final void rule__Step__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2550:1: ( ( ( rule__Step__PredAssignment_2_1 ) ) )
            // InternalJPCoffe.g:2551:1: ( ( rule__Step__PredAssignment_2_1 ) )
            {
            // InternalJPCoffe.g:2551:1: ( ( rule__Step__PredAssignment_2_1 ) )
            // InternalJPCoffe.g:2552:2: ( rule__Step__PredAssignment_2_1 )
            {
             before(grammarAccess.getStepAccess().getPredAssignment_2_1()); 
            // InternalJPCoffe.g:2553:2: ( rule__Step__PredAssignment_2_1 )
            // InternalJPCoffe.g:2553:3: rule__Step__PredAssignment_2_1
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
    // InternalJPCoffe.g:2562:1: rule__NAME__Group__0 : rule__NAME__Group__0__Impl rule__NAME__Group__1 ;
    public final void rule__NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2566:1: ( rule__NAME__Group__0__Impl rule__NAME__Group__1 )
            // InternalJPCoffe.g:2567:2: rule__NAME__Group__0__Impl rule__NAME__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalJPCoffe.g:2574:1: rule__NAME__Group__0__Impl : ( RULE_MAJ_WORD ) ;
    public final void rule__NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2578:1: ( ( RULE_MAJ_WORD ) )
            // InternalJPCoffe.g:2579:1: ( RULE_MAJ_WORD )
            {
            // InternalJPCoffe.g:2579:1: ( RULE_MAJ_WORD )
            // InternalJPCoffe.g:2580:2: RULE_MAJ_WORD
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
    // InternalJPCoffe.g:2589:1: rule__NAME__Group__1 : rule__NAME__Group__1__Impl ;
    public final void rule__NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2593:1: ( rule__NAME__Group__1__Impl )
            // InternalJPCoffe.g:2594:2: rule__NAME__Group__1__Impl
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
    // InternalJPCoffe.g:2600:1: rule__NAME__Group__1__Impl : ( ( RULE_WORD )* ) ;
    public final void rule__NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2604:1: ( ( ( RULE_WORD )* ) )
            // InternalJPCoffe.g:2605:1: ( ( RULE_WORD )* )
            {
            // InternalJPCoffe.g:2605:1: ( ( RULE_WORD )* )
            // InternalJPCoffe.g:2606:2: ( RULE_WORD )*
            {
             before(grammarAccess.getNAMEAccess().getWORDTerminalRuleCall_1()); 
            // InternalJPCoffe.g:2607:2: ( RULE_WORD )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WORD) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalJPCoffe.g:2607:3: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_38); 

            	    }
            	    break;

            	default :
            	    break loop22;
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


    // $ANTLR start "rule__Main__ImportsAssignment_0"
    // InternalJPCoffe.g:2616:1: rule__Main__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Main__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2620:1: ( ( ruleImport ) )
            // InternalJPCoffe.g:2621:2: ( ruleImport )
            {
            // InternalJPCoffe.g:2621:2: ( ruleImport )
            // InternalJPCoffe.g:2622:3: ruleImport
            {
             before(grammarAccess.getMainAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getMainAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Main__ImportsAssignment_0"


    // $ANTLR start "rule__Main__RecipesAssignment_1"
    // InternalJPCoffe.g:2631:1: rule__Main__RecipesAssignment_1 : ( ruleRecipe ) ;
    public final void rule__Main__RecipesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2635:1: ( ( ruleRecipe ) )
            // InternalJPCoffe.g:2636:2: ( ruleRecipe )
            {
            // InternalJPCoffe.g:2636:2: ( ruleRecipe )
            // InternalJPCoffe.g:2637:3: ruleRecipe
            {
             before(grammarAccess.getMainAccess().getRecipesRecipeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getMainAccess().getRecipesRecipeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Main__RecipesAssignment_1"


    // $ANTLR start "rule__Recipe__NameAssignment_1"
    // InternalJPCoffe.g:2646:1: rule__Recipe__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Recipe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2650:1: ( ( RULE_STRING ) )
            // InternalJPCoffe.g:2651:2: ( RULE_STRING )
            {
            // InternalJPCoffe.g:2651:2: ( RULE_STRING )
            // InternalJPCoffe.g:2652:3: RULE_STRING
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
    // InternalJPCoffe.g:2661:1: rule__Recipe__PortionAssignment_3 : ( rulePortionNB ) ;
    public final void rule__Recipe__PortionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2665:1: ( ( rulePortionNB ) )
            // InternalJPCoffe.g:2666:2: ( rulePortionNB )
            {
            // InternalJPCoffe.g:2666:2: ( rulePortionNB )
            // InternalJPCoffe.g:2667:3: rulePortionNB
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
    // InternalJPCoffe.g:2676:1: rule__Recipe__IngredientsAssignment_4 : ( ruleIngredientsBlock ) ;
    public final void rule__Recipe__IngredientsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2680:1: ( ( ruleIngredientsBlock ) )
            // InternalJPCoffe.g:2681:2: ( ruleIngredientsBlock )
            {
            // InternalJPCoffe.g:2681:2: ( ruleIngredientsBlock )
            // InternalJPCoffe.g:2682:3: ruleIngredientsBlock
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
    // InternalJPCoffe.g:2691:1: rule__Recipe__ToolsAssignment_5 : ( ruleToolsBlock ) ;
    public final void rule__Recipe__ToolsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2695:1: ( ( ruleToolsBlock ) )
            // InternalJPCoffe.g:2696:2: ( ruleToolsBlock )
            {
            // InternalJPCoffe.g:2696:2: ( ruleToolsBlock )
            // InternalJPCoffe.g:2697:3: ruleToolsBlock
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
    // InternalJPCoffe.g:2706:1: rule__Recipe__StepsAssignment_6 : ( ruleStepsBlock ) ;
    public final void rule__Recipe__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2710:1: ( ( ruleStepsBlock ) )
            // InternalJPCoffe.g:2711:2: ( ruleStepsBlock )
            {
            // InternalJPCoffe.g:2711:2: ( ruleStepsBlock )
            // InternalJPCoffe.g:2712:3: ruleStepsBlock
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
    // InternalJPCoffe.g:2721:1: rule__PortionNB__NbAssignment_1 : ( RULE_INT ) ;
    public final void rule__PortionNB__NbAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2725:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:2726:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:2726:2: ( RULE_INT )
            // InternalJPCoffe.g:2727:3: RULE_INT
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
    // InternalJPCoffe.g:2736:1: rule__IngredientsBlock__IngredientsListAssignment_3 : ( ( rule__IngredientsBlock__IngredientsListAlternatives_3_0 ) ) ;
    public final void rule__IngredientsBlock__IngredientsListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2740:1: ( ( ( rule__IngredientsBlock__IngredientsListAlternatives_3_0 ) ) )
            // InternalJPCoffe.g:2741:2: ( ( rule__IngredientsBlock__IngredientsListAlternatives_3_0 ) )
            {
            // InternalJPCoffe.g:2741:2: ( ( rule__IngredientsBlock__IngredientsListAlternatives_3_0 ) )
            // InternalJPCoffe.g:2742:3: ( rule__IngredientsBlock__IngredientsListAlternatives_3_0 )
            {
             before(grammarAccess.getIngredientsBlockAccess().getIngredientsListAlternatives_3_0()); 
            // InternalJPCoffe.g:2743:3: ( rule__IngredientsBlock__IngredientsListAlternatives_3_0 )
            // InternalJPCoffe.g:2743:4: rule__IngredientsBlock__IngredientsListAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__IngredientsBlock__IngredientsListAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientsBlockAccess().getIngredientsListAlternatives_3_0()); 

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


    // $ANTLR start "rule__IngredientsGroup__NameAssignment_2"
    // InternalJPCoffe.g:2751:1: rule__IngredientsGroup__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__IngredientsGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2755:1: ( ( RULE_STRING ) )
            // InternalJPCoffe.g:2756:2: ( RULE_STRING )
            {
            // InternalJPCoffe.g:2756:2: ( RULE_STRING )
            // InternalJPCoffe.g:2757:3: RULE_STRING
            {
             before(grammarAccess.getIngredientsGroupAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIngredientsGroupAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__IngredientsGroup__NameAssignment_2"


    // $ANTLR start "rule__IngredientsGroup__IngredientsListAssignment_4"
    // InternalJPCoffe.g:2766:1: rule__IngredientsGroup__IngredientsListAssignment_4 : ( ruleIngredient ) ;
    public final void rule__IngredientsGroup__IngredientsListAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2770:1: ( ( ruleIngredient ) )
            // InternalJPCoffe.g:2771:2: ( ruleIngredient )
            {
            // InternalJPCoffe.g:2771:2: ( ruleIngredient )
            // InternalJPCoffe.g:2772:3: ruleIngredient
            {
             before(grammarAccess.getIngredientsGroupAccess().getIngredientsListIngredientParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getIngredientsGroupAccess().getIngredientsListIngredientParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__IngredientsGroup__IngredientsListAssignment_4"


    // $ANTLR start "rule__IngredientsGroup__QuantityAssignment_6"
    // InternalJPCoffe.g:2781:1: rule__IngredientsGroup__QuantityAssignment_6 : ( ruleQuantity ) ;
    public final void rule__IngredientsGroup__QuantityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2785:1: ( ( ruleQuantity ) )
            // InternalJPCoffe.g:2786:2: ( ruleQuantity )
            {
            // InternalJPCoffe.g:2786:2: ( ruleQuantity )
            // InternalJPCoffe.g:2787:3: ruleQuantity
            {
             before(grammarAccess.getIngredientsGroupAccess().getQuantityQuantityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantity();

            state._fsp--;

             after(grammarAccess.getIngredientsGroupAccess().getQuantityQuantityParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__IngredientsGroup__QuantityAssignment_6"


    // $ANTLR start "rule__Ingredient__OriginalNameAssignment_1_0"
    // InternalJPCoffe.g:2796:1: rule__Ingredient__OriginalNameAssignment_1_0 : ( ruleNAME ) ;
    public final void rule__Ingredient__OriginalNameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2800:1: ( ( ruleNAME ) )
            // InternalJPCoffe.g:2801:2: ( ruleNAME )
            {
            // InternalJPCoffe.g:2801:2: ( ruleNAME )
            // InternalJPCoffe.g:2802:3: ruleNAME
            {
             before(grammarAccess.getIngredientAccess().getOriginalNameNAMEParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getOriginalNameNAMEParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Ingredient__OriginalNameAssignment_1_0"


    // $ANTLR start "rule__Ingredient__OriginalNameAssignment_1_1_1"
    // InternalJPCoffe.g:2811:1: rule__Ingredient__OriginalNameAssignment_1_1_1 : ( ruleNAME ) ;
    public final void rule__Ingredient__OriginalNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2815:1: ( ( ruleNAME ) )
            // InternalJPCoffe.g:2816:2: ( ruleNAME )
            {
            // InternalJPCoffe.g:2816:2: ( ruleNAME )
            // InternalJPCoffe.g:2817:3: ruleNAME
            {
             before(grammarAccess.getIngredientAccess().getOriginalNameNAMEParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getOriginalNameNAMEParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__Ingredient__OriginalNameAssignment_1_1_1"


    // $ANTLR start "rule__Ingredient__NameAssignment_2"
    // InternalJPCoffe.g:2826:1: rule__Ingredient__NameAssignment_2 : ( ruleNAME ) ;
    public final void rule__Ingredient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2830:1: ( ( ruleNAME ) )
            // InternalJPCoffe.g:2831:2: ( ruleNAME )
            {
            // InternalJPCoffe.g:2831:2: ( ruleNAME )
            // InternalJPCoffe.g:2832:3: ruleNAME
            {
             before(grammarAccess.getIngredientAccess().getNameNAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getNameNAMEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Ingredient__NameAssignment_2"


    // $ANTLR start "rule__Ingredient__QuantityAssignment_3"
    // InternalJPCoffe.g:2841:1: rule__Ingredient__QuantityAssignment_3 : ( ruleQuantity ) ;
    public final void rule__Ingredient__QuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2845:1: ( ( ruleQuantity ) )
            // InternalJPCoffe.g:2846:2: ( ruleQuantity )
            {
            // InternalJPCoffe.g:2846:2: ( ruleQuantity )
            // InternalJPCoffe.g:2847:3: ruleQuantity
            {
             before(grammarAccess.getIngredientAccess().getQuantityQuantityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantity();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getQuantityQuantityParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Ingredient__QuantityAssignment_3"


    // $ANTLR start "rule__Quantity__AmountAssignment_0"
    // InternalJPCoffe.g:2856:1: rule__Quantity__AmountAssignment_0 : ( RULE_INT ) ;
    public final void rule__Quantity__AmountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2860:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:2861:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:2861:2: ( RULE_INT )
            // InternalJPCoffe.g:2862:3: RULE_INT
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
    // InternalJPCoffe.g:2871:1: rule__Quantity__UnitAssignment_1 : ( RULE_METRIC_UNIT ) ;
    public final void rule__Quantity__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2875:1: ( ( RULE_METRIC_UNIT ) )
            // InternalJPCoffe.g:2876:2: ( RULE_METRIC_UNIT )
            {
            // InternalJPCoffe.g:2876:2: ( RULE_METRIC_UNIT )
            // InternalJPCoffe.g:2877:3: RULE_METRIC_UNIT
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
    // InternalJPCoffe.g:2886:1: rule__ToolsBlock__ToolsListAssignment_3 : ( ruleTool ) ;
    public final void rule__ToolsBlock__ToolsListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2890:1: ( ( ruleTool ) )
            // InternalJPCoffe.g:2891:2: ( ruleTool )
            {
            // InternalJPCoffe.g:2891:2: ( ruleTool )
            // InternalJPCoffe.g:2892:3: ruleTool
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


    // $ANTLR start "rule__Tool__OriginalNameAssignment_1_0"
    // InternalJPCoffe.g:2901:1: rule__Tool__OriginalNameAssignment_1_0 : ( ruleNAME ) ;
    public final void rule__Tool__OriginalNameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2905:1: ( ( ruleNAME ) )
            // InternalJPCoffe.g:2906:2: ( ruleNAME )
            {
            // InternalJPCoffe.g:2906:2: ( ruleNAME )
            // InternalJPCoffe.g:2907:3: ruleNAME
            {
             before(grammarAccess.getToolAccess().getOriginalNameNAMEParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getToolAccess().getOriginalNameNAMEParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Tool__OriginalNameAssignment_1_0"


    // $ANTLR start "rule__Tool__NameAssignment_2"
    // InternalJPCoffe.g:2916:1: rule__Tool__NameAssignment_2 : ( ruleNAME ) ;
    public final void rule__Tool__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2920:1: ( ( ruleNAME ) )
            // InternalJPCoffe.g:2921:2: ( ruleNAME )
            {
            // InternalJPCoffe.g:2921:2: ( ruleNAME )
            // InternalJPCoffe.g:2922:3: ruleNAME
            {
             before(grammarAccess.getToolAccess().getNameNAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNAME();

            state._fsp--;

             after(grammarAccess.getToolAccess().getNameNAMEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Tool__NameAssignment_2"


    // $ANTLR start "rule__StepsBlock__StepsListAssignment_3"
    // InternalJPCoffe.g:2931:1: rule__StepsBlock__StepsListAssignment_3 : ( ( rule__StepsBlock__StepsListAlternatives_3_0 ) ) ;
    public final void rule__StepsBlock__StepsListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2935:1: ( ( ( rule__StepsBlock__StepsListAlternatives_3_0 ) ) )
            // InternalJPCoffe.g:2936:2: ( ( rule__StepsBlock__StepsListAlternatives_3_0 ) )
            {
            // InternalJPCoffe.g:2936:2: ( ( rule__StepsBlock__StepsListAlternatives_3_0 ) )
            // InternalJPCoffe.g:2937:3: ( rule__StepsBlock__StepsListAlternatives_3_0 )
            {
             before(grammarAccess.getStepsBlockAccess().getStepsListAlternatives_3_0()); 
            // InternalJPCoffe.g:2938:3: ( rule__StepsBlock__StepsListAlternatives_3_0 )
            // InternalJPCoffe.g:2938:4: rule__StepsBlock__StepsListAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__StepsBlock__StepsListAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getStepsBlockAccess().getStepsListAlternatives_3_0()); 

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


    // $ANTLR start "rule__ConditionalStep__PredAssignment_1"
    // InternalJPCoffe.g:2946:1: rule__ConditionalStep__PredAssignment_1 : ( RULE_INT ) ;
    public final void rule__ConditionalStep__PredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2950:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:2951:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:2951:2: ( RULE_INT )
            // InternalJPCoffe.g:2952:3: RULE_INT
            {
             before(grammarAccess.getConditionalStepAccess().getPredINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionalStepAccess().getPredINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConditionalStep__PredAssignment_1"


    // $ANTLR start "rule__ConditionalStep__PredAssignment_2_1"
    // InternalJPCoffe.g:2961:1: rule__ConditionalStep__PredAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__ConditionalStep__PredAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2965:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:2966:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:2966:2: ( RULE_INT )
            // InternalJPCoffe.g:2967:3: RULE_INT
            {
             before(grammarAccess.getConditionalStepAccess().getPredINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionalStepAccess().getPredINTTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ConditionalStep__PredAssignment_2_1"


    // $ANTLR start "rule__ConditionalStep__NumAssignment_5"
    // InternalJPCoffe.g:2976:1: rule__ConditionalStep__NumAssignment_5 : ( RULE_INT ) ;
    public final void rule__ConditionalStep__NumAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2980:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:2981:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:2981:2: ( RULE_INT )
            // InternalJPCoffe.g:2982:3: RULE_INT
            {
             before(grammarAccess.getConditionalStepAccess().getNumINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionalStepAccess().getNumINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__ConditionalStep__NumAssignment_5"


    // $ANTLR start "rule__ConditionalStep__ConditionAssignment_8"
    // InternalJPCoffe.g:2991:1: rule__ConditionalStep__ConditionAssignment_8 : ( ruleTEXT ) ;
    public final void rule__ConditionalStep__ConditionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:2995:1: ( ( ruleTEXT ) )
            // InternalJPCoffe.g:2996:2: ( ruleTEXT )
            {
            // InternalJPCoffe.g:2996:2: ( ruleTEXT )
            // InternalJPCoffe.g:2997:3: ruleTEXT
            {
             before(grammarAccess.getConditionalStepAccess().getConditionTEXTParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getConditionalStepAccess().getConditionTEXTParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ConditionalStep__ConditionAssignment_8"


    // $ANTLR start "rule__ConditionalStep__ToAssignment_10"
    // InternalJPCoffe.g:3006:1: rule__ConditionalStep__ToAssignment_10 : ( RULE_INT ) ;
    public final void rule__ConditionalStep__ToAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:3010:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:3011:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:3011:2: ( RULE_INT )
            // InternalJPCoffe.g:3012:3: RULE_INT
            {
             before(grammarAccess.getConditionalStepAccess().getToINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionalStepAccess().getToINTTerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__ConditionalStep__ToAssignment_10"


    // $ANTLR start "rule__Step__PredAssignment_1"
    // InternalJPCoffe.g:3021:1: rule__Step__PredAssignment_1 : ( RULE_INT ) ;
    public final void rule__Step__PredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:3025:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:3026:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:3026:2: ( RULE_INT )
            // InternalJPCoffe.g:3027:3: RULE_INT
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
    // InternalJPCoffe.g:3036:1: rule__Step__PredAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Step__PredAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:3040:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:3041:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:3041:2: ( RULE_INT )
            // InternalJPCoffe.g:3042:3: RULE_INT
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
    // InternalJPCoffe.g:3051:1: rule__Step__NumAssignment_5 : ( RULE_INT ) ;
    public final void rule__Step__NumAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:3055:1: ( ( RULE_INT ) )
            // InternalJPCoffe.g:3056:2: ( RULE_INT )
            {
            // InternalJPCoffe.g:3056:2: ( RULE_INT )
            // InternalJPCoffe.g:3057:3: RULE_INT
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
    // InternalJPCoffe.g:3066:1: rule__Step__TextAssignment_7 : ( ruleTEXT ) ;
    public final void rule__Step__TextAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJPCoffe.g:3070:1: ( ( ruleTEXT ) )
            // InternalJPCoffe.g:3071:2: ( ruleTEXT )
            {
            // InternalJPCoffe.g:3071:2: ( ruleTEXT )
            // InternalJPCoffe.g:3072:3: ruleTEXT
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\21\1\6\1\22\1\6\1\36\1\22\1\6\1\37\1\4\2\uffff";
    static final String dfa_3s = "\1\21\2\42\1\6\1\36\1\42\1\6\1\37\1\40\2\uffff";
    static final String dfa_4s = "\11\uffff\1\2\1\1";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\13\uffff\1\4\17\uffff\1\3",
            "\1\4\17\uffff\1\3",
            "\1\5",
            "\1\6",
            "\1\4\17\uffff\1\3",
            "\1\7",
            "\1\10",
            "\3\11\31\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "455:1: rule__StepsBlock__StepsListAlternatives_3_0 : ( ( ruleConditionalStep ) | ( ruleStep ) );";
        }
    }
    static final String dfa_7s = "\5\uffff";
    static final String dfa_8s = "\1\uffff\2\4\2\uffff";
    static final String dfa_9s = "\1\4\2\5\2\uffff";
    static final String dfa_10s = "\1\4\2\34\2\uffff";
    static final String dfa_11s = "\3\uffff\1\1\1\2";
    static final String dfa_12s = "\5\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2\1\4\17\uffff\1\4\2\uffff\1\4\2\3\1\4",
            "\1\2\1\4\17\uffff\1\4\2\uffff\1\4\2\3\1\4",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1339:2: ( rule__Ingredient__Group_1__0 )?";
        }
    }
    static final String dfa_14s = "\1\4\2\35\2\uffff";
    static final String[] dfa_15s = {
            "\1\1",
            "\1\2\20\uffff\1\4\3\uffff\1\3\2\uffff\1\4",
            "\1\2\20\uffff\1\4\3\uffff\1\3\2\uffff\1\4",
            "",
            ""
    };
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_14;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "1744:2: ( rule__Tool__Group_1__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400040040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000022L});

}