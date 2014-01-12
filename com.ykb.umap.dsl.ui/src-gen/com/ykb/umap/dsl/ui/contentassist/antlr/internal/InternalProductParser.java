package com.ykb.umap.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.ykb.umap.dsl.services.ProductGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProductParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sss'", "'BRANCH'", "'CLIENT'", "'CURRENCY'", "'=>'", "'is'", "'is not'", "'valid'", "'empty'", "'namespace'", "'product'", "'parameters'", "':'", "'operation'", "'controls'", "'.'", "'use'"
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
    public String getGrammarFileName() { return "../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g"; }


     
     	private ProductGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ProductGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProduct"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:60:1: entryRuleProduct : ruleProduct EOF ;
    public final void entryRuleProduct() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:61:1: ( ruleProduct EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:62:1: ruleProduct EOF
            {
             before(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct61);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getProductRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct68); 

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
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:69:1: ruleProduct : ( ( rule__Product__ElementsAssignment ) ) ;
    public final void ruleProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:73:2: ( ( ( rule__Product__ElementsAssignment ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:74:1: ( ( rule__Product__ElementsAssignment ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:74:1: ( ( rule__Product__ElementsAssignment ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:75:1: ( rule__Product__ElementsAssignment )
            {
             before(grammarAccess.getProductAccess().getElementsAssignment()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:76:1: ( rule__Product__ElementsAssignment )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:76:2: rule__Product__ElementsAssignment
            {
            pushFollow(FOLLOW_rule__Product__ElementsAssignment_in_ruleProduct94);
            rule__Product__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleAbstractElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:88:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:89:1: ( ruleAbstractElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:90:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement121);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement128); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:97:1: ruleAbstractElement : ( ( rule__AbstractElement__Group__0 ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:101:2: ( ( ( rule__AbstractElement__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:102:1: ( ( rule__AbstractElement__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:102:1: ( ( rule__AbstractElement__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:103:1: ( rule__AbstractElement__Group__0 )
            {
             before(grammarAccess.getAbstractElementAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:104:1: ( rule__AbstractElement__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:104:2: rule__AbstractElement__Group__0
            {
            pushFollow(FOLLOW_rule__AbstractElement__Group__0_in_ruleAbstractElement154);
            rule__AbstractElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getGroup()); 

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleNamespaceElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:116:1: entryRuleNamespaceElement : ruleNamespaceElement EOF ;
    public final void entryRuleNamespaceElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:117:1: ( ruleNamespaceElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:118:1: ruleNamespaceElement EOF
            {
             before(grammarAccess.getNamespaceElementRule()); 
            pushFollow(FOLLOW_ruleNamespaceElement_in_entryRuleNamespaceElement181);
            ruleNamespaceElement();

            state._fsp--;

             after(grammarAccess.getNamespaceElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceElement188); 

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
    // $ANTLR end "entryRuleNamespaceElement"


    // $ANTLR start "ruleNamespaceElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:125:1: ruleNamespaceElement : ( ( rule__NamespaceElement__Group__0 ) ) ;
    public final void ruleNamespaceElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:129:2: ( ( ( rule__NamespaceElement__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:130:1: ( ( rule__NamespaceElement__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:130:1: ( ( rule__NamespaceElement__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:131:1: ( rule__NamespaceElement__Group__0 )
            {
             before(grammarAccess.getNamespaceElementAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:132:1: ( rule__NamespaceElement__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:132:2: rule__NamespaceElement__Group__0
            {
            pushFollow(FOLLOW_rule__NamespaceElement__Group__0_in_ruleNamespaceElement214);
            rule__NamespaceElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceElementAccess().getGroup()); 

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
    // $ANTLR end "ruleNamespaceElement"


    // $ANTLR start "entryRuleProductElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:144:1: entryRuleProductElement : ruleProductElement EOF ;
    public final void entryRuleProductElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:145:1: ( ruleProductElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:146:1: ruleProductElement EOF
            {
             before(grammarAccess.getProductElementRule()); 
            pushFollow(FOLLOW_ruleProductElement_in_entryRuleProductElement241);
            ruleProductElement();

            state._fsp--;

             after(grammarAccess.getProductElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProductElement248); 

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
    // $ANTLR end "entryRuleProductElement"


    // $ANTLR start "ruleProductElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:153:1: ruleProductElement : ( ( rule__ProductElement__Group__0 ) ) ;
    public final void ruleProductElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:157:2: ( ( ( rule__ProductElement__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:158:1: ( ( rule__ProductElement__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:158:1: ( ( rule__ProductElement__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:159:1: ( rule__ProductElement__Group__0 )
            {
             before(grammarAccess.getProductElementAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:160:1: ( rule__ProductElement__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:160:2: rule__ProductElement__Group__0
            {
            pushFollow(FOLLOW_rule__ProductElement__Group__0_in_ruleProductElement274);
            rule__ProductElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductElementAccess().getGroup()); 

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
    // $ANTLR end "ruleProductElement"


    // $ANTLR start "entryRuleMultiParameterElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:172:1: entryRuleMultiParameterElement : ruleMultiParameterElement EOF ;
    public final void entryRuleMultiParameterElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:173:1: ( ruleMultiParameterElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:174:1: ruleMultiParameterElement EOF
            {
             before(grammarAccess.getMultiParameterElementRule()); 
            pushFollow(FOLLOW_ruleMultiParameterElement_in_entryRuleMultiParameterElement301);
            ruleMultiParameterElement();

            state._fsp--;

             after(grammarAccess.getMultiParameterElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiParameterElement308); 

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
    // $ANTLR end "entryRuleMultiParameterElement"


    // $ANTLR start "ruleMultiParameterElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:181:1: ruleMultiParameterElement : ( ( rule__MultiParameterElement__ParamsAssignment )* ) ;
    public final void ruleMultiParameterElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:185:2: ( ( ( rule__MultiParameterElement__ParamsAssignment )* ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:186:1: ( ( rule__MultiParameterElement__ParamsAssignment )* )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:186:1: ( ( rule__MultiParameterElement__ParamsAssignment )* )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:187:1: ( rule__MultiParameterElement__ParamsAssignment )*
            {
             before(grammarAccess.getMultiParameterElementAccess().getParamsAssignment()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:188:1: ( rule__MultiParameterElement__ParamsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:188:2: rule__MultiParameterElement__ParamsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__MultiParameterElement__ParamsAssignment_in_ruleMultiParameterElement334);
            	    rule__MultiParameterElement__ParamsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMultiParameterElementAccess().getParamsAssignment()); 

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
    // $ANTLR end "ruleMultiParameterElement"


    // $ANTLR start "entryRuleParameterElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:200:1: entryRuleParameterElement : ruleParameterElement EOF ;
    public final void entryRuleParameterElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:201:1: ( ruleParameterElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:202:1: ruleParameterElement EOF
            {
             before(grammarAccess.getParameterElementRule()); 
            pushFollow(FOLLOW_ruleParameterElement_in_entryRuleParameterElement362);
            ruleParameterElement();

            state._fsp--;

             after(grammarAccess.getParameterElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterElement369); 

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
    // $ANTLR end "entryRuleParameterElement"


    // $ANTLR start "ruleParameterElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:209:1: ruleParameterElement : ( ( rule__ParameterElement__Group__0 ) ) ;
    public final void ruleParameterElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:213:2: ( ( ( rule__ParameterElement__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:214:1: ( ( rule__ParameterElement__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:214:1: ( ( rule__ParameterElement__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:215:1: ( rule__ParameterElement__Group__0 )
            {
             before(grammarAccess.getParameterElementAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:216:1: ( rule__ParameterElement__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:216:2: rule__ParameterElement__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group__0_in_ruleParameterElement395);
            rule__ParameterElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterElementAccess().getGroup()); 

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
    // $ANTLR end "ruleParameterElement"


    // $ANTLR start "entryRuleOperationElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:228:1: entryRuleOperationElement : ruleOperationElement EOF ;
    public final void entryRuleOperationElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:229:1: ( ruleOperationElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:230:1: ruleOperationElement EOF
            {
             before(grammarAccess.getOperationElementRule()); 
            pushFollow(FOLLOW_ruleOperationElement_in_entryRuleOperationElement422);
            ruleOperationElement();

            state._fsp--;

             after(grammarAccess.getOperationElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationElement429); 

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
    // $ANTLR end "entryRuleOperationElement"


    // $ANTLR start "ruleOperationElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:237:1: ruleOperationElement : ( ( rule__OperationElement__Group__0 ) ) ;
    public final void ruleOperationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:241:2: ( ( ( rule__OperationElement__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:242:1: ( ( rule__OperationElement__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:242:1: ( ( rule__OperationElement__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:243:1: ( rule__OperationElement__Group__0 )
            {
             before(grammarAccess.getOperationElementAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:244:1: ( rule__OperationElement__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:244:2: rule__OperationElement__Group__0
            {
            pushFollow(FOLLOW_rule__OperationElement__Group__0_in_ruleOperationElement455);
            rule__OperationElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationElementAccess().getGroup()); 

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
    // $ANTLR end "ruleOperationElement"


    // $ANTLR start "entryRuleControlBlockElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:256:1: entryRuleControlBlockElement : ruleControlBlockElement EOF ;
    public final void entryRuleControlBlockElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:257:1: ( ruleControlBlockElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:258:1: ruleControlBlockElement EOF
            {
             before(grammarAccess.getControlBlockElementRule()); 
            pushFollow(FOLLOW_ruleControlBlockElement_in_entryRuleControlBlockElement482);
            ruleControlBlockElement();

            state._fsp--;

             after(grammarAccess.getControlBlockElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlBlockElement489); 

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
    // $ANTLR end "entryRuleControlBlockElement"


    // $ANTLR start "ruleControlBlockElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:265:1: ruleControlBlockElement : ( ( rule__ControlBlockElement__Group__0 ) ) ;
    public final void ruleControlBlockElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:269:2: ( ( ( rule__ControlBlockElement__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:270:1: ( ( rule__ControlBlockElement__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:270:1: ( ( rule__ControlBlockElement__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:271:1: ( rule__ControlBlockElement__Group__0 )
            {
             before(grammarAccess.getControlBlockElementAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:272:1: ( rule__ControlBlockElement__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:272:2: rule__ControlBlockElement__Group__0
            {
            pushFollow(FOLLOW_rule__ControlBlockElement__Group__0_in_ruleControlBlockElement515);
            rule__ControlBlockElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getControlBlockElementAccess().getGroup()); 

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
    // $ANTLR end "ruleControlBlockElement"


    // $ANTLR start "entryRuleControlStatementElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:284:1: entryRuleControlStatementElement : ruleControlStatementElement EOF ;
    public final void entryRuleControlStatementElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:285:1: ( ruleControlStatementElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:286:1: ruleControlStatementElement EOF
            {
             before(grammarAccess.getControlStatementElementRule()); 
            pushFollow(FOLLOW_ruleControlStatementElement_in_entryRuleControlStatementElement542);
            ruleControlStatementElement();

            state._fsp--;

             after(grammarAccess.getControlStatementElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlStatementElement549); 

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
    // $ANTLR end "entryRuleControlStatementElement"


    // $ANTLR start "ruleControlStatementElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:293:1: ruleControlStatementElement : ( ( rule__ControlStatementElement__Group__0 ) ) ;
    public final void ruleControlStatementElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:297:2: ( ( ( rule__ControlStatementElement__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:298:1: ( ( rule__ControlStatementElement__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:298:1: ( ( rule__ControlStatementElement__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:299:1: ( rule__ControlStatementElement__Group__0 )
            {
             before(grammarAccess.getControlStatementElementAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:300:1: ( rule__ControlStatementElement__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:300:2: rule__ControlStatementElement__Group__0
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__Group__0_in_ruleControlStatementElement575);
            rule__ControlStatementElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getControlStatementElementAccess().getGroup()); 

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
    // $ANTLR end "ruleControlStatementElement"


    // $ANTLR start "entryRuleExpressionElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:312:1: entryRuleExpressionElement : ruleExpressionElement EOF ;
    public final void entryRuleExpressionElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:313:1: ( ruleExpressionElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:314:1: ruleExpressionElement EOF
            {
             before(grammarAccess.getExpressionElementRule()); 
            pushFollow(FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement602);
            ruleExpressionElement();

            state._fsp--;

             after(grammarAccess.getExpressionElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionElement609); 

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
    // $ANTLR end "entryRuleExpressionElement"


    // $ANTLR start "ruleExpressionElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:321:1: ruleExpressionElement : ( ( rule__ExpressionElement__Group__0 ) ) ;
    public final void ruleExpressionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:325:2: ( ( ( rule__ExpressionElement__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:326:1: ( ( rule__ExpressionElement__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:326:1: ( ( rule__ExpressionElement__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:327:1: ( rule__ExpressionElement__Group__0 )
            {
             before(grammarAccess.getExpressionElementAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:328:1: ( rule__ExpressionElement__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:328:2: rule__ExpressionElement__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionElement__Group__0_in_ruleExpressionElement635);
            rule__ExpressionElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionElementAccess().getGroup()); 

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
    // $ANTLR end "ruleExpressionElement"


    // $ANTLR start "entryRuleStatementElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:342:1: entryRuleStatementElement : ruleStatementElement EOF ;
    public final void entryRuleStatementElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:343:1: ( ruleStatementElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:344:1: ruleStatementElement EOF
            {
             before(grammarAccess.getStatementElementRule()); 
            pushFollow(FOLLOW_ruleStatementElement_in_entryRuleStatementElement664);
            ruleStatementElement();

            state._fsp--;

             after(grammarAccess.getStatementElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementElement671); 

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
    // $ANTLR end "entryRuleStatementElement"


    // $ANTLR start "ruleStatementElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:351:1: ruleStatementElement : ( 'sss' ) ;
    public final void ruleStatementElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:355:2: ( ( 'sss' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:356:1: ( 'sss' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:356:1: ( 'sss' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:357:1: 'sss'
            {
             before(grammarAccess.getStatementElementAccess().getSssKeyword()); 
            match(input,11,FOLLOW_11_in_ruleStatementElement698); 
             after(grammarAccess.getStatementElementAccess().getSssKeyword()); 

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
    // $ANTLR end "ruleStatementElement"


    // $ANTLR start "entryRuleQualifiedID"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:374:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:375:1: ( ruleQualifiedID EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:376:1: ruleQualifiedID EOF
            {
             before(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID728);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getQualifiedIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedID735); 

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
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:383:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:387:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:388:1: ( ( rule__QualifiedID__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:388:1: ( ( rule__QualifiedID__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:389:1: ( rule__QualifiedID__Group__0 )
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:390:1: ( rule__QualifiedID__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:390:2: rule__QualifiedID__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID761);
            rule__QualifiedID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedIDAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "entryRuleUseStatement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:402:1: entryRuleUseStatement : ruleUseStatement EOF ;
    public final void entryRuleUseStatement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:403:1: ( ruleUseStatement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:404:1: ruleUseStatement EOF
            {
             before(grammarAccess.getUseStatementRule()); 
            pushFollow(FOLLOW_ruleUseStatement_in_entryRuleUseStatement788);
            ruleUseStatement();

            state._fsp--;

             after(grammarAccess.getUseStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseStatement795); 

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
    // $ANTLR end "entryRuleUseStatement"


    // $ANTLR start "ruleUseStatement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:411:1: ruleUseStatement : ( ( rule__UseStatement__Group__0 ) ) ;
    public final void ruleUseStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:415:2: ( ( ( rule__UseStatement__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:416:1: ( ( rule__UseStatement__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:416:1: ( ( rule__UseStatement__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:417:1: ( rule__UseStatement__Group__0 )
            {
             before(grammarAccess.getUseStatementAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:418:1: ( rule__UseStatement__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:418:2: rule__UseStatement__Group__0
            {
            pushFollow(FOLLOW_rule__UseStatement__Group__0_in_ruleUseStatement821);
            rule__UseStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleUseStatement"


    // $ANTLR start "rule__ParameterElement__TypeAlternatives_1_1_0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:430:1: rule__ParameterElement__TypeAlternatives_1_1_0 : ( ( 'BRANCH' ) | ( 'CLIENT' ) | ( 'CURRENCY' ) | ( RULE_ID ) );
    public final void rule__ParameterElement__TypeAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:434:1: ( ( 'BRANCH' ) | ( 'CLIENT' ) | ( 'CURRENCY' ) | ( RULE_ID ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case RULE_ID:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:435:1: ( 'BRANCH' )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:435:1: ( 'BRANCH' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:436:1: 'BRANCH'
                    {
                     before(grammarAccess.getParameterElementAccess().getTypeBRANCHKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__ParameterElement__TypeAlternatives_1_1_0858); 
                     after(grammarAccess.getParameterElementAccess().getTypeBRANCHKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:443:6: ( 'CLIENT' )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:443:6: ( 'CLIENT' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:444:1: 'CLIENT'
                    {
                     before(grammarAccess.getParameterElementAccess().getTypeCLIENTKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__ParameterElement__TypeAlternatives_1_1_0878); 
                     after(grammarAccess.getParameterElementAccess().getTypeCLIENTKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:451:6: ( 'CURRENCY' )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:451:6: ( 'CURRENCY' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:452:1: 'CURRENCY'
                    {
                     before(grammarAccess.getParameterElementAccess().getTypeCURRENCYKeyword_1_1_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__ParameterElement__TypeAlternatives_1_1_0898); 
                     after(grammarAccess.getParameterElementAccess().getTypeCURRENCYKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:459:6: ( RULE_ID )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:459:6: ( RULE_ID )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:460:1: RULE_ID
                    {
                     before(grammarAccess.getParameterElementAccess().getTypeIDTerminalRuleCall_1_1_0_3()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterElement__TypeAlternatives_1_1_0917); 
                     after(grammarAccess.getParameterElementAccess().getTypeIDTerminalRuleCall_1_1_0_3()); 

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
    // $ANTLR end "rule__ParameterElement__TypeAlternatives_1_1_0"


    // $ANTLR start "rule__ExpressionElement__OperatorAlternatives_1_0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:470:1: rule__ExpressionElement__OperatorAlternatives_1_0 : ( ( '=>' ) | ( 'is' ) | ( 'is not' ) );
    public final void rule__ExpressionElement__OperatorAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:474:1: ( ( '=>' ) | ( 'is' ) | ( 'is not' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:475:1: ( '=>' )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:475:1: ( '=>' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:476:1: '=>'
                    {
                     before(grammarAccess.getExpressionElementAccess().getOperatorEqualsSignGreaterThanSignKeyword_1_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__ExpressionElement__OperatorAlternatives_1_0950); 
                     after(grammarAccess.getExpressionElementAccess().getOperatorEqualsSignGreaterThanSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:483:6: ( 'is' )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:483:6: ( 'is' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:484:1: 'is'
                    {
                     before(grammarAccess.getExpressionElementAccess().getOperatorIsKeyword_1_0_1()); 
                    match(input,16,FOLLOW_16_in_rule__ExpressionElement__OperatorAlternatives_1_0970); 
                     after(grammarAccess.getExpressionElementAccess().getOperatorIsKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:491:6: ( 'is not' )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:491:6: ( 'is not' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:492:1: 'is not'
                    {
                     before(grammarAccess.getExpressionElementAccess().getOperatorIsNotKeyword_1_0_2()); 
                    match(input,17,FOLLOW_17_in_rule__ExpressionElement__OperatorAlternatives_1_0990); 
                     after(grammarAccess.getExpressionElementAccess().getOperatorIsNotKeyword_1_0_2()); 

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
    // $ANTLR end "rule__ExpressionElement__OperatorAlternatives_1_0"


    // $ANTLR start "rule__ExpressionElement__RightAlternatives_2_0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:504:1: rule__ExpressionElement__RightAlternatives_2_0 : ( ( 'valid' ) | ( 'empty' ) );
    public final void rule__ExpressionElement__RightAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:508:1: ( ( 'valid' ) | ( 'empty' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:509:1: ( 'valid' )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:509:1: ( 'valid' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:510:1: 'valid'
                    {
                     before(grammarAccess.getExpressionElementAccess().getRightValidKeyword_2_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__ExpressionElement__RightAlternatives_2_01025); 
                     after(grammarAccess.getExpressionElementAccess().getRightValidKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:517:6: ( 'empty' )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:517:6: ( 'empty' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:518:1: 'empty'
                    {
                     before(grammarAccess.getExpressionElementAccess().getRightEmptyKeyword_2_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__ExpressionElement__RightAlternatives_2_01045); 
                     after(grammarAccess.getExpressionElementAccess().getRightEmptyKeyword_2_0_1()); 

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
    // $ANTLR end "rule__ExpressionElement__RightAlternatives_2_0"


    // $ANTLR start "rule__AbstractElement__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:534:1: rule__AbstractElement__Group__0 : rule__AbstractElement__Group__0__Impl rule__AbstractElement__Group__1 ;
    public final void rule__AbstractElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:538:1: ( rule__AbstractElement__Group__0__Impl rule__AbstractElement__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:539:2: rule__AbstractElement__Group__0__Impl rule__AbstractElement__Group__1
            {
            pushFollow(FOLLOW_rule__AbstractElement__Group__0__Impl_in_rule__AbstractElement__Group__01079);
            rule__AbstractElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbstractElement__Group__1_in_rule__AbstractElement__Group__01082);
            rule__AbstractElement__Group__1();

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
    // $ANTLR end "rule__AbstractElement__Group__0"


    // $ANTLR start "rule__AbstractElement__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:546:1: rule__AbstractElement__Group__0__Impl : ( ( rule__AbstractElement__NamespaceAssignment_0 ) ) ;
    public final void rule__AbstractElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:550:1: ( ( ( rule__AbstractElement__NamespaceAssignment_0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:551:1: ( ( rule__AbstractElement__NamespaceAssignment_0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:551:1: ( ( rule__AbstractElement__NamespaceAssignment_0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:552:1: ( rule__AbstractElement__NamespaceAssignment_0 )
            {
             before(grammarAccess.getAbstractElementAccess().getNamespaceAssignment_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:553:1: ( rule__AbstractElement__NamespaceAssignment_0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:553:2: rule__AbstractElement__NamespaceAssignment_0
            {
            pushFollow(FOLLOW_rule__AbstractElement__NamespaceAssignment_0_in_rule__AbstractElement__Group__0__Impl1109);
            rule__AbstractElement__NamespaceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getNamespaceAssignment_0()); 

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
    // $ANTLR end "rule__AbstractElement__Group__0__Impl"


    // $ANTLR start "rule__AbstractElement__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:563:1: rule__AbstractElement__Group__1 : rule__AbstractElement__Group__1__Impl rule__AbstractElement__Group__2 ;
    public final void rule__AbstractElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:567:1: ( rule__AbstractElement__Group__1__Impl rule__AbstractElement__Group__2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:568:2: rule__AbstractElement__Group__1__Impl rule__AbstractElement__Group__2
            {
            pushFollow(FOLLOW_rule__AbstractElement__Group__1__Impl_in_rule__AbstractElement__Group__11139);
            rule__AbstractElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbstractElement__Group__2_in_rule__AbstractElement__Group__11142);
            rule__AbstractElement__Group__2();

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
    // $ANTLR end "rule__AbstractElement__Group__1"


    // $ANTLR start "rule__AbstractElement__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:575:1: rule__AbstractElement__Group__1__Impl : ( ( rule__AbstractElement__UseAssignment_1 )? ) ;
    public final void rule__AbstractElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:579:1: ( ( ( rule__AbstractElement__UseAssignment_1 )? ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:580:1: ( ( rule__AbstractElement__UseAssignment_1 )? )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:580:1: ( ( rule__AbstractElement__UseAssignment_1 )? )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:581:1: ( rule__AbstractElement__UseAssignment_1 )?
            {
             before(grammarAccess.getAbstractElementAccess().getUseAssignment_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:582:1: ( rule__AbstractElement__UseAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:582:2: rule__AbstractElement__UseAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AbstractElement__UseAssignment_1_in_rule__AbstractElement__Group__1__Impl1169);
                    rule__AbstractElement__UseAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbstractElementAccess().getUseAssignment_1()); 

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
    // $ANTLR end "rule__AbstractElement__Group__1__Impl"


    // $ANTLR start "rule__AbstractElement__Group__2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:592:1: rule__AbstractElement__Group__2 : rule__AbstractElement__Group__2__Impl ;
    public final void rule__AbstractElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:596:1: ( rule__AbstractElement__Group__2__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:597:2: rule__AbstractElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AbstractElement__Group__2__Impl_in_rule__AbstractElement__Group__21200);
            rule__AbstractElement__Group__2__Impl();

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
    // $ANTLR end "rule__AbstractElement__Group__2"


    // $ANTLR start "rule__AbstractElement__Group__2__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:603:1: rule__AbstractElement__Group__2__Impl : ( ( rule__AbstractElement__ProductAssignment_2 ) ) ;
    public final void rule__AbstractElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:607:1: ( ( ( rule__AbstractElement__ProductAssignment_2 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:608:1: ( ( rule__AbstractElement__ProductAssignment_2 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:608:1: ( ( rule__AbstractElement__ProductAssignment_2 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:609:1: ( rule__AbstractElement__ProductAssignment_2 )
            {
             before(grammarAccess.getAbstractElementAccess().getProductAssignment_2()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:610:1: ( rule__AbstractElement__ProductAssignment_2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:610:2: rule__AbstractElement__ProductAssignment_2
            {
            pushFollow(FOLLOW_rule__AbstractElement__ProductAssignment_2_in_rule__AbstractElement__Group__2__Impl1227);
            rule__AbstractElement__ProductAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getProductAssignment_2()); 

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
    // $ANTLR end "rule__AbstractElement__Group__2__Impl"


    // $ANTLR start "rule__NamespaceElement__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:626:1: rule__NamespaceElement__Group__0 : rule__NamespaceElement__Group__0__Impl rule__NamespaceElement__Group__1 ;
    public final void rule__NamespaceElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:630:1: ( rule__NamespaceElement__Group__0__Impl rule__NamespaceElement__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:631:2: rule__NamespaceElement__Group__0__Impl rule__NamespaceElement__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceElement__Group__0__Impl_in_rule__NamespaceElement__Group__01263);
            rule__NamespaceElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceElement__Group__1_in_rule__NamespaceElement__Group__01266);
            rule__NamespaceElement__Group__1();

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
    // $ANTLR end "rule__NamespaceElement__Group__0"


    // $ANTLR start "rule__NamespaceElement__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:638:1: rule__NamespaceElement__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__NamespaceElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:642:1: ( ( 'namespace' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:643:1: ( 'namespace' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:643:1: ( 'namespace' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:644:1: 'namespace'
            {
             before(grammarAccess.getNamespaceElementAccess().getNamespaceKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__NamespaceElement__Group__0__Impl1294); 
             after(grammarAccess.getNamespaceElementAccess().getNamespaceKeyword_0()); 

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
    // $ANTLR end "rule__NamespaceElement__Group__0__Impl"


    // $ANTLR start "rule__NamespaceElement__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:657:1: rule__NamespaceElement__Group__1 : rule__NamespaceElement__Group__1__Impl ;
    public final void rule__NamespaceElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:661:1: ( rule__NamespaceElement__Group__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:662:2: rule__NamespaceElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceElement__Group__1__Impl_in_rule__NamespaceElement__Group__11325);
            rule__NamespaceElement__Group__1__Impl();

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
    // $ANTLR end "rule__NamespaceElement__Group__1"


    // $ANTLR start "rule__NamespaceElement__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:668:1: rule__NamespaceElement__Group__1__Impl : ( ( rule__NamespaceElement__NameAssignment_1 ) ) ;
    public final void rule__NamespaceElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:672:1: ( ( ( rule__NamespaceElement__NameAssignment_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:673:1: ( ( rule__NamespaceElement__NameAssignment_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:673:1: ( ( rule__NamespaceElement__NameAssignment_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:674:1: ( rule__NamespaceElement__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceElementAccess().getNameAssignment_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:675:1: ( rule__NamespaceElement__NameAssignment_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:675:2: rule__NamespaceElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamespaceElement__NameAssignment_1_in_rule__NamespaceElement__Group__1__Impl1352);
            rule__NamespaceElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceElementAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NamespaceElement__Group__1__Impl"


    // $ANTLR start "rule__ProductElement__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:689:1: rule__ProductElement__Group__0 : rule__ProductElement__Group__0__Impl rule__ProductElement__Group__1 ;
    public final void rule__ProductElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:693:1: ( rule__ProductElement__Group__0__Impl rule__ProductElement__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:694:2: rule__ProductElement__Group__0__Impl rule__ProductElement__Group__1
            {
            pushFollow(FOLLOW_rule__ProductElement__Group__0__Impl_in_rule__ProductElement__Group__01386);
            rule__ProductElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProductElement__Group__1_in_rule__ProductElement__Group__01389);
            rule__ProductElement__Group__1();

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
    // $ANTLR end "rule__ProductElement__Group__0"


    // $ANTLR start "rule__ProductElement__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:701:1: rule__ProductElement__Group__0__Impl : ( 'product' ) ;
    public final void rule__ProductElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:705:1: ( ( 'product' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:706:1: ( 'product' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:706:1: ( 'product' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:707:1: 'product'
            {
             before(grammarAccess.getProductElementAccess().getProductKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__ProductElement__Group__0__Impl1417); 
             after(grammarAccess.getProductElementAccess().getProductKeyword_0()); 

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
    // $ANTLR end "rule__ProductElement__Group__0__Impl"


    // $ANTLR start "rule__ProductElement__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:720:1: rule__ProductElement__Group__1 : rule__ProductElement__Group__1__Impl rule__ProductElement__Group__2 ;
    public final void rule__ProductElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:724:1: ( rule__ProductElement__Group__1__Impl rule__ProductElement__Group__2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:725:2: rule__ProductElement__Group__1__Impl rule__ProductElement__Group__2
            {
            pushFollow(FOLLOW_rule__ProductElement__Group__1__Impl_in_rule__ProductElement__Group__11448);
            rule__ProductElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProductElement__Group__2_in_rule__ProductElement__Group__11451);
            rule__ProductElement__Group__2();

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
    // $ANTLR end "rule__ProductElement__Group__1"


    // $ANTLR start "rule__ProductElement__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:732:1: rule__ProductElement__Group__1__Impl : ( ( rule__ProductElement__NameAssignment_1 ) ) ;
    public final void rule__ProductElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:736:1: ( ( ( rule__ProductElement__NameAssignment_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:737:1: ( ( rule__ProductElement__NameAssignment_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:737:1: ( ( rule__ProductElement__NameAssignment_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:738:1: ( rule__ProductElement__NameAssignment_1 )
            {
             before(grammarAccess.getProductElementAccess().getNameAssignment_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:739:1: ( rule__ProductElement__NameAssignment_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:739:2: rule__ProductElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ProductElement__NameAssignment_1_in_rule__ProductElement__Group__1__Impl1478);
            rule__ProductElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProductElementAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ProductElement__Group__1__Impl"


    // $ANTLR start "rule__ProductElement__Group__2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:749:1: rule__ProductElement__Group__2 : rule__ProductElement__Group__2__Impl rule__ProductElement__Group__3 ;
    public final void rule__ProductElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:753:1: ( rule__ProductElement__Group__2__Impl rule__ProductElement__Group__3 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:754:2: rule__ProductElement__Group__2__Impl rule__ProductElement__Group__3
            {
            pushFollow(FOLLOW_rule__ProductElement__Group__2__Impl_in_rule__ProductElement__Group__21508);
            rule__ProductElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProductElement__Group__3_in_rule__ProductElement__Group__21511);
            rule__ProductElement__Group__3();

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
    // $ANTLR end "rule__ProductElement__Group__2"


    // $ANTLR start "rule__ProductElement__Group__2__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:761:1: rule__ProductElement__Group__2__Impl : ( ( rule__ProductElement__Group_2__0 )? ) ;
    public final void rule__ProductElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:765:1: ( ( ( rule__ProductElement__Group_2__0 )? ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:766:1: ( ( rule__ProductElement__Group_2__0 )? )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:766:1: ( ( rule__ProductElement__Group_2__0 )? )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:767:1: ( rule__ProductElement__Group_2__0 )?
            {
             before(grammarAccess.getProductElementAccess().getGroup_2()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:768:1: ( rule__ProductElement__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:768:2: rule__ProductElement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ProductElement__Group_2__0_in_rule__ProductElement__Group__2__Impl1538);
                    rule__ProductElement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProductElementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ProductElement__Group__2__Impl"


    // $ANTLR start "rule__ProductElement__Group__3"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:778:1: rule__ProductElement__Group__3 : rule__ProductElement__Group__3__Impl ;
    public final void rule__ProductElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:782:1: ( rule__ProductElement__Group__3__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:783:2: rule__ProductElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ProductElement__Group__3__Impl_in_rule__ProductElement__Group__31569);
            rule__ProductElement__Group__3__Impl();

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
    // $ANTLR end "rule__ProductElement__Group__3"


    // $ANTLR start "rule__ProductElement__Group__3__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:789:1: rule__ProductElement__Group__3__Impl : ( ( rule__ProductElement__OperationAssignment_3 ) ) ;
    public final void rule__ProductElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:793:1: ( ( ( rule__ProductElement__OperationAssignment_3 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:794:1: ( ( rule__ProductElement__OperationAssignment_3 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:794:1: ( ( rule__ProductElement__OperationAssignment_3 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:795:1: ( rule__ProductElement__OperationAssignment_3 )
            {
             before(grammarAccess.getProductElementAccess().getOperationAssignment_3()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:796:1: ( rule__ProductElement__OperationAssignment_3 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:796:2: rule__ProductElement__OperationAssignment_3
            {
            pushFollow(FOLLOW_rule__ProductElement__OperationAssignment_3_in_rule__ProductElement__Group__3__Impl1596);
            rule__ProductElement__OperationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProductElementAccess().getOperationAssignment_3()); 

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
    // $ANTLR end "rule__ProductElement__Group__3__Impl"


    // $ANTLR start "rule__ProductElement__Group_2__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:814:1: rule__ProductElement__Group_2__0 : rule__ProductElement__Group_2__0__Impl rule__ProductElement__Group_2__1 ;
    public final void rule__ProductElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:818:1: ( rule__ProductElement__Group_2__0__Impl rule__ProductElement__Group_2__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:819:2: rule__ProductElement__Group_2__0__Impl rule__ProductElement__Group_2__1
            {
            pushFollow(FOLLOW_rule__ProductElement__Group_2__0__Impl_in_rule__ProductElement__Group_2__01634);
            rule__ProductElement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProductElement__Group_2__1_in_rule__ProductElement__Group_2__01637);
            rule__ProductElement__Group_2__1();

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
    // $ANTLR end "rule__ProductElement__Group_2__0"


    // $ANTLR start "rule__ProductElement__Group_2__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:826:1: rule__ProductElement__Group_2__0__Impl : ( 'parameters' ) ;
    public final void rule__ProductElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:830:1: ( ( 'parameters' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:831:1: ( 'parameters' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:831:1: ( 'parameters' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:832:1: 'parameters'
            {
             before(grammarAccess.getProductElementAccess().getParametersKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__ProductElement__Group_2__0__Impl1665); 
             after(grammarAccess.getProductElementAccess().getParametersKeyword_2_0()); 

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
    // $ANTLR end "rule__ProductElement__Group_2__0__Impl"


    // $ANTLR start "rule__ProductElement__Group_2__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:845:1: rule__ProductElement__Group_2__1 : rule__ProductElement__Group_2__1__Impl ;
    public final void rule__ProductElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:849:1: ( rule__ProductElement__Group_2__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:850:2: rule__ProductElement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ProductElement__Group_2__1__Impl_in_rule__ProductElement__Group_2__11696);
            rule__ProductElement__Group_2__1__Impl();

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
    // $ANTLR end "rule__ProductElement__Group_2__1"


    // $ANTLR start "rule__ProductElement__Group_2__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:856:1: rule__ProductElement__Group_2__1__Impl : ( ( rule__ProductElement__ParametersAssignment_2_1 ) ) ;
    public final void rule__ProductElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:860:1: ( ( ( rule__ProductElement__ParametersAssignment_2_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:861:1: ( ( rule__ProductElement__ParametersAssignment_2_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:861:1: ( ( rule__ProductElement__ParametersAssignment_2_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:862:1: ( rule__ProductElement__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getProductElementAccess().getParametersAssignment_2_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:863:1: ( rule__ProductElement__ParametersAssignment_2_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:863:2: rule__ProductElement__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ProductElement__ParametersAssignment_2_1_in_rule__ProductElement__Group_2__1__Impl1723);
            rule__ProductElement__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProductElementAccess().getParametersAssignment_2_1()); 

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
    // $ANTLR end "rule__ProductElement__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterElement__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:877:1: rule__ParameterElement__Group__0 : rule__ParameterElement__Group__0__Impl rule__ParameterElement__Group__1 ;
    public final void rule__ParameterElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:881:1: ( rule__ParameterElement__Group__0__Impl rule__ParameterElement__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:882:2: rule__ParameterElement__Group__0__Impl rule__ParameterElement__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group__0__Impl_in_rule__ParameterElement__Group__01757);
            rule__ParameterElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group__1_in_rule__ParameterElement__Group__01760);
            rule__ParameterElement__Group__1();

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
    // $ANTLR end "rule__ParameterElement__Group__0"


    // $ANTLR start "rule__ParameterElement__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:889:1: rule__ParameterElement__Group__0__Impl : ( ( rule__ParameterElement__NameAssignment_0 ) ) ;
    public final void rule__ParameterElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:893:1: ( ( ( rule__ParameterElement__NameAssignment_0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:894:1: ( ( rule__ParameterElement__NameAssignment_0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:894:1: ( ( rule__ParameterElement__NameAssignment_0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:895:1: ( rule__ParameterElement__NameAssignment_0 )
            {
             before(grammarAccess.getParameterElementAccess().getNameAssignment_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:896:1: ( rule__ParameterElement__NameAssignment_0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:896:2: rule__ParameterElement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterElement__NameAssignment_0_in_rule__ParameterElement__Group__0__Impl1787);
            rule__ParameterElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterElementAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ParameterElement__Group__0__Impl"


    // $ANTLR start "rule__ParameterElement__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:906:1: rule__ParameterElement__Group__1 : rule__ParameterElement__Group__1__Impl ;
    public final void rule__ParameterElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:910:1: ( rule__ParameterElement__Group__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:911:2: rule__ParameterElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group__1__Impl_in_rule__ParameterElement__Group__11817);
            rule__ParameterElement__Group__1__Impl();

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
    // $ANTLR end "rule__ParameterElement__Group__1"


    // $ANTLR start "rule__ParameterElement__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:917:1: rule__ParameterElement__Group__1__Impl : ( ( rule__ParameterElement__Group_1__0 )? ) ;
    public final void rule__ParameterElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:921:1: ( ( ( rule__ParameterElement__Group_1__0 )? ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:922:1: ( ( rule__ParameterElement__Group_1__0 )? )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:922:1: ( ( rule__ParameterElement__Group_1__0 )? )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:923:1: ( rule__ParameterElement__Group_1__0 )?
            {
             before(grammarAccess.getParameterElementAccess().getGroup_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:924:1: ( rule__ParameterElement__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:924:2: rule__ParameterElement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ParameterElement__Group_1__0_in_rule__ParameterElement__Group__1__Impl1844);
                    rule__ParameterElement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterElementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ParameterElement__Group__1__Impl"


    // $ANTLR start "rule__ParameterElement__Group_1__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:938:1: rule__ParameterElement__Group_1__0 : rule__ParameterElement__Group_1__0__Impl rule__ParameterElement__Group_1__1 ;
    public final void rule__ParameterElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:942:1: ( rule__ParameterElement__Group_1__0__Impl rule__ParameterElement__Group_1__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:943:2: rule__ParameterElement__Group_1__0__Impl rule__ParameterElement__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1__0__Impl_in_rule__ParameterElement__Group_1__01879);
            rule__ParameterElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group_1__1_in_rule__ParameterElement__Group_1__01882);
            rule__ParameterElement__Group_1__1();

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
    // $ANTLR end "rule__ParameterElement__Group_1__0"


    // $ANTLR start "rule__ParameterElement__Group_1__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:950:1: rule__ParameterElement__Group_1__0__Impl : ( ':' ) ;
    public final void rule__ParameterElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:954:1: ( ( ':' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:955:1: ( ':' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:955:1: ( ':' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:956:1: ':'
            {
             before(grammarAccess.getParameterElementAccess().getColonKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__ParameterElement__Group_1__0__Impl1910); 
             after(grammarAccess.getParameterElementAccess().getColonKeyword_1_0()); 

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
    // $ANTLR end "rule__ParameterElement__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterElement__Group_1__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:969:1: rule__ParameterElement__Group_1__1 : rule__ParameterElement__Group_1__1__Impl ;
    public final void rule__ParameterElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:973:1: ( rule__ParameterElement__Group_1__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:974:2: rule__ParameterElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1__1__Impl_in_rule__ParameterElement__Group_1__11941);
            rule__ParameterElement__Group_1__1__Impl();

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
    // $ANTLR end "rule__ParameterElement__Group_1__1"


    // $ANTLR start "rule__ParameterElement__Group_1__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:980:1: rule__ParameterElement__Group_1__1__Impl : ( ( rule__ParameterElement__TypeAssignment_1_1 ) ) ;
    public final void rule__ParameterElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:984:1: ( ( ( rule__ParameterElement__TypeAssignment_1_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:985:1: ( ( rule__ParameterElement__TypeAssignment_1_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:985:1: ( ( rule__ParameterElement__TypeAssignment_1_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:986:1: ( rule__ParameterElement__TypeAssignment_1_1 )
            {
             before(grammarAccess.getParameterElementAccess().getTypeAssignment_1_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:987:1: ( rule__ParameterElement__TypeAssignment_1_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:987:2: rule__ParameterElement__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParameterElement__TypeAssignment_1_1_in_rule__ParameterElement__Group_1__1__Impl1968);
            rule__ParameterElement__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterElementAccess().getTypeAssignment_1_1()); 

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
    // $ANTLR end "rule__ParameterElement__Group_1__1__Impl"


    // $ANTLR start "rule__OperationElement__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1001:1: rule__OperationElement__Group__0 : rule__OperationElement__Group__0__Impl rule__OperationElement__Group__1 ;
    public final void rule__OperationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1005:1: ( rule__OperationElement__Group__0__Impl rule__OperationElement__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1006:2: rule__OperationElement__Group__0__Impl rule__OperationElement__Group__1
            {
            pushFollow(FOLLOW_rule__OperationElement__Group__0__Impl_in_rule__OperationElement__Group__02002);
            rule__OperationElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationElement__Group__1_in_rule__OperationElement__Group__02005);
            rule__OperationElement__Group__1();

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
    // $ANTLR end "rule__OperationElement__Group__0"


    // $ANTLR start "rule__OperationElement__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1013:1: rule__OperationElement__Group__0__Impl : ( 'operation' ) ;
    public final void rule__OperationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1017:1: ( ( 'operation' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1018:1: ( 'operation' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1018:1: ( 'operation' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1019:1: 'operation'
            {
             before(grammarAccess.getOperationElementAccess().getOperationKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__OperationElement__Group__0__Impl2033); 
             after(grammarAccess.getOperationElementAccess().getOperationKeyword_0()); 

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
    // $ANTLR end "rule__OperationElement__Group__0__Impl"


    // $ANTLR start "rule__OperationElement__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1032:1: rule__OperationElement__Group__1 : rule__OperationElement__Group__1__Impl rule__OperationElement__Group__2 ;
    public final void rule__OperationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1036:1: ( rule__OperationElement__Group__1__Impl rule__OperationElement__Group__2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1037:2: rule__OperationElement__Group__1__Impl rule__OperationElement__Group__2
            {
            pushFollow(FOLLOW_rule__OperationElement__Group__1__Impl_in_rule__OperationElement__Group__12064);
            rule__OperationElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationElement__Group__2_in_rule__OperationElement__Group__12067);
            rule__OperationElement__Group__2();

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
    // $ANTLR end "rule__OperationElement__Group__1"


    // $ANTLR start "rule__OperationElement__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1044:1: rule__OperationElement__Group__1__Impl : ( ( rule__OperationElement__NameAssignment_1 ) ) ;
    public final void rule__OperationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1048:1: ( ( ( rule__OperationElement__NameAssignment_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1049:1: ( ( rule__OperationElement__NameAssignment_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1049:1: ( ( rule__OperationElement__NameAssignment_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1050:1: ( rule__OperationElement__NameAssignment_1 )
            {
             before(grammarAccess.getOperationElementAccess().getNameAssignment_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1051:1: ( rule__OperationElement__NameAssignment_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1051:2: rule__OperationElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OperationElement__NameAssignment_1_in_rule__OperationElement__Group__1__Impl2094);
            rule__OperationElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationElementAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__OperationElement__Group__1__Impl"


    // $ANTLR start "rule__OperationElement__Group__2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1061:1: rule__OperationElement__Group__2 : rule__OperationElement__Group__2__Impl rule__OperationElement__Group__3 ;
    public final void rule__OperationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1065:1: ( rule__OperationElement__Group__2__Impl rule__OperationElement__Group__3 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1066:2: rule__OperationElement__Group__2__Impl rule__OperationElement__Group__3
            {
            pushFollow(FOLLOW_rule__OperationElement__Group__2__Impl_in_rule__OperationElement__Group__22124);
            rule__OperationElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationElement__Group__3_in_rule__OperationElement__Group__22127);
            rule__OperationElement__Group__3();

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
    // $ANTLR end "rule__OperationElement__Group__2"


    // $ANTLR start "rule__OperationElement__Group__2__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1073:1: rule__OperationElement__Group__2__Impl : ( 'is' ) ;
    public final void rule__OperationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1077:1: ( ( 'is' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1078:1: ( 'is' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1078:1: ( 'is' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1079:1: 'is'
            {
             before(grammarAccess.getOperationElementAccess().getIsKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__OperationElement__Group__2__Impl2155); 
             after(grammarAccess.getOperationElementAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__OperationElement__Group__2__Impl"


    // $ANTLR start "rule__OperationElement__Group__3"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1092:1: rule__OperationElement__Group__3 : rule__OperationElement__Group__3__Impl ;
    public final void rule__OperationElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1096:1: ( rule__OperationElement__Group__3__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1097:2: rule__OperationElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OperationElement__Group__3__Impl_in_rule__OperationElement__Group__32186);
            rule__OperationElement__Group__3__Impl();

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
    // $ANTLR end "rule__OperationElement__Group__3"


    // $ANTLR start "rule__OperationElement__Group__3__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1103:1: rule__OperationElement__Group__3__Impl : ( ( rule__OperationElement__ControlsAssignment_3 )? ) ;
    public final void rule__OperationElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1107:1: ( ( ( rule__OperationElement__ControlsAssignment_3 )? ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1108:1: ( ( rule__OperationElement__ControlsAssignment_3 )? )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1108:1: ( ( rule__OperationElement__ControlsAssignment_3 )? )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1109:1: ( rule__OperationElement__ControlsAssignment_3 )?
            {
             before(grammarAccess.getOperationElementAccess().getControlsAssignment_3()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1110:1: ( rule__OperationElement__ControlsAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1110:2: rule__OperationElement__ControlsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__OperationElement__ControlsAssignment_3_in_rule__OperationElement__Group__3__Impl2213);
                    rule__OperationElement__ControlsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationElementAccess().getControlsAssignment_3()); 

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
    // $ANTLR end "rule__OperationElement__Group__3__Impl"


    // $ANTLR start "rule__ControlBlockElement__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1128:1: rule__ControlBlockElement__Group__0 : rule__ControlBlockElement__Group__0__Impl rule__ControlBlockElement__Group__1 ;
    public final void rule__ControlBlockElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1132:1: ( rule__ControlBlockElement__Group__0__Impl rule__ControlBlockElement__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1133:2: rule__ControlBlockElement__Group__0__Impl rule__ControlBlockElement__Group__1
            {
            pushFollow(FOLLOW_rule__ControlBlockElement__Group__0__Impl_in_rule__ControlBlockElement__Group__02252);
            rule__ControlBlockElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ControlBlockElement__Group__1_in_rule__ControlBlockElement__Group__02255);
            rule__ControlBlockElement__Group__1();

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
    // $ANTLR end "rule__ControlBlockElement__Group__0"


    // $ANTLR start "rule__ControlBlockElement__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1140:1: rule__ControlBlockElement__Group__0__Impl : ( 'controls' ) ;
    public final void rule__ControlBlockElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1144:1: ( ( 'controls' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1145:1: ( 'controls' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1145:1: ( 'controls' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1146:1: 'controls'
            {
             before(grammarAccess.getControlBlockElementAccess().getControlsKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ControlBlockElement__Group__0__Impl2283); 
             after(grammarAccess.getControlBlockElementAccess().getControlsKeyword_0()); 

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
    // $ANTLR end "rule__ControlBlockElement__Group__0__Impl"


    // $ANTLR start "rule__ControlBlockElement__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1159:1: rule__ControlBlockElement__Group__1 : rule__ControlBlockElement__Group__1__Impl ;
    public final void rule__ControlBlockElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1163:1: ( rule__ControlBlockElement__Group__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1164:2: rule__ControlBlockElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ControlBlockElement__Group__1__Impl_in_rule__ControlBlockElement__Group__12314);
            rule__ControlBlockElement__Group__1__Impl();

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
    // $ANTLR end "rule__ControlBlockElement__Group__1"


    // $ANTLR start "rule__ControlBlockElement__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1170:1: rule__ControlBlockElement__Group__1__Impl : ( ( rule__ControlBlockElement__ControlsAssignment_1 ) ) ;
    public final void rule__ControlBlockElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1174:1: ( ( ( rule__ControlBlockElement__ControlsAssignment_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1175:1: ( ( rule__ControlBlockElement__ControlsAssignment_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1175:1: ( ( rule__ControlBlockElement__ControlsAssignment_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1176:1: ( rule__ControlBlockElement__ControlsAssignment_1 )
            {
             before(grammarAccess.getControlBlockElementAccess().getControlsAssignment_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1177:1: ( rule__ControlBlockElement__ControlsAssignment_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1177:2: rule__ControlBlockElement__ControlsAssignment_1
            {
            pushFollow(FOLLOW_rule__ControlBlockElement__ControlsAssignment_1_in_rule__ControlBlockElement__Group__1__Impl2341);
            rule__ControlBlockElement__ControlsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getControlBlockElementAccess().getControlsAssignment_1()); 

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
    // $ANTLR end "rule__ControlBlockElement__Group__1__Impl"


    // $ANTLR start "rule__ControlStatementElement__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1191:1: rule__ControlStatementElement__Group__0 : rule__ControlStatementElement__Group__0__Impl rule__ControlStatementElement__Group__1 ;
    public final void rule__ControlStatementElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1195:1: ( rule__ControlStatementElement__Group__0__Impl rule__ControlStatementElement__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1196:2: rule__ControlStatementElement__Group__0__Impl rule__ControlStatementElement__Group__1
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__Group__0__Impl_in_rule__ControlStatementElement__Group__02375);
            rule__ControlStatementElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ControlStatementElement__Group__1_in_rule__ControlStatementElement__Group__02378);
            rule__ControlStatementElement__Group__1();

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
    // $ANTLR end "rule__ControlStatementElement__Group__0"


    // $ANTLR start "rule__ControlStatementElement__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1203:1: rule__ControlStatementElement__Group__0__Impl : ( ( rule__ControlStatementElement__ExpressionAssignment_0 ) ) ;
    public final void rule__ControlStatementElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1207:1: ( ( ( rule__ControlStatementElement__ExpressionAssignment_0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1208:1: ( ( rule__ControlStatementElement__ExpressionAssignment_0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1208:1: ( ( rule__ControlStatementElement__ExpressionAssignment_0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1209:1: ( rule__ControlStatementElement__ExpressionAssignment_0 )
            {
             before(grammarAccess.getControlStatementElementAccess().getExpressionAssignment_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1210:1: ( rule__ControlStatementElement__ExpressionAssignment_0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1210:2: rule__ControlStatementElement__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__ExpressionAssignment_0_in_rule__ControlStatementElement__Group__0__Impl2405);
            rule__ControlStatementElement__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getControlStatementElementAccess().getExpressionAssignment_0()); 

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
    // $ANTLR end "rule__ControlStatementElement__Group__0__Impl"


    // $ANTLR start "rule__ControlStatementElement__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1220:1: rule__ControlStatementElement__Group__1 : rule__ControlStatementElement__Group__1__Impl rule__ControlStatementElement__Group__2 ;
    public final void rule__ControlStatementElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1224:1: ( rule__ControlStatementElement__Group__1__Impl rule__ControlStatementElement__Group__2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1225:2: rule__ControlStatementElement__Group__1__Impl rule__ControlStatementElement__Group__2
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__Group__1__Impl_in_rule__ControlStatementElement__Group__12435);
            rule__ControlStatementElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ControlStatementElement__Group__2_in_rule__ControlStatementElement__Group__12438);
            rule__ControlStatementElement__Group__2();

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
    // $ANTLR end "rule__ControlStatementElement__Group__1"


    // $ANTLR start "rule__ControlStatementElement__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1232:1: rule__ControlStatementElement__Group__1__Impl : ( '=>' ) ;
    public final void rule__ControlStatementElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1236:1: ( ( '=>' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1237:1: ( '=>' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1237:1: ( '=>' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1238:1: '=>'
            {
             before(grammarAccess.getControlStatementElementAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__ControlStatementElement__Group__1__Impl2466); 
             after(grammarAccess.getControlStatementElementAccess().getEqualsSignGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__ControlStatementElement__Group__1__Impl"


    // $ANTLR start "rule__ControlStatementElement__Group__2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1251:1: rule__ControlStatementElement__Group__2 : rule__ControlStatementElement__Group__2__Impl ;
    public final void rule__ControlStatementElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1255:1: ( rule__ControlStatementElement__Group__2__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1256:2: rule__ControlStatementElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__Group__2__Impl_in_rule__ControlStatementElement__Group__22497);
            rule__ControlStatementElement__Group__2__Impl();

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
    // $ANTLR end "rule__ControlStatementElement__Group__2"


    // $ANTLR start "rule__ControlStatementElement__Group__2__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1262:1: rule__ControlStatementElement__Group__2__Impl : ( ( rule__ControlStatementElement__StatementAssignment_2 ) ) ;
    public final void rule__ControlStatementElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1266:1: ( ( ( rule__ControlStatementElement__StatementAssignment_2 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1267:1: ( ( rule__ControlStatementElement__StatementAssignment_2 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1267:1: ( ( rule__ControlStatementElement__StatementAssignment_2 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1268:1: ( rule__ControlStatementElement__StatementAssignment_2 )
            {
             before(grammarAccess.getControlStatementElementAccess().getStatementAssignment_2()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1269:1: ( rule__ControlStatementElement__StatementAssignment_2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1269:2: rule__ControlStatementElement__StatementAssignment_2
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__StatementAssignment_2_in_rule__ControlStatementElement__Group__2__Impl2524);
            rule__ControlStatementElement__StatementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getControlStatementElementAccess().getStatementAssignment_2()); 

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
    // $ANTLR end "rule__ControlStatementElement__Group__2__Impl"


    // $ANTLR start "rule__ExpressionElement__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1285:1: rule__ExpressionElement__Group__0 : rule__ExpressionElement__Group__0__Impl rule__ExpressionElement__Group__1 ;
    public final void rule__ExpressionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1289:1: ( rule__ExpressionElement__Group__0__Impl rule__ExpressionElement__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1290:2: rule__ExpressionElement__Group__0__Impl rule__ExpressionElement__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionElement__Group__0__Impl_in_rule__ExpressionElement__Group__02560);
            rule__ExpressionElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionElement__Group__1_in_rule__ExpressionElement__Group__02563);
            rule__ExpressionElement__Group__1();

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
    // $ANTLR end "rule__ExpressionElement__Group__0"


    // $ANTLR start "rule__ExpressionElement__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1297:1: rule__ExpressionElement__Group__0__Impl : ( ( rule__ExpressionElement__ParameterAssignment_0 ) ) ;
    public final void rule__ExpressionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1301:1: ( ( ( rule__ExpressionElement__ParameterAssignment_0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1302:1: ( ( rule__ExpressionElement__ParameterAssignment_0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1302:1: ( ( rule__ExpressionElement__ParameterAssignment_0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1303:1: ( rule__ExpressionElement__ParameterAssignment_0 )
            {
             before(grammarAccess.getExpressionElementAccess().getParameterAssignment_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1304:1: ( rule__ExpressionElement__ParameterAssignment_0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1304:2: rule__ExpressionElement__ParameterAssignment_0
            {
            pushFollow(FOLLOW_rule__ExpressionElement__ParameterAssignment_0_in_rule__ExpressionElement__Group__0__Impl2590);
            rule__ExpressionElement__ParameterAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionElementAccess().getParameterAssignment_0()); 

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
    // $ANTLR end "rule__ExpressionElement__Group__0__Impl"


    // $ANTLR start "rule__ExpressionElement__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1314:1: rule__ExpressionElement__Group__1 : rule__ExpressionElement__Group__1__Impl rule__ExpressionElement__Group__2 ;
    public final void rule__ExpressionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1318:1: ( rule__ExpressionElement__Group__1__Impl rule__ExpressionElement__Group__2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1319:2: rule__ExpressionElement__Group__1__Impl rule__ExpressionElement__Group__2
            {
            pushFollow(FOLLOW_rule__ExpressionElement__Group__1__Impl_in_rule__ExpressionElement__Group__12620);
            rule__ExpressionElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionElement__Group__2_in_rule__ExpressionElement__Group__12623);
            rule__ExpressionElement__Group__2();

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
    // $ANTLR end "rule__ExpressionElement__Group__1"


    // $ANTLR start "rule__ExpressionElement__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1326:1: rule__ExpressionElement__Group__1__Impl : ( ( rule__ExpressionElement__OperatorAssignment_1 ) ) ;
    public final void rule__ExpressionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1330:1: ( ( ( rule__ExpressionElement__OperatorAssignment_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1331:1: ( ( rule__ExpressionElement__OperatorAssignment_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1331:1: ( ( rule__ExpressionElement__OperatorAssignment_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1332:1: ( rule__ExpressionElement__OperatorAssignment_1 )
            {
             before(grammarAccess.getExpressionElementAccess().getOperatorAssignment_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1333:1: ( rule__ExpressionElement__OperatorAssignment_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1333:2: rule__ExpressionElement__OperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__ExpressionElement__OperatorAssignment_1_in_rule__ExpressionElement__Group__1__Impl2650);
            rule__ExpressionElement__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionElementAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__ExpressionElement__Group__1__Impl"


    // $ANTLR start "rule__ExpressionElement__Group__2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1343:1: rule__ExpressionElement__Group__2 : rule__ExpressionElement__Group__2__Impl ;
    public final void rule__ExpressionElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1347:1: ( rule__ExpressionElement__Group__2__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1348:2: rule__ExpressionElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionElement__Group__2__Impl_in_rule__ExpressionElement__Group__22680);
            rule__ExpressionElement__Group__2__Impl();

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
    // $ANTLR end "rule__ExpressionElement__Group__2"


    // $ANTLR start "rule__ExpressionElement__Group__2__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1354:1: rule__ExpressionElement__Group__2__Impl : ( ( rule__ExpressionElement__RightAssignment_2 ) ) ;
    public final void rule__ExpressionElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1358:1: ( ( ( rule__ExpressionElement__RightAssignment_2 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1359:1: ( ( rule__ExpressionElement__RightAssignment_2 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1359:1: ( ( rule__ExpressionElement__RightAssignment_2 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1360:1: ( rule__ExpressionElement__RightAssignment_2 )
            {
             before(grammarAccess.getExpressionElementAccess().getRightAssignment_2()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1361:1: ( rule__ExpressionElement__RightAssignment_2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1361:2: rule__ExpressionElement__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__ExpressionElement__RightAssignment_2_in_rule__ExpressionElement__Group__2__Impl2707);
            rule__ExpressionElement__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionElementAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__ExpressionElement__Group__2__Impl"


    // $ANTLR start "rule__QualifiedID__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1377:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1381:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1382:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__02743);
            rule__QualifiedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__02746);
            rule__QualifiedID__Group__1();

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
    // $ANTLR end "rule__QualifiedID__Group__0"


    // $ANTLR start "rule__QualifiedID__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1389:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1393:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1394:1: ( RULE_ID )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1394:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1395:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl2773); 
             after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedID__Group__0__Impl"


    // $ANTLR start "rule__QualifiedID__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1406:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1410:1: ( rule__QualifiedID__Group__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1411:2: rule__QualifiedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__12802);
            rule__QualifiedID__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedID__Group__1"


    // $ANTLR start "rule__QualifiedID__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1417:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1421:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1422:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1422:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1423:1: ( rule__QualifiedID__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1424:1: ( rule__QualifiedID__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1424:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl2829);
            	    rule__QualifiedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQualifiedIDAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedID__Group__1__Impl"


    // $ANTLR start "rule__QualifiedID__Group_1__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1438:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1442:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1443:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__02864);
            rule__QualifiedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__02867);
            rule__QualifiedID__Group_1__1();

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
    // $ANTLR end "rule__QualifiedID__Group_1__0"


    // $ANTLR start "rule__QualifiedID__Group_1__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1450:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1454:1: ( ( '.' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1455:1: ( '.' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1455:1: ( '.' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1456:1: '.'
            {
             before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__QualifiedID__Group_1__0__Impl2895); 
             after(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedID__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedID__Group_1__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1469:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1473:1: ( rule__QualifiedID__Group_1__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1474:2: rule__QualifiedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__12926);
            rule__QualifiedID__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedID__Group_1__1"


    // $ANTLR start "rule__QualifiedID__Group_1__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1480:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1484:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1485:1: ( RULE_ID )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1485:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1486:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl2953); 
             after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedID__Group_1__1__Impl"


    // $ANTLR start "rule__UseStatement__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1501:1: rule__UseStatement__Group__0 : rule__UseStatement__Group__0__Impl rule__UseStatement__Group__1 ;
    public final void rule__UseStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1505:1: ( rule__UseStatement__Group__0__Impl rule__UseStatement__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1506:2: rule__UseStatement__Group__0__Impl rule__UseStatement__Group__1
            {
            pushFollow(FOLLOW_rule__UseStatement__Group__0__Impl_in_rule__UseStatement__Group__02986);
            rule__UseStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseStatement__Group__1_in_rule__UseStatement__Group__02989);
            rule__UseStatement__Group__1();

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
    // $ANTLR end "rule__UseStatement__Group__0"


    // $ANTLR start "rule__UseStatement__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1513:1: rule__UseStatement__Group__0__Impl : ( 'use' ) ;
    public final void rule__UseStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1517:1: ( ( 'use' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1518:1: ( 'use' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1518:1: ( 'use' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1519:1: 'use'
            {
             before(grammarAccess.getUseStatementAccess().getUseKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__UseStatement__Group__0__Impl3017); 
             after(grammarAccess.getUseStatementAccess().getUseKeyword_0()); 

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
    // $ANTLR end "rule__UseStatement__Group__0__Impl"


    // $ANTLR start "rule__UseStatement__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1532:1: rule__UseStatement__Group__1 : rule__UseStatement__Group__1__Impl ;
    public final void rule__UseStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1536:1: ( rule__UseStatement__Group__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1537:2: rule__UseStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UseStatement__Group__1__Impl_in_rule__UseStatement__Group__13048);
            rule__UseStatement__Group__1__Impl();

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
    // $ANTLR end "rule__UseStatement__Group__1"


    // $ANTLR start "rule__UseStatement__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1543:1: rule__UseStatement__Group__1__Impl : ( ( rule__UseStatement__ProductAssignment_1 ) ) ;
    public final void rule__UseStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1547:1: ( ( ( rule__UseStatement__ProductAssignment_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1548:1: ( ( rule__UseStatement__ProductAssignment_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1548:1: ( ( rule__UseStatement__ProductAssignment_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1549:1: ( rule__UseStatement__ProductAssignment_1 )
            {
             before(grammarAccess.getUseStatementAccess().getProductAssignment_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1550:1: ( rule__UseStatement__ProductAssignment_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1550:2: rule__UseStatement__ProductAssignment_1
            {
            pushFollow(FOLLOW_rule__UseStatement__ProductAssignment_1_in_rule__UseStatement__Group__1__Impl3075);
            rule__UseStatement__ProductAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUseStatementAccess().getProductAssignment_1()); 

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
    // $ANTLR end "rule__UseStatement__Group__1__Impl"


    // $ANTLR start "rule__Product__ElementsAssignment"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1565:1: rule__Product__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Product__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1569:1: ( ( ruleAbstractElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1570:1: ( ruleAbstractElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1570:1: ( ruleAbstractElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1571:1: ruleAbstractElement
            {
             before(grammarAccess.getProductAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Product__ElementsAssignment3114);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getProductAccess().getElementsAbstractElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Product__ElementsAssignment"


    // $ANTLR start "rule__AbstractElement__NamespaceAssignment_0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1580:1: rule__AbstractElement__NamespaceAssignment_0 : ( ruleNamespaceElement ) ;
    public final void rule__AbstractElement__NamespaceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1584:1: ( ( ruleNamespaceElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1585:1: ( ruleNamespaceElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1585:1: ( ruleNamespaceElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1586:1: ruleNamespaceElement
            {
             before(grammarAccess.getAbstractElementAccess().getNamespaceNamespaceElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNamespaceElement_in_rule__AbstractElement__NamespaceAssignment_03145);
            ruleNamespaceElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementAccess().getNamespaceNamespaceElementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__AbstractElement__NamespaceAssignment_0"


    // $ANTLR start "rule__AbstractElement__UseAssignment_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1595:1: rule__AbstractElement__UseAssignment_1 : ( ruleUseStatement ) ;
    public final void rule__AbstractElement__UseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1599:1: ( ( ruleUseStatement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1600:1: ( ruleUseStatement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1600:1: ( ruleUseStatement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1601:1: ruleUseStatement
            {
             before(grammarAccess.getAbstractElementAccess().getUseUseStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUseStatement_in_rule__AbstractElement__UseAssignment_13176);
            ruleUseStatement();

            state._fsp--;

             after(grammarAccess.getAbstractElementAccess().getUseUseStatementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AbstractElement__UseAssignment_1"


    // $ANTLR start "rule__AbstractElement__ProductAssignment_2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1610:1: rule__AbstractElement__ProductAssignment_2 : ( ruleProductElement ) ;
    public final void rule__AbstractElement__ProductAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1614:1: ( ( ruleProductElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1615:1: ( ruleProductElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1615:1: ( ruleProductElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1616:1: ruleProductElement
            {
             before(grammarAccess.getAbstractElementAccess().getProductProductElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProductElement_in_rule__AbstractElement__ProductAssignment_23207);
            ruleProductElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementAccess().getProductProductElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AbstractElement__ProductAssignment_2"


    // $ANTLR start "rule__NamespaceElement__NameAssignment_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1625:1: rule__NamespaceElement__NameAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__NamespaceElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1629:1: ( ( ruleQualifiedID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1630:1: ( ruleQualifiedID )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1630:1: ( ruleQualifiedID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1631:1: ruleQualifiedID
            {
             before(grammarAccess.getNamespaceElementAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedID_in_rule__NamespaceElement__NameAssignment_13238);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getNamespaceElementAccess().getNameQualifiedIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NamespaceElement__NameAssignment_1"


    // $ANTLR start "rule__ProductElement__NameAssignment_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1640:1: rule__ProductElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProductElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1644:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1645:1: ( RULE_ID )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1645:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1646:1: RULE_ID
            {
             before(grammarAccess.getProductElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProductElement__NameAssignment_13269); 
             after(grammarAccess.getProductElementAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ProductElement__NameAssignment_1"


    // $ANTLR start "rule__ProductElement__ParametersAssignment_2_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1655:1: rule__ProductElement__ParametersAssignment_2_1 : ( ruleMultiParameterElement ) ;
    public final void rule__ProductElement__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1659:1: ( ( ruleMultiParameterElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1660:1: ( ruleMultiParameterElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1660:1: ( ruleMultiParameterElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1661:1: ruleMultiParameterElement
            {
             before(grammarAccess.getProductElementAccess().getParametersMultiParameterElementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMultiParameterElement_in_rule__ProductElement__ParametersAssignment_2_13300);
            ruleMultiParameterElement();

            state._fsp--;

             after(grammarAccess.getProductElementAccess().getParametersMultiParameterElementParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ProductElement__ParametersAssignment_2_1"


    // $ANTLR start "rule__ProductElement__OperationAssignment_3"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1670:1: rule__ProductElement__OperationAssignment_3 : ( ruleOperationElement ) ;
    public final void rule__ProductElement__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1674:1: ( ( ruleOperationElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1675:1: ( ruleOperationElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1675:1: ( ruleOperationElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1676:1: ruleOperationElement
            {
             before(grammarAccess.getProductElementAccess().getOperationOperationElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOperationElement_in_rule__ProductElement__OperationAssignment_33331);
            ruleOperationElement();

            state._fsp--;

             after(grammarAccess.getProductElementAccess().getOperationOperationElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ProductElement__OperationAssignment_3"


    // $ANTLR start "rule__MultiParameterElement__ParamsAssignment"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1685:1: rule__MultiParameterElement__ParamsAssignment : ( ruleParameterElement ) ;
    public final void rule__MultiParameterElement__ParamsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1689:1: ( ( ruleParameterElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1690:1: ( ruleParameterElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1690:1: ( ruleParameterElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1691:1: ruleParameterElement
            {
             before(grammarAccess.getMultiParameterElementAccess().getParamsParameterElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleParameterElement_in_rule__MultiParameterElement__ParamsAssignment3362);
            ruleParameterElement();

            state._fsp--;

             after(grammarAccess.getMultiParameterElementAccess().getParamsParameterElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__MultiParameterElement__ParamsAssignment"


    // $ANTLR start "rule__ParameterElement__NameAssignment_0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1700:1: rule__ParameterElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ParameterElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1704:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1705:1: ( RULE_ID )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1705:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1706:1: RULE_ID
            {
             before(grammarAccess.getParameterElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterElement__NameAssignment_03393); 
             after(grammarAccess.getParameterElementAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ParameterElement__NameAssignment_0"


    // $ANTLR start "rule__ParameterElement__TypeAssignment_1_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1715:1: rule__ParameterElement__TypeAssignment_1_1 : ( ( rule__ParameterElement__TypeAlternatives_1_1_0 ) ) ;
    public final void rule__ParameterElement__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1719:1: ( ( ( rule__ParameterElement__TypeAlternatives_1_1_0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1720:1: ( ( rule__ParameterElement__TypeAlternatives_1_1_0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1720:1: ( ( rule__ParameterElement__TypeAlternatives_1_1_0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1721:1: ( rule__ParameterElement__TypeAlternatives_1_1_0 )
            {
             before(grammarAccess.getParameterElementAccess().getTypeAlternatives_1_1_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1722:1: ( rule__ParameterElement__TypeAlternatives_1_1_0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1722:2: rule__ParameterElement__TypeAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__ParameterElement__TypeAlternatives_1_1_0_in_rule__ParameterElement__TypeAssignment_1_13424);
            rule__ParameterElement__TypeAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterElementAccess().getTypeAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__ParameterElement__TypeAssignment_1_1"


    // $ANTLR start "rule__OperationElement__NameAssignment_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1731:1: rule__OperationElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OperationElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1735:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1736:1: ( RULE_ID )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1736:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1737:1: RULE_ID
            {
             before(grammarAccess.getOperationElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OperationElement__NameAssignment_13457); 
             after(grammarAccess.getOperationElementAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__OperationElement__NameAssignment_1"


    // $ANTLR start "rule__OperationElement__ControlsAssignment_3"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1746:1: rule__OperationElement__ControlsAssignment_3 : ( ruleControlBlockElement ) ;
    public final void rule__OperationElement__ControlsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1750:1: ( ( ruleControlBlockElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1751:1: ( ruleControlBlockElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1751:1: ( ruleControlBlockElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1752:1: ruleControlBlockElement
            {
             before(grammarAccess.getOperationElementAccess().getControlsControlBlockElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleControlBlockElement_in_rule__OperationElement__ControlsAssignment_33488);
            ruleControlBlockElement();

            state._fsp--;

             after(grammarAccess.getOperationElementAccess().getControlsControlBlockElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__OperationElement__ControlsAssignment_3"


    // $ANTLR start "rule__ControlBlockElement__ControlsAssignment_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1761:1: rule__ControlBlockElement__ControlsAssignment_1 : ( ruleControlStatementElement ) ;
    public final void rule__ControlBlockElement__ControlsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1765:1: ( ( ruleControlStatementElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1766:1: ( ruleControlStatementElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1766:1: ( ruleControlStatementElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1767:1: ruleControlStatementElement
            {
             before(grammarAccess.getControlBlockElementAccess().getControlsControlStatementElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleControlStatementElement_in_rule__ControlBlockElement__ControlsAssignment_13519);
            ruleControlStatementElement();

            state._fsp--;

             after(grammarAccess.getControlBlockElementAccess().getControlsControlStatementElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ControlBlockElement__ControlsAssignment_1"


    // $ANTLR start "rule__ControlStatementElement__ExpressionAssignment_0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1776:1: rule__ControlStatementElement__ExpressionAssignment_0 : ( ruleExpressionElement ) ;
    public final void rule__ControlStatementElement__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1780:1: ( ( ruleExpressionElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1781:1: ( ruleExpressionElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1781:1: ( ruleExpressionElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1782:1: ruleExpressionElement
            {
             before(grammarAccess.getControlStatementElementAccess().getExpressionExpressionElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpressionElement_in_rule__ControlStatementElement__ExpressionAssignment_03550);
            ruleExpressionElement();

            state._fsp--;

             after(grammarAccess.getControlStatementElementAccess().getExpressionExpressionElementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ControlStatementElement__ExpressionAssignment_0"


    // $ANTLR start "rule__ControlStatementElement__StatementAssignment_2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1791:1: rule__ControlStatementElement__StatementAssignment_2 : ( ruleStatementElement ) ;
    public final void rule__ControlStatementElement__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1795:1: ( ( ruleStatementElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1796:1: ( ruleStatementElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1796:1: ( ruleStatementElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1797:1: ruleStatementElement
            {
             before(grammarAccess.getControlStatementElementAccess().getStatementStatementElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatementElement_in_rule__ControlStatementElement__StatementAssignment_23581);
            ruleStatementElement();

            state._fsp--;

             after(grammarAccess.getControlStatementElementAccess().getStatementStatementElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ControlStatementElement__StatementAssignment_2"


    // $ANTLR start "rule__ExpressionElement__ParameterAssignment_0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1806:1: rule__ExpressionElement__ParameterAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ExpressionElement__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1810:1: ( ( ( RULE_ID ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1811:1: ( ( RULE_ID ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1811:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1812:1: ( RULE_ID )
            {
             before(grammarAccess.getExpressionElementAccess().getParameterParameterElementCrossReference_0_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1813:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1814:1: RULE_ID
            {
             before(grammarAccess.getExpressionElementAccess().getParameterParameterElementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExpressionElement__ParameterAssignment_03616); 
             after(grammarAccess.getExpressionElementAccess().getParameterParameterElementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getExpressionElementAccess().getParameterParameterElementCrossReference_0_0()); 

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
    // $ANTLR end "rule__ExpressionElement__ParameterAssignment_0"


    // $ANTLR start "rule__ExpressionElement__OperatorAssignment_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1825:1: rule__ExpressionElement__OperatorAssignment_1 : ( ( rule__ExpressionElement__OperatorAlternatives_1_0 ) ) ;
    public final void rule__ExpressionElement__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1829:1: ( ( ( rule__ExpressionElement__OperatorAlternatives_1_0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1830:1: ( ( rule__ExpressionElement__OperatorAlternatives_1_0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1830:1: ( ( rule__ExpressionElement__OperatorAlternatives_1_0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1831:1: ( rule__ExpressionElement__OperatorAlternatives_1_0 )
            {
             before(grammarAccess.getExpressionElementAccess().getOperatorAlternatives_1_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1832:1: ( rule__ExpressionElement__OperatorAlternatives_1_0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1832:2: rule__ExpressionElement__OperatorAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__ExpressionElement__OperatorAlternatives_1_0_in_rule__ExpressionElement__OperatorAssignment_13651);
            rule__ExpressionElement__OperatorAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionElementAccess().getOperatorAlternatives_1_0()); 

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
    // $ANTLR end "rule__ExpressionElement__OperatorAssignment_1"


    // $ANTLR start "rule__ExpressionElement__RightAssignment_2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1841:1: rule__ExpressionElement__RightAssignment_2 : ( ( rule__ExpressionElement__RightAlternatives_2_0 ) ) ;
    public final void rule__ExpressionElement__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1845:1: ( ( ( rule__ExpressionElement__RightAlternatives_2_0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1846:1: ( ( rule__ExpressionElement__RightAlternatives_2_0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1846:1: ( ( rule__ExpressionElement__RightAlternatives_2_0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1847:1: ( rule__ExpressionElement__RightAlternatives_2_0 )
            {
             before(grammarAccess.getExpressionElementAccess().getRightAlternatives_2_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1848:1: ( rule__ExpressionElement__RightAlternatives_2_0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1848:2: rule__ExpressionElement__RightAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__ExpressionElement__RightAlternatives_2_0_in_rule__ExpressionElement__RightAssignment_23684);
            rule__ExpressionElement__RightAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionElementAccess().getRightAlternatives_2_0()); 

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
    // $ANTLR end "rule__ExpressionElement__RightAssignment_2"


    // $ANTLR start "rule__UseStatement__ProductAssignment_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1858:1: rule__UseStatement__ProductAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseStatement__ProductAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1862:1: ( ( ( RULE_ID ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1863:1: ( ( RULE_ID ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1863:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1864:1: ( RULE_ID )
            {
             before(grammarAccess.getUseStatementAccess().getProductProductElementCrossReference_1_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1865:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1866:1: RULE_ID
            {
             before(grammarAccess.getUseStatementAccess().getProductProductElementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseStatement__ProductAssignment_13722); 
             after(grammarAccess.getUseStatementAccess().getProductProductElementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUseStatementAccess().getProductProductElementCrossReference_1_0()); 

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
    // $ANTLR end "rule__UseStatement__ProductAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__ElementsAssignment_in_ruleProduct94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group__0_in_ruleAbstractElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceElement_in_entryRuleNamespaceElement181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceElement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceElement__Group__0_in_ruleNamespaceElement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProductElement_in_entryRuleProductElement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProductElement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductElement__Group__0_in_ruleProductElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiParameterElement_in_entryRuleMultiParameterElement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiParameterElement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiParameterElement__ParamsAssignment_in_ruleMultiParameterElement334 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleParameterElement_in_entryRuleParameterElement362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterElement369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group__0_in_ruleParameterElement395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationElement_in_entryRuleOperationElement422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationElement429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationElement__Group__0_in_ruleOperationElement455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlBlockElement_in_entryRuleControlBlockElement482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlBlockElement489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlBlockElement__Group__0_in_ruleControlBlockElement515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlStatementElement_in_entryRuleControlStatementElement542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlStatementElement549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__0_in_ruleControlStatementElement575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionElement609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__Group__0_in_ruleExpressionElement635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementElement_in_entryRuleStatementElement664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementElement671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStatementElement698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseStatement_in_entryRuleUseStatement788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseStatement795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseStatement__Group__0_in_ruleUseStatement821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ParameterElement__TypeAlternatives_1_1_0858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ParameterElement__TypeAlternatives_1_1_0878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ParameterElement__TypeAlternatives_1_1_0898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterElement__TypeAlternatives_1_1_0917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ExpressionElement__OperatorAlternatives_1_0950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ExpressionElement__OperatorAlternatives_1_0970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ExpressionElement__OperatorAlternatives_1_0990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ExpressionElement__RightAlternatives_2_01025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ExpressionElement__RightAlternatives_2_01045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group__0__Impl_in_rule__AbstractElement__Group__01079 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group__1_in_rule__AbstractElement__Group__01082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__NamespaceAssignment_0_in_rule__AbstractElement__Group__0__Impl1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group__1__Impl_in_rule__AbstractElement__Group__11139 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group__2_in_rule__AbstractElement__Group__11142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__UseAssignment_1_in_rule__AbstractElement__Group__1__Impl1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group__2__Impl_in_rule__AbstractElement__Group__21200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__ProductAssignment_2_in_rule__AbstractElement__Group__2__Impl1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceElement__Group__0__Impl_in_rule__NamespaceElement__Group__01263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamespaceElement__Group__1_in_rule__NamespaceElement__Group__01266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NamespaceElement__Group__0__Impl1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceElement__Group__1__Impl_in_rule__NamespaceElement__Group__11325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceElement__NameAssignment_1_in_rule__NamespaceElement__Group__1__Impl1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductElement__Group__0__Impl_in_rule__ProductElement__Group__01386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProductElement__Group__1_in_rule__ProductElement__Group__01389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ProductElement__Group__0__Impl1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductElement__Group__1__Impl_in_rule__ProductElement__Group__11448 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__ProductElement__Group__2_in_rule__ProductElement__Group__11451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductElement__NameAssignment_1_in_rule__ProductElement__Group__1__Impl1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductElement__Group__2__Impl_in_rule__ProductElement__Group__21508 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__ProductElement__Group__3_in_rule__ProductElement__Group__21511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductElement__Group_2__0_in_rule__ProductElement__Group__2__Impl1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductElement__Group__3__Impl_in_rule__ProductElement__Group__31569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductElement__OperationAssignment_3_in_rule__ProductElement__Group__3__Impl1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductElement__Group_2__0__Impl_in_rule__ProductElement__Group_2__01634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProductElement__Group_2__1_in_rule__ProductElement__Group_2__01637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ProductElement__Group_2__0__Impl1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductElement__Group_2__1__Impl_in_rule__ProductElement__Group_2__11696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductElement__ParametersAssignment_2_1_in_rule__ProductElement__Group_2__1__Impl1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group__0__Impl_in_rule__ParameterElement__Group__01757 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group__1_in_rule__ParameterElement__Group__01760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__NameAssignment_0_in_rule__ParameterElement__Group__0__Impl1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group__1__Impl_in_rule__ParameterElement__Group__11817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__0_in_rule__ParameterElement__Group__1__Impl1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__0__Impl_in_rule__ParameterElement__Group_1__01879 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__1_in_rule__ParameterElement__Group_1__01882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ParameterElement__Group_1__0__Impl1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__1__Impl_in_rule__ParameterElement__Group_1__11941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__TypeAssignment_1_1_in_rule__ParameterElement__Group_1__1__Impl1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationElement__Group__0__Impl_in_rule__OperationElement__Group__02002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OperationElement__Group__1_in_rule__OperationElement__Group__02005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__OperationElement__Group__0__Impl2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationElement__Group__1__Impl_in_rule__OperationElement__Group__12064 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__OperationElement__Group__2_in_rule__OperationElement__Group__12067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationElement__NameAssignment_1_in_rule__OperationElement__Group__1__Impl2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationElement__Group__2__Impl_in_rule__OperationElement__Group__22124 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__OperationElement__Group__3_in_rule__OperationElement__Group__22127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__OperationElement__Group__2__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationElement__Group__3__Impl_in_rule__OperationElement__Group__32186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationElement__ControlsAssignment_3_in_rule__OperationElement__Group__3__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlBlockElement__Group__0__Impl_in_rule__ControlBlockElement__Group__02252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ControlBlockElement__Group__1_in_rule__ControlBlockElement__Group__02255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ControlBlockElement__Group__0__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlBlockElement__Group__1__Impl_in_rule__ControlBlockElement__Group__12314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlBlockElement__ControlsAssignment_1_in_rule__ControlBlockElement__Group__1__Impl2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__0__Impl_in_rule__ControlStatementElement__Group__02375 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__1_in_rule__ControlStatementElement__Group__02378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__ExpressionAssignment_0_in_rule__ControlStatementElement__Group__0__Impl2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__1__Impl_in_rule__ControlStatementElement__Group__12435 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__2_in_rule__ControlStatementElement__Group__12438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ControlStatementElement__Group__1__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__2__Impl_in_rule__ControlStatementElement__Group__22497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__StatementAssignment_2_in_rule__ControlStatementElement__Group__2__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__Group__0__Impl_in_rule__ExpressionElement__Group__02560 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__ExpressionElement__Group__1_in_rule__ExpressionElement__Group__02563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__ParameterAssignment_0_in_rule__ExpressionElement__Group__0__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__Group__1__Impl_in_rule__ExpressionElement__Group__12620 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ExpressionElement__Group__2_in_rule__ExpressionElement__Group__12623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__OperatorAssignment_1_in_rule__ExpressionElement__Group__1__Impl2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__Group__2__Impl_in_rule__ExpressionElement__Group__22680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__RightAssignment_2_in_rule__ExpressionElement__Group__2__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__02743 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__02746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__12802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl2829 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__02864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__02867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__QualifiedID__Group_1__0__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__12926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseStatement__Group__0__Impl_in_rule__UseStatement__Group__02986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseStatement__Group__1_in_rule__UseStatement__Group__02989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UseStatement__Group__0__Impl3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseStatement__Group__1__Impl_in_rule__UseStatement__Group__13048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseStatement__ProductAssignment_1_in_rule__UseStatement__Group__1__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Product__ElementsAssignment3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceElement_in_rule__AbstractElement__NamespaceAssignment_03145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseStatement_in_rule__AbstractElement__UseAssignment_13176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProductElement_in_rule__AbstractElement__ProductAssignment_23207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedID_in_rule__NamespaceElement__NameAssignment_13238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProductElement__NameAssignment_13269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiParameterElement_in_rule__ProductElement__ParametersAssignment_2_13300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationElement_in_rule__ProductElement__OperationAssignment_33331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElement_in_rule__MultiParameterElement__ParamsAssignment3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterElement__NameAssignment_03393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__TypeAlternatives_1_1_0_in_rule__ParameterElement__TypeAssignment_1_13424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OperationElement__NameAssignment_13457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlBlockElement_in_rule__OperationElement__ControlsAssignment_33488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlStatementElement_in_rule__ControlBlockElement__ControlsAssignment_13519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_rule__ControlStatementElement__ExpressionAssignment_03550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementElement_in_rule__ControlStatementElement__StatementAssignment_23581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExpressionElement__ParameterAssignment_03616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__OperatorAlternatives_1_0_in_rule__ExpressionElement__OperatorAssignment_13651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__RightAlternatives_2_0_in_rule__ExpressionElement__RightAssignment_23684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UseStatement__ProductAssignment_13722 = new BitSet(new long[]{0x0000000000000002L});

}