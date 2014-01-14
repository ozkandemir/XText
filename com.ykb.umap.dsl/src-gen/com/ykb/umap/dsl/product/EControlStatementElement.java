/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EControl Statement Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.EControlStatementElement#getError <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ykb.umap.dsl.product.ProductPackage#getEControlStatementElement()
 * @model
 * @generated
 */
public interface EControlStatementElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error</em>' containment reference.
   * @see #setError(XExpression)
   * @see com.ykb.umap.dsl.product.ProductPackage#getEControlStatementElement_Error()
   * @model containment="true"
   * @generated
   */
  XExpression getError();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.EControlStatementElement#getError <em>Error</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error</em>' containment reference.
   * @see #getError()
   * @generated
   */
  void setError(XExpression value);

} // EControlStatementElement
