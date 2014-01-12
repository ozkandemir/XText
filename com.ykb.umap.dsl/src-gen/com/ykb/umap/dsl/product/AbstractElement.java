/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.AbstractElement#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.AbstractElement#getUse <em>Use</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.AbstractElement#getProduct <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ykb.umap.dsl.product.ProductPackage#getAbstractElement()
 * @model
 * @generated
 */
public interface AbstractElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' containment reference.
   * @see #setNamespace(NamespaceElement)
   * @see com.ykb.umap.dsl.product.ProductPackage#getAbstractElement_Namespace()
   * @model containment="true"
   * @generated
   */
  NamespaceElement getNamespace();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.AbstractElement#getNamespace <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' containment reference.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(NamespaceElement value);

  /**
   * Returns the value of the '<em><b>Use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use</em>' containment reference.
   * @see #setUse(UseStatement)
   * @see com.ykb.umap.dsl.product.ProductPackage#getAbstractElement_Use()
   * @model containment="true"
   * @generated
   */
  UseStatement getUse();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.AbstractElement#getUse <em>Use</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Use</em>' containment reference.
   * @see #getUse()
   * @generated
   */
  void setUse(UseStatement value);

  /**
   * Returns the value of the '<em><b>Product</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product</em>' containment reference.
   * @see #setProduct(ProductElement)
   * @see com.ykb.umap.dsl.product.ProductPackage#getAbstractElement_Product()
   * @model containment="true"
   * @generated
   */
  ProductElement getProduct();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.AbstractElement#getProduct <em>Product</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product</em>' containment reference.
   * @see #getProduct()
   * @generated
   */
  void setProduct(ProductElement value);

} // AbstractElement
