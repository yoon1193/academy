package com.academy.ex;

 

public class javaacademy5 {

 

	public static void main(String[] args) {

		//����ڿ��� ���ڸ� �Է¹޾� 1004�� "��ȣ�� ����"

		//�ƴϸ� "��ȣ�� Ʋ��"�� ��µǵ��� ���α׷�����

		java.util.Scanner sc=new java.util.Scanner(System.in);

 

		System.out.println("���ڸ� �Է��Ͻÿ�");

		//int input=Integer.parseInt(sc.nextLine());

		int input=sc.nextInt();

		if(input==1004) {

			System.out.println("'��ȣ�� ����'");

		}

		else {

			System.out.println("'��ȣ�� Ʋ��'");

		}

		

	

		//�ȳ縦 �Է��ϸ� �ʵ��ȳ� 

	    //�߰�  �� �ԷµǸ� �ʵ��߰�

		//sc.nextLine();

		sc.nextLine();

		

		System.out.println("���ڸ� �Է��ϼ���:");

		String s=sc.nextLine();

		String s1="�ȳ�";

		String s2="����";

		String s3="�߰�";

		if(s.equals("�ȳ�")) {

			System.out.println("�ʵ� �ȳ�");

		}

		if(s.equals("����")) {

			System.out.println("�ʵ� ����");

		}

		if(s.equals("�߰�")) {

			System.out.println("�ʵ� �߰�");

		}

		

		

	

		//�μ��� ���̸� ���ϴ� ���α׷��� ���غ���

		System.out.println("�� ���� �Է��ϼ���");

		int a=sc.nextInt();

		int b=sc.nextInt();

		//int a=Integer.parseInt(sc.nextLine());

		//int b=Integer.parseInt(sc.nextLine());

		if(a>b) 

			System.out.println(a-b);		

		else 

			System.out.println(b-a);	

 

		sc.close();

	}

 

}