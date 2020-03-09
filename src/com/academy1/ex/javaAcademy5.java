package com.academy1.ex;

import java.util.Scanner;

public class javaAcademy5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*//문제1
		System.out.println("수 입력");
		int a=sc.nextInt();
		System.out.println(a);
	
		sc.nextLine();
		//문제2
		System.out.println("세로와 가로 길이를 입력하라");
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("넓이는"+(b*c)+"입니다");
		//문제3
		System.out.println("세로 가로 높이를 입력하라");
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		int result = 2*(d*e+e*f+e*f);
		System.out.println("겉넓이는"+result+"입니다");
		//문제4
		System.out.println("수 입력");
		int g=sc.nextInt();
		if(g>10) {
			System.out.println("10보다 크다");
		}
		else if(g<10){
			System.out.println("10보다 작다");
		}
		else {
			System.out.println("10 입니다");
		}*/
		/*//문제5
		System.out.println("수 입력");
		int h=sc.nextInt();
		if(h>0) {
			System.out.println("양수입니다");
		}
		else {
			System.out.println("0이거나 음수 입니다");
		}
		//문제6
		System.out.println("수 입력");
		int i=sc.nextInt();
		if(i%2==0) {
			System.out.println("짝수 입니다");
		}
		else {
			System.out.println("홀수 입니다");
		}
		//문제7/
		int a=3;
		int b=1;
		for(b=1;b!=10;b++) {
			a=a+3;	
		}
		
		System.out.println(a);
		//문제7-1
		int j;
		for(j=0;j<3;j++) {
			System.out.println("안녕");
		}
		
		//문제7
		System.out.println("수 입력");
		int k=sc.nextInt();
		int i;
		for(i=1;i<=k;i++) {
			System.out.println(i);
			
		}
		//문제8
		int a;
		int sum=0;
		for(a=1;a<=10;a++) {
			sum=sum+a;
		}
		System.out.println(sum);
		//문제9
		System.out.println("두 수를 입력하세요");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		for(int i=a+1; i<b; i++) {
			sum=sum+i;	
		}
		System.out.println(sum);
		//문제10/
		String color="빨강";
		int brightness=50;
		System.out.println("색과 밝기를 입력하시오");
		String colorInput=sc.next();
		int brightnessInput=brightness+1;
		System.out.println("현재 색상은"+colorInput+ "밝기는" +brightnessInput+ "이다");
	    //문제 11
		System.out.println("두 수를 입력");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		//문제12
		System.out.println("두 수 입력");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		c=a;
		a=b;
		b=c;
		if(a>b) {
			System.out.println(a);
			
		}
		else {
			System.out.println(b);
		}
		//문제13
		int a=0;
		for(a=1;a<101;a++) {
			if(a%7==0) {
				System.out.println(a);
			}
			
		}
		//문제14
		int a;
		for(a=1;a<=100;a++){
			if(a%4==0) {
				continue;
			}
			System.out.println(a);	
		}
		//문제15
		int a;
		int sum=0;
		for(a=2;a<=100;a+=2) {
			sum=sum+a;	
		}
		System.out.println(sum);
		//문제16
		int a;
		int sum = 0;
		for(a=1;a<=100;a++) {
			if(a%2==0) {
				sum=sum-a;
			}
			else {
				sum=sum+a;
			}
		}
		System.out.println(sum);
		//문제 17
		double d;
		double sum=0;
		for(d=1;d<100;d++) {
			sum=sum+d/(d+1);
		}
		System.out.println(sum);
		//문제 18
		int a=1;
		int b=1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=10;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		System.out.println("돈 넣으세요");
		int money=sc.nextInt();
		System.out.println("커피 2000원 콜라 1000원 사이다 1500원");
		String drk=sc.next();
		int change=0;
		
		switch(drk) {
		
		
		case "커피":
			change=money-2000;
			System.out.println("커피"+" "+"잔돈은"+change+"원");
			break;
		case "콜라":
			change=money-1000;
			System.out.println("콜라"+" "+"잔돈은"+change+"원");
			break;
		case "사이다":
			change=money-1500;
			System.out.println("사이다"+" "+"잔돈은"+change+"원");
			break;
		default:
			break;
		
		}*/
		
		
			
	}
		
	

}
