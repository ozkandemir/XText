/**
 */
package com.ykb.umap.dsl.product.impl;

import com.ykb.umap.dsl.product.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductFactoryImpl extends EFactoryImpl implements ProductFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProductFactory init()
  {
    try
    {
      ProductFactory theProductFactory = (ProductFactory)EPackage.Registry.INSTANCE.getEFactory(ProductPackage.eNS_URI);
      if (theProductFactory != null)
      {
        return theProductFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ProductFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ProductPackage.EPRODUCT: return createEProduct();
      case ProductPackage.ECOMPILATION_UNIT: return createECompilationUnit();
      case ProductPackage.EDATA_TYPE: return createEDataType();
      case ProductPackage.EUSE_UNIT: return createEUseUnit();
      case ProductPackage.ENAMESPACE_UNIT: return createENamespaceUnit();
      case ProductPackage.EPRODUCT_UNIT: return createEProductUnit();
      case ProductPackage.EPARAMETER_ELEMENT: return createEParameterElement();
      case ProductPackage.EOPERATION_UNIT: return createEOperationUnit();
      case ProductPackage.ESTATEMENT: return createEStatement();
      case ProductPackage.ECONTROL_ELEMENT: return createEControlElement();
      case ProductPackage.EEXPRESSION_ELEMENT: return createEExpressionElement();
      case ProductPackage.ECONTROL_STATEMENT_ELEMENT: return createEControlStatementElement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ProductPackage.UMAP_DATA_TYPES:
        return createUMAPDataTypesFromString(eDataType, initialValue);
      case ProductPackage.OPERATORS:
        return createOPERATORSFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ProductPackage.UMAP_DATA_TYPES:
        return convertUMAPDataTypesToString(eDataType, instanceValue);
      case ProductPackage.OPERATORS:
        return convertOPERATORSToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EProduct createEProduct()
  {
    EProductImpl eProduct = new EProductImpl();
    return eProduct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECompilationUnit createECompilationUnit()
  {
    ECompilationUnitImpl eCompilationUnit = new ECompilationUnitImpl();
    return eCompilationUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.ykb.umap.dsl.product.EDataType createEDataType()
  {
    EDataTypeImpl eDataType = new EDataTypeImpl();
    return eDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EUseUnit createEUseUnit()
  {
    EUseUnitImpl eUseUnit = new EUseUnitImpl();
    return eUseUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamespaceUnit createENamespaceUnit()
  {
    ENamespaceUnitImpl eNamespaceUnit = new ENamespaceUnitImpl();
    return eNamespaceUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EProductUnit createEProductUnit()
  {
    EProductUnitImpl eProductUnit = new EProductUnitImpl();
    return eProductUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EParameterElement createEParameterElement()
  {
    EParameterElementImpl eParameterElement = new EParameterElementImpl();
    return eParameterElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperationUnit createEOperationUnit()
  {
    EOperationUnitImpl eOperationUnit = new EOperationUnitImpl();
    return eOperationUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStatement createEStatement()
  {
    EStatementImpl eStatement = new EStatementImpl();
    return eStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EControlElement createEControlElement()
  {
    EControlElementImpl eControlElement = new EControlElementImpl();
    return eControlElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EExpressionElement createEExpressionElement()
  {
    EExpressionElementImpl eExpressionElement = new EExpressionElementImpl();
    return eExpressionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EControlStatementElement createEControlStatementElement()
  {
    EControlStatementElementImpl eControlStatementElement = new EControlStatementElementImpl();
    return eControlStatementElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UMAPDataTypes createUMAPDataTypesFromString(EDataType eDataType, String initialValue)
  {
    UMAPDataTypes result = UMAPDataTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUMAPDataTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OPERATORS createOPERATORSFromString(EDataType eDataType, String initialValue)
  {
    OPERATORS result = OPERATORS.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOPERATORSToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductPackage getProductPackage()
  {
    return (ProductPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ProductPackage getPackage()
  {
    return ProductPackage.eINSTANCE;
  }

} //ProductFactoryImpl
