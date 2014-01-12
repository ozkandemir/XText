/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ykb.umap.dsl.product.ProductFactory
 * @model kind="package"
 * @generated
 */
public interface ProductPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "product";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ykb.com/umap/dsl/Product";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "product";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProductPackage eINSTANCE = com.ykb.umap.dsl.product.impl.ProductPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.ProductImpl <em>Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.ProductImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getProduct()
   * @generated
   */
  int PRODUCT = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Product</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.AbstractElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__NAMESPACE = 0;

  /**
   * The feature id for the '<em><b>Use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__USE = 1;

  /**
   * The feature id for the '<em><b>Product</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__PRODUCT = 2;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.NamespaceElementImpl <em>Namespace Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.NamespaceElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getNamespaceElement()
   * @generated
   */
  int NAMESPACE_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Namespace Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.ProductElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.ProductElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getProductElement()
   * @generated
   */
  int PRODUCT_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_ELEMENT__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_ELEMENT__OPERATION = 2;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.MultiParameterElementImpl <em>Multi Parameter Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.MultiParameterElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getMultiParameterElement()
   * @generated
   */
  int MULTI_PARAMETER_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_PARAMETER_ELEMENT__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Multi Parameter Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_PARAMETER_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.ParameterElementImpl <em>Parameter Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.ParameterElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getParameterElement()
   * @generated
   */
  int PARAMETER_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ELEMENT__TYPE = 1;

  /**
   * The number of structural features of the '<em>Parameter Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.OperationElementImpl <em>Operation Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.OperationElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getOperationElement()
   * @generated
   */
  int OPERATION_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Controls</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_ELEMENT__CONTROLS = 1;

  /**
   * The number of structural features of the '<em>Operation Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.ControlBlockElementImpl <em>Control Block Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.ControlBlockElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getControlBlockElement()
   * @generated
   */
  int CONTROL_BLOCK_ELEMENT = 7;

  /**
   * The feature id for the '<em><b>Controls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_BLOCK_ELEMENT__CONTROLS = 0;

  /**
   * The number of structural features of the '<em>Control Block Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_BLOCK_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.ControlStatementElementImpl <em>Control Statement Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.ControlStatementElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getControlStatementElement()
   * @generated
   */
  int CONTROL_STATEMENT_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STATEMENT_ELEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STATEMENT_ELEMENT__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Control Statement Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STATEMENT_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.ExpressionElementImpl <em>Expression Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.ExpressionElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getExpressionElement()
   * @generated
   */
  int EXPRESSION_ELEMENT = 9;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_ELEMENT__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_ELEMENT__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_ELEMENT__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Expression Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.StaticOperationElementImpl <em>Static Operation Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.StaticOperationElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getStaticOperationElement()
   * @generated
   */
  int STATIC_OPERATION_ELEMENT = 10;

  /**
   * The feature id for the '<em><b>Op Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_OPERATION_ELEMENT__OP_NAME = 0;

  /**
   * The number of structural features of the '<em>Static Operation Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_OPERATION_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.UseStatementImpl <em>Use Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.UseStatementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getUseStatement()
   * @generated
   */
  int USE_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Product</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_STATEMENT__PRODUCT = 0;

  /**
   * The number of structural features of the '<em>Use Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_STATEMENT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.Product <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product</em>'.
   * @see com.ykb.umap.dsl.product.Product
   * @generated
   */
  EClass getProduct();

  /**
   * Returns the meta object for the containment reference list '{@link com.ykb.umap.dsl.product.Product#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.ykb.umap.dsl.product.Product#getElements()
   * @see #getProduct()
   * @generated
   */
  EReference getProduct_Elements();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see com.ykb.umap.dsl.product.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for the containment reference '{@link com.ykb.umap.dsl.product.AbstractElement#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace</em>'.
   * @see com.ykb.umap.dsl.product.AbstractElement#getNamespace()
   * @see #getAbstractElement()
   * @generated
   */
  EReference getAbstractElement_Namespace();

  /**
   * Returns the meta object for the containment reference '{@link com.ykb.umap.dsl.product.AbstractElement#getUse <em>Use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Use</em>'.
   * @see com.ykb.umap.dsl.product.AbstractElement#getUse()
   * @see #getAbstractElement()
   * @generated
   */
  EReference getAbstractElement_Use();

  /**
   * Returns the meta object for the containment reference '{@link com.ykb.umap.dsl.product.AbstractElement#getProduct <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Product</em>'.
   * @see com.ykb.umap.dsl.product.AbstractElement#getProduct()
   * @see #getAbstractElement()
   * @generated
   */
  EReference getAbstractElement_Product();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.NamespaceElement <em>Namespace Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Element</em>'.
   * @see com.ykb.umap.dsl.product.NamespaceElement
   * @generated
   */
  EClass getNamespaceElement();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.NamespaceElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ykb.umap.dsl.product.NamespaceElement#getName()
   * @see #getNamespaceElement()
   * @generated
   */
  EAttribute getNamespaceElement_Name();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.ProductElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see com.ykb.umap.dsl.product.ProductElement
   * @generated
   */
  EClass getProductElement();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.ProductElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ykb.umap.dsl.product.ProductElement#getName()
   * @see #getProductElement()
   * @generated
   */
  EAttribute getProductElement_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.ykb.umap.dsl.product.ProductElement#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see com.ykb.umap.dsl.product.ProductElement#getParameters()
   * @see #getProductElement()
   * @generated
   */
  EReference getProductElement_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link com.ykb.umap.dsl.product.ProductElement#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see com.ykb.umap.dsl.product.ProductElement#getOperation()
   * @see #getProductElement()
   * @generated
   */
  EReference getProductElement_Operation();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.MultiParameterElement <em>Multi Parameter Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Parameter Element</em>'.
   * @see com.ykb.umap.dsl.product.MultiParameterElement
   * @generated
   */
  EClass getMultiParameterElement();

  /**
   * Returns the meta object for the containment reference list '{@link com.ykb.umap.dsl.product.MultiParameterElement#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see com.ykb.umap.dsl.product.MultiParameterElement#getParams()
   * @see #getMultiParameterElement()
   * @generated
   */
  EReference getMultiParameterElement_Params();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.ParameterElement <em>Parameter Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Element</em>'.
   * @see com.ykb.umap.dsl.product.ParameterElement
   * @generated
   */
  EClass getParameterElement();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.ParameterElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ykb.umap.dsl.product.ParameterElement#getName()
   * @see #getParameterElement()
   * @generated
   */
  EAttribute getParameterElement_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.ParameterElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.ykb.umap.dsl.product.ParameterElement#getType()
   * @see #getParameterElement()
   * @generated
   */
  EAttribute getParameterElement_Type();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.OperationElement <em>Operation Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Element</em>'.
   * @see com.ykb.umap.dsl.product.OperationElement
   * @generated
   */
  EClass getOperationElement();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.OperationElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ykb.umap.dsl.product.OperationElement#getName()
   * @see #getOperationElement()
   * @generated
   */
  EAttribute getOperationElement_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.ykb.umap.dsl.product.OperationElement#getControls <em>Controls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Controls</em>'.
   * @see com.ykb.umap.dsl.product.OperationElement#getControls()
   * @see #getOperationElement()
   * @generated
   */
  EReference getOperationElement_Controls();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.ControlBlockElement <em>Control Block Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Block Element</em>'.
   * @see com.ykb.umap.dsl.product.ControlBlockElement
   * @generated
   */
  EClass getControlBlockElement();

  /**
   * Returns the meta object for the containment reference list '{@link com.ykb.umap.dsl.product.ControlBlockElement#getControls <em>Controls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Controls</em>'.
   * @see com.ykb.umap.dsl.product.ControlBlockElement#getControls()
   * @see #getControlBlockElement()
   * @generated
   */
  EReference getControlBlockElement_Controls();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.ControlStatementElement <em>Control Statement Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Statement Element</em>'.
   * @see com.ykb.umap.dsl.product.ControlStatementElement
   * @generated
   */
  EClass getControlStatementElement();

  /**
   * Returns the meta object for the containment reference '{@link com.ykb.umap.dsl.product.ControlStatementElement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.ykb.umap.dsl.product.ControlStatementElement#getExpression()
   * @see #getControlStatementElement()
   * @generated
   */
  EReference getControlStatementElement_Expression();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.ControlStatementElement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Statement</em>'.
   * @see com.ykb.umap.dsl.product.ControlStatementElement#getStatement()
   * @see #getControlStatementElement()
   * @generated
   */
  EAttribute getControlStatementElement_Statement();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.ExpressionElement <em>Expression Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Element</em>'.
   * @see com.ykb.umap.dsl.product.ExpressionElement
   * @generated
   */
  EClass getExpressionElement();

  /**
   * Returns the meta object for the reference '{@link com.ykb.umap.dsl.product.ExpressionElement#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see com.ykb.umap.dsl.product.ExpressionElement#getParameter()
   * @see #getExpressionElement()
   * @generated
   */
  EReference getExpressionElement_Parameter();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.ExpressionElement#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see com.ykb.umap.dsl.product.ExpressionElement#getOperator()
   * @see #getExpressionElement()
   * @generated
   */
  EAttribute getExpressionElement_Operator();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.ExpressionElement#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see com.ykb.umap.dsl.product.ExpressionElement#getRight()
   * @see #getExpressionElement()
   * @generated
   */
  EAttribute getExpressionElement_Right();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.StaticOperationElement <em>Static Operation Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Operation Element</em>'.
   * @see com.ykb.umap.dsl.product.StaticOperationElement
   * @generated
   */
  EClass getStaticOperationElement();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.StaticOperationElement#getOpName <em>Op Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Name</em>'.
   * @see com.ykb.umap.dsl.product.StaticOperationElement#getOpName()
   * @see #getStaticOperationElement()
   * @generated
   */
  EAttribute getStaticOperationElement_OpName();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.UseStatement <em>Use Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Use Statement</em>'.
   * @see com.ykb.umap.dsl.product.UseStatement
   * @generated
   */
  EClass getUseStatement();

  /**
   * Returns the meta object for the reference '{@link com.ykb.umap.dsl.product.UseStatement#getProduct <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Product</em>'.
   * @see com.ykb.umap.dsl.product.UseStatement#getProduct()
   * @see #getUseStatement()
   * @generated
   */
  EReference getUseStatement_Product();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProductFactory getProductFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.ProductImpl <em>Product</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.ProductImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getProduct()
     * @generated
     */
    EClass PRODUCT = eINSTANCE.getProduct();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT__ELEMENTS = eINSTANCE.getProduct_Elements();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.AbstractElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ELEMENT__NAMESPACE = eINSTANCE.getAbstractElement_Namespace();

    /**
     * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ELEMENT__USE = eINSTANCE.getAbstractElement_Use();

    /**
     * The meta object literal for the '<em><b>Product</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ELEMENT__PRODUCT = eINSTANCE.getAbstractElement_Product();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.NamespaceElementImpl <em>Namespace Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.NamespaceElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getNamespaceElement()
     * @generated
     */
    EClass NAMESPACE_ELEMENT = eINSTANCE.getNamespaceElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE_ELEMENT__NAME = eINSTANCE.getNamespaceElement_Name();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.ProductElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.ProductElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getProductElement()
     * @generated
     */
    EClass PRODUCT_ELEMENT = eINSTANCE.getProductElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT_ELEMENT__NAME = eINSTANCE.getProductElement_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_ELEMENT__PARAMETERS = eINSTANCE.getProductElement_Parameters();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_ELEMENT__OPERATION = eINSTANCE.getProductElement_Operation();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.MultiParameterElementImpl <em>Multi Parameter Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.MultiParameterElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getMultiParameterElement()
     * @generated
     */
    EClass MULTI_PARAMETER_ELEMENT = eINSTANCE.getMultiParameterElement();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_PARAMETER_ELEMENT__PARAMS = eINSTANCE.getMultiParameterElement_Params();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.ParameterElementImpl <em>Parameter Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.ParameterElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getParameterElement()
     * @generated
     */
    EClass PARAMETER_ELEMENT = eINSTANCE.getParameterElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_ELEMENT__NAME = eINSTANCE.getParameterElement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_ELEMENT__TYPE = eINSTANCE.getParameterElement_Type();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.OperationElementImpl <em>Operation Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.OperationElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getOperationElement()
     * @generated
     */
    EClass OPERATION_ELEMENT = eINSTANCE.getOperationElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_ELEMENT__NAME = eINSTANCE.getOperationElement_Name();

    /**
     * The meta object literal for the '<em><b>Controls</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_ELEMENT__CONTROLS = eINSTANCE.getOperationElement_Controls();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.ControlBlockElementImpl <em>Control Block Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.ControlBlockElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getControlBlockElement()
     * @generated
     */
    EClass CONTROL_BLOCK_ELEMENT = eINSTANCE.getControlBlockElement();

    /**
     * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_BLOCK_ELEMENT__CONTROLS = eINSTANCE.getControlBlockElement_Controls();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.ControlStatementElementImpl <em>Control Statement Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.ControlStatementElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getControlStatementElement()
     * @generated
     */
    EClass CONTROL_STATEMENT_ELEMENT = eINSTANCE.getControlStatementElement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_STATEMENT_ELEMENT__EXPRESSION = eINSTANCE.getControlStatementElement_Expression();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_STATEMENT_ELEMENT__STATEMENT = eINSTANCE.getControlStatementElement_Statement();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.ExpressionElementImpl <em>Expression Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.ExpressionElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getExpressionElement()
     * @generated
     */
    EClass EXPRESSION_ELEMENT = eINSTANCE.getExpressionElement();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_ELEMENT__PARAMETER = eINSTANCE.getExpressionElement_Parameter();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_ELEMENT__OPERATOR = eINSTANCE.getExpressionElement_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_ELEMENT__RIGHT = eINSTANCE.getExpressionElement_Right();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.StaticOperationElementImpl <em>Static Operation Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.StaticOperationElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getStaticOperationElement()
     * @generated
     */
    EClass STATIC_OPERATION_ELEMENT = eINSTANCE.getStaticOperationElement();

    /**
     * The meta object literal for the '<em><b>Op Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_OPERATION_ELEMENT__OP_NAME = eINSTANCE.getStaticOperationElement_OpName();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.UseStatementImpl <em>Use Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.UseStatementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getUseStatement()
     * @generated
     */
    EClass USE_STATEMENT = eINSTANCE.getUseStatement();

    /**
     * The meta object literal for the '<em><b>Product</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_STATEMENT__PRODUCT = eINSTANCE.getUseStatement_Product();

  }

} //ProductPackage
