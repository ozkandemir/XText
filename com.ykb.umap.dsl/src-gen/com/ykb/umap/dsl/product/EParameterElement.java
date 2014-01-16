/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EParameter Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.EParameterElement#getName <em>Name</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.EParameterElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ykb.umap.dsl.product.ProductPackage#getEParameterElement()
 * @model
 * @generated
 */
public interface EParameterElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.ykb.umap.dsl.product.ProductPackage#getEParameterElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.EParameterElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(EDataType)
   * @see com.ykb.umap.dsl.product.ProductPackage#getEParameterElement_Type()
   * @model
   * @generated
   */
  EDataType getType();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.EParameterElement#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(EDataType value);

} // EParameterElement
