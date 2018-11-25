package etu.imt.dsl.jpcoffe.runtime.model;

import java.util.ArrayList;

public class IngredientsGroup {

	public final String name;
	public final int quantity;
	public final String unit;
	public final ArrayList<Ingredient> ingredientsList = new ArrayList<Ingredient>();
	
	public IngredientsGroup(String name, int quantity, String unit) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;
	}
	
	public IngredientsGroup(String name, int quantity) {
		this(name, quantity, "");
	}
	
	public IngredientsGroup(String name) {
		this(name, 1);
	}
	
	public void addIngredient(Ingredient ingr) {
		ingredientsList.add(ingr);
	}
}
