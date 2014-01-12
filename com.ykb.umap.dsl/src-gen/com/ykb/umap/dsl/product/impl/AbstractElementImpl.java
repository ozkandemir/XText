/**
 */
package com.ykb.umap.dsl.product.impl;

import com.ykb.umap.dsl.product.AbstractElement;
import com.ykb.umap.dsl.product.NamespaceElement;
import com.ykb.umap.dsl.product.ProductElement;
import com.ykb.umap.dsl.product.ProductPackage;
import com.ykb.umap.dsl.product.UseStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ykb.umap.dsl.product.impl.AbstractElementImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.impl.AbstractElementImpl#getUse <em>Use</em>}</li>
 *   <li>{@link com.ykb.umap.dsl.product.impl.AbstractElementImpl#getProduct <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractElementImpl extends MinimalEObjectImpl.Container implements AbstractElement
{
  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected NamespaceElement namespace;

  /**
   * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUse()
   * @generated
   * @ordered
   */
  protected UseStatement use;

  /**
   * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduct()
   * @generated
   * @ordered
   */
  protected ProductElement product;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractElementImpl()
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
    return ProductPackage.Literals.ABSTRACT_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceElement getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespace(NamespaceElement newNamespace, NotificationChain msgs)
  {
    NamespaceElement oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.ABSTRACT_ELEMENT__NAMESPACE, oldNamespace, newNamespace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(NamespaceElement newNamespace)
  {
    if (newNamespace != namespace)
    {
      NotificationChain msgs = null;
      if (namespace != null)
        msgs = ((InternalEObject)namespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ABSTRACT_ELEMENT__NAMESPACE, null, msgs);
      if (newNamespace != null)
        msgs = ((InternalEObject)newNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ABSTRACT_ELEMENT__NAMESPACE, null, msgs);
      msgs = basicSetNamespace(newNamespace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.ABSTRACT_ELEMENT__NAMESPACE, newNamespace, newNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseStatement getUse()
  {
    return use;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUse(UseStatement newUse, NotificationChain msgs)
  {
    UseStatement oldUse = use;
    use = newUse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.ABSTRACT_ELEMENT__USE, oldUse, newUse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUse(UseStatement newUse)
  {
    if (newUse != use)
    {
      NotificationChain msgs = null;
      if (use != null)
        msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ABSTRACT_ELEMENT__USE, null, msgs);
      if (newUse != null)
        msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ABSTRACT_ELEMENT__USE, null, msgs);
      msgs = basicSetUse(newUse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.ABSTRACT_ELEMENT__USE, newUse, newUse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductElement getProduct()
  {
    return product;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProduct(ProductElement newProduct, NotificationChain msgs)
  {
    ProductElement oldProduct = product;
    product = newProduct;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.ABSTRACT_ELEMENT__PRODUCT, oldProduct, newProduct);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProduct(ProductElement newProduct)
  {
    if (newProduct != product)
    {
      NotificationChain msgs = null;
      if (product != null)
        msgs = ((InternalEObject)product).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ABSTRACT_ELEMENT__PRODUCT, null, msgs);
      if (newProduct != null)
        msgs = ((InternalEObject)newProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.ABSTRACT_ELEMENT__PRODUCT, null, msgs);
      msgs = basicSetProduct(newProduct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.ABSTRACT_ELEMENT__PRODUCT, newProduct, newProduct));
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
      case ProductPackage.ABSTRACT_ELEMENT__NAMESPACE:
        return basicSetNamespace(null, msgs);
      case ProductPackage.ABSTRACT_ELEMENT__USE:
        return basicSetUse(null, msgs);
      case ProductPackage.ABSTRACT_ELEMENT__PRODUCT:
        return basicSetProduct(null, msgs);
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
      case ProductPackage.ABSTRACT_ELEMENT__NAMESPACE:
        return getNamespace();
      case ProductPackage.ABSTRACT_ELEMENT__USE:
        return getUse();
      case ProductPackage.ABSTRACT_ELEMENT__PRODUCT:
        return getProduct();
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
      case ProductPackage.ABSTRACT_ELEMENT__NAMESPACE:
        setNamespace((NamespaceElement)newValue);
        return;
      case ProductPackage.ABSTRACT_ELEMENT__USE:
        setUse((UseStatement)newValue);
        return;
      case ProductPackage.ABSTRACT_ELEMENT__PRODUCT:
        setProduct((ProductElement)newValue);
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
      case ProductPackage.ABSTRACT_ELEMENT__NAMESPACE:
        setNamespace((NamespaceElement)null);
        return;
      case ProductPackage.ABSTRACT_ELEMENT__USE:
        setUse((UseStatement)null);
        return;
      case ProductPackage.ABSTRACT_ELEMENT__PRODUCT:
        setProduct((ProductElement)null);
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
      case ProductPackage.ABSTRACT_ELEMENT__NAMESPACE:
        return namespace != null;
      case ProductPackage.ABSTRACT_ELEMENT__USE:
        return use != null;
      case ProductPackage.ABSTRACT_ELEMENT__PRODUCT:
        return product != null;
    }
    return super.eIsSet(featureID);
  }

} //AbstractElementImpl
