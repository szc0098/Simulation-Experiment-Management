/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dispersed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Dispersed#getDisp <em>Disp</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDispersed()
 * @model
 * @generated
 */
public interface Dispersed extends Event
{
  /**
   * Returns the value of the '<em><b>Disp</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disp</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disp</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDispersed_Disp()
   * @model unique="false"
   * @generated
   */
  EList<String> getDisp();

} // Dispersed
