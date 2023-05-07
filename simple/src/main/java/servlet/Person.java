package servlet;

public class Person {

	private String brand = "Default";
	private String model = "Default";
	private float passengers = 0;
	private int year = 0;
	private float fuel_economy = 0;
	private String color = "Default";
	private String transmission = "Default";
	
	public Person() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Person(String brand,String model,String color,String transmission,float passengers,int year,float fuel_economy) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.transmission = transmission;
		this.passengers = passengers;
		this.year = year;
		this.fuel_economy = fuel_economy;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPassengers() {
		return passengers;
	}

	public void setPassengers(float passengers) {
		this.passengers = passengers;
	}

	public float getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getFuel_economy() {
		return fuel_economy;
	}

	public void setFuel_economy(float fuel_economy) {
		this.fuel_economy = fuel_economy;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString1() {
		return brand+","+model+","+passengers+","+year+","+fuel_economy+","+color+","+transmission;
	}
}
