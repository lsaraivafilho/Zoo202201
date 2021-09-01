package model;

/**
 * @author Dylan Thomas - djthomas4
 * CIS175 - Fall 2021
 * Aug 31, 2021
 */
public class Fish {

	private String name;
	private String color;
	private int age;
	
	public Fish() {
		super();
	}
	
	public Fish(String name, String color, int age) {
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
		return "Fish [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	public String makeNoise() {
		return "Glub glub";
	}

}
