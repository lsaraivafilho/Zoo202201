/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Aug 30, 2021
 */
package model;

public class Goose {
 //attributes
	private String name;
	private String breed;
	private int age;
	
	//constructors
	public Goose() //default
	{
		super();
	}
    public Goose(String name, String breed, int age) 
    {
    	super();
    	this.setName(name);
    	this.setBreed(breed);
    	this.setAge(age);
    	
    }
    //getters and setters
	/**
	 * @return the name
	 */
	private String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the breed
	 */
	private String getBreed() {
		return breed;
	}
	/**
	 * @param breed the breed to set
	 */
	private void setBreed(String breed) {
		this.breed = breed;
	}
	/**
	 * @return the age
	 */
	private int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	private void setAge(int age) {
		this.age = age;
	}
	public String speak()
	{
		return name + " goes Honk!!!";
	}
	//toString method
	@Override
	public String toString() {
		return "Goose [name = " + getName() + ", breed = " + getBreed() + ", age = " + getAge() + "].";
	}

}
