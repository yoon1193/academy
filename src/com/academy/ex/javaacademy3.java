package com.academy.ex;
class cellphon {
public String model;
public String agency;
public String number;
}
class student {
public String name;
public int age;
public double tall;
}
class car {
public String model;
public String number;
public String color;
}
class elevator {
public String company;
public int person;
public double high;
}
class shoues {
public String brand;
public int size;
public String color;

}

public class javaacademy3 {

	public static void main(String[] args) {
		cellphon cp = new cellphon();
		cp.model = "S9";
		cp.agency = "LGU+";
		cp.number = "010-1234-5678";
		System.out.println("<�ڵ���>\n���� : "+cp.model+"\n��Ż� : "+cp.agency+"\n��ȣ : "+cp.number+"\n");

		student st = new student();
		st.name = "���л�";
		st.age = 18;
		st.tall = 165.8;
		System.out.println("<�л�>\n�̸� : "+st.name+"\n���� : "+st.age+"��\nŰ : "+st.tall+"cm\n");

		car car = new car();
		car.model = "SM6";
		car.number = "06��1234";
		car.color = "blue";
		System.out.println("<�ڵ���>\n�� : "+car.model+"\n��ȣ : "+car.number+"\ncolor : "+car.color+"\n");


		elevator ev = new elevator();
		ev.company = "(��)�ż�����������";
		ev.person = 16;
		ev.high = 2.5;
		System.out.println("<����������>\nȸ�� : "+ev.company+"\n�����ο� : "+ev.person+"��\n���� : "+ev.high+"m\n");

		shoues sh = new shoues();
		sh.brand = "adidas";
		sh.size = 225;
		sh.color = "black";
		System.out.println("<�Ź�>\n�귣�� : "+sh.brand+"\n�Ź߻����� : "+sh.size+"mm\ncolor : "+sh.color+"\n");


	}

}
