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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_TITLE_LINE", "RULE_METRIC_UNIT", "RULE_MAJ_WORD", "RULE_WORD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'use'", "'recipe'", "'in'", "'Recipe'", "'{'", "'}'", "'For'", "'people'", "'Ingredients'", "'*'", "'GROUP'", "'['", "']'", "'OR'", "'AS'", "'Tools'", "'Steps'", "','", "'->'", "'.'", "'IF'", "'THEN'"
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
    public static final int RULE_MAJ_WORD=8;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_TITLE_LINE=6;
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
    // InternalJPCoffe.g:71:1: ruleMain returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_recipes_1_0= ruleRecipe ) )+ ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_imports_0_0 = null;

        EObject lv_recipes_1_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_recipes_1_0= ruleRecipe ) )+ ) )
            // InternalJPCoffe.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_recipes_1_0= ruleRecipe ) )+ )
            {
            // InternalJPCoffe.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_recipes_1_0= ruleRecipe ) )+ )
            // InternalJPCoffe.g:79:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_recipes_1_0= ruleRecipe ) )+
            {
            // InternalJPCoffe.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJPCoffe.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalJPCoffe.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalJPCoffe.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getMainAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"edu.imt.dsl.jpcoffe.JPCoffe.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalJPCoffe.g:98:3: ( (lv_recipes_1_0= ruleRecipe ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJPCoffe.g:99:4: (lv_recipes_1_0= ruleRecipe )
            	    {
            	    // InternalJPCoffe.g:99:4: (lv_recipes_1_0= ruleRecipe )
            	    // InternalJPCoffe.g:100:5: lv_recipes_1_0= ruleRecipe
            	    {

            	    					newCompositeNode(grammarAccess.getMainAccess().getRecipesRecipeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_recipes_1_0=ruleRecipe();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"recipes",
            	    						lv_recipes_1_0,
            	    						"edu.imt.dsl.jpcoffe.JPCoffe.Recipe");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleImport"
    // InternalJPCoffe.g:121:1: entryRuleImport returns [String current=null] : iv_ruleImport= ruleImport EOF ;
    public final String entryRuleImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImport = null;


        try {
            // InternalJPCoffe.g:121:46: (iv_ruleImport= ruleImport EOF )
            // InternalJPCoffe.g:122:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport.getText(); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalJPCoffe.g:128:1: ruleImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'use' kw= 'recipe' this_NAME_2= ruleNAME kw= 'in' this_STRING_4= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_4=null;
        AntlrDatatypeRuleToken this_NAME_2 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:134:2: ( (kw= 'use' kw= 'recipe' this_NAME_2= ruleNAME kw= 'in' this_STRING_4= RULE_STRING ) )
            // InternalJPCoffe.g:135:2: (kw= 'use' kw= 'recipe' this_NAME_2= ruleNAME kw= 'in' this_STRING_4= RULE_STRING )
            {
            // InternalJPCoffe.g:135:2: (kw= 'use' kw= 'recipe' this_NAME_2= ruleNAME kw= 'in' this_STRING_4= RULE_STRING )
            // InternalJPCoffe.g:136:3: kw= 'use' kw= 'recipe' this_NAME_2= ruleNAME kw= 'in' this_STRING_4= RULE_STRING
            {
            kw=(Token)match(input,13,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportAccess().getUseKeyword_0());
            		
            kw=(Token)match(input,14,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportAccess().getRecipeKeyword_1());
            		

            			newCompositeNode(grammarAccess.getImportAccess().getNAMEParserRuleCall_2());
            		
            pushFollow(FOLLOW_7);
            this_NAME_2=ruleNAME();

            state._fsp--;


            			current.merge(this_NAME_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,15,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportAccess().getInKeyword_3());
            		
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_4);
            		

            			newLeafNode(this_STRING_4, grammarAccess.getImportAccess().getSTRINGTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleRecipe"
    // InternalJPCoffe.g:172:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // InternalJPCoffe.g:172:47: (iv_ruleRecipe= ruleRecipe EOF )
            // InternalJPCoffe.g:173:2: iv_ruleRecipe= ruleRecipe EOF
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
    // InternalJPCoffe.g:179:1: ruleRecipe returns [EObject current=null] : (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_portion_3_0= rulePortionNB ) ) ( (lv_ingredients_4_0= ruleIngredientsBlock ) ) ( (lv_tools_5_0= ruleToolsBlock ) ) ( (lv_steps_6_0= ruleStepsBlock ) ) otherlv_7= '}' ) ;
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
            // InternalJPCoffe.g:185:2: ( (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_portion_3_0= rulePortionNB ) ) ( (lv_ingredients_4_0= ruleIngredientsBlock ) ) ( (lv_tools_5_0= ruleToolsBlock ) ) ( (lv_steps_6_0= ruleStepsBlock ) ) otherlv_7= '}' ) )
            // InternalJPCoffe.g:186:2: (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_portion_3_0= rulePortionNB ) ) ( (lv_ingredients_4_0= ruleIngredientsBlock ) ) ( (lv_tools_5_0= ruleToolsBlock ) ) ( (lv_steps_6_0= ruleStepsBlock ) ) otherlv_7= '}' )
            {
            // InternalJPCoffe.g:186:2: (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_portion_3_0= rulePortionNB ) ) ( (lv_ingredients_4_0= ruleIngredientsBlock ) ) ( (lv_tools_5_0= ruleToolsBlock ) ) ( (lv_steps_6_0= ruleStepsBlock ) ) otherlv_7= '}' )
            // InternalJPCoffe.g:187:3: otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_portion_3_0= rulePortionNB ) ) ( (lv_ingredients_4_0= ruleIngredientsBlock ) ) ( (lv_tools_5_0= ruleToolsBlock ) ) ( (lv_steps_6_0= ruleStepsBlock ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRecipeAccess().getRecipeKeyword_0());
            		
            // InternalJPCoffe.g:191:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalJPCoffe.g:192:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalJPCoffe.g:192:4: (lv_name_1_0= RULE_STRING )
            // InternalJPCoffe.g:193:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJPCoffe.g:213:3: ( (lv_portion_3_0= rulePortionNB ) )
            // InternalJPCoffe.g:214:4: (lv_portion_3_0= rulePortionNB )
            {
            // InternalJPCoffe.g:214:4: (lv_portion_3_0= rulePortionNB )
            // InternalJPCoffe.g:215:5: lv_portion_3_0= rulePortionNB
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getPortionPortionNBParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalJPCoffe.g:232:3: ( (lv_ingredients_4_0= ruleIngredientsBlock ) )
            // InternalJPCoffe.g:233:4: (lv_ingredients_4_0= ruleIngredientsBlock )
            {
            // InternalJPCoffe.g:233:4: (lv_ingredients_4_0= ruleIngredientsBlock )
            // InternalJPCoffe.g:234:5: lv_ingredients_4_0= ruleIngredientsBlock
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsIngredientsBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalJPCoffe.g:251:3: ( (lv_tools_5_0= ruleToolsBlock ) )
            // InternalJPCoffe.g:252:4: (lv_tools_5_0= ruleToolsBlock )
            {
            // InternalJPCoffe.g:252:4: (lv_tools_5_0= ruleToolsBlock )
            // InternalJPCoffe.g:253:5: lv_tools_5_0= ruleToolsBlock
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getToolsToolsBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalJPCoffe.g:270:3: ( (lv_steps_6_0= ruleStepsBlock ) )
            // InternalJPCoffe.g:271:4: (lv_steps_6_0= ruleStepsBlock )
            {
            // InternalJPCoffe.g:271:4: (lv_steps_6_0= ruleStepsBlock )
            // InternalJPCoffe.g:272:5: lv_steps_6_0= ruleStepsBlock
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getStepsStepsBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

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
    // InternalJPCoffe.g:297:1: entryRulePortionNB returns [EObject current=null] : iv_rulePortionNB= rulePortionNB EOF ;
    public final EObject entryRulePortionNB() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortionNB = null;


        try {
            // InternalJPCoffe.g:297:50: (iv_rulePortionNB= rulePortionNB EOF )
            // InternalJPCoffe.g:298:2: iv_rulePortionNB= rulePortionNB EOF
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
    // InternalJPCoffe.g:304:1: rulePortionNB returns [EObject current=null] : (otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )? ) ;
    public final EObject rulePortionNB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nb_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJPCoffe.g:310:2: ( (otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )? ) )
            // InternalJPCoffe.g:311:2: (otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )? )
            {
            // InternalJPCoffe.g:311:2: (otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )? )
            // InternalJPCoffe.g:312:3: otherlv_0= 'For' ( (lv_nb_1_0= RULE_INT ) ) (otherlv_2= 'people' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPortionNBAccess().getForKeyword_0());
            		
            // InternalJPCoffe.g:316:3: ( (lv_nb_1_0= RULE_INT ) )
            // InternalJPCoffe.g:317:4: (lv_nb_1_0= RULE_INT )
            {
            // InternalJPCoffe.g:317:4: (lv_nb_1_0= RULE_INT )
            // InternalJPCoffe.g:318:5: lv_nb_1_0= RULE_INT
            {
            lv_nb_1_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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

            // InternalJPCoffe.g:334:3: (otherlv_2= 'people' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJPCoffe.g:335:4: otherlv_2= 'people'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

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
    // InternalJPCoffe.g:344:1: entryRuleIngredientsBlock returns [EObject current=null] : iv_ruleIngredientsBlock= ruleIngredientsBlock EOF ;
    public final EObject entryRuleIngredientsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredientsBlock = null;


        try {
            // InternalJPCoffe.g:344:57: (iv_ruleIngredientsBlock= ruleIngredientsBlock EOF )
            // InternalJPCoffe.g:345:2: iv_ruleIngredientsBlock= ruleIngredientsBlock EOF
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
    // InternalJPCoffe.g:351:1: ruleIngredientsBlock returns [EObject current=null] : ( () otherlv_1= 'Ingredients' this_TITLE_LINE_2= RULE_TITLE_LINE ( ( (lv_ingredientsList_3_1= ruleIngredientsGroup | lv_ingredientsList_3_2= ruleIngredient ) ) )* ) ;
    public final EObject ruleIngredientsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_TITLE_LINE_2=null;
        EObject lv_ingredientsList_3_1 = null;

        EObject lv_ingredientsList_3_2 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:357:2: ( ( () otherlv_1= 'Ingredients' this_TITLE_LINE_2= RULE_TITLE_LINE ( ( (lv_ingredientsList_3_1= ruleIngredientsGroup | lv_ingredientsList_3_2= ruleIngredient ) ) )* ) )
            // InternalJPCoffe.g:358:2: ( () otherlv_1= 'Ingredients' this_TITLE_LINE_2= RULE_TITLE_LINE ( ( (lv_ingredientsList_3_1= ruleIngredientsGroup | lv_ingredientsList_3_2= ruleIngredient ) ) )* )
            {
            // InternalJPCoffe.g:358:2: ( () otherlv_1= 'Ingredients' this_TITLE_LINE_2= RULE_TITLE_LINE ( ( (lv_ingredientsList_3_1= ruleIngredientsGroup | lv_ingredientsList_3_2= ruleIngredient ) ) )* )
            // InternalJPCoffe.g:359:3: () otherlv_1= 'Ingredients' this_TITLE_LINE_2= RULE_TITLE_LINE ( ( (lv_ingredientsList_3_1= ruleIngredientsGroup | lv_ingredientsList_3_2= ruleIngredient ) ) )*
            {
            // InternalJPCoffe.g:359:3: ()
            // InternalJPCoffe.g:360:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIngredientsBlockAccess().getIngredientsBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getIngredientsBlockAccess().getIngredientsKeyword_1());
            		
            this_TITLE_LINE_2=(Token)match(input,RULE_TITLE_LINE,FOLLOW_18); 

            			newLeafNode(this_TITLE_LINE_2, grammarAccess.getIngredientsBlockAccess().getTITLE_LINETerminalRuleCall_2());
            		
            // InternalJPCoffe.g:374:3: ( ( (lv_ingredientsList_3_1= ruleIngredientsGroup | lv_ingredientsList_3_2= ruleIngredient ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJPCoffe.g:375:4: ( (lv_ingredientsList_3_1= ruleIngredientsGroup | lv_ingredientsList_3_2= ruleIngredient ) )
            	    {
            	    // InternalJPCoffe.g:375:4: ( (lv_ingredientsList_3_1= ruleIngredientsGroup | lv_ingredientsList_3_2= ruleIngredient ) )
            	    // InternalJPCoffe.g:376:5: (lv_ingredientsList_3_1= ruleIngredientsGroup | lv_ingredientsList_3_2= ruleIngredient )
            	    {
            	    // InternalJPCoffe.g:376:5: (lv_ingredientsList_3_1= ruleIngredientsGroup | lv_ingredientsList_3_2= ruleIngredient )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==22) ) {
            	        int LA4_1 = input.LA(2);

            	        if ( (LA4_1==RULE_MAJ_WORD) ) {
            	            alt4=2;
            	        }
            	        else if ( (LA4_1==23) ) {
            	            alt4=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 4, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalJPCoffe.g:377:6: lv_ingredientsList_3_1= ruleIngredientsGroup
            	            {

            	            						newCompositeNode(grammarAccess.getIngredientsBlockAccess().getIngredientsListIngredientsGroupParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_18);
            	            lv_ingredientsList_3_1=ruleIngredientsGroup();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getIngredientsBlockRule());
            	            						}
            	            						add(
            	            							current,
            	            							"ingredientsList",
            	            							lv_ingredientsList_3_1,
            	            							"edu.imt.dsl.jpcoffe.JPCoffe.IngredientsGroup");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalJPCoffe.g:393:6: lv_ingredientsList_3_2= ruleIngredient
            	            {

            	            						newCompositeNode(grammarAccess.getIngredientsBlockAccess().getIngredientsListIngredientParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_18);
            	            lv_ingredientsList_3_2=ruleIngredient();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getIngredientsBlockRule());
            	            						}
            	            						add(
            	            							current,
            	            							"ingredientsList",
            	            							lv_ingredientsList_3_2,
            	            							"edu.imt.dsl.jpcoffe.JPCoffe.Ingredient");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


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
    // $ANTLR end "ruleIngredientsBlock"


    // $ANTLR start "entryRuleIngredientsGroup"
    // InternalJPCoffe.g:415:1: entryRuleIngredientsGroup returns [EObject current=null] : iv_ruleIngredientsGroup= ruleIngredientsGroup EOF ;
    public final EObject entryRuleIngredientsGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredientsGroup = null;


        try {
            // InternalJPCoffe.g:415:57: (iv_ruleIngredientsGroup= ruleIngredientsGroup EOF )
            // InternalJPCoffe.g:416:2: iv_ruleIngredientsGroup= ruleIngredientsGroup EOF
            {
             newCompositeNode(grammarAccess.getIngredientsGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngredientsGroup=ruleIngredientsGroup();

            state._fsp--;

             current =iv_ruleIngredientsGroup; 
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
    // $ANTLR end "entryRuleIngredientsGroup"


    // $ANTLR start "ruleIngredientsGroup"
    // InternalJPCoffe.g:422:1: ruleIngredientsGroup returns [EObject current=null] : (otherlv_0= '*' otherlv_1= 'GROUP' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[' ( (lv_ingredientsList_4_0= ruleIngredient ) )* otherlv_5= ']' ( (lv_quantity_6_0= ruleQuantity ) )? ) ;
    public final EObject ruleIngredientsGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ingredientsList_4_0 = null;

        EObject lv_quantity_6_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:428:2: ( (otherlv_0= '*' otherlv_1= 'GROUP' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[' ( (lv_ingredientsList_4_0= ruleIngredient ) )* otherlv_5= ']' ( (lv_quantity_6_0= ruleQuantity ) )? ) )
            // InternalJPCoffe.g:429:2: (otherlv_0= '*' otherlv_1= 'GROUP' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[' ( (lv_ingredientsList_4_0= ruleIngredient ) )* otherlv_5= ']' ( (lv_quantity_6_0= ruleQuantity ) )? )
            {
            // InternalJPCoffe.g:429:2: (otherlv_0= '*' otherlv_1= 'GROUP' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[' ( (lv_ingredientsList_4_0= ruleIngredient ) )* otherlv_5= ']' ( (lv_quantity_6_0= ruleQuantity ) )? )
            // InternalJPCoffe.g:430:3: otherlv_0= '*' otherlv_1= 'GROUP' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '[' ( (lv_ingredientsList_4_0= ruleIngredient ) )* otherlv_5= ']' ( (lv_quantity_6_0= ruleQuantity ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getIngredientsGroupAccess().getAsteriskKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIngredientsGroupAccess().getGROUPKeyword_1());
            		
            // InternalJPCoffe.g:438:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalJPCoffe.g:439:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalJPCoffe.g:439:4: (lv_name_2_0= RULE_STRING )
            // InternalJPCoffe.g:440:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getIngredientsGroupAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngredientsGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getIngredientsGroupAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalJPCoffe.g:460:3: ( (lv_ingredientsList_4_0= ruleIngredient ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJPCoffe.g:461:4: (lv_ingredientsList_4_0= ruleIngredient )
            	    {
            	    // InternalJPCoffe.g:461:4: (lv_ingredientsList_4_0= ruleIngredient )
            	    // InternalJPCoffe.g:462:5: lv_ingredientsList_4_0= ruleIngredient
            	    {

            	    					newCompositeNode(grammarAccess.getIngredientsGroupAccess().getIngredientsListIngredientParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_ingredientsList_4_0=ruleIngredient();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIngredientsGroupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ingredientsList",
            	    						lv_ingredientsList_4_0,
            	    						"edu.imt.dsl.jpcoffe.JPCoffe.Ingredient");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getIngredientsGroupAccess().getRightSquareBracketKeyword_5());
            		
            // InternalJPCoffe.g:483:3: ( (lv_quantity_6_0= ruleQuantity ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJPCoffe.g:484:4: (lv_quantity_6_0= ruleQuantity )
                    {
                    // InternalJPCoffe.g:484:4: (lv_quantity_6_0= ruleQuantity )
                    // InternalJPCoffe.g:485:5: lv_quantity_6_0= ruleQuantity
                    {

                    					newCompositeNode(grammarAccess.getIngredientsGroupAccess().getQuantityQuantityParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_quantity_6_0=ruleQuantity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIngredientsGroupRule());
                    					}
                    					set(
                    						current,
                    						"quantity",
                    						lv_quantity_6_0,
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
    // $ANTLR end "ruleIngredientsGroup"


    // $ANTLR start "entryRuleIngredient"
    // InternalJPCoffe.g:506:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // InternalJPCoffe.g:506:51: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalJPCoffe.g:507:2: iv_ruleIngredient= ruleIngredient EOF
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
    // InternalJPCoffe.g:513:1: ruleIngredient returns [EObject current=null] : (otherlv_0= '*' ( ( (lv_originalName_1_0= ruleNAME ) ) (otherlv_2= 'OR' ( (lv_originalName_3_0= ruleNAME ) ) )* otherlv_4= 'AS' )? ( (lv_name_5_0= ruleNAME ) ) ( (lv_quantity_6_0= ruleQuantity ) )? ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_originalName_1_0 = null;

        AntlrDatatypeRuleToken lv_originalName_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_quantity_6_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:519:2: ( (otherlv_0= '*' ( ( (lv_originalName_1_0= ruleNAME ) ) (otherlv_2= 'OR' ( (lv_originalName_3_0= ruleNAME ) ) )* otherlv_4= 'AS' )? ( (lv_name_5_0= ruleNAME ) ) ( (lv_quantity_6_0= ruleQuantity ) )? ) )
            // InternalJPCoffe.g:520:2: (otherlv_0= '*' ( ( (lv_originalName_1_0= ruleNAME ) ) (otherlv_2= 'OR' ( (lv_originalName_3_0= ruleNAME ) ) )* otherlv_4= 'AS' )? ( (lv_name_5_0= ruleNAME ) ) ( (lv_quantity_6_0= ruleQuantity ) )? )
            {
            // InternalJPCoffe.g:520:2: (otherlv_0= '*' ( ( (lv_originalName_1_0= ruleNAME ) ) (otherlv_2= 'OR' ( (lv_originalName_3_0= ruleNAME ) ) )* otherlv_4= 'AS' )? ( (lv_name_5_0= ruleNAME ) ) ( (lv_quantity_6_0= ruleQuantity ) )? )
            // InternalJPCoffe.g:521:3: otherlv_0= '*' ( ( (lv_originalName_1_0= ruleNAME ) ) (otherlv_2= 'OR' ( (lv_originalName_3_0= ruleNAME ) ) )* otherlv_4= 'AS' )? ( (lv_name_5_0= ruleNAME ) ) ( (lv_quantity_6_0= ruleQuantity ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIngredientAccess().getAsteriskKeyword_0());
            		
            // InternalJPCoffe.g:525:3: ( ( (lv_originalName_1_0= ruleNAME ) ) (otherlv_2= 'OR' ( (lv_originalName_3_0= ruleNAME ) ) )* otherlv_4= 'AS' )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalJPCoffe.g:526:4: ( (lv_originalName_1_0= ruleNAME ) ) (otherlv_2= 'OR' ( (lv_originalName_3_0= ruleNAME ) ) )* otherlv_4= 'AS'
                    {
                    // InternalJPCoffe.g:526:4: ( (lv_originalName_1_0= ruleNAME ) )
                    // InternalJPCoffe.g:527:5: (lv_originalName_1_0= ruleNAME )
                    {
                    // InternalJPCoffe.g:527:5: (lv_originalName_1_0= ruleNAME )
                    // InternalJPCoffe.g:528:6: lv_originalName_1_0= ruleNAME
                    {

                    						newCompositeNode(grammarAccess.getIngredientAccess().getOriginalNameNAMEParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_originalName_1_0=ruleNAME();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngredientRule());
                    						}
                    						add(
                    							current,
                    							"originalName",
                    							lv_originalName_1_0,
                    							"edu.imt.dsl.jpcoffe.JPCoffe.NAME");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJPCoffe.g:545:4: (otherlv_2= 'OR' ( (lv_originalName_3_0= ruleNAME ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==26) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalJPCoffe.g:546:5: otherlv_2= 'OR' ( (lv_originalName_3_0= ruleNAME ) )
                    	    {
                    	    otherlv_2=(Token)match(input,26,FOLLOW_6); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getIngredientAccess().getORKeyword_1_1_0());
                    	    				
                    	    // InternalJPCoffe.g:550:5: ( (lv_originalName_3_0= ruleNAME ) )
                    	    // InternalJPCoffe.g:551:6: (lv_originalName_3_0= ruleNAME )
                    	    {
                    	    // InternalJPCoffe.g:551:6: (lv_originalName_3_0= ruleNAME )
                    	    // InternalJPCoffe.g:552:7: lv_originalName_3_0= ruleNAME
                    	    {

                    	    							newCompositeNode(grammarAccess.getIngredientAccess().getOriginalNameNAMEParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_originalName_3_0=ruleNAME();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIngredientRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"originalName",
                    	    								lv_originalName_3_0,
                    	    								"edu.imt.dsl.jpcoffe.JPCoffe.NAME");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getIngredientAccess().getASKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalJPCoffe.g:575:3: ( (lv_name_5_0= ruleNAME ) )
            // InternalJPCoffe.g:576:4: (lv_name_5_0= ruleNAME )
            {
            // InternalJPCoffe.g:576:4: (lv_name_5_0= ruleNAME )
            // InternalJPCoffe.g:577:5: lv_name_5_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getIngredientAccess().getNameNAMEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_5_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngredientRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJPCoffe.g:594:3: ( (lv_quantity_6_0= ruleQuantity ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJPCoffe.g:595:4: (lv_quantity_6_0= ruleQuantity )
                    {
                    // InternalJPCoffe.g:595:4: (lv_quantity_6_0= ruleQuantity )
                    // InternalJPCoffe.g:596:5: lv_quantity_6_0= ruleQuantity
                    {

                    					newCompositeNode(grammarAccess.getIngredientAccess().getQuantityQuantityParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_quantity_6_0=ruleQuantity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIngredientRule());
                    					}
                    					set(
                    						current,
                    						"quantity",
                    						lv_quantity_6_0,
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
    // InternalJPCoffe.g:617:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // InternalJPCoffe.g:617:49: (iv_ruleQuantity= ruleQuantity EOF )
            // InternalJPCoffe.g:618:2: iv_ruleQuantity= ruleQuantity EOF
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
    // InternalJPCoffe.g:624:1: ruleQuantity returns [EObject current=null] : ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_METRIC_UNIT ) )? ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        Token lv_amount_0_0=null;
        Token lv_unit_1_0=null;


        	enterRule();

        try {
            // InternalJPCoffe.g:630:2: ( ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_METRIC_UNIT ) )? ) )
            // InternalJPCoffe.g:631:2: ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_METRIC_UNIT ) )? )
            {
            // InternalJPCoffe.g:631:2: ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_METRIC_UNIT ) )? )
            // InternalJPCoffe.g:632:3: ( (lv_amount_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_METRIC_UNIT ) )?
            {
            // InternalJPCoffe.g:632:3: ( (lv_amount_0_0= RULE_INT ) )
            // InternalJPCoffe.g:633:4: (lv_amount_0_0= RULE_INT )
            {
            // InternalJPCoffe.g:633:4: (lv_amount_0_0= RULE_INT )
            // InternalJPCoffe.g:634:5: lv_amount_0_0= RULE_INT
            {
            lv_amount_0_0=(Token)match(input,RULE_INT,FOLLOW_24); 

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

            // InternalJPCoffe.g:650:3: ( (lv_unit_1_0= RULE_METRIC_UNIT ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_METRIC_UNIT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJPCoffe.g:651:4: (lv_unit_1_0= RULE_METRIC_UNIT )
                    {
                    // InternalJPCoffe.g:651:4: (lv_unit_1_0= RULE_METRIC_UNIT )
                    // InternalJPCoffe.g:652:5: lv_unit_1_0= RULE_METRIC_UNIT
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
    // InternalJPCoffe.g:672:1: entryRuleToolsBlock returns [EObject current=null] : iv_ruleToolsBlock= ruleToolsBlock EOF ;
    public final EObject entryRuleToolsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolsBlock = null;


        try {
            // InternalJPCoffe.g:672:51: (iv_ruleToolsBlock= ruleToolsBlock EOF )
            // InternalJPCoffe.g:673:2: iv_ruleToolsBlock= ruleToolsBlock EOF
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
    // InternalJPCoffe.g:679:1: ruleToolsBlock returns [EObject current=null] : ( () otherlv_1= 'Tools' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_toolsList_3_0= ruleTool ) )* ) ;
    public final EObject ruleToolsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_TITLE_LINE_2=null;
        EObject lv_toolsList_3_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:685:2: ( ( () otherlv_1= 'Tools' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_toolsList_3_0= ruleTool ) )* ) )
            // InternalJPCoffe.g:686:2: ( () otherlv_1= 'Tools' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_toolsList_3_0= ruleTool ) )* )
            {
            // InternalJPCoffe.g:686:2: ( () otherlv_1= 'Tools' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_toolsList_3_0= ruleTool ) )* )
            // InternalJPCoffe.g:687:3: () otherlv_1= 'Tools' this_TITLE_LINE_2= RULE_TITLE_LINE ( (lv_toolsList_3_0= ruleTool ) )*
            {
            // InternalJPCoffe.g:687:3: ()
            // InternalJPCoffe.g:688:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getToolsBlockAccess().getToolsBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getToolsBlockAccess().getToolsKeyword_1());
            		
            this_TITLE_LINE_2=(Token)match(input,RULE_TITLE_LINE,FOLLOW_18); 

            			newLeafNode(this_TITLE_LINE_2, grammarAccess.getToolsBlockAccess().getTITLE_LINETerminalRuleCall_2());
            		
            // InternalJPCoffe.g:702:3: ( (lv_toolsList_3_0= ruleTool ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJPCoffe.g:703:4: (lv_toolsList_3_0= ruleTool )
            	    {
            	    // InternalJPCoffe.g:703:4: (lv_toolsList_3_0= ruleTool )
            	    // InternalJPCoffe.g:704:5: lv_toolsList_3_0= ruleTool
            	    {

            	    					newCompositeNode(grammarAccess.getToolsBlockAccess().getToolsListToolParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    break loop12;
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
    // InternalJPCoffe.g:725:1: entryRuleTool returns [EObject current=null] : iv_ruleTool= ruleTool EOF ;
    public final EObject entryRuleTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTool = null;


        try {
            // InternalJPCoffe.g:725:45: (iv_ruleTool= ruleTool EOF )
            // InternalJPCoffe.g:726:2: iv_ruleTool= ruleTool EOF
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
    // InternalJPCoffe.g:732:1: ruleTool returns [EObject current=null] : (otherlv_0= '*' ( ( (lv_originalName_1_0= ruleNAME ) ) otherlv_2= 'AS' )? ( (lv_name_3_0= ruleNAME ) ) ) ;
    public final EObject ruleTool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_originalName_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:738:2: ( (otherlv_0= '*' ( ( (lv_originalName_1_0= ruleNAME ) ) otherlv_2= 'AS' )? ( (lv_name_3_0= ruleNAME ) ) ) )
            // InternalJPCoffe.g:739:2: (otherlv_0= '*' ( ( (lv_originalName_1_0= ruleNAME ) ) otherlv_2= 'AS' )? ( (lv_name_3_0= ruleNAME ) ) )
            {
            // InternalJPCoffe.g:739:2: (otherlv_0= '*' ( ( (lv_originalName_1_0= ruleNAME ) ) otherlv_2= 'AS' )? ( (lv_name_3_0= ruleNAME ) ) )
            // InternalJPCoffe.g:740:3: otherlv_0= '*' ( ( (lv_originalName_1_0= ruleNAME ) ) otherlv_2= 'AS' )? ( (lv_name_3_0= ruleNAME ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getToolAccess().getAsteriskKeyword_0());
            		
            // InternalJPCoffe.g:744:3: ( ( (lv_originalName_1_0= ruleNAME ) ) otherlv_2= 'AS' )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalJPCoffe.g:745:4: ( (lv_originalName_1_0= ruleNAME ) ) otherlv_2= 'AS'
                    {
                    // InternalJPCoffe.g:745:4: ( (lv_originalName_1_0= ruleNAME ) )
                    // InternalJPCoffe.g:746:5: (lv_originalName_1_0= ruleNAME )
                    {
                    // InternalJPCoffe.g:746:5: (lv_originalName_1_0= ruleNAME )
                    // InternalJPCoffe.g:747:6: lv_originalName_1_0= ruleNAME
                    {

                    						newCompositeNode(grammarAccess.getToolAccess().getOriginalNameNAMEParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_originalName_1_0=ruleNAME();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getToolRule());
                    						}
                    						set(
                    							current,
                    							"originalName",
                    							lv_originalName_1_0,
                    							"edu.imt.dsl.jpcoffe.JPCoffe.NAME");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getToolAccess().getASKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJPCoffe.g:769:3: ( (lv_name_3_0= ruleNAME ) )
            // InternalJPCoffe.g:770:4: (lv_name_3_0= ruleNAME )
            {
            // InternalJPCoffe.g:770:4: (lv_name_3_0= ruleNAME )
            // InternalJPCoffe.g:771:5: lv_name_3_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getToolAccess().getNameNAMEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getToolRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
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
    // InternalJPCoffe.g:792:1: entryRuleStepsBlock returns [EObject current=null] : iv_ruleStepsBlock= ruleStepsBlock EOF ;
    public final EObject entryRuleStepsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepsBlock = null;


        try {
            // InternalJPCoffe.g:792:51: (iv_ruleStepsBlock= ruleStepsBlock EOF )
            // InternalJPCoffe.g:793:2: iv_ruleStepsBlock= ruleStepsBlock EOF
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
    // InternalJPCoffe.g:799:1: ruleStepsBlock returns [EObject current=null] : ( () otherlv_1= 'Steps' this_TITLE_LINE_2= RULE_TITLE_LINE ( ( (lv_stepsList_3_1= ruleConditionalStep | lv_stepsList_3_2= ruleStep ) ) )* ) ;
    public final EObject ruleStepsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_TITLE_LINE_2=null;
        EObject lv_stepsList_3_1 = null;

        EObject lv_stepsList_3_2 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:805:2: ( ( () otherlv_1= 'Steps' this_TITLE_LINE_2= RULE_TITLE_LINE ( ( (lv_stepsList_3_1= ruleConditionalStep | lv_stepsList_3_2= ruleStep ) ) )* ) )
            // InternalJPCoffe.g:806:2: ( () otherlv_1= 'Steps' this_TITLE_LINE_2= RULE_TITLE_LINE ( ( (lv_stepsList_3_1= ruleConditionalStep | lv_stepsList_3_2= ruleStep ) ) )* )
            {
            // InternalJPCoffe.g:806:2: ( () otherlv_1= 'Steps' this_TITLE_LINE_2= RULE_TITLE_LINE ( ( (lv_stepsList_3_1= ruleConditionalStep | lv_stepsList_3_2= ruleStep ) ) )* )
            // InternalJPCoffe.g:807:3: () otherlv_1= 'Steps' this_TITLE_LINE_2= RULE_TITLE_LINE ( ( (lv_stepsList_3_1= ruleConditionalStep | lv_stepsList_3_2= ruleStep ) ) )*
            {
            // InternalJPCoffe.g:807:3: ()
            // InternalJPCoffe.g:808:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepsBlockAccess().getStepsBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getStepsBlockAccess().getStepsKeyword_1());
            		
            this_TITLE_LINE_2=(Token)match(input,RULE_TITLE_LINE,FOLLOW_26); 

            			newLeafNode(this_TITLE_LINE_2, grammarAccess.getStepsBlockAccess().getTITLE_LINETerminalRuleCall_2());
            		
            // InternalJPCoffe.g:822:3: ( ( (lv_stepsList_3_1= ruleConditionalStep | lv_stepsList_3_2= ruleStep ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJPCoffe.g:823:4: ( (lv_stepsList_3_1= ruleConditionalStep | lv_stepsList_3_2= ruleStep ) )
            	    {
            	    // InternalJPCoffe.g:823:4: ( (lv_stepsList_3_1= ruleConditionalStep | lv_stepsList_3_2= ruleStep ) )
            	    // InternalJPCoffe.g:824:5: (lv_stepsList_3_1= ruleConditionalStep | lv_stepsList_3_2= ruleStep )
            	    {
            	    // InternalJPCoffe.g:824:5: (lv_stepsList_3_1= ruleConditionalStep | lv_stepsList_3_2= ruleStep )
            	    int alt14=2;
            	    alt14 = dfa14.predict(input);
            	    switch (alt14) {
            	        case 1 :
            	            // InternalJPCoffe.g:825:6: lv_stepsList_3_1= ruleConditionalStep
            	            {

            	            						newCompositeNode(grammarAccess.getStepsBlockAccess().getStepsListConditionalStepParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_26);
            	            lv_stepsList_3_1=ruleConditionalStep();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStepsBlockRule());
            	            						}
            	            						add(
            	            							current,
            	            							"stepsList",
            	            							lv_stepsList_3_1,
            	            							"edu.imt.dsl.jpcoffe.JPCoffe.ConditionalStep");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalJPCoffe.g:841:6: lv_stepsList_3_2= ruleStep
            	            {

            	            						newCompositeNode(grammarAccess.getStepsBlockAccess().getStepsListStepParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_26);
            	            lv_stepsList_3_2=ruleStep();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStepsBlockRule());
            	            						}
            	            						add(
            	            							current,
            	            							"stepsList",
            	            							lv_stepsList_3_2,
            	            							"edu.imt.dsl.jpcoffe.JPCoffe.Step");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "entryRuleConditionalStep"
    // InternalJPCoffe.g:863:1: entryRuleConditionalStep returns [EObject current=null] : iv_ruleConditionalStep= ruleConditionalStep EOF ;
    public final EObject entryRuleConditionalStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStep = null;


        try {
            // InternalJPCoffe.g:863:56: (iv_ruleConditionalStep= ruleConditionalStep EOF )
            // InternalJPCoffe.g:864:2: iv_ruleConditionalStep= ruleConditionalStep EOF
            {
             newCompositeNode(grammarAccess.getConditionalStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalStep=ruleConditionalStep();

            state._fsp--;

             current =iv_ruleConditionalStep; 
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
    // $ANTLR end "entryRuleConditionalStep"


    // $ANTLR start "ruleConditionalStep"
    // InternalJPCoffe.g:870:1: ruleConditionalStep returns [EObject current=null] : (otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' otherlv_8= 'IF' ( (lv_condition_9_0= ruleTEXT ) ) otherlv_10= 'THEN' ( (lv_to_11_0= RULE_INT ) ) ) ;
    public final EObject ruleConditionalStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pred_1_0=null;
        Token otherlv_2=null;
        Token lv_pred_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_num_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_to_11_0=null;
        AntlrDatatypeRuleToken lv_condition_9_0 = null;



        	enterRule();

        try {
            // InternalJPCoffe.g:876:2: ( (otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' otherlv_8= 'IF' ( (lv_condition_9_0= ruleTEXT ) ) otherlv_10= 'THEN' ( (lv_to_11_0= RULE_INT ) ) ) )
            // InternalJPCoffe.g:877:2: (otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' otherlv_8= 'IF' ( (lv_condition_9_0= ruleTEXT ) ) otherlv_10= 'THEN' ( (lv_to_11_0= RULE_INT ) ) )
            {
            // InternalJPCoffe.g:877:2: (otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' otherlv_8= 'IF' ( (lv_condition_9_0= ruleTEXT ) ) otherlv_10= 'THEN' ( (lv_to_11_0= RULE_INT ) ) )
            // InternalJPCoffe.g:878:3: otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' otherlv_8= 'IF' ( (lv_condition_9_0= ruleTEXT ) ) otherlv_10= 'THEN' ( (lv_to_11_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalStepAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalJPCoffe.g:882:3: ( (lv_pred_1_0= RULE_INT ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJPCoffe.g:883:4: (lv_pred_1_0= RULE_INT )
                    {
                    // InternalJPCoffe.g:883:4: (lv_pred_1_0= RULE_INT )
                    // InternalJPCoffe.g:884:5: lv_pred_1_0= RULE_INT
                    {
                    lv_pred_1_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    					newLeafNode(lv_pred_1_0, grammarAccess.getConditionalStepAccess().getPredINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConditionalStepRule());
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

            // InternalJPCoffe.g:900:3: (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJPCoffe.g:901:4: otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConditionalStepAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJPCoffe.g:905:4: ( (lv_pred_3_0= RULE_INT ) )
            	    // InternalJPCoffe.g:906:5: (lv_pred_3_0= RULE_INT )
            	    {
            	    // InternalJPCoffe.g:906:5: (lv_pred_3_0= RULE_INT )
            	    // InternalJPCoffe.g:907:6: lv_pred_3_0= RULE_INT
            	    {
            	    lv_pred_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            	    						newLeafNode(lv_pred_3_0, grammarAccess.getConditionalStepAccess().getPredINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConditionalStepRule());
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
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalStepAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionalStepAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalJPCoffe.g:932:3: ( (lv_num_6_0= RULE_INT ) )
            // InternalJPCoffe.g:933:4: (lv_num_6_0= RULE_INT )
            {
            // InternalJPCoffe.g:933:4: (lv_num_6_0= RULE_INT )
            // InternalJPCoffe.g:934:5: lv_num_6_0= RULE_INT
            {
            lv_num_6_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_num_6_0, grammarAccess.getConditionalStepAccess().getNumINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"num",
            						lv_num_6_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,32,FOLLOW_31); 

            			newLeafNode(otherlv_7, grammarAccess.getConditionalStepAccess().getFullStopKeyword_6());
            		
            otherlv_8=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getConditionalStepAccess().getIFKeyword_7());
            		
            // InternalJPCoffe.g:958:3: ( (lv_condition_9_0= ruleTEXT ) )
            // InternalJPCoffe.g:959:4: (lv_condition_9_0= ruleTEXT )
            {
            // InternalJPCoffe.g:959:4: (lv_condition_9_0= ruleTEXT )
            // InternalJPCoffe.g:960:5: lv_condition_9_0= ruleTEXT
            {

            					newCompositeNode(grammarAccess.getConditionalStepAccess().getConditionTEXTParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_33);
            lv_condition_9_0=ruleTEXT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalStepRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_9_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.TEXT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getConditionalStepAccess().getTHENKeyword_9());
            		
            // InternalJPCoffe.g:981:3: ( (lv_to_11_0= RULE_INT ) )
            // InternalJPCoffe.g:982:4: (lv_to_11_0= RULE_INT )
            {
            // InternalJPCoffe.g:982:4: (lv_to_11_0= RULE_INT )
            // InternalJPCoffe.g:983:5: lv_to_11_0= RULE_INT
            {
            lv_to_11_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_to_11_0, grammarAccess.getConditionalStepAccess().getToINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"to",
            						lv_to_11_0,
            						"edu.imt.dsl.jpcoffe.JPCoffe.INT");
            				

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
    // $ANTLR end "ruleConditionalStep"


    // $ANTLR start "entryRuleStep"
    // InternalJPCoffe.g:1003:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalJPCoffe.g:1003:45: (iv_ruleStep= ruleStep EOF )
            // InternalJPCoffe.g:1004:2: iv_ruleStep= ruleStep EOF
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
    // InternalJPCoffe.g:1010:1: ruleStep returns [EObject current=null] : (otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' ( (lv_text_8_0= ruleTEXT ) ) ) ;
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
            // InternalJPCoffe.g:1016:2: ( (otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' ( (lv_text_8_0= ruleTEXT ) ) ) )
            // InternalJPCoffe.g:1017:2: (otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' ( (lv_text_8_0= ruleTEXT ) ) )
            {
            // InternalJPCoffe.g:1017:2: (otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' ( (lv_text_8_0= ruleTEXT ) ) )
            // InternalJPCoffe.g:1018:3: otherlv_0= '{' ( (lv_pred_1_0= RULE_INT ) )? (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )* otherlv_4= '}' otherlv_5= '->' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= '.' ( (lv_text_8_0= ruleTEXT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalJPCoffe.g:1022:3: ( (lv_pred_1_0= RULE_INT ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJPCoffe.g:1023:4: (lv_pred_1_0= RULE_INT )
                    {
                    // InternalJPCoffe.g:1023:4: (lv_pred_1_0= RULE_INT )
                    // InternalJPCoffe.g:1024:5: lv_pred_1_0= RULE_INT
                    {
                    lv_pred_1_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            // InternalJPCoffe.g:1040:3: (otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalJPCoffe.g:1041:4: otherlv_2= ',' ( (lv_pred_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStepAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJPCoffe.g:1045:4: ( (lv_pred_3_0= RULE_INT ) )
            	    // InternalJPCoffe.g:1046:5: (lv_pred_3_0= RULE_INT )
            	    {
            	    // InternalJPCoffe.g:1046:5: (lv_pred_3_0= RULE_INT )
            	    // InternalJPCoffe.g:1047:6: lv_pred_3_0= RULE_INT
            	    {
            	    lv_pred_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getStepAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalJPCoffe.g:1072:3: ( (lv_num_6_0= RULE_INT ) )
            // InternalJPCoffe.g:1073:4: (lv_num_6_0= RULE_INT )
            {
            // InternalJPCoffe.g:1073:4: (lv_num_6_0= RULE_INT )
            // InternalJPCoffe.g:1074:5: lv_num_6_0= RULE_INT
            {
            lv_num_6_0=(Token)match(input,RULE_INT,FOLLOW_30); 

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

            otherlv_7=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_7, grammarAccess.getStepAccess().getFullStopKeyword_6());
            		
            // InternalJPCoffe.g:1094:3: ( (lv_text_8_0= ruleTEXT ) )
            // InternalJPCoffe.g:1095:4: (lv_text_8_0= ruleTEXT )
            {
            // InternalJPCoffe.g:1095:4: (lv_text_8_0= ruleTEXT )
            // InternalJPCoffe.g:1096:5: lv_text_8_0= ruleTEXT
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
    // InternalJPCoffe.g:1117:1: entryRuleNAME returns [String current=null] : iv_ruleNAME= ruleNAME EOF ;
    public final String entryRuleNAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNAME = null;


        try {
            // InternalJPCoffe.g:1117:44: (iv_ruleNAME= ruleNAME EOF )
            // InternalJPCoffe.g:1118:2: iv_ruleNAME= ruleNAME EOF
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
    // InternalJPCoffe.g:1124:1: ruleNAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MAJ_WORD_0= RULE_MAJ_WORD (this_WORD_1= RULE_WORD )* ) ;
    public final AntlrDatatypeRuleToken ruleNAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MAJ_WORD_0=null;
        Token this_WORD_1=null;


        	enterRule();

        try {
            // InternalJPCoffe.g:1130:2: ( (this_MAJ_WORD_0= RULE_MAJ_WORD (this_WORD_1= RULE_WORD )* ) )
            // InternalJPCoffe.g:1131:2: (this_MAJ_WORD_0= RULE_MAJ_WORD (this_WORD_1= RULE_WORD )* )
            {
            // InternalJPCoffe.g:1131:2: (this_MAJ_WORD_0= RULE_MAJ_WORD (this_WORD_1= RULE_WORD )* )
            // InternalJPCoffe.g:1132:3: this_MAJ_WORD_0= RULE_MAJ_WORD (this_WORD_1= RULE_WORD )*
            {
            this_MAJ_WORD_0=(Token)match(input,RULE_MAJ_WORD,FOLLOW_34); 

            			current.merge(this_MAJ_WORD_0);
            		

            			newLeafNode(this_MAJ_WORD_0, grammarAccess.getNAMEAccess().getMAJ_WORDTerminalRuleCall_0());
            		
            // InternalJPCoffe.g:1139:3: (this_WORD_1= RULE_WORD )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WORD) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalJPCoffe.g:1140:4: this_WORD_1= RULE_WORD
            	    {
            	    this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_34); 

            	    				current.merge(this_WORD_1);
            	    			

            	    				newLeafNode(this_WORD_1, grammarAccess.getNAMEAccess().getWORDTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalJPCoffe.g:1152:1: entryRuleTEXT returns [String current=null] : iv_ruleTEXT= ruleTEXT EOF ;
    public final String entryRuleTEXT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTEXT = null;


        try {
            // InternalJPCoffe.g:1152:44: (iv_ruleTEXT= ruleTEXT EOF )
            // InternalJPCoffe.g:1153:2: iv_ruleTEXT= ruleTEXT EOF
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
    // InternalJPCoffe.g:1159:1: ruleTEXT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MAJ_WORD_0= RULE_MAJ_WORD | this_WORD_1= RULE_WORD | this_INT_2= RULE_INT )+ ;
    public final AntlrDatatypeRuleToken ruleTEXT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MAJ_WORD_0=null;
        Token this_WORD_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalJPCoffe.g:1165:2: ( (this_MAJ_WORD_0= RULE_MAJ_WORD | this_WORD_1= RULE_WORD | this_INT_2= RULE_INT )+ )
            // InternalJPCoffe.g:1166:2: (this_MAJ_WORD_0= RULE_MAJ_WORD | this_WORD_1= RULE_WORD | this_INT_2= RULE_INT )+
            {
            // InternalJPCoffe.g:1166:2: (this_MAJ_WORD_0= RULE_MAJ_WORD | this_WORD_1= RULE_WORD | this_INT_2= RULE_INT )+
            int cnt21=0;
            loop21:
            do {
                int alt21=4;
                switch ( input.LA(1) ) {
                case RULE_MAJ_WORD:
                    {
                    alt21=1;
                    }
                    break;
                case RULE_WORD:
                    {
                    alt21=2;
                    }
                    break;
                case RULE_INT:
                    {
                    alt21=3;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // InternalJPCoffe.g:1167:3: this_MAJ_WORD_0= RULE_MAJ_WORD
            	    {
            	    this_MAJ_WORD_0=(Token)match(input,RULE_MAJ_WORD,FOLLOW_35); 

            	    			current.merge(this_MAJ_WORD_0);
            	    		

            	    			newLeafNode(this_MAJ_WORD_0, grammarAccess.getTEXTAccess().getMAJ_WORDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalJPCoffe.g:1175:3: this_WORD_1= RULE_WORD
            	    {
            	    this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_35); 

            	    			current.merge(this_WORD_1);
            	    		

            	    			newLeafNode(this_WORD_1, grammarAccess.getTEXTAccess().getWORDTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalJPCoffe.g:1183:3: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_35); 

            	    			current.merge(this_INT_2);
            	    		

            	    			newLeafNode(this_INT_2, grammarAccess.getTEXTAccess().getINTTerminalRuleCall_2());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\uffff\2\4\2\uffff";
    static final String dfa_3s = "\1\10\2\5\2\uffff";
    static final String dfa_4s = "\1\10\2\34\2\uffff";
    static final String dfa_5s = "\3\uffff\1\1\1\2";
    static final String dfa_6s = "\5\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\4\3\uffff\1\2\14\uffff\1\4\2\uffff\1\4\2\3\1\4",
            "\1\4\3\uffff\1\2\14\uffff\1\4\2\uffff\1\4\2\3\1\4",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "525:3: ( ( (lv_originalName_1_0= ruleNAME ) ) (otherlv_2= 'OR' ( (lv_originalName_3_0= ruleNAME ) ) )* otherlv_4= 'AS' )?";
        }
    }
    static final String dfa_8s = "\1\10\2\11\2\uffff";
    static final String dfa_9s = "\1\10\2\35\2\uffff";
    static final String[] dfa_10s = {
            "\1\1",
            "\1\2\14\uffff\1\4\4\uffff\1\3\1\uffff\1\4",
            "\1\2\14\uffff\1\4\4\uffff\1\3\1\uffff\1\4",
            "",
            ""
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "744:3: ( ( (lv_originalName_1_0= ruleNAME ) ) otherlv_2= 'AS' )?";
        }
    }
    static final String dfa_11s = "\13\uffff";
    static final String dfa_12s = "\1\21\1\5\1\22\1\5\1\37\1\22\1\5\1\40\1\5\2\uffff";
    static final String dfa_13s = "\1\21\2\36\1\5\1\37\1\36\1\5\1\40\1\41\2\uffff";
    static final String dfa_14s = "\11\uffff\1\2\1\1";
    static final String dfa_15s = "\13\uffff}>";
    static final String[] dfa_16s = {
            "\1\1",
            "\1\2\14\uffff\1\4\13\uffff\1\3",
            "\1\4\13\uffff\1\3",
            "\1\5",
            "\1\6",
            "\1\4\13\uffff\1\3",
            "\1\7",
            "\1\10",
            "\1\11\2\uffff\2\11\27\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_11;
            this.eof = dfa_11;
            this.min = dfa_12;
            this.max = dfa_13;
            this.accept = dfa_14;
            this.special = dfa_15;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "824:5: (lv_stepsList_3_1= ruleConditionalStep | lv_stepsList_3_2= ruleStep )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040040020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000320L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000322L});

}