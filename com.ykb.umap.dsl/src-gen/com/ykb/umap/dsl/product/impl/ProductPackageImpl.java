/**
 */
package com.ykb.umap.dsl.product.impl;

import com.ykb.umap.dsl.product.ECompilationUnit;
import com.ykb.umap.dsl.product.EControlElement;
import com.ykb.umap.dsl.product.EControlStatementElement;
import com.ykb.umap.dsl.product.EExpressionElement;
import com.ykb.umap.dsl.product.ENamespaceUnit;
import com.ykb.umap.dsl.product.EOperationUnit;
import com.ykb.umap.dsl.product.EParameterElement;
import com.ykb.umap.dsl.product.EProduct;
import com.ykb.umap.dsl.product.EProductUnit;
import com.ykb.umap.dsl.product.EStatement;
import com.ykb.umap.dsl.product.EUseUnit;
import com.ykb.umap.dsl.product.ProductFactory;
import com.ykb.umap.dsl.product.ProductPackage;
import com.ykb.umap.dsl.product.UMAPDataTypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductPackageImpl extends EPackageImpl implements ProductPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eProductEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eCompilationUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eUseUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eNamespaceUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eProductUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eParameterElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eOperationUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eControlElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eExpressionElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eControlStatementElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum umapDataTypesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operatorsEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ykb.umap.dsl.product.ProductPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ProductPackageImpl()
  {
    super(eNS_URI, ProductFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ProductPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ProductPackage init()
  {
    if (isInited) return (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);

    // Obtain or create and register package
    ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProductPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theProductPackage.createPackageContents();

    // Initialize created meta-data
    theProductPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theProductPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ProductPackage.eNS_URI, theProductPackage);
    return theProductPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEProduct()
  {
    return eProductEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEProduct_Elements()
  {
    return (EReference)eProductEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECompilationUnit()
  {
    return eCompilationUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getECompilationUnit_NamespaceUnit()
  {
    return (EReference)eCompilationUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getECompilationUnit_UseUnit()
  {
    return (EReference)eCompilationUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getECompilationUnit_ProductUnit()
  {
    return (EReference)eCompilationUnitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEUseUnit()
  {
    return eUseUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEUseUnit_ProductUnit()
  {
    return (EReference)eUseUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getENamespaceUnit()
  {
    return eNamespaceUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENamespaceUnit_Name()
  {
    return (EAttribute)eNamespaceUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEProductUnit()
  {
    return eProductUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEProductUnit_Name()
  {
    return (EAttribute)eProductUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEProductUnit_Parameters()
  {
    return (EReference)eProductUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEProductUnit_OperationUnits()
  {
    return (EReference)eProductUnitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEParameterElement()
  {
    return eParameterElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEParameterElement_Name()
  {
    return (EAttribute)eParameterElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEParameterElement_Type()
  {
    return (EAttribute)eParameterElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEOperationUnit()
  {
    return eOperationUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEOperationUnit_Name()
  {
    return (EAttribute)eOperationUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEOperationUnit_Controls()
  {
    return (EReference)eOperationUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEOperationUnit_Statements()
  {
    return (EReference)eOperationUnitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEStatement()
  {
    return eStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEStatement_Statement()
  {
    return (EAttribute)eStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEControlElement()
  {
    return eControlElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEControlElement_Expression()
  {
    return (EReference)eControlElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEControlElement_ControlStatement()
  {
    return (EReference)eControlElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEExpressionElement()
  {
    return eExpressionElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEExpressionElement_Parameter()
  {
    return (EReference)eExpressionElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEExpressionElement_Operator()
  {
    return (EAttribute)eExpressionElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEExpressionElement_Right()
  {
    return (EReference)eExpressionElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEControlStatementElement()
  {
    return eControlStatementElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEControlStatementElement_Error()
  {
    return (EReference)eControlStatementElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUMAPDataTypes()
  {
    return umapDataTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOPERATORS()
  {
    return operatorsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductFactory getProductFactory()
  {
    return (ProductFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    eProductEClass = createEClass(EPRODUCT);
    createEReference(eProductEClass, EPRODUCT__ELEMENTS);

    eCompilationUnitEClass = createEClass(ECOMPILATION_UNIT);
    createEReference(eCompilationUnitEClass, ECOMPILATION_UNIT__NAMESPACE_UNIT);
    createEReference(eCompilationUnitEClass, ECOMPILATION_UNIT__USE_UNIT);
    createEReference(eCompilationUnitEClass, ECOMPILATION_UNIT__PRODUCT_UNIT);

    eUseUnitEClass = createEClass(EUSE_UNIT);
    createEReference(eUseUnitEClass, EUSE_UNIT__PRODUCT_UNIT);

    eNamespaceUnitEClass = createEClass(ENAMESPACE_UNIT);
    createEAttribute(eNamespaceUnitEClass, ENAMESPACE_UNIT__NAME);

    eProductUnitEClass = createEClass(EPRODUCT_UNIT);
    createEAttribute(eProductUnitEClass, EPRODUCT_UNIT__NAME);
    createEReference(eProductUnitEClass, EPRODUCT_UNIT__PARAMETERS);
    createEReference(eProductUnitEClass, EPRODUCT_UNIT__OPERATION_UNITS);

    eParameterElementEClass = createEClass(EPARAMETER_ELEMENT);
    createEAttribute(eParameterElementEClass, EPARAMETER_ELEMENT__NAME);
    createEAttribute(eParameterElementEClass, EPARAMETER_ELEMENT__TYPE);

    eOperationUnitEClass = createEClass(EOPERATION_UNIT);
    createEAttribute(eOperationUnitEClass, EOPERATION_UNIT__NAME);
    createEReference(eOperationUnitEClass, EOPERATION_UNIT__CONTROLS);
    createEReference(eOperationUnitEClass, EOPERATION_UNIT__STATEMENTS);

    eStatementEClass = createEClass(ESTATEMENT);
    createEAttribute(eStatementEClass, ESTATEMENT__STATEMENT);

    eControlElementEClass = createEClass(ECONTROL_ELEMENT);
    createEReference(eControlElementEClass, ECONTROL_ELEMENT__EXPRESSION);
    createEReference(eControlElementEClass, ECONTROL_ELEMENT__CONTROL_STATEMENT);

    eExpressionElementEClass = createEClass(EEXPRESSION_ELEMENT);
    createEReference(eExpressionElementEClass, EEXPRESSION_ELEMENT__PARAMETER);
    createEAttribute(eExpressionElementEClass, EEXPRESSION_ELEMENT__OPERATOR);
    createEReference(eExpressionElementEClass, EEXPRESSION_ELEMENT__RIGHT);

    eControlStatementElementEClass = createEClass(ECONTROL_STATEMENT_ELEMENT);
    createEReference(eControlStatementElementEClass, ECONTROL_STATEMENT_ELEMENT__ERROR);

    // Create enums
    umapDataTypesEEnum = createEEnum(UMAP_DATA_TYPES);
    operatorsEEnum = createEEnum(OPERATORS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(eProductEClass, EProduct.class, "EProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEProduct_Elements(), this.getECompilationUnit(), null, "elements", null, 0, -1, EProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eCompilationUnitEClass, ECompilationUnit.class, "ECompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getECompilationUnit_NamespaceUnit(), this.getENamespaceUnit(), null, "namespaceUnit", null, 0, 1, ECompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getECompilationUnit_UseUnit(), this.getEUseUnit(), null, "useUnit", null, 0, 1, ECompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getECompilationUnit_ProductUnit(), this.getEProductUnit(), null, "productUnit", null, 0, 1, ECompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eUseUnitEClass, EUseUnit.class, "EUseUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEUseUnit_ProductUnit(), this.getEProductUnit(), null, "productUnit", null, 0, 1, EUseUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eNamespaceUnitEClass, ENamespaceUnit.class, "ENamespaceUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getENamespaceUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, ENamespaceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eProductUnitEClass, EProductUnit.class, "EProductUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEProductUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, EProductUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEProductUnit_Parameters(), this.getEParameterElement(), null, "parameters", null, 0, -1, EProductUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEProductUnit_OperationUnits(), this.getEOperationUnit(), null, "operationUnits", null, 0, -1, EProductUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eParameterElementEClass, EParameterElement.class, "EParameterElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEParameterElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, EParameterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEParameterElement_Type(), this.getUMAPDataTypes(), "type", null, 0, 1, EParameterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eOperationUnitEClass, EOperationUnit.class, "EOperationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEOperationUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, EOperationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEOperationUnit_Controls(), this.getEControlElement(), null, "controls", null, 0, -1, EOperationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEOperationUnit_Statements(), this.getEStatement(), null, "statements", null, 0, -1, EOperationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eStatementEClass, EStatement.class, "EStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEStatement_Statement(), ecorePackage.getEString(), "statement", null, 0, 1, EStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eControlElementEClass, EControlElement.class, "EControlElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEControlElement_Expression(), this.getEExpressionElement(), null, "expression", null, 0, 1, EControlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEControlElement_ControlStatement(), this.getEControlStatementElement(), null, "controlStatement", null, 0, 1, EControlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eExpressionElementEClass, EExpressionElement.class, "EExpressionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEExpressionElement_Parameter(), this.getEParameterElement(), null, "parameter", null, 0, 1, EExpressionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEExpressionElement_Operator(), this.getOPERATORS(), "operator", null, 0, 1, EExpressionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEExpressionElement_Right(), this.getEOperationUnit(), null, "right", null, 0, 1, EExpressionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eControlStatementElementEClass, EControlStatementElement.class, "EControlStatementElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEControlStatementElement_Error(), theXbasePackage.getXExpression(), null, "error", null, 0, 1, EControlStatementElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(umapDataTypesEEnum, UMAPDataTypes.class, "UMAPDataTypes");
    addEEnumLiteral(umapDataTypesEEnum, UMAPDataTypes.BRANCH);
    addEEnumLiteral(umapDataTypesEEnum, UMAPDataTypes.CLIENT);
    addEEnumLiteral(umapDataTypesEEnum, UMAPDataTypes.CURRENCY);
    addEEnumLiteral(umapDataTypesEEnum, UMAPDataTypes.NUMBER);
    addEEnumLiteral(umapDataTypesEEnum, UMAPDataTypes.STRING);

    initEEnum(operatorsEEnum, com.ykb.umap.dsl.product.OPERATORS.class, "OPERATORS");
    addEEnumLiteral(operatorsEEnum, com.ykb.umap.dsl.product.OPERATORS.IS);
    addEEnumLiteral(operatorsEEnum, com.ykb.umap.dsl.product.OPERATORS.NOT);

    // Create resource
    createResource(eNS_URI);
  }

} //ProductPackageImpl
