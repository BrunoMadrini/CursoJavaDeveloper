package entitiessecao08;

public class Calculator {
	
	public double radius;
	
	public double circumference() {
		return (2 * Math.PI) * radius;
	}
	
	public double volume() {
		return (4 * Math.PI * Math.pow(radius, 3)) / 3; 
	}

	public double pi() {
		return Math.PI;
	}
	
	public String toString() {
		return "Circumference : " + String.format("%.2f %n", circumference())
		+ "Volume: " + String.format("%.2f %n", volume())
		+ "PI Value: " + String.format("%.2f", pi());
		
	}
}