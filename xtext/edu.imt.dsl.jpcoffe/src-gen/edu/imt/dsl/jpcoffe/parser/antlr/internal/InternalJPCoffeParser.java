package edu.imt.dsl.jpcoffe.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.imt.dsl.jpcoffe.services.JPCoffeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJPCoffeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_TITLE_LINE", "RULE_METRIC_UNIT", "RULE_MAJ_WORD", "RULE_WORD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'Recipe'", "'{'", "'}'", "'For'", "'people'", "'Ingredients'", "'*'", "'Tools'", "'Steps'", "','", "'->'", "'.'"
    };
    public static final int RULE_METRIC_UNIT=7;
    public static final int RULE_WORD=9;
    public static final int RULE_STRING=4;
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
    public static final int RULE_MAJ_WORD=8;
    public static final int RULE_INT=5;
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

        public InternalJPCoffeParser(TokenStream input, JPCoffeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Main";
       	}

       	@Override
       	protected JPCoffeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMain"
    // InternalJPCoffe.g:64:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalJPCoffe.g:64:45: (iv_ruleMain= ruleMain EOF )
            // InternalJPCoffe.g:65:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalJPCoffe.g:71:1: ruleMain returns [EObject current=null] : this_Recipe_0= ruleRecipe ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        EObject this_Recipe_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:77:2: (this_Recipe_0= ruleRecipe )
            // InternalJPCoffe.g:78:2: this_Recipe_0= ruleRecipe
            {

            		newCompositeNode(grammarAccess.getMainAccess().getRecipeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Recipe_0=ruleRecipe();

            state._fsp--;


            		current = this_Recipe_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleRecipe"
    // InternalJPCoffe.g:89:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // InternalJPCoffe.g:89:47: (iv_ruleRecipe= ruleRecipe EOF )
            // InternalJPCoffe.g:90:2: iv_ruleRecipe= ruleRecipe EOF
            {
             newCompositeNode(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecipe=ruleRecipe();

            state._fsp--;

             current =iv_ruleRecipe; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // InternalJPCoffe.g:96:1: ruleRecipe returns [EObject current=null] : (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_portion_3_0= rulePortionNB ) ) ( (lv_ingredients_4_0= ruleIngredientsBlock ) ) ( (lv_tools_5_0= ruleToolsBlock ) ) ( (lv_steps_6_0= ruleStepsBlock ) ) otherlv_7= '}' ) ;
    public final EObject ruleRecipe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_portion_3_0 = null;

        EObject lv_ingredients_4_0 = null;

        EObject lv_tools_5_0 = null;

        EObject lv_steps_6_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:102:2: ( (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_portion_3_0= rulePortionNB ) ) ( (lv_ingredients_4_0= ruleIngredientsBlock ) ) ( (lv_tools_5_0= ruleToolsBlock ) ) ( (lv_steps_6_0= ruleStepsBlock ) ) otherlv_7= '}' ) )
            // InternalJPCoffe.g:103:2: (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_portion_3_0= rulePortionNB ) ) ( (lv_ingredients_4_0= ruleIngredientsBlock ) ) ( (lv_tools_5_0= ruleToolsBlock ) ) ( (lv_steps_6_0= ruleStepsBlock ) ) otherlv_7= '}' )
            {
            // InternalJPCoffe.g:103:2: (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_portion_3_0= rulePortionNB ) ) ( (lv_ingredients_4_0= ruleIngredientsBlock ) ) ( (lv_tools_5_0= ruleToolsBlock ) ) ( (lv_steps_6_0= ruleStepsBlock ) ) otherlv_7= '}' )
            // InternalJPCoffe.g:104:3: otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_portion_3_0= rulePortionNB ) ) ( (lv_ingredients_4_0= ruleIngredientsBlock ) ) ( (lv_tools_5_0= ruleToolsBlock ) ) ( (lv_steps_6_0= ruleStepsBlock ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRecipeAccess().getRecipeKeyword_0());
            		
            // InternalJPCoffe.g:108:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalJPCoffe.g:109:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalJPCoffe.g:109:4: (lv_name_1_0= RULE_STRING )
            // InternalJPCoffe.g:110:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRecipeAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecipeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJPCoffe.g:130:3: ( (lv_portion_3_0= rulePortionNB ) )
            // InternalJPCoffe.g:131:4: (lv_portion_3_0= rulePortionNB )
            {
            // InternalJPCoffe.g:131:4: (lv_portion_3_0= rulePortionNB )
            // InternalJPCoffe.g:132:5: lv_portion_3_0= rulePortionNB
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getPortionPortionNBParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_portion_3_0=rulePortionNB();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					set(
            						current,
            						"portion",
            						lv_portion_3_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.PortionNB");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJPCoffe.g:149:3: ( (lv_ingredients_4_0= ruleIngredientsBlock ) )
            // InternalJPCoffe.g:150:4: (lv_ingredients_4_0= ruleIngredientsBlock )
            {
            // InternalJPCoffe.g:150:4: (lv_ingredients_4_0= ruleIngredientsBlock )
            // InternalJPCoffe.g:151:5: lv_ingredients_4_0= ruleIngredientsBlock
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsIngredientsBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_ingredients_4_0=ruleIngredientsBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					set(
            						current,
            						"ingredients",
            						lv_ingredients_4_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.IngredientsBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJPCoffe.g:168:3: ( (lv_tools_5_0= ruleToolsBlock ) )
            // InternalJPCoffe.g:169:4: (lv_tools_5_0= ruleToolsBlock )
            {
            // InternalJPCoffe.g:169:4: (lv_tools_5_0= ruleToolsBlock )
            // InternalJPCoffe.g:170:5: lv_tools_5_0= ruleToolsBlock
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getToolsToolsBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_tools_5_0=ruleToolsBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					set(
            						current,
            						"tools",
            						lv_tools_5_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.ToolsBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJPCoffe.g:187:3: ( (lv_steps_6_0= ruleStepsBlock ) )
            // InternalJPCoffe.g:188:4: (lv_steps_6_0= ruleStepsBlock )
            {
            // InternalJPCoffe.g:188:4: (lv_steps_6_0= ruleStepsBlock )
            // InternalJPCoffe.g:189:5: lv_steps_6_0= ruleStepsBlock
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getStepsStepsBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_steps_6_0=ruleStepsBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					set(
            						current,
            						"steps",
            						lv_steps_6_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.StepsBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "entryRulePortionNB"
    // InternalJPCoffe.g:214:1: entryRulePortionNB returns [EObject current=null] : iv_rulePortionNB= rulePortionNB EOF ;
    public final EObject entryRulePortionNB() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortionNB = null;


        try {
            // InternalJPCoffe.g:214:50: (iv_rulePortionNB= rulePortionNB EOF )
            // InternalJPCoffe.g:215:2: iv_rulePortionNB= rulePortionNB EOF
            {
             newCompositeNode(grammarAccess.getPortionNBRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortionNB=rulePortionNB();

            state._fsp--;

             current =iv_rulePortionNB; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePortionNB"


    // $ANTLR start "rulePortionNB"
    // InternalJPCoffe.g:221:1: rulePortionNB returns [EObject current=null] : (otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )? ) ;
    public final EObject rulePortionNB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nb_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJPCoffe.g:227:2: ( (otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )? ) )
            // InternalJPCoffe.g:228:2: (otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )? )
            {
            // InternalJPCoffe.g:228:2: (otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )? )
            // InternalJPCoffe.g:229:3: otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPortionNBAccess().getForKeyword_0());
            		
            // InternalJPCoffe.g:233:3: ( (lv_nb_1_0= RULE_INT ) )
            // InternalJPCoffe.g:234:4: (lv_nb_1_0= RULE_INT )
            {
            // InternalJPCoffe.g:234:4: (lv_nb_1_0= RULE_INT )
            // InternalJPCoffe.g:235:5: lv_nb_1_0= RULE_INT
            {
            lv_nb_1_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_nb_1_0, grammarAccess.getPortionNBAccess().getNbINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortionNBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nb",
            						lv_nb_1_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.INT");
            				

            }


            }

            // InternalJPCoffe.g:251:3: (otherlv_2= 'people' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalJPCoffe.g:252:4: otherlv_2= 'people'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPortionNBAccess().getPeopleKeyword_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePortionNB"


    // $ANTLR start "entryRuleIngredientsBlock"
    // InternalJPCoffe.g:261:1: entryRuleIngredientsBlock returns [EObject current=null] : iv_ruleIngredientsBlock= ruleIngredientsBlock EOF ;
    public final EObject entryRuleIngredientsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredientsBlock = null;


        try {
            // InternalJPCoffe.g:261:57: (iv_ruleIngredientsBlock= ruleIngredientsBlock EOF )
            // InternalJPCoffe.g:262:2: iv_ruleIngredientsBlock= ruleIngredientsBlock EOF
            {
             newCompositeNode(grammarAccess.getIngredientsBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngredientsBlock=ruleIngredientsBlock();

            state._fsp--;

             current =iv_ruleIngredientsBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIngredientsBlock"


    // $ANTLR start "ruleIngredientsBlock"
    // InternalJPCoffe.g:268:1: ruleIngredientsBlock returns [EObject current=null] : ( () otherlv_1= 'Ingredients' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_ingredientsList_3_0= ruleIngredient ) )* ) ;
    public final EObject ruleIngredientsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_TITLE_LINE_2=null;
        EObject lv_ingredientsList_3_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:274:2: ( ( () otherlv_1= 'Ingredients' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_ingredientsList_3_0= ruleIngredient ) )* ) )
            // InternalJPCoffe.g:275:2: ( () otherlv_1= 'Ingredients' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_ingredientsList_3_0= ruleIngredient ) )* )
            {
            // InternalJPCoffe.g:275:2: ( () otherlv_1= 'Ingredients' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_ingredientsList_3_0= ruleIngredient ) )* )
            // InternalJPCoffe.g:276:3: () otherlv_1= 'Ingredients' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_ingredientsList_3_0= ruleIngredient ) )*
            {
            // InternalJPCoffe.g:276:3: ()
            // InternalJPCoffe.g:277:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIngredientsBlockAccess().getIngredientsBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getIngredientsBlockAccess().getIngredientsKeyword_1());
            		
            this_TITLE_LINE_2=(Token)match(input,RULE_TITLE_LINE,FOLLOW_13); 

            			newLeafNode(this_TITLE_LINE_2, grammarAccess.getIngredientsBlockAccess().getTITLE_LINETerminalRuleCall_2());
            		
            // InternalJPCoffe.g:291:3: ( (lv_ingredientsList_3_0= ruleIngredient ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJPCoffe.g:292:4: (lv_ingredientsList_3_0= ruleIngredient )
            	    {
            	    // InternalJPCoffe.g:292:4: (lv_ingredientsList_3_0= ruleIngredient )
            	    // InternalJPCoffe.g:293:5: lv_ingredientsList_3_0= ruleIngredient
            	    {

            	    					newCompositeNode(grammarAccess.getIngredientsBlockAccess().getIngredientsListIngredientParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_ingredientsList_3_0=ruleIngredient();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIngredientsBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ingredientsList",
            	    						lv_ingredientsList_3_0,
            	    						"edu.imt.dsl.jpcoffe.JPCoffe.Ingredient");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIngredientsBlock"


    // $ANTLR start "entryRuleIngredient"
    // InternalJPCoffe.g:314:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // InternalJPCoffe.g:314:51: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalJPCoffe.g:315:2: iv_ruleIngredient= ruleIngredient EOF
            {
             newCompositeNode(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngredient=ruleIngredient();

            state._fsp--;

             current =iv_ruleIngredient; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalJPCoffe.g:321:1: ruleIngredient returns [EObject current=null] : (otherlv_0= '*' ( (lv_name_1_0= ruleNAME ) ) ( (lv_quantity_2_0= ruleQuantity ) )? ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_quantity_2_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:327:2: ( (otherlv_0= '*' ( (lv_name_1_0= ruleNAME ) ) ( (lv_quantity_2_0= ruleQuantity ) )? ) )
            // InternalJPCoffe.g:328:2: (otherlv_0= '*' ( (lv_name_1_0= ruleNAME ) ) ( (lv_quantity_2_0= ruleQuantity ) )? )
            {
            // InternalJPCoffe.g:328:2: (otherlv_0= '*' ( (lv_name_1_0= ruleNAME ) ) ( (lv_quantity_2_0= ruleQuantity ) )? )
            // InternalJPCoffe.g:329:3: otherlv_0= '*' ( (lv_name_1_0= ruleNAME ) ) ( (lv_quantity_2_0= ruleQuantity ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getIngredientAccess().getAsteriskKeyword_0());
            		
            // InternalJPCoffe.g:333:3: ( (lv_name_1_0= ruleNAME ) )
            // InternalJPCoffe.g:334:4: (lv_name_1_0= ruleNAME )
            {
            // InternalJPCoffe.g:334:4: (lv_name_1_0= ruleNAME )
            // InternalJPCoffe.g:335:5: lv_name_1_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getIngredientAccess().getNameNAMEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngredientRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJPCoffe.g:352:3: ( (lv_quantity_2_0= ruleQuantity ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJPCoffe.g:353:4: (lv_quantity_2_0= ruleQuantity )
                    {
                    // InternalJPCoffe.g:353:4: (lv_quantity_2_0= ruleQuantity )
                    // InternalJPCoffe.g:354:5: lv_quantity_2_0= ruleQuantity
                    {

                    					newCompositeNode(grammarAccess.getIngredientAccess().getQuantityQuantityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_quantity_2_0=ruleQuantity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIngredientRule());
                    					}
                    					set(
                    						current,
                    						"quantity",
                    						lv_quantity_2_0,
                    						"edu.imt.dsl.jpcoffe.JPCoffe.Quantity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleQuantity"
    // InternalJPCoffe.g:375:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // InternalJPCoffe.g:375:49: (iv_ruleQuantity= ruleQuantity EOF )
            // InternalJPCoffe.g:376:2: iv_ruleQuantity= ruleQuantity EOF
            {
             newCompositeNode(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;

             current =iv_ruleQuantity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantity"


    // $ANTLR start "ruleQuantity"
    // InternalJPCoffe.g:382:1: ruleQuantity returns [EObject current=null] : ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_METRIC_UNIT ) )? ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        Token lv_amount_0_0=null;
        Token lv_unit_1_0=null;


        	enterRule();

        try {
            // InternalJPCoffe.g:388:2: ( ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_METRIC_UNIT ) )? ) )
            // InternalJPCoffe.g:389:2: ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_METRIC_UNIT ) )? )
            {
            // InternalJPCoffe.g:389:2: ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_METRIC_UNIT ) )? )
            // InternalJPCoffe.g:390:3: ( (lv_amount_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_METRIC_UNIT ) )?
            {
            // InternalJPCoffe.g:390:3: ( (lv_amount_0_0= RULE_INT ) )
            // InternalJPCoffe.g:391:4: (lv_amount_0_0= RULE_INT )
            {
            // InternalJPCoffe.g:391:4: (lv_amount_0_0= RULE_INT )
            // InternalJPCoffe.g:392:5: lv_amount_0_0= RULE_INT
            {
            lv_amount_0_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_amount_0_0, grammarAccess.getQuantityAccess().getAmountINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_0_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.INT");
            				

            }


            }

            // InternalJPCoffe.g:408:3: ( (lv_unit_1_0= RULE_METRIC_UNIT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_METRIC_UNIT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJPCoffe.g:409:4: (lv_unit_1_0= RULE_METRIC_UNIT )
                    {
                    // InternalJPCoffe.g:409:4: (lv_unit_1_0= RULE_METRIC_UNIT )
                    // InternalJPCoffe.g:410:5: lv_unit_1_0= RULE_METRIC_UNIT
                    {
                    lv_unit_1_0=(Token)match(input,RULE_METRIC_UNIT,FOLLOW_2); 

                    					newLeafNode(lv_unit_1_0, grammarAccess.getQuantityAccess().getUnitMETRIC_UNITTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuantityRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"unit",
                    						lv_unit_1_0,
                    						"edu.imt.dsl.jpcoffe.JPCoffe.METRIC_UNIT");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "entryRuleToolsBlock"
    // InternalJPCoffe.g:430:1: entryRuleToolsBlock returns [EObject current=null] : iv_ruleToolsBlock= ruleToolsBlock EOF ;
    public final EObject entryRuleToolsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolsBlock = null;


        try {
            // InternalJPCoffe.g:430:51: (iv_ruleToolsBlock= ruleToolsBlock EOF )
            // InternalJPCoffe.g:431:2: iv_ruleToolsBlock= ruleToolsBlock EOF
            {
             newCompositeNode(grammarAccess.getToolsBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToolsBlock=ruleToolsBlock();

            state._fsp--;

             current =iv_ruleToolsBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToolsBlock"


    // $ANTLR start "ruleToolsBlock"
    // InternalJPCoffe.g:437:1: ruleToolsBlock returns [EObject current=null] : ( () otherlv_1= 'Tools' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_toolsList_3_0= ruleTool ) )* ) ;
    public final EObject ruleToolsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_TITLE_LINE_2=null;
        EObject lv_toolsList_3_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:443:2: ( ( () otherlv_1= 'Tools' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_toolsList_3_0= ruleTool ) )* ) )
            // InternalJPCoffe.g:444:2: ( () otherlv_1= 'Tools' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_toolsList_3_0= ruleTool ) )* )
            {
            // InternalJPCoffe.g:444:2: ( () otherlv_1= 'Tools' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_toolsList_3_0= ruleTool ) )* )
            // InternalJPCoffe.g:445:3: () otherlv_1= 'Tools' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_toolsList_3_0= ruleTool ) )*
            {
            // InternalJPCoffe.g:445:3: ()
            // InternalJPCoffe.g:446:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getToolsBlockAccess().getToolsBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getToolsBlockAccess().getToolsKeyword_1());
            		
            this_TITLE_LINE_2=(Token)match(input,RULE_TITLE_LINE,FOLLOW_13); 

            			newLeafNode(this_TITLE_LINE_2, grammarAccess.getToolsBlockAccess().getTITLE_LINETerminalRuleCall_2());
            		
            // InternalJPCoffe.g:460:3: ( (lv_toolsList_3_0= ruleTool ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJPCoffe.g:461:4: (lv_toolsList_3_0= ruleTool )
            	    {
            	    // InternalJPCoffe.g:461:4: (lv_toolsList_3_0= ruleTool )
            	    // InternalJPCoffe.g:462:5: lv_toolsList_3_0= ruleTool
            	    {

            	    					newCompositeNode(grammarAccess.getToolsBlockAccess().getToolsListToolParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_toolsList_3_0=ruleTool();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getToolsBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"toolsList",
            	    						lv_toolsList_3_0,
            	    						"edu.imt.dsl.jpcoffe.JPCoffe.Tool");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToolsBlock"


    // $ANTLR start "entryRuleTool"
    // InternalJPCoffe.g:483:1: entryRuleTool returns [EObject current=null] : iv_ruleTool= ruleTool EOF ;
    public final EObject entryRuleTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTool = null;


        try {
            // InternalJPCoffe.g:483:45: (iv_ruleTool= ruleTool EOF )
            // InternalJPCoffe.g:484:2: iv_ruleTool= ruleTool EOF
            {
             newCompositeNode(grammarAccess.getToolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTool=ruleTool();

            state._fsp--;

             current =iv_ruleTool; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTool"


    // $ANTLR start "ruleTool"
    // InternalJPCoffe.g:490:1: ruleTool returns [EObject current=null] : (otherlv_0= '*' ( (lv_name_1_0= ruleNAME ) ) ) ;
    public final EObject ruleTool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:496:2: ( (otherlv_0= '*' ( (lv_name_1_0= ruleNAME ) ) ) )
            // InternalJPCoffe.g:497:2: (otherlv_0= '*' ( (lv_name_1_0= ruleNAME ) ) )
            {
            // InternalJPCoffe.g:497:2: (otherlv_0= '*' ( (lv_name_1_0= ruleNAME ) ) )
            // InternalJPCoffe.g:498:3: otherlv_0= '*' ( (lv_name_1_0= ruleNAME ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getToolAccess().getAsteriskKeyword_0());
            		
            // InternalJPCoffe.g:502:3: ( (lv_name_1_0= ruleNAME ) )
            // InternalJPCoffe.g:503:4: (lv_name_1_0= ruleNAME )
            {
            // InternalJPCoffe.g:503:4: (lv_name_1_0= ruleNAME )
            // InternalJPCoffe.g:504:5: lv_name_1_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getToolAccess().getNameNAMEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getToolRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTool"


    // $ANTLR start "entryRuleStepsBlock"
    // InternalJPCoffe.g:525:1: entryRuleStepsBlock returns [EObject current=null] : iv_ruleStepsBlock= ruleStepsBlock EOF ;
    public final EObject entryRuleStepsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepsBlock = null;


        try {
            // InternalJPCoffe.g:525:51: (iv_ruleStepsBlock= ruleStepsBlock EOF )
            // InternalJPCoffe.g:526:2: iv_ruleStepsBlock= ruleStepsBlock EOF
            {
             newCompositeNode(grammarAccess.getStepsBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepsBlock=ruleStepsBlock();

            state._fsp--;

             current =iv_ruleStepsBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStepsBlock"


    // $ANTLR start "ruleStepsBlock"
    // InternalJPCoffe.g:532:1: ruleStepsBlock returns [EObject current=null] : ( () otherlv_1= 'Steps' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_stepsList_3_0= ruleStep ) )* ) ;
    public final EObject ruleStepsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_TITLE_LINE_2=null;
        EObject lv_stepsList_3_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:538:2: ( ( () otherlv_1= 'Steps' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_stepsList_3_0= ruleStep ) )* ) )
            // InternalJPCoffe.g:539:2: ( () otherlv_1= 'Steps' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_stepsList_3_0= ruleStep ) )* )
            {
            // InternalJPCoffe.g:539:2: ( () otherlv_1= 'Steps' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_stepsList_3_0= ruleStep ) )* )
            // InternalJPCoffe.g:540:3: () otherlv_1= 'Steps' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_stepsList_3_0= ruleStep ) )*
            {
            // InternalJPCoffe.g:540:3: ()
            // InternalJPCoffe.g:541:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepsBlockAccess().getStepsBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getStepsBlockAccess().getStepsKeyword_1());
            		
            this_TITLE_LINE_2=(Token)match(input,RULE_TITLE_LINE,FOLLOW_17); 

            			newLeafNode(this_TITLE_LINE_2, grammarAccess.getStepsBlockAccess().getTITLE_LINETerminalRuleCall_2());
            		
            // InternalJPCoffe.g:555:3: ( (lv_stepsList_3_0= ruleStep ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJPCoffe.g:556:4: (lv_stepsList_3_0= ruleStep )
            	    {
            	    // InternalJPCoffe.g:556:4: (lv_stepsList_3_0= ruleStep )
            	    // InternalJPCoffe.g:557:5: lv_stepsList_3_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getStepsBlockAccess().getStepsListStepParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_stepsList_3_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepsBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stepsList",
            	    						lv_stepsList_3_0,
            	    						"edu.imt.dsl.jpcoffe.JPCoffe.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepsBlock"


    // $ANTLR start "entryRuleStep"
    // InternalJPCoffe.g:578:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalJPCoffe.g:578:45: (iv_ruleStep= ruleStep EOF )
            // InternalJPCoffe.g:579:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalJPCoffe.g:585:1: ruleStep returns [EObject current=null] : (otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' ( (lv_text_8_0= ruleTEXT ) ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pred_1_0=null;
        Token otherlv_2=null;
        Token lv_pred_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_num_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_text_8_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:591:2: ( (otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' ( (lv_text_8_0= ruleTEXT ) ) ) )
            // InternalJPCoffe.g:592:2: (otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' ( (lv_text_8_0= ruleTEXT ) ) )
            {
            // InternalJPCoffe.g:592:2: (otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' ( (lv_text_8_0= ruleTEXT ) ) )
            // InternalJPCoffe.g:593:3: otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' ( (lv_text_8_0= ruleTEXT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalJPCoffe.g:597:3: ( (lv_pred_1_0= RULE_INT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJPCoffe.g:598:4: (lv_pred_1_0= RULE_INT )
                    {
                    // InternalJPCoffe.g:598:4: (lv_pred_1_0= RULE_INT )
                    // InternalJPCoffe.g:599:5: lv_pred_1_0= RULE_INT
                    {
                    lv_pred_1_0=(Token)match(input,RULE_INT,FOLLOW_19); 

                    					newLeafNode(lv_pred_1_0, grammarAccess.getStepAccess().getPredINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStepRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"pred",
                    						lv_pred_1_0,
                    						"edu.imt.dsl.jpcoffe.JPCoffe.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalJPCoffe.g:615:3: (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJPCoffe.g:616:4: otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStepAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJPCoffe.g:620:4: ( (lv_pred_3_0= RULE_INT ) )
            	    // InternalJPCoffe.g:621:5: (lv_pred_3_0= RULE_INT )
            	    {
            	    // InternalJPCoffe.g:621:5: (lv_pred_3_0= RULE_INT )
            	    // InternalJPCoffe.g:622:6: lv_pred_3_0= RULE_INT
            	    {
            	    lv_pred_3_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            	    						newLeafNode(lv_pred_3_0, grammarAccess.getStepAccess().getPredINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStepRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"pred",
            	    							lv_pred_3_0,
            	    							"edu.imt.dsl.jpcoffe.JPCoffe.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getStepAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalJPCoffe.g:647:3: ( (lv_num_6_0= RULE_INT ) )
            // InternalJPCoffe.g:648:4: (lv_num_6_0= RULE_INT )
            {
            // InternalJPCoffe.g:648:4: (lv_num_6_0= RULE_INT )
            // InternalJPCoffe.g:649:5: lv_num_6_0= RULE_INT
            {
            lv_num_6_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_num_6_0, grammarAccess.getStepAccess().getNumINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"num",
            						lv_num_6_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getStepAccess().getFullStopKeyword_6());
            		
            // InternalJPCoffe.g:669:3: ( (lv_text_8_0= ruleTEXT ) )
            // InternalJPCoffe.g:670:4: (lv_text_8_0= ruleTEXT )
            {
            // InternalJPCoffe.g:670:4: (lv_text_8_0= ruleTEXT )
            // InternalJPCoffe.g:671:5: lv_text_8_0= ruleTEXT
            {

            					newCompositeNode(grammarAccess.getStepAccess().getTextTEXTParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_8_0=ruleTEXT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_8_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.TEXT");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleNAME"
    // InternalJPCoffe.g:692:1: entryRuleNAME returns [String current=null] : iv_ruleNAME= ruleNAME EOF ;
    public final String entryRuleNAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNAME = null;


        try {
            // InternalJPCoffe.g:692:44: (iv_ruleNAME= ruleNAME EOF )
            // InternalJPCoffe.g:693:2: iv_ruleNAME= ruleNAME EOF
            {
             newCompositeNode(grammarAccess.getNAMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNAME=ruleNAME();

            state._fsp--;

             current =iv_ruleNAME.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNAME"


    // $ANTLR start "ruleNAME"
    // InternalJPCoffe.g:699:1: ruleNAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MAJ_WORD_0= RULE_MAJ_WORD (this_WORD_1= RULE_WORD )* ) ;
    public final AntlrDatatypeRuleToken ruleNAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MAJ_WORD_0=null;
        Token this_WORD_1=null;


        	enterRule();

        try {
            // InternalJPCoffe.g:705:2: ( (this_MAJ_WORD_0= RULE_MAJ_WORD (this_WORD_1= RULE_WORD )* ) )
            // InternalJPCoffe.g:706:2: (this_MAJ_WORD_0= RULE_MAJ_WORD (this_WORD_1= RULE_WORD )* )
            {
            // InternalJPCoffe.g:706:2: (this_MAJ_WORD_0= RULE_MAJ_WORD (this_WORD_1= RULE_WORD )* )
            // InternalJPCoffe.g:707:3: this_MAJ_WORD_0= RULE_MAJ_WORD (this_WORD_1= RULE_WORD )*
            {
            this_MAJ_WORD_0=(Token)match(input,RULE_MAJ_WORD,FOLLOW_23); 

            			current.merge(this_MAJ_WORD_0);
            		

            			newLeafNode(this_MAJ_WORD_0, grammarAccess.getNAMEAccess().getMAJ_WORDTerminalRuleCall_0());
            		
            // InternalJPCoffe.g:714:3: (this_WORD_1= RULE_WORD )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WORD) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJPCoffe.g:715:4: this_WORD_1= RULE_WORD
            	    {
            	    this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_23); 

            	    				current.merge(this_WORD_1);
            	    			

            	    				newLeafNode(this_WORD_1, grammarAccess.getNAMEAccess().getWORDTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNAME"


    // $ANTLR start "entryRuleTEXT"
    // InternalJPCoffe.g:727:1: entryRuleTEXT returns [String current=null] : iv_ruleTEXT= ruleTEXT EOF ;
    public final String entryRuleTEXT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTEXT = null;


        try {
            // InternalJPCoffe.g:727:44: (iv_ruleTEXT= ruleTEXT EOF )
            // InternalJPCoffe.g:728:2: iv_ruleTEXT= ruleTEXT EOF
            {
             newCompositeNode(grammarAccess.getTEXTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTEXT=ruleTEXT();

            state._fsp--;

             current =iv_ruleTEXT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTEXT"


    // $ANTLR start "ruleTEXT"
    // InternalJPCoffe.g:734:1: ruleTEXT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MAJ_WORD_0= RULE_MAJ_WORD | this_WORD_1= RULE_WORD )+ ;
    public final AntlrDatatypeRuleToken ruleTEXT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MAJ_WORD_0=null;
        Token this_WORD_1=null;


        	enterRule();

        try {
            // InternalJPCoffe.g:740:2: ( (this_MAJ_WORD_0= RULE_MAJ_WORD | this_WORD_1= RULE_WORD )+ )
            // InternalJPCoffe.g:741:2: (this_MAJ_WORD_0= RULE_MAJ_WORD | this_WORD_1= RULE_WORD )+
            {
            // InternalJPCoffe.g:741:2: (this_MAJ_WORD_0= RULE_MAJ_WORD | this_WORD_1= RULE_WORD )+
            int cnt10=0;
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_MAJ_WORD) ) {
                    alt10=1;
                }
                else if ( (LA10_0==RULE_WORD) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJPCoffe.g:742:3: this_MAJ_WORD_0= RULE_MAJ_WORD
            	    {
            	    this_MAJ_WORD_0=(Token)match(input,RULE_MAJ_WORD,FOLLOW_24); 

            	    			current.merge(this_MAJ_WORD_0);
            	    		

            	    			newLeafNode(this_MAJ_WORD_0, grammarAccess.getTEXTAccess().getMAJ_WORDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalJPCoffe.g:750:3: this_WORD_1= RULE_WORD
            	    {
            	    this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_24); 

            	    			current.merge(this_WORD_1);
            	    		

            	    			newLeafNode(this_WORD_1, grammarAccess.getTEXTAccess().getWORDTerminalRuleCall_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTEXT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000408020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000302L});

}