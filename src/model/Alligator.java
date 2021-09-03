package model;

//Arda Rugji

public class Alligator {
	//Variables 
	private String color;
	private int length;
	private int weight;
	
	//Constructors
	
	public Alligator()
	{
		super();
	}
	
	public Alligator(String color, int length, int weight)
	{
		super();
		this.color = color;
		this.length = length;
		this.weight = weight;
	}

	//Methods
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Alligator [color=" + color + ", length=" + length + ", weight=" + weight + "]";
	}
	
	//Sound method
	public String makeNoise()
	{
		String noise = "Hisssss...";
		return noise;
	}
}
