package com.qa.animal;

public abstract class Animal implements Classification {

	private boolean warmblood;
	private int eyes;
	private boolean extinct;

	public abstract void size();

	public abstract void origin();
	
	public Animal() {}
	
	public Animal(Boolean warmblood, int eyes, boolean extinct) {
		this.warmblood = warmblood;
		this.eyes = eyes;
		this.extinct = extinct;
		
	}
	//getters and setters
	public boolean getWarmblood() {
		return warmblood;

	}

	public void setWarmblood(boolean warmblood) {
		this.warmblood = warmblood;
		System.out.println(warmblood);
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public boolean getExtinct() {
		return extinct;
	}

	public void setExtinct(boolean extinct) {
		this.extinct = extinct;
	}

	@Override
	public String toString() {
		return "Animal [warmblood=" + warmblood + ", eyes=" + eyes + ", extinct=" + extinct + "]";
	}

	public void SuitableTerrain() {
		
		
	}
	
	

}
