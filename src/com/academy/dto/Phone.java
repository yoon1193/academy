package com.academy.dto;

public class Phone {
	public String model;
	public double size;

	public static void main(String[] args) {
		Phone p=new Phone();
		p.model="iphone";
		p.size=12;
		
		System.out.println("model:"+p.model);
		System.out.println("size:"+p.size);



	}

}
