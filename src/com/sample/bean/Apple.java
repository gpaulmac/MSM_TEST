package com.sample.bean;

public class Apple {
	private String color;
	private int taste;
	private boolean hasWorm;
	private int weight;
	
	public Apple(String color, int taste, boolean hasWorm, int weight){
		this.color = color;
		this.taste = taste;
		this.hasWorm = hasWorm;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTaste() {
		return taste;
	}
	public void setTaste(int taste) {
		this.taste = taste;
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
		this.weight = weight;
	}
}
