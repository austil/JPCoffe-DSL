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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_NEW_LINE", "RULE_TITLE_LINE", "RULE_SPACE", "RULE_NAME", "RULE_METRIC_UNIT", "RULE_TEXT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Recipe'", "'{'", "'}'", "'For'", "'people'", "'Ingredients'", "'*'", "'Tools'", "'Steps'", "','", "'->'", "'.'"
    };
    public static final int RULE_METRIC_UNIT=10;
    public static final int RULE_NAME=9;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_SPACE=8;
    public static final int EOF=-1;
    public static final int RULE_ID=12;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NEW_LINE=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int RULE_TITLE_LINE=7;
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
    // InternalJPCoffe.g:71:1: ruleMain returns [EObject current=null] : ( (lv_recipes_0_0= ruleRecipe ) )+ ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        EObject lv_recipes_0_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:77:2: ( ( (lv_recipes_0_0= ruleRecipe ) )+ )
            // InternalJPCoffe.g:78:2: ( (lv_recipes_0_0= ruleRecipe ) )+
            {
            // InternalJPCoffe.g:78:2: ( (lv_recipes_0_0= ruleRecipe ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJPCoffe.g:79:3: (lv_recipes_0_0= ruleRecipe )
            	    {
            	    // InternalJPCoffe.g:79:3: (lv_recipes_0_0= ruleRecipe )
            	    // InternalJPCoffe.g:80:4: lv_recipes_0_0= ruleRecipe
            	    {

            	    				newCompositeNode(grammarAccess.getMainAccess().getRecipesRecipeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_recipes_0_0=ruleRecipe();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMainRule());
            	    				}
            	    				add(
            	    					current,
            	    					"recipes",
            	    					lv_recipes_0_0,
            	    					"edu.imt.dsl.jpcoffe.JPCoffe.Recipe");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleRecipe"
    // InternalJPCoffe.g:100:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // InternalJPCoffe.g:100:47: (iv_ruleRecipe= ruleRecipe EOF )
            // InternalJPCoffe.g:101:2: iv_ruleRecipe= ruleRecipe EOF
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
    // InternalJPCoffe.g:107:1: ruleRecipe returns [EObject current=null] : (otherlv_0= 'Recipe' this_STRING_1= RULE_STRING otherlv_2= '{' this_PortionNB_3= rulePortionNB ruleIngredientsBlock ruleToolsBlock ruleStepsBlock otherlv_7= '}' ) ;
    public final EObject ruleRecipe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_STRING_1=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject this_PortionNB_3 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:113:2: ( (otherlv_0= 'Recipe' this_STRING_1= RULE_STRING otherlv_2= '{' this_PortionNB_3= rulePortionNB ruleIngredientsBlock ruleToolsBlock ruleStepsBlock otherlv_7= '}' ) )
            // InternalJPCoffe.g:114:2: (otherlv_0= 'Recipe' this_STRING_1= RULE_STRING otherlv_2= '{' this_PortionNB_3= rulePortionNB ruleIngredientsBlock ruleToolsBlock ruleStepsBlock otherlv_7= '}' )
            {
            // InternalJPCoffe.g:114:2: (otherlv_0= 'Recipe' this_STRING_1= RULE_STRING otherlv_2= '{' this_PortionNB_3= rulePortionNB ruleIngredientsBlock ruleToolsBlock ruleStepsBlock otherlv_7= '}' )
            // InternalJPCoffe.g:115:3: otherlv_0= 'Recipe' this_STRING_1= RULE_STRING otherlv_2= '{' this_PortionNB_3= rulePortionNB ruleIngredientsBlock ruleToolsBlock ruleStepsBlock otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecipeAccess().getRecipeKeyword_0());
            		
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

            			newLeafNode(this_STRING_1, grammarAccess.getRecipeAccess().getSTRINGTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2());
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getPortionNBParserRuleCall_3());
            		
            pushFollow(FOLLOW_7);
            this_PortionNB_3=rulePortionNB();

            state._fsp--;


            			current = this_PortionNB_3;
            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsBlockParserRuleCall_4());
            		
            pushFollow(FOLLOW_8);
            ruleIngredientsBlock();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getToolsBlockParserRuleCall_5());
            		
            pushFollow(FOLLOW_9);
            ruleToolsBlock();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getStepsBlockParserRuleCall_6());
            		
            pushFollow(FOLLOW_10);
            ruleStepsBlock();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalJPCoffe.g:164:1: entryRulePortionNB returns [EObject current=null] : iv_rulePortionNB= rulePortionNB EOF ;
    public final EObject entryRulePortionNB() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortionNB = null;


        try {
            // InternalJPCoffe.g:164:50: (iv_rulePortionNB= rulePortionNB EOF )
            // InternalJPCoffe.g:165:2: iv_rulePortionNB= rulePortionNB EOF
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
    // InternalJPCoffe.g:171:1: rulePortionNB returns [EObject current=null] : (otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )? ) ;
    public final EObject rulePortionNB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nb_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJPCoffe.g:177:2: ( (otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )? ) )
            // InternalJPCoffe.g:178:2: (otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )? )
            {
            // InternalJPCoffe.g:178:2: (otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )? )
            // InternalJPCoffe.g:179:3: otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPortionNBAccess().getForKeyword_0());
            		
            // InternalJPCoffe.g:183:3: ( (lv_nb_1_0= RULE_INT ) )
            // InternalJPCoffe.g:184:4: (lv_nb_1_0= RULE_INT )
            {
            // InternalJPCoffe.g:184:4: (lv_nb_1_0= RULE_INT )
            // InternalJPCoffe.g:185:5: lv_nb_1_0= RULE_INT
            {
            lv_nb_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_nb_1_0, grammarAccess.getPortionNBAccess().getNbINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortionNBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nb",
            						lv_nb_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalJPCoffe.g:201:3: (otherlv_2= 'people' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalJPCoffe.g:202:4: otherlv_2= 'people'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalJPCoffe.g:211:1: entryRuleIngredientsBlock returns [String current=null] : iv_ruleIngredientsBlock= ruleIngredientsBlock EOF ;
    public final String entryRuleIngredientsBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIngredientsBlock = null;


        try {
            // InternalJPCoffe.g:211:56: (iv_ruleIngredientsBlock= ruleIngredientsBlock EOF )
            // InternalJPCoffe.g:212:2: iv_ruleIngredientsBlock= ruleIngredientsBlock EOF
            {
             newCompositeNode(grammarAccess.getIngredientsBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngredientsBlock=ruleIngredientsBlock();

            state._fsp--;

             current =iv_ruleIngredientsBlock.getText(); 
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
    // InternalJPCoffe.g:218:1: ruleIngredientsBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Ingredients' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Ingredient_4= ruleIngredient )* this_NEW_LINE_5= RULE_NEW_LINE ) ;
    public final AntlrDatatypeRuleToken ruleIngredientsBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NEW_LINE_1=null;
        Token this_TITLE_LINE_2=null;
        Token this_NEW_LINE_3=null;
        Token this_NEW_LINE_5=null;
        AntlrDatatypeRuleToken this_Ingredient_4 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:224:2: ( (kw= 'Ingredients' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Ingredient_4= ruleIngredient )* this_NEW_LINE_5= RULE_NEW_LINE ) )
            // InternalJPCoffe.g:225:2: (kw= 'Ingredients' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Ingredient_4= ruleIngredient )* this_NEW_LINE_5= RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:225:2: (kw= 'Ingredients' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Ingredient_4= ruleIngredient )* this_NEW_LINE_5= RULE_NEW_LINE )
            // InternalJPCoffe.g:226:3: kw= 'Ingredients' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Ingredient_4= ruleIngredient )* this_NEW_LINE_5= RULE_NEW_LINE
            {
            kw=(Token)match(input,22,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIngredientsBlockAccess().getIngredientsKeyword_0());
            		
            this_NEW_LINE_1=(Token)match(input,RULE_NEW_LINE,FOLLOW_14); 

            			current.merge(this_NEW_LINE_1);
            		

            			newLeafNode(this_NEW_LINE_1, grammarAccess.getIngredientsBlockAccess().getNEW_LINETerminalRuleCall_1());
            		
            this_TITLE_LINE_2=(Token)match(input,RULE_TITLE_LINE,FOLLOW_13); 

            			current.merge(this_TITLE_LINE_2);
            		

            			newLeafNode(this_TITLE_LINE_2, grammarAccess.getIngredientsBlockAccess().getTITLE_LINETerminalRuleCall_2());
            		
            this_NEW_LINE_3=(Token)match(input,RULE_NEW_LINE,FOLLOW_15); 

            			current.merge(this_NEW_LINE_3);
            		

            			newLeafNode(this_NEW_LINE_3, grammarAccess.getIngredientsBlockAccess().getNEW_LINETerminalRuleCall_3());
            		
            // InternalJPCoffe.g:252:3: (this_Ingredient_4= ruleIngredient )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJPCoffe.g:253:4: this_Ingredient_4= ruleIngredient
            	    {

            	    				newCompositeNode(grammarAccess.getIngredientsBlockAccess().getIngredientParserRuleCall_4());
            	    			
            	    pushFollow(FOLLOW_15);
            	    this_Ingredient_4=ruleIngredient();

            	    state._fsp--;


            	    				current.merge(this_Ingredient_4);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_NEW_LINE_5=(Token)match(input,RULE_NEW_LINE,FOLLOW_2); 

            			current.merge(this_NEW_LINE_5);
            		

            			newLeafNode(this_NEW_LINE_5, grammarAccess.getIngredientsBlockAccess().getNEW_LINETerminalRuleCall_5());
            		

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
    // InternalJPCoffe.g:275:1: entryRuleIngredient returns [String current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final String entryRuleIngredient() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIngredient = null;


        try {
            // InternalJPCoffe.g:275:50: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalJPCoffe.g:276:2: iv_ruleIngredient= ruleIngredient EOF
            {
             newCompositeNode(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngredient=ruleIngredient();

            state._fsp--;

             current =iv_ruleIngredient.getText(); 
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
    // InternalJPCoffe.g:282:1: ruleIngredient returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' this_SPACE_1= RULE_SPACE this_NAME_2= RULE_NAME this_Quantity_3= ruleQuantity this_NEW_LINE_4= RULE_NEW_LINE ) ;
    public final AntlrDatatypeRuleToken ruleIngredient() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SPACE_1=null;
        Token this_NAME_2=null;
        Token this_NEW_LINE_4=null;
        AntlrDatatypeRuleToken this_Quantity_3 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:288:2: ( (kw= '*' this_SPACE_1= RULE_SPACE this_NAME_2= RULE_NAME this_Quantity_3= ruleQuantity this_NEW_LINE_4= RULE_NEW_LINE ) )
            // InternalJPCoffe.g:289:2: (kw= '*' this_SPACE_1= RULE_SPACE this_NAME_2= RULE_NAME this_Quantity_3= ruleQuantity this_NEW_LINE_4= RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:289:2: (kw= '*' this_SPACE_1= RULE_SPACE this_NAME_2= RULE_NAME this_Quantity_3= ruleQuantity this_NEW_LINE_4= RULE_NEW_LINE )
            // InternalJPCoffe.g:290:3: kw= '*' this_SPACE_1= RULE_SPACE this_NAME_2= RULE_NAME this_Quantity_3= ruleQuantity this_NEW_LINE_4= RULE_NEW_LINE
            {
            kw=(Token)match(input,23,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIngredientAccess().getAsteriskKeyword_0());
            		
            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_17); 

            			current.merge(this_SPACE_1);
            		

            			newLeafNode(this_SPACE_1, grammarAccess.getIngredientAccess().getSPACETerminalRuleCall_1());
            		
            this_NAME_2=(Token)match(input,RULE_NAME,FOLLOW_11); 

            			current.merge(this_NAME_2);
            		

            			newLeafNode(this_NAME_2, grammarAccess.getIngredientAccess().getNAMETerminalRuleCall_2());
            		

            			newCompositeNode(grammarAccess.getIngredientAccess().getQuantityParserRuleCall_3());
            		
            pushFollow(FOLLOW_13);
            this_Quantity_3=ruleQuantity();

            state._fsp--;


            			current.merge(this_Quantity_3);
            		

            			afterParserOrEnumRuleCall();
            		
            this_NEW_LINE_4=(Token)match(input,RULE_NEW_LINE,FOLLOW_2); 

            			current.merge(this_NEW_LINE_4);
            		

            			newLeafNode(this_NEW_LINE_4, grammarAccess.getIngredientAccess().getNEW_LINETerminalRuleCall_4());
            		

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
    // InternalJPCoffe.g:330:1: entryRuleQuantity returns [String current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final String entryRuleQuantity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuantity = null;


        try {
            // InternalJPCoffe.g:330:48: (iv_ruleQuantity= ruleQuantity EOF )
            // InternalJPCoffe.g:331:2: iv_ruleQuantity= ruleQuantity EOF
            {
             newCompositeNode(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;

             current =iv_ruleQuantity.getText(); 
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
    // InternalJPCoffe.g:337:1: ruleQuantity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (this_METRIC_UNIT_1= RULE_METRIC_UNIT )? ) ;
    public final AntlrDatatypeRuleToken ruleQuantity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_METRIC_UNIT_1=null;


        	enterRule();

        try {
            // InternalJPCoffe.g:343:2: ( (this_INT_0= RULE_INT (this_METRIC_UNIT_1= RULE_METRIC_UNIT )? ) )
            // InternalJPCoffe.g:344:2: (this_INT_0= RULE_INT (this_METRIC_UNIT_1= RULE_METRIC_UNIT )? )
            {
            // InternalJPCoffe.g:344:2: (this_INT_0= RULE_INT (this_METRIC_UNIT_1= RULE_METRIC_UNIT )? )
            // InternalJPCoffe.g:345:3: this_INT_0= RULE_INT (this_METRIC_UNIT_1= RULE_METRIC_UNIT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getQuantityAccess().getINTTerminalRuleCall_0());
            		
            // InternalJPCoffe.g:352:3: (this_METRIC_UNIT_1= RULE_METRIC_UNIT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_METRIC_UNIT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJPCoffe.g:353:4: this_METRIC_UNIT_1= RULE_METRIC_UNIT
                    {
                    this_METRIC_UNIT_1=(Token)match(input,RULE_METRIC_UNIT,FOLLOW_2); 

                    				current.merge(this_METRIC_UNIT_1);
                    			

                    				newLeafNode(this_METRIC_UNIT_1, grammarAccess.getQuantityAccess().getMETRIC_UNITTerminalRuleCall_1());
                    			

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
    // InternalJPCoffe.g:365:1: entryRuleToolsBlock returns [String current=null] : iv_ruleToolsBlock= ruleToolsBlock EOF ;
    public final String entryRuleToolsBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleToolsBlock = null;


        try {
            // InternalJPCoffe.g:365:50: (iv_ruleToolsBlock= ruleToolsBlock EOF )
            // InternalJPCoffe.g:366:2: iv_ruleToolsBlock= ruleToolsBlock EOF
            {
             newCompositeNode(grammarAccess.getToolsBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToolsBlock=ruleToolsBlock();

            state._fsp--;

             current =iv_ruleToolsBlock.getText(); 
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
    // InternalJPCoffe.g:372:1: ruleToolsBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Tools' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Tool_4= ruleTool )* this_NEW_LINE_5= RULE_NEW_LINE ) ;
    public final AntlrDatatypeRuleToken ruleToolsBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NEW_LINE_1=null;
        Token this_TITLE_LINE_2=null;
        Token this_NEW_LINE_3=null;
        Token this_NEW_LINE_5=null;
        AntlrDatatypeRuleToken this_Tool_4 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:378:2: ( (kw= 'Tools' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Tool_4= ruleTool )* this_NEW_LINE_5= RULE_NEW_LINE ) )
            // InternalJPCoffe.g:379:2: (kw= 'Tools' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Tool_4= ruleTool )* this_NEW_LINE_5= RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:379:2: (kw= 'Tools' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Tool_4= ruleTool )* this_NEW_LINE_5= RULE_NEW_LINE )
            // InternalJPCoffe.g:380:3: kw= 'Tools' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Tool_4= ruleTool )* this_NEW_LINE_5= RULE_NEW_LINE
            {
            kw=(Token)match(input,24,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getToolsBlockAccess().getToolsKeyword_0());
            		
            this_NEW_LINE_1=(Token)match(input,RULE_NEW_LINE,FOLLOW_14); 

            			current.merge(this_NEW_LINE_1);
            		

            			newLeafNode(this_NEW_LINE_1, grammarAccess.getToolsBlockAccess().getNEW_LINETerminalRuleCall_1());
            		
            this_TITLE_LINE_2=(Token)match(input,RULE_TITLE_LINE,FOLLOW_13); 

            			current.merge(this_TITLE_LINE_2);
            		

            			newLeafNode(this_TITLE_LINE_2, grammarAccess.getToolsBlockAccess().getTITLE_LINETerminalRuleCall_2());
            		
            this_NEW_LINE_3=(Token)match(input,RULE_NEW_LINE,FOLLOW_15); 

            			current.merge(this_NEW_LINE_3);
            		

            			newLeafNode(this_NEW_LINE_3, grammarAccess.getToolsBlockAccess().getNEW_LINETerminalRuleCall_3());
            		
            // InternalJPCoffe.g:406:3: (this_Tool_4= ruleTool )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJPCoffe.g:407:4: this_Tool_4= ruleTool
            	    {

            	    				newCompositeNode(grammarAccess.getToolsBlockAccess().getToolParserRuleCall_4());
            	    			
            	    pushFollow(FOLLOW_15);
            	    this_Tool_4=ruleTool();

            	    state._fsp--;


            	    				current.merge(this_Tool_4);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_NEW_LINE_5=(Token)match(input,RULE_NEW_LINE,FOLLOW_2); 

            			current.merge(this_NEW_LINE_5);
            		

            			newLeafNode(this_NEW_LINE_5, grammarAccess.getToolsBlockAccess().getNEW_LINETerminalRuleCall_5());
            		

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
    // InternalJPCoffe.g:429:1: entryRuleTool returns [String current=null] : iv_ruleTool= ruleTool EOF ;
    public final String entryRuleTool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTool = null;


        try {
            // InternalJPCoffe.g:429:44: (iv_ruleTool= ruleTool EOF )
            // InternalJPCoffe.g:430:2: iv_ruleTool= ruleTool EOF
            {
             newCompositeNode(grammarAccess.getToolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTool=ruleTool();

            state._fsp--;

             current =iv_ruleTool.getText(); 
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
    // InternalJPCoffe.g:436:1: ruleTool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' this_SPACE_1= RULE_SPACE this_NAME_2= RULE_NAME this_NEW_LINE_3= RULE_NEW_LINE ) ;
    public final AntlrDatatypeRuleToken ruleTool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SPACE_1=null;
        Token this_NAME_2=null;
        Token this_NEW_LINE_3=null;


        	enterRule();

        try {
            // InternalJPCoffe.g:442:2: ( (kw= '*' this_SPACE_1= RULE_SPACE this_NAME_2= RULE_NAME this_NEW_LINE_3= RULE_NEW_LINE ) )
            // InternalJPCoffe.g:443:2: (kw= '*' this_SPACE_1= RULE_SPACE this_NAME_2= RULE_NAME this_NEW_LINE_3= RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:443:2: (kw= '*' this_SPACE_1= RULE_SPACE this_NAME_2= RULE_NAME this_NEW_LINE_3= RULE_NEW_LINE )
            // InternalJPCoffe.g:444:3: kw= '*' this_SPACE_1= RULE_SPACE this_NAME_2= RULE_NAME this_NEW_LINE_3= RULE_NEW_LINE
            {
            kw=(Token)match(input,23,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getToolAccess().getAsteriskKeyword_0());
            		
            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_17); 

            			current.merge(this_SPACE_1);
            		

            			newLeafNode(this_SPACE_1, grammarAccess.getToolAccess().getSPACETerminalRuleCall_1());
            		
            this_NAME_2=(Token)match(input,RULE_NAME,FOLLOW_13); 

            			current.merge(this_NAME_2);
            		

            			newLeafNode(this_NAME_2, grammarAccess.getToolAccess().getNAMETerminalRuleCall_2());
            		
            this_NEW_LINE_3=(Token)match(input,RULE_NEW_LINE,FOLLOW_2); 

            			current.merge(this_NEW_LINE_3);
            		

            			newLeafNode(this_NEW_LINE_3, grammarAccess.getToolAccess().getNEW_LINETerminalRuleCall_3());
            		

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
    // InternalJPCoffe.g:474:1: entryRuleStepsBlock returns [String current=null] : iv_ruleStepsBlock= ruleStepsBlock EOF ;
    public final String entryRuleStepsBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepsBlock = null;


        try {
            // InternalJPCoffe.g:474:50: (iv_ruleStepsBlock= ruleStepsBlock EOF )
            // InternalJPCoffe.g:475:2: iv_ruleStepsBlock= ruleStepsBlock EOF
            {
             newCompositeNode(grammarAccess.getStepsBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepsBlock=ruleStepsBlock();

            state._fsp--;

             current =iv_ruleStepsBlock.getText(); 
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
    // InternalJPCoffe.g:481:1: ruleStepsBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Steps' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Step_4= ruleStep )* this_NEW_LINE_5= RULE_NEW_LINE ) ;
    public final AntlrDatatypeRuleToken ruleStepsBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NEW_LINE_1=null;
        Token this_TITLE_LINE_2=null;
        Token this_NEW_LINE_3=null;
        Token this_NEW_LINE_5=null;
        AntlrDatatypeRuleToken this_Step_4 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:487:2: ( (kw= 'Steps' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Step_4= ruleStep )* this_NEW_LINE_5= RULE_NEW_LINE ) )
            // InternalJPCoffe.g:488:2: (kw= 'Steps' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Step_4= ruleStep )* this_NEW_LINE_5= RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:488:2: (kw= 'Steps' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Step_4= ruleStep )* this_NEW_LINE_5= RULE_NEW_LINE )
            // InternalJPCoffe.g:489:3: kw= 'Steps' this_NEW_LINE_1= RULE_NEW_LINE this_TITLE_LINE_2= RULE_TITLE_LINE this_NEW_LINE_3= RULE_NEW_LINE (this_Step_4= ruleStep )* this_NEW_LINE_5= RULE_NEW_LINE
            {
            kw=(Token)match(input,25,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getStepsBlockAccess().getStepsKeyword_0());
            		
            this_NEW_LINE_1=(Token)match(input,RULE_NEW_LINE,FOLLOW_14); 

            			current.merge(this_NEW_LINE_1);
            		

            			newLeafNode(this_NEW_LINE_1, grammarAccess.getStepsBlockAccess().getNEW_LINETerminalRuleCall_1());
            		
            this_TITLE_LINE_2=(Token)match(input,RULE_TITLE_LINE,FOLLOW_13); 

            			current.merge(this_TITLE_LINE_2);
            		

            			newLeafNode(this_TITLE_LINE_2, grammarAccess.getStepsBlockAccess().getTITLE_LINETerminalRuleCall_2());
            		
            this_NEW_LINE_3=(Token)match(input,RULE_NEW_LINE,FOLLOW_19); 

            			current.merge(this_NEW_LINE_3);
            		

            			newLeafNode(this_NEW_LINE_3, grammarAccess.getStepsBlockAccess().getNEW_LINETerminalRuleCall_3());
            		
            // InternalJPCoffe.g:515:3: (this_Step_4= ruleStep )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJPCoffe.g:516:4: this_Step_4= ruleStep
            	    {

            	    				newCompositeNode(grammarAccess.getStepsBlockAccess().getStepParserRuleCall_4());
            	    			
            	    pushFollow(FOLLOW_19);
            	    this_Step_4=ruleStep();

            	    state._fsp--;


            	    				current.merge(this_Step_4);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            this_NEW_LINE_5=(Token)match(input,RULE_NEW_LINE,FOLLOW_2); 

            			current.merge(this_NEW_LINE_5);
            		

            			newLeafNode(this_NEW_LINE_5, grammarAccess.getStepsBlockAccess().getNEW_LINETerminalRuleCall_5());
            		

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
    // InternalJPCoffe.g:538:1: entryRuleStep returns [String current=null] : iv_ruleStep= ruleStep EOF ;
    public final String entryRuleStep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStep = null;


        try {
            // InternalJPCoffe.g:538:44: (iv_ruleStep= ruleStep EOF )
            // InternalJPCoffe.g:539:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep.getText(); 
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
    // InternalJPCoffe.g:545:1: ruleStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (this_INT_1= RULE_INT )? (kw= ',' this_INT_3= RULE_INT )* kw= '}' this_SPACE_5= RULE_SPACE kw= '->' this_SPACE_7= RULE_SPACE this_INT_8= RULE_INT kw= '.' this_SPACE_10= RULE_SPACE this_TEXT_11= RULE_TEXT this_NEW_LINE_12= RULE_NEW_LINE ) ;
    public final AntlrDatatypeRuleToken ruleStep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_SPACE_5=null;
        Token this_SPACE_7=null;
        Token this_INT_8=null;
        Token this_SPACE_10=null;
        Token this_TEXT_11=null;
        Token this_NEW_LINE_12=null;


        	enterRule();

        try {
            // InternalJPCoffe.g:551:2: ( (kw= '{' (this_INT_1= RULE_INT )? (kw= ',' this_INT_3= RULE_INT )* kw= '}' this_SPACE_5= RULE_SPACE kw= '->' this_SPACE_7= RULE_SPACE this_INT_8= RULE_INT kw= '.' this_SPACE_10= RULE_SPACE this_TEXT_11= RULE_TEXT this_NEW_LINE_12= RULE_NEW_LINE ) )
            // InternalJPCoffe.g:552:2: (kw= '{' (this_INT_1= RULE_INT )? (kw= ',' this_INT_3= RULE_INT )* kw= '}' this_SPACE_5= RULE_SPACE kw= '->' this_SPACE_7= RULE_SPACE this_INT_8= RULE_INT kw= '.' this_SPACE_10= RULE_SPACE this_TEXT_11= RULE_TEXT this_NEW_LINE_12= RULE_NEW_LINE )
            {
            // InternalJPCoffe.g:552:2: (kw= '{' (this_INT_1= RULE_INT )? (kw= ',' this_INT_3= RULE_INT )* kw= '}' this_SPACE_5= RULE_SPACE kw= '->' this_SPACE_7= RULE_SPACE this_INT_8= RULE_INT kw= '.' this_SPACE_10= RULE_SPACE this_TEXT_11= RULE_TEXT this_NEW_LINE_12= RULE_NEW_LINE )
            // InternalJPCoffe.g:553:3: kw= '{' (this_INT_1= RULE_INT )? (kw= ',' this_INT_3= RULE_INT )* kw= '}' this_SPACE_5= RULE_SPACE kw= '->' this_SPACE_7= RULE_SPACE this_INT_8= RULE_INT kw= '.' this_SPACE_10= RULE_SPACE this_TEXT_11= RULE_TEXT this_NEW_LINE_12= RULE_NEW_LINE
            {
            kw=(Token)match(input,18,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalJPCoffe.g:558:3: (this_INT_1= RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJPCoffe.g:559:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_21); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getStepAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalJPCoffe.g:567:3: (kw= ',' this_INT_3= RULE_INT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJPCoffe.g:568:4: kw= ',' this_INT_3= RULE_INT
            	    {
            	    kw=(Token)match(input,26,FOLLOW_11); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getStepAccess().getCommaKeyword_2_0());
            	    			
            	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_21); 

            	    				current.merge(this_INT_3);
            	    			

            	    				newLeafNode(this_INT_3, grammarAccess.getStepAccess().getINTTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            kw=(Token)match(input,19,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_3());
            		
            this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_22); 

            			current.merge(this_SPACE_5);
            		

            			newLeafNode(this_SPACE_5, grammarAccess.getStepAccess().getSPACETerminalRuleCall_4());
            		
            kw=(Token)match(input,27,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getStepAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            this_SPACE_7=(Token)match(input,RULE_SPACE,FOLLOW_11); 

            			current.merge(this_SPACE_7);
            		

            			newLeafNode(this_SPACE_7, grammarAccess.getStepAccess().getSPACETerminalRuleCall_6());
            		
            this_INT_8=(Token)match(input,RULE_INT,FOLLOW_23); 

            			current.merge(this_INT_8);
            		

            			newLeafNode(this_INT_8, grammarAccess.getStepAccess().getINTTerminalRuleCall_7());
            		
            kw=(Token)match(input,28,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getStepAccess().getFullStopKeyword_8());
            		
            this_SPACE_10=(Token)match(input,RULE_SPACE,FOLLOW_24); 

            			current.merge(this_SPACE_10);
            		

            			newLeafNode(this_SPACE_10, grammarAccess.getStepAccess().getSPACETerminalRuleCall_9());
            		
            this_TEXT_11=(Token)match(input,RULE_TEXT,FOLLOW_13); 

            			current.merge(this_TEXT_11);
            		

            			newLeafNode(this_TEXT_11, grammarAccess.getStepAccess().getTEXTTerminalRuleCall_10());
            		
            this_NEW_LINE_12=(Token)match(input,RULE_NEW_LINE,FOLLOW_2); 

            			current.merge(this_NEW_LINE_12);
            		

            			newLeafNode(this_NEW_LINE_12, grammarAccess.getStepAccess().getNEW_LINETerminalRuleCall_11());
            		

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004080020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000800L});

}