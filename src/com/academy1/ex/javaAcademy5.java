package com.academy1.ex;

import java.util.Scanner;

public class javaAcademy5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*//����1
		System.out.println("�� �Է�");
		int a=sc.nextInt();
		System.out.println(a);
	
		sc.nextLine();
		//����2
		System.out.println("���ο� ���� ���̸� �Է��϶�");
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("���̴�"+(b*c)+"�Դϴ�");
		//����3
		System.out.println("���� ���� ���̸� �Է��϶�");
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		int result = 2*(d*e+e*f+e*f);
		System.out.println("�ѳ��̴�"+result+"�Դϴ�");
		//����4
		System.out.println("�� �Է�");
		int g=sc.nextInt();
		if(g>10) {
			System.out.println("10���� ũ��");
		}
		else {
			System.out.println("10 �̰ų� 10���� �۴�");
		}
		//����5
		System.out.println("�� �Է�");
		int h=sc.nextInt();
		if(h>0) {
			System.out.println("����Դϴ�");
		}
		else {
			System.out.println("0�̰ų� ���� �Դϴ�");
		}
		//����6
		System.out.println("�� �Է�");
		int i=sc.nextInt();
		if(i%2==0) {
			System.out.println("¦�� �Դϴ�");
		}
		else {
			System.out.println("Ȧ�� �Դϴ�");
		}
		//����7/
		int a=3;
		int b=1;
		for(a=3;a!=10;a=a+3) {
			
		}
		//����7-1
		int j;
		for(j=0;j<3;j++) {
			System.out.println("�ȳ�");
		}
		
		//����7
		System.out.println("�� �Է�");
		int k=sc.nextInt();
		int i;
		for(i=1;i<=k;i++) {
			System.out.println(i);
			
		}
		//����8
		int a;
		int sum=0;
		for(a=1;a<=10;a++) {
			sum=sum+a;
		}
		System.out.println(sum);
		//����9
		System.out.println("�� ���� �Է��ϼ���");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		for(a=0; a<=b; a++) {
			sum=sum+a;	
		}
		System.out.println(sum);
		//����10/
		String color="����";
		int brightness=50;
		System.out.println("���� ��⸦ �Է��Ͻÿ�");
		String colorInput=sc.next();
		int brightnessInput=brightness+1;
		System.out.println("���� ������"+colorInput+ "����" +brightnessInput+ "�̴�");
		//���� 11
		System.out.println("�� ���� �Է�");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		//����12
		System.out.println("�� �� �Է�");
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
		//����13
		int a=0;
		for(a=1;a<101;a++) {
			if(a%7==0) {
				System.out.println(a);
			}
			
		}
		//����14
		int a;
		for(a=1;a<=100;a++){
			if(a%4==0) {
				continue;
			}
			System.out.println(a);	
		}
		//����15
		int a;
		int sum=0;
		for(a=2;a<=100;a+=2) {
			sum=sum+a;	
		}
		System.out.println(sum);*/
		//����16
		int a;
		int sum = 0;
		for(a=0;a<=100;a++) {
			if(a%2==0) {
				sum=sum-1;
			}
			else {
				sum=sum+1;
			}
		}
		System.out.println(sum);
		
	}
		
	

}
