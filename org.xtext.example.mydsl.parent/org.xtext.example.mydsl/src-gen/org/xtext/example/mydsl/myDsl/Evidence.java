/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Evidence#getEName <em>EName</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Evidence#getQuery <em>Query</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Evidence#getObjOfStudy <em>Obj Of Study</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEvidence()
 * @model
 * @generated
 */
public interface Evidence extends EObject
{
  /**
   * Returns the value of the '<em><b>EName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EName</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EName</em>' attribute.
   * @see #setEName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEvidence_EName()
   * @model
   * @generated
   */
  String getEName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Evidence#getEName <em>EName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EName</em>' attribute.
   * @see #getEName()
   * @generated
   */
  void setEName(String value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.TemporalPattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEvidence_Query()
   * @model containment="true"
   * @generated
   */
  EList<TemporalPattern> getQuery();

  /**
   * Returns the value of the '<em><b>Obj Of Study</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj Of Study</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj Of Study</em>' attribute.
   * @see #setObjOfStudy(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEvidence_ObjOfStudy()
   * @model
   * @generated
   */
  String getObjOfStudy();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Evidence#getObjOfStudy <em>Obj Of Study</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj Of Study</em>' attribute.
   * @see #getObjOfStudy()
   * @generated
   */
  void setObjOfStudy(String value);

} // Evidence
