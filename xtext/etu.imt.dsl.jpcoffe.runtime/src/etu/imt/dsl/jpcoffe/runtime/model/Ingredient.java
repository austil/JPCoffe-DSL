package etu.imt.dsl.jpcoffe.runtime.model;

public class Ingredient {
	public final String name;
	public final int quantity;
	public final String unit;
	
	public Ingredient(String name, int quantity, String unit) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;
	}
	
	public Ingredient(String name, int quantity) {
		this(name, quantity, "");
	}
	
	public Ingredient(String name) {
		this(name, 1);
	}
}
