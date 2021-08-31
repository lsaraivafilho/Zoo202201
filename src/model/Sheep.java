/**
 * @author Becca Deuser - rddeuser
 * CIS175 - Fall 2021
 * Aug 31, 2021
 */
package model;

public class Sheep {
	//declare variables
	private String name;
	private String woolColor;
	private int age;
	
	public Sheep() {
		
	}//end default constructor

	public Sheep(String name, String woolColor, int age) {
		this.name = name;
		this.woolColor = woolColor;
		this.age = age;
	}//end constructor

	public String getName() {
		return name;
	}//end getName

	public void setName(String name) {
		this.name = name;
	}//end setName

	public String getWoolColor() {
		return woolColor;
	}//end getWoolColor

	public void setWoolColor(String woolColor) {
		this.woolColor = woolColor;
	}//end setWoolColor

	public int getAge() {
		return age;
	}//end getAge

	public void setAge(int age) {
		this.age = age;
	}//end setAge

	@Override
	public String toString() {
		return "Sheep [name=" + name + ", woolColor=" + woolColor + ", age=" + age + "]";
	}//end toString

	public String speak() {
		return "Baa! Baa!";
	}//end speak
	
}//end Sheep
