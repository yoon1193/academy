package com.academy1.ex;

import java.util.Random;
import java.util.Scanner;

public class javaAcademy6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand=new Random();
		
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
		//Random rand=new Random();
		System.out.println("0~9���� ���ڸ� �Է��ϼ���.");
		int com=rand.nextInt(10);
		System.out.println(com);
		boolean isOk=false;
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
				System.out.println("���!��Ȯ�մϴ�."+" "+(j+1)+"��°���� ���豺��!");
				isOk=true;
				break;
			}
		}
		if(isOk==false) {
			System.out.println("10�� �ȿ� ������ ����");
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
		
		//p.18����
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
		System.out.println("����� ���� �Է��ϼ���.");
		int num = sc.nextInt();
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
		System.out.println("1���� 1000���� "+num+"�� ����� ����="+count+" ��="+sum)

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
		//(ȭ���µ� - 32) �� 1.8 = �����µ�
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
		
		//p.26����16
		int a=1000;
		int result=0;
		System.out.println("�ʱ� ���ᷮ="+a+"����");
		while(a>=100) {
			System.out.println("���� ������ +, �Ҹ�� -�� �Է����ּ���.:");
			int p=sc.nextInt();
			a=(a+p);
			System.out.println("���� �����ִ� ���� "+a+"L �Դϴ�");
		}
		System.out.println("(���) ���ᰡ 10% �̸��Դϴ�.");
		
		//p.26����17
		boolean isOk=true;
		System.out.println("�ϳ��� ���� �Է��ض�");
		int inputNum=Integer.parseInt(sc.nextLine());
		for(int i=2;i<inputNum;i++) {
			if(inputNum%i==0) {
				isOk=false;
				break;
			}
		}
		if(isOk==true) {
			System.out.println("�Ҽ�");
		}
		else {
			System.out.println("�Ҽ�x");
		}
		
		//p.27����5
		for(int i=1;i<=1000;i++) {
			System.out.print(i+" ");
			if(i%10==0) {
				System.out.println("");
			}
		}
		
		//p.27����2
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int num=0;
		do {
			System.out.println("�ϳ��� ���ڸ� �Է��ϼ���(0�Է�����)");
			num = sc.nextInt();
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
			if(num==0) {
				break;
			}
		}while(num!=0 ); 
		System.out.println("���� ū����="+max);
		System.out.println("���� ��������="+min);
		//p.28����3
		int a=0;
		int b=1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
		//p.28���� �������
		int i;
		int j;
		for(i=0;i<5;i++) {
			if(i%2==0) {
				for(j=1;j<=5;j++) {
					System.out.print(5*i+j);
				}
			}
			else {
				for(j=1;j<=5;j++) {
					System.out.print((5*(i+1)-j)+1);
				}
			}
			System.out.println();
		}
		//�ٸ� Ǯ��
		int lineMax=0;
		int lineRev=0;
		for(int i=0;i<25;i++) {
			if(i%5==0) {
				System.out.println("");
				lineMax=i+5;
				lineRev++;
			}
			if(lineRev%2!=0) {
				System.out.print("\t"+(i+1));
			}
			else {
				System.out.print("\t"+(lineMax-i%5));
			}
		}
		
		//p.30 ���� �޷�
		int startDay = 3;
		int day;
		int month = 31;
		System.out.println("======================");
		System.out.println("  ��  ȭ  ��  ��  ��  �� �� ");
		System.out.println("======================");

		for (day = 0; day < startDay; day++) {
			System.out.print("   ");
		}
		for (int date = 1; date <= month; date++) {
			if (day == 7) {
				day = 0;
				System.out.print("\n");
			}
			day++;
			System.out.print(String.format("%3d", date));

		}
		System.out.print("\n");
		System.out.println("======================");
		
		//p.33����1 3�� 1������
		//p.33����2 1�� 4��
		//p.33����3 0�� 
		//p.33����4 (a)0369 (b)036912 (c)2468 (d)109876543210	
				  //(e)*********(f) error
		//p.34����5 (a)
		//(a)
		int i =10;
		while(i>=0) {
			System.out.println(i);
			i--;
		}
		//(b)
		for(i=10;i>=0;i-=3) {
			System.out.println(i);
		}
		//p.34����6 (a) 11 (b)10
		//p.34����7 (a) i++ (b) i<10 (c) i-- > i++ (d) double (e) �ʱⰪx
		 
		//p.35���� ����������
		int r=rand.nextInt(2);
		System.out.println("���� ������ ������ �����մϴ�.");
		if(r==0) {
			System.out.println("�ո� �Դϴ�");
		}
		else {
			System.out.println("�޸� �Դϴ�");
		}
		
		//p.36���� �ֻ���
		int dice=rand.nextInt(6)+1;
		int count=0;
		while(true) {
			System.out.println("1���� 6������ ���ڸ� �Է��ϼ���!");
			int a=sc.nextInt();
			if(dice==a) {
				System.out.println("�ֻ����� ������ϴ�!"+"\n**�ֻ���:"+dice+" User:"+a+"**"+"\n�ݺ�Ƚ���� "+count+"ȸ �Դϴ�!");
			break;
			}
			else {
				System.out.println("����!"+"\n�ֻ���:"+dice+" User:"+a+"\n�ٽ� ���� �ҰԿ�");
				count++;
			}	
		}
		
		//p.37 ����
		int count=0;
		int count2=0;
		System.out.println("��� ������ �ڵ����� �����մϴ�.");
		while(true) {
			int randNum=rand.nextInt(100);
			int randNum2=rand.nextInt(100);
			System.out.println(randNum+"+"+randNum2+"=");
			int result=randNum+randNum2;
			int a=sc.nextInt();
			if(a==result) {
				System.out.println("�¾ҽ��ϴ�");
				count++;
				break;
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�");
				count2++;		
			}
			if(count2==3) {
				break;
			}
		}
		System.out.println("�� ���� ������="+count+" Ʋ�� ������="+count2);*/
	}
}
