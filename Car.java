package java_work;

public class Car {

	private String types;
	private String model;
	private String colour;
	private int speed;

	public Car(String types, String model, String colour, int speed) {

		this.types = types;
		this.model = model;
		this.colour = colour;
		this.speed = speed;

	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		System.out.println("welcome");
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void increasespeed(int speed) {
		this.speed = speed;

	}

	public void changecolour(String color) {
		this.colour = color;

	}

}
