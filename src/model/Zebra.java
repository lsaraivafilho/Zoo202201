package model;

/**
 * @author Gary Boothroyd - gboothroyd@dmacc.edu
 *CIS175 - Fall 2021
 * Aug 30, 2021
 */
public class Zebra {
private String size;
private int age;
private String color;

public Zebra() {
	super();
}
	/**
 * @param size
 * @param age
 * @param color
 */
public Zebra(String size, int age, String color) {
	super();
	this.size = size;
	this.age = age;
	this.color = color;
}
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Zebra [size=" + size + ", age=" + age + ", color=" + color + "]";
	}


	public String speak() {
		return "Hee Haw";
	}

	
	

}
