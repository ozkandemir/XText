/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.ykb.umap.dsl.product.ProductPackage
 * @generated
 */
public interface ProductFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProductFactory eINSTANCE = com.ykb.umap.dsl.product.impl.ProductFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Product</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product</em>'.
   * @generated
   */
  Product createProduct();

  /**
   * Returns a new object of class '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element</em>'.
   * @generated
   */
  AbstractElement createAbstractElement();

  /**
   * Returns a new object of class '<em>Namespace Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace Element</em>'.
   * @generated
   */
  NamespaceElement createNamespaceElement();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  ProductElement createProductElement();

  /**
   * Returns a new object of class '<em>Multi Parameter Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Parameter Element</em>'.
   * @generated
   */
  MultiParameterElement createMultiParameterElement();

  /**
   * Returns a new object of class '<em>Parameter Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Element</em>'.
   * @generated
   */
  ParameterElement createParameterElement();

  /**
   * Returns a new object of class '<em>Operation Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Element</em>'.
   * @generated
   */
  OperationElement createOperationElement();

  /**
   * Returns a new object of class '<em>Control Block Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Block Element</em>'.
   * @generated
   */
  ControlBlockElement createControlBlockElement();

  /**
   * Returns a new object of class '<em>Control Statement Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Statement Element</em>'.
   * @generated
   */
  ControlStatementElement createControlStatementElement();

  /**
   * Returns a new object of class '<em>Expression Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Element</em>'.
   * @generated
   */
  ExpressionElement createExpressionElement();

  /**
   * Returns a new object of class '<em>Static Operation Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Operation Element</em>'.
   * @generated
   */
  StaticOperationElement createStaticOperationElement();

  /**
   * Returns a new object of class '<em>Use Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use Statement</em>'.
   * @generated
   */
  UseStatement createUseStatement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ProductPackage getProductPackage();

} //ProductFactory
