package com.academy1.ex;

import java.util.Scanner;

public class javaAcademy {

	public static void main(String[] args) {
		//4+4 이항 연산자
		//삼황 연산자  A ? B : C ;
		//if문과 같다. A가 조건 B가 참일때 실행 C가 거짓일때 실행
//		int a=10;
//		if(a>0) {
//			a=1;
//		}
//		else {
//			a=-1;
//		}
//		a=(a>0) ? 1: -1;
//		System.out.println(a);
//		//두 수 비교 연산
		Scanner sc=new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요");

		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=(a>b)? a: b;
		System.out.println(c+"이/가 더 크다");

		sc.close();
		
	}

}
