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
		else if(g<10){
			System.out.println("10���� �۴�");
		}
		else {
			System.out.println("10 �Դϴ�");
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
		//����7
		int a=3;
		int b=1;
		for(b=1;b!=10;b++) {
			a=a+3;	
		}
		
		System.out.println(a);
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
		for(int i=a+1; i<b; i++) {
			sum=sum+i;	
		}
		System.out.println(sum);
		//����10
		String color="����";
		int brightness=50;
		System.out.println("���� ��⸦ �Է��Ͻÿ�");
		String colorInput=sc.next();
		int brightnessInput=brightness++;
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
		System.out.println(sum);
		//����16
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
		//���� 17
		double d;
		double sum=0;
		for(d=1;d<100;d++) {
			sum=sum+d/(d+1);
		}
		System.out.println(sum);
		//���� 18
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
		
		//���Ǳ�
		//1,2,3,4,0�� �Է¹޾� 
		//������ ���� ���ڸ޴� 0�ΰ��� ���α׷� ����
		String inputString="";//�ʱ�ȭ//null . ������ ������
		//����ڰ� 0�� �Է��Ҷ����� ��� �ݺ��ϴ� ���α׷�
		while(!inputString.equals("0")) {
			System.out.println("1:��ũĿ��, 2:��Ŀ��, 3:��,  0:����");
			inputString = sc.nextLine();
			switch(inputString) {
			case "1":
				System.out.println("��ũĿ��");
				
				break;
			case "2":
				System.out.println("��Ŀ��");
				
				break;
			case "3":
				System.out.println("��");
				
				break;
			case "0":
				System.out.println("����");
				
				break;
			default:
				System.out.println("�� ���� �Է��Դϴ�");
				break;
						
			}	
		}
		System.out.println("����");	
		
		//������� ���α׷�
		//����ڰ� ��� �� �� �ִ� �޴� 1.�Ա� 2.��� 3.��ȸ 4.����
		//�Ա��� �ݾ��� account ������ �����Ѵ�
		//��� case������ �� �����Ҽ� �ֵ��� account ������ while�� �ۿ� �����Ѵ�.
		int account=0;
		String s="";
		while(!s.equals("4")) {
			System.out.println("1:�Ա�, 2:���, 3:��ȸ, 4:����");
			s = sc.next();
			switch(s) {
			case "1":
				System.out.println("�Ա� �� �ݾ��� �־��ּ���");
				int input=sc.nextInt();
				account=account+input;
				System.out.println(input+"�� �ԱݿϷ�");
				System.out.println("���� �ܾ���"+ account+"�� �Դϴ�");
				break;
			case "2":
				System.out.println("��� �� �ݾ��� �Է��ϼ���");
				int output=sc.nextInt();
				if(output>account) {
					System.out.println("�ܾ� ����");
				}
				else {
					account=account-output;
				}
				System.out.println("���� �ܾ���"+ account+"�� �Դϴ�");
			
				break;
			case "3":
				System.out.println("��ȸ �� �ݾ���"+account+"�� �Դϴ�");
				break;
			case "4":
				System.out.println("����");
				break;
			default:
				System.out.println("�� ���� �Է��Դϴ�.");
				break;
			}	
		}*/
	
	
		int money=0;
		int inputMoney = 0;
		int m1000,m500,m100,m50=0;
		String s="";
		while(!s.equals("4")) {
			System.out.println("1:���̴�(700��), 2:�ݶ�(500��), 3:ȯŸ(350��), 4:��ȯ, 5:����");
			s = sc.next();
			switch(s) {
			case "1":
				if(inputMoney>700) {
					System.out.println("���̴�(700��)");
					money=money-700;
					System.out.println("���� �ܾ���"+money+"�Դϴ�");	
				}
				else{
					System.out.println("�ܾ��� �����մϴ�");	
				}
				break;
			case "2":
				if(inputMoney>350) {
					System.out.println("�ݶ�(500��)");
					money=money-500;
					System.out.println("���� �ܾ���"+money+"�Դϴ�");
				}
				else {
					System.out.println("�ܾ��� �����մϴ�");	
				}break;
			case "3":
				if(inputMoney>350) {
					System.out.println("ȯŸ(350��)");
					money=money-350;	
					System.out.println("���� �ܾ���"+money+"�Դϴ�");	
				}
				else {
					System.out.println("�ܾ��� �����մϴ�");
				}	
				break;
			case "4":
				System.out.println("��ȯ");
				m1000=money/1000;
				m500=(money%1000)/500;
				m100=(money%1000)%500/100;
				m50=(money%1000)%500%100/50;
				System.out.println("��ȯ�� �ݾ���"+"\nõ��¥��"+m1000+"��"+"\n�����¥��"+m500+"��"+"\n���¥��"+m100+"��"+"\n���ʿ�¥��"+m50+"�� �Դϴ�");
				System.out.println("����");
				break;
			case "5":
				System.out.println("���� ��������");
				inputMoney=sc.nextInt();
				money=money+inputMoney;
				System.out.println("���� �ܾ���"+money+"�Դϴ�");		
				break;
			default:
				System.out.println("�� ���� �Է��Դϴ�.");
				break;
			}	
			
		}
	}
	
}
