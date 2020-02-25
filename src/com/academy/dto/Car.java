package com.academy.dto;

public class Car {
	public double wheelsize;
	public String brand;


	public static void main(String[] args) {
		Car c=new Car();
		c.wheelsize=12.45;
		c.brand="bmw";
		
		System.out.println("wheelsize:"+c.wheelsize);
		System.out.println("brand:"+c.brand);
		

	}

}
