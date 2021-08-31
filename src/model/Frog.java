/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Aug 31, 2021
 */

package model;

public class Frog {
	private String name;
	private String color;
	private boolean poisonous;
	
	public Frog() {
		super();
	}
	
	public Frog(String name, String color, boolean poisonous) {
		super();
		this.name = name;
		this.color = color;
		this.poisonous = poisonous;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

	/**
	 * @return the poisonous
	 */
	public boolean isPoisonous() {
		return poisonous;
	}

	/**
	 * @param poisonous the poisonous to set
	 */
	public void setPoisonous(boolean poisonous) {
		this.poisonous = poisonous;
	}
	
	public String makeNoise() {
		return "Ribbit!";
	}
	
	
	
	

}
