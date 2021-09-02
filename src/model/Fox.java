package model;

/**
 * Alexander Pontier ampontier1
 * CIS175 - Fall 2021
 * Sep 2, 2021
 */
public class Fox {
	
	//Initializing variables
	private String name;
	private String breed;
	private int age;
	
	//constructors
	public Fox() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fox(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//methods
	@Override
	public String toString() {
		return "Fox [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
	public String speak() {
		return "Ring ding ding ding ding!";
	}
	
	
	
	

}
