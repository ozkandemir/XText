package com.ykb.umap.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ykb.umap.dsl.services.ProductGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProductParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANY_OTHER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'use'", "'namespace'", "'.'", "'product'", "'parameters'", "':'", "'operation'", "'is'", "'controls'", "'=>'", "'Error'", "'('", "'\"'", "')'", "'BRANCH'", "'CLIENT'", "'CURRENCY'", "'NUMBER'", "'STRING'", "'is not'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=5;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalProductParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProductParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProductParser.tokenNames; }
    public String getGrammarFileName() { return "../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g"; }



     	private ProductGrammarAccess grammarAccess;
     	
        public InternalProductParser(TokenStream input, ProductGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Product";	
       	}
       	
       	@Override
       	protected ProductGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProduct"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:68:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:69:2: (iv_ruleProduct= ruleProduct EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:70:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct75);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct85); 

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
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:77:1: ruleProduct returns [EObject current=null] : ( (lv_elements_0_0= ruleCompilationUnit ) ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:80:28: ( ( (lv_elements_0_0= ruleCompilationUnit ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:81:1: ( (lv_elements_0_0= ruleCompilationUnit ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:81:1: ( (lv_elements_0_0= ruleCompilationUnit ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:82:1: (lv_elements_0_0= ruleCompilationUnit )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:82:1: (lv_elements_0_0= ruleCompilationUnit )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:83:3: lv_elements_0_0= ruleCompilationUnit
            {
             
            	        newCompositeNode(grammarAccess.getProductAccess().getElementsCompilationUnitParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleCompilationUnit_in_ruleProduct130);
            lv_elements_0_0=ruleCompilationUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProductRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_0_0, 
                    		"CompilationUnit");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleCompilationUnit"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:107:1: entryRuleCompilationUnit returns [EObject current=null] : iv_ruleCompilationUnit= ruleCompilationUnit EOF ;
    public final EObject entryRuleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilationUnit = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:108:2: (iv_ruleCompilationUnit= ruleCompilationUnit EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:109:2: iv_ruleCompilationUnit= ruleCompilationUnit EOF
            {
             newCompositeNode(grammarAccess.getCompilationUnitRule()); 
            pushFollow(FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit165);
            iv_ruleCompilationUnit=ruleCompilationUnit();

            state._fsp--;

             current =iv_ruleCompilationUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilationUnit175); 

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
    // $ANTLR end "entryRuleCompilationUnit"


    // $ANTLR start "ruleCompilationUnit"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:116:1: ruleCompilationUnit returns [EObject current=null] : ( ( (lv_namespaceUnit_0_0= ruleNamespaceUnit ) ) ( (lv_useUnit_1_0= ruleUseUnit ) )? ( (lv_productUnit_2_0= ruleProductUnit ) ) ) ;
    public final EObject ruleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject lv_namespaceUnit_0_0 = null;

        EObject lv_useUnit_1_0 = null;

        EObject lv_productUnit_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:119:28: ( ( ( (lv_namespaceUnit_0_0= ruleNamespaceUnit ) ) ( (lv_useUnit_1_0= ruleUseUnit ) )? ( (lv_productUnit_2_0= ruleProductUnit ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:120:1: ( ( (lv_namespaceUnit_0_0= ruleNamespaceUnit ) ) ( (lv_useUnit_1_0= ruleUseUnit ) )? ( (lv_productUnit_2_0= ruleProductUnit ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:120:1: ( ( (lv_namespaceUnit_0_0= ruleNamespaceUnit ) ) ( (lv_useUnit_1_0= ruleUseUnit ) )? ( (lv_productUnit_2_0= ruleProductUnit ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:120:2: ( (lv_namespaceUnit_0_0= ruleNamespaceUnit ) ) ( (lv_useUnit_1_0= ruleUseUnit ) )? ( (lv_productUnit_2_0= ruleProductUnit ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:120:2: ( (lv_namespaceUnit_0_0= ruleNamespaceUnit ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:121:1: (lv_namespaceUnit_0_0= ruleNamespaceUnit )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:121:1: (lv_namespaceUnit_0_0= ruleNamespaceUnit )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:122:3: lv_namespaceUnit_0_0= ruleNamespaceUnit
            {
             
            	        newCompositeNode(grammarAccess.getCompilationUnitAccess().getNamespaceUnitNamespaceUnitParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNamespaceUnit_in_ruleCompilationUnit221);
            lv_namespaceUnit_0_0=ruleNamespaceUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
            	        }
                   		set(
                   			current, 
                   			"namespaceUnit",
                    		lv_namespaceUnit_0_0, 
                    		"NamespaceUnit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:138:2: ( (lv_useUnit_1_0= ruleUseUnit ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:139:1: (lv_useUnit_1_0= ruleUseUnit )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:139:1: (lv_useUnit_1_0= ruleUseUnit )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:140:3: lv_useUnit_1_0= ruleUseUnit
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompilationUnitAccess().getUseUnitUseUnitParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUseUnit_in_ruleCompilationUnit242);
                    lv_useUnit_1_0=ruleUseUnit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
                    	        }
                           		set(
                           			current, 
                           			"useUnit",
                            		lv_useUnit_1_0, 
                            		"UseUnit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:156:3: ( (lv_productUnit_2_0= ruleProductUnit ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:157:1: (lv_productUnit_2_0= ruleProductUnit )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:157:1: (lv_productUnit_2_0= ruleProductUnit )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:158:3: lv_productUnit_2_0= ruleProductUnit
            {
             
            	        newCompositeNode(grammarAccess.getCompilationUnitAccess().getProductUnitProductUnitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleProductUnit_in_ruleCompilationUnit264);
            lv_productUnit_2_0=ruleProductUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
            	        }
                   		set(
                   			current, 
                   			"productUnit",
                    		lv_productUnit_2_0, 
                    		"ProductUnit");
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
    // $ANTLR end "ruleCompilationUnit"


    // $ANTLR start "entryRuleUseUnit"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:182:1: entryRuleUseUnit returns [EObject current=null] : iv_ruleUseUnit= ruleUseUnit EOF ;
    public final EObject entryRuleUseUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseUnit = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:183:2: (iv_ruleUseUnit= ruleUseUnit EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:184:2: iv_ruleUseUnit= ruleUseUnit EOF
            {
             newCompositeNode(grammarAccess.getUseUnitRule()); 
            pushFollow(FOLLOW_ruleUseUnit_in_entryRuleUseUnit300);
            iv_ruleUseUnit=ruleUseUnit();

            state._fsp--;

             current =iv_ruleUseUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseUnit310); 

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
    // $ANTLR end "entryRuleUseUnit"


    // $ANTLR start "ruleUseUnit"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:191:1: ruleUseUnit returns [EObject current=null] : (otherlv_0= 'use' ( ( ruleQUALIFIEDID ) ) ) ;
    public final EObject ruleUseUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:194:28: ( (otherlv_0= 'use' ( ( ruleQUALIFIEDID ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:195:1: (otherlv_0= 'use' ( ( ruleQUALIFIEDID ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:195:1: (otherlv_0= 'use' ( ( ruleQUALIFIEDID ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:195:3: otherlv_0= 'use' ( ( ruleQUALIFIEDID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleUseUnit347); 

                	newLeafNode(otherlv_0, grammarAccess.getUseUnitAccess().getUseKeyword_0());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:199:1: ( ( ruleQUALIFIEDID ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:200:1: ( ruleQUALIFIEDID )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:200:1: ( ruleQUALIFIEDID )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:201:3: ruleQUALIFIEDID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseUnitRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getUseUnitAccess().getProductUnitEProductUnitCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_ruleUseUnit370);
            ruleQUALIFIEDID();

            state._fsp--;

             
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
    // $ANTLR end "ruleUseUnit"


    // $ANTLR start "entryRuleNamespaceUnit"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:222:1: entryRuleNamespaceUnit returns [EObject current=null] : iv_ruleNamespaceUnit= ruleNamespaceUnit EOF ;
    public final EObject entryRuleNamespaceUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceUnit = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:223:2: (iv_ruleNamespaceUnit= ruleNamespaceUnit EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:224:2: iv_ruleNamespaceUnit= ruleNamespaceUnit EOF
            {
             newCompositeNode(grammarAccess.getNamespaceUnitRule()); 
            pushFollow(FOLLOW_ruleNamespaceUnit_in_entryRuleNamespaceUnit406);
            iv_ruleNamespaceUnit=ruleNamespaceUnit();

            state._fsp--;

             current =iv_ruleNamespaceUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceUnit416); 

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
    // $ANTLR end "entryRuleNamespaceUnit"


    // $ANTLR start "ruleNamespaceUnit"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:231:1: ruleNamespaceUnit returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQUALIFIEDID ) ) ) ;
    public final EObject ruleNamespaceUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:234:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQUALIFIEDID ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:235:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQUALIFIEDID ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:235:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQUALIFIEDID ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:235:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQUALIFIEDID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleNamespaceUnit453); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceUnitAccess().getNamespaceKeyword_0());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:239:1: ( (lv_name_1_0= ruleQUALIFIEDID ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:240:1: (lv_name_1_0= ruleQUALIFIEDID )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:240:1: (lv_name_1_0= ruleQUALIFIEDID )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:241:3: lv_name_1_0= ruleQUALIFIEDID
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceUnitAccess().getNameQUALIFIEDIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_ruleNamespaceUnit474);
            lv_name_1_0=ruleQUALIFIEDID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceUnitRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QUALIFIEDID");
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
    // $ANTLR end "ruleNamespaceUnit"


    // $ANTLR start "entryRuleQUALIFIEDID"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:265:1: entryRuleQUALIFIEDID returns [String current=null] : iv_ruleQUALIFIEDID= ruleQUALIFIEDID EOF ;
    public final String entryRuleQUALIFIEDID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQUALIFIEDID = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:266:2: (iv_ruleQUALIFIEDID= ruleQUALIFIEDID EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:267:2: iv_ruleQUALIFIEDID= ruleQUALIFIEDID EOF
            {
             newCompositeNode(grammarAccess.getQUALIFIEDIDRule()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_entryRuleQUALIFIEDID511);
            iv_ruleQUALIFIEDID=ruleQUALIFIEDID();

            state._fsp--;

             current =iv_ruleQUALIFIEDID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIEDID522); 

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
    // $ANTLR end "entryRuleQUALIFIEDID"


    // $ANTLR start "ruleQUALIFIEDID"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:274:1: ruleQUALIFIEDID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQUALIFIEDID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:277:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:278:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:278:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:278:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIEDID562); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:285:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:286:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQUALIFIEDID581); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQUALIFIEDIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIEDID596); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleQUALIFIEDID"


    // $ANTLR start "entryRuleProductUnit"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:306:1: entryRuleProductUnit returns [EObject current=null] : iv_ruleProductUnit= ruleProductUnit EOF ;
    public final EObject entryRuleProductUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductUnit = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:307:2: (iv_ruleProductUnit= ruleProductUnit EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:308:2: iv_ruleProductUnit= ruleProductUnit EOF
            {
             newCompositeNode(grammarAccess.getProductUnitRule()); 
            pushFollow(FOLLOW_ruleProductUnit_in_entryRuleProductUnit643);
            iv_ruleProductUnit=ruleProductUnit();

            state._fsp--;

             current =iv_ruleProductUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProductUnit653); 

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
    // $ANTLR end "entryRuleProductUnit"


    // $ANTLR start "ruleProductUnit"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:315:1: ruleProductUnit returns [EObject current=null] : (otherlv_0= 'product' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameterElement ) )* ) ( (lv_operationUnit_4_0= ruleOperationUnit ) ) ) ;
    public final EObject ruleProductUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_operationUnit_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:318:28: ( (otherlv_0= 'product' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameterElement ) )* ) ( (lv_operationUnit_4_0= ruleOperationUnit ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:319:1: (otherlv_0= 'product' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameterElement ) )* ) ( (lv_operationUnit_4_0= ruleOperationUnit ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:319:1: (otherlv_0= 'product' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameterElement ) )* ) ( (lv_operationUnit_4_0= ruleOperationUnit ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:319:3: otherlv_0= 'product' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameterElement ) )* ) ( (lv_operationUnit_4_0= ruleOperationUnit ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleProductUnit690); 

                	newLeafNode(otherlv_0, grammarAccess.getProductUnitAccess().getProductKeyword_0());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:323:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:324:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:324:1: (lv_name_1_0= RULE_ID )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:325:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProductUnit707); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProductUnitAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductUnitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:341:2: (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameterElement ) )* )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:341:4: otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameterElement ) )*
            {
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleProductUnit725); 

                	newLeafNode(otherlv_2, grammarAccess.getProductUnitAccess().getParametersKeyword_2_0());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:345:1: ( (lv_parameters_3_0= ruleParameterElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:346:1: (lv_parameters_3_0= ruleParameterElement )
            	    {
            	    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:346:1: (lv_parameters_3_0= ruleParameterElement )
            	    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:347:3: lv_parameters_3_0= ruleParameterElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProductUnitAccess().getParametersParameterElementParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameterElement_in_ruleProductUnit746);
            	    lv_parameters_3_0=ruleParameterElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProductUnitRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_3_0, 
            	            		"ParameterElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:363:4: ( (lv_operationUnit_4_0= ruleOperationUnit ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:364:1: (lv_operationUnit_4_0= ruleOperationUnit )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:364:1: (lv_operationUnit_4_0= ruleOperationUnit )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:365:3: lv_operationUnit_4_0= ruleOperationUnit
            {
             
            	        newCompositeNode(grammarAccess.getProductUnitAccess().getOperationUnitOperationUnitParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleOperationUnit_in_ruleProductUnit769);
            lv_operationUnit_4_0=ruleOperationUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProductUnitRule());
            	        }
                   		set(
                   			current, 
                   			"operationUnit",
                    		lv_operationUnit_4_0, 
                    		"OperationUnit");
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
    // $ANTLR end "ruleProductUnit"


    // $ANTLR start "entryRuleParameterElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:389:1: entryRuleParameterElement returns [EObject current=null] : iv_ruleParameterElement= ruleParameterElement EOF ;
    public final EObject entryRuleParameterElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:390:2: (iv_ruleParameterElement= ruleParameterElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:391:2: iv_ruleParameterElement= ruleParameterElement EOF
            {
             newCompositeNode(grammarAccess.getParameterElementRule()); 
            pushFollow(FOLLOW_ruleParameterElement_in_entryRuleParameterElement805);
            iv_ruleParameterElement=ruleParameterElement();

            state._fsp--;

             current =iv_ruleParameterElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterElement815); 

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
    // $ANTLR end "entryRuleParameterElement"


    // $ANTLR start "ruleParameterElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:398:1: ruleParameterElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleUMAPDataTypes ) ) )? ) ;
    public final EObject ruleParameterElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:401:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleUMAPDataTypes ) ) )? ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:402:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleUMAPDataTypes ) ) )? )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:402:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleUMAPDataTypes ) ) )? )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:402:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleUMAPDataTypes ) ) )?
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:402:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:403:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:403:1: (lv_name_0_0= RULE_ID )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:404:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterElement857); 

            			newLeafNode(lv_name_0_0, grammarAccess.getParameterElementAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:420:2: (otherlv_1= ':' ( (lv_type_2_0= ruleUMAPDataTypes ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:420:4: otherlv_1= ':' ( (lv_type_2_0= ruleUMAPDataTypes ) )
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleParameterElement875); 

                        	newLeafNode(otherlv_1, grammarAccess.getParameterElementAccess().getColonKeyword_1_0());
                        
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:424:1: ( (lv_type_2_0= ruleUMAPDataTypes ) )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:425:1: (lv_type_2_0= ruleUMAPDataTypes )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:425:1: (lv_type_2_0= ruleUMAPDataTypes )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:426:3: lv_type_2_0= ruleUMAPDataTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterElementAccess().getTypeUMAPDataTypesEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUMAPDataTypes_in_ruleParameterElement896);
                    lv_type_2_0=ruleUMAPDataTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterElementRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"UMAPDataTypes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleParameterElement"


    // $ANTLR start "entryRuleOperationUnit"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:450:1: entryRuleOperationUnit returns [EObject current=null] : iv_ruleOperationUnit= ruleOperationUnit EOF ;
    public final EObject entryRuleOperationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationUnit = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:451:2: (iv_ruleOperationUnit= ruleOperationUnit EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:452:2: iv_ruleOperationUnit= ruleOperationUnit EOF
            {
             newCompositeNode(grammarAccess.getOperationUnitRule()); 
            pushFollow(FOLLOW_ruleOperationUnit_in_entryRuleOperationUnit934);
            iv_ruleOperationUnit=ruleOperationUnit();

            state._fsp--;

             current =iv_ruleOperationUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationUnit944); 

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
    // $ANTLR end "entryRuleOperationUnit"


    // $ANTLR start "ruleOperationUnit"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:459:1: ruleOperationUnit returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' (otherlv_3= 'controls' ( (lv_controls_4_0= ruleControlElement ) ) )? ) ;
    public final EObject ruleOperationUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_controls_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:462:28: ( (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' (otherlv_3= 'controls' ( (lv_controls_4_0= ruleControlElement ) ) )? ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:463:1: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' (otherlv_3= 'controls' ( (lv_controls_4_0= ruleControlElement ) ) )? )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:463:1: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' (otherlv_3= 'controls' ( (lv_controls_4_0= ruleControlElement ) ) )? )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:463:3: otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' (otherlv_3= 'controls' ( (lv_controls_4_0= ruleControlElement ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleOperationUnit981); 

                	newLeafNode(otherlv_0, grammarAccess.getOperationUnitAccess().getOperationKeyword_0());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:467:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:468:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:468:1: (lv_name_1_0= RULE_ID )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:469:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationUnit998); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOperationUnitAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationUnitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleOperationUnit1015); 

                	newLeafNode(otherlv_2, grammarAccess.getOperationUnitAccess().getIsKeyword_2());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:489:1: (otherlv_3= 'controls' ( (lv_controls_4_0= ruleControlElement ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:489:3: otherlv_3= 'controls' ( (lv_controls_4_0= ruleControlElement ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleOperationUnit1028); 

                        	newLeafNode(otherlv_3, grammarAccess.getOperationUnitAccess().getControlsKeyword_3_0());
                        
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:493:1: ( (lv_controls_4_0= ruleControlElement ) )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:494:1: (lv_controls_4_0= ruleControlElement )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:494:1: (lv_controls_4_0= ruleControlElement )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:495:3: lv_controls_4_0= ruleControlElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationUnitAccess().getControlsControlElementParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleControlElement_in_ruleOperationUnit1049);
                    lv_controls_4_0=ruleControlElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationUnitRule());
                    	        }
                           		add(
                           			current, 
                           			"controls",
                            		lv_controls_4_0, 
                            		"ControlElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleOperationUnit"


    // $ANTLR start "entryRuleControlElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:519:1: entryRuleControlElement returns [EObject current=null] : iv_ruleControlElement= ruleControlElement EOF ;
    public final EObject entryRuleControlElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:520:2: (iv_ruleControlElement= ruleControlElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:521:2: iv_ruleControlElement= ruleControlElement EOF
            {
             newCompositeNode(grammarAccess.getControlElementRule()); 
            pushFollow(FOLLOW_ruleControlElement_in_entryRuleControlElement1087);
            iv_ruleControlElement=ruleControlElement();

            state._fsp--;

             current =iv_ruleControlElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlElement1097); 

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
    // $ANTLR end "entryRuleControlElement"


    // $ANTLR start "ruleControlElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:528:1: ruleControlElement returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpressionElement ) ) otherlv_1= '=>' ( (lv_controlStatement_2_0= ruleControlStatementElement ) ) ) ;
    public final EObject ruleControlElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_controlStatement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:531:28: ( ( ( (lv_expression_0_0= ruleExpressionElement ) ) otherlv_1= '=>' ( (lv_controlStatement_2_0= ruleControlStatementElement ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:532:1: ( ( (lv_expression_0_0= ruleExpressionElement ) ) otherlv_1= '=>' ( (lv_controlStatement_2_0= ruleControlStatementElement ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:532:1: ( ( (lv_expression_0_0= ruleExpressionElement ) ) otherlv_1= '=>' ( (lv_controlStatement_2_0= ruleControlStatementElement ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:532:2: ( (lv_expression_0_0= ruleExpressionElement ) ) otherlv_1= '=>' ( (lv_controlStatement_2_0= ruleControlStatementElement ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:532:2: ( (lv_expression_0_0= ruleExpressionElement ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:533:1: (lv_expression_0_0= ruleExpressionElement )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:533:1: (lv_expression_0_0= ruleExpressionElement )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:534:3: lv_expression_0_0= ruleExpressionElement
            {
             
            	        newCompositeNode(grammarAccess.getControlElementAccess().getExpressionExpressionElementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpressionElement_in_ruleControlElement1143);
            lv_expression_0_0=ruleExpressionElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControlElementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"ExpressionElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleControlElement1155); 

                	newLeafNode(otherlv_1, grammarAccess.getControlElementAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:554:1: ( (lv_controlStatement_2_0= ruleControlStatementElement ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:555:1: (lv_controlStatement_2_0= ruleControlStatementElement )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:555:1: (lv_controlStatement_2_0= ruleControlStatementElement )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:556:3: lv_controlStatement_2_0= ruleControlStatementElement
            {
             
            	        newCompositeNode(grammarAccess.getControlElementAccess().getControlStatementControlStatementElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleControlStatementElement_in_ruleControlElement1176);
            lv_controlStatement_2_0=ruleControlStatementElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControlElementRule());
            	        }
                   		set(
                   			current, 
                   			"controlStatement",
                    		lv_controlStatement_2_0, 
                    		"ControlStatementElement");
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
    // $ANTLR end "ruleControlElement"


    // $ANTLR start "entryRuleExpressionElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:580:1: entryRuleExpressionElement returns [EObject current=null] : iv_ruleExpressionElement= ruleExpressionElement EOF ;
    public final EObject entryRuleExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:581:2: (iv_ruleExpressionElement= ruleExpressionElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:582:2: iv_ruleExpressionElement= ruleExpressionElement EOF
            {
             newCompositeNode(grammarAccess.getExpressionElementRule()); 
            pushFollow(FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement1212);
            iv_ruleExpressionElement=ruleExpressionElement();

            state._fsp--;

             current =iv_ruleExpressionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionElement1222); 

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
    // $ANTLR end "entryRuleExpressionElement"


    // $ANTLR start "ruleExpressionElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:589:1: ruleExpressionElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOPERATORS ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleExpressionElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_operator_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:592:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOPERATORS ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:593:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOPERATORS ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:593:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOPERATORS ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:593:2: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOPERATORS ) ) ( (otherlv_2= RULE_ID ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:593:2: ( (otherlv_0= RULE_ID ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:594:1: (otherlv_0= RULE_ID )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:594:1: (otherlv_0= RULE_ID )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:595:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExpressionElementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpressionElement1267); 

            		newLeafNode(otherlv_0, grammarAccess.getExpressionElementAccess().getParameterEParameterElementCrossReference_0_0()); 
            	

            }


            }

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:606:2: ( (lv_operator_1_0= ruleOPERATORS ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:607:1: (lv_operator_1_0= ruleOPERATORS )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:607:1: (lv_operator_1_0= ruleOPERATORS )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:608:3: lv_operator_1_0= ruleOPERATORS
            {
             
            	        newCompositeNode(grammarAccess.getExpressionElementAccess().getOperatorOPERATORSEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOPERATORS_in_ruleExpressionElement1288);
            lv_operator_1_0=ruleOPERATORS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionElementRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"OPERATORS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:624:2: ( (otherlv_2= RULE_ID ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:625:1: (otherlv_2= RULE_ID )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:625:1: (otherlv_2= RULE_ID )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:626:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExpressionElementRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpressionElement1308); 

            		newLeafNode(otherlv_2, grammarAccess.getExpressionElementAccess().getRightEOperationUnitCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleExpressionElement"


    // $ANTLR start "entryRuleControlStatementElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:645:1: entryRuleControlStatementElement returns [EObject current=null] : iv_ruleControlStatementElement= ruleControlStatementElement EOF ;
    public final EObject entryRuleControlStatementElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlStatementElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:646:2: (iv_ruleControlStatementElement= ruleControlStatementElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:647:2: iv_ruleControlStatementElement= ruleControlStatementElement EOF
            {
             newCompositeNode(grammarAccess.getControlStatementElementRule()); 
            pushFollow(FOLLOW_ruleControlStatementElement_in_entryRuleControlStatementElement1344);
            iv_ruleControlStatementElement=ruleControlStatementElement();

            state._fsp--;

             current =iv_ruleControlStatementElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlStatementElement1354); 

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
    // $ANTLR end "entryRuleControlStatementElement"


    // $ANTLR start "ruleControlStatementElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:654:1: ruleControlStatementElement returns [EObject current=null] : (otherlv_0= 'Error' otherlv_1= '(' otherlv_2= '\"' ( (lv_message_3_0= RULE_ANY_OTHER ) ) otherlv_4= '\"' otherlv_5= ')' ) ;
    public final EObject ruleControlStatementElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_message_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:657:28: ( (otherlv_0= 'Error' otherlv_1= '(' otherlv_2= '\"' ( (lv_message_3_0= RULE_ANY_OTHER ) ) otherlv_4= '\"' otherlv_5= ')' ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:658:1: (otherlv_0= 'Error' otherlv_1= '(' otherlv_2= '\"' ( (lv_message_3_0= RULE_ANY_OTHER ) ) otherlv_4= '\"' otherlv_5= ')' )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:658:1: (otherlv_0= 'Error' otherlv_1= '(' otherlv_2= '\"' ( (lv_message_3_0= RULE_ANY_OTHER ) ) otherlv_4= '\"' otherlv_5= ')' )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:658:3: otherlv_0= 'Error' otherlv_1= '(' otherlv_2= '\"' ( (lv_message_3_0= RULE_ANY_OTHER ) ) otherlv_4= '\"' otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleControlStatementElement1391); 

                	newLeafNode(otherlv_0, grammarAccess.getControlStatementElementAccess().getErrorKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleControlStatementElement1403); 

                	newLeafNode(otherlv_1, grammarAccess.getControlStatementElementAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleControlStatementElement1415); 

                	newLeafNode(otherlv_2, grammarAccess.getControlStatementElementAccess().getQuotationMarkKeyword_2());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:670:1: ( (lv_message_3_0= RULE_ANY_OTHER ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:671:1: (lv_message_3_0= RULE_ANY_OTHER )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:671:1: (lv_message_3_0= RULE_ANY_OTHER )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:672:3: lv_message_3_0= RULE_ANY_OTHER
            {
            lv_message_3_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleControlStatementElement1432); 

            			newLeafNode(lv_message_3_0, grammarAccess.getControlStatementElementAccess().getMessageANY_OTHERTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getControlStatementElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"message",
                    		lv_message_3_0, 
                    		"ANY_OTHER");
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleControlStatementElement1449); 

                	newLeafNode(otherlv_4, grammarAccess.getControlStatementElementAccess().getQuotationMarkKeyword_4());
                
            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleControlStatementElement1461); 

                	newLeafNode(otherlv_5, grammarAccess.getControlStatementElementAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleControlStatementElement"


    // $ANTLR start "ruleUMAPDataTypes"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:704:1: ruleUMAPDataTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'BRANCH' ) | (enumLiteral_1= 'CLIENT' ) | (enumLiteral_2= 'CURRENCY' ) | (enumLiteral_3= 'NUMBER' ) | (enumLiteral_4= 'STRING' ) ) ;
    public final Enumerator ruleUMAPDataTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:706:28: ( ( (enumLiteral_0= 'BRANCH' ) | (enumLiteral_1= 'CLIENT' ) | (enumLiteral_2= 'CURRENCY' ) | (enumLiteral_3= 'NUMBER' ) | (enumLiteral_4= 'STRING' ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:707:1: ( (enumLiteral_0= 'BRANCH' ) | (enumLiteral_1= 'CLIENT' ) | (enumLiteral_2= 'CURRENCY' ) | (enumLiteral_3= 'NUMBER' ) | (enumLiteral_4= 'STRING' ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:707:1: ( (enumLiteral_0= 'BRANCH' ) | (enumLiteral_1= 'CLIENT' ) | (enumLiteral_2= 'CURRENCY' ) | (enumLiteral_3= 'NUMBER' ) | (enumLiteral_4= 'STRING' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            case 29:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:707:2: (enumLiteral_0= 'BRANCH' )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:707:2: (enumLiteral_0= 'BRANCH' )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:707:4: enumLiteral_0= 'BRANCH'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleUMAPDataTypes1511); 

                            current = grammarAccess.getUMAPDataTypesAccess().getBRANCHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUMAPDataTypesAccess().getBRANCHEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:713:6: (enumLiteral_1= 'CLIENT' )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:713:6: (enumLiteral_1= 'CLIENT' )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:713:8: enumLiteral_1= 'CLIENT'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_ruleUMAPDataTypes1528); 

                            current = grammarAccess.getUMAPDataTypesAccess().getCLIENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUMAPDataTypesAccess().getCLIENTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:719:6: (enumLiteral_2= 'CURRENCY' )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:719:6: (enumLiteral_2= 'CURRENCY' )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:719:8: enumLiteral_2= 'CURRENCY'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_27_in_ruleUMAPDataTypes1545); 

                            current = grammarAccess.getUMAPDataTypesAccess().getCURRENCYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getUMAPDataTypesAccess().getCURRENCYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:725:6: (enumLiteral_3= 'NUMBER' )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:725:6: (enumLiteral_3= 'NUMBER' )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:725:8: enumLiteral_3= 'NUMBER'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_28_in_ruleUMAPDataTypes1562); 

                            current = grammarAccess.getUMAPDataTypesAccess().getNUMBEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getUMAPDataTypesAccess().getNUMBEREnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:731:6: (enumLiteral_4= 'STRING' )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:731:6: (enumLiteral_4= 'STRING' )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:731:8: enumLiteral_4= 'STRING'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_29_in_ruleUMAPDataTypes1579); 

                            current = grammarAccess.getUMAPDataTypesAccess().getSTRINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getUMAPDataTypesAccess().getSTRINGEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleUMAPDataTypes"


    // $ANTLR start "ruleOPERATORS"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:741:1: ruleOPERATORS returns [Enumerator current=null] : ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'is not' ) ) ;
    public final Enumerator ruleOPERATORS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:743:28: ( ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'is not' ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:744:1: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'is not' ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:744:1: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'is not' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==30) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:744:2: (enumLiteral_0= 'is' )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:744:2: (enumLiteral_0= 'is' )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:744:4: enumLiteral_0= 'is'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_18_in_ruleOPERATORS1624); 

                            current = grammarAccess.getOPERATORSAccess().getISEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOPERATORSAccess().getISEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:750:6: (enumLiteral_1= 'is not' )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:750:6: (enumLiteral_1= 'is not' )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:750:8: enumLiteral_1= 'is not'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_30_in_ruleOPERATORS1641); 

                            current = grammarAccess.getOPERATORSAccess().getNOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOPERATORSAccess().getNOTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleOPERATORS"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilationUnit_in_ruleProduct130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilationUnit175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceUnit_in_ruleCompilationUnit221 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_ruleUseUnit_in_ruleCompilationUnit242 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_ruleProductUnit_in_ruleCompilationUnit264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseUnit_in_entryRuleUseUnit300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseUnit310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleUseUnit347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_ruleUseUnit370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceUnit_in_entryRuleNamespaceUnit406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceUnit416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleNamespaceUnit453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_ruleNamespaceUnit474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_entryRuleQUALIFIEDID511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIEDID522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIEDID562 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQUALIFIEDID581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIEDID596 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleProductUnit_in_entryRuleProductUnit643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProductUnit653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleProductUnit690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProductUnit707 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProductUnit725 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleParameterElement_in_ruleProductUnit746 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleOperationUnit_in_ruleProductUnit769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElement_in_entryRuleParameterElement805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterElement815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterElement857 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleParameterElement875 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_ruleUMAPDataTypes_in_ruleParameterElement896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationUnit_in_entryRuleOperationUnit934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationUnit944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOperationUnit981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationUnit998 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOperationUnit1015 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleOperationUnit1028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleControlElement_in_ruleOperationUnit1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlElement_in_entryRuleControlElement1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlElement1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_ruleControlElement1143 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleControlElement1155 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleControlStatementElement_in_ruleControlElement1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionElement1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionElement1267 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_ruleOPERATORS_in_ruleExpressionElement1288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionElement1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlStatementElement_in_entryRuleControlStatementElement1344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlStatementElement1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleControlStatementElement1391 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleControlStatementElement1403 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleControlStatementElement1415 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleControlStatementElement1432 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleControlStatementElement1449 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleControlStatementElement1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUMAPDataTypes1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleUMAPDataTypes1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleUMAPDataTypes1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleUMAPDataTypes1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleUMAPDataTypes1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOPERATORS1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOPERATORS1641 = new BitSet(new long[]{0x0000000000000002L});

}