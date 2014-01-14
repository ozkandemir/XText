/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EProduct Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.EProductUnit#getName <em>Name</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.EProductUnit#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.EProductUnit#getOperationUnits <em>Operation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ykb.umap.dsl.product.ProductPackage#getEProductUnit()
 * @model
 * @generated
 */
public interface EProductUnit extends EObject
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
   * @see com.ykb.umap.dsl.product.ProductPackage#getEProductUnit_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.EProductUnit#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.ykb.umap.dsl.product.EParameterElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see com.ykb.umap.dsl.product.ProductPackage#getEProductUnit_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<EParameterElement> getParameters();

  /**
   * Returns the value of the '<em><b>Operation Units</b></em>' containment reference list.
   * The list contents are of type {@link com.ykb.umap.dsl.product.EOperationUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Units</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Units</em>' containment reference list.
   * @see com.ykb.umap.dsl.product.ProductPackage#getEProductUnit_OperationUnits()
   * @model containment="true"
   * @generated
   */
  EList<EOperationUnit> getOperationUnits();

} // EProductUnit
