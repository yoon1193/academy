package com.academy1.ex;

import java.util.Scanner;

public class javaAcademy {

	public static void main(String[] args) {
		//4+4 ���� ������
		//��Ȳ ������  A ? B : C ;
		//if���� ����. A�� ���� B�� ���϶� ���� C�� �����϶� ����
//		int a=10;
//		if(a>0) {
//			a=1;
//		}
//		else {
//			a=-1;
//		}
//		a=(a>0) ? 1: -1;
//		System.out.println(a);
//		//�� �� �� ����
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ���");

		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=(a>b)? a: b;
		System.out.println(c+"��/�� �� ũ��");

		sc.close();
		
	}

}
