/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EControl Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.EControlElement#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.EControlElement#getControlStatement <em>Control Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ykb.umap.dsl.product.ProductPackage#getEControlElement()
 * @model
 * @generated
 */
public interface EControlElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(EExpressionElement)
   * @see com.ykb.umap.dsl.product.ProductPackage#getEControlElement_Expression()
   * @model containment="true"
   * @generated
   */
  EExpressionElement getExpression();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.EControlElement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(EExpressionElement value);

  /**
   * Returns the value of the '<em><b>Control Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Control Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Statement</em>' containment reference.
   * @see #setControlStatement(EControlStatementElement)
   * @see com.ykb.umap.dsl.product.ProductPackage#getEControlElement_ControlStatement()
   * @model containment="true"
   * @generated
   */
  EControlStatementElement getControlStatement();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.EControlElement#getControlStatement <em>Control Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Statement</em>' containment reference.
   * @see #getControlStatement()
   * @generated
   */
  void setControlStatement(EControlStatementElement value);

} // EControlElement
