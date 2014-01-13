/**
 */
package com.ykb.umap.dsl.product.util;

import com.ykb.umap.dsl.product.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.ykb.umap.dsl.product.ProductPackage
 * @generated
 */
public class ProductSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProductPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ProductPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ProductPackage.EPRODUCT:
      {
        EProduct eProduct = (EProduct)theEObject;
        T result = caseEProduct(eProduct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProductPackage.ECOMPILATION_UNIT:
      {
        ECompilationUnit eCompilationUnit = (ECompilationUnit)theEObject;
        T result = caseECompilationUnit(eCompilationUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProductPackage.EUSE_UNIT:
      {
        EUseUnit eUseUnit = (EUseUnit)theEObject;
        T result = caseEUseUnit(eUseUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProductPackage.ENAMESPACE_UNIT:
      {
        ENamespaceUnit eNamespaceUnit = (ENamespaceUnit)theEObject;
        T result = caseENamespaceUnit(eNamespaceUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProductPackage.EPRODUCT_UNIT:
      {
        EProductUnit eProductUnit = (EProductUnit)theEObject;
        T result = caseEProductUnit(eProductUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProductPackage.EPARAMETER_ELEMENT:
      {
        EParameterElement eParameterElement = (EParameterElement)theEObject;
        T result = caseEParameterElement(eParameterElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProductPackage.EOPERATION_UNIT:
      {
        EOperationUnit eOperationUnit = (EOperationUnit)theEObject;
        T result = caseEOperationUnit(eOperationUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProductPackage.ECONTROL_ELEMENT:
      {
        EControlElement eControlElement = (EControlElement)theEObject;
        T result = caseEControlElement(eControlElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProductPackage.EEXPRESSION_ELEMENT:
      {
        EExpressionElement eExpressionElement = (EExpressionElement)theEObject;
        T result = caseEExpressionElement(eExpressionElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProductPackage.ECONTROL_STATEMENT_ELEMENT:
      {
        EControlStatementElement eControlStatementElement = (EControlStatementElement)theEObject;
        T result = caseEControlStatementElement(eControlStatementElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EProduct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EProduct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEProduct(EProduct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECompilation Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECompilation Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECompilationUnit(ECompilationUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EUse Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EUse Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEUseUnit(EUseUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ENamespace Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ENamespace Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseENamespaceUnit(ENamespaceUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EProduct Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EProduct Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEProductUnit(EProductUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EParameter Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EParameter Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEParameterElement(EParameterElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EOperation Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EOperation Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEOperationUnit(EOperationUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EControl Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EControl Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEControlElement(EControlElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EExpression Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EExpression Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEExpressionElement(EExpressionElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EControl Statement Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EControl Statement Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEControlStatementElement(EControlStatementElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ProductSwitch
