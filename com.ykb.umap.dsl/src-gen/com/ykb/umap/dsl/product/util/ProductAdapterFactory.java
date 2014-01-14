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
      public Adapter caseEProduct(EProduct object)
      {
        return createEProductAdapter();
      }
      @Override
      public Adapter caseECompilationUnit(ECompilationUnit object)
      {
        return createECompilationUnitAdapter();
      }
      @Override
      public Adapter caseEUseUnit(EUseUnit object)
      {
        return createEUseUnitAdapter();
      }
      @Override
      public Adapter caseENamespaceUnit(ENamespaceUnit object)
      {
        return createENamespaceUnitAdapter();
      }
      @Override
      public Adapter caseEProductUnit(EProductUnit object)
      {
        return createEProductUnitAdapter();
      }
      @Override
      public Adapter caseEParameterElement(EParameterElement object)
      {
        return createEParameterElementAdapter();
      }
      @Override
      public Adapter caseEOperationUnit(EOperationUnit object)
      {
        return createEOperationUnitAdapter();
      }
      @Override
      public Adapter caseEStatement(EStatement object)
      {
        return createEStatementAdapter();
      }
      @Override
      public Adapter caseEControlElement(EControlElement object)
      {
        return createEControlElementAdapter();
      }
      @Override
      public Adapter caseEExpressionElement(EExpressionElement object)
      {
        return createEExpressionElementAdapter();
      }
      @Override
      public Adapter caseEControlStatementElement(EControlStatementElement object)
      {
        return createEControlStatementElementAdapter();
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
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.EProduct <em>EProduct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.EProduct
   * @generated
   */
  public Adapter createEProductAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.ECompilationUnit <em>ECompilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.ECompilationUnit
   * @generated
   */
  public Adapter createECompilationUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.EUseUnit <em>EUse Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.EUseUnit
   * @generated
   */
  public Adapter createEUseUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.ENamespaceUnit <em>ENamespace Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.ENamespaceUnit
   * @generated
   */
  public Adapter createENamespaceUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.EProductUnit <em>EProduct Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.EProductUnit
   * @generated
   */
  public Adapter createEProductUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.EParameterElement <em>EParameter Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.EParameterElement
   * @generated
   */
  public Adapter createEParameterElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.EOperationUnit <em>EOperation Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.EOperationUnit
   * @generated
   */
  public Adapter createEOperationUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.EStatement <em>EStatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.EStatement
   * @generated
   */
  public Adapter createEStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.EControlElement <em>EControl Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.EControlElement
   * @generated
   */
  public Adapter createEControlElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.EExpressionElement <em>EExpression Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.EExpressionElement
   * @generated
   */
  public Adapter createEExpressionElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ykb.umap.dsl.product.EControlStatementElement <em>EControl Statement Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ykb.umap.dsl.product.EControlStatementElement
   * @generated
   */
  public Adapter createEControlStatementElementAdapter()
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
