package com.academy1.ex;

import java.util.Random;
import java.util.Scanner;

public class javaAcademy6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*//p.7����10 ���ѷ���
		//p.8����1 97
		//p.8����2 ���ѷ���
		//p.9����3
		System.out.println("�ϳ��� ���� �Է��ϼ���");
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
		//p.17����2
		System.out.println("���� ������ �Է��ϼ���");
		//Random rand=new Random();
		int sum2=0;
		int rand1=rand.nextInt();
		while(true) {
			int num5=sc.nextInt();
			if(num5==0) {		
				break;
			}
			sum2+=num5;
		}	
		System.out.println("���� ������ �հ��"+sum2+"�� �Դϴ�.");
		System.out.println("1���� �����ϴ� ���α׷�");
		System.out.println("������ ���� �Է��ϼ���");
		int lastNum=sc.nextInt();
		int sum3=0;
		
		for(int i5=1; i5<=lastNum;i5++) {
			sum3+=i5;
			System.out.println("["+(i5-1)+"]�� TotalNumber�� ��="+sum3);
		}
		System.out.println("1����"+lastNum+"������ ������"+sum3+"�Դϴ�.");
		
		//p.19����1
		int i6;
		for(i6=60;i6>=0;i6--) {
			System.out.println(i6+"��");
			if(i6==0) {
				System.out.println("�߻�!");
			}
		}
		
		//p.19����2
		System.out.println("�� �� �ݺ� �ұ��?");
		int count1=sc.nextInt();
		for(int i7=0;i7<count1;i7++) {
			System.out.println("�ȳ��ϼ���?");
		}
		
		//p.20����6
		for(int num6=1;num6<=100;num6++) {
			if(num6%3==0) {
				System.out.println(num6);
			}
		}
		//p.20����2
		int sum4=0;
		int c=0;
		int i7;
		System.out.println("ù ���� ���� �Է��ϼ���");
		int firstNum=sc.nextInt();
		System.out.println("�� ���� ���� �Է��ϼ���");
		int secondNum=sc.nextInt();
		for(i7=firstNum;i7<=secondNum;i7++) {
			sum4+=i7;
		}
		for(i7=secondNum;i7<=firstNum;i7++) {
			sum4+=i7;
		}
		System.out.println(sum4);
		
		//p.21����3
		int count2=0;
		System.out.println("�ϳ��� ���� �Է��ض�");
		int randNum=sc.nextInt();
		for(int num7=2;num7<randNum;num7++) {
			if(randNum%num7==0) {
				count2++;
			}
		}
		if(count2==0) 
			System.out.println(randNum+"��/�� �Ҽ� �Դϴ�");
		
		else
			System.out.println(randNum+"��/�� �Ҽ��� �ƴմϴ�.");
		
		//p.21����7
		for(int i8=1;i8<=100;i8++) {
			if(i8%3==0||i8%5==0) {
				System.out.println(i8);
			}
		}
		//p.21����8	
		System.out.println("��������=");
		int stratNum=sc.nextInt();
		System.out.println("��������");
		int endNum=sc.nextInt();
		int sum5=0;
		for(int i9=stratNum;i9<=endNum;i9++) {
			sum5+=i9;
		}
		System.out.println("Sum of "+stratNum+" to " +endNum+ " = " +sum5);
	
		//p.22����4
		int c;
		System.out.println("ù ��° ���� �Է�");
		int a1=sc.nextInt();
		System.out.println("�� ��° ���� �Է�");
		int b1=sc.nextInt();
		System.out.println(a1+"�� ��� "+b1+"�� ���");
		for(c=1;c<=b1;c++) {
			
			System.out.println(c*a1);
			
		}
		//p.22����5 4��
		//p.23����6
		int num = 7;
		for(int i=9;i>=1;i--) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		//p.23����9
		System.out.println("������ �Է��Ͻÿ�");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		//p.23����
		int count=0;
		int sum=0;
		System.out.println("�ϳ��� ���� �Է�");
		int num=sc.nextInt();
		for(int i=1;i<=1000;i++) {
			if(i%num==0) {
				sum+=i;
				count++;
			}
		}
		System.out.println("1���� 1000���� "+num+"�� ����� ����="+count+" ��="+sum);
		//p.24����
		System.out.println();
		int num=sc.nextInt();
		while(num!=0) {
			if(num>0) {
				System.out.println("����Դϴ�. ���밪�� "+num+"�Դϴ�");
			break;
			}
			else if(num<0) {
				System.out.println("�����Դϴ�. ���밪�� "+(-num)+"�Դϴ�");
			break;
			}
		}
		System.out.println("0 �Դϴ�.");
		//p.24����10
		
		//ȭ���µ� - 32) �� 1.8 = �����µ�
		double a=0;
		System.out.println("ȭ���µ�"+"\t"+"�����µ�");
		for(int i=0;i<=100;i++) {
			if(i%10==0) {
			    a=(i-32)/1.8;
				int a1=(int)a;
				System.out.println(i+"\t"+a1);
			}
		}
		//p.25����12
		for(int i=0;i<10;i++) {
			System.out.println("�����͸� �Է��Ͻÿ�");
			int a=sc.nextInt();
			if(a<=50) {
			for(int j=1;j<=a;j++) {
				System.out.print("*");
			}
			}
			else {
			System.out.println("50�� �ѽ��ϴ�");
			}
		}
		
		//p.25����14
		System.out.println("n�� ���� �Է��ϼ���");
		int a=sc.nextInt();
		int sum=0;
		int result=0;
		for(int i=1;i<=a;i++) {
			result=i*i;
			sum+=result;
			
		}
		System.out.println(sum);
		
		int a=1000;
		int result=0;
		System.out.println("�ʱ� ���ᷮ="+a);
		while(a>=100) {
			System.out.println("���� ������ +, �Ҹ�� -�� �Է����ּ���.:");
			int p=sc.nextInt();
			a=(a+p);
			System.out.println("���� �����ִ� ���� "+a+"�Դϴ�");
			
		
			
		}
		System.out.println("(���) ���ᰡ 10% �̸��Դϴ�.");
		
		//p.25����17
		int count2=0;
		System.out.println("�ϳ��� ���� �Է��ض�");
		int randNum=sc.nextInt();
		for(int num7=2;num7<randNum;num7++) {
			if(randNum%num7==0) {
				count2++;
			}
		}
		if(count2==0) 
			System.out.println(randNum+"��/�� �Ҽ� �Դϴ�");
		
		else
			System.out.println(randNum+"��/�� �Ҽ��� �ƴմϴ�.");
		//p.26����5
		for(int i=1;i<=1000;i++) {
			System.out.print(i+" ");
			if(i%10==0) {
				System.out.println("");
			}
		}*/
		//p.26����2
		int max = 0;
		int min = 0;
		int num;
		do {
			System.out.println("�ϳ��� ���ڸ� �Է��ϼ���(0�Է�����)");
			num = sc.nextInt();
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
		}while(num !=0 ); 
		System.out.println(min);
		System.out.println(max);
		
			
		
		
		
		
	}

}
