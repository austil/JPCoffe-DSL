package etu.imt.dsl.jpcoffe.runtime;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import etu.imt.dsl.jpcoffe.runtime.model.Ingredient;
import etu.imt.dsl.jpcoffe.runtime.model.Recipe;
import etu.imt.dsl.jpcoffe.runtime.model.Step;

public class App {
	
	private Recipe recipe;
	private Set<Integer> stepsDone;
	
	public App (Recipe r) {
		recipe = r;
		stepsDone = new HashSet<Integer>();
	}
	
	private List<Integer> getStepsNumbers(List<Step> steps) {
		List<Integer> stepsNb = new ArrayList<Integer>();
		for(Step s : steps) {
			stepsNb.add(s.number);
		}
		return stepsNb;
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
		for(Step s : recipe.getSteps()) {
			if(stepToDo(s)) {
				nextSteps.add(s);
			}
		}
		return nextSteps;
	}
	
	public String nextStepsStr() {
		if(stepsDone.size() == recipe.getSteps().size()) {
			return "Recipe finished !";
		}
		String str = "";
		for(Step s : getNextSteps()) {
			str += "- " + s.number + " " + s.text + "\n";
		}
		return str;
	}
	
	public boolean stepDone(int stepNb) {
		if(getStepsNumbers(getNextSteps()).contains(stepNb) == false) {
			return false;
		}
		return this.stepsDone.add(stepNb);
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
		System.out.println(r);
		
		App app = new App(r);
		System.out.println("TODO :\n" + app.nextStepsStr());
		app.stepDone(0);
		System.out.println("TODO :\n" + app.nextStepsStr());
		app.stepDone(1);
		System.out.println("TODO :\n" + app.nextStepsStr());
		app.stepDone(2);
		System.out.println("TODO :\n" + app.nextStepsStr());
		app.stepDone(3);
		System.out.println("TODO :\n" + app.nextStepsStr());
	}

}
