/**
 */
package com.ykb.umap.dsl.product.impl;

import com.ykb.umap.dsl.product.ECompilationUnit;
import com.ykb.umap.dsl.product.EDataType;
import com.ykb.umap.dsl.product.ENamespaceUnit;
import com.ykb.umap.dsl.product.EProductUnit;
import com.ykb.umap.dsl.product.EUseUnit;
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
 * An implementation of the model object '<em><b>ECompilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.impl.ECompilationUnitImpl#getNamespaceUnit <em>Namespace Unit</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.impl.ECompilationUnitImpl#getUseUnit <em>Use Unit</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.impl.ECompilationUnitImpl#getProductUnit <em>Product Unit</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.impl.ECompilationUnitImpl#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECompilationUnitImpl extends MinimalEObjectImpl.Container implements ECompilationUnit
{
  /**
   * The cached value of the '{@link #getNamespaceUnit() <em>Namespace Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespaceUnit()
   * @generated
   * @ordered
   */
  protected ENamespaceUnit namespaceUnit;

  /**
   * The cached value of the '{@link #getUseUnit() <em>Use Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseUnit()
   * @generated
   * @ordered
   */
  protected EUseUnit useUnit;

  /**
   * The cached value of the '{@link #getProductUnit() <em>Product Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductUnit()
   * @generated
   * @ordered
   */
  protected EProductUnit productUnit;

  /**
   * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataTypes()
   * @generated
   * @ordered
   */
  protected EList<EDataType> dataTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ECompilationUnitImpl()
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
    return ProductPackage.Literals.ECOMPILATION_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamespaceUnit getNamespaceUnit()
  {
    return namespaceUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespaceUnit(ENamespaceUnit newNamespaceUnit, NotificationChain msgs)
  {
    ENamespaceUnit oldNamespaceUnit = namespaceUnit;
    namespaceUnit = newNamespaceUnit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.ECOMPILATION_UNIT__NAMESPACE_UNIT, oldNamespaceUnit, newNamespaceUnit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespaceUnit(ENamespaceUnit newNamespaceUnit)
  {
    if (newNamespaceUnit != namespaceUnit)
    {
      NotificationChain msgs = null;
      if (namespaceUnit != null)
        msgs = ((InternalEObject)namespaceUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ECOMPILATION_UNIT__NAMESPACE_UNIT, null, msgs);
      if (newNamespaceUnit != null)
        msgs = ((InternalEObject)newNamespaceUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ECOMPILATION_UNIT__NAMESPACE_UNIT, null, msgs);
      msgs = basicSetNamespaceUnit(newNamespaceUnit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.ECOMPILATION_UNIT__NAMESPACE_UNIT, newNamespaceUnit, newNamespaceUnit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EUseUnit getUseUnit()
  {
    return useUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUseUnit(EUseUnit newUseUnit, NotificationChain msgs)
  {
    EUseUnit oldUseUnit = useUnit;
    useUnit = newUseUnit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.ECOMPILATION_UNIT__USE_UNIT, oldUseUnit, newUseUnit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUseUnit(EUseUnit newUseUnit)
  {
    if (newUseUnit != useUnit)
    {
      NotificationChain msgs = null;
      if (useUnit != null)
        msgs = ((InternalEObject)useUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ECOMPILATION_UNIT__USE_UNIT, null, msgs);
      if (newUseUnit != null)
        msgs = ((InternalEObject)newUseUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ECOMPILATION_UNIT__USE_UNIT, null, msgs);
      msgs = basicSetUseUnit(newUseUnit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.ECOMPILATION_UNIT__USE_UNIT, newUseUnit, newUseUnit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EProductUnit getProductUnit()
  {
    return productUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProductUnit(EProductUnit newProductUnit, NotificationChain msgs)
  {
    EProductUnit oldProductUnit = productUnit;
    productUnit = newProductUnit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.ECOMPILATION_UNIT__PRODUCT_UNIT, oldProductUnit, newProductUnit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProductUnit(EProductUnit newProductUnit)
  {
    if (newProductUnit != productUnit)
    {
      NotificationChain msgs = null;
      if (productUnit != null)
        msgs = ((InternalEObject)productUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ECOMPILATION_UNIT__PRODUCT_UNIT, null, msgs);
      if (newProductUnit != null)
        msgs = ((InternalEObject)newProductUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ECOMPILATION_UNIT__PRODUCT_UNIT, null, msgs);
      msgs = basicSetProductUnit(newProductUnit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.ECOMPILATION_UNIT__PRODUCT_UNIT, newProductUnit, newProductUnit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EDataType> getDataTypes()
  {
    if (dataTypes == null)
    {
      dataTypes = new EObjectContainmentEList<EDataType>(EDataType.class, this, ProductPackage.ECOMPILATION_UNIT__DATA_TYPES);
    }
    return dataTypes;
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
      case ProductPackage.ECOMPILATION_UNIT__NAMESPACE_UNIT:
        return basicSetNamespaceUnit(null, msgs);
      case ProductPackage.ECOMPILATION_UNIT__USE_UNIT:
        return basicSetUseUnit(null, msgs);
      case ProductPackage.ECOMPILATION_UNIT__PRODUCT_UNIT:
        return basicSetProductUnit(null, msgs);
      case ProductPackage.ECOMPILATION_UNIT__DATA_TYPES:
        return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
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
      case ProductPackage.ECOMPILATION_UNIT__NAMESPACE_UNIT:
        return getNamespaceUnit();
      case ProductPackage.ECOMPILATION_UNIT__USE_UNIT:
        return getUseUnit();
      case ProductPackage.ECOMPILATION_UNIT__PRODUCT_UNIT:
        return getProductUnit();
      case ProductPackage.ECOMPILATION_UNIT__DATA_TYPES:
        return getDataTypes();
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
      case ProductPackage.ECOMPILATION_UNIT__NAMESPACE_UNIT:
        setNamespaceUnit((ENamespaceUnit)newValue);
        return;
      case ProductPackage.ECOMPILATION_UNIT__USE_UNIT:
        setUseUnit((EUseUnit)newValue);
        return;
      case ProductPackage.ECOMPILATION_UNIT__PRODUCT_UNIT:
        setProductUnit((EProductUnit)newValue);
        return;
      case ProductPackage.ECOMPILATION_UNIT__DATA_TYPES:
        getDataTypes().clear();
        getDataTypes().addAll((Collection<? extends EDataType>)newValue);
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
      case ProductPackage.ECOMPILATION_UNIT__NAMESPACE_UNIT:
        setNamespaceUnit((ENamespaceUnit)null);
        return;
      case ProductPackage.ECOMPILATION_UNIT__USE_UNIT:
        setUseUnit((EUseUnit)null);
        return;
      case ProductPackage.ECOMPILATION_UNIT__PRODUCT_UNIT:
        setProductUnit((EProductUnit)null);
        return;
      case ProductPackage.ECOMPILATION_UNIT__DATA_TYPES:
        getDataTypes().clear();
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
      case ProductPackage.ECOMPILATION_UNIT__NAMESPACE_UNIT:
        return namespaceUnit != null;
      case ProductPackage.ECOMPILATION_UNIT__USE_UNIT:
        return useUnit != null;
      case ProductPackage.ECOMPILATION_UNIT__PRODUCT_UNIT:
        return productUnit != null;
      case ProductPackage.ECOMPILATION_UNIT__DATA_TYPES:
        return dataTypes != null && !dataTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ECompilationUnitImpl
