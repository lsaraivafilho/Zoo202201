package model;

/**
 * Alexander Pontier ampontier1
 * CIS175 - Fall 2021
 * Sep 2, 2021
 */
public class Owl {
	
	//Initializing variables
	private String name;
	private String parliment;
	private int age;
		
	//Constructors	
	public Owl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Owl(String name, String parliment, int age) {
		super();
		this.name = name;
		this.parliment = parliment;
		this.age = age;
	}
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParliment() {
		return parliment;
	}
	public void setParliment(String parliment) {
		this.parliment = parliment;
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
		return "Owl [name=" + name + ", parliment=" + parliment + ", age=" + age + "]";
	}
	public String speak() {
		return "How many licks does it take to get to the center of a Tootsie Pop? Let's find out! One...Two...Three...*crunch* Three.";
	}
	

}
