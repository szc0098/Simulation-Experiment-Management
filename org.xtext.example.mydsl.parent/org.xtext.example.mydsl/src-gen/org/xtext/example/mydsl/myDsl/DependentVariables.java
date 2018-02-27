/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependent Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DependentVariables#getResponseName <em>Response Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDependentVariables()
 * @model
 * @generated
 */
public interface DependentVariables extends EObject
{
  /**
   * Returns the value of the '<em><b>Response Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response Name</em>' containment reference.
   * @see #setResponseName(Response)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDependentVariables_ResponseName()
   * @model containment="true"
   * @generated
   */
  Response getResponseName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DependentVariables#getResponseName <em>Response Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response Name</em>' containment reference.
   * @see #getResponseName()
   * @generated
   */
  void setResponseName(Response value);

} // DependentVariables
