package com.academy.ex;

import java.util.Scanner;

public class javaacademy9 {

	public static void main(String[] args) {
		//if if문에 if문을 사용할수잇따
		//달 해 둘중 하나만
		//별은 달이 있을때 그려도 되고 안그려도 된다
		//구름은 해가 있을때 그려도도;고 안그려도되고
		/*boolean isDay=true;
		boolean isStar=true;		
		boolean isCloud=true;
		if(isDay){
			System.out.println("해");
			if(isCloud) {
				System.out.println("구름");
			}
		}
		else {
			System.out.println("달");
			if(isStar) {
				System.out.println("별");
			}
		}
		
		if(isDay&&isCloud) {//isDay==true isCloud==true
			System.out.println("구름");
		}
		if(isDay==false&&isStar==true) {
			System.out.println("별");
		}
		
		boolean isStateA=true;
		boolean isStateB=true;
		//&&
		if(isStateA==true) {
			if(isStateB=true) {
				System.out.println("&&");
				//if(isStateA==true&&isStateB==true)
			}
		}
		boolean isPrint=false;
		if(isStateA==true) {
			isPrint=true;
		}
		if(isStateB==true) {
			isPrint=true;
		}
		if(isStateA==true) {
			System.out.println("||");
		}

       30과40사이 숫
       a>=30 && a<=40/      
       !(a>=30 && a<=40)
       a<60 || a>100
       (a.equals("대전") || b.equals("천안")) && c>=20 && c<30 
		String s="대전";
		String s1="천안";
		int c=29 ;
		if((s.equals("대전") || s1.equals("천안")) && c>=20 && c<30 ) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		//90점 이상 "수" //80점 이상"우"//70점 이상"미" 나머지양
		Scanner sc=new Scanner(System.in);
		System.out.println("점수입력");
		int a=sc.nextInt();
		if(a>=90) {
			System.out.println("수");
		}
		else if(a>=80) {
			System.out.println("우");
		}
		else if(a>=70) {
			System.out.println("미");
		}
		else {
			System.out.println("양,가");
		}
		//switch문은 1:1매칭,실수x(3.5등),범위x
		//else if는 범위가능
		Scanner sc=new Scanner(System.in);
		System.out.println("점수입력");
		int a=sc.nextInt();
		a=a/10;
		switch(a) {
		case 10: case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
	    default:
				System.out.println("양,가");
			break;
	
		}
		System.out.println("월을 입력하세요");
		int b=sc.nextInt();
		switch(b) {
		case 1: case 3: case 5: case 7: case 8: 
		case 10: case 12:
			System.out.println("31일 까지");
			break;
		case 2:
			System.out.println("28일 까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일 까지");
			break;
		default:
			System.out.println("월이 아닙니다");
			break;
		}
		
		System.out.println("월을 입력하시오");
		int c=sc.nextInt();
		if(c==1||c==3||c==5||c==7||c==8||c==10||c==12) {
			System.out.println("31일 까지");
		}
		else if(c==4||c==6||c==9||c==11) {
			System.out.println("30일 까지");
		}
		else if(c==2) {
			System.out.println("28일 까지");
		}
		else {
			System.out.println("월이 아닙니다");
		}*/
		
		//3숫자를 입력받아 큰수대로 출력하는 프로그램의 순서도와 프로그램
		Scanner sc=new Scanner(System.in);
		System.out.println("3 숫자를 입력");
		int a,b,c;
		int i;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(b>a&&b>c) {
			i=a;
			a=b;
			b=i;
		}
		else if(c>a&&c>b) {
			i=a;
			a=c;
			c=i;	
		}
		if(c>b){
			i=b;
			b=c;
			c=i;
		}
		System.out.println(a+"\n"+b+"\n"+c);
			
		//
		
			

		
		
	}

}
