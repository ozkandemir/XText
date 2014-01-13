/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOperation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.EOperationUnit#getName <em>Name</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.EOperationUnit#getControls <em>Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ykb.umap.dsl.product.ProductPackage#getEOperationUnit()
 * @model
 * @generated
 */
public interface EOperationUnit extends EObject
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
   * @see com.ykb.umap.dsl.product.ProductPackage#getEOperationUnit_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.EOperationUnit#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
   * The list contents are of type {@link com.ykb.umap.dsl.product.EControlElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controls</em>' containment reference list.
   * @see com.ykb.umap.dsl.product.ProductPackage#getEOperationUnit_Controls()
   * @model containment="true"
   * @generated
   */
  EList<EControlElement> getControls();

} // EOperationUnit
