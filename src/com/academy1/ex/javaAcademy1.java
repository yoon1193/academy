package com.academy1.ex;

import java.util.Scanner;

public class javaAcademy1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*//����1
		int a=3,b=0;
		switch(a+2) {
		case 5:b=1;
		default: b+=2;
		}
		System.out.println(a);//������ 3
		
		//����2
		int count=2;
		int hap=0;
		switch(++count) {
		case 1:hap=hap+count++;
		case 2:hap=hap+count++;
		case 3:hap=hap+count++;
		case 4:hap=hap+count++;
		case 5:hap=hap+count++;
		}
		System.out.println(String.format("hap�� �� : %d\n",hap));//������ 12
		
		//����6
		System.out.println("���� �Է��ϼ���");
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
				System.out.println("���� �ƴ�");		
		}
		
		//��������1 = 4��
		//��������2 = default:
		 
		 
		//��������3
		System.out.println("�� ������ �Է�");
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
		
		//��������4
		System.out.println("�� ���� �Է�");
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
		
		
		//��������5
		int age=25;
		int cm=95;
		if(age<20) {
			if(cm<85) {
				System.out.println("������� S�Դϴ�");
			}
			else if(cm>=85 && cm<95) {
				System.out.println("������� M�Դϴ�");
			}
			else {
				System.out.println("������� L�Դϴ�");
			}
		}
		if(age>=20) {
			if(cm<90) {
				System.out.println("������� S�Դϴ�");
			}
			else if(cm>=90 && cm<100) {
				System.out.println("������� M�Դϴ�");
			}
			else  {
				System.out.println("������� L�Դϴ�");
			}
		}
		
		//����1
		System.out.println("��Ģ ���� �Է�(����)");
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
		
		//����2
		int m=100;
		System.out.println("�������� ������ �Է��Ͻÿ�");
		int rich=sc.nextInt();
		System.out.println("�����б� ������ �Է��Ͻÿ�");
		double grade=sc.nextDouble();
		
		if(rich>=100&&grade>=4.0) {
			m=m-(m*20/100);
				}
		else {
			m=m-(m*40/100);
		}
		System.out.println("���� �б� ������ ��ϱ���"+m+"���� �Դϴ�");*/
		
		//����3
		System.out.println("���� ��뷮�� �Է��ϼ���(kw)");
		int kw=sc.nextInt();
		int p;
		double p1;
		if(kw>=1&&kw<=100) {
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
		int m=(int) (p+(kw*p1));
		m=(int) (p+(kw*p1));
		m=(int) m+(m)*9/100;
	
		System.out.println("�̹� �� �����"+m+"�Դϴ�");

	}

}
