package com.academy.dto;

public class Studen {
	public String school;
	public double tall;


	public static void main(String[] args) {
		Studen s=new Studen();
		s.tall=178;
		s.school="cheonan";
		
		System.out.println("tall:"+s.tall);
		System.out.println("school:"+s.school);

	}

}
