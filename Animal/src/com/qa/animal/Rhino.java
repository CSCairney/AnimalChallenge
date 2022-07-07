package com.qa.animal;

public class Rhino extends Animal implements Terrain {
	
	public Rhino() {}

	public Rhino(int averageLifeSpan, Boolean warmblood, int eyes, boolean extinct) {
		super(warmblood, eyes, extinct);
		// TODO Auto-generated constructor stub
	}

	private int averageLifeSpan;
	private int height;
	private String colour;
	
	
	//getters and setters
	public int getAverageLifeSpan() {
		return averageLifeSpan;
	}

	public void setAverageLifeSpan(int averageLifeSpan) {
		this.averageLifeSpan = averageLifeSpan;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	//methods
	@Override
	public void size() {
		System.out.println("Large");

	}

	@Override
	public void origin() {
		System.out.println("North America");

	}

	

	@Override
	public String TypeOfAnimal(String Class) {
		return Class;

	}

	@Override
	public String SuitableTerrain(String terrain) {
		return terrain;

	}

	@Override
	public String toString() {
		return "Rhino [getAverageLifeSpan()=" + getAverageLifeSpan() + ", getHeight()=" + getHeight() + ", getColour()="
				+ getColour() + ", getWarmblood()=" + getWarmblood() + ", getEyes()=" + getEyes() + ", getExtinct()="
				+ getExtinct() + "]";
	}

	

	

}
