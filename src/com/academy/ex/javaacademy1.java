package com.academy.ex;
class Human{
	public String name;
	public int age;
	public double tall;
}
class animal{
	public String hairColor;
	public String 나이;
	public double legCount;
	
	
}
public class javaacademy1 {

	public static void main(String[] args) {
		//class
		//사람 정보담아서 화면에 출력해보자.
		//이름 나이 키
		String name="홍길동";
		int age=29;
		double tall=125.4;
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("tall"+tall);

		
		//사람이 3명이면?  강아지 고양이 데이테가 섞여있으면?
		
		Human h=new Human();
		h.name="홍길동";
		h.age=age;
		h.tall=123.34;
		System.out.println("name:"+h.name);
		System.out.println("age:"+h.age);
		System.out.println("tall:"+h.tall);
		
		Human h1=new Human();
		h1.name="나르샤";
		h1.age=21;
		h1.tall=153.34;
		System.out.println("name:"+h1.name);
		System.out.println("age:"+h1.age);
		System.out.println("tall:"+h1.tall);
		
		int i;
		int sum=0;
		for(i=0;i<=10;i=i+2) {//11 23
			sum=sum+i;
					
		}
		System.out.println(sum);
		int a=0;
		while(a<=10) {
		
			
			sum=sum+a;
			a=a+2;
		}
		System.out.println(sum);
		
	}
	

}
