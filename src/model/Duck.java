package model;

/**
 * Ben Sanders - bsanders3
 * CIS175
 * Aug 31, 2021
 */
public class Duck {
	
	private String name;
	private String color;
	private int age;
	
	public Duck() {
		super();
		
		
	}

	/**
	 * @param name
	 * @param color
	 * @param age
	 */
	public Duck(String name, String color, int age) {
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
		return "Duck [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	
	public String speak() {
		return "Quack!";
	}
}
