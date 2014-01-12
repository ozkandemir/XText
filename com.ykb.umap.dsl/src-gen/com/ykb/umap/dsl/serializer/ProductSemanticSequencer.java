package com.ykb.umap.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.ykb.umap.dsl.product.AbstractElement;
import com.ykb.umap.dsl.product.ControlBlockElement;
import com.ykb.umap.dsl.product.ControlStatementElement;
import com.ykb.umap.dsl.product.ExpressionElement;
import com.ykb.umap.dsl.product.MultiParameterElement;
import com.ykb.umap.dsl.product.NamespaceElement;
import com.ykb.umap.dsl.product.OperationElement;
import com.ykb.umap.dsl.product.ParameterElement;
import com.ykb.umap.dsl.product.Product;
import com.ykb.umap.dsl.product.ProductElement;
import com.ykb.umap.dsl.product.ProductPackage;
import com.ykb.umap.dsl.product.StaticOperationElement;
import com.ykb.umap.dsl.product.UseStatement;
import com.ykb.umap.dsl.services.ProductGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ProductSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ProductGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ProductPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ProductPackage.ABSTRACT_ELEMENT:
				if(context == grammarAccess.getAbstractElementRule()) {
					sequence_AbstractElement(context, (AbstractElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.CONTROL_BLOCK_ELEMENT:
				if(context == grammarAccess.getControlBlockElementRule()) {
					sequence_ControlBlockElement(context, (ControlBlockElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.CONTROL_STATEMENT_ELEMENT:
				if(context == grammarAccess.getControlStatementElementRule()) {
					sequence_ControlStatementElement(context, (ControlStatementElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.EXPRESSION_ELEMENT:
				if(context == grammarAccess.getExpressionElementRule()) {
					sequence_ExpressionElement(context, (ExpressionElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.MULTI_PARAMETER_ELEMENT:
				if(context == grammarAccess.getMultiParameterElementRule()) {
					sequence_MultiParameterElement(context, (MultiParameterElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.NAMESPACE_ELEMENT:
				if(context == grammarAccess.getNamespaceElementRule()) {
					sequence_NamespaceElement(context, (NamespaceElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.OPERATION_ELEMENT:
				if(context == grammarAccess.getOperationElementRule()) {
					sequence_OperationElement(context, (OperationElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.PARAMETER_ELEMENT:
				if(context == grammarAccess.getParameterElementRule()) {
					sequence_ParameterElement(context, (ParameterElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.PRODUCT:
				if(context == grammarAccess.getProductRule()) {
					sequence_Product(context, (Product) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.PRODUCT_ELEMENT:
				if(context == grammarAccess.getProductElementRule()) {
					sequence_ProductElement(context, (ProductElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.STATIC_OPERATION_ELEMENT:
				if(context == grammarAccess.getStaticOperationElementRule()) {
					sequence_StaticOperationElement(context, (StaticOperationElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.USE_STATEMENT:
				if(context == grammarAccess.getUseStatementRule()) {
					sequence_UseStatement(context, (UseStatement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (namespace=NamespaceElement use=UseStatement? product=ProductElement)
	 */
	protected void sequence_AbstractElement(EObject context, AbstractElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     controls+=ControlStatementElement
	 */
	protected void sequence_ControlBlockElement(EObject context, ControlBlockElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=ExpressionElement statement=StatementElement)
	 */
	protected void sequence_ControlStatementElement(EObject context, ControlStatementElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProductPackage.Literals.CONTROL_STATEMENT_ELEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProductPackage.Literals.CONTROL_STATEMENT_ELEMENT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, ProductPackage.Literals.CONTROL_STATEMENT_ELEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProductPackage.Literals.CONTROL_STATEMENT_ELEMENT__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getControlStatementElementAccess().getExpressionExpressionElementParserRuleCall_0_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getControlStatementElementAccess().getStatementStatementElementParserRuleCall_2_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=[ParameterElement|ID] (operator='=>' | operator='is' | operator='is not') (right='valid' | right='empty'))
	 */
	protected void sequence_ExpressionElement(EObject context, ExpressionElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     params+=ParameterElement*
	 */
	protected void sequence_MultiParameterElement(EObject context, MultiParameterElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=QualifiedID
	 */
	protected void sequence_NamespaceElement(EObject context, NamespaceElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProductPackage.Literals.NAMESPACE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProductPackage.Literals.NAMESPACE_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamespaceElementAccess().getNameQualifiedIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID controls=ControlBlockElement?)
	 */
	protected void sequence_OperationElement(EObject context, OperationElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (type='BRANCH' | type='CLIENT' | type='CURRENCY' | type=ID)?)
	 */
	protected void sequence_ParameterElement(EObject context, ParameterElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameters=MultiParameterElement? operation=OperationElement)
	 */
	protected void sequence_ProductElement(EObject context, ProductElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=AbstractElement
	 */
	protected void sequence_Product(EObject context, Product semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opName='valid' | opName='empty')
	 */
	protected void sequence_StaticOperationElement(EObject context, StaticOperationElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     product=[ProductElement|ID]
	 */
	protected void sequence_UseStatement(EObject context, UseStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProductPackage.Literals.USE_STATEMENT__PRODUCT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProductPackage.Literals.USE_STATEMENT__PRODUCT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUseStatementAccess().getProductProductElementIDTerminalRuleCall_1_0_1(), semanticObject.getProduct());
		feeder.finish();
	}
}
