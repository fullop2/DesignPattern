package Decorator;

public abstract class Beverage {
	String description = "No Title";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
