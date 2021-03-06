/**
 * generated by Xtext 2.15.0
 */
package edu.imt.dsl.jpcoffe.jPCoffe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.imt.dsl.jpcoffe.jPCoffe.Ingredient#getOriginalName <em>Original Name</em>}</li>
 *   <li>{@link edu.imt.dsl.jpcoffe.jPCoffe.Ingredient#getName <em>Name</em>}</li>
 *   <li>{@link edu.imt.dsl.jpcoffe.jPCoffe.Ingredient#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see edu.imt.dsl.jpcoffe.jPCoffe.JPCoffePackage#getIngredient()
 * @model
 * @generated
 */
public interface Ingredient extends EObject
{
  /**
   * Returns the value of the '<em><b>Original Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Original Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Original Name</em>' attribute list.
   * @see edu.imt.dsl.jpcoffe.jPCoffe.JPCoffePackage#getIngredient_OriginalName()
   * @model unique="false"
   * @generated
   */
  EList<String> getOriginalName();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.imt.dsl.jpcoffe.jPCoffe.JPCoffePackage#getIngredient_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.imt.dsl.jpcoffe.jPCoffe.Ingredient#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantity</em>' containment reference.
   * @see #setQuantity(Quantity)
   * @see edu.imt.dsl.jpcoffe.jPCoffe.JPCoffePackage#getIngredient_Quantity()
   * @model containment="true"
   * @generated
   */
  Quantity getQuantity();

  /**
   * Sets the value of the '{@link edu.imt.dsl.jpcoffe.jPCoffe.Ingredient#getQuantity <em>Quantity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantity</em>' containment reference.
   * @see #getQuantity()
   * @generated
   */
  void setQuantity(Quantity value);

} // Ingredient
