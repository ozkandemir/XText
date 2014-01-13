/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EControl Statement Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.EControlStatementElement#getMessage <em>Message</em>}</li>
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
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see com.ykb.umap.dsl.product.ProductPackage#getEControlStatementElement_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.EControlStatementElement#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

} // EControlStatementElement
