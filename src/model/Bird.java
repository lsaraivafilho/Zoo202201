/**
 * @author Caleb - cawasle
 * CIS175 - Fall 2021
 * Aug 30, 2021
 */
package model;

public class Bird {
	private String name;
	private String color;
	private  int wingSpan;
	
	public Bird()
	{
		super();
	}
	
	public Bird(String name, String color, int wingSpan)
	{
		this.name = name;
		this.color = color;
		this.wingSpan = wingSpan;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setWingSpan(int wingSpan)
	{
		this.wingSpan = wingSpan;
	}
	
	public int getWingSpan()
	{
		return wingSpan;
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", color=" + color + ", wingSpan=" + wingSpan + "]";
	}
	
	public String speak()
	{
		return "Caw! Caw!";
	}
	
}
