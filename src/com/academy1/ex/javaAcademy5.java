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
		}
		//문제5
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
		//문제7
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
		//문제10
		String color="빨강";
		int brightness=50;
		System.out.println("색과 밝기를 입력하시오");
		String colorInput=sc.next();
		int brightnessInput=brightness++;
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
		
		//자판기
		//1,2,3,4,0를 입력받아 
		//숫자의 경우는 숫자메뉴 0인경우는 프로그램 종료
		String inputString="";//초기화//null . 찍으면 문제됨
		//사용자가 0을 입력할때까지 계속 반복하눈 프로그램
		while(!inputString.equals("0")) {
			System.out.println("1:밀크커피, 2:블랙커피, 3:라떼,  0:종료");
			inputString = sc.nextLine();
			switch(inputString) {
			case "1":
				System.out.println("밀크커피");
				
				break;
			case "2":
				System.out.println("블랙커피");
				
				break;
			case "3":
				System.out.println("라떼");
				
				break;
			case "0":
				System.out.println("종료");
				
				break;
			default:
				System.out.println("잘 못된 입력입니다");
				break;
						
			}	
		}
		System.out.println("종료");	
		
		//은행계좌 프로그램
		//사용자가 사용 할 수 있는 메뉴 1.입금 2.출금 3.조회 4.종료
		//입금한 금액을 account 변수에 저장한다
		//모든 case문에서 다 접근할수 있도록 account 변수를 while문 밖에 선언한다.
		int account=0;
		String s="";
		while(!s.equals("4")) {
			System.out.println("1:입금, 2:출금, 3:조회, 4:종료");
			s = sc.next();
			switch(s) {
			case "1":
				System.out.println("입금 할 금액을 넣어주세요");
				int input=sc.nextInt();
				account=account+input;
				System.out.println(input+"원 입금완료");
				System.out.println("현재 잔액은"+ account+"원 입니다");
				break;
			case "2":
				System.out.println("출금 할 금액을 입력하세요");
				int output=sc.nextInt();
				if(output>account) {
					System.out.println("잔액 부족");
				}
				else {
					account=account-output;
				}
				System.out.println("현재 잔액은"+ account+"원 입니다");
			
				break;
			case "3":
				System.out.println("조회 된 금액은"+account+"원 입니다");
				break;
			case "4":
				System.out.println("종료");
				break;
			default:
				System.out.println("잘 못된 입력입니다.");
				break;
			}	
		}*/
	
	
		int money=0;
		int inputMoney = 0;
		int m1000,m500,m100,m50=0;
		String s="";
		while(!s.equals("4")) {
			System.out.println("1:사이다(700원), 2:콜라(500원), 3:환타(350원), 4:반환, 5:투입");
			s = sc.next();
			switch(s) {
			case "1":
				if(inputMoney>700) {
					System.out.println("사이다(700원)");
					money=money-700;
					System.out.println("현재 잔액은"+money+"입니다");	
				}
				else{
					System.out.println("잔액이 부족합니다");	
				}
				break;
			case "2":
				if(inputMoney>350) {
					System.out.println("콜라(500원)");
					money=money-500;
					System.out.println("현재 잔액은"+money+"입니다");
				}
				else {
					System.out.println("잔액이 부족합니다");	
				}break;
			case "3":
				if(inputMoney>350) {
					System.out.println("환타(350원)");
					money=money-350;	
					System.out.println("현재 잔액은"+money+"입니다");	
				}
				else {
					System.out.println("잔액이 부족합니다");
				}	
				break;
			case "4":
				System.out.println("반환");
				m1000=money/1000;
				m500=(money%1000)/500;
				m100=(money%1000)%500/100;
				m50=(money%1000)%500%100/50;
				System.out.println("반환된 금액은"+"\n천원짜리"+m1000+"개"+"\n오백원짜리"+m500+"개"+"\n백원짜리"+m100+"개"+"\n오십원짜리"+m50+"개 입니다");
				System.out.println("종료");
				break;
			case "5":
				System.out.println("돈을 넣으세요");
				inputMoney=sc.nextInt();
				money=money+inputMoney;
				System.out.println("현재 잔액은"+money+"입니다");		
				break;
			default:
				System.out.println("잘 못된 입력입니다.");
				break;
			}	
			
		}
	}
	
}
