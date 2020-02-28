package com.academy1.ex;

import java.util.Random;
import java.util.Scanner;

public class javaAcademy1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*//문제1
		int a=3,b=0;
		switch(a+2) {
		case 5:b=1;
		default: b+=2;
		}
		System.out.println(a);//실행결과 3
		
		//문제2
		int count=2;
		int hap=0;
		switch(++count) {
		case 1:hap=hap+count++;
		case 2:hap=hap+count++;
		case 3:hap=hap+count++;
		case 4:hap=hap+count++;
		case 5:hap=hap+count++;
		}
		System.out.println(String.format("hap의 값 : %d\n",hap));//실행결과 12
		
		//문제6
		System.out.println("월을 입력하세요");
		int mon=sc.nextInt();
		switch(mon) {
		case 1: 
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Fed");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("Jul");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
			default:
				System.out.println("월이 아님");		
		}
		
		//연습문제1 = 4번
		//연습문제2 = default:
		 
		 
		//연습문제3
		System.out.println("두 정수를 입력");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>=10) {
			System.out.println(a);
		}
		else if(b!=0) {
			System.out.println(a/b);
		}
		else {
			System.out.println(b!=0);		
		}
		
		//연습문제4
		System.out.println("두 정수 입력");
		int c=sc.nextInt();
		int d;
		
		switch(c) {
		case 3:d=1;
		break;
		case 5:d=2;
		break;
		case 7:d=3;
		break;
		default:d=0;
		}
		System.out.println(d);
		
		
		//연습문제5
		int age=25;
		int cm=95;
		if(age<20) {
			if(cm<85) {
				System.out.println("사이즈는 S입니다");
			}
			else if(cm>=85 && cm<95) {
				System.out.println("사이즈는 M입니다");
			}
			else {
				System.out.println("사이즈는 L입니다");
			}
		}
		if(age>=20) {
			if(cm<90) {
				System.out.println("사이즈는 S입니다");
			}
			else if(cm>=90 && cm<100) {
				System.out.println("사이즈는 M입니다");
			}
			else  {
				System.out.println("사이즈는 L입니다");
			}
		}
		
		//도전1
		System.out.println("사칙 연산 입력(정수)");
		int e=sc.nextInt();
		String s=sc.next();
		int f=sc.nextInt();
		int result = 0;
		
		switch(s) {
		case "+": result=e+f;
		break;
		case"-": result=e-f;
		break;
		case"*": result=e*f;
		break;
		case"/": result=e/f;
		break;
		default:
			break;
		}
		System.out.println(result);
		
		//도전2
		int m=100;
		System.out.println("가졍형편 정도를 입력하시오");
		int rich=sc.nextInt();
		System.out.println("이전학기 학정을 입력하시오");
		double grade=sc.nextDouble();
		
		if(rich>=100&&grade>=4.0) {
			m=m-(m*20/100);
				}
		else {
			m=m-(m*40/100);
		}
		System.out.println("다음 학기 납일할 등록급은"+m+"만원 입니다");
		
		//도전3
		System.out.println("전기 사용량을 입력하세요(kw)");
		int kw=sc.nextInt();
		int p;
		double p1;
		if(kw<=0){
			p=0;
			p1=0;
		}
		else if(kw>=1&&kw<=100) {
			p=370;
			p1=52.00;
		}
		else if(kw>=101&&kw<=200) {
			p=660;
			p1=88.50;
		}
		else if(kw>=201&&kw<=300) {
			p=1130;
			p1=127.80;
		}
		else if(kw>=301&&kw<=400) {
			p=2710;
			p1=184.30;
		}
		else if(kw>=401&&kw<=500) {
			p=5130;
			p1=274.30;
		}
		else {
			p=9330;
			p1=494.00;	
		}
		int money=(int) (p+(kw*p1));
		money=(int) (p+(kw*p1));
		money=(int) money+(money)*9/100;
	
		System.out.println("이번 달 요금은"+money+"원입니다");
		
		//문제
		System.out.println("3개의 정수를 입력하시오:");
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num>num1 && num>num2) {
			if(num1>num2) {
				System.out.println("가장큰수:"+num+"중간:"+num1+"가장작은수:"+num2);
				
			}
			else {
				System.out.println("가장큰수:"+num+"중간:"+num2+"가장작은수:"+num1);
			}
		}
		else if(num1>num && num1>num2) {
			if(num>num2) {
				System.out.println("가장큰수:"+num1+"중간:"+num+"가장작은수:"+num2);
			}
			else {
				System.out.println("가장큰수:"+num1+"중간:"+num2+"가장작은수:"+num);
			}
		}
		else if(num2>num && num2>num1) {
			if(num>num1) {
				System.out.println("가장큰수:"+num2+"중간:"+num+"가장작은수:"+num1);
			}
			else {
				System.out.println("가장큰수:"+num2+"중간:"+num1+"가장작은수:"+num);
			}
		}
		
		//문제3	
		System.out.println("3개의 정수를 입력하시오:");
		int numb=sc.nextInt();
		int numb1=sc.nextInt();
		int numb2=sc.nextInt();
		int min;
		min=numb;
		if(numb1<min) {
			numb1=min;
		}
		else if(numb2<min) {
			numb2=min;
		}
		System.out.println(min);
		
		//문제4
		Random rand=new Random();
		System.out.println("선택하시오(1:가위 2:바위 3:보)");
		int user=sc.nextInt();
		int com=rand.nextInt(3)+1;
		
		switch(com) {
		case 1:
			System.out.println("컴퓨터는 가위를 냄");
			if(user==1) {
				System.out.println("비겼음");
			}
			else if(user==2) {
				System.out.println("사용자가 이겼음");
			}
			else if(user==3) {
				System.out.println("컴퓨터가 이겼음");
			}
			break;
		case 2:
			System.out.println("컴퓨터는 바위를 냄");
			if(user==1) {
				System.out.println("컴퓨터가 이겼음");
			}
			else if(user==2) {
				System.out.println("비겼음");
			}
			else if(user==3) {
				System.out.println("사용자가 이겼음");
			}
			break;
		case 3:
			System.out.println("컴퓨터는 보를냄");
			if(user==1) {
				System.out.println("사용자가 이겼음");
			}
			else if(user==2) {
				System.out.println("컴퓨터가 이겼음");
			}
			else if(user==3) {
				System.out.println("비겼음");
			}
			break;
			default:
				break;
		}
		
		//아래 두 순서를 코드로 작성
		System.out.println("3개의 정수 입력");
		int g=sc.nextInt();
		int h=sc.nextInt();
		int i=sc.nextInt();
		if(g>h) {
			if(g>i) {
				System.out.println(g);
			}
			else {
				System.out.println(i);
			}
		}
		else if(h>i) {
			System.out.println(h);
		}
		else {
			System.out.println(i);
		}*/
		
		System.out.println("3과목 점수를 입력하세요");
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int mat=sc.nextInt();
		int avg=(kor+eng+mat)/3;
		if(avg>=60) {
			if(kor>=60&&eng>=60&&mat>=60) {
				System.out.println("합격");
			}
			else {
				System.out.println("과락 탈락");
			}
		}
		else {
			System.out.println("평균미달  탈락");
		}
		
		

	}

}
