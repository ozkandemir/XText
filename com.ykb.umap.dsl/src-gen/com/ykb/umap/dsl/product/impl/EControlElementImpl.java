/**
 */
package com.ykb.umap.dsl.product.impl;

import com.ykb.umap.dsl.product.EControlElement;
import com.ykb.umap.dsl.product.EControlStatementElement;
import com.ykb.umap.dsl.product.EExpressionElement;
import com.ykb.umap.dsl.product.ProductPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EControl Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.impl.EControlElementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.impl.EControlElementImpl#getControlStatement <em>Control Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EControlElementImpl extends MinimalEObjectImpl.Container implements EControlElement
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EExpressionElement expression;

  /**
   * The cached value of the '{@link #getControlStatement() <em>Control Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlStatement()
   * @generated
   * @ordered
   */
  protected EControlStatementElement controlStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EControlElementImpl()
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
    return ProductPackage.Literals.ECONTROL_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EExpressionElement getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(EExpressionElement newExpression, NotificationChain msgs)
  {
    EExpressionElement oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.ECONTROL_ELEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(EExpressionElement newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ECONTROL_ELEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ECONTROL_ELEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.ECONTROL_ELEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EControlStatementElement getControlStatement()
  {
    return controlStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetControlStatement(EControlStatementElement newControlStatement, NotificationChain msgs)
  {
    EControlStatementElement oldControlStatement = controlStatement;
    controlStatement = newControlStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.ECONTROL_ELEMENT__CONTROL_STATEMENT, oldControlStatement, newControlStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControlStatement(EControlStatementElement newControlStatement)
  {
    if (newControlStatement != controlStatement)
    {
      NotificationChain msgs = null;
      if (controlStatement != null)
        msgs = ((InternalEObject)controlStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ECONTROL_ELEMENT__CONTROL_STATEMENT, null, msgs);
      if (newControlStatement != null)
        msgs = ((InternalEObject)newControlStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ECONTROL_ELEMENT__CONTROL_STATEMENT, null, msgs);
      msgs = basicSetControlStatement(newControlStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.ECONTROL_ELEMENT__CONTROL_STATEMENT, newControlStatement, newControlStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProductPackage.ECONTROL_ELEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case ProductPackage.ECONTROL_ELEMENT__CONTROL_STATEMENT:
        return basicSetControlStatement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ProductPackage.ECONTROL_ELEMENT__EXPRESSION:
        return getExpression();
      case ProductPackage.ECONTROL_ELEMENT__CONTROL_STATEMENT:
        return getControlStatement();
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
      case ProductPackage.ECONTROL_ELEMENT__EXPRESSION:
        setExpression((EExpressionElement)newValue);
        return;
      case ProductPackage.ECONTROL_ELEMENT__CONTROL_STATEMENT:
        setControlStatement((EControlStatementElement)newValue);
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
      case ProductPackage.ECONTROL_ELEMENT__EXPRESSION:
        setExpression((EExpressionElement)null);
        return;
      case ProductPackage.ECONTROL_ELEMENT__CONTROL_STATEMENT:
        setControlStatement((EControlStatementElement)null);
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
      case ProductPackage.ECONTROL_ELEMENT__EXPRESSION:
        return expression != null;
      case ProductPackage.ECONTROL_ELEMENT__CONTROL_STATEMENT:
        return controlStatement != null;
    }
    return super.eIsSet(featureID);
  }

} //EControlElementImpl
