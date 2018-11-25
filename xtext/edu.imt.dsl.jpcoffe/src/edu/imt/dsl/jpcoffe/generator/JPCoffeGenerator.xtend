/*
 * generated by Xtext 2.15.0
 */
package edu.imt.dsl.jpcoffe.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import edu.imt.dsl.jpcoffe.jPCoffe.Main
import edu.imt.dsl.jpcoffe.jPCoffe.Recipe
import edu.imt.dsl.jpcoffe.jPCoffe.Ingredient
import org.eclipse.emf.common.util.EList
import edu.imt.dsl.jpcoffe.jPCoffe.Step
import edu.imt.dsl.jpcoffe.jPCoffe.IngredientsGroup

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class JPCoffeGenerator extends AbstractGenerator {

	int recipeNb;
	int ingredientsGroupNb;
	
	def getRecipeNb() {
		recipeNb++;
		return recipeNb;
	}
	
	def getAndIncIngredientsGroupNb() {
		ingredientsGroupNb++;
		return ingredientsGroupNb;
	}
	
	def getIngredientsGroupNb() {
		return ingredientsGroupNb;
	}

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		recipeNb = 0;
		val main = resource.contents.filter(Main).get(0);
		fsa.generateFile("MainGenerated.java", main.compile());
	}
	
	def compile(Main m) '''
	import etu.imt.dsl.jpcoffe.runtime.model.Ingredient;
	import etu.imt.dsl.jpcoffe.runtime.model.IngredientsGroup;
	import etu.imt.dsl.jpcoffe.runtime.model.Recipe;
	import etu.imt.dsl.jpcoffe.runtime.model.Step;
	import etu.imt.dsl.jpcoffe.runtime.App;
	
	public class MainGenerated {
		public static void main(String[] args) {
			App app = new App();
			«FOR recipe : m.recipes»
				«recipe.compile(getRecipeNb)»
			«ENDFOR»
			
			app.chooseRecipe();
			app.followRecipe();
		}
	}
	'''
	
	def compile(Recipe r, int nb) '''
	Recipe recipe«nb» = new Recipe("«r.name»");
	recipe«nb».setForPeople(«r.portion.nb»);
	
	«FOR ingredient : r.ingredients.ingredientsList.filter(Ingredient)»
		recipe«nb».addIngredient(«ingredient.compile»);
	«ENDFOR»
	
	«FOR ingredientsGroup : r.ingredients.ingredientsList.filter(IngredientsGroup)»
		«ingredientsGroup.compile(getAndIncIngredientsGroupNb)»
		recipe«nb».addIngredientsGroup(ingrGrp«getIngredientsGroupNb»);
	«ENDFOR»
	
	«FOR tool : r.tools.toolsList»
		recipe«nb».addTool("«tool.name»");
	«ENDFOR»
	
	«FOR step : r.steps.stepsList.filter(Step)»
		recipe«nb».addStep(
			new Step(new int[]{«predToString(step.pred)»},
					 «step.num»,
					 "«step.text»")
		);
	«ENDFOR»
	
	app.addRecipe(recipe«nb»);
	'''
	
	def compile (IngredientsGroup ingredientsGroup, int nb)  {
		if (ingredientsGroup.quantity !== null) {
			if (ingredientsGroup.quantity.unit !== null) {
				return '''
				IngredientsGroup ingrGrp«nb» = new IngredientsGroup("«ingredientsGroup.name»", «ingredientsGroup.quantity.amount», "«ingredientsGroup.quantity.unit»");
				«FOR ingr : ingredientsGroup.ingredientsList.filter(Ingredient)»
					ingrGrp«nb».addIngredient(«ingr.compile»);
				«ENDFOR»
				'''
			}
			else {
				return '''
				IngredientsGroup ingrGrp«nb» = new IngredientsGroup("«ingredientsGroup.name»", «ingredientsGroup.quantity.amount»);
				«FOR ingr : ingredientsGroup.ingredientsList.filter(Ingredient)»
					ingrGrp«nb».addIngredient(«ingr.compile»);
				«ENDFOR»
				'''
			}
		}
		else {
			return '''
			IngredientsGroup ingrGrp«nb» = new IngredientsGroup("«ingredientsGroup.name»");
			«FOR ingr : ingredientsGroup.ingredientsList.filter(Ingredient)»
				ingrGrp«nb».addIngredient(«ingr.compile»);
			«ENDFOR»
			'''
		}
	}	
	
	def compile(Ingredient ingredient) {
		if (ingredient.quantity !== null) {
			if (ingredient.quantity.unit !== null) {
				return '''
				new Ingredient("«ingredient.name»", «ingredient.quantity.amount», "«ingredient.quantity.unit»")
				'''
			}
			else {
				return '''
				new Ingredient("«ingredient.name»", «ingredient.quantity.amount»)
				'''
			}
		}
		else {
			return '''new Ingredient("«ingredient.name»")'''
		}
	}

	def predToString(EList<Integer> preds)	{
		if (preds.empty) {
			return "";
		}
		else {
			var s = preds.get(0).toString;
			
			for (var i = 1; i < preds.size; i++) {
				s += "," + preds.get(i).toString;
			}
			return s;
		}
	}
}
