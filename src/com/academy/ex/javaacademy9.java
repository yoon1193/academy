package com.academy.ex;

import java.util.Scanner;

public class javaacademy9 {

	public static void main(String[] args) {
		//if if���� if���� ����Ҽ��յ�
		//�� �� ���� �ϳ���
		//���� ���� ������ �׷��� �ǰ� �ȱ׷��� �ȴ�
		//������ �ذ� ������ �׷�����;�� �ȱ׷����ǰ�
		/*boolean isDay=true;
		boolean isStar=true;		
		boolean isCloud=true;
		if(isDay){
			System.out.println("��");
			if(isCloud) {
				System.out.println("����");
			}
		}
		else {
			System.out.println("��");
			if(isStar) {
				System.out.println("��");
			}
		}
		
		if(isDay&&isCloud) {//isDay==true isCloud==true
			System.out.println("����");
		}
		if(isDay==false&&isStar==true) {
			System.out.println("��");
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

       30��40���� ��
       a>=30 && a<=40/      
       !(a>=30 && a<=40)
       a<60 || a>100
       (a.equals("����") || b.equals("õ��")) && c>=20 && c<30 
		String s="����";
		String s1="õ��";
		int c=29 ;
		if((s.equals("����") || s1.equals("õ��")) && c>=20 && c<30 ) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		//90�� �̻� "��" //80�� �̻�"��"//70�� �̻�"��" ��������
		Scanner sc=new Scanner(System.in);
		System.out.println("�����Է�");
		int a=sc.nextInt();
		if(a>=90) {
			System.out.println("��");
		}
		else if(a>=80) {
			System.out.println("��");
		}
		else if(a>=70) {
			System.out.println("��");
		}
		else {
			System.out.println("��,��");
		}
		//switch���� 1:1��Ī,�Ǽ�x(3.5��),����x
		//else if�� ��������
		Scanner sc=new Scanner(System.in);
		System.out.println("�����Է�");
		int a=sc.nextInt();
		a=a/10;
		switch(a) {
		case 10: case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
	    default:
				System.out.println("��,��");
			break;
	
		}
		System.out.println("���� �Է��ϼ���");
		int b=sc.nextInt();
		switch(b) {
		case 1: case 3: case 5: case 7: case 8: 
		case 10: case 12:
			System.out.println("31�� ����");
			break;
		case 2:
			System.out.println("28�� ����");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30�� ����");
			break;
		default:
			System.out.println("���� �ƴմϴ�");
			break;
		}
		
		System.out.println("���� �Է��Ͻÿ�");
		int c=sc.nextInt();
		if(c==1||c==3||c==5||c==7||c==8||c==10||c==12) {
			System.out.println("31�� ����");
		}
		else if(c==4||c==6||c==9||c==11) {
			System.out.println("30�� ����");
		}
		else if(c==2) {
			System.out.println("28�� ����");
		}
		else {
			System.out.println("���� �ƴմϴ�");
		}*/
		
		//3���ڸ� �Է¹޾� ū����� ����ϴ� ���α׷��� �������� ���α׷�
		Scanner sc=new Scanner(System.in);
		System.out.println("3 ���ڸ� �Է�");
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
