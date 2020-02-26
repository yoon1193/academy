package com.academy.ex;

public class javaacademy4 {

	public static void main(String[] args) {
		//if 조건문
		/*if(조건) {
			//조건이 참일때 실행
		}
		else {
			//조건이 거짓일떄 싱행
		}
		조건식으로 올 수 있는것은 실행결과가 boolean인 경우
		(true false 비교연산자 논리연산자)
		
		if(true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");				
		}*/
		
		
		if(true) 
			System.out.println("true");
		
		else 
			System.out.println("false");//실행부가 1줄이면 중괄호 생략가능
		System.out.println("하이");//이 코드는 if문 밖에있는 코드
		
		//else부분 자체를 생략가능
		if(10<40) { 
			System.out.println("true");
		}
		
		int a=10;
		if(a==10) {
			System.out.println("true");
		}
		if(a!=7) {//a가 10이 아니면
			System.out.println("true");
		}
		//true,false 1,0 일반적인 언어에서 0이 아니면 true 취급.
		//if(1){} 조건식이 실행
		//if(0){} 조건식이 싷행 안됨
		//if(23){} 조건식이 실행
		//자료형 기본자료형 참조자료형
		//기본자료형 비교 ==  변수가 가리키는 값비교
		//참조자료형은 .equals 변수가 가리키는 주소에 있는 값비교
		
		String s1="홍길동";
		String s2="홍길동";
		String s3=new String("홍길동");
		String s4=new String("홍길동");
		if(s3==s4) {
			System.out.println("== 이용해 같은 경우");
		}
		if(s3.equals(s4)) {
			System.out.println("equals 이용해 같은 경우");
		}
		
		
		

	}

}
