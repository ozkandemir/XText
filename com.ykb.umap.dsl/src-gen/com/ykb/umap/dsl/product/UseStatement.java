/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.UseStatement#getProduct <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ykb.umap.dsl.product.ProductPackage#getUseStatement()
 * @model
 * @generated
 */
public interface UseStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Product</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product</em>' reference.
   * @see #setProduct(ProductElement)
   * @see com.ykb.umap.dsl.product.ProductPackage#getUseStatement_Product()
   * @model
   * @generated
   */
  ProductElement getProduct();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.UseStatement#getProduct <em>Product</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product</em>' reference.
   * @see #getProduct()
   * @generated
   */
  void setProduct(ProductElement value);

} // UseStatement
