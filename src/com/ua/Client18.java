package com.ua;

public class Client18 extends Person18 {
	private int suma;
	private String bank;
	
	// create Constructors
	Client18() {
		
	}
	Client18(String name, int suma, String bank) {
		super();
		this.suma = suma;
		this.bank = bank;
	}
	
	//create set and get
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getSuma() {
		return suma;
	}
	public void setSuma(int suma) {
		this.suma = suma;
	}
	
	@Override
	public void display() {
		System.out.printf("Cliant %s have %d$ in bank %s \n", super.getName(), this.suma, this.bank);
	}
}
