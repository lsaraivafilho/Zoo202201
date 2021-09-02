package model;

/**
 * Alexander Pontier ampontier1
 * CIS175 - Fall 2021
 * Sep 2, 2021
 */
public class Raven {
	
	//Initializing variables
	private String name;
	private double wingSpan;
	private int age;
	
	//Constructors
	public Raven() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Raven(String name, double wingSpan, int age) {
		super();
		this.name = name;
		this.wingSpan = wingSpan;
		this.age = age;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Raven [name=" + name + ", wingSpan=" + wingSpan + ", age=" + age + "]";
	}
	public String speak() {
		return "Nevermore!";
	}

}
