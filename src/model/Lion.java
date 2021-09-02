package model;

/**
 * @author noahc - nmchung
 * CIS175 - Fall 2021
 * Sep 2, 2021
 */
public class Lion {
	private String name;
	private String color;
	private String maneColor;
	int age;
	
	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lion(String name, String color, String maneColor, int age) {
		super();
		this.name = name;
		this.color = color;
		this.maneColor = maneColor;
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
	
	public String getManeColor() {
		return maneColor;
	}
	
	public void setManeColor(String maneColor) {
		this.maneColor = maneColor;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Lion [name=" + name + ", color=" + color + ", maneColor=" + maneColor + ", age=" + age + "]";
	}
	
	public String speak() {
		return "Roar!";
	}
}
