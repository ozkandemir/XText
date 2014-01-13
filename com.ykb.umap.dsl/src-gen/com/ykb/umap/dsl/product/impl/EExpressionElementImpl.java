/**
 */
package com.ykb.umap.dsl.product.impl;

import com.ykb.umap.dsl.product.EExpressionElement;
import com.ykb.umap.dsl.product.EOperationUnit;
import com.ykb.umap.dsl.product.EParameterElement;
import com.ykb.umap.dsl.product.OPERATORS;
import com.ykb.umap.dsl.product.ProductPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EExpression Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.impl.EExpressionElementImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.impl.EExpressionElementImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.impl.EExpressionElementImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EExpressionElementImpl extends MinimalEObjectImpl.Container implements EExpressionElement
{
  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected EParameterElement parameter;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final OPERATORS OPERATOR_EDEFAULT = OPERATORS.IS;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected OPERATORS operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EOperationUnit right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EExpressionElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProductPackage.Literals.EEXPRESSION_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EParameterElement getParameter()
  {
    if (parameter != null && parameter.eIsProxy())
    {
      InternalEObject oldParameter = (InternalEObject)parameter;
      parameter = (EParameterElement)eResolveProxy(oldParameter);
      if (parameter != oldParameter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.EEXPRESSION_ELEMENT__PARAMETER, oldParameter, parameter));
      }
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EParameterElement basicGetParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(EParameterElement newParameter)
  {
    EParameterElement oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.EEXPRESSION_ELEMENT__PARAMETER, oldParameter, parameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OPERATORS getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(OPERATORS newOperator)
  {
    OPERATORS oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.EEXPRESSION_ELEMENT__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperationUnit getRight()
  {
    if (right != null && right.eIsProxy())
    {
      InternalEObject oldRight = (InternalEObject)right;
      right = (EOperationUnit)eResolveProxy(oldRight);
      if (right != oldRight)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.EEXPRESSION_ELEMENT__RIGHT, oldRight, right));
      }
    }
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperationUnit basicGetRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(EOperationUnit newRight)
  {
    EOperationUnit oldRight = right;
    right = newRight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.EEXPRESSION_ELEMENT__RIGHT, oldRight, right));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProductPackage.EEXPRESSION_ELEMENT__PARAMETER:
        if (resolve) return getParameter();
        return basicGetParameter();
      case ProductPackage.EEXPRESSION_ELEMENT__OPERATOR:
        return getOperator();
      case ProductPackage.EEXPRESSION_ELEMENT__RIGHT:
        if (resolve) return getRight();
        return basicGetRight();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProductPackage.EEXPRESSION_ELEMENT__PARAMETER:
        setParameter((EParameterElement)newValue);
        return;
      case ProductPackage.EEXPRESSION_ELEMENT__OPERATOR:
        setOperator((OPERATORS)newValue);
        return;
      case ProductPackage.EEXPRESSION_ELEMENT__RIGHT:
        setRight((EOperationUnit)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProductPackage.EEXPRESSION_ELEMENT__PARAMETER:
        setParameter((EParameterElement)null);
        return;
      case ProductPackage.EEXPRESSION_ELEMENT__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case ProductPackage.EEXPRESSION_ELEMENT__RIGHT:
        setRight((EOperationUnit)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProductPackage.EEXPRESSION_ELEMENT__PARAMETER:
        return parameter != null;
      case ProductPackage.EEXPRESSION_ELEMENT__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case ProductPackage.EEXPRESSION_ELEMENT__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //EExpressionElementImpl
