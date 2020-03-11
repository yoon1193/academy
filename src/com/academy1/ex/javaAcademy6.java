package com.academy1.ex;

import java.util.Random;
import java.util.Scanner;

public class javaAcademy6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//p.7문제10 무한루프
		//p.8문제1 97
		//p.8문제2 무한루프
		//p.9문제3
		/*System.out.println("하나의 수를 입력하세요");
		int input=sc.nextInt();
		int a=1;
		int b=0;
		for(int i=1;i<input;i++) {
			b+=a;
			if(b>input) {
				break;
			}
			a++;
			
			System.out.println(b);
		}
		//p.9문제5 몰르
		//p.10문제3
		int sum=0;
		int i2=0;
		while(i2<5) {
			System.out.println("정수를 입력하라");
			int num=sc.nextInt();
			if(num<0) {
				num=-num;
			}
			sum+=num;
			i2++;
		}
		System.out.println("다섯 개 정수의 합:"+sum);
		//p.11문제4
		System.out.println("값을 입력하세요");
		int inputNum=sc.nextInt();
		int num1=inputNum;
		int num2=0;
		int count=0;
		while(num1>=num2) {
			num1=num1-2;
			num2=num2+3;
			count++;
			if(num1-num2<0) {
				System.out.println("num1값은:"+num1);
				System.out.println("num2값은:"+num2);	
				System.out.println("num1-num2<0 때까지의 횟수는:"+count);
			}
		
				
		}
		//p.12문제3
		int num3=0,num4=0;
		int result=0;
		String s="";
		while(!s.equals("3")) {
			System.out.println("1.숫자입력\n2연산선택\n3.종료");
		s=sc.next();
		switch(s) {
		case"1":
			System.out.println("첫번째 수를 입력하세요:");
			num3=sc.nextInt();
			System.out.println("두번째 수를 입력하세요:");
			num4=sc.nextInt();
			break;
		case"2":
			System.out.println("연산 선택(+,-,*,/)");
			String s1="";//여기서 이렇게 써도 되는지?
			s1=sc.next();
			if(s1.equals("+")) {
				result=num3+num4;
			}
			else if(s1.equals("-")) {
				result = num3-num4;
			}
			else if(s1.equals("*")) {
				result = num3*num4;
			}
			else if(s1.equals("/")) {
				result = num3/num4;
			}
			else {
				System.out.println("잘못입력");
				break;
			}
			System.out.println(s1+ "연산입니다." +num3+s1+num4+ "결과값은="+result);
			//아무키나 눌러주세요
			break;
		case"3":
			System.out.println("종료되었습니다 감사합니다");
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			break;
		}

		
		}
		//p.13문제4
		//p.13문제1 1번
		//p.13문제2 1번
		//p.13문제3 1번
		//p.14문제9 
		//p.14문제-
		Random rand=new Random();
		System.out.println("0~9까지 숫자를 입력하세요.");
		int com=rand.nextInt(9);
		for(int j=0;j<10;j++) {
			System.out.println(j+1+"번 쨰 도전");
			int user=sc.nextInt();
			if(user>com) {
				System.out.println(user+"보다 작습니다");
			}
			else if(user<com) {
				System.out.println(user+"보다 큽니다");
			}
			else if(user==com) {
				System.out.println("우와!정확합니다."+" "+j+"번째만에 맞췄군요!");
				break;
			}
		}
		//p.15문제1
		int i3;
		int sum1=0;
		for(i3=0;i3<100;i3++) {
			sum1+=i3;
		}
		System.out.println(sum1);
		//p.16문제4(a) 10번
		//p.16문제4(b) 10번
		//p.16문제4(c) 11번
		//p.17문제1
		int i4;
		for(i4=1;i4<=10;i4++) {
			if(i4%2==0) {
				System.out.println(i4);
			}
		}
		System.out.println("시험 점수를 입력하세요");
		Random rand=new Random();
		int sum2=0;
		int rand1=rand.nextInt();
		while(true) {
			int num5=sc.nextInt();
			if(num5==0) {		
				break;
			}
			sum2+=num5;
		}	
		System.out.println("시험 점수의 합계는"+sum2+"점 입니다.");*/
		System.out.println("1부터 덧셈하는 프로그램");
		System.out.println("마지막 값을 입력하세요");
		int lastNum=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=lastNum;i++) {
			sum+=i;
			System.out.println("["+(i-1)+"]행 TotalNumber의 값="+sum);
			
			
		}
		System.out.println("1부터"+lastNum+"까지의 총합은"+sum+"입니다.");
		
	
	}
	

}
