package com.spring.aop;

public class Circle {
	
	private String name;

	public String getName() {
		return name;
	}

	public void  setName(String name) {
		this.name = name;
		System.out.println("circle setter method is called");
		throw new RuntimeException();
	}

	 
	public String setNameThrowing(String name)
	{
		this.name=name;
		System.out.println("inside the setNameThrowing method");
		return name+" by throwing";
	}

}
