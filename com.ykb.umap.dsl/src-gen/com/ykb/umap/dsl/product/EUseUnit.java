/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EUse Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.EUseUnit#getProductUnit <em>Product Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ykb.umap.dsl.product.ProductPackage#getEUseUnit()
 * @model
 * @generated
 */
public interface EUseUnit extends EObject
{
  /**
   * Returns the value of the '<em><b>Product Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product Unit</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product Unit</em>' reference.
   * @see #setProductUnit(EProductUnit)
   * @see com.ykb.umap.dsl.product.ProductPackage#getEUseUnit_ProductUnit()
   * @model
   * @generated
   */
  EProductUnit getProductUnit();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.EUseUnit#getProductUnit <em>Product Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product Unit</em>' reference.
   * @see #getProductUnit()
   * @generated
   */
  void setProductUnit(EProductUnit value);

} // EUseUnit
