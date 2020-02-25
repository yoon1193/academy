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
		System.out.println("<핸드폰>\n기종 : "+cp.model+"\n통신사 : "+cp.agency+"\n번호 : "+cp.number+"\n");

		student st = new student();
		st.name = "김학생";
		st.age = 18;
		st.tall = 165.8;
		System.out.println("<학생>\n이름 : "+st.name+"\n나이 : "+st.age+"살\n키 : "+st.tall+"cm\n");

		car car = new car();
		car.model = "SM6";
		car.number = "06가1234";
		car.color = "blue";
		System.out.println("<자동차>\n모델 : "+car.model+"\n번호 : "+car.number+"\ncolor : "+car.color+"\n");


		elevator ev = new elevator();
		ev.company = "(주)신성엘리베이터";
		ev.person = 16;
		ev.high = 2.5;
		System.out.println("<엘레베이터>\n회사 : "+ev.company+"\n수용인원 : "+ev.person+"명\n높이 : "+ev.high+"m\n");

		shoues sh = new shoues();
		sh.brand = "adidas";
		sh.size = 225;
		sh.color = "black";
		System.out.println("<신발>\n브랜드 : "+sh.brand+"\n신발사이즈 : "+sh.size+"mm\ncolor : "+sh.color+"\n");


	}

}
