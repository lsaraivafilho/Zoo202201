package model;

/**
 * @author Jonathan Neff - jdneff
 * CIS175 - Fall 2021
 * Aug 27, 2021
 */
public class Moose {

	private String name;
	private String color;
	private int age;
	
	public Moose() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Moose(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Moose [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	public String speak() {
		return "Bellow!";
	}

}

