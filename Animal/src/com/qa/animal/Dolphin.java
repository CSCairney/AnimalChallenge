package com.qa.animal;

public class Dolphin extends Animal implements Terrain {
	
	public Dolphin() {}
	
	private int averageLifeSpan;
	private int length;
	private String colour;

	public Dolphin(int averageLifeSpan, Boolean warmblood, int eyes, boolean extinct, int length, String colour) {
		super(warmblood, eyes, extinct);
		this.length = length;
		this.colour = colour;
		
	}

	//getters and setters
	public int getAverageLifeSpan() {
		return averageLifeSpan;
	}

	public void setAverageLifeSpan(int averageLifeSpan) {
		this.averageLifeSpan = averageLifeSpan;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	//methods
	@Override
	public String TypeOfAnimal(String Class) {
		return Class;

	}

	@Override
	public String SuitableTerrain(String terrain) {
		return terrain;

	}
	
	@Override
	public void size() {
		System.out.println("Medium");

	}

	@Override
	public void origin() {
		System.out.println("Unknown location but appear first around 50-60 million years ago");

	}

	@Override
	public String toString() {
		return "Dolphin [getAverageLifeSpan()=" + getAverageLifeSpan() + ", getLength()=" + getLength()
				+ ", getColour()=" + getColour() + ", getWarmblood()=" + getWarmblood() + ", getEyes()=" + getEyes()
				+ ", getExtinct()=" + getExtinct() + "]";
	}

	

	

	
}
