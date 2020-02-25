package com.academy.ex;
class Human{
	public String name;
	public int age;
	public double tall;
	//Human = new Human()
}
class Animal{
	public String hairColor;
	public double legCount;
	public int age1;
	
}
public class javaacademy1 {

	public static void main(String[] args) {
		//class
		//사람 정보를 담아서 화면에 출력해보자.
		//이름 나이 키 변수에 넣어봐
		String name="홍길";
		int age=20;
		double tall=192.2;
		System.out.println(String.format("name:%s", name));
		System.out.println("age:"+age);
		System.out.println("tall:"+tall);

		//3명이면? 강아지 고양이 데이터가 섞여 있으면?
		//관련 있는 데이터를 묶어서 새로운 자료형을 만들어서 무넺해결
		
		Human h=new Human();
		h.name="홍길";
		h.age=34;
		h.tall=123.34;
		System.out.println("name:"+h.name);
		System.out.println("age:"+h.age);
		System.out.println("tall:"+h.tall);
		
		Human h1=new Human();
		h1.name="날샤";
		h1.age=21;
		h1.tall=192.34;
		System.out.println("name:"+h1.name);
		System.out.println("age:"+h1.age);
		System.out.println("tall:"+h1.tall);
		
		
		//고양 강아 데이터를 저자항수 있는 클래그를 만들어 2마리씩 출력
		//hairColor,legCount,age
		String hairColor="green";
		double legCount=4563.44;
		int age1=123;
		System.out.println("hairColor:"+hairColor);
		System.out.println("legCount:"+legCount);
		System.out.println("age:"+age1);
		
		Animal cat=new Animal();
		cat.hairColor="red";
		cat.legCount=3.28;
		cat.age1=14;
		System.out.println("hairColor:"+cat.hairColor);
		System.out.println("legCount:"+cat.legCount);
		System.out.println("age:"+cat.age1);
		
		
		Animal dog=new Animal();
		dog.hairColor="blue";
		dog.legCount=7.28;
		dog.age1=1515;
		System.out.println("hairColor:"+dog.hairColor);
		System.out.println("legCount:"+dog.legCount);
		System.out.println("age:"+dog.age1);
		
		Animal dog2=new Animal();
		dog2.hairColor="yellow";
		dog2.legCount=9.28;
		dog2.age1=155;
		System.out.println("hairColor:"+dog2.hairColor);
		System.out.println("legCount:"+dog2.legCount);
		System.out.println("age:"+dog2.age1);
		
		
		
	}
	
//핸드폰 학생 자동차 엘리베이터 본이이 생각한 새로운 객체 5랠 만들어서 데이터
}

