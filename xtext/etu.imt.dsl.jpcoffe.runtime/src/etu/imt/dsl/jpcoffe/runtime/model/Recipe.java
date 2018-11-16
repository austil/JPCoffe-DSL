package etu.imt.dsl.jpcoffe.runtime.model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

	private String name;
	
	private int forPeople;

	private List<Ingredient> ingredients;
	
	private List<String> tools;
	
	private List<Step> steps;
	
	public Recipe(String name) {
		this.name = name;
		ingredients = new ArrayList<Ingredient>();
		tools = new ArrayList<String>();
		steps = new ArrayList<Step>();
	}

	public void setForPeople(int for_people) {
		this.forPeople = for_people;
	}

	public void addIngredient(Ingredient i) {
		this.ingredients.add(i);
	}

	public void addTool(String t) {
		this.tools.add(t);
	}

	public void addStep(Step s) {
		this.steps.add(s);
	}
	
	public String toString() {
		return "Recipe : " + name + " for " + forPeople;
	}
	
	public final List<Step> getSteps() {
		return this.steps;
	}
	
}
