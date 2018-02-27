/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ControlVariables#getControlName <em>Control Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ControlVariables#getControlType <em>Control Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ControlVariables#getControlValue <em>Control Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getControlVariables()
 * @model
 * @generated
 */
public interface ControlVariables extends EObject
{
  /**
   * Returns the value of the '<em><b>Control Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Control Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Name</em>' attribute.
   * @see #setControlName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getControlVariables_ControlName()
   * @model
   * @generated
   */
  String getControlName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ControlVariables#getControlName <em>Control Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Name</em>' attribute.
   * @see #getControlName()
   * @generated
   */
  void setControlName(String value);

  /**
   * Returns the value of the '<em><b>Control Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.VariableType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Control Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Type</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.VariableType
   * @see #setControlType(VariableType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getControlVariables_ControlType()
   * @model
   * @generated
   */
  VariableType getControlType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ControlVariables#getControlType <em>Control Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Type</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.VariableType
   * @see #getControlType()
   * @generated
   */
  void setControlType(VariableType value);

  /**
   * Returns the value of the '<em><b>Control Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Control Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Value</em>' containment reference.
   * @see #setControlValue(Values)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getControlVariables_ControlValue()
   * @model containment="true"
   * @generated
   */
  Values getControlValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ControlVariables#getControlValue <em>Control Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Value</em>' containment reference.
   * @see #getControlValue()
   * @generated
   */
  void setControlValue(Values value);

} // ControlVariables