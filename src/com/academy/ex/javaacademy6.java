package com.academy.ex;

 

public class javaacademy6 {

 

	public static void main(String[] args) {

		java.util.Scanner sc=new java.util.Scanner(System.in);

		//��������1

		System.out.println("���ڸ� �Է��Ͻÿ�:");

		int a,b,c,d,e=0;

		a=sc.nextInt();

		if(a%2==0) {

			System.out.println(a+"�� ¦���Դϴ�");

		}

		else {

			System.out.println(a+"�� Ȧ���Դϴ�");

		}

		

		//����

		System.out.println("������ �Է��Ͻÿ�");

		a=sc.nextInt();

		if(a%3==0) {

			System.out.println("3�� ����Դϴ�");

		}

		if(a%4==0) {

			System.out.println("4�� ����Դϴ�");

		}

		

		if(a%7==0) {

			System.out.println("7�ǹ���Դϴ�");

		}

		

		

		

		//��������2

		System.out.println("�� ������ �Է��Ͻÿ�:");

		a=sc.nextInt();

		b=sc.nextInt();

		if(a==b) {

			System.out.println("�� ���� ���� ���� ���Դϴ�.");

		}

		else if(a<b) {

			System.out.println(a+"����"+b+"�� ū ���Դϴ�");

		}

		else {

			System.out.println(b+"����"+a+"�� ū ���Դϴ�");

		}

		

		//����2

		System.out.println("ù��° ������ �Է��Ͻÿ�:");

		a=sc.nextInt();

		System.out.println("�ι�° ������ �Է��Ͻÿ�:");

		b=sc.nextInt();

		if(a%b==0) {

			System.out.println("����Դϴ�");

		}

		else {

			System.out.println("����� �ƴմϴ�");

		}

		

		//����3(0~10ture,�� �� false)

		System.out.println("������ �Է��Ͻÿ�:");

		a=sc.nextInt();

		if(a>=0 &&a<=10) {

			System.out.println("�����Դϴ�.");

		}

		else {

			System.out.println("Ʋ�Ƚ��ϴ�.");

		}

		

		//����

		System.out.println("������ �Է��Ͻÿ�:");

		a=sc.nextInt();

		if(a<0){

			System.out.println(a+"�� ���� �Դϴ�.");

		}

		else {

			System.out.println(a+"�� ������ �ƴմϴ�.");

		}

		

		//����4

		sc.nextLine();

		System.out.println("A~C ������ ���ڸ� �Է��Ͻÿ�");

		

		String s=sc.nextLine();//Ȥ�� ���� sc ����� String s=sc.next();

		if(s.equals("A")){

			System.out.println("�����Դϴ�.");

		}		

		else if(s.equals("B")){

			System.out.println("�����Դϴ�.");

		}

		else if(s.equals("c")){

			System.out.println("�����Դϴ�.");

		}

		else {	

			System.out.println("Ʋ�Ƚ��ϴ�");

		}

		

		//����8

		System.out.println("���� �ð��� ���̸� �Է��Ͻÿ�:");

		a=sc.nextInt();

		b = sc.nextInt();

		if(a<17) {

			if(b>12) {

				System.out.println("����� 34,000�� �Դϴ�");

			

			}

			else {

				System.out.println("����� 25,000�� �Դϴ�");

			}

		}

		else {

			System.out.println("����� 10,000�� �Դϴ�.");	

		}

		

		//����4

		System.out.println("�� �� �� ������ �Է��Ͻÿ�:");

		a=sc.nextInt();

		b=sc.nextInt();

		c=sc.nextInt();

		double avg=(a+b+c)/3;

		if(avg>=80) {

			System.out.println(+avg+":"+"�հ� �Դϴ�");			

		}

		else {

			System.out.println("���հ� �Դϴ�");

		}

		

		//����6

		/*

		 * int max,min=0;

		 * max=integer.MIN_VALUE;

		 * min=Integer.MAX_VALUE;

		 * 

		 * for(int i=0;i<5;i++)

		 * System.out.println("���Է�");

		 * Integer.parseInt(sc.nextLine());

		 * if(max<input){

		 * max=input;

		 * }

		 * if(min>input){

		 * }

		 * sysout("ū��:"+max+"������:"+min);

		 */

		int max,min;

		System.out.println("ù ��° ���� �Է��ϼ���:");

		a=sc.nextInt();

		System.out.println("�� ��° ���� �Է��ϼ���:");

		b=sc.nextInt();

		System.out.println("�� ��° ���� �Է��ϼ���:");

		c=sc.nextInt();

		System.out.println("�� ��° ���� �Է��ϼ���:");

		d=sc.nextInt();

		System.out.println("�ټ� ��° ���� �Է��ϼ���:");

		e=sc.nextInt();

		

		max=a;

		min=a;

		if(b>max) {

			max=b;

		}

		if(c>max) {

			max=c;

		}

        

		if(d>max) {

			max=d;

		}

        

		if(e>max) {

			max=e;

		}

		if(b<min) {

			min=b;

		}

		if(c<min) {

			min=c;

		}

        

		if(d<min) {

			min=d;

		}

        

		if(e<min) {

			min=e;

		}

		System.out.println("�ִ���"+max+"�ּڰ���"+min);

        

		

        

 

 

		

		//����5

		System.out.println("�� ���� ������ �Է��Ͻÿ�");

		a=sc.nextInt();

		b=sc.nextInt();

		if(a>0) {

			a=a;

		}

		else {

			a=-a;

		}

		if(b>0) {

			b=b;

		}

		else {

			b=-b;

		}

		

		System.out.println("�� ���� ������ ��:"+(a+b));

 

		//����9

		System.out.println("���� �Է��Ͻÿ�");

		double x=sc.nextDouble();

		double x1=(x*x*x)-(9*x)+2;

		double x2=(7*x)+2;

		if(x>=0) {

			System.out.println(x1);

			

		}

		else {

			System.out.println(x2);

		}

		

		

		//����10//�񸸵�=ü��/(����*����)

		System.out.println("�����Ը� �Է��ϼ���:");

		x=sc.nextDouble();

		System.out.println("Ű�� �Է��ϼ���:");

		x1=sc.nextDouble();

		x1=x1/100;

		double bmi=x/(x1*x1);

		if(bmi<20) {

			System.out.println("��ü��");

		}

		else if(bmi>=20 && bmi<25) {
			System.out.println("ǥ��");

		

		}

		else {

			System.out.println("��ü��");

		}

			

		//����11

		System.out.println("Ű�� �Է��Ͻÿ�:");

		x=sc.nextDouble();

		if(x>=175) {

			System.out.println("\nŰ��"+x+"�̽ñ���.\nŰ�� ũ�ñ���");

		}

		else {

			System.out.println("\n\nŰ��"+x+"�̽ñ���");

		}

		

		sc.close();

	}
 
 
}