/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.EProductImpl <em>EProduct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.EProductImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEProduct()
   * @generated
   */
  int EPRODUCT = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPRODUCT__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>EProduct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPRODUCT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.ECompilationUnitImpl <em>ECompilation Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.ECompilationUnitImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getECompilationUnit()
   * @generated
   */
  int ECOMPILATION_UNIT = 1;

  /**
   * The feature id for the '<em><b>Namespace Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECOMPILATION_UNIT__NAMESPACE_UNIT = 0;

  /**
   * The feature id for the '<em><b>Use Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECOMPILATION_UNIT__USE_UNIT = 1;

  /**
   * The feature id for the '<em><b>Product Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECOMPILATION_UNIT__PRODUCT_UNIT = 2;

  /**
   * The number of structural features of the '<em>ECompilation Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECOMPILATION_UNIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.EUseUnitImpl <em>EUse Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.EUseUnitImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEUseUnit()
   * @generated
   */
  int EUSE_UNIT = 2;

  /**
   * The feature id for the '<em><b>Product Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUSE_UNIT__PRODUCT_UNIT = 0;

  /**
   * The number of structural features of the '<em>EUse Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUSE_UNIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.ENamespaceUnitImpl <em>ENamespace Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.ENamespaceUnitImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getENamespaceUnit()
   * @generated
   */
  int ENAMESPACE_UNIT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMESPACE_UNIT__NAME = 0;

  /**
   * The number of structural features of the '<em>ENamespace Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMESPACE_UNIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.EProductUnitImpl <em>EProduct Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.EProductUnitImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEProductUnit()
   * @generated
   */
  int EPRODUCT_UNIT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPRODUCT_UNIT__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPRODUCT_UNIT__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Operation Units</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPRODUCT_UNIT__OPERATION_UNITS = 2;

  /**
   * The number of structural features of the '<em>EProduct Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPRODUCT_UNIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.EParameterElementImpl <em>EParameter Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.EParameterElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEParameterElement()
   * @generated
   */
  int EPARAMETER_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER_ELEMENT__TYPE = 1;

  /**
   * The number of structural features of the '<em>EParameter Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.EOperationUnitImpl <em>EOperation Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.EOperationUnitImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEOperationUnit()
   * @generated
   */
  int EOPERATION_UNIT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION_UNIT__NAME = 0;

  /**
   * The feature id for the '<em><b>Controls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION_UNIT__CONTROLS = 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION_UNIT__STATEMENTS = 2;

  /**
   * The number of structural features of the '<em>EOperation Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION_UNIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.EStatementImpl <em>EStatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.EStatementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEStatement()
   * @generated
   */
  int ESTATEMENT = 7;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTATEMENT__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>EStatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.EControlElementImpl <em>EControl Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.EControlElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEControlElement()
   * @generated
   */
  int ECONTROL_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECONTROL_ELEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Control Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECONTROL_ELEMENT__CONTROL_STATEMENT = 1;

  /**
   * The number of structural features of the '<em>EControl Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECONTROL_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.EExpressionElementImpl <em>EExpression Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.EExpressionElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEExpressionElement()
   * @generated
   */
  int EEXPRESSION_ELEMENT = 9;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EEXPRESSION_ELEMENT__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EEXPRESSION_ELEMENT__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EEXPRESSION_ELEMENT__RIGHT = 2;

  /**
   * The number of structural features of the '<em>EExpression Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EEXPRESSION_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.impl.EControlStatementElementImpl <em>EControl Statement Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.impl.EControlStatementElementImpl
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEControlStatementElement()
   * @generated
   */
  int ECONTROL_STATEMENT_ELEMENT = 10;

  /**
   * The feature id for the '<em><b>Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECONTROL_STATEMENT_ELEMENT__ERROR = 0;

  /**
   * The number of structural features of the '<em>EControl Statement Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECONTROL_STATEMENT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.UMAPDataTypes <em>UMAP Data Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.UMAPDataTypes
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getUMAPDataTypes()
   * @generated
   */
  int UMAP_DATA_TYPES = 11;

  /**
   * The meta object id for the '{@link com.ykb.umap.dsl.product.OPERATORS <em>OPERATORS</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ykb.umap.dsl.product.OPERATORS
   * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getOPERATORS()
   * @generated
   */
  int OPERATORS = 12;


  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.EProduct <em>EProduct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EProduct</em>'.
   * @see com.ykb.umap.dsl.product.EProduct
   * @generated
   */
  EClass getEProduct();

  /**
   * Returns the meta object for the containment reference list '{@link com.ykb.umap.dsl.product.EProduct#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.ykb.umap.dsl.product.EProduct#getElements()
   * @see #getEProduct()
   * @generated
   */
  EReference getEProduct_Elements();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.ECompilationUnit <em>ECompilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECompilation Unit</em>'.
   * @see com.ykb.umap.dsl.product.ECompilationUnit
   * @generated
   */
  EClass getECompilationUnit();

  /**
   * Returns the meta object for the containment reference '{@link com.ykb.umap.dsl.product.ECompilationUnit#getNamespaceUnit <em>Namespace Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace Unit</em>'.
   * @see com.ykb.umap.dsl.product.ECompilationUnit#getNamespaceUnit()
   * @see #getECompilationUnit()
   * @generated
   */
  EReference getECompilationUnit_NamespaceUnit();

  /**
   * Returns the meta object for the containment reference '{@link com.ykb.umap.dsl.product.ECompilationUnit#getUseUnit <em>Use Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Use Unit</em>'.
   * @see com.ykb.umap.dsl.product.ECompilationUnit#getUseUnit()
   * @see #getECompilationUnit()
   * @generated
   */
  EReference getECompilationUnit_UseUnit();

  /**
   * Returns the meta object for the containment reference '{@link com.ykb.umap.dsl.product.ECompilationUnit#getProductUnit <em>Product Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Product Unit</em>'.
   * @see com.ykb.umap.dsl.product.ECompilationUnit#getProductUnit()
   * @see #getECompilationUnit()
   * @generated
   */
  EReference getECompilationUnit_ProductUnit();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.EUseUnit <em>EUse Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EUse Unit</em>'.
   * @see com.ykb.umap.dsl.product.EUseUnit
   * @generated
   */
  EClass getEUseUnit();

  /**
   * Returns the meta object for the reference '{@link com.ykb.umap.dsl.product.EUseUnit#getProductUnit <em>Product Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Product Unit</em>'.
   * @see com.ykb.umap.dsl.product.EUseUnit#getProductUnit()
   * @see #getEUseUnit()
   * @generated
   */
  EReference getEUseUnit_ProductUnit();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.ENamespaceUnit <em>ENamespace Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ENamespace Unit</em>'.
   * @see com.ykb.umap.dsl.product.ENamespaceUnit
   * @generated
   */
  EClass getENamespaceUnit();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.ENamespaceUnit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ykb.umap.dsl.product.ENamespaceUnit#getName()
   * @see #getENamespaceUnit()
   * @generated
   */
  EAttribute getENamespaceUnit_Name();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.EProductUnit <em>EProduct Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EProduct Unit</em>'.
   * @see com.ykb.umap.dsl.product.EProductUnit
   * @generated
   */
  EClass getEProductUnit();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.EProductUnit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ykb.umap.dsl.product.EProductUnit#getName()
   * @see #getEProductUnit()
   * @generated
   */
  EAttribute getEProductUnit_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.ykb.umap.dsl.product.EProductUnit#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.ykb.umap.dsl.product.EProductUnit#getParameters()
   * @see #getEProductUnit()
   * @generated
   */
  EReference getEProductUnit_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link com.ykb.umap.dsl.product.EProductUnit#getOperationUnits <em>Operation Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation Units</em>'.
   * @see com.ykb.umap.dsl.product.EProductUnit#getOperationUnits()
   * @see #getEProductUnit()
   * @generated
   */
  EReference getEProductUnit_OperationUnits();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.EParameterElement <em>EParameter Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EParameter Element</em>'.
   * @see com.ykb.umap.dsl.product.EParameterElement
   * @generated
   */
  EClass getEParameterElement();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.EParameterElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ykb.umap.dsl.product.EParameterElement#getName()
   * @see #getEParameterElement()
   * @generated
   */
  EAttribute getEParameterElement_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.EParameterElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.ykb.umap.dsl.product.EParameterElement#getType()
   * @see #getEParameterElement()
   * @generated
   */
  EAttribute getEParameterElement_Type();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.EOperationUnit <em>EOperation Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EOperation Unit</em>'.
   * @see com.ykb.umap.dsl.product.EOperationUnit
   * @generated
   */
  EClass getEOperationUnit();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.EOperationUnit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ykb.umap.dsl.product.EOperationUnit#getName()
   * @see #getEOperationUnit()
   * @generated
   */
  EAttribute getEOperationUnit_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.ykb.umap.dsl.product.EOperationUnit#getControls <em>Controls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Controls</em>'.
   * @see com.ykb.umap.dsl.product.EOperationUnit#getControls()
   * @see #getEOperationUnit()
   * @generated
   */
  EReference getEOperationUnit_Controls();

  /**
   * Returns the meta object for the containment reference list '{@link com.ykb.umap.dsl.product.EOperationUnit#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see com.ykb.umap.dsl.product.EOperationUnit#getStatements()
   * @see #getEOperationUnit()
   * @generated
   */
  EReference getEOperationUnit_Statements();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.EStatement <em>EStatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EStatement</em>'.
   * @see com.ykb.umap.dsl.product.EStatement
   * @generated
   */
  EClass getEStatement();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.EStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Statement</em>'.
   * @see com.ykb.umap.dsl.product.EStatement#getStatement()
   * @see #getEStatement()
   * @generated
   */
  EAttribute getEStatement_Statement();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.EControlElement <em>EControl Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EControl Element</em>'.
   * @see com.ykb.umap.dsl.product.EControlElement
   * @generated
   */
  EClass getEControlElement();

  /**
   * Returns the meta object for the containment reference '{@link com.ykb.umap.dsl.product.EControlElement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.ykb.umap.dsl.product.EControlElement#getExpression()
   * @see #getEControlElement()
   * @generated
   */
  EReference getEControlElement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link com.ykb.umap.dsl.product.EControlElement#getControlStatement <em>Control Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Control Statement</em>'.
   * @see com.ykb.umap.dsl.product.EControlElement#getControlStatement()
   * @see #getEControlElement()
   * @generated
   */
  EReference getEControlElement_ControlStatement();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.EExpressionElement <em>EExpression Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EExpression Element</em>'.
   * @see com.ykb.umap.dsl.product.EExpressionElement
   * @generated
   */
  EClass getEExpressionElement();

  /**
   * Returns the meta object for the reference '{@link com.ykb.umap.dsl.product.EExpressionElement#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see com.ykb.umap.dsl.product.EExpressionElement#getParameter()
   * @see #getEExpressionElement()
   * @generated
   */
  EReference getEExpressionElement_Parameter();

  /**
   * Returns the meta object for the attribute '{@link com.ykb.umap.dsl.product.EExpressionElement#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see com.ykb.umap.dsl.product.EExpressionElement#getOperator()
   * @see #getEExpressionElement()
   * @generated
   */
  EAttribute getEExpressionElement_Operator();

  /**
   * Returns the meta object for the reference '{@link com.ykb.umap.dsl.product.EExpressionElement#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Right</em>'.
   * @see com.ykb.umap.dsl.product.EExpressionElement#getRight()
   * @see #getEExpressionElement()
   * @generated
   */
  EReference getEExpressionElement_Right();

  /**
   * Returns the meta object for class '{@link com.ykb.umap.dsl.product.EControlStatementElement <em>EControl Statement Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EControl Statement Element</em>'.
   * @see com.ykb.umap.dsl.product.EControlStatementElement
   * @generated
   */
  EClass getEControlStatementElement();

  /**
   * Returns the meta object for the containment reference '{@link com.ykb.umap.dsl.product.EControlStatementElement#getError <em>Error</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Error</em>'.
   * @see com.ykb.umap.dsl.product.EControlStatementElement#getError()
   * @see #getEControlStatementElement()
   * @generated
   */
  EReference getEControlStatementElement_Error();

  /**
   * Returns the meta object for enum '{@link com.ykb.umap.dsl.product.UMAPDataTypes <em>UMAP Data Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>UMAP Data Types</em>'.
   * @see com.ykb.umap.dsl.product.UMAPDataTypes
   * @generated
   */
  EEnum getUMAPDataTypes();

  /**
   * Returns the meta object for enum '{@link com.ykb.umap.dsl.product.OPERATORS <em>OPERATORS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>OPERATORS</em>'.
   * @see com.ykb.umap.dsl.product.OPERATORS
   * @generated
   */
  EEnum getOPERATORS();

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
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.EProductImpl <em>EProduct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.EProductImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEProduct()
     * @generated
     */
    EClass EPRODUCT = eINSTANCE.getEProduct();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EPRODUCT__ELEMENTS = eINSTANCE.getEProduct_Elements();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.ECompilationUnitImpl <em>ECompilation Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.ECompilationUnitImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getECompilationUnit()
     * @generated
     */
    EClass ECOMPILATION_UNIT = eINSTANCE.getECompilationUnit();

    /**
     * The meta object literal for the '<em><b>Namespace Unit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECOMPILATION_UNIT__NAMESPACE_UNIT = eINSTANCE.getECompilationUnit_NamespaceUnit();

    /**
     * The meta object literal for the '<em><b>Use Unit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECOMPILATION_UNIT__USE_UNIT = eINSTANCE.getECompilationUnit_UseUnit();

    /**
     * The meta object literal for the '<em><b>Product Unit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECOMPILATION_UNIT__PRODUCT_UNIT = eINSTANCE.getECompilationUnit_ProductUnit();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.EUseUnitImpl <em>EUse Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.EUseUnitImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEUseUnit()
     * @generated
     */
    EClass EUSE_UNIT = eINSTANCE.getEUseUnit();

    /**
     * The meta object literal for the '<em><b>Product Unit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUSE_UNIT__PRODUCT_UNIT = eINSTANCE.getEUseUnit_ProductUnit();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.ENamespaceUnitImpl <em>ENamespace Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.ENamespaceUnitImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getENamespaceUnit()
     * @generated
     */
    EClass ENAMESPACE_UNIT = eINSTANCE.getENamespaceUnit();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENAMESPACE_UNIT__NAME = eINSTANCE.getENamespaceUnit_Name();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.EProductUnitImpl <em>EProduct Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.EProductUnitImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEProductUnit()
     * @generated
     */
    EClass EPRODUCT_UNIT = eINSTANCE.getEProductUnit();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EPRODUCT_UNIT__NAME = eINSTANCE.getEProductUnit_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EPRODUCT_UNIT__PARAMETERS = eINSTANCE.getEProductUnit_Parameters();

    /**
     * The meta object literal for the '<em><b>Operation Units</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EPRODUCT_UNIT__OPERATION_UNITS = eINSTANCE.getEProductUnit_OperationUnits();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.EParameterElementImpl <em>EParameter Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.EParameterElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEParameterElement()
     * @generated
     */
    EClass EPARAMETER_ELEMENT = eINSTANCE.getEParameterElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EPARAMETER_ELEMENT__NAME = eINSTANCE.getEParameterElement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EPARAMETER_ELEMENT__TYPE = eINSTANCE.getEParameterElement_Type();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.EOperationUnitImpl <em>EOperation Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.EOperationUnitImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEOperationUnit()
     * @generated
     */
    EClass EOPERATION_UNIT = eINSTANCE.getEOperationUnit();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EOPERATION_UNIT__NAME = eINSTANCE.getEOperationUnit_Name();

    /**
     * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EOPERATION_UNIT__CONTROLS = eINSTANCE.getEOperationUnit_Controls();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EOPERATION_UNIT__STATEMENTS = eINSTANCE.getEOperationUnit_Statements();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.EStatementImpl <em>EStatement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.EStatementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEStatement()
     * @generated
     */
    EClass ESTATEMENT = eINSTANCE.getEStatement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESTATEMENT__STATEMENT = eINSTANCE.getEStatement_Statement();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.EControlElementImpl <em>EControl Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.EControlElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEControlElement()
     * @generated
     */
    EClass ECONTROL_ELEMENT = eINSTANCE.getEControlElement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECONTROL_ELEMENT__EXPRESSION = eINSTANCE.getEControlElement_Expression();

    /**
     * The meta object literal for the '<em><b>Control Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECONTROL_ELEMENT__CONTROL_STATEMENT = eINSTANCE.getEControlElement_ControlStatement();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.EExpressionElementImpl <em>EExpression Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.EExpressionElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEExpressionElement()
     * @generated
     */
    EClass EEXPRESSION_ELEMENT = eINSTANCE.getEExpressionElement();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EEXPRESSION_ELEMENT__PARAMETER = eINSTANCE.getEExpressionElement_Parameter();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EEXPRESSION_ELEMENT__OPERATOR = eINSTANCE.getEExpressionElement_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EEXPRESSION_ELEMENT__RIGHT = eINSTANCE.getEExpressionElement_Right();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.impl.EControlStatementElementImpl <em>EControl Statement Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.impl.EControlStatementElementImpl
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getEControlStatementElement()
     * @generated
     */
    EClass ECONTROL_STATEMENT_ELEMENT = eINSTANCE.getEControlStatementElement();

    /**
     * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECONTROL_STATEMENT_ELEMENT__ERROR = eINSTANCE.getEControlStatementElement_Error();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.UMAPDataTypes <em>UMAP Data Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.UMAPDataTypes
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getUMAPDataTypes()
     * @generated
     */
    EEnum UMAP_DATA_TYPES = eINSTANCE.getUMAPDataTypes();

    /**
     * The meta object literal for the '{@link com.ykb.umap.dsl.product.OPERATORS <em>OPERATORS</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ykb.umap.dsl.product.OPERATORS
     * @see com.ykb.umap.dsl.product.impl.ProductPackageImpl#getOPERATORS()
     * @generated
     */
    EEnum OPERATORS = eINSTANCE.getOPERATORS();

  }

} //ProductPackage
