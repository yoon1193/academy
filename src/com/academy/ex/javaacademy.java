package com.academy.ex;

public class javaacademy {

	public static void main(String[] args) {
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("입력하시오");
//		int input=Integer.parseInt(sc.nextLine());
//		int a=0;
//		if(input>0) {
//			a=1;
//		}
//		else {
//			a=-1;			
//		}
//		System.out.println(a);
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("두 개의 숫자를 입력하시오");
//		int i1=Integer.parseInt(sc.nextLine());
//		int i2=Integer.parseInt(sc.nextLine());
//		if(i1>=i2) {
//			System.out.println(i1);
//		}
//		else {
//			System.out.println(i2);
//		}
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int a=6;
//		int b=20;
//		int c;
//		c=a;
//		a=b;
//		b=c;
//		System.out.println("a:"+a+"b:"+b);
		
		//두수를 입력받아 큰수 a 작은수b ab출력 실행되고나면 항상 받은수 출력
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("두 수 입력");
		int a=Integer.parseInt(sc.nextLine());
		int b=Integer.parseInt(sc.nextLine());
		int c;
		if(a>b) {
			
		}
		else {
			c=a;
			a=b;
			b=c;
		}			
		
		System.out.println(a+" "+b);
		System.out.println(a+""+b);
		
		
		sc.close();
		
	}
	

}
