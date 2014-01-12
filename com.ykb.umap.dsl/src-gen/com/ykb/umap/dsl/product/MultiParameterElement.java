/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Parameter Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.MultiParameterElement#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ykb.umap.dsl.product.ProductPackage#getMultiParameterElement()
 * @model
 * @generated
 */
public interface MultiParameterElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link com.ykb.umap.dsl.product.ParameterElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see com.ykb.umap.dsl.product.ProductPackage#getMultiParameterElement_Params()
   * @model containment="true"
   * @generated
   */
  EList<ParameterElement> getParams();

} // MultiParameterElement
