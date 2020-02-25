package com.academy.dto;

public class elevator {
	public double size;
	public String brand;

	public static void main(String[] args) {
		
		elevator v=new elevator();
		v.size=12.45;
		v.brand="ele";
		
		System.out.println("size:"+v.size);
		System.out.println("brand:"+v.brand);

	}

}
