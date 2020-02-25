package com.academy.dto;

public class Bag {
	public String brand;
	public double size;

	public static void main(String[] args) {
		Bag b=new Bag();
		b.brand="nike";
		b.size=34.3;
	
		System.out.println("brand:"+b.brand);
		System.out.println("size:"+b.size);
		
	}

}
