package etu.imt.dsl.jpcoffe.runtime;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import etu.imt.dsl.jpcoffe.runtime.model.Ingredient;
import etu.imt.dsl.jpcoffe.runtime.model.Recipe;
import etu.imt.dsl.jpcoffe.runtime.model.Step;

public class App {
	
	private List<Recipe> recipes;
	private Recipe currentRecipe;
	private Set<Integer> stepsDone;
	private Scanner reader;
	
	public App() {
		recipes = new ArrayList<Recipe>();
		currentRecipe = null;
		stepsDone = null;
		reader = new Scanner(System.in);
	}
	
	private List<Integer> getStepsNumbers(List<Step> steps) {
		List<Integer> stepsNb = new ArrayList<Integer>();
		for(Step s : steps) {
			stepsNb.add(s.number);
		}
		return stepsNb;
	}
	
	private boolean isFinished() {
		return stepsDone.size() == currentRecipe.getSteps().size();
	}
	
	private boolean stepToDo(Step s) {
		for(int pred : s.predecessor) {
			if (stepsDone.contains(pred) == false) {
				return false;
			}
		}
		return !stepsDone.contains(s.number);
	}
	
	private List<Step> getNextSteps() {
		List<Step> nextSteps = new ArrayList<Step>();
		for(Step s : currentRecipe.getSteps()) {
			if(stepToDo(s)) {
				nextSteps.add(s);
			}
		}
		return nextSteps;
	}
	
	public void addRecipe(Recipe r) {
		this.recipes.add(r);
	}
	
	public void chooseRecipe() {
		System.out.println("RECIPES : ");
		for(int i = 0; i < this.recipes.size(); i++) {
			System.out.println("    " + i + " - " + this.recipes.get(i).name);
		}
		
		int index = - 1;
		boolean validIndex = false;
		while (!validIndex) {
			System.out.println("Choose a recipe :");
			index = reader.nextInt();
			if(index >= 0 && index < this.recipes.size()) {
				validIndex = true;
			}
		}
		
		this.stepsDone = new HashSet<Integer>();
		this.currentRecipe = this.recipes.get(index);
	}
	
	private String nextStepsStr() {
		String str = "";
		for(Step s : getNextSteps()) {
			str += "    " + s.number + " - " + s.text + "\n";
		}
		return str;
	}
	
	private boolean stepDone(int stepNb) {
		if(getStepsNumbers(getNextSteps()).contains(stepNb) == false) {
			return false;
		}
		return this.stepsDone.add(stepNb);
	}
	
	public void followRecipe() {
		System.out.println("\n------------------\nStarting recipe : " + this.currentRecipe.name + "\n------------------");
		while(!this.isFinished()) {
			System.out.println("\nNext Steps: \n" + this.nextStepsStr());
			System.out.print("> step done : ");
			int num = reader.nextInt();
			this.stepDone(num);
		}
		System.out.println("\nRecipe done, enjoy your meal !");
	}
	
	public static void main(String[] args) {
		Recipe r = new Recipe("Béchamel");
		r.setForPeople(6);
		r.addIngredient(new Ingredient("Farine", 50, "gr"));
		r.addIngredient(new Ingredient("Lait", 60, "cl"));
		r.addIngredient(new Ingredient("Sel"));
		r.addTool("Casserole a fond epais");
		r.addTool("Cuillere en bois");
		r.addStep(new Step(new int[]{},  0, "faire fondre le Beurre dans la Casserole a fond epais"));
		r.addStep(new Step(new int[]{0}, 1, "ajouter la Farine et remuer avec une Cuillere en bois"));
		r.addStep(new Step(new int[]{1}, 2, "verser le Lait progressivement en remuant jusqu'a ce que la sauce epaississe"));
		r.addStep(new Step(new int[]{2}, 3, "assaisonner de Sel, Poivre et Muscade rapee"));
		
		Recipe r2 = new Recipe("Sallage");
		r2.setForPeople(1);
		r2.addIngredient(new Ingredient("Sel", 50, "gr"));
		r2.addTool("Main à sel");
		r2.addStep(new Step(new int[]{},  0, "prenez une pincée de sel"));
		r2.addStep(new Step(new int[]{0}, 1, "saupoudrez le plus possible aux alentours"));
		
		App app = new App();
		app.addRecipe(r);
		app.addRecipe(r2);
		
		app.chooseRecipe();
		app.followRecipe();
	}

}
