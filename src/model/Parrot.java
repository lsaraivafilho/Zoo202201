package model;

/**
 * @author blast - Aaron Barker, ABN82nd
 * CIS175 - Fall 2021
 * Sep 2, 2021
 */
public class Parrot {
	
	private String name;
	private String origin;
	private int age;
	
	
	/**
	 * CONSTRUCTORS
	*/
	public Parrot() {
		super();
	}

	public Parrot(String name, String origin, int age) {
		super();
		this.name = name;
		this.origin = origin;
		this.age = age;
	}
	
	
	/**
	 * GETTERS & SETTERS
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	/**
	 * METHODS
	*/
	@Override
	public String toString() {
		return "Parrot - - [Animal's Name: " + name + ", Country of Origin: " + origin + ", Animal's Age: " + age + "]";
	}
	public String speak() {
		return "Squock! Gimme a Cracker!";
	}
	
}