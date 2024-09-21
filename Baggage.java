/*
 * Assessment: Lab Project 2
 * Student Name: Olivier Niyonshima
 * Lab Professor Name: Leanne Seaward
 * Lab Section Number: 301
 * Due Date: Jul 28, 2024 11:59 PM

 * Program description: This program handles baggage information,
 * checks weight and dimensions, and determines if a bag can be
 * used as a carry-on, applying surcharges if necessary.
 */
public class Baggage {

	private int length;
	private int width;
	private int height;
	private double weight;

	private static final int DEFAULT_LENGTH = 65;
	private static final int DEFAULT_WIDTH = 25;
	private static final int DEFAULT_HEIGHT = 50;
	private static final double DEFAULT_WEIGHT = 10.0;

	public Baggage() {
		this.length = DEFAULT_LENGTH;
		this.width = DEFAULT_WIDTH;
		this.height = DEFAULT_HEIGHT;
		this.weight = DEFAULT_WEIGHT;
	};

	public Baggage(int length, int width, int height, double weight) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}

	public String toString() {
		String result = "This bag has length " + getLength() + " cm, width " + getWidth() + " cm, height " + getHeight()
				+ " cm, and weight " + getWeight() + " kg.";
		if (BaggageChecker.canBeUsedAsACarryOn(this)) {
			result += " This bag can be used as a carry-on.";
		}
		if (BaggageChecker.allowedWeightIsMoreThanMax(this)) {
			
		}
		return result;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}