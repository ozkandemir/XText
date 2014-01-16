/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECompilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.ECompilationUnit#getNamespaceUnit <em>Namespace Unit</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.ECompilationUnit#getUseUnit <em>Use Unit</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.ECompilationUnit#getProductUnit <em>Product Unit</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.ECompilationUnit#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ykb.umap.dsl.product.ProductPackage#getECompilationUnit()
 * @model
 * @generated
 */
public interface ECompilationUnit extends EObject
{
  /**
   * Returns the value of the '<em><b>Namespace Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace Unit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace Unit</em>' containment reference.
   * @see #setNamespaceUnit(ENamespaceUnit)
   * @see com.ykb.umap.dsl.product.ProductPackage#getECompilationUnit_NamespaceUnit()
   * @model containment="true"
   * @generated
   */
  ENamespaceUnit getNamespaceUnit();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.ECompilationUnit#getNamespaceUnit <em>Namespace Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace Unit</em>' containment reference.
   * @see #getNamespaceUnit()
   * @generated
   */
  void setNamespaceUnit(ENamespaceUnit value);

  /**
   * Returns the value of the '<em><b>Use Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Unit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Unit</em>' containment reference.
   * @see #setUseUnit(EUseUnit)
   * @see com.ykb.umap.dsl.product.ProductPackage#getECompilationUnit_UseUnit()
   * @model containment="true"
   * @generated
   */
  EUseUnit getUseUnit();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.ECompilationUnit#getUseUnit <em>Use Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Use Unit</em>' containment reference.
   * @see #getUseUnit()
   * @generated
   */
  void setUseUnit(EUseUnit value);

  /**
   * Returns the value of the '<em><b>Product Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product Unit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product Unit</em>' containment reference.
   * @see #setProductUnit(EProductUnit)
   * @see com.ykb.umap.dsl.product.ProductPackage#getECompilationUnit_ProductUnit()
   * @model containment="true"
   * @generated
   */
  EProductUnit getProductUnit();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.ECompilationUnit#getProductUnit <em>Product Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product Unit</em>' containment reference.
   * @see #getProductUnit()
   * @generated
   */
  void setProductUnit(EProductUnit value);

  /**
   * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
   * The list contents are of type {@link com.ykb.umap.dsl.product.EDataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Types</em>' containment reference list.
   * @see com.ykb.umap.dsl.product.ProductPackage#getECompilationUnit_DataTypes()
   * @model containment="true"
   * @generated
   */
  EList<EDataType> getDataTypes();

} // ECompilationUnit
