package com.qa.animal;

public class Camel extends Animal implements Terrain {
	
	private int averageLifeSpan;
	private int height;
	private String colour;
	
	public Camel() {}
	
	
	public Camel(int averageLifeSpan, Boolean warmblood, int eyes, boolean extinct, int height, String colour) {
		super(warmblood, eyes, extinct);
		this.height = height;
		this.colour = colour;
		
	}

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
	public String SuitableTerrain(String terrain) {
		return terrain;
		
	}


	@Override
	public String TypeOfAnimal(String Class) {
		return Class;
	}


	@Override
	public String toString() {
		return "Camel [getAverageLifeSpan()=" + getAverageLifeSpan() + ", getHeight()=" + getHeight() + ", getColour()="
				+ getColour() + ", getWarmblood()=" + getWarmblood() + ", getEyes()=" + getEyes() + ", getExtinct()="
				+ getExtinct() + "]";
	}


	

}
