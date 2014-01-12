/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Operation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.StaticOperationElement#getOpName <em>Op Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ykb.umap.dsl.product.ProductPackage#getStaticOperationElement()
 * @model
 * @generated
 */
public interface StaticOperationElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Op Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Name</em>' attribute.
   * @see #setOpName(String)
   * @see com.ykb.umap.dsl.product.ProductPackage#getStaticOperationElement_OpName()
   * @model
   * @generated
   */
  String getOpName();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.StaticOperationElement#getOpName <em>Op Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Name</em>' attribute.
   * @see #getOpName()
   * @generated
   */
  void setOpName(String value);

} // StaticOperationElement
