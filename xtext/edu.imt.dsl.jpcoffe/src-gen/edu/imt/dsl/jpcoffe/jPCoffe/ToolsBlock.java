/**
 * generated by Xtext 2.15.0
 */
package edu.imt.dsl.jpcoffe.jPCoffe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tools Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.imt.dsl.jpcoffe.jPCoffe.ToolsBlock#getToolsList <em>Tools List</em>}</li>
 * </ul>
 *
 * @see edu.imt.dsl.jpcoffe.jPCoffe.JPCoffePackage#getToolsBlock()
 * @model
 * @generated
 */
public interface ToolsBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Tools List</b></em>' containment reference list.
   * The list contents are of type {@link edu.imt.dsl.jpcoffe.jPCoffe.Tool}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tools List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tools List</em>' containment reference list.
   * @see edu.imt.dsl.jpcoffe.jPCoffe.JPCoffePackage#getToolsBlock_ToolsList()
   * @model containment="true"
   * @generated
   */
  EList<Tool> getToolsList();

} // ToolsBlock
