/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.properties#getPName <em>PName</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.properties#getPVal <em>PVal</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getproperties()
 * @model
 * @generated
 */
public interface properties extends EObject
{
  /**
   * Returns the value of the '<em><b>PName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PName</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PName</em>' attribute.
   * @see #setPName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getproperties_PName()
   * @model
   * @generated
   */
  String getPName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.properties#getPName <em>PName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PName</em>' attribute.
   * @see #getPName()
   * @generated
   */
  void setPName(String value);

  /**
   * Returns the value of the '<em><b>PVal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PVal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PVal</em>' containment reference.
   * @see #setPVal(Values)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getproperties_PVal()
   * @model containment="true"
   * @generated
   */
  Values getPVal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.properties#getPVal <em>PVal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PVal</em>' containment reference.
   * @see #getPVal()
   * @generated
   */
  void setPVal(Values value);

} // properties
