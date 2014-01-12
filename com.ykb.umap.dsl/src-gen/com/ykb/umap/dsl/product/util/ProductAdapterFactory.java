/**
 */
package com.ykb.umap.dsl.product.util;

import com.ykb.umap.dsl.product.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.ykb.umap.dsl.product.ProductPackage
 * @generated
 */
public class ProductAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProductPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ProductPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProductSwitch<Adapter> modelSwitch =
    new ProductSwitch<Adapter>()
    {
      @Override
      public Adapter caseProduct(Product object)
      {
        return createProductAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter caseNamespaceElement(NamespaceElement object)
      {
        return createNamespaceElementAdapter();
      }
      @Override
      public Adapter caseProductElement(ProductElement object)
      {
        return createProductElementAdapter();
      }
      @Override
      public Adapter caseMultiParameterElement(MultiParameterElement object)
      {
        return createMultiParameterElementAdapter();
      }
      @Override
      public Adapter caseParameterElement(ParameterElement object)
      {
        return createParameterElementAdapter();
      }
      @Override
      public Adapter caseOperationElement(OperationElement object)
      {
        return createOperationElementAdapter();
      }
      @Override
      public Adapter caseControlBlockElement(ControlBlockElement object)
      {
        return createControlBlockElementAdapter();
      }
      @Override
      public Adapter caseControlStatementElement(ControlStatementElement object)
      {
        return createControlStatementElementAdapter();
      }
      @Override
      public Adapter caseExpressionElement(ExpressionElement object)
      {
        return createExpressionElementAdapter();
      }
      @Override
      public Adapter caseStaticOperationElement(StaticOperationElement object)
      {
        return createStaticOperationElementAdapter();
      }
      @Override
      public Adapter caseUseStatement(UseStatement object)
      {
        return createUseStatementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.Product <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.Product
   * @generated
   */
  public Adapter createProductAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.NamespaceElement <em>Namespace Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.NamespaceElement
   * @generated
   */
  public Adapter createNamespaceElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.ProductElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.ProductElement
   * @generated
   */
  public Adapter createProductElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.MultiParameterElement <em>Multi Parameter Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.MultiParameterElement
   * @generated
   */
  public Adapter createMultiParameterElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.ParameterElement <em>Parameter Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.ParameterElement
   * @generated
   */
  public Adapter createParameterElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.OperationElement <em>Operation Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.OperationElement
   * @generated
   */
  public Adapter createOperationElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.ControlBlockElement <em>Control Block Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.ControlBlockElement
   * @generated
   */
  public Adapter createControlBlockElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.ControlStatementElement <em>Control Statement Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.ControlStatementElement
   * @generated
   */
  public Adapter createControlStatementElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.ExpressionElement <em>Expression Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.ExpressionElement
   * @generated
   */
  public Adapter createExpressionElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.StaticOperationElement <em>Static Operation Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.StaticOperationElement
   * @generated
   */
  public Adapter createStaticOperationElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.UseStatement <em>Use Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.UseStatement
   * @generated
   */
  public Adapter createUseStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ProductAdapterFactory
