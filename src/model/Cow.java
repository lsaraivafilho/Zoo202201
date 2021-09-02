package model;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Sep 2, 2021
 */
public class Cow {
	
	private String name;
	private int age;
	private String type;
	
	public Cow() {
		super();
	}
	
	public Cow(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
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

	
	public String getType() {
		return type;
	}

	
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Cow [name=" + name + ", age=" + age + ", type=" + type + "]";
	}
	
	public String speak() {
		return "Mooooooo";
	}

}
