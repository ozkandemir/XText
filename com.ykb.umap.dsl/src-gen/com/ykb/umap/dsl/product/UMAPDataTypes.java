/**
 */
package com.ykb.umap.dsl.product;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>UMAP Data Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.ykb.umap.dsl.product.ProductPackage#getUMAPDataTypes()
 * @model
 * @generated
 */
public enum UMAPDataTypes implements Enumerator
{
  /**
   * The '<em><b>BRANCH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BRANCH_VALUE
   * @generated
   * @ordered
   */
  BRANCH(0, "BRANCH", "BRANCH"),

  /**
   * The '<em><b>CLIENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLIENT_VALUE
   * @generated
   * @ordered
   */
  CLIENT(1, "CLIENT", "CLIENT"),

  /**
   * The '<em><b>CURRENCY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CURRENCY_VALUE
   * @generated
   * @ordered
   */
  CURRENCY(2, "CURRENCY", "CURRENCY"),

  /**
   * The '<em><b>NUMBER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMBER_VALUE
   * @generated
   * @ordered
   */
  NUMBER(3, "NUMBER", "NUMBER"),

  /**
   * The '<em><b>STRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(4, "STRING", "STRING");

  /**
   * The '<em><b>BRANCH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BRANCH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BRANCH
   * @model
   * @generated
   * @ordered
   */
  public static final int BRANCH_VALUE = 0;

  /**
   * The '<em><b>CLIENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CLIENT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLIENT
   * @model
   * @generated
   * @ordered
   */
  public static final int CLIENT_VALUE = 1;

  /**
   * The '<em><b>CURRENCY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CURRENCY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CURRENCY
   * @model
   * @generated
   * @ordered
   */
  public static final int CURRENCY_VALUE = 2;

  /**
   * The '<em><b>NUMBER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NUMBER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NUMBER
   * @model
   * @generated
   * @ordered
   */
  public static final int NUMBER_VALUE = 3;

  /**
   * The '<em><b>STRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 4;

  /**
   * An array of all the '<em><b>UMAP Data Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final UMAPDataTypes[] VALUES_ARRAY =
    new UMAPDataTypes[]
    {
      BRANCH,
      CLIENT,
      CURRENCY,
      NUMBER,
      STRING,
    };

  /**
   * A public read-only list of all the '<em><b>UMAP Data Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<UMAPDataTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>UMAP Data Types</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UMAPDataTypes get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UMAPDataTypes result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>UMAP Data Types</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UMAPDataTypes getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UMAPDataTypes result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>UMAP Data Types</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UMAPDataTypes get(int value)
  {
    switch (value)
    {
      case BRANCH_VALUE: return BRANCH;
      case CLIENT_VALUE: return CLIENT;
      case CURRENCY_VALUE: return CURRENCY;
      case NUMBER_VALUE: return NUMBER;
      case STRING_VALUE: return STRING;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private UMAPDataTypes(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //UMAPDataTypes
