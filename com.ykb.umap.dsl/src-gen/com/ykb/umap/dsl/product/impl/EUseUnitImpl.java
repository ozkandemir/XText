/**
 */
package com.ykb.umap.dsl.product.impl;

import com.ykb.umap.dsl.product.EProductUnit;
import com.ykb.umap.dsl.product.EUseUnit;
import com.ykb.umap.dsl.product.ProductPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EUse Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.impl.EUseUnitImpl#getProductUnit <em>Product Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EUseUnitImpl extends MinimalEObjectImpl.Container implements EUseUnit
{
  /**
   * The cached value of the '{@link #getProductUnit() <em>Product Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductUnit()
   * @generated
   * @ordered
   */
  protected EProductUnit productUnit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EUseUnitImpl()
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
    return ProductPackage.Literals.EUSE_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EProductUnit getProductUnit()
  {
    if (productUnit != null && productUnit.eIsProxy())
    {
      InternalEObject oldProductUnit = (InternalEObject)productUnit;
      productUnit = (EProductUnit)eResolveProxy(oldProductUnit);
      if (productUnit != oldProductUnit)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.EUSE_UNIT__PRODUCT_UNIT, oldProductUnit, productUnit));
      }
    }
    return productUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EProductUnit basicGetProductUnit()
  {
    return productUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProductUnit(EProductUnit newProductUnit)
  {
    EProductUnit oldProductUnit = productUnit;
    productUnit = newProductUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.EUSE_UNIT__PRODUCT_UNIT, oldProductUnit, productUnit));
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
      case ProductPackage.EUSE_UNIT__PRODUCT_UNIT:
        if (resolve) return getProductUnit();
        return basicGetProductUnit();
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
      case ProductPackage.EUSE_UNIT__PRODUCT_UNIT:
        setProductUnit((EProductUnit)newValue);
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
      case ProductPackage.EUSE_UNIT__PRODUCT_UNIT:
        setProductUnit((EProductUnit)null);
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
      case ProductPackage.EUSE_UNIT__PRODUCT_UNIT:
        return productUnit != null;
    }
    return super.eIsSet(featureID);
  }

} //EUseUnitImpl
