package com.academy.ex;
class Human{
	public String name;
	public int age;
	public double tall;
}
class animal{
	public String hairColor;
	public String ����;
	public double legCount;
	
	
}
public class javaacademy1 {

	public static void main(String[] args) {
		//class
		//��� ������Ƽ� ȭ�鿡 ����غ���.
		//�̸� ���� Ű
		String name="ȫ�浿";
		int age=29;
		double tall=125.4;
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("tall"+tall);

		
		//����� 3���̸�?  ������ ����� �����װ� ����������?
		
		Human h=new Human();
		h.name="ȫ�浿";
		h.age=age;
		h.tall=123.34;
		System.out.println("name:"+h.name);
		System.out.println("age:"+h.age);
		System.out.println("tall:"+h.tall);
		
		Human h1=new Human();
		h1.name="������";
		h1.age=21;
		h1.tall=153.34;
		System.out.println("name:"+h1.name);
		System.out.println("age:"+h1.age);
		System.out.println("tall:"+h1.tall);
		
		int i;
		int sum=0;
		for(i=0;i<=10;i=i+2) {//11 23
			sum=sum+i;
					
		}
		System.out.println(sum);
		int a=0;
		while(a<=10) {
		
			
			sum=sum+a;
			a=a+2;
		}
		System.out.println(sum);
		
	}
	

}
