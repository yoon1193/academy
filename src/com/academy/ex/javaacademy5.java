package com.academy.ex;

 

public class javaacademy5 {

 

	public static void main(String[] args) {

		//사용자에게 숫자를 입력받아 1004면 "암호가 맞음"

		//아니면 "암호가 틀림"이 출력되도록 프로그램구현

		java.util.Scanner sc=new java.util.Scanner(System.in);

 

		System.out.println("숫자를 입력하시오");

		//int input=Integer.parseInt(sc.nextLine());

		int input=sc.nextInt();

		if(input==1004) {

			System.out.println("'암호가 맞음'");

		}

		else {

			System.out.println("'암호가 틀림'");

		}

		

	

		//안녕를 입력하면 너도안녕 

	    //잘가  가 입력되면 너도잘가

		//sc.nextLine();

		sc.nextLine();

		

		System.out.println("문자를 입력하세요:");

		String s=sc.nextLine();

		String s1="안녕";

		String s2="잘자";

		String s3="잘가";

		if(s.equals("안녕")) {

			System.out.println("너도 안녕");

		}

		if(s.equals("잘자")) {

			System.out.println("너도 잘자");

		}

		if(s.equals("잘가")) {

			System.out.println("너도 잘가");

		}

		

		

	

		//두수의 차이를 구하는 프로그램을 구해보자

		System.out.println("두 수를 입력하세요");

		int a=sc.nextInt();

		int b=sc.nextInt();

		//int a=Integer.parseInt(sc.nextLine());

		//int b=Integer.parseInt(sc.nextLine());

		if(a>b) 

			System.out.println(a-b);		

		else 

			System.out.println(b-a);	

 

		sc.close();

	}

 

}