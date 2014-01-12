/**
 */
package com.ykb.umap.dsl.product.impl;

import com.ykb.umap.dsl.product.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductFactoryImpl extends EFactoryImpl implements ProductFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProductFactory init()
  {
    try
    {
      ProductFactory theProductFactory = (ProductFactory)EPackage.Registry.INSTANCE.getEFactory(ProductPackage.eNS_URI);
      if (theProductFactory != null)
      {
        return theProductFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ProductFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ProductPackage.PRODUCT: return createProduct();
      case ProductPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case ProductPackage.NAMESPACE_ELEMENT: return createNamespaceElement();
      case ProductPackage.PRODUCT_ELEMENT: return createProductElement();
      case ProductPackage.MULTI_PARAMETER_ELEMENT: return createMultiParameterElement();
      case ProductPackage.PARAMETER_ELEMENT: return createParameterElement();
      case ProductPackage.OPERATION_ELEMENT: return createOperationElement();
      case ProductPackage.CONTROL_BLOCK_ELEMENT: return createControlBlockElement();
      case ProductPackage.CONTROL_STATEMENT_ELEMENT: return createControlStatementElement();
      case ProductPackage.EXPRESSION_ELEMENT: return createExpressionElement();
      case ProductPackage.STATIC_OPERATION_ELEMENT: return createStaticOperationElement();
      case ProductPackage.USE_STATEMENT: return createUseStatement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Product createProduct()
  {
    ProductImpl product = new ProductImpl();
    return product;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceElement createNamespaceElement()
  {
    NamespaceElementImpl namespaceElement = new NamespaceElementImpl();
    return namespaceElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductElement createProductElement()
  {
    ProductElementImpl productElement = new ProductElementImpl();
    return productElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiParameterElement createMultiParameterElement()
  {
    MultiParameterElementImpl multiParameterElement = new MultiParameterElementImpl();
    return multiParameterElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterElement createParameterElement()
  {
    ParameterElementImpl parameterElement = new ParameterElementImpl();
    return parameterElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationElement createOperationElement()
  {
    OperationElementImpl operationElement = new OperationElementImpl();
    return operationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlBlockElement createControlBlockElement()
  {
    ControlBlockElementImpl controlBlockElement = new ControlBlockElementImpl();
    return controlBlockElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlStatementElement createControlStatementElement()
  {
    ControlStatementElementImpl controlStatementElement = new ControlStatementElementImpl();
    return controlStatementElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionElement createExpressionElement()
  {
    ExpressionElementImpl expressionElement = new ExpressionElementImpl();
    return expressionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticOperationElement createStaticOperationElement()
  {
    StaticOperationElementImpl staticOperationElement = new StaticOperationElementImpl();
    return staticOperationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseStatement createUseStatement()
  {
    UseStatementImpl useStatement = new UseStatementImpl();
    return useStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductPackage getProductPackage()
  {
    return (ProductPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ProductPackage getPackage()
  {
    return ProductPackage.eINSTANCE;
  }

} //ProductFactoryImpl
