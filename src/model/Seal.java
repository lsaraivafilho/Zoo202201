/**
 * @author Delanie Johnson - dmjohnson33
 * CIS175 - Fall 2021
 * Sep 2, 2021
 */
package model;

/**
 * @author Delanie 
 * CIS175 - Fall 2021
 * Sept 2, 2021
 */
public class Seal {
	//instance variables
	private String sealType;
	private String sealGender;
	private String sealColor;
	
	public Seal() { //deafault constructor
		super();
	}
	
	public Seal (String sealType, String sealGender, String sealColor) { //non-default constructor
		super();
		this.setSealType(sealType);
		this.setSealGender(sealGender);
		this.setSealColor(sealColor);
		
	}
	
	/**
	 * @return the sealType
	 */
	public String getSealType() {
		return sealType;
	}
	/**
	 * @param sealType the sealType to set
	 */
	public void setSealType(String sealType) {
		this.sealType = sealType;
	}
	/**
	 * @return the sealGender
	 */
	public String getSealGender() {
		return sealGender;
	}
	/**
	 * @param sealGender the sealGender to set
	 */
	public void setSealGender(String sealGender) {
		this.sealGender = sealGender;
	}
	/**
	 * @return the sealColor
	 */
	public String getSealColor() {
		return sealColor;
	}
	/**
	 * @param sealColor the sealColor to set
	 */
	public void setSealColor(String sealColor) {
		this.sealColor = sealColor;
	}
	
	public String makeNoise() {
		
		return ("The " + sealType + " likes to bark and growl.");
	}
	
	
}
