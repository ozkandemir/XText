/**
 */
package com.ykb.umap.dsl.product.impl;

import com.ykb.umap.dsl.product.EDataType;
import com.ykb.umap.dsl.product.EOperationUnit;
import com.ykb.umap.dsl.product.EParameterElement;
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
 * An implementation of the model object '<em><b>EData Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.impl.EDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.impl.EDataTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.impl.EDataTypeImpl#getOperationUnits <em>Operation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDataTypeImpl extends MinimalEObjectImpl.Container implements EDataType
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
   * The cached value of the '{@link #getOperationUnits() <em>Operation Units</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationUnits()
   * @generated
   * @ordered
   */
  protected EList<EOperationUnit> operationUnits;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EDataTypeImpl()
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
    return ProductPackage.Literals.EDATA_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.EDATA_TYPE__NAME, oldName, name));
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
      parameters = new EObjectContainmentEList<EParameterElement>(EParameterElement.class, this, ProductPackage.EDATA_TYPE__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EOperationUnit> getOperationUnits()
  {
    if (operationUnits == null)
    {
      operationUnits = new EObjectContainmentEList<EOperationUnit>(EOperationUnit.class, this, ProductPackage.EDATA_TYPE__OPERATION_UNITS);
    }
    return operationUnits;
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
      case ProductPackage.EDATA_TYPE__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case ProductPackage.EDATA_TYPE__OPERATION_UNITS:
        return ((InternalEList<?>)getOperationUnits()).basicRemove(otherEnd, msgs);
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
      case ProductPackage.EDATA_TYPE__NAME:
        return getName();
      case ProductPackage.EDATA_TYPE__PARAMETERS:
        return getParameters();
      case ProductPackage.EDATA_TYPE__OPERATION_UNITS:
        return getOperationUnits();
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
      case ProductPackage.EDATA_TYPE__NAME:
        setName((String)newValue);
        return;
      case ProductPackage.EDATA_TYPE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends EParameterElement>)newValue);
        return;
      case ProductPackage.EDATA_TYPE__OPERATION_UNITS:
        getOperationUnits().clear();
        getOperationUnits().addAll((Collection<? extends EOperationUnit>)newValue);
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
      case ProductPackage.EDATA_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProductPackage.EDATA_TYPE__PARAMETERS:
        getParameters().clear();
        return;
      case ProductPackage.EDATA_TYPE__OPERATION_UNITS:
        getOperationUnits().clear();
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
      case ProductPackage.EDATA_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProductPackage.EDATA_TYPE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case ProductPackage.EDATA_TYPE__OPERATION_UNITS:
        return operationUnits != null && !operationUnits.isEmpty();
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

} //EDataTypeImpl
