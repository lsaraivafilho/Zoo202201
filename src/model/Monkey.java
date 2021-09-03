package model;

public class Monkey {
	// instance variables
	public String name;
	public int age;
	public String type;
	
	// constructors
	public Monkey() {
		// default constructor
	}
	
	public Monkey(String name, int age, String type) {
		// non default constructor
		this.name = name;
		this.age = age;
		this.type = type;
	}

	// getters and setters
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
	
	// methods
	@Override
	public String toString() {
		return "Monkey [name=" + name + ", age=" + age + ", type=" + type + "]";
	}
	
	public String speak() {
		return "ooo ooo, ahh ahh";
	}

}
