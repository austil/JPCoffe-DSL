/**
 * generated by Xtext 2.15.0
 */
package edu.imt.dsl.jpcoffe.jPCoffe.impl;

import edu.imt.dsl.jpcoffe.jPCoffe.JPCoffePackage;
import edu.imt.dsl.jpcoffe.jPCoffe.Tool;
import edu.imt.dsl.jpcoffe.jPCoffe.ToolsBlock;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tools Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.imt.dsl.jpcoffe.jPCoffe.impl.ToolsBlockImpl#getToolsList <em>Tools List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToolsBlockImpl extends MinimalEObjectImpl.Container implements ToolsBlock
{
  /**
   * The cached value of the '{@link #getToolsList() <em>Tools List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToolsList()
   * @generated
   * @ordered
   */
  protected EList<Tool> toolsList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ToolsBlockImpl()
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
    return JPCoffePackage.Literals.TOOLS_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Tool> getToolsList()
  {
    if (toolsList == null)
    {
      toolsList = new EObjectContainmentEList<Tool>(Tool.class, this, JPCoffePackage.TOOLS_BLOCK__TOOLS_LIST);
    }
    return toolsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JPCoffePackage.TOOLS_BLOCK__TOOLS_LIST:
        return ((InternalEList<?>)getToolsList()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case JPCoffePackage.TOOLS_BLOCK__TOOLS_LIST:
        return getToolsList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JPCoffePackage.TOOLS_BLOCK__TOOLS_LIST:
        getToolsList().clear();
        getToolsList().addAll((Collection<? extends Tool>)newValue);
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
      case JPCoffePackage.TOOLS_BLOCK__TOOLS_LIST:
        getToolsList().clear();
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
      case JPCoffePackage.TOOLS_BLOCK__TOOLS_LIST:
        return toolsList != null && !toolsList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ToolsBlockImpl
