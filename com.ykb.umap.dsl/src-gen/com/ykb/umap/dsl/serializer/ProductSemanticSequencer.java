package com.ykb.umap.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.ykb.umap.dsl.product.ECompilationUnit;
import com.ykb.umap.dsl.product.EControlElement;
import com.ykb.umap.dsl.product.EControlStatementElement;
import com.ykb.umap.dsl.product.EExpressionElement;
import com.ykb.umap.dsl.product.ENamespaceUnit;
import com.ykb.umap.dsl.product.EOperationUnit;
import com.ykb.umap.dsl.product.EParameterElement;
import com.ykb.umap.dsl.product.EProduct;
import com.ykb.umap.dsl.product.EProductUnit;
import com.ykb.umap.dsl.product.EUseUnit;
import com.ykb.umap.dsl.product.ProductPackage;
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
			case ProductPackage.ECOMPILATION_UNIT:
				if(context == grammarAccess.getCompilationUnitRule()) {
					sequence_CompilationUnit(context, (ECompilationUnit) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.ECONTROL_ELEMENT:
				if(context == grammarAccess.getControlElementRule()) {
					sequence_ControlElement(context, (EControlElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.ECONTROL_STATEMENT_ELEMENT:
				if(context == grammarAccess.getControlStatementElementRule()) {
					sequence_ControlStatementElement(context, (EControlStatementElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.EEXPRESSION_ELEMENT:
				if(context == grammarAccess.getExpressionElementRule()) {
					sequence_ExpressionElement(context, (EExpressionElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.ENAMESPACE_UNIT:
				if(context == grammarAccess.getNamespaceUnitRule()) {
					sequence_NamespaceUnit(context, (ENamespaceUnit) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.EOPERATION_UNIT:
				if(context == grammarAccess.getOperationUnitRule()) {
					sequence_OperationUnit(context, (EOperationUnit) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.EPARAMETER_ELEMENT:
				if(context == grammarAccess.getParameterElementRule()) {
					sequence_ParameterElement(context, (EParameterElement) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.EPRODUCT:
				if(context == grammarAccess.getProductRule()) {
					sequence_Product(context, (EProduct) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.EPRODUCT_UNIT:
				if(context == grammarAccess.getProductUnitRule()) {
					sequence_ProductUnit(context, (EProductUnit) semanticObject); 
					return; 
				}
				else break;
			case ProductPackage.EUSE_UNIT:
				if(context == grammarAccess.getUseUnitRule()) {
					sequence_UseUnit(context, (EUseUnit) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (namespaceUnit=NamespaceUnit useUnit=UseUnit? productUnit=ProductUnit)
	 */
	protected void sequence_CompilationUnit(EObject context, ECompilationUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=ExpressionElement controlStatement=ControlStatementElement)
	 */
	protected void sequence_ControlElement(EObject context, EControlElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProductPackage.Literals.ECONTROL_ELEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProductPackage.Literals.ECONTROL_ELEMENT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, ProductPackage.Literals.ECONTROL_ELEMENT__CONTROL_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProductPackage.Literals.ECONTROL_ELEMENT__CONTROL_STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getControlElementAccess().getExpressionExpressionElementParserRuleCall_0_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getControlElementAccess().getControlStatementControlStatementElementParserRuleCall_2_0(), semanticObject.getControlStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     message=ANY_OTHER
	 */
	protected void sequence_ControlStatementElement(EObject context, EControlStatementElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProductPackage.Literals.ECONTROL_STATEMENT_ELEMENT__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProductPackage.Literals.ECONTROL_STATEMENT_ELEMENT__MESSAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getControlStatementElementAccess().getMessageANY_OTHERTerminalRuleCall_3_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=[EParameterElement|ID] operator=OPERATORS right=[EOperationUnit|ID])
	 */
	protected void sequence_ExpressionElement(EObject context, EExpressionElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProductPackage.Literals.EEXPRESSION_ELEMENT__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProductPackage.Literals.EEXPRESSION_ELEMENT__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, ProductPackage.Literals.EEXPRESSION_ELEMENT__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProductPackage.Literals.EEXPRESSION_ELEMENT__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, ProductPackage.Literals.EEXPRESSION_ELEMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProductPackage.Literals.EEXPRESSION_ELEMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionElementAccess().getParameterEParameterElementIDTerminalRuleCall_0_0_1(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getExpressionElementAccess().getOperatorOPERATORSEnumRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getExpressionElementAccess().getRightEOperationUnitIDTerminalRuleCall_2_0_1(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=QUALIFIEDID
	 */
	protected void sequence_NamespaceUnit(EObject context, ENamespaceUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProductPackage.Literals.ENAMESPACE_UNIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProductPackage.Literals.ENAMESPACE_UNIT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamespaceUnitAccess().getNameQUALIFIEDIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID controls+=ControlElement?)
	 */
	protected void sequence_OperationUnit(EObject context, EOperationUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=UMAPDataTypes?)
	 */
	protected void sequence_ParameterElement(EObject context, EParameterElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameters+=ParameterElement* operationUnit=OperationUnit)
	 */
	protected void sequence_ProductUnit(EObject context, EProductUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=CompilationUnit
	 */
	protected void sequence_Product(EObject context, EProduct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     productUnit=[EProductUnit|QUALIFIEDID]
	 */
	protected void sequence_UseUnit(EObject context, EUseUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProductPackage.Literals.EUSE_UNIT__PRODUCT_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProductPackage.Literals.EUSE_UNIT__PRODUCT_UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUseUnitAccess().getProductUnitEProductUnitQUALIFIEDIDParserRuleCall_1_0_1(), semanticObject.getProductUnit());
		feeder.finish();
	}
}
