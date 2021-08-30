/**
 * @author Andrew Pierce - ajpierce1
 * CIS175 - Fall 2021
 * Aug 26, 2021
 */
package model;

/**
 * @author Church519
 *
 */
public class Giraffe {

	String name;
	String species;
	double height;

	/**
	 * 
	 */
	public Giraffe() {
		super();
	}

	/**
	 * @param name
	 * @param species
	 * @param height
	 */
	public Giraffe(String name, String species, double height) {
		super();
		this.name = name;
		this.species = species;
		this.height = height;
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
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Giraffe [name=" + name + ", species=" + species + ", height=" + height + "]";
	}

	public String speak() {
		return "Grunt";
	}

}
