package com.academy1.ex;

import java.util.Random;
import java.util.Scanner;

public class javaAcademy6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//p.7����10 ���ѷ���
		//p.8����1 97
		//p.8����2 ���ѷ���
		//p.9����3
		/*System.out.println("�ϳ��� ���� �Է��ϼ���");
		int input=sc.nextInt();
		int a=1;
		int b=0;
		for(int i=1;i<input;i++) {
			b+=a;
			if(b>input) {
				break;
			}
			a++;
			
			System.out.println(b);
		}
		//p.9����5 ����
		//p.10����3
		int sum=0;
		int i2=0;
		while(i2<5) {
			System.out.println("������ �Է��϶�");
			int num=sc.nextInt();
			if(num<0) {
				num=-num;
			}
			sum+=num;
			i2++;
		}
		System.out.println("�ټ� �� ������ ��:"+sum);
		//p.11����4
		System.out.println("���� �Է��ϼ���");
		int inputNum=sc.nextInt();
		int num1=inputNum;
		int num2=0;
		int count=0;
		while(num1>=num2) {
			num1=num1-2;
			num2=num2+3;
			count++;
			if(num1-num2<0) {
				System.out.println("num1����:"+num1);
				System.out.println("num2����:"+num2);	
				System.out.println("num1-num2<0 �������� Ƚ����:"+count);
			}
		
				
		}
		//p.12����3
		int num3=0,num4=0;
		int result=0;
		String s="";
		while(!s.equals("3")) {
			System.out.println("1.�����Է�\n2���꼱��\n3.����");
		s=sc.next();
		switch(s) {
		case"1":
			System.out.println("ù��° ���� �Է��ϼ���:");
			num3=sc.nextInt();
			System.out.println("�ι�° ���� �Է��ϼ���:");
			num4=sc.nextInt();
			break;
		case"2":
			System.out.println("���� ����(+,-,*,/)");
			String s1="";//���⼭ �̷��� �ᵵ �Ǵ���?
			s1=sc.next();
			if(s1.equals("+")) {
				result=num3+num4;
			}
			else if(s1.equals("-")) {
				result = num3-num4;
			}
			else if(s1.equals("*")) {
				result = num3*num4;
			}
			else if(s1.equals("/")) {
				result = num3/num4;
			}
			else {
				System.out.println("�߸��Է�");
				break;
			}
			System.out.println(s1+ "�����Դϴ�." +num3+s1+num4+ "�������="+result);
			//�ƹ�Ű�� �����ּ���
			break;
		case"3":
			System.out.println("����Ǿ����ϴ� �����մϴ�");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			break;
		}

		
		}
		//p.13����4
		//p.13����1 1��
		//p.13����2 1��
		//p.13����3 1��
		//p.14����9 
		//p.14����-
		Random rand=new Random();
		System.out.println("0~9���� ���ڸ� �Է��ϼ���.");
		int com=rand.nextInt(9);
		for(int j=0;j<10;j++) {
			System.out.println(j+1+"�� �� ����");
			int user=sc.nextInt();
			if(user>com) {
				System.out.println(user+"���� �۽��ϴ�");
			}
			else if(user<com) {
				System.out.println(user+"���� Ů�ϴ�");
			}
			else if(user==com) {
				System.out.println("���!��Ȯ�մϴ�."+" "+j+"��°���� ���豺��!");
				break;
			}
		}
		//p.15����1
		int i3;
		int sum1=0;
		for(i3=0;i3<100;i3++) {
			sum1+=i3;
		}
		System.out.println(sum1);
		//p.16����4(a) 10��
		//p.16����4(b) 10��
		//p.16����4(c) 11��
		//p.17����1
		int i4;
		for(i4=1;i4<=10;i4++) {
			if(i4%2==0) {
				System.out.println(i4);
			}
		}
		System.out.println("���� ������ �Է��ϼ���");
		Random rand=new Random();
		int sum2=0;
		int rand1=rand.nextInt();
		while(true) {
			int num5=sc.nextInt();
			if(num5==0) {		
				break;
			}
			sum2+=num5;
		}	
		System.out.println("���� ������ �հ��"+sum2+"�� �Դϴ�.");*/
		System.out.println("1���� �����ϴ� ���α׷�");
		System.out.println("������ ���� �Է��ϼ���");
		int lastNum=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=lastNum;i++) {
			sum+=i;
			System.out.println("["+(i-1)+"]�� TotalNumber�� ��="+sum);
			
			
		}
		System.out.println("1����"+lastNum+"������ ������"+sum+"�Դϴ�.");
		
	
	}
	

}
