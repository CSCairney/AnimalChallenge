package com.qa.animal;

public class Rabbit extends Animal implements Terrain {
	
	public Rabbit() {}

	public Rabbit(int averageLifeSpan, Boolean warmblood, int eyes, boolean extinct, int weight, String colour) {
		super(warmblood, eyes, extinct);
		this.weight = weight;
		this.colour = colour;
		
				
	}

	private int averageLifeSpan;
	private int weight;
	private String colour;

	
	//methods
		@Override
		public String TypeOfAnimal(String Class) {
			return Class;

		}

		@Override
		public void SuitableTerrain() {
			System.out.println("land");

		}
		
		@Override
		public void size() {
			System.out.println("Small");

		}

		@Override
		public void origin() {
			System.out.println("Asia");

		}
		
		@Override
		public String SuitableTerrain(String terrain) {
			// TODO Auto-generated method stub
			return null;
		}
	
//getters and setters
	public int getAverageLifeSpan() {
		return averageLifeSpan;

	}

	public void setAverageLifeSpan(int averageLifeSpan) {
		this.averageLifeSpan = averageLifeSpan;
	}
	
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Rabbit [getAverageLifeSpan()=" + getAverageLifeSpan() + ", getWeight()=" + getWeight()
				+ ", getColour()=" + getColour() + ", getWarmblood()=" + getWarmblood() + ", getEyes()=" + getEyes()
				+ ", getExtinct()=" + getExtinct() + "]";
	}

	
	
		
}
