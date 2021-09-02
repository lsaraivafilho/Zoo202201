package model;
/**
 * @author AndrewDowd - adowd1
 * CIS175 - Fall 2021
 * 9/1/2021
 */
public class Bear {
	
	private String name;
	private int age;
	private boolean angry;
	
	
	public Bear() {
		super();
		this.age = 0;
		this.angry = false;
		this.name = "null";
	}
	
	public Bear(int age, boolean angry, String name) {
		super();
		this.name = name;
		this.age = age;
		this.angry = angry;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public boolean getAngry() {
		return angry;
	}
	
	public void setAngry(boolean angry) {
		this.angry = angry;
	}
	
	@Override
	public String toString() {
		return "Bear [name=" + this.name + ", age=" + this.age + ", angry =" + this.angry  + "]";
	}
	public String speak() {
		return "Grrrr!";
	}
}
