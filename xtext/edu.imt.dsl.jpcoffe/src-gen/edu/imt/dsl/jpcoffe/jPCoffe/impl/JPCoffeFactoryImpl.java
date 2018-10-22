/**
 * generated by Xtext 2.15.0
 */
package edu.imt.dsl.jpcoffe.jPCoffe.impl;

import edu.imt.dsl.jpcoffe.jPCoffe.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JPCoffeFactoryImpl extends EFactoryImpl implements JPCoffeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JPCoffeFactory init()
  {
    try
    {
      JPCoffeFactory theJPCoffeFactory = (JPCoffeFactory)EPackage.Registry.INSTANCE.getEFactory(JPCoffePackage.eNS_URI);
      if (theJPCoffeFactory != null)
      {
        return theJPCoffeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JPCoffeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPCoffeFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JPCoffePackage.MAIN: return createMain();
      case JPCoffePackage.RECIPE: return createRecipe();
      case JPCoffePackage.PORTION_NB: return createPortionNB();
      case JPCoffePackage.INGREDIENTS_BLOCK: return createIngredientsBlock();
      case JPCoffePackage.INGREDIENT: return createIngredient();
      case JPCoffePackage.QUANTITY: return createQuantity();
      case JPCoffePackage.TOOLS_BLOCK: return createToolsBlock();
      case JPCoffePackage.TOOL: return createTool();
      case JPCoffePackage.STEPS_BLOCK: return createStepsBlock();
      case JPCoffePackage.STEP: return createStep();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main createMain()
  {
    MainImpl main = new MainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipe createRecipe()
  {
    RecipeImpl recipe = new RecipeImpl();
    return recipe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortionNB createPortionNB()
  {
    PortionNBImpl portionNB = new PortionNBImpl();
    return portionNB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IngredientsBlock createIngredientsBlock()
  {
    IngredientsBlockImpl ingredientsBlock = new IngredientsBlockImpl();
    return ingredientsBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ingredient createIngredient()
  {
    IngredientImpl ingredient = new IngredientImpl();
    return ingredient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantity createQuantity()
  {
    QuantityImpl quantity = new QuantityImpl();
    return quantity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToolsBlock createToolsBlock()
  {
    ToolsBlockImpl toolsBlock = new ToolsBlockImpl();
    return toolsBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tool createTool()
  {
    ToolImpl tool = new ToolImpl();
    return tool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StepsBlock createStepsBlock()
  {
    StepsBlockImpl stepsBlock = new StepsBlockImpl();
    return stepsBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPCoffePackage getJPCoffePackage()
  {
    return (JPCoffePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JPCoffePackage getPackage()
  {
    return JPCoffePackage.eINSTANCE;
  }

} //JPCoffeFactoryImpl
