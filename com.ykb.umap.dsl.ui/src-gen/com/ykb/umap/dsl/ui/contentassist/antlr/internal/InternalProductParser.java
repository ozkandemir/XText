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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANY_OTHER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'BRANCH'", "'CLIENT'", "'CURRENCY'", "'NUMBER'", "'STRING'", "'is'", "'is not'", "'use'", "'namespace'", "'.'", "'product'", "'parameters'", "':'", "'operation'", "'controls'", "'=>'", "'Error'", "'('", "'\"'", "')'"
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


    // $ANTLR start "entryRuleCompilationUnit"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:88:1: entryRuleCompilationUnit : ruleCompilationUnit EOF ;
    public final void entryRuleCompilationUnit() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:89:1: ( ruleCompilationUnit EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:90:1: ruleCompilationUnit EOF
            {
             before(grammarAccess.getCompilationUnitRule()); 
            pushFollow(FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit121);
            ruleCompilationUnit();

            state._fsp--;

             after(grammarAccess.getCompilationUnitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilationUnit128); 

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
    // $ANTLR end "entryRuleCompilationUnit"


    // $ANTLR start "ruleCompilationUnit"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:97:1: ruleCompilationUnit : ( ( rule__CompilationUnit__Group__0 ) ) ;
    public final void ruleCompilationUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:101:2: ( ( ( rule__CompilationUnit__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:102:1: ( ( rule__CompilationUnit__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:102:1: ( ( rule__CompilationUnit__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:103:1: ( rule__CompilationUnit__Group__0 )
            {
             before(grammarAccess.getCompilationUnitAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:104:1: ( rule__CompilationUnit__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:104:2: rule__CompilationUnit__Group__0
            {
            pushFollow(FOLLOW_rule__CompilationUnit__Group__0_in_ruleCompilationUnit154);
            rule__CompilationUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompilationUnitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompilationUnit"


    // $ANTLR start "entryRuleUseUnit"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:116:1: entryRuleUseUnit : ruleUseUnit EOF ;
    public final void entryRuleUseUnit() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:117:1: ( ruleUseUnit EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:118:1: ruleUseUnit EOF
            {
             before(grammarAccess.getUseUnitRule()); 
            pushFollow(FOLLOW_ruleUseUnit_in_entryRuleUseUnit181);
            ruleUseUnit();

            state._fsp--;

             after(grammarAccess.getUseUnitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseUnit188); 

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
    // $ANTLR end "entryRuleUseUnit"


    // $ANTLR start "ruleUseUnit"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:125:1: ruleUseUnit : ( ( rule__UseUnit__Group__0 ) ) ;
    public final void ruleUseUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:129:2: ( ( ( rule__UseUnit__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:130:1: ( ( rule__UseUnit__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:130:1: ( ( rule__UseUnit__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:131:1: ( rule__UseUnit__Group__0 )
            {
             before(grammarAccess.getUseUnitAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:132:1: ( rule__UseUnit__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:132:2: rule__UseUnit__Group__0
            {
            pushFollow(FOLLOW_rule__UseUnit__Group__0_in_ruleUseUnit214);
            rule__UseUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseUnitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseUnit"


    // $ANTLR start "entryRuleNamespaceUnit"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:144:1: entryRuleNamespaceUnit : ruleNamespaceUnit EOF ;
    public final void entryRuleNamespaceUnit() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:145:1: ( ruleNamespaceUnit EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:146:1: ruleNamespaceUnit EOF
            {
             before(grammarAccess.getNamespaceUnitRule()); 
            pushFollow(FOLLOW_ruleNamespaceUnit_in_entryRuleNamespaceUnit241);
            ruleNamespaceUnit();

            state._fsp--;

             after(grammarAccess.getNamespaceUnitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceUnit248); 

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
    // $ANTLR end "entryRuleNamespaceUnit"


    // $ANTLR start "ruleNamespaceUnit"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:153:1: ruleNamespaceUnit : ( ( rule__NamespaceUnit__Group__0 ) ) ;
    public final void ruleNamespaceUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:157:2: ( ( ( rule__NamespaceUnit__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:158:1: ( ( rule__NamespaceUnit__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:158:1: ( ( rule__NamespaceUnit__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:159:1: ( rule__NamespaceUnit__Group__0 )
            {
             before(grammarAccess.getNamespaceUnitAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:160:1: ( rule__NamespaceUnit__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:160:2: rule__NamespaceUnit__Group__0
            {
            pushFollow(FOLLOW_rule__NamespaceUnit__Group__0_in_ruleNamespaceUnit274);
            rule__NamespaceUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceUnitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespaceUnit"


    // $ANTLR start "entryRuleQUALIFIEDID"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:172:1: entryRuleQUALIFIEDID : ruleQUALIFIEDID EOF ;
    public final void entryRuleQUALIFIEDID() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:173:1: ( ruleQUALIFIEDID EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:174:1: ruleQUALIFIEDID EOF
            {
             before(grammarAccess.getQUALIFIEDIDRule()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_entryRuleQUALIFIEDID301);
            ruleQUALIFIEDID();

            state._fsp--;

             after(grammarAccess.getQUALIFIEDIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIEDID308); 

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
    // $ANTLR end "entryRuleQUALIFIEDID"


    // $ANTLR start "ruleQUALIFIEDID"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:181:1: ruleQUALIFIEDID : ( ( rule__QUALIFIEDID__Group__0 ) ) ;
    public final void ruleQUALIFIEDID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:185:2: ( ( ( rule__QUALIFIEDID__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:186:1: ( ( rule__QUALIFIEDID__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:186:1: ( ( rule__QUALIFIEDID__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:187:1: ( rule__QUALIFIEDID__Group__0 )
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:188:1: ( rule__QUALIFIEDID__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:188:2: rule__QUALIFIEDID__Group__0
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group__0_in_ruleQUALIFIEDID334);
            rule__QUALIFIEDID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQUALIFIEDIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQUALIFIEDID"


    // $ANTLR start "entryRuleProductUnit"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:200:1: entryRuleProductUnit : ruleProductUnit EOF ;
    public final void entryRuleProductUnit() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:201:1: ( ruleProductUnit EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:202:1: ruleProductUnit EOF
            {
             before(grammarAccess.getProductUnitRule()); 
            pushFollow(FOLLOW_ruleProductUnit_in_entryRuleProductUnit361);
            ruleProductUnit();

            state._fsp--;

             after(grammarAccess.getProductUnitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProductUnit368); 

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
    // $ANTLR end "entryRuleProductUnit"


    // $ANTLR start "ruleProductUnit"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:209:1: ruleProductUnit : ( ( rule__ProductUnit__Group__0 ) ) ;
    public final void ruleProductUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:213:2: ( ( ( rule__ProductUnit__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:214:1: ( ( rule__ProductUnit__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:214:1: ( ( rule__ProductUnit__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:215:1: ( rule__ProductUnit__Group__0 )
            {
             before(grammarAccess.getProductUnitAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:216:1: ( rule__ProductUnit__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:216:2: rule__ProductUnit__Group__0
            {
            pushFollow(FOLLOW_rule__ProductUnit__Group__0_in_ruleProductUnit394);
            rule__ProductUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductUnitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProductUnit"


    // $ANTLR start "entryRuleParameterElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:228:1: entryRuleParameterElement : ruleParameterElement EOF ;
    public final void entryRuleParameterElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:229:1: ( ruleParameterElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:230:1: ruleParameterElement EOF
            {
             before(grammarAccess.getParameterElementRule()); 
            pushFollow(FOLLOW_ruleParameterElement_in_entryRuleParameterElement421);
            ruleParameterElement();

            state._fsp--;

             after(grammarAccess.getParameterElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterElement428); 

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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:237:1: ruleParameterElement : ( ( rule__ParameterElement__Group__0 ) ) ;
    public final void ruleParameterElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:241:2: ( ( ( rule__ParameterElement__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:242:1: ( ( rule__ParameterElement__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:242:1: ( ( rule__ParameterElement__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:243:1: ( rule__ParameterElement__Group__0 )
            {
             before(grammarAccess.getParameterElementAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:244:1: ( rule__ParameterElement__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:244:2: rule__ParameterElement__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group__0_in_ruleParameterElement454);
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


    // $ANTLR start "entryRuleOperationUnit"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:256:1: entryRuleOperationUnit : ruleOperationUnit EOF ;
    public final void entryRuleOperationUnit() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:257:1: ( ruleOperationUnit EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:258:1: ruleOperationUnit EOF
            {
             before(grammarAccess.getOperationUnitRule()); 
            pushFollow(FOLLOW_ruleOperationUnit_in_entryRuleOperationUnit481);
            ruleOperationUnit();

            state._fsp--;

             after(grammarAccess.getOperationUnitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationUnit488); 

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
    // $ANTLR end "entryRuleOperationUnit"


    // $ANTLR start "ruleOperationUnit"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:265:1: ruleOperationUnit : ( ( rule__OperationUnit__Group__0 ) ) ;
    public final void ruleOperationUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:269:2: ( ( ( rule__OperationUnit__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:270:1: ( ( rule__OperationUnit__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:270:1: ( ( rule__OperationUnit__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:271:1: ( rule__OperationUnit__Group__0 )
            {
             before(grammarAccess.getOperationUnitAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:272:1: ( rule__OperationUnit__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:272:2: rule__OperationUnit__Group__0
            {
            pushFollow(FOLLOW_rule__OperationUnit__Group__0_in_ruleOperationUnit514);
            rule__OperationUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationUnitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationUnit"


    // $ANTLR start "entryRuleControlElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:284:1: entryRuleControlElement : ruleControlElement EOF ;
    public final void entryRuleControlElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:285:1: ( ruleControlElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:286:1: ruleControlElement EOF
            {
             before(grammarAccess.getControlElementRule()); 
            pushFollow(FOLLOW_ruleControlElement_in_entryRuleControlElement541);
            ruleControlElement();

            state._fsp--;

             after(grammarAccess.getControlElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlElement548); 

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
    // $ANTLR end "entryRuleControlElement"


    // $ANTLR start "ruleControlElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:293:1: ruleControlElement : ( ( rule__ControlElement__Group__0 ) ) ;
    public final void ruleControlElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:297:2: ( ( ( rule__ControlElement__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:298:1: ( ( rule__ControlElement__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:298:1: ( ( rule__ControlElement__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:299:1: ( rule__ControlElement__Group__0 )
            {
             before(grammarAccess.getControlElementAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:300:1: ( rule__ControlElement__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:300:2: rule__ControlElement__Group__0
            {
            pushFollow(FOLLOW_rule__ControlElement__Group__0_in_ruleControlElement574);
            rule__ControlElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getControlElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleControlElement"


    // $ANTLR start "entryRuleExpressionElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:312:1: entryRuleExpressionElement : ruleExpressionElement EOF ;
    public final void entryRuleExpressionElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:313:1: ( ruleExpressionElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:314:1: ruleExpressionElement EOF
            {
             before(grammarAccess.getExpressionElementRule()); 
            pushFollow(FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement601);
            ruleExpressionElement();

            state._fsp--;

             after(grammarAccess.getExpressionElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionElement608); 

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
            pushFollow(FOLLOW_rule__ExpressionElement__Group__0_in_ruleExpressionElement634);
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


    // $ANTLR start "entryRuleControlStatementElement"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:340:1: entryRuleControlStatementElement : ruleControlStatementElement EOF ;
    public final void entryRuleControlStatementElement() throws RecognitionException {
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:341:1: ( ruleControlStatementElement EOF )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:342:1: ruleControlStatementElement EOF
            {
             before(grammarAccess.getControlStatementElementRule()); 
            pushFollow(FOLLOW_ruleControlStatementElement_in_entryRuleControlStatementElement661);
            ruleControlStatementElement();

            state._fsp--;

             after(grammarAccess.getControlStatementElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlStatementElement668); 

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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:349:1: ruleControlStatementElement : ( ( rule__ControlStatementElement__Group__0 ) ) ;
    public final void ruleControlStatementElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:353:2: ( ( ( rule__ControlStatementElement__Group__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:354:1: ( ( rule__ControlStatementElement__Group__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:354:1: ( ( rule__ControlStatementElement__Group__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:355:1: ( rule__ControlStatementElement__Group__0 )
            {
             before(grammarAccess.getControlStatementElementAccess().getGroup()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:356:1: ( rule__ControlStatementElement__Group__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:356:2: rule__ControlStatementElement__Group__0
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__Group__0_in_ruleControlStatementElement694);
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


    // $ANTLR start "ruleUMAPDataTypes"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:369:1: ruleUMAPDataTypes : ( ( rule__UMAPDataTypes__Alternatives ) ) ;
    public final void ruleUMAPDataTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:373:1: ( ( ( rule__UMAPDataTypes__Alternatives ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:374:1: ( ( rule__UMAPDataTypes__Alternatives ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:374:1: ( ( rule__UMAPDataTypes__Alternatives ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:375:1: ( rule__UMAPDataTypes__Alternatives )
            {
             before(grammarAccess.getUMAPDataTypesAccess().getAlternatives()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:376:1: ( rule__UMAPDataTypes__Alternatives )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:376:2: rule__UMAPDataTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__UMAPDataTypes__Alternatives_in_ruleUMAPDataTypes731);
            rule__UMAPDataTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUMAPDataTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUMAPDataTypes"


    // $ANTLR start "ruleOPERATORS"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:388:1: ruleOPERATORS : ( ( rule__OPERATORS__Alternatives ) ) ;
    public final void ruleOPERATORS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:392:1: ( ( ( rule__OPERATORS__Alternatives ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:393:1: ( ( rule__OPERATORS__Alternatives ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:393:1: ( ( rule__OPERATORS__Alternatives ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:394:1: ( rule__OPERATORS__Alternatives )
            {
             before(grammarAccess.getOPERATORSAccess().getAlternatives()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:395:1: ( rule__OPERATORS__Alternatives )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:395:2: rule__OPERATORS__Alternatives
            {
            pushFollow(FOLLOW_rule__OPERATORS__Alternatives_in_ruleOPERATORS767);
            rule__OPERATORS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOPERATORSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOPERATORS"


    // $ANTLR start "rule__UMAPDataTypes__Alternatives"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:406:1: rule__UMAPDataTypes__Alternatives : ( ( ( 'BRANCH' ) ) | ( ( 'CLIENT' ) ) | ( ( 'CURRENCY' ) ) | ( ( 'NUMBER' ) ) | ( ( 'STRING' ) ) );
    public final void rule__UMAPDataTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:410:1: ( ( ( 'BRANCH' ) ) | ( ( 'CLIENT' ) ) | ( ( 'CURRENCY' ) ) | ( ( 'NUMBER' ) ) | ( ( 'STRING' ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:411:1: ( ( 'BRANCH' ) )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:411:1: ( ( 'BRANCH' ) )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:412:1: ( 'BRANCH' )
                    {
                     before(grammarAccess.getUMAPDataTypesAccess().getBRANCHEnumLiteralDeclaration_0()); 
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:413:1: ( 'BRANCH' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:413:3: 'BRANCH'
                    {
                    match(input,11,FOLLOW_11_in_rule__UMAPDataTypes__Alternatives803); 

                    }

                     after(grammarAccess.getUMAPDataTypesAccess().getBRANCHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:418:6: ( ( 'CLIENT' ) )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:418:6: ( ( 'CLIENT' ) )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:419:1: ( 'CLIENT' )
                    {
                     before(grammarAccess.getUMAPDataTypesAccess().getCLIENTEnumLiteralDeclaration_1()); 
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:420:1: ( 'CLIENT' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:420:3: 'CLIENT'
                    {
                    match(input,12,FOLLOW_12_in_rule__UMAPDataTypes__Alternatives824); 

                    }

                     after(grammarAccess.getUMAPDataTypesAccess().getCLIENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:425:6: ( ( 'CURRENCY' ) )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:425:6: ( ( 'CURRENCY' ) )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:426:1: ( 'CURRENCY' )
                    {
                     before(grammarAccess.getUMAPDataTypesAccess().getCURRENCYEnumLiteralDeclaration_2()); 
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:427:1: ( 'CURRENCY' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:427:3: 'CURRENCY'
                    {
                    match(input,13,FOLLOW_13_in_rule__UMAPDataTypes__Alternatives845); 

                    }

                     after(grammarAccess.getUMAPDataTypesAccess().getCURRENCYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:432:6: ( ( 'NUMBER' ) )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:432:6: ( ( 'NUMBER' ) )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:433:1: ( 'NUMBER' )
                    {
                     before(grammarAccess.getUMAPDataTypesAccess().getNUMBEREnumLiteralDeclaration_3()); 
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:434:1: ( 'NUMBER' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:434:3: 'NUMBER'
                    {
                    match(input,14,FOLLOW_14_in_rule__UMAPDataTypes__Alternatives866); 

                    }

                     after(grammarAccess.getUMAPDataTypesAccess().getNUMBEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:439:6: ( ( 'STRING' ) )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:439:6: ( ( 'STRING' ) )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:440:1: ( 'STRING' )
                    {
                     before(grammarAccess.getUMAPDataTypesAccess().getSTRINGEnumLiteralDeclaration_4()); 
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:441:1: ( 'STRING' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:441:3: 'STRING'
                    {
                    match(input,15,FOLLOW_15_in_rule__UMAPDataTypes__Alternatives887); 

                    }

                     after(grammarAccess.getUMAPDataTypesAccess().getSTRINGEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__UMAPDataTypes__Alternatives"


    // $ANTLR start "rule__OPERATORS__Alternatives"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:451:1: rule__OPERATORS__Alternatives : ( ( ( 'is' ) ) | ( ( 'is not' ) ) );
    public final void rule__OPERATORS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:455:1: ( ( ( 'is' ) ) | ( ( 'is not' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:456:1: ( ( 'is' ) )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:456:1: ( ( 'is' ) )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:457:1: ( 'is' )
                    {
                     before(grammarAccess.getOPERATORSAccess().getISEnumLiteralDeclaration_0()); 
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:458:1: ( 'is' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:458:3: 'is'
                    {
                    match(input,16,FOLLOW_16_in_rule__OPERATORS__Alternatives923); 

                    }

                     after(grammarAccess.getOPERATORSAccess().getISEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:463:6: ( ( 'is not' ) )
                    {
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:463:6: ( ( 'is not' ) )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:464:1: ( 'is not' )
                    {
                     before(grammarAccess.getOPERATORSAccess().getNOTEnumLiteralDeclaration_1()); 
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:465:1: ( 'is not' )
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:465:3: 'is not'
                    {
                    match(input,17,FOLLOW_17_in_rule__OPERATORS__Alternatives944); 

                    }

                     after(grammarAccess.getOPERATORSAccess().getNOTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__OPERATORS__Alternatives"


    // $ANTLR start "rule__CompilationUnit__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:477:1: rule__CompilationUnit__Group__0 : rule__CompilationUnit__Group__0__Impl rule__CompilationUnit__Group__1 ;
    public final void rule__CompilationUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:481:1: ( rule__CompilationUnit__Group__0__Impl rule__CompilationUnit__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:482:2: rule__CompilationUnit__Group__0__Impl rule__CompilationUnit__Group__1
            {
            pushFollow(FOLLOW_rule__CompilationUnit__Group__0__Impl_in_rule__CompilationUnit__Group__0977);
            rule__CompilationUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompilationUnit__Group__1_in_rule__CompilationUnit__Group__0980);
            rule__CompilationUnit__Group__1();

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
    // $ANTLR end "rule__CompilationUnit__Group__0"


    // $ANTLR start "rule__CompilationUnit__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:489:1: rule__CompilationUnit__Group__0__Impl : ( ( rule__CompilationUnit__NamespaceUnitAssignment_0 ) ) ;
    public final void rule__CompilationUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:493:1: ( ( ( rule__CompilationUnit__NamespaceUnitAssignment_0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:494:1: ( ( rule__CompilationUnit__NamespaceUnitAssignment_0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:494:1: ( ( rule__CompilationUnit__NamespaceUnitAssignment_0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:495:1: ( rule__CompilationUnit__NamespaceUnitAssignment_0 )
            {
             before(grammarAccess.getCompilationUnitAccess().getNamespaceUnitAssignment_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:496:1: ( rule__CompilationUnit__NamespaceUnitAssignment_0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:496:2: rule__CompilationUnit__NamespaceUnitAssignment_0
            {
            pushFollow(FOLLOW_rule__CompilationUnit__NamespaceUnitAssignment_0_in_rule__CompilationUnit__Group__0__Impl1007);
            rule__CompilationUnit__NamespaceUnitAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCompilationUnitAccess().getNamespaceUnitAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__Group__0__Impl"


    // $ANTLR start "rule__CompilationUnit__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:506:1: rule__CompilationUnit__Group__1 : rule__CompilationUnit__Group__1__Impl rule__CompilationUnit__Group__2 ;
    public final void rule__CompilationUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:510:1: ( rule__CompilationUnit__Group__1__Impl rule__CompilationUnit__Group__2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:511:2: rule__CompilationUnit__Group__1__Impl rule__CompilationUnit__Group__2
            {
            pushFollow(FOLLOW_rule__CompilationUnit__Group__1__Impl_in_rule__CompilationUnit__Group__11037);
            rule__CompilationUnit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompilationUnit__Group__2_in_rule__CompilationUnit__Group__11040);
            rule__CompilationUnit__Group__2();

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
    // $ANTLR end "rule__CompilationUnit__Group__1"


    // $ANTLR start "rule__CompilationUnit__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:518:1: rule__CompilationUnit__Group__1__Impl : ( ( rule__CompilationUnit__UseUnitAssignment_1 )? ) ;
    public final void rule__CompilationUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:522:1: ( ( ( rule__CompilationUnit__UseUnitAssignment_1 )? ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:523:1: ( ( rule__CompilationUnit__UseUnitAssignment_1 )? )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:523:1: ( ( rule__CompilationUnit__UseUnitAssignment_1 )? )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:524:1: ( rule__CompilationUnit__UseUnitAssignment_1 )?
            {
             before(grammarAccess.getCompilationUnitAccess().getUseUnitAssignment_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:525:1: ( rule__CompilationUnit__UseUnitAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:525:2: rule__CompilationUnit__UseUnitAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CompilationUnit__UseUnitAssignment_1_in_rule__CompilationUnit__Group__1__Impl1067);
                    rule__CompilationUnit__UseUnitAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompilationUnitAccess().getUseUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__Group__1__Impl"


    // $ANTLR start "rule__CompilationUnit__Group__2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:535:1: rule__CompilationUnit__Group__2 : rule__CompilationUnit__Group__2__Impl ;
    public final void rule__CompilationUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:539:1: ( rule__CompilationUnit__Group__2__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:540:2: rule__CompilationUnit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CompilationUnit__Group__2__Impl_in_rule__CompilationUnit__Group__21098);
            rule__CompilationUnit__Group__2__Impl();

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
    // $ANTLR end "rule__CompilationUnit__Group__2"


    // $ANTLR start "rule__CompilationUnit__Group__2__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:546:1: rule__CompilationUnit__Group__2__Impl : ( ( rule__CompilationUnit__ProductUnitAssignment_2 ) ) ;
    public final void rule__CompilationUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:550:1: ( ( ( rule__CompilationUnit__ProductUnitAssignment_2 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:551:1: ( ( rule__CompilationUnit__ProductUnitAssignment_2 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:551:1: ( ( rule__CompilationUnit__ProductUnitAssignment_2 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:552:1: ( rule__CompilationUnit__ProductUnitAssignment_2 )
            {
             before(grammarAccess.getCompilationUnitAccess().getProductUnitAssignment_2()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:553:1: ( rule__CompilationUnit__ProductUnitAssignment_2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:553:2: rule__CompilationUnit__ProductUnitAssignment_2
            {
            pushFollow(FOLLOW_rule__CompilationUnit__ProductUnitAssignment_2_in_rule__CompilationUnit__Group__2__Impl1125);
            rule__CompilationUnit__ProductUnitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompilationUnitAccess().getProductUnitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__Group__2__Impl"


    // $ANTLR start "rule__UseUnit__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:569:1: rule__UseUnit__Group__0 : rule__UseUnit__Group__0__Impl rule__UseUnit__Group__1 ;
    public final void rule__UseUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:573:1: ( rule__UseUnit__Group__0__Impl rule__UseUnit__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:574:2: rule__UseUnit__Group__0__Impl rule__UseUnit__Group__1
            {
            pushFollow(FOLLOW_rule__UseUnit__Group__0__Impl_in_rule__UseUnit__Group__01161);
            rule__UseUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseUnit__Group__1_in_rule__UseUnit__Group__01164);
            rule__UseUnit__Group__1();

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
    // $ANTLR end "rule__UseUnit__Group__0"


    // $ANTLR start "rule__UseUnit__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:581:1: rule__UseUnit__Group__0__Impl : ( 'use' ) ;
    public final void rule__UseUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:585:1: ( ( 'use' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:586:1: ( 'use' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:586:1: ( 'use' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:587:1: 'use'
            {
             before(grammarAccess.getUseUnitAccess().getUseKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__UseUnit__Group__0__Impl1192); 
             after(grammarAccess.getUseUnitAccess().getUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseUnit__Group__0__Impl"


    // $ANTLR start "rule__UseUnit__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:600:1: rule__UseUnit__Group__1 : rule__UseUnit__Group__1__Impl ;
    public final void rule__UseUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:604:1: ( rule__UseUnit__Group__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:605:2: rule__UseUnit__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UseUnit__Group__1__Impl_in_rule__UseUnit__Group__11223);
            rule__UseUnit__Group__1__Impl();

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
    // $ANTLR end "rule__UseUnit__Group__1"


    // $ANTLR start "rule__UseUnit__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:611:1: rule__UseUnit__Group__1__Impl : ( ( rule__UseUnit__ProductUnitAssignment_1 ) ) ;
    public final void rule__UseUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:615:1: ( ( ( rule__UseUnit__ProductUnitAssignment_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:616:1: ( ( rule__UseUnit__ProductUnitAssignment_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:616:1: ( ( rule__UseUnit__ProductUnitAssignment_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:617:1: ( rule__UseUnit__ProductUnitAssignment_1 )
            {
             before(grammarAccess.getUseUnitAccess().getProductUnitAssignment_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:618:1: ( rule__UseUnit__ProductUnitAssignment_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:618:2: rule__UseUnit__ProductUnitAssignment_1
            {
            pushFollow(FOLLOW_rule__UseUnit__ProductUnitAssignment_1_in_rule__UseUnit__Group__1__Impl1250);
            rule__UseUnit__ProductUnitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUseUnitAccess().getProductUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseUnit__Group__1__Impl"


    // $ANTLR start "rule__NamespaceUnit__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:632:1: rule__NamespaceUnit__Group__0 : rule__NamespaceUnit__Group__0__Impl rule__NamespaceUnit__Group__1 ;
    public final void rule__NamespaceUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:636:1: ( rule__NamespaceUnit__Group__0__Impl rule__NamespaceUnit__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:637:2: rule__NamespaceUnit__Group__0__Impl rule__NamespaceUnit__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceUnit__Group__0__Impl_in_rule__NamespaceUnit__Group__01284);
            rule__NamespaceUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceUnit__Group__1_in_rule__NamespaceUnit__Group__01287);
            rule__NamespaceUnit__Group__1();

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
    // $ANTLR end "rule__NamespaceUnit__Group__0"


    // $ANTLR start "rule__NamespaceUnit__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:644:1: rule__NamespaceUnit__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__NamespaceUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:648:1: ( ( 'namespace' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:649:1: ( 'namespace' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:649:1: ( 'namespace' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:650:1: 'namespace'
            {
             before(grammarAccess.getNamespaceUnitAccess().getNamespaceKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__NamespaceUnit__Group__0__Impl1315); 
             after(grammarAccess.getNamespaceUnitAccess().getNamespaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceUnit__Group__0__Impl"


    // $ANTLR start "rule__NamespaceUnit__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:663:1: rule__NamespaceUnit__Group__1 : rule__NamespaceUnit__Group__1__Impl ;
    public final void rule__NamespaceUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:667:1: ( rule__NamespaceUnit__Group__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:668:2: rule__NamespaceUnit__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceUnit__Group__1__Impl_in_rule__NamespaceUnit__Group__11346);
            rule__NamespaceUnit__Group__1__Impl();

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
    // $ANTLR end "rule__NamespaceUnit__Group__1"


    // $ANTLR start "rule__NamespaceUnit__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:674:1: rule__NamespaceUnit__Group__1__Impl : ( ( rule__NamespaceUnit__NameAssignment_1 ) ) ;
    public final void rule__NamespaceUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:678:1: ( ( ( rule__NamespaceUnit__NameAssignment_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:679:1: ( ( rule__NamespaceUnit__NameAssignment_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:679:1: ( ( rule__NamespaceUnit__NameAssignment_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:680:1: ( rule__NamespaceUnit__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceUnitAccess().getNameAssignment_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:681:1: ( rule__NamespaceUnit__NameAssignment_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:681:2: rule__NamespaceUnit__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamespaceUnit__NameAssignment_1_in_rule__NamespaceUnit__Group__1__Impl1373);
            rule__NamespaceUnit__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceUnitAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceUnit__Group__1__Impl"


    // $ANTLR start "rule__QUALIFIEDID__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:695:1: rule__QUALIFIEDID__Group__0 : rule__QUALIFIEDID__Group__0__Impl rule__QUALIFIEDID__Group__1 ;
    public final void rule__QUALIFIEDID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:699:1: ( rule__QUALIFIEDID__Group__0__Impl rule__QUALIFIEDID__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:700:2: rule__QUALIFIEDID__Group__0__Impl rule__QUALIFIEDID__Group__1
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group__0__Impl_in_rule__QUALIFIEDID__Group__01407);
            rule__QUALIFIEDID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIEDID__Group__1_in_rule__QUALIFIEDID__Group__01410);
            rule__QUALIFIEDID__Group__1();

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
    // $ANTLR end "rule__QUALIFIEDID__Group__0"


    // $ANTLR start "rule__QUALIFIEDID__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:707:1: rule__QUALIFIEDID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIEDID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:711:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:712:1: ( RULE_ID )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:712:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:713:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIEDID__Group__0__Impl1437); 
             after(grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QUALIFIEDID__Group__0__Impl"


    // $ANTLR start "rule__QUALIFIEDID__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:724:1: rule__QUALIFIEDID__Group__1 : rule__QUALIFIEDID__Group__1__Impl ;
    public final void rule__QUALIFIEDID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:728:1: ( rule__QUALIFIEDID__Group__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:729:2: rule__QUALIFIEDID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group__1__Impl_in_rule__QUALIFIEDID__Group__11466);
            rule__QUALIFIEDID__Group__1__Impl();

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
    // $ANTLR end "rule__QUALIFIEDID__Group__1"


    // $ANTLR start "rule__QUALIFIEDID__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:735:1: rule__QUALIFIEDID__Group__1__Impl : ( ( rule__QUALIFIEDID__Group_1__0 )* ) ;
    public final void rule__QUALIFIEDID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:739:1: ( ( ( rule__QUALIFIEDID__Group_1__0 )* ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:740:1: ( ( rule__QUALIFIEDID__Group_1__0 )* )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:740:1: ( ( rule__QUALIFIEDID__Group_1__0 )* )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:741:1: ( rule__QUALIFIEDID__Group_1__0 )*
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getGroup_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:742:1: ( rule__QUALIFIEDID__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:742:2: rule__QUALIFIEDID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QUALIFIEDID__Group_1__0_in_rule__QUALIFIEDID__Group__1__Impl1493);
            	    rule__QUALIFIEDID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQUALIFIEDIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QUALIFIEDID__Group__1__Impl"


    // $ANTLR start "rule__QUALIFIEDID__Group_1__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:756:1: rule__QUALIFIEDID__Group_1__0 : rule__QUALIFIEDID__Group_1__0__Impl rule__QUALIFIEDID__Group_1__1 ;
    public final void rule__QUALIFIEDID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:760:1: ( rule__QUALIFIEDID__Group_1__0__Impl rule__QUALIFIEDID__Group_1__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:761:2: rule__QUALIFIEDID__Group_1__0__Impl rule__QUALIFIEDID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group_1__0__Impl_in_rule__QUALIFIEDID__Group_1__01528);
            rule__QUALIFIEDID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIEDID__Group_1__1_in_rule__QUALIFIEDID__Group_1__01531);
            rule__QUALIFIEDID__Group_1__1();

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
    // $ANTLR end "rule__QUALIFIEDID__Group_1__0"


    // $ANTLR start "rule__QUALIFIEDID__Group_1__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:768:1: rule__QUALIFIEDID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QUALIFIEDID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:772:1: ( ( '.' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:773:1: ( '.' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:773:1: ( '.' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:774:1: '.'
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__QUALIFIEDID__Group_1__0__Impl1559); 
             after(grammarAccess.getQUALIFIEDIDAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QUALIFIEDID__Group_1__0__Impl"


    // $ANTLR start "rule__QUALIFIEDID__Group_1__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:787:1: rule__QUALIFIEDID__Group_1__1 : rule__QUALIFIEDID__Group_1__1__Impl ;
    public final void rule__QUALIFIEDID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:791:1: ( rule__QUALIFIEDID__Group_1__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:792:2: rule__QUALIFIEDID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group_1__1__Impl_in_rule__QUALIFIEDID__Group_1__11590);
            rule__QUALIFIEDID__Group_1__1__Impl();

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
    // $ANTLR end "rule__QUALIFIEDID__Group_1__1"


    // $ANTLR start "rule__QUALIFIEDID__Group_1__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:798:1: rule__QUALIFIEDID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIEDID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:802:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:803:1: ( RULE_ID )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:803:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:804:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIEDID__Group_1__1__Impl1617); 
             after(grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QUALIFIEDID__Group_1__1__Impl"


    // $ANTLR start "rule__ProductUnit__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:819:1: rule__ProductUnit__Group__0 : rule__ProductUnit__Group__0__Impl rule__ProductUnit__Group__1 ;
    public final void rule__ProductUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:823:1: ( rule__ProductUnit__Group__0__Impl rule__ProductUnit__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:824:2: rule__ProductUnit__Group__0__Impl rule__ProductUnit__Group__1
            {
            pushFollow(FOLLOW_rule__ProductUnit__Group__0__Impl_in_rule__ProductUnit__Group__01650);
            rule__ProductUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProductUnit__Group__1_in_rule__ProductUnit__Group__01653);
            rule__ProductUnit__Group__1();

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
    // $ANTLR end "rule__ProductUnit__Group__0"


    // $ANTLR start "rule__ProductUnit__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:831:1: rule__ProductUnit__Group__0__Impl : ( 'product' ) ;
    public final void rule__ProductUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:835:1: ( ( 'product' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:836:1: ( 'product' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:836:1: ( 'product' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:837:1: 'product'
            {
             before(grammarAccess.getProductUnitAccess().getProductKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__ProductUnit__Group__0__Impl1681); 
             after(grammarAccess.getProductUnitAccess().getProductKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductUnit__Group__0__Impl"


    // $ANTLR start "rule__ProductUnit__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:850:1: rule__ProductUnit__Group__1 : rule__ProductUnit__Group__1__Impl rule__ProductUnit__Group__2 ;
    public final void rule__ProductUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:854:1: ( rule__ProductUnit__Group__1__Impl rule__ProductUnit__Group__2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:855:2: rule__ProductUnit__Group__1__Impl rule__ProductUnit__Group__2
            {
            pushFollow(FOLLOW_rule__ProductUnit__Group__1__Impl_in_rule__ProductUnit__Group__11712);
            rule__ProductUnit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProductUnit__Group__2_in_rule__ProductUnit__Group__11715);
            rule__ProductUnit__Group__2();

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
    // $ANTLR end "rule__ProductUnit__Group__1"


    // $ANTLR start "rule__ProductUnit__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:862:1: rule__ProductUnit__Group__1__Impl : ( ( rule__ProductUnit__NameAssignment_1 ) ) ;
    public final void rule__ProductUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:866:1: ( ( ( rule__ProductUnit__NameAssignment_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:867:1: ( ( rule__ProductUnit__NameAssignment_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:867:1: ( ( rule__ProductUnit__NameAssignment_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:868:1: ( rule__ProductUnit__NameAssignment_1 )
            {
             before(grammarAccess.getProductUnitAccess().getNameAssignment_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:869:1: ( rule__ProductUnit__NameAssignment_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:869:2: rule__ProductUnit__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ProductUnit__NameAssignment_1_in_rule__ProductUnit__Group__1__Impl1742);
            rule__ProductUnit__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProductUnitAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductUnit__Group__1__Impl"


    // $ANTLR start "rule__ProductUnit__Group__2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:879:1: rule__ProductUnit__Group__2 : rule__ProductUnit__Group__2__Impl rule__ProductUnit__Group__3 ;
    public final void rule__ProductUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:883:1: ( rule__ProductUnit__Group__2__Impl rule__ProductUnit__Group__3 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:884:2: rule__ProductUnit__Group__2__Impl rule__ProductUnit__Group__3
            {
            pushFollow(FOLLOW_rule__ProductUnit__Group__2__Impl_in_rule__ProductUnit__Group__21772);
            rule__ProductUnit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProductUnit__Group__3_in_rule__ProductUnit__Group__21775);
            rule__ProductUnit__Group__3();

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
    // $ANTLR end "rule__ProductUnit__Group__2"


    // $ANTLR start "rule__ProductUnit__Group__2__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:891:1: rule__ProductUnit__Group__2__Impl : ( ( rule__ProductUnit__Group_2__0 ) ) ;
    public final void rule__ProductUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:895:1: ( ( ( rule__ProductUnit__Group_2__0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:896:1: ( ( rule__ProductUnit__Group_2__0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:896:1: ( ( rule__ProductUnit__Group_2__0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:897:1: ( rule__ProductUnit__Group_2__0 )
            {
             before(grammarAccess.getProductUnitAccess().getGroup_2()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:898:1: ( rule__ProductUnit__Group_2__0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:898:2: rule__ProductUnit__Group_2__0
            {
            pushFollow(FOLLOW_rule__ProductUnit__Group_2__0_in_rule__ProductUnit__Group__2__Impl1802);
            rule__ProductUnit__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getProductUnitAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductUnit__Group__2__Impl"


    // $ANTLR start "rule__ProductUnit__Group__3"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:908:1: rule__ProductUnit__Group__3 : rule__ProductUnit__Group__3__Impl ;
    public final void rule__ProductUnit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:912:1: ( rule__ProductUnit__Group__3__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:913:2: rule__ProductUnit__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ProductUnit__Group__3__Impl_in_rule__ProductUnit__Group__31832);
            rule__ProductUnit__Group__3__Impl();

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
    // $ANTLR end "rule__ProductUnit__Group__3"


    // $ANTLR start "rule__ProductUnit__Group__3__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:919:1: rule__ProductUnit__Group__3__Impl : ( ( rule__ProductUnit__OperationUnitAssignment_3 ) ) ;
    public final void rule__ProductUnit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:923:1: ( ( ( rule__ProductUnit__OperationUnitAssignment_3 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:924:1: ( ( rule__ProductUnit__OperationUnitAssignment_3 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:924:1: ( ( rule__ProductUnit__OperationUnitAssignment_3 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:925:1: ( rule__ProductUnit__OperationUnitAssignment_3 )
            {
             before(grammarAccess.getProductUnitAccess().getOperationUnitAssignment_3()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:926:1: ( rule__ProductUnit__OperationUnitAssignment_3 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:926:2: rule__ProductUnit__OperationUnitAssignment_3
            {
            pushFollow(FOLLOW_rule__ProductUnit__OperationUnitAssignment_3_in_rule__ProductUnit__Group__3__Impl1859);
            rule__ProductUnit__OperationUnitAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProductUnitAccess().getOperationUnitAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductUnit__Group__3__Impl"


    // $ANTLR start "rule__ProductUnit__Group_2__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:944:1: rule__ProductUnit__Group_2__0 : rule__ProductUnit__Group_2__0__Impl rule__ProductUnit__Group_2__1 ;
    public final void rule__ProductUnit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:948:1: ( rule__ProductUnit__Group_2__0__Impl rule__ProductUnit__Group_2__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:949:2: rule__ProductUnit__Group_2__0__Impl rule__ProductUnit__Group_2__1
            {
            pushFollow(FOLLOW_rule__ProductUnit__Group_2__0__Impl_in_rule__ProductUnit__Group_2__01897);
            rule__ProductUnit__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProductUnit__Group_2__1_in_rule__ProductUnit__Group_2__01900);
            rule__ProductUnit__Group_2__1();

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
    // $ANTLR end "rule__ProductUnit__Group_2__0"


    // $ANTLR start "rule__ProductUnit__Group_2__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:956:1: rule__ProductUnit__Group_2__0__Impl : ( 'parameters' ) ;
    public final void rule__ProductUnit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:960:1: ( ( 'parameters' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:961:1: ( 'parameters' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:961:1: ( 'parameters' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:962:1: 'parameters'
            {
             before(grammarAccess.getProductUnitAccess().getParametersKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__ProductUnit__Group_2__0__Impl1928); 
             after(grammarAccess.getProductUnitAccess().getParametersKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductUnit__Group_2__0__Impl"


    // $ANTLR start "rule__ProductUnit__Group_2__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:975:1: rule__ProductUnit__Group_2__1 : rule__ProductUnit__Group_2__1__Impl ;
    public final void rule__ProductUnit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:979:1: ( rule__ProductUnit__Group_2__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:980:2: rule__ProductUnit__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ProductUnit__Group_2__1__Impl_in_rule__ProductUnit__Group_2__11959);
            rule__ProductUnit__Group_2__1__Impl();

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
    // $ANTLR end "rule__ProductUnit__Group_2__1"


    // $ANTLR start "rule__ProductUnit__Group_2__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:986:1: rule__ProductUnit__Group_2__1__Impl : ( ( rule__ProductUnit__ParametersAssignment_2_1 )* ) ;
    public final void rule__ProductUnit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:990:1: ( ( ( rule__ProductUnit__ParametersAssignment_2_1 )* ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:991:1: ( ( rule__ProductUnit__ParametersAssignment_2_1 )* )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:991:1: ( ( rule__ProductUnit__ParametersAssignment_2_1 )* )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:992:1: ( rule__ProductUnit__ParametersAssignment_2_1 )*
            {
             before(grammarAccess.getProductUnitAccess().getParametersAssignment_2_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:993:1: ( rule__ProductUnit__ParametersAssignment_2_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:993:2: rule__ProductUnit__ParametersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__ProductUnit__ParametersAssignment_2_1_in_rule__ProductUnit__Group_2__1__Impl1986);
            	    rule__ProductUnit__ParametersAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProductUnitAccess().getParametersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductUnit__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterElement__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1007:1: rule__ParameterElement__Group__0 : rule__ParameterElement__Group__0__Impl rule__ParameterElement__Group__1 ;
    public final void rule__ParameterElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1011:1: ( rule__ParameterElement__Group__0__Impl rule__ParameterElement__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1012:2: rule__ParameterElement__Group__0__Impl rule__ParameterElement__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group__0__Impl_in_rule__ParameterElement__Group__02021);
            rule__ParameterElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group__1_in_rule__ParameterElement__Group__02024);
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1019:1: rule__ParameterElement__Group__0__Impl : ( ( rule__ParameterElement__NameAssignment_0 ) ) ;
    public final void rule__ParameterElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1023:1: ( ( ( rule__ParameterElement__NameAssignment_0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1024:1: ( ( rule__ParameterElement__NameAssignment_0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1024:1: ( ( rule__ParameterElement__NameAssignment_0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1025:1: ( rule__ParameterElement__NameAssignment_0 )
            {
             before(grammarAccess.getParameterElementAccess().getNameAssignment_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1026:1: ( rule__ParameterElement__NameAssignment_0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1026:2: rule__ParameterElement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterElement__NameAssignment_0_in_rule__ParameterElement__Group__0__Impl2051);
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1036:1: rule__ParameterElement__Group__1 : rule__ParameterElement__Group__1__Impl ;
    public final void rule__ParameterElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1040:1: ( rule__ParameterElement__Group__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1041:2: rule__ParameterElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group__1__Impl_in_rule__ParameterElement__Group__12081);
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1047:1: rule__ParameterElement__Group__1__Impl : ( ( rule__ParameterElement__Group_1__0 )? ) ;
    public final void rule__ParameterElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1051:1: ( ( ( rule__ParameterElement__Group_1__0 )? ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1052:1: ( ( rule__ParameterElement__Group_1__0 )? )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1052:1: ( ( rule__ParameterElement__Group_1__0 )? )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1053:1: ( rule__ParameterElement__Group_1__0 )?
            {
             before(grammarAccess.getParameterElementAccess().getGroup_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1054:1: ( rule__ParameterElement__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1054:2: rule__ParameterElement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ParameterElement__Group_1__0_in_rule__ParameterElement__Group__1__Impl2108);
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1068:1: rule__ParameterElement__Group_1__0 : rule__ParameterElement__Group_1__0__Impl rule__ParameterElement__Group_1__1 ;
    public final void rule__ParameterElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1072:1: ( rule__ParameterElement__Group_1__0__Impl rule__ParameterElement__Group_1__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1073:2: rule__ParameterElement__Group_1__0__Impl rule__ParameterElement__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1__0__Impl_in_rule__ParameterElement__Group_1__02143);
            rule__ParameterElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group_1__1_in_rule__ParameterElement__Group_1__02146);
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1080:1: rule__ParameterElement__Group_1__0__Impl : ( ':' ) ;
    public final void rule__ParameterElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1084:1: ( ( ':' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1085:1: ( ':' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1085:1: ( ':' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1086:1: ':'
            {
             before(grammarAccess.getParameterElementAccess().getColonKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__ParameterElement__Group_1__0__Impl2174); 
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1099:1: rule__ParameterElement__Group_1__1 : rule__ParameterElement__Group_1__1__Impl ;
    public final void rule__ParameterElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1103:1: ( rule__ParameterElement__Group_1__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1104:2: rule__ParameterElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1__1__Impl_in_rule__ParameterElement__Group_1__12205);
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1110:1: rule__ParameterElement__Group_1__1__Impl : ( ( rule__ParameterElement__TypeAssignment_1_1 ) ) ;
    public final void rule__ParameterElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1114:1: ( ( ( rule__ParameterElement__TypeAssignment_1_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1115:1: ( ( rule__ParameterElement__TypeAssignment_1_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1115:1: ( ( rule__ParameterElement__TypeAssignment_1_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1116:1: ( rule__ParameterElement__TypeAssignment_1_1 )
            {
             before(grammarAccess.getParameterElementAccess().getTypeAssignment_1_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1117:1: ( rule__ParameterElement__TypeAssignment_1_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1117:2: rule__ParameterElement__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParameterElement__TypeAssignment_1_1_in_rule__ParameterElement__Group_1__1__Impl2232);
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


    // $ANTLR start "rule__OperationUnit__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1131:1: rule__OperationUnit__Group__0 : rule__OperationUnit__Group__0__Impl rule__OperationUnit__Group__1 ;
    public final void rule__OperationUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1135:1: ( rule__OperationUnit__Group__0__Impl rule__OperationUnit__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1136:2: rule__OperationUnit__Group__0__Impl rule__OperationUnit__Group__1
            {
            pushFollow(FOLLOW_rule__OperationUnit__Group__0__Impl_in_rule__OperationUnit__Group__02266);
            rule__OperationUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationUnit__Group__1_in_rule__OperationUnit__Group__02269);
            rule__OperationUnit__Group__1();

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
    // $ANTLR end "rule__OperationUnit__Group__0"


    // $ANTLR start "rule__OperationUnit__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1143:1: rule__OperationUnit__Group__0__Impl : ( 'operation' ) ;
    public final void rule__OperationUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1147:1: ( ( 'operation' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1148:1: ( 'operation' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1148:1: ( 'operation' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1149:1: 'operation'
            {
             before(grammarAccess.getOperationUnitAccess().getOperationKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__OperationUnit__Group__0__Impl2297); 
             after(grammarAccess.getOperationUnitAccess().getOperationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationUnit__Group__0__Impl"


    // $ANTLR start "rule__OperationUnit__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1162:1: rule__OperationUnit__Group__1 : rule__OperationUnit__Group__1__Impl rule__OperationUnit__Group__2 ;
    public final void rule__OperationUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1166:1: ( rule__OperationUnit__Group__1__Impl rule__OperationUnit__Group__2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1167:2: rule__OperationUnit__Group__1__Impl rule__OperationUnit__Group__2
            {
            pushFollow(FOLLOW_rule__OperationUnit__Group__1__Impl_in_rule__OperationUnit__Group__12328);
            rule__OperationUnit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationUnit__Group__2_in_rule__OperationUnit__Group__12331);
            rule__OperationUnit__Group__2();

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
    // $ANTLR end "rule__OperationUnit__Group__1"


    // $ANTLR start "rule__OperationUnit__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1174:1: rule__OperationUnit__Group__1__Impl : ( ( rule__OperationUnit__NameAssignment_1 ) ) ;
    public final void rule__OperationUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1178:1: ( ( ( rule__OperationUnit__NameAssignment_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1179:1: ( ( rule__OperationUnit__NameAssignment_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1179:1: ( ( rule__OperationUnit__NameAssignment_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1180:1: ( rule__OperationUnit__NameAssignment_1 )
            {
             before(grammarAccess.getOperationUnitAccess().getNameAssignment_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1181:1: ( rule__OperationUnit__NameAssignment_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1181:2: rule__OperationUnit__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OperationUnit__NameAssignment_1_in_rule__OperationUnit__Group__1__Impl2358);
            rule__OperationUnit__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationUnitAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationUnit__Group__1__Impl"


    // $ANTLR start "rule__OperationUnit__Group__2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1191:1: rule__OperationUnit__Group__2 : rule__OperationUnit__Group__2__Impl rule__OperationUnit__Group__3 ;
    public final void rule__OperationUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1195:1: ( rule__OperationUnit__Group__2__Impl rule__OperationUnit__Group__3 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1196:2: rule__OperationUnit__Group__2__Impl rule__OperationUnit__Group__3
            {
            pushFollow(FOLLOW_rule__OperationUnit__Group__2__Impl_in_rule__OperationUnit__Group__22388);
            rule__OperationUnit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationUnit__Group__3_in_rule__OperationUnit__Group__22391);
            rule__OperationUnit__Group__3();

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
    // $ANTLR end "rule__OperationUnit__Group__2"


    // $ANTLR start "rule__OperationUnit__Group__2__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1203:1: rule__OperationUnit__Group__2__Impl : ( 'is' ) ;
    public final void rule__OperationUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1207:1: ( ( 'is' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1208:1: ( 'is' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1208:1: ( 'is' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1209:1: 'is'
            {
             before(grammarAccess.getOperationUnitAccess().getIsKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__OperationUnit__Group__2__Impl2419); 
             after(grammarAccess.getOperationUnitAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationUnit__Group__2__Impl"


    // $ANTLR start "rule__OperationUnit__Group__3"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1222:1: rule__OperationUnit__Group__3 : rule__OperationUnit__Group__3__Impl ;
    public final void rule__OperationUnit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1226:1: ( rule__OperationUnit__Group__3__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1227:2: rule__OperationUnit__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OperationUnit__Group__3__Impl_in_rule__OperationUnit__Group__32450);
            rule__OperationUnit__Group__3__Impl();

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
    // $ANTLR end "rule__OperationUnit__Group__3"


    // $ANTLR start "rule__OperationUnit__Group__3__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1233:1: rule__OperationUnit__Group__3__Impl : ( ( rule__OperationUnit__Group_3__0 )? ) ;
    public final void rule__OperationUnit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1237:1: ( ( ( rule__OperationUnit__Group_3__0 )? ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1238:1: ( ( rule__OperationUnit__Group_3__0 )? )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1238:1: ( ( rule__OperationUnit__Group_3__0 )? )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1239:1: ( rule__OperationUnit__Group_3__0 )?
            {
             before(grammarAccess.getOperationUnitAccess().getGroup_3()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1240:1: ( rule__OperationUnit__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1240:2: rule__OperationUnit__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__OperationUnit__Group_3__0_in_rule__OperationUnit__Group__3__Impl2477);
                    rule__OperationUnit__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationUnitAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationUnit__Group__3__Impl"


    // $ANTLR start "rule__OperationUnit__Group_3__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1258:1: rule__OperationUnit__Group_3__0 : rule__OperationUnit__Group_3__0__Impl rule__OperationUnit__Group_3__1 ;
    public final void rule__OperationUnit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1262:1: ( rule__OperationUnit__Group_3__0__Impl rule__OperationUnit__Group_3__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1263:2: rule__OperationUnit__Group_3__0__Impl rule__OperationUnit__Group_3__1
            {
            pushFollow(FOLLOW_rule__OperationUnit__Group_3__0__Impl_in_rule__OperationUnit__Group_3__02516);
            rule__OperationUnit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationUnit__Group_3__1_in_rule__OperationUnit__Group_3__02519);
            rule__OperationUnit__Group_3__1();

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
    // $ANTLR end "rule__OperationUnit__Group_3__0"


    // $ANTLR start "rule__OperationUnit__Group_3__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1270:1: rule__OperationUnit__Group_3__0__Impl : ( 'controls' ) ;
    public final void rule__OperationUnit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1274:1: ( ( 'controls' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1275:1: ( 'controls' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1275:1: ( 'controls' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1276:1: 'controls'
            {
             before(grammarAccess.getOperationUnitAccess().getControlsKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__OperationUnit__Group_3__0__Impl2547); 
             after(grammarAccess.getOperationUnitAccess().getControlsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationUnit__Group_3__0__Impl"


    // $ANTLR start "rule__OperationUnit__Group_3__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1289:1: rule__OperationUnit__Group_3__1 : rule__OperationUnit__Group_3__1__Impl ;
    public final void rule__OperationUnit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1293:1: ( rule__OperationUnit__Group_3__1__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1294:2: rule__OperationUnit__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__OperationUnit__Group_3__1__Impl_in_rule__OperationUnit__Group_3__12578);
            rule__OperationUnit__Group_3__1__Impl();

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
    // $ANTLR end "rule__OperationUnit__Group_3__1"


    // $ANTLR start "rule__OperationUnit__Group_3__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1300:1: rule__OperationUnit__Group_3__1__Impl : ( ( rule__OperationUnit__ControlsAssignment_3_1 ) ) ;
    public final void rule__OperationUnit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1304:1: ( ( ( rule__OperationUnit__ControlsAssignment_3_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1305:1: ( ( rule__OperationUnit__ControlsAssignment_3_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1305:1: ( ( rule__OperationUnit__ControlsAssignment_3_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1306:1: ( rule__OperationUnit__ControlsAssignment_3_1 )
            {
             before(grammarAccess.getOperationUnitAccess().getControlsAssignment_3_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1307:1: ( rule__OperationUnit__ControlsAssignment_3_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1307:2: rule__OperationUnit__ControlsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__OperationUnit__ControlsAssignment_3_1_in_rule__OperationUnit__Group_3__1__Impl2605);
            rule__OperationUnit__ControlsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationUnitAccess().getControlsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationUnit__Group_3__1__Impl"


    // $ANTLR start "rule__ControlElement__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1321:1: rule__ControlElement__Group__0 : rule__ControlElement__Group__0__Impl rule__ControlElement__Group__1 ;
    public final void rule__ControlElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1325:1: ( rule__ControlElement__Group__0__Impl rule__ControlElement__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1326:2: rule__ControlElement__Group__0__Impl rule__ControlElement__Group__1
            {
            pushFollow(FOLLOW_rule__ControlElement__Group__0__Impl_in_rule__ControlElement__Group__02639);
            rule__ControlElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ControlElement__Group__1_in_rule__ControlElement__Group__02642);
            rule__ControlElement__Group__1();

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
    // $ANTLR end "rule__ControlElement__Group__0"


    // $ANTLR start "rule__ControlElement__Group__0__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1333:1: rule__ControlElement__Group__0__Impl : ( ( rule__ControlElement__ExpressionAssignment_0 ) ) ;
    public final void rule__ControlElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1337:1: ( ( ( rule__ControlElement__ExpressionAssignment_0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1338:1: ( ( rule__ControlElement__ExpressionAssignment_0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1338:1: ( ( rule__ControlElement__ExpressionAssignment_0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1339:1: ( rule__ControlElement__ExpressionAssignment_0 )
            {
             before(grammarAccess.getControlElementAccess().getExpressionAssignment_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1340:1: ( rule__ControlElement__ExpressionAssignment_0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1340:2: rule__ControlElement__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__ControlElement__ExpressionAssignment_0_in_rule__ControlElement__Group__0__Impl2669);
            rule__ControlElement__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getControlElementAccess().getExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlElement__Group__0__Impl"


    // $ANTLR start "rule__ControlElement__Group__1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1350:1: rule__ControlElement__Group__1 : rule__ControlElement__Group__1__Impl rule__ControlElement__Group__2 ;
    public final void rule__ControlElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1354:1: ( rule__ControlElement__Group__1__Impl rule__ControlElement__Group__2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1355:2: rule__ControlElement__Group__1__Impl rule__ControlElement__Group__2
            {
            pushFollow(FOLLOW_rule__ControlElement__Group__1__Impl_in_rule__ControlElement__Group__12699);
            rule__ControlElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ControlElement__Group__2_in_rule__ControlElement__Group__12702);
            rule__ControlElement__Group__2();

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
    // $ANTLR end "rule__ControlElement__Group__1"


    // $ANTLR start "rule__ControlElement__Group__1__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1362:1: rule__ControlElement__Group__1__Impl : ( '=>' ) ;
    public final void rule__ControlElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1366:1: ( ( '=>' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1367:1: ( '=>' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1367:1: ( '=>' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1368:1: '=>'
            {
             before(grammarAccess.getControlElementAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__ControlElement__Group__1__Impl2730); 
             after(grammarAccess.getControlElementAccess().getEqualsSignGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlElement__Group__1__Impl"


    // $ANTLR start "rule__ControlElement__Group__2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1381:1: rule__ControlElement__Group__2 : rule__ControlElement__Group__2__Impl ;
    public final void rule__ControlElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1385:1: ( rule__ControlElement__Group__2__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1386:2: rule__ControlElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ControlElement__Group__2__Impl_in_rule__ControlElement__Group__22761);
            rule__ControlElement__Group__2__Impl();

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
    // $ANTLR end "rule__ControlElement__Group__2"


    // $ANTLR start "rule__ControlElement__Group__2__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1392:1: rule__ControlElement__Group__2__Impl : ( ( rule__ControlElement__ControlStatementAssignment_2 ) ) ;
    public final void rule__ControlElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1396:1: ( ( ( rule__ControlElement__ControlStatementAssignment_2 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1397:1: ( ( rule__ControlElement__ControlStatementAssignment_2 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1397:1: ( ( rule__ControlElement__ControlStatementAssignment_2 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1398:1: ( rule__ControlElement__ControlStatementAssignment_2 )
            {
             before(grammarAccess.getControlElementAccess().getControlStatementAssignment_2()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1399:1: ( rule__ControlElement__ControlStatementAssignment_2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1399:2: rule__ControlElement__ControlStatementAssignment_2
            {
            pushFollow(FOLLOW_rule__ControlElement__ControlStatementAssignment_2_in_rule__ControlElement__Group__2__Impl2788);
            rule__ControlElement__ControlStatementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getControlElementAccess().getControlStatementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlElement__Group__2__Impl"


    // $ANTLR start "rule__ExpressionElement__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1415:1: rule__ExpressionElement__Group__0 : rule__ExpressionElement__Group__0__Impl rule__ExpressionElement__Group__1 ;
    public final void rule__ExpressionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1419:1: ( rule__ExpressionElement__Group__0__Impl rule__ExpressionElement__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1420:2: rule__ExpressionElement__Group__0__Impl rule__ExpressionElement__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionElement__Group__0__Impl_in_rule__ExpressionElement__Group__02824);
            rule__ExpressionElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionElement__Group__1_in_rule__ExpressionElement__Group__02827);
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1427:1: rule__ExpressionElement__Group__0__Impl : ( ( rule__ExpressionElement__ParameterAssignment_0 ) ) ;
    public final void rule__ExpressionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1431:1: ( ( ( rule__ExpressionElement__ParameterAssignment_0 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1432:1: ( ( rule__ExpressionElement__ParameterAssignment_0 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1432:1: ( ( rule__ExpressionElement__ParameterAssignment_0 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1433:1: ( rule__ExpressionElement__ParameterAssignment_0 )
            {
             before(grammarAccess.getExpressionElementAccess().getParameterAssignment_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1434:1: ( rule__ExpressionElement__ParameterAssignment_0 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1434:2: rule__ExpressionElement__ParameterAssignment_0
            {
            pushFollow(FOLLOW_rule__ExpressionElement__ParameterAssignment_0_in_rule__ExpressionElement__Group__0__Impl2854);
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1444:1: rule__ExpressionElement__Group__1 : rule__ExpressionElement__Group__1__Impl rule__ExpressionElement__Group__2 ;
    public final void rule__ExpressionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1448:1: ( rule__ExpressionElement__Group__1__Impl rule__ExpressionElement__Group__2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1449:2: rule__ExpressionElement__Group__1__Impl rule__ExpressionElement__Group__2
            {
            pushFollow(FOLLOW_rule__ExpressionElement__Group__1__Impl_in_rule__ExpressionElement__Group__12884);
            rule__ExpressionElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionElement__Group__2_in_rule__ExpressionElement__Group__12887);
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1456:1: rule__ExpressionElement__Group__1__Impl : ( ( rule__ExpressionElement__OperatorAssignment_1 ) ) ;
    public final void rule__ExpressionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1460:1: ( ( ( rule__ExpressionElement__OperatorAssignment_1 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1461:1: ( ( rule__ExpressionElement__OperatorAssignment_1 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1461:1: ( ( rule__ExpressionElement__OperatorAssignment_1 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1462:1: ( rule__ExpressionElement__OperatorAssignment_1 )
            {
             before(grammarAccess.getExpressionElementAccess().getOperatorAssignment_1()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1463:1: ( rule__ExpressionElement__OperatorAssignment_1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1463:2: rule__ExpressionElement__OperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__ExpressionElement__OperatorAssignment_1_in_rule__ExpressionElement__Group__1__Impl2914);
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1473:1: rule__ExpressionElement__Group__2 : rule__ExpressionElement__Group__2__Impl ;
    public final void rule__ExpressionElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1477:1: ( rule__ExpressionElement__Group__2__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1478:2: rule__ExpressionElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionElement__Group__2__Impl_in_rule__ExpressionElement__Group__22944);
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1484:1: rule__ExpressionElement__Group__2__Impl : ( ( rule__ExpressionElement__RightAssignment_2 ) ) ;
    public final void rule__ExpressionElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1488:1: ( ( ( rule__ExpressionElement__RightAssignment_2 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1489:1: ( ( rule__ExpressionElement__RightAssignment_2 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1489:1: ( ( rule__ExpressionElement__RightAssignment_2 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1490:1: ( rule__ExpressionElement__RightAssignment_2 )
            {
             before(grammarAccess.getExpressionElementAccess().getRightAssignment_2()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1491:1: ( rule__ExpressionElement__RightAssignment_2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1491:2: rule__ExpressionElement__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__ExpressionElement__RightAssignment_2_in_rule__ExpressionElement__Group__2__Impl2971);
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


    // $ANTLR start "rule__ControlStatementElement__Group__0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1507:1: rule__ControlStatementElement__Group__0 : rule__ControlStatementElement__Group__0__Impl rule__ControlStatementElement__Group__1 ;
    public final void rule__ControlStatementElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1511:1: ( rule__ControlStatementElement__Group__0__Impl rule__ControlStatementElement__Group__1 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1512:2: rule__ControlStatementElement__Group__0__Impl rule__ControlStatementElement__Group__1
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__Group__0__Impl_in_rule__ControlStatementElement__Group__03007);
            rule__ControlStatementElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ControlStatementElement__Group__1_in_rule__ControlStatementElement__Group__03010);
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1519:1: rule__ControlStatementElement__Group__0__Impl : ( 'Error' ) ;
    public final void rule__ControlStatementElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1523:1: ( ( 'Error' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1524:1: ( 'Error' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1524:1: ( 'Error' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1525:1: 'Error'
            {
             before(grammarAccess.getControlStatementElementAccess().getErrorKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ControlStatementElement__Group__0__Impl3038); 
             after(grammarAccess.getControlStatementElementAccess().getErrorKeyword_0()); 

            }


            }

        }
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1538:1: rule__ControlStatementElement__Group__1 : rule__ControlStatementElement__Group__1__Impl rule__ControlStatementElement__Group__2 ;
    public final void rule__ControlStatementElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1542:1: ( rule__ControlStatementElement__Group__1__Impl rule__ControlStatementElement__Group__2 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1543:2: rule__ControlStatementElement__Group__1__Impl rule__ControlStatementElement__Group__2
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__Group__1__Impl_in_rule__ControlStatementElement__Group__13069);
            rule__ControlStatementElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ControlStatementElement__Group__2_in_rule__ControlStatementElement__Group__13072);
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1550:1: rule__ControlStatementElement__Group__1__Impl : ( '(' ) ;
    public final void rule__ControlStatementElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1554:1: ( ( '(' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1555:1: ( '(' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1555:1: ( '(' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1556:1: '('
            {
             before(grammarAccess.getControlStatementElementAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__ControlStatementElement__Group__1__Impl3100); 
             after(grammarAccess.getControlStatementElementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1569:1: rule__ControlStatementElement__Group__2 : rule__ControlStatementElement__Group__2__Impl rule__ControlStatementElement__Group__3 ;
    public final void rule__ControlStatementElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1573:1: ( rule__ControlStatementElement__Group__2__Impl rule__ControlStatementElement__Group__3 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1574:2: rule__ControlStatementElement__Group__2__Impl rule__ControlStatementElement__Group__3
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__Group__2__Impl_in_rule__ControlStatementElement__Group__23131);
            rule__ControlStatementElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ControlStatementElement__Group__3_in_rule__ControlStatementElement__Group__23134);
            rule__ControlStatementElement__Group__3();

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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1581:1: rule__ControlStatementElement__Group__2__Impl : ( '\"' ) ;
    public final void rule__ControlStatementElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1585:1: ( ( '\"' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1586:1: ( '\"' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1586:1: ( '\"' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1587:1: '\"'
            {
             before(grammarAccess.getControlStatementElementAccess().getQuotationMarkKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__ControlStatementElement__Group__2__Impl3162); 
             after(grammarAccess.getControlStatementElementAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ControlStatementElement__Group__3"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1600:1: rule__ControlStatementElement__Group__3 : rule__ControlStatementElement__Group__3__Impl rule__ControlStatementElement__Group__4 ;
    public final void rule__ControlStatementElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1604:1: ( rule__ControlStatementElement__Group__3__Impl rule__ControlStatementElement__Group__4 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1605:2: rule__ControlStatementElement__Group__3__Impl rule__ControlStatementElement__Group__4
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__Group__3__Impl_in_rule__ControlStatementElement__Group__33193);
            rule__ControlStatementElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ControlStatementElement__Group__4_in_rule__ControlStatementElement__Group__33196);
            rule__ControlStatementElement__Group__4();

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
    // $ANTLR end "rule__ControlStatementElement__Group__3"


    // $ANTLR start "rule__ControlStatementElement__Group__3__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1612:1: rule__ControlStatementElement__Group__3__Impl : ( ( rule__ControlStatementElement__MessageAssignment_3 ) ) ;
    public final void rule__ControlStatementElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1616:1: ( ( ( rule__ControlStatementElement__MessageAssignment_3 ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1617:1: ( ( rule__ControlStatementElement__MessageAssignment_3 ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1617:1: ( ( rule__ControlStatementElement__MessageAssignment_3 ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1618:1: ( rule__ControlStatementElement__MessageAssignment_3 )
            {
             before(grammarAccess.getControlStatementElementAccess().getMessageAssignment_3()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1619:1: ( rule__ControlStatementElement__MessageAssignment_3 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1619:2: rule__ControlStatementElement__MessageAssignment_3
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__MessageAssignment_3_in_rule__ControlStatementElement__Group__3__Impl3223);
            rule__ControlStatementElement__MessageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getControlStatementElementAccess().getMessageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlStatementElement__Group__3__Impl"


    // $ANTLR start "rule__ControlStatementElement__Group__4"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1629:1: rule__ControlStatementElement__Group__4 : rule__ControlStatementElement__Group__4__Impl rule__ControlStatementElement__Group__5 ;
    public final void rule__ControlStatementElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1633:1: ( rule__ControlStatementElement__Group__4__Impl rule__ControlStatementElement__Group__5 )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1634:2: rule__ControlStatementElement__Group__4__Impl rule__ControlStatementElement__Group__5
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__Group__4__Impl_in_rule__ControlStatementElement__Group__43253);
            rule__ControlStatementElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ControlStatementElement__Group__5_in_rule__ControlStatementElement__Group__43256);
            rule__ControlStatementElement__Group__5();

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
    // $ANTLR end "rule__ControlStatementElement__Group__4"


    // $ANTLR start "rule__ControlStatementElement__Group__4__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1641:1: rule__ControlStatementElement__Group__4__Impl : ( '\"' ) ;
    public final void rule__ControlStatementElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1645:1: ( ( '\"' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1646:1: ( '\"' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1646:1: ( '\"' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1647:1: '\"'
            {
             before(grammarAccess.getControlStatementElementAccess().getQuotationMarkKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__ControlStatementElement__Group__4__Impl3284); 
             after(grammarAccess.getControlStatementElementAccess().getQuotationMarkKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlStatementElement__Group__4__Impl"


    // $ANTLR start "rule__ControlStatementElement__Group__5"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1660:1: rule__ControlStatementElement__Group__5 : rule__ControlStatementElement__Group__5__Impl ;
    public final void rule__ControlStatementElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1664:1: ( rule__ControlStatementElement__Group__5__Impl )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1665:2: rule__ControlStatementElement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ControlStatementElement__Group__5__Impl_in_rule__ControlStatementElement__Group__53315);
            rule__ControlStatementElement__Group__5__Impl();

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
    // $ANTLR end "rule__ControlStatementElement__Group__5"


    // $ANTLR start "rule__ControlStatementElement__Group__5__Impl"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1671:1: rule__ControlStatementElement__Group__5__Impl : ( ')' ) ;
    public final void rule__ControlStatementElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1675:1: ( ( ')' ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1676:1: ( ')' )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1676:1: ( ')' )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1677:1: ')'
            {
             before(grammarAccess.getControlStatementElementAccess().getRightParenthesisKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__ControlStatementElement__Group__5__Impl3343); 
             after(grammarAccess.getControlStatementElementAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlStatementElement__Group__5__Impl"


    // $ANTLR start "rule__Product__ElementsAssignment"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1703:1: rule__Product__ElementsAssignment : ( ruleCompilationUnit ) ;
    public final void rule__Product__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1707:1: ( ( ruleCompilationUnit ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1708:1: ( ruleCompilationUnit )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1708:1: ( ruleCompilationUnit )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1709:1: ruleCompilationUnit
            {
             before(grammarAccess.getProductAccess().getElementsCompilationUnitParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCompilationUnit_in_rule__Product__ElementsAssignment3391);
            ruleCompilationUnit();

            state._fsp--;

             after(grammarAccess.getProductAccess().getElementsCompilationUnitParserRuleCall_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__CompilationUnit__NamespaceUnitAssignment_0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1718:1: rule__CompilationUnit__NamespaceUnitAssignment_0 : ( ruleNamespaceUnit ) ;
    public final void rule__CompilationUnit__NamespaceUnitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1722:1: ( ( ruleNamespaceUnit ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1723:1: ( ruleNamespaceUnit )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1723:1: ( ruleNamespaceUnit )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1724:1: ruleNamespaceUnit
            {
             before(grammarAccess.getCompilationUnitAccess().getNamespaceUnitNamespaceUnitParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNamespaceUnit_in_rule__CompilationUnit__NamespaceUnitAssignment_03422);
            ruleNamespaceUnit();

            state._fsp--;

             after(grammarAccess.getCompilationUnitAccess().getNamespaceUnitNamespaceUnitParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__NamespaceUnitAssignment_0"


    // $ANTLR start "rule__CompilationUnit__UseUnitAssignment_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1733:1: rule__CompilationUnit__UseUnitAssignment_1 : ( ruleUseUnit ) ;
    public final void rule__CompilationUnit__UseUnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1737:1: ( ( ruleUseUnit ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1738:1: ( ruleUseUnit )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1738:1: ( ruleUseUnit )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1739:1: ruleUseUnit
            {
             before(grammarAccess.getCompilationUnitAccess().getUseUnitUseUnitParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUseUnit_in_rule__CompilationUnit__UseUnitAssignment_13453);
            ruleUseUnit();

            state._fsp--;

             after(grammarAccess.getCompilationUnitAccess().getUseUnitUseUnitParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__UseUnitAssignment_1"


    // $ANTLR start "rule__CompilationUnit__ProductUnitAssignment_2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1748:1: rule__CompilationUnit__ProductUnitAssignment_2 : ( ruleProductUnit ) ;
    public final void rule__CompilationUnit__ProductUnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1752:1: ( ( ruleProductUnit ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1753:1: ( ruleProductUnit )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1753:1: ( ruleProductUnit )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1754:1: ruleProductUnit
            {
             before(grammarAccess.getCompilationUnitAccess().getProductUnitProductUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProductUnit_in_rule__CompilationUnit__ProductUnitAssignment_23484);
            ruleProductUnit();

            state._fsp--;

             after(grammarAccess.getCompilationUnitAccess().getProductUnitProductUnitParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__ProductUnitAssignment_2"


    // $ANTLR start "rule__UseUnit__ProductUnitAssignment_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1763:1: rule__UseUnit__ProductUnitAssignment_1 : ( ( ruleQUALIFIEDID ) ) ;
    public final void rule__UseUnit__ProductUnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1767:1: ( ( ( ruleQUALIFIEDID ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1768:1: ( ( ruleQUALIFIEDID ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1768:1: ( ( ruleQUALIFIEDID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1769:1: ( ruleQUALIFIEDID )
            {
             before(grammarAccess.getUseUnitAccess().getProductUnitEProductUnitCrossReference_1_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1770:1: ( ruleQUALIFIEDID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1771:1: ruleQUALIFIEDID
            {
             before(grammarAccess.getUseUnitAccess().getProductUnitEProductUnitQUALIFIEDIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_rule__UseUnit__ProductUnitAssignment_13519);
            ruleQUALIFIEDID();

            state._fsp--;

             after(grammarAccess.getUseUnitAccess().getProductUnitEProductUnitQUALIFIEDIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUseUnitAccess().getProductUnitEProductUnitCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseUnit__ProductUnitAssignment_1"


    // $ANTLR start "rule__NamespaceUnit__NameAssignment_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1782:1: rule__NamespaceUnit__NameAssignment_1 : ( ruleQUALIFIEDID ) ;
    public final void rule__NamespaceUnit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1786:1: ( ( ruleQUALIFIEDID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1787:1: ( ruleQUALIFIEDID )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1787:1: ( ruleQUALIFIEDID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1788:1: ruleQUALIFIEDID
            {
             before(grammarAccess.getNamespaceUnitAccess().getNameQUALIFIEDIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_rule__NamespaceUnit__NameAssignment_13554);
            ruleQUALIFIEDID();

            state._fsp--;

             after(grammarAccess.getNamespaceUnitAccess().getNameQUALIFIEDIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceUnit__NameAssignment_1"


    // $ANTLR start "rule__ProductUnit__NameAssignment_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1797:1: rule__ProductUnit__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProductUnit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1801:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1802:1: ( RULE_ID )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1802:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1803:1: RULE_ID
            {
             before(grammarAccess.getProductUnitAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProductUnit__NameAssignment_13585); 
             after(grammarAccess.getProductUnitAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductUnit__NameAssignment_1"


    // $ANTLR start "rule__ProductUnit__ParametersAssignment_2_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1812:1: rule__ProductUnit__ParametersAssignment_2_1 : ( ruleParameterElement ) ;
    public final void rule__ProductUnit__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1816:1: ( ( ruleParameterElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1817:1: ( ruleParameterElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1817:1: ( ruleParameterElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1818:1: ruleParameterElement
            {
             before(grammarAccess.getProductUnitAccess().getParametersParameterElementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameterElement_in_rule__ProductUnit__ParametersAssignment_2_13616);
            ruleParameterElement();

            state._fsp--;

             after(grammarAccess.getProductUnitAccess().getParametersParameterElementParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductUnit__ParametersAssignment_2_1"


    // $ANTLR start "rule__ProductUnit__OperationUnitAssignment_3"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1827:1: rule__ProductUnit__OperationUnitAssignment_3 : ( ruleOperationUnit ) ;
    public final void rule__ProductUnit__OperationUnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1831:1: ( ( ruleOperationUnit ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1832:1: ( ruleOperationUnit )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1832:1: ( ruleOperationUnit )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1833:1: ruleOperationUnit
            {
             before(grammarAccess.getProductUnitAccess().getOperationUnitOperationUnitParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOperationUnit_in_rule__ProductUnit__OperationUnitAssignment_33647);
            ruleOperationUnit();

            state._fsp--;

             after(grammarAccess.getProductUnitAccess().getOperationUnitOperationUnitParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductUnit__OperationUnitAssignment_3"


    // $ANTLR start "rule__ParameterElement__NameAssignment_0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1842:1: rule__ParameterElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ParameterElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1846:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1847:1: ( RULE_ID )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1847:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1848:1: RULE_ID
            {
             before(grammarAccess.getParameterElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterElement__NameAssignment_03678); 
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1857:1: rule__ParameterElement__TypeAssignment_1_1 : ( ruleUMAPDataTypes ) ;
    public final void rule__ParameterElement__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1861:1: ( ( ruleUMAPDataTypes ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1862:1: ( ruleUMAPDataTypes )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1862:1: ( ruleUMAPDataTypes )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1863:1: ruleUMAPDataTypes
            {
             before(grammarAccess.getParameterElementAccess().getTypeUMAPDataTypesEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleUMAPDataTypes_in_rule__ParameterElement__TypeAssignment_1_13709);
            ruleUMAPDataTypes();

            state._fsp--;

             after(grammarAccess.getParameterElementAccess().getTypeUMAPDataTypesEnumRuleCall_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__OperationUnit__NameAssignment_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1872:1: rule__OperationUnit__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OperationUnit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1876:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1877:1: ( RULE_ID )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1877:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1878:1: RULE_ID
            {
             before(grammarAccess.getOperationUnitAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OperationUnit__NameAssignment_13740); 
             after(grammarAccess.getOperationUnitAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationUnit__NameAssignment_1"


    // $ANTLR start "rule__OperationUnit__ControlsAssignment_3_1"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1887:1: rule__OperationUnit__ControlsAssignment_3_1 : ( ruleControlElement ) ;
    public final void rule__OperationUnit__ControlsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1891:1: ( ( ruleControlElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1892:1: ( ruleControlElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1892:1: ( ruleControlElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1893:1: ruleControlElement
            {
             before(grammarAccess.getOperationUnitAccess().getControlsControlElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleControlElement_in_rule__OperationUnit__ControlsAssignment_3_13771);
            ruleControlElement();

            state._fsp--;

             after(grammarAccess.getOperationUnitAccess().getControlsControlElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationUnit__ControlsAssignment_3_1"


    // $ANTLR start "rule__ControlElement__ExpressionAssignment_0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1902:1: rule__ControlElement__ExpressionAssignment_0 : ( ruleExpressionElement ) ;
    public final void rule__ControlElement__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1906:1: ( ( ruleExpressionElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1907:1: ( ruleExpressionElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1907:1: ( ruleExpressionElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1908:1: ruleExpressionElement
            {
             before(grammarAccess.getControlElementAccess().getExpressionExpressionElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpressionElement_in_rule__ControlElement__ExpressionAssignment_03802);
            ruleExpressionElement();

            state._fsp--;

             after(grammarAccess.getControlElementAccess().getExpressionExpressionElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlElement__ExpressionAssignment_0"


    // $ANTLR start "rule__ControlElement__ControlStatementAssignment_2"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1917:1: rule__ControlElement__ControlStatementAssignment_2 : ( ruleControlStatementElement ) ;
    public final void rule__ControlElement__ControlStatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1921:1: ( ( ruleControlStatementElement ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1922:1: ( ruleControlStatementElement )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1922:1: ( ruleControlStatementElement )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1923:1: ruleControlStatementElement
            {
             before(grammarAccess.getControlElementAccess().getControlStatementControlStatementElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleControlStatementElement_in_rule__ControlElement__ControlStatementAssignment_23833);
            ruleControlStatementElement();

            state._fsp--;

             after(grammarAccess.getControlElementAccess().getControlStatementControlStatementElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlElement__ControlStatementAssignment_2"


    // $ANTLR start "rule__ExpressionElement__ParameterAssignment_0"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1932:1: rule__ExpressionElement__ParameterAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ExpressionElement__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1936:1: ( ( ( RULE_ID ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1937:1: ( ( RULE_ID ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1937:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1938:1: ( RULE_ID )
            {
             before(grammarAccess.getExpressionElementAccess().getParameterEParameterElementCrossReference_0_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1939:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1940:1: RULE_ID
            {
             before(grammarAccess.getExpressionElementAccess().getParameterEParameterElementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExpressionElement__ParameterAssignment_03868); 
             after(grammarAccess.getExpressionElementAccess().getParameterEParameterElementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getExpressionElementAccess().getParameterEParameterElementCrossReference_0_0()); 

            }


            }

        }
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1951:1: rule__ExpressionElement__OperatorAssignment_1 : ( ruleOPERATORS ) ;
    public final void rule__ExpressionElement__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1955:1: ( ( ruleOPERATORS ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1956:1: ( ruleOPERATORS )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1956:1: ( ruleOPERATORS )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1957:1: ruleOPERATORS
            {
             before(grammarAccess.getExpressionElementAccess().getOperatorOPERATORSEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOPERATORS_in_rule__ExpressionElement__OperatorAssignment_13903);
            ruleOPERATORS();

            state._fsp--;

             after(grammarAccess.getExpressionElementAccess().getOperatorOPERATORSEnumRuleCall_1_0()); 

            }


            }

        }
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
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1966:1: rule__ExpressionElement__RightAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ExpressionElement__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1970:1: ( ( ( RULE_ID ) ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1971:1: ( ( RULE_ID ) )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1971:1: ( ( RULE_ID ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1972:1: ( RULE_ID )
            {
             before(grammarAccess.getExpressionElementAccess().getRightEOperationUnitCrossReference_2_0()); 
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1973:1: ( RULE_ID )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1974:1: RULE_ID
            {
             before(grammarAccess.getExpressionElementAccess().getRightEOperationUnitIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExpressionElement__RightAssignment_23938); 
             after(grammarAccess.getExpressionElementAccess().getRightEOperationUnitIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getExpressionElementAccess().getRightEOperationUnitCrossReference_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ControlStatementElement__MessageAssignment_3"
    // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1985:1: rule__ControlStatementElement__MessageAssignment_3 : ( RULE_ANY_OTHER ) ;
    public final void rule__ControlStatementElement__MessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1989:1: ( ( RULE_ANY_OTHER ) )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1990:1: ( RULE_ANY_OTHER )
            {
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1990:1: ( RULE_ANY_OTHER )
            // ../com.ykb.umap.dsl.ui/src-gen/com/ykb/umap/dsl/ui/contentassist/antlr/internal/InternalProduct.g:1991:1: RULE_ANY_OTHER
            {
             before(grammarAccess.getControlStatementElementAccess().getMessageANY_OTHERTerminalRuleCall_3_0()); 
            match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__ControlStatementElement__MessageAssignment_33973); 
             after(grammarAccess.getControlStatementElementAccess().getMessageANY_OTHERTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlStatementElement__MessageAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__ElementsAssignment_in_ruleProduct94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilationUnit128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompilationUnit__Group__0_in_ruleCompilationUnit154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseUnit_in_entryRuleUseUnit181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseUnit188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseUnit__Group__0_in_ruleUseUnit214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceUnit_in_entryRuleNamespaceUnit241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceUnit248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceUnit__Group__0_in_ruleNamespaceUnit274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_entryRuleQUALIFIEDID301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIEDID308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group__0_in_ruleQUALIFIEDID334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProductUnit_in_entryRuleProductUnit361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProductUnit368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductUnit__Group__0_in_ruleProductUnit394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElement_in_entryRuleParameterElement421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterElement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group__0_in_ruleParameterElement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationUnit_in_entryRuleOperationUnit481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationUnit488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationUnit__Group__0_in_ruleOperationUnit514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlElement_in_entryRuleControlElement541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlElement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlElement__Group__0_in_ruleControlElement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionElement608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__Group__0_in_ruleExpressionElement634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlStatementElement_in_entryRuleControlStatementElement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlStatementElement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__0_in_ruleControlStatementElement694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UMAPDataTypes__Alternatives_in_ruleUMAPDataTypes731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OPERATORS__Alternatives_in_ruleOPERATORS767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__UMAPDataTypes__Alternatives803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__UMAPDataTypes__Alternatives824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UMAPDataTypes__Alternatives845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UMAPDataTypes__Alternatives866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__UMAPDataTypes__Alternatives887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__OPERATORS__Alternatives923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__OPERATORS__Alternatives944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompilationUnit__Group__0__Impl_in_rule__CompilationUnit__Group__0977 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__CompilationUnit__Group__1_in_rule__CompilationUnit__Group__0980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompilationUnit__NamespaceUnitAssignment_0_in_rule__CompilationUnit__Group__0__Impl1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompilationUnit__Group__1__Impl_in_rule__CompilationUnit__Group__11037 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__CompilationUnit__Group__2_in_rule__CompilationUnit__Group__11040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompilationUnit__UseUnitAssignment_1_in_rule__CompilationUnit__Group__1__Impl1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompilationUnit__Group__2__Impl_in_rule__CompilationUnit__Group__21098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompilationUnit__ProductUnitAssignment_2_in_rule__CompilationUnit__Group__2__Impl1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseUnit__Group__0__Impl_in_rule__UseUnit__Group__01161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseUnit__Group__1_in_rule__UseUnit__Group__01164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__UseUnit__Group__0__Impl1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseUnit__Group__1__Impl_in_rule__UseUnit__Group__11223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseUnit__ProductUnitAssignment_1_in_rule__UseUnit__Group__1__Impl1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceUnit__Group__0__Impl_in_rule__NamespaceUnit__Group__01284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamespaceUnit__Group__1_in_rule__NamespaceUnit__Group__01287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NamespaceUnit__Group__0__Impl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceUnit__Group__1__Impl_in_rule__NamespaceUnit__Group__11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceUnit__NameAssignment_1_in_rule__NamespaceUnit__Group__1__Impl1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group__0__Impl_in_rule__QUALIFIEDID__Group__01407 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group__1_in_rule__QUALIFIEDID__Group__01410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIEDID__Group__0__Impl1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group__1__Impl_in_rule__QUALIFIEDID__Group__11466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group_1__0_in_rule__QUALIFIEDID__Group__1__Impl1493 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group_1__0__Impl_in_rule__QUALIFIEDID__Group_1__01528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group_1__1_in_rule__QUALIFIEDID__Group_1__01531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QUALIFIEDID__Group_1__0__Impl1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group_1__1__Impl_in_rule__QUALIFIEDID__Group_1__11590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIEDID__Group_1__1__Impl1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductUnit__Group__0__Impl_in_rule__ProductUnit__Group__01650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProductUnit__Group__1_in_rule__ProductUnit__Group__01653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ProductUnit__Group__0__Impl1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductUnit__Group__1__Impl_in_rule__ProductUnit__Group__11712 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ProductUnit__Group__2_in_rule__ProductUnit__Group__11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductUnit__NameAssignment_1_in_rule__ProductUnit__Group__1__Impl1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductUnit__Group__2__Impl_in_rule__ProductUnit__Group__21772 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ProductUnit__Group__3_in_rule__ProductUnit__Group__21775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductUnit__Group_2__0_in_rule__ProductUnit__Group__2__Impl1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductUnit__Group__3__Impl_in_rule__ProductUnit__Group__31832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductUnit__OperationUnitAssignment_3_in_rule__ProductUnit__Group__3__Impl1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductUnit__Group_2__0__Impl_in_rule__ProductUnit__Group_2__01897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProductUnit__Group_2__1_in_rule__ProductUnit__Group_2__01900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ProductUnit__Group_2__0__Impl1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductUnit__Group_2__1__Impl_in_rule__ProductUnit__Group_2__11959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductUnit__ParametersAssignment_2_1_in_rule__ProductUnit__Group_2__1__Impl1986 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group__0__Impl_in_rule__ParameterElement__Group__02021 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group__1_in_rule__ParameterElement__Group__02024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__NameAssignment_0_in_rule__ParameterElement__Group__0__Impl2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group__1__Impl_in_rule__ParameterElement__Group__12081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__0_in_rule__ParameterElement__Group__1__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__0__Impl_in_rule__ParameterElement__Group_1__02143 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__1_in_rule__ParameterElement__Group_1__02146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ParameterElement__Group_1__0__Impl2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__1__Impl_in_rule__ParameterElement__Group_1__12205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__TypeAssignment_1_1_in_rule__ParameterElement__Group_1__1__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationUnit__Group__0__Impl_in_rule__OperationUnit__Group__02266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OperationUnit__Group__1_in_rule__OperationUnit__Group__02269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__OperationUnit__Group__0__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationUnit__Group__1__Impl_in_rule__OperationUnit__Group__12328 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__OperationUnit__Group__2_in_rule__OperationUnit__Group__12331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationUnit__NameAssignment_1_in_rule__OperationUnit__Group__1__Impl2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationUnit__Group__2__Impl_in_rule__OperationUnit__Group__22388 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__OperationUnit__Group__3_in_rule__OperationUnit__Group__22391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__OperationUnit__Group__2__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationUnit__Group__3__Impl_in_rule__OperationUnit__Group__32450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationUnit__Group_3__0_in_rule__OperationUnit__Group__3__Impl2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationUnit__Group_3__0__Impl_in_rule__OperationUnit__Group_3__02516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OperationUnit__Group_3__1_in_rule__OperationUnit__Group_3__02519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__OperationUnit__Group_3__0__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationUnit__Group_3__1__Impl_in_rule__OperationUnit__Group_3__12578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationUnit__ControlsAssignment_3_1_in_rule__OperationUnit__Group_3__1__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlElement__Group__0__Impl_in_rule__ControlElement__Group__02639 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ControlElement__Group__1_in_rule__ControlElement__Group__02642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlElement__ExpressionAssignment_0_in_rule__ControlElement__Group__0__Impl2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlElement__Group__1__Impl_in_rule__ControlElement__Group__12699 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ControlElement__Group__2_in_rule__ControlElement__Group__12702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ControlElement__Group__1__Impl2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlElement__Group__2__Impl_in_rule__ControlElement__Group__22761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlElement__ControlStatementAssignment_2_in_rule__ControlElement__Group__2__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__Group__0__Impl_in_rule__ExpressionElement__Group__02824 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__ExpressionElement__Group__1_in_rule__ExpressionElement__Group__02827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__ParameterAssignment_0_in_rule__ExpressionElement__Group__0__Impl2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__Group__1__Impl_in_rule__ExpressionElement__Group__12884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExpressionElement__Group__2_in_rule__ExpressionElement__Group__12887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__OperatorAssignment_1_in_rule__ExpressionElement__Group__1__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__Group__2__Impl_in_rule__ExpressionElement__Group__22944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionElement__RightAssignment_2_in_rule__ExpressionElement__Group__2__Impl2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__0__Impl_in_rule__ControlStatementElement__Group__03007 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__1_in_rule__ControlStatementElement__Group__03010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ControlStatementElement__Group__0__Impl3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__1__Impl_in_rule__ControlStatementElement__Group__13069 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__2_in_rule__ControlStatementElement__Group__13072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ControlStatementElement__Group__1__Impl3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__2__Impl_in_rule__ControlStatementElement__Group__23131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__3_in_rule__ControlStatementElement__Group__23134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ControlStatementElement__Group__2__Impl3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__3__Impl_in_rule__ControlStatementElement__Group__33193 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__4_in_rule__ControlStatementElement__Group__33196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__MessageAssignment_3_in_rule__ControlStatementElement__Group__3__Impl3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__4__Impl_in_rule__ControlStatementElement__Group__43253 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__5_in_rule__ControlStatementElement__Group__43256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ControlStatementElement__Group__4__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ControlStatementElement__Group__5__Impl_in_rule__ControlStatementElement__Group__53315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ControlStatementElement__Group__5__Impl3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilationUnit_in_rule__Product__ElementsAssignment3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceUnit_in_rule__CompilationUnit__NamespaceUnitAssignment_03422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseUnit_in_rule__CompilationUnit__UseUnitAssignment_13453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProductUnit_in_rule__CompilationUnit__ProductUnitAssignment_23484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_rule__UseUnit__ProductUnitAssignment_13519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_rule__NamespaceUnit__NameAssignment_13554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProductUnit__NameAssignment_13585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElement_in_rule__ProductUnit__ParametersAssignment_2_13616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationUnit_in_rule__ProductUnit__OperationUnitAssignment_33647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterElement__NameAssignment_03678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUMAPDataTypes_in_rule__ParameterElement__TypeAssignment_1_13709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OperationUnit__NameAssignment_13740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlElement_in_rule__OperationUnit__ControlsAssignment_3_13771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionElement_in_rule__ControlElement__ExpressionAssignment_03802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlStatementElement_in_rule__ControlElement__ControlStatementAssignment_23833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExpressionElement__ParameterAssignment_03868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATORS_in_rule__ExpressionElement__OperatorAssignment_13903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExpressionElement__RightAssignment_23938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__ControlStatementElement__MessageAssignment_33973 = new BitSet(new long[]{0x0000000000000002L});

}