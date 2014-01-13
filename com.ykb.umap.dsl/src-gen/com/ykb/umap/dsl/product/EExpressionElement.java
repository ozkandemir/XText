/**
 */
package com.ykb.umap.dsl.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EExpression Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.EExpressionElement#getParameter <em>Parameter</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.EExpressionElement#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.EExpressionElement#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ykb.umap.dsl.product.ProductPackage#getEExpressionElement()
 * @model
 * @generated
 */
public interface EExpressionElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference.
   * @see #setParameter(EParameterElement)
   * @see com.ykb.umap.dsl.product.ProductPackage#getEExpressionElement_Parameter()
   * @model
   * @generated
   */
  EParameterElement getParameter();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.EExpressionElement#getParameter <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(EParameterElement value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link com.ykb.umap.dsl.product.OPERATORS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see com.ykb.umap.dsl.product.OPERATORS
   * @see #setOperator(OPERATORS)
   * @see com.ykb.umap.dsl.product.ProductPackage#getEExpressionElement_Operator()
   * @model
   * @generated
   */
  OPERATORS getOperator();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.EExpressionElement#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see com.ykb.umap.dsl.product.OPERATORS
   * @see #getOperator()
   * @generated
   */
  void setOperator(OPERATORS value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' reference.
   * @see #setRight(EOperationUnit)
   * @see com.ykb.umap.dsl.product.ProductPackage#getEExpressionElement_Right()
   * @model
   * @generated
   */
  EOperationUnit getRight();

  /**
   * Sets the value of the '{@link com.ykb.umap.dsl.product.EExpressionElement#getRight <em>Right</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' reference.
   * @see #getRight()
   * @generated
   */
  void setRight(EOperationUnit value);

} // EExpressionElement
