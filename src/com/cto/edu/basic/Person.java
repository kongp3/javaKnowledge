package com.cto.edu.basic;

public class Person {
	private String aa;
	
	public String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAa() {
		return aa;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.getName();
	}
}
