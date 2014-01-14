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
   * Returns a new object of class '<em>EProduct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EProduct</em>'.
   * @generated
   */
  EProduct createEProduct();

  /**
   * Returns a new object of class '<em>ECompilation Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECompilation Unit</em>'.
   * @generated
   */
  ECompilationUnit createECompilationUnit();

  /**
   * Returns a new object of class '<em>EUse Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EUse Unit</em>'.
   * @generated
   */
  EUseUnit createEUseUnit();

  /**
   * Returns a new object of class '<em>ENamespace Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ENamespace Unit</em>'.
   * @generated
   */
  ENamespaceUnit createENamespaceUnit();

  /**
   * Returns a new object of class '<em>EProduct Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EProduct Unit</em>'.
   * @generated
   */
  EProductUnit createEProductUnit();

  /**
   * Returns a new object of class '<em>EParameter Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EParameter Element</em>'.
   * @generated
   */
  EParameterElement createEParameterElement();

  /**
   * Returns a new object of class '<em>EOperation Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EOperation Unit</em>'.
   * @generated
   */
  EOperationUnit createEOperationUnit();

  /**
   * Returns a new object of class '<em>EStatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EStatement</em>'.
   * @generated
   */
  EStatement createEStatement();

  /**
   * Returns a new object of class '<em>EControl Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EControl Element</em>'.
   * @generated
   */
  EControlElement createEControlElement();

  /**
   * Returns a new object of class '<em>EExpression Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EExpression Element</em>'.
   * @generated
   */
  EExpressionElement createEExpressionElement();

  /**
   * Returns a new object of class '<em>EControl Statement Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EControl Statement Element</em>'.
   * @generated
   */
  EControlStatementElement createEControlStatementElement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ProductPackage getProductPackage();

} //ProductFactory
