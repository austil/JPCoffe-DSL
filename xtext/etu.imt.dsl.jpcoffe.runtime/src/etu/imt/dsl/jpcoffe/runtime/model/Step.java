package etu.imt.dsl.jpcoffe.runtime.model;

public class Step {
	
	public final int[] predecessor;
	public final int number;
	public final String text;
	
	public Step(int[] predecessor, int number, String text) {
		super();
		this.predecessor = predecessor;
		this.number = number;
		this.text = text;
	}

}
