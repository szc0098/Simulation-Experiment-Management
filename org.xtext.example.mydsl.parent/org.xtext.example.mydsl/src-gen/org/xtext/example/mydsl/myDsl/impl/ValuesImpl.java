/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Values;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ValuesImpl#getFVal <em>FVal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ValuesImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ValuesImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ValuesImpl#getFvalue <em>Fvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuesImpl extends MinimalEObjectImpl.Container implements Values
{
  /**
   * The default value of the '{@link #getFVal() <em>FVal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFVal()
   * @generated
   * @ordered
   */
  protected static final String FVAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFVal() <em>FVal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFVal()
   * @generated
   * @ordered
   */
  protected String fVal = FVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected static final String FUNCTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected String function = FUNCTION_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getFvalue() <em>Fvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFvalue()
   * @generated
   * @ordered
   */
  protected static final String FVALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFvalue() <em>Fvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFvalue()
   * @generated
   * @ordered
   */
  protected String fvalue = FVALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValuesImpl()
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
    return MyDslPackage.Literals.VALUES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFVal()
  {
    return fVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFVal(String newFVal)
  {
    String oldFVal = fVal;
    fVal = newFVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUES__FVAL, oldFVal, fVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(String newFunction)
  {
    String oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUES__FUNCTION, oldFunction, function));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUES__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFvalue()
  {
    return fvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFvalue(String newFvalue)
  {
    String oldFvalue = fvalue;
    fvalue = newFvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUES__FVALUE, oldFvalue, fvalue));
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
      case MyDslPackage.VALUES__FVAL:
        return getFVal();
      case MyDslPackage.VALUES__FUNCTION:
        return getFunction();
      case MyDslPackage.VALUES__VALUE:
        return getValue();
      case MyDslPackage.VALUES__FVALUE:
        return getFvalue();
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
      case MyDslPackage.VALUES__FVAL:
        setFVal((String)newValue);
        return;
      case MyDslPackage.VALUES__FUNCTION:
        setFunction((String)newValue);
        return;
      case MyDslPackage.VALUES__VALUE:
        setValue((String)newValue);
        return;
      case MyDslPackage.VALUES__FVALUE:
        setFvalue((String)newValue);
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
      case MyDslPackage.VALUES__FVAL:
        setFVal(FVAL_EDEFAULT);
        return;
      case MyDslPackage.VALUES__FUNCTION:
        setFunction(FUNCTION_EDEFAULT);
        return;
      case MyDslPackage.VALUES__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case MyDslPackage.VALUES__FVALUE:
        setFvalue(FVALUE_EDEFAULT);
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
      case MyDslPackage.VALUES__FVAL:
        return FVAL_EDEFAULT == null ? fVal != null : !FVAL_EDEFAULT.equals(fVal);
      case MyDslPackage.VALUES__FUNCTION:
        return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
      case MyDslPackage.VALUES__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case MyDslPackage.VALUES__FVALUE:
        return FVALUE_EDEFAULT == null ? fvalue != null : !FVALUE_EDEFAULT.equals(fvalue);
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
    result.append(" (fVal: ");
    result.append(fVal);
    result.append(", function: ");
    result.append(function);
    result.append(", value: ");
    result.append(value);
    result.append(", fvalue: ");
    result.append(fvalue);
    result.append(')');
    return result.toString();
  }

} //ValuesImpl