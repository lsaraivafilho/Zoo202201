package model;


//Author: Ryan Juelsgaard (@RyanJuels)

public class Elephant {

	
	//Variable for the Elephant
	private String name;
	private String species;
	private double height;
	
	
	
	public Elephant() {
		super();
	}
	
	public Elephant(String name, String species, double height) {
		super();
		this.name = name;
		this.species = species;
		this.height = height;
	}
	
	// Setters for the variables
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	// Getters for the variables
	
	public String getName() {
		return name;
	}
	public String getSpecies() {
		return species;
	}
	
	public double getHeight() {
		return height;
	}
	
	@Override
	public String toString() {
		return "Elephant [name=" + name + ", species=" + species + ", height=" + height + "]";
	}
	
	
	
	public String speak() {
		return "Trumpet noise";
	}
	
}
