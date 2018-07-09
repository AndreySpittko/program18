package com.ua;

public class Employee18 extends Person18 {
	
	private String company;
	
	// create constructors
	Employee18() {
		
	}
	Employee18(String name, String company) {
		super();
		this.company = company;
	}
	
	// create set and get
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public void display() {
		System.out.printf("Employee %s work in %s \n", super.getName(), this.company);
	}

}
