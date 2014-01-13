/**
 */
package com.ykb.umap.dsl.product.impl;

import com.ykb.umap.dsl.product.EOperationUnit;
import com.ykb.umap.dsl.product.EParameterElement;
import com.ykb.umap.dsl.product.EProductUnit;
import com.ykb.umap.dsl.product.ProductPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EProduct Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.impl.EProductUnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.impl.EProductUnitImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.impl.EProductUnitImpl#getOperationUnit <em>Operation Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EProductUnitImpl extends MinimalEObjectImpl.Container implements EProductUnit
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<EParameterElement> parameters;

  /**
   * The cached value of the '{@link #getOperationUnit() <em>Operation Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationUnit()
   * @generated
   * @ordered
   */
  protected EOperationUnit operationUnit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EProductUnitImpl()
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
    return ProductPackage.Literals.EPRODUCT_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.EPRODUCT_UNIT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EParameterElement> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<EParameterElement>(EParameterElement.class, this, ProductPackage.EPRODUCT_UNIT__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperationUnit getOperationUnit()
  {
    return operationUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperationUnit(EOperationUnit newOperationUnit, NotificationChain msgs)
  {
    EOperationUnit oldOperationUnit = operationUnit;
    operationUnit = newOperationUnit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.EPRODUCT_UNIT__OPERATION_UNIT, oldOperationUnit, newOperationUnit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperationUnit(EOperationUnit newOperationUnit)
  {
    if (newOperationUnit != operationUnit)
    {
      NotificationChain msgs = null;
      if (operationUnit != null)
        msgs = ((InternalEObject)operationUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.EPRODUCT_UNIT__OPERATION_UNIT, null, msgs);
      if (newOperationUnit != null)
        msgs = ((InternalEObject)newOperationUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.EPRODUCT_UNIT__OPERATION_UNIT, null, msgs);
      msgs = basicSetOperationUnit(newOperationUnit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.EPRODUCT_UNIT__OPERATION_UNIT, newOperationUnit, newOperationUnit));
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
      case ProductPackage.EPRODUCT_UNIT__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case ProductPackage.EPRODUCT_UNIT__OPERATION_UNIT:
        return basicSetOperationUnit(null, msgs);
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
      case ProductPackage.EPRODUCT_UNIT__NAME:
        return getName();
      case ProductPackage.EPRODUCT_UNIT__PARAMETERS:
        return getParameters();
      case ProductPackage.EPRODUCT_UNIT__OPERATION_UNIT:
        return getOperationUnit();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProductPackage.EPRODUCT_UNIT__NAME:
        setName((String)newValue);
        return;
      case ProductPackage.EPRODUCT_UNIT__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends EParameterElement>)newValue);
        return;
      case ProductPackage.EPRODUCT_UNIT__OPERATION_UNIT:
        setOperationUnit((EOperationUnit)newValue);
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
      case ProductPackage.EPRODUCT_UNIT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProductPackage.EPRODUCT_UNIT__PARAMETERS:
        getParameters().clear();
        return;
      case ProductPackage.EPRODUCT_UNIT__OPERATION_UNIT:
        setOperationUnit((EOperationUnit)null);
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
      case ProductPackage.EPRODUCT_UNIT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProductPackage.EPRODUCT_UNIT__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case ProductPackage.EPRODUCT_UNIT__OPERATION_UNIT:
        return operationUnit != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EProductUnitImpl
