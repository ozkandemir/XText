package com.ykb.umap.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'product'", "'parameters'", "':'", "'BRANCH'", "'CLIENT'", "'CURRENCY'", "'operation'", "'is'", "'controls'", "'=>'", "'is not'", "'valid'", "'empty'", "'sss'", "'.'", "'use'"
    };
    public static final int RULE_ID=4;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

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
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:67:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:68:2: (iv_ruleProduct= ruleProduct EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:69:2: iv_ruleProduct= ruleProduct EOF
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
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:76:1: ruleProduct returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:79:28: ( ( (lv_elements_0_0= ruleAbstractElement ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:82:3: lv_elements_0_0= ruleAbstractElement
            {
             
            	        newCompositeNode(grammarAccess.getProductAccess().getElementsAbstractElementParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractElement_in_ruleProduct130);
            lv_elements_0_0=ruleAbstractElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProductRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_0_0, 
                    		"AbstractElement");
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


    // $ANTLR start "entryRuleAbstractElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:106:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:107:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:108:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement165);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement175); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:115:1: ruleAbstractElement returns [EObject current=null] : ( ( (lv_namespace_0_0= ruleNamespaceElement ) ) ( (lv_use_1_0= ruleUseStatement ) )? ( (lv_product_2_0= ruleProductElement ) ) ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject lv_namespace_0_0 = null;

        EObject lv_use_1_0 = null;

        EObject lv_product_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:118:28: ( ( ( (lv_namespace_0_0= ruleNamespaceElement ) ) ( (lv_use_1_0= ruleUseStatement ) )? ( (lv_product_2_0= ruleProductElement ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:119:1: ( ( (lv_namespace_0_0= ruleNamespaceElement ) ) ( (lv_use_1_0= ruleUseStatement ) )? ( (lv_product_2_0= ruleProductElement ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:119:1: ( ( (lv_namespace_0_0= ruleNamespaceElement ) ) ( (lv_use_1_0= ruleUseStatement ) )? ( (lv_product_2_0= ruleProductElement ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:119:2: ( (lv_namespace_0_0= ruleNamespaceElement ) ) ( (lv_use_1_0= ruleUseStatement ) )? ( (lv_product_2_0= ruleProductElement ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:119:2: ( (lv_namespace_0_0= ruleNamespaceElement ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:120:1: (lv_namespace_0_0= ruleNamespaceElement )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:120:1: (lv_namespace_0_0= ruleNamespaceElement )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:121:3: lv_namespace_0_0= ruleNamespaceElement
            {
             
            	        newCompositeNode(grammarAccess.getAbstractElementAccess().getNamespaceNamespaceElementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNamespaceElement_in_ruleAbstractElement221);
            lv_namespace_0_0=ruleNamespaceElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAbstractElementRule());
            	        }
                   		set(
                   			current, 
                   			"namespace",
                    		lv_namespace_0_0, 
                    		"NamespaceElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:137:2: ( (lv_use_1_0= ruleUseStatement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:138:1: (lv_use_1_0= ruleUseStatement )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:138:1: (lv_use_1_0= ruleUseStatement )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:139:3: lv_use_1_0= ruleUseStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractElementAccess().getUseUseStatementParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUseStatement_in_ruleAbstractElement242);
                    lv_use_1_0=ruleUseStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractElementRule());
                    	        }
                           		set(
                           			current, 
                           			"use",
                            		lv_use_1_0, 
                            		"UseStatement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:155:3: ( (lv_product_2_0= ruleProductElement ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:156:1: (lv_product_2_0= ruleProductElement )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:156:1: (lv_product_2_0= ruleProductElement )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:157:3: lv_product_2_0= ruleProductElement
            {
             
            	        newCompositeNode(grammarAccess.getAbstractElementAccess().getProductProductElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleProductElement_in_ruleAbstractElement264);
            lv_product_2_0=ruleProductElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAbstractElementRule());
            	        }
                   		set(
                   			current, 
                   			"product",
                    		lv_product_2_0, 
                    		"ProductElement");
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleNamespaceElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:181:1: entryRuleNamespaceElement returns [EObject current=null] : iv_ruleNamespaceElement= ruleNamespaceElement EOF ;
    public final EObject entryRuleNamespaceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:182:2: (iv_ruleNamespaceElement= ruleNamespaceElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:183:2: iv_ruleNamespaceElement= ruleNamespaceElement EOF
            {
             newCompositeNode(grammarAccess.getNamespaceElementRule()); 
            pushFollow(FOLLOW_ruleNamespaceElement_in_entryRuleNamespaceElement300);
            iv_ruleNamespaceElement=ruleNamespaceElement();

            state._fsp--;

             current =iv_ruleNamespaceElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceElement310); 

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
    // $ANTLR end "entryRuleNamespaceElement"


    // $ANTLR start "ruleNamespaceElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:190:1: ruleNamespaceElement returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedID ) ) ) ;
    public final EObject ruleNamespaceElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:193:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedID ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:194:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedID ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:194:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedID ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:194:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleNamespaceElement347); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceElementAccess().getNamespaceKeyword_0());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:198:1: ( (lv_name_1_0= ruleQualifiedID ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:199:1: (lv_name_1_0= ruleQualifiedID )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:199:1: (lv_name_1_0= ruleQualifiedID )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:200:3: lv_name_1_0= ruleQualifiedID
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceElementAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedID_in_ruleNamespaceElement368);
            lv_name_1_0=ruleQualifiedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceElementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedID");
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
    // $ANTLR end "ruleNamespaceElement"


    // $ANTLR start "entryRuleProductElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:224:1: entryRuleProductElement returns [EObject current=null] : iv_ruleProductElement= ruleProductElement EOF ;
    public final EObject entryRuleProductElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:225:2: (iv_ruleProductElement= ruleProductElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:226:2: iv_ruleProductElement= ruleProductElement EOF
            {
             newCompositeNode(grammarAccess.getProductElementRule()); 
            pushFollow(FOLLOW_ruleProductElement_in_entryRuleProductElement404);
            iv_ruleProductElement=ruleProductElement();

            state._fsp--;

             current =iv_ruleProductElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProductElement414); 

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
    // $ANTLR end "entryRuleProductElement"


    // $ANTLR start "ruleProductElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:233:1: ruleProductElement returns [EObject current=null] : (otherlv_0= 'product' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleMultiParameterElement ) ) )? ( (lv_operation_4_0= ruleOperationElement ) ) ) ;
    public final EObject ruleProductElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_operation_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:236:28: ( (otherlv_0= 'product' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleMultiParameterElement ) ) )? ( (lv_operation_4_0= ruleOperationElement ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:237:1: (otherlv_0= 'product' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleMultiParameterElement ) ) )? ( (lv_operation_4_0= ruleOperationElement ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:237:1: (otherlv_0= 'product' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleMultiParameterElement ) ) )? ( (lv_operation_4_0= ruleOperationElement ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:237:3: otherlv_0= 'product' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleMultiParameterElement ) ) )? ( (lv_operation_4_0= ruleOperationElement ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleProductElement451); 

                	newLeafNode(otherlv_0, grammarAccess.getProductElementAccess().getProductKeyword_0());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:241:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:242:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:242:1: (lv_name_1_0= RULE_ID )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:243:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProductElement468); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProductElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:259:2: (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleMultiParameterElement ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:259:4: otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleMultiParameterElement ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleProductElement486); 

                        	newLeafNode(otherlv_2, grammarAccess.getProductElementAccess().getParametersKeyword_2_0());
                        
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:263:1: ( (lv_parameters_3_0= ruleMultiParameterElement ) )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:264:1: (lv_parameters_3_0= ruleMultiParameterElement )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:264:1: (lv_parameters_3_0= ruleMultiParameterElement )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:265:3: lv_parameters_3_0= ruleMultiParameterElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductElementAccess().getParametersMultiParameterElementParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiParameterElement_in_ruleProductElement507);
                    lv_parameters_3_0=ruleMultiParameterElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProductElementRule());
                    	        }
                           		set(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"MultiParameterElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:281:4: ( (lv_operation_4_0= ruleOperationElement ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:282:1: (lv_operation_4_0= ruleOperationElement )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:282:1: (lv_operation_4_0= ruleOperationElement )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:283:3: lv_operation_4_0= ruleOperationElement
            {
             
            	        newCompositeNode(grammarAccess.getProductElementAccess().getOperationOperationElementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleOperationElement_in_ruleProductElement530);
            lv_operation_4_0=ruleOperationElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProductElementRule());
            	        }
                   		set(
                   			current, 
                   			"operation",
                    		lv_operation_4_0, 
                    		"OperationElement");
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
    // $ANTLR end "ruleProductElement"


    // $ANTLR start "entryRuleMultiParameterElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:307:1: entryRuleMultiParameterElement returns [EObject current=null] : iv_ruleMultiParameterElement= ruleMultiParameterElement EOF ;
    public final EObject entryRuleMultiParameterElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiParameterElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:308:2: (iv_ruleMultiParameterElement= ruleMultiParameterElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:309:2: iv_ruleMultiParameterElement= ruleMultiParameterElement EOF
            {
             newCompositeNode(grammarAccess.getMultiParameterElementRule()); 
            pushFollow(FOLLOW_ruleMultiParameterElement_in_entryRuleMultiParameterElement566);
            iv_ruleMultiParameterElement=ruleMultiParameterElement();

            state._fsp--;

             current =iv_ruleMultiParameterElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiParameterElement576); 

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
    // $ANTLR end "entryRuleMultiParameterElement"


    // $ANTLR start "ruleMultiParameterElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:316:1: ruleMultiParameterElement returns [EObject current=null] : ( (lv_params_0_0= ruleParameterElement ) )* ;
    public final EObject ruleMultiParameterElement() throws RecognitionException {
        EObject current = null;

        EObject lv_params_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:319:28: ( ( (lv_params_0_0= ruleParameterElement ) )* )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:320:1: ( (lv_params_0_0= ruleParameterElement ) )*
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:320:1: ( (lv_params_0_0= ruleParameterElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:321:1: (lv_params_0_0= ruleParameterElement )
            	    {
            	    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:321:1: (lv_params_0_0= ruleParameterElement )
            	    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:322:3: lv_params_0_0= ruleParameterElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiParameterElementAccess().getParamsParameterElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameterElement_in_ruleMultiParameterElement621);
            	    lv_params_0_0=ruleParameterElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiParameterElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_0_0, 
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
    // $ANTLR end "ruleMultiParameterElement"


    // $ANTLR start "entryRuleParameterElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:346:1: entryRuleParameterElement returns [EObject current=null] : iv_ruleParameterElement= ruleParameterElement EOF ;
    public final EObject entryRuleParameterElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:347:2: (iv_ruleParameterElement= ruleParameterElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:348:2: iv_ruleParameterElement= ruleParameterElement EOF
            {
             newCompositeNode(grammarAccess.getParameterElementRule()); 
            pushFollow(FOLLOW_ruleParameterElement_in_entryRuleParameterElement657);
            iv_ruleParameterElement=ruleParameterElement();

            state._fsp--;

             current =iv_ruleParameterElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterElement667); 

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
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:355:1: ruleParameterElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( (lv_type_2_1= 'BRANCH' | lv_type_2_2= 'CLIENT' | lv_type_2_3= 'CURRENCY' | lv_type_2_4= RULE_ID ) ) ) )? ) ;
    public final EObject ruleParameterElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token lv_type_2_3=null;
        Token lv_type_2_4=null;

         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:358:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( (lv_type_2_1= 'BRANCH' | lv_type_2_2= 'CLIENT' | lv_type_2_3= 'CURRENCY' | lv_type_2_4= RULE_ID ) ) ) )? ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:359:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( (lv_type_2_1= 'BRANCH' | lv_type_2_2= 'CLIENT' | lv_type_2_3= 'CURRENCY' | lv_type_2_4= RULE_ID ) ) ) )? )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:359:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( (lv_type_2_1= 'BRANCH' | lv_type_2_2= 'CLIENT' | lv_type_2_3= 'CURRENCY' | lv_type_2_4= RULE_ID ) ) ) )? )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:359:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( (lv_type_2_1= 'BRANCH' | lv_type_2_2= 'CLIENT' | lv_type_2_3= 'CURRENCY' | lv_type_2_4= RULE_ID ) ) ) )?
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:359:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:360:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:360:1: (lv_name_0_0= RULE_ID )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:361:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterElement709); 

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

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:377:2: (otherlv_1= ':' ( ( (lv_type_2_1= 'BRANCH' | lv_type_2_2= 'CLIENT' | lv_type_2_3= 'CURRENCY' | lv_type_2_4= RULE_ID ) ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:377:4: otherlv_1= ':' ( ( (lv_type_2_1= 'BRANCH' | lv_type_2_2= 'CLIENT' | lv_type_2_3= 'CURRENCY' | lv_type_2_4= RULE_ID ) ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleParameterElement727); 

                        	newLeafNode(otherlv_1, grammarAccess.getParameterElementAccess().getColonKeyword_1_0());
                        
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:381:1: ( ( (lv_type_2_1= 'BRANCH' | lv_type_2_2= 'CLIENT' | lv_type_2_3= 'CURRENCY' | lv_type_2_4= RULE_ID ) ) )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:382:1: ( (lv_type_2_1= 'BRANCH' | lv_type_2_2= 'CLIENT' | lv_type_2_3= 'CURRENCY' | lv_type_2_4= RULE_ID ) )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:382:1: ( (lv_type_2_1= 'BRANCH' | lv_type_2_2= 'CLIENT' | lv_type_2_3= 'CURRENCY' | lv_type_2_4= RULE_ID ) )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:383:1: (lv_type_2_1= 'BRANCH' | lv_type_2_2= 'CLIENT' | lv_type_2_3= 'CURRENCY' | lv_type_2_4= RULE_ID )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:383:1: (lv_type_2_1= 'BRANCH' | lv_type_2_2= 'CLIENT' | lv_type_2_3= 'CURRENCY' | lv_type_2_4= RULE_ID )
                    int alt4=4;
                    switch ( input.LA(1) ) {
                    case 15:
                        {
                        alt4=1;
                        }
                        break;
                    case 16:
                        {
                        alt4=2;
                        }
                        break;
                    case 17:
                        {
                        alt4=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt4=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }

                    switch (alt4) {
                        case 1 :
                            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:384:3: lv_type_2_1= 'BRANCH'
                            {
                            lv_type_2_1=(Token)match(input,15,FOLLOW_15_in_ruleParameterElement747); 

                                    newLeafNode(lv_type_2_1, grammarAccess.getParameterElementAccess().getTypeBRANCHKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getParameterElementRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:396:8: lv_type_2_2= 'CLIENT'
                            {
                            lv_type_2_2=(Token)match(input,16,FOLLOW_16_in_ruleParameterElement776); 

                                    newLeafNode(lv_type_2_2, grammarAccess.getParameterElementAccess().getTypeCLIENTKeyword_1_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getParameterElementRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_2_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:408:8: lv_type_2_3= 'CURRENCY'
                            {
                            lv_type_2_3=(Token)match(input,17,FOLLOW_17_in_ruleParameterElement805); 

                                    newLeafNode(lv_type_2_3, grammarAccess.getParameterElementAccess().getTypeCURRENCYKeyword_1_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getParameterElementRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_2_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:420:8: lv_type_2_4= RULE_ID
                            {
                            lv_type_2_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterElement833); 

                            			newLeafNode(lv_type_2_4, grammarAccess.getParameterElementAccess().getTypeIDTerminalRuleCall_1_1_0_3()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getParameterElementRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"type",
                                    		lv_type_2_4, 
                                    		"ID");
                            	    

                            }
                            break;

                    }


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


    // $ANTLR start "entryRuleOperationElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:446:1: entryRuleOperationElement returns [EObject current=null] : iv_ruleOperationElement= ruleOperationElement EOF ;
    public final EObject entryRuleOperationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:447:2: (iv_ruleOperationElement= ruleOperationElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:448:2: iv_ruleOperationElement= ruleOperationElement EOF
            {
             newCompositeNode(grammarAccess.getOperationElementRule()); 
            pushFollow(FOLLOW_ruleOperationElement_in_entryRuleOperationElement879);
            iv_ruleOperationElement=ruleOperationElement();

            state._fsp--;

             current =iv_ruleOperationElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationElement889); 

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
    // $ANTLR end "entryRuleOperationElement"


    // $ANTLR start "ruleOperationElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:455:1: ruleOperationElement returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_controls_3_0= ruleControlBlockElement ) )? ) ;
    public final EObject ruleOperationElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_controls_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:458:28: ( (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_controls_3_0= ruleControlBlockElement ) )? ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:459:1: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_controls_3_0= ruleControlBlockElement ) )? )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:459:1: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_controls_3_0= ruleControlBlockElement ) )? )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:459:3: otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_controls_3_0= ruleControlBlockElement ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleOperationElement926); 

                	newLeafNode(otherlv_0, grammarAccess.getOperationElementAccess().getOperationKeyword_0());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:463:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:464:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:464:1: (lv_name_1_0= RULE_ID )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:465:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationElement943); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOperationElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleOperationElement960); 

                	newLeafNode(otherlv_2, grammarAccess.getOperationElementAccess().getIsKeyword_2());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:485:1: ( (lv_controls_3_0= ruleControlBlockElement ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:486:1: (lv_controls_3_0= ruleControlBlockElement )
                    {
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:486:1: (lv_controls_3_0= ruleControlBlockElement )
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:487:3: lv_controls_3_0= ruleControlBlockElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationElementAccess().getControlsControlBlockElementParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleControlBlockElement_in_ruleOperationElement981);
                    lv_controls_3_0=ruleControlBlockElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationElementRule());
                    	        }
                           		set(
                           			current, 
                           			"controls",
                            		lv_controls_3_0, 
                            		"ControlBlockElement");
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
    // $ANTLR end "ruleOperationElement"


    // $ANTLR start "entryRuleControlBlockElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:511:1: entryRuleControlBlockElement returns [EObject current=null] : iv_ruleControlBlockElement= ruleControlBlockElement EOF ;
    public final EObject entryRuleControlBlockElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlBlockElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:512:2: (iv_ruleControlBlockElement= ruleControlBlockElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:513:2: iv_ruleControlBlockElement= ruleControlBlockElement EOF
            {
             newCompositeNode(grammarAccess.getControlBlockElementRule()); 
            pushFollow(FOLLOW_ruleControlBlockElement_in_entryRuleControlBlockElement1018);
            iv_ruleControlBlockElement=ruleControlBlockElement();

            state._fsp--;

             current =iv_ruleControlBlockElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlBlockElement1028); 

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
    // $ANTLR end "entryRuleControlBlockElement"


    // $ANTLR start "ruleControlBlockElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:520:1: ruleControlBlockElement returns [EObject current=null] : (otherlv_0= 'controls' ( (lv_controls_1_0= ruleControlStatementElement ) ) ) ;
    public final EObject ruleControlBlockElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_controls_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:523:28: ( (otherlv_0= 'controls' ( (lv_controls_1_0= ruleControlStatementElement ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:524:1: (otherlv_0= 'controls' ( (lv_controls_1_0= ruleControlStatementElement ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:524:1: (otherlv_0= 'controls' ( (lv_controls_1_0= ruleControlStatementElement ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:524:3: otherlv_0= 'controls' ( (lv_controls_1_0= ruleControlStatementElement ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleControlBlockElement1065); 

                	newLeafNode(otherlv_0, grammarAccess.getControlBlockElementAccess().getControlsKeyword_0());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:528:1: ( (lv_controls_1_0= ruleControlStatementElement ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:529:1: (lv_controls_1_0= ruleControlStatementElement )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:529:1: (lv_controls_1_0= ruleControlStatementElement )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:530:3: lv_controls_1_0= ruleControlStatementElement
            {
             
            	        newCompositeNode(grammarAccess.getControlBlockElementAccess().getControlsControlStatementElementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleControlStatementElement_in_ruleControlBlockElement1086);
            lv_controls_1_0=ruleControlStatementElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControlBlockElementRule());
            	        }
                   		add(
                   			current, 
                   			"controls",
                    		lv_controls_1_0, 
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
    // $ANTLR end "ruleControlBlockElement"


    // $ANTLR start "entryRuleControlStatementElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:554:1: entryRuleControlStatementElement returns [EObject current=null] : iv_ruleControlStatementElement= ruleControlStatementElement EOF ;
    public final EObject entryRuleControlStatementElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlStatementElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:555:2: (iv_ruleControlStatementElement= ruleControlStatementElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:556:2: iv_ruleControlStatementElement= ruleControlStatementElement EOF
            {
             newCompositeNode(grammarAccess.getControlStatementElementRule()); 
            pushFollow(FOLLOW_ruleControlStatementElement_in_entryRuleControlStatementElement1122);
            iv_ruleControlStatementElement=ruleControlStatementElement();

            state._fsp--;

             current =iv_ruleControlStatementElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlStatementElement1132); 

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
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:563:1: ruleControlStatementElement returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpressionElement ) ) otherlv_1= '=>' ( (lv_statement_2_0= ruleStatementElement ) ) ) ;
    public final EObject ruleControlStatementElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        AntlrDatatypeRuleToken lv_statement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:566:28: ( ( ( (lv_expression_0_0= ruleExpressionElement ) ) otherlv_1= '=>' ( (lv_statement_2_0= ruleStatementElement ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:567:1: ( ( (lv_expression_0_0= ruleExpressionElement ) ) otherlv_1= '=>' ( (lv_statement_2_0= ruleStatementElement ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:567:1: ( ( (lv_expression_0_0= ruleExpressionElement ) ) otherlv_1= '=>' ( (lv_statement_2_0= ruleStatementElement ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:567:2: ( (lv_expression_0_0= ruleExpressionElement ) ) otherlv_1= '=>' ( (lv_statement_2_0= ruleStatementElement ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:567:2: ( (lv_expression_0_0= ruleExpressionElement ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:568:1: (lv_expression_0_0= ruleExpressionElement )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:568:1: (lv_expression_0_0= ruleExpressionElement )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:569:3: lv_expression_0_0= ruleExpressionElement
            {
             
            	        newCompositeNode(grammarAccess.getControlStatementElementAccess().getExpressionExpressionElementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpressionElement_in_ruleControlStatementElement1178);
            lv_expression_0_0=ruleExpressionElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControlStatementElementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"ExpressionElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleControlStatementElement1190); 

                	newLeafNode(otherlv_1, grammarAccess.getControlStatementElementAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:589:1: ( (lv_statement_2_0= ruleStatementElement ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:590:1: (lv_statement_2_0= ruleStatementElement )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:590:1: (lv_statement_2_0= ruleStatementElement )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:591:3: lv_statement_2_0= ruleStatementElement
            {
             
            	        newCompositeNode(grammarAccess.getControlStatementElementAccess().getStatementStatementElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementElement_in_ruleControlStatementElement1211);
            lv_statement_2_0=ruleStatementElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControlStatementElementRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_2_0, 
                    		"StatementElement");
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
    // $ANTLR end "ruleControlStatementElement"


    // $ANTLR start "entryRuleExpressionElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:615:1: entryRuleExpressionElement returns [EObject current=null] : iv_ruleExpressionElement= ruleExpressionElement EOF ;
    public final EObject entryRuleExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:616:2: (iv_ruleExpressionElement= ruleExpressionElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:617:2: iv_ruleExpressionElement= ruleExpressionElement EOF
            {
             newCompositeNode(grammarAccess.getExpressionElementRule()); 
            pushFollow(FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement1247);
            iv_ruleExpressionElement=ruleExpressionElement();

            state._fsp--;

             current =iv_ruleExpressionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionElement1257); 

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
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:624:1: ruleExpressionElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=>' | lv_operator_1_2= 'is' | lv_operator_1_3= 'is not' ) ) ) ( ( (lv_right_2_1= 'valid' | lv_right_2_2= 'empty' ) ) ) ) ;
    public final EObject ruleExpressionElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        Token lv_operator_1_3=null;
        Token lv_right_2_1=null;
        Token lv_right_2_2=null;

         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:627:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=>' | lv_operator_1_2= 'is' | lv_operator_1_3= 'is not' ) ) ) ( ( (lv_right_2_1= 'valid' | lv_right_2_2= 'empty' ) ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:628:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=>' | lv_operator_1_2= 'is' | lv_operator_1_3= 'is not' ) ) ) ( ( (lv_right_2_1= 'valid' | lv_right_2_2= 'empty' ) ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:628:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=>' | lv_operator_1_2= 'is' | lv_operator_1_3= 'is not' ) ) ) ( ( (lv_right_2_1= 'valid' | lv_right_2_2= 'empty' ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:628:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_operator_1_1= '=>' | lv_operator_1_2= 'is' | lv_operator_1_3= 'is not' ) ) ) ( ( (lv_right_2_1= 'valid' | lv_right_2_2= 'empty' ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:628:2: ( (otherlv_0= RULE_ID ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:629:1: (otherlv_0= RULE_ID )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:629:1: (otherlv_0= RULE_ID )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:630:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExpressionElementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpressionElement1302); 

            		newLeafNode(otherlv_0, grammarAccess.getExpressionElementAccess().getParameterParameterElementCrossReference_0_0()); 
            	

            }


            }

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:641:2: ( ( (lv_operator_1_1= '=>' | lv_operator_1_2= 'is' | lv_operator_1_3= 'is not' ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:642:1: ( (lv_operator_1_1= '=>' | lv_operator_1_2= 'is' | lv_operator_1_3= 'is not' ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:642:1: ( (lv_operator_1_1= '=>' | lv_operator_1_2= 'is' | lv_operator_1_3= 'is not' ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:643:1: (lv_operator_1_1= '=>' | lv_operator_1_2= 'is' | lv_operator_1_3= 'is not' )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:643:1: (lv_operator_1_1= '=>' | lv_operator_1_2= 'is' | lv_operator_1_3= 'is not' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:644:3: lv_operator_1_1= '=>'
                    {
                    lv_operator_1_1=(Token)match(input,21,FOLLOW_21_in_ruleExpressionElement1322); 

                            newLeafNode(lv_operator_1_1, grammarAccess.getExpressionElementAccess().getOperatorEqualsSignGreaterThanSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionElementRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:656:8: lv_operator_1_2= 'is'
                    {
                    lv_operator_1_2=(Token)match(input,19,FOLLOW_19_in_ruleExpressionElement1351); 

                            newLeafNode(lv_operator_1_2, grammarAccess.getExpressionElementAccess().getOperatorIsKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionElementRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:668:8: lv_operator_1_3= 'is not'
                    {
                    lv_operator_1_3=(Token)match(input,22,FOLLOW_22_in_ruleExpressionElement1380); 

                            newLeafNode(lv_operator_1_3, grammarAccess.getExpressionElementAccess().getOperatorIsNotKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionElementRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:683:2: ( ( (lv_right_2_1= 'valid' | lv_right_2_2= 'empty' ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:684:1: ( (lv_right_2_1= 'valid' | lv_right_2_2= 'empty' ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:684:1: ( (lv_right_2_1= 'valid' | lv_right_2_2= 'empty' ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:685:1: (lv_right_2_1= 'valid' | lv_right_2_2= 'empty' )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:685:1: (lv_right_2_1= 'valid' | lv_right_2_2= 'empty' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:686:3: lv_right_2_1= 'valid'
                    {
                    lv_right_2_1=(Token)match(input,23,FOLLOW_23_in_ruleExpressionElement1416); 

                            newLeafNode(lv_right_2_1, grammarAccess.getExpressionElementAccess().getRightValidKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionElementRule());
                    	        }
                           		setWithLastConsumed(current, "right", lv_right_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:698:8: lv_right_2_2= 'empty'
                    {
                    lv_right_2_2=(Token)match(input,24,FOLLOW_24_in_ruleExpressionElement1445); 

                            newLeafNode(lv_right_2_2, grammarAccess.getExpressionElementAccess().getRightEmptyKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionElementRule());
                    	        }
                           		setWithLastConsumed(current, "right", lv_right_2_2, null);
                    	    

                    }
                    break;

            }


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


    // $ANTLR start "entryRuleStatementElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:723:1: entryRuleStatementElement returns [String current=null] : iv_ruleStatementElement= ruleStatementElement EOF ;
    public final String entryRuleStatementElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatementElement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:724:2: (iv_ruleStatementElement= ruleStatementElement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:725:2: iv_ruleStatementElement= ruleStatementElement EOF
            {
             newCompositeNode(grammarAccess.getStatementElementRule()); 
            pushFollow(FOLLOW_ruleStatementElement_in_entryRuleStatementElement1500);
            iv_ruleStatementElement=ruleStatementElement();

            state._fsp--;

             current =iv_ruleStatementElement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementElement1511); 

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
    // $ANTLR end "entryRuleStatementElement"


    // $ANTLR start "ruleStatementElement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:732:1: ruleStatementElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'sss' ;
    public final AntlrDatatypeRuleToken ruleStatementElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:735:28: (kw= 'sss' )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:737:2: kw= 'sss'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleStatementElement1548); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatementElementAccess().getSssKeyword()); 
                

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
    // $ANTLR end "ruleStatementElement"


    // $ANTLR start "entryRuleQualifiedID"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:752:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:753:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:754:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1590);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedID1601); 

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
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:761:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:764:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:765:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:765:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:765:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID1641); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:772:1: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:773:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_26_in_ruleQualifiedID1660); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedID1675); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "entryRuleUseStatement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:793:1: entryRuleUseStatement returns [EObject current=null] : iv_ruleUseStatement= ruleUseStatement EOF ;
    public final EObject entryRuleUseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseStatement = null;


        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:794:2: (iv_ruleUseStatement= ruleUseStatement EOF )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:795:2: iv_ruleUseStatement= ruleUseStatement EOF
            {
             newCompositeNode(grammarAccess.getUseStatementRule()); 
            pushFollow(FOLLOW_ruleUseStatement_in_entryRuleUseStatement1722);
            iv_ruleUseStatement=ruleUseStatement();

            state._fsp--;

             current =iv_ruleUseStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseStatement1732); 

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
    // $ANTLR end "entryRuleUseStatement"


    // $ANTLR start "ruleUseStatement"
    // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:802:1: ruleUseStatement returns [EObject current=null] : (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleUseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:805:28: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:806:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:806:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:806:3: otherlv_0= 'use' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleUseStatement1769); 

                	newLeafNode(otherlv_0, grammarAccess.getUseStatementAccess().getUseKeyword_0());
                
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:810:1: ( (otherlv_1= RULE_ID ) )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:811:1: (otherlv_1= RULE_ID )
            {
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:811:1: (otherlv_1= RULE_ID )
            // ../com.ykb.umap.dsl/src-gen/com/ykb/umap/dsl/parser/antlr/internal/InternalProduct.g:812:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseStatementRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseStatement1789); 

            		newLeafNode(otherlv_1, grammarAccess.getUseStatementAccess().getProductProductElementCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleUseStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleProduct130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceElement_in_ruleAbstractElement221 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_ruleUseStatement_in_ruleAbstractElement242 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_ruleProductElement_in_ruleAbstractElement264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceElement_in_entryRuleNamespaceElement300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceElement310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNamespaceElement347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_ruleNamespaceElement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProductElement_in_entryRuleProductElement404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProductElement414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleProductElement451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProductElement468 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleProductElement486 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_ruleMultiParameterElement_in_ruleProductElement507 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_ruleOperationElement_in_ruleProductElement530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiParameterElement_in_entryRuleMultiParameterElement566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiParameterElement576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElement_in_ruleMultiParameterElement621 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleParameterElement_in_entryRuleParameterElement657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterElement667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterElement709 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleParameterElement727 = new BitSet(new long[]{0x0000000000038010L});
    public static final BitSet FOLLOW_15_in_ruleParameterElement747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleParameterElement776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleParameterElement805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterElement833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationElement_in_entryRuleOperationElement879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationElement889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOperationElement926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationElement943 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOperationElement960 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleControlBlockElement_in_ruleOperationElement981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlBlockElement_in_entryRuleControlBlockElement1018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlBlockElement1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleControlBlockElement1065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleControlStatementElement_in_ruleControlBlockElement1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlStatementElement_in_entryRuleControlStatementElement1122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlStatementElement1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_ruleControlStatementElement1178 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleControlStatementElement1190 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleStatementElement_in_ruleControlStatementElement1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement1247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionElement1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionElement1302 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_21_in_ruleExpressionElement1322 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_19_in_ruleExpressionElement1351 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_22_in_ruleExpressionElement1380 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleExpressionElement1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleExpressionElement1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementElement_in_entryRuleStatementElement1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementElement1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStatementElement1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1641 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQualifiedID1660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1675 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleUseStatement_in_entryRuleUseStatement1722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseStatement1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleUseStatement1769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseStatement1789 = new BitSet(new long[]{0x0000000000000002L});

}