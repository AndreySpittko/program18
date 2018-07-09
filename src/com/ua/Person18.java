package com.ua;

public class Person18 {
	
	private String name;
	public static int counter = 0;
	
	//constructors
	Person18() {
		this("Unknown");
	}
	Person18(String name) {
		this.name = name;
		counter++;
	}
	
	//set and get
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.printf("Person %s\n", this.name);
	}
	
	public static void showCounter() {
		System.out.printf("Tanal counter: %d", counter);
	}
	
	


}
