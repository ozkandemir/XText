/*
* generated by Xtext
*/
package com.ykb.umap.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.ykb.umap.dsl.services.ProductGrammarAccess;

public class ProductParser extends AbstractContentAssistParser {
	
	@Inject
	private ProductGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.ykb.umap.dsl.ui.contentassist.antlr.internal.InternalProductParser createParser() {
		com.ykb.umap.dsl.ui.contentassist.antlr.internal.InternalProductParser result = new com.ykb.umap.dsl.ui.contentassist.antlr.internal.InternalProductParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getParameterElementAccess().getTypeAlternatives_1_1_0(), "rule__ParameterElement__TypeAlternatives_1_1_0");
					put(grammarAccess.getExpressionElementAccess().getOperatorAlternatives_1_0(), "rule__ExpressionElement__OperatorAlternatives_1_0");
					put(grammarAccess.getExpressionElementAccess().getRightAlternatives_2_0(), "rule__ExpressionElement__RightAlternatives_2_0");
					put(grammarAccess.getStaticOperationElementAccess().getOpNameAlternatives_0(), "rule__StaticOperationElement__OpNameAlternatives_0");
					put(grammarAccess.getOperatorElementAccess().getAlternatives(), "rule__OperatorElement__Alternatives");
					put(grammarAccess.getAbstractElementAccess().getGroup(), "rule__AbstractElement__Group__0");
					put(grammarAccess.getNamespaceElementAccess().getGroup(), "rule__NamespaceElement__Group__0");
					put(grammarAccess.getProductElementAccess().getGroup(), "rule__ProductElement__Group__0");
					put(grammarAccess.getProductElementAccess().getGroup_2(), "rule__ProductElement__Group_2__0");
					put(grammarAccess.getParameterElementAccess().getGroup(), "rule__ParameterElement__Group__0");
					put(grammarAccess.getParameterElementAccess().getGroup_1(), "rule__ParameterElement__Group_1__0");
					put(grammarAccess.getOperationElementAccess().getGroup(), "rule__OperationElement__Group__0");
					put(grammarAccess.getControlBlockElementAccess().getGroup(), "rule__ControlBlockElement__Group__0");
					put(grammarAccess.getControlStatementElementAccess().getGroup(), "rule__ControlStatementElement__Group__0");
					put(grammarAccess.getExpressionElementAccess().getGroup(), "rule__ExpressionElement__Group__0");
					put(grammarAccess.getQualifiedIDAccess().getGroup(), "rule__QualifiedID__Group__0");
					put(grammarAccess.getQualifiedIDAccess().getGroup_1(), "rule__QualifiedID__Group_1__0");
					put(grammarAccess.getUseStatementAccess().getGroup(), "rule__UseStatement__Group__0");
					put(grammarAccess.getProductAccess().getElementsAssignment(), "rule__Product__ElementsAssignment");
					put(grammarAccess.getAbstractElementAccess().getNamespaceAssignment_0(), "rule__AbstractElement__NamespaceAssignment_0");
					put(grammarAccess.getAbstractElementAccess().getUseAssignment_1(), "rule__AbstractElement__UseAssignment_1");
					put(grammarAccess.getAbstractElementAccess().getProductAssignment_2(), "rule__AbstractElement__ProductAssignment_2");
					put(grammarAccess.getNamespaceElementAccess().getNameAssignment_1(), "rule__NamespaceElement__NameAssignment_1");
					put(grammarAccess.getProductElementAccess().getNameAssignment_1(), "rule__ProductElement__NameAssignment_1");
					put(grammarAccess.getProductElementAccess().getParametersAssignment_2_1(), "rule__ProductElement__ParametersAssignment_2_1");
					put(grammarAccess.getProductElementAccess().getOperationAssignment_3(), "rule__ProductElement__OperationAssignment_3");
					put(grammarAccess.getMultiParameterElementAccess().getParamsAssignment(), "rule__MultiParameterElement__ParamsAssignment");
					put(grammarAccess.getParameterElementAccess().getNameAssignment_0(), "rule__ParameterElement__NameAssignment_0");
					put(grammarAccess.getParameterElementAccess().getTypeAssignment_1_1(), "rule__ParameterElement__TypeAssignment_1_1");
					put(grammarAccess.getOperationElementAccess().getNameAssignment_1(), "rule__OperationElement__NameAssignment_1");
					put(grammarAccess.getOperationElementAccess().getControlsAssignment_3(), "rule__OperationElement__ControlsAssignment_3");
					put(grammarAccess.getControlBlockElementAccess().getControlsAssignment_1(), "rule__ControlBlockElement__ControlsAssignment_1");
					put(grammarAccess.getControlStatementElementAccess().getExpressionAssignment_0(), "rule__ControlStatementElement__ExpressionAssignment_0");
					put(grammarAccess.getControlStatementElementAccess().getStatementAssignment_2(), "rule__ControlStatementElement__StatementAssignment_2");
					put(grammarAccess.getExpressionElementAccess().getParameterAssignment_0(), "rule__ExpressionElement__ParameterAssignment_0");
					put(grammarAccess.getExpressionElementAccess().getOperatorAssignment_1(), "rule__ExpressionElement__OperatorAssignment_1");
					put(grammarAccess.getExpressionElementAccess().getRightAssignment_2(), "rule__ExpressionElement__RightAssignment_2");
					put(grammarAccess.getStaticOperationElementAccess().getOpNameAssignment(), "rule__StaticOperationElement__OpNameAssignment");
					put(grammarAccess.getUseStatementAccess().getProductAssignment_1(), "rule__UseStatement__ProductAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.ykb.umap.dsl.ui.contentassist.antlr.internal.InternalProductParser typedParser = (com.ykb.umap.dsl.ui.contentassist.antlr.internal.InternalProductParser) parser;
			typedParser.entryRuleProduct();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ProductGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ProductGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}