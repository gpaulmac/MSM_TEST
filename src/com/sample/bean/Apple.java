package com.sample.bean;

public class Apple {
	private String color;
	private int taste;
	private boolean hasWorm;
	private int weight;

	public Apple(String color, int taste, boolean hasWorm, int weight) {
		if (color.equalsIgnoreCase("green") || color.equalsIgnoreCase("red")
				|| color.equalsIgnoreCase("blue")) {
			this.color = color;
		} else {
			throw new IllegalArgumentException();
		}

		if (taste == 1 || taste == 2 || taste == 3 || taste == 4) {
			this.taste = taste;
		} else {
			throw new IllegalArgumentException();
		}

		// this.taste = taste;
		this.hasWorm = hasWorm;
		if (weight > 10 && weight < 100) {
			this.weight = weight;
		} else {
			throw new IllegalArgumentException();
		}

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equalsIgnoreCase("green") || color.equalsIgnoreCase("red")
				|| color.equalsIgnoreCase("blue")) {
			this.color = color;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int getTaste() {
		return taste;
	}

	public void setTaste(int taste) {
		if (taste == 1 || taste == 2 || taste == 3 || taste == 4) {
			this.taste = taste;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public boolean hasWorm() {
		return hasWorm;
	}

	public void sethasWorm(boolean hasWorm) {
		this.hasWorm = hasWorm;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight > 10 && weight < 100) {
			this.weight = weight;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String toString() {
		StringBuilder result = new StringBuilder();

		result.append(this.getClass().getName() + "{");
		result.append(" color: " + color);
		result.append("  taste " + taste);
		result.append(" hasWorm " + hasWorm);
		result.append(" weight: " + weight);
		result.append("}");

		return result.toString();
	}
}
