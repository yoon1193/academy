package com.academy.ex;
class Human{
	public String name;
	public int age;
	public double tall;
	//Human = new Human()
}
class Animal{
	public String hairColor;
	public double legCount;
	public int age1;
	
}
public class javaacademy1 {

	public static void main(String[] args) {
		//class
		//��� ������ ��Ƽ� ȭ�鿡 ����غ���.
		//�̸� ���� Ű ������ �־��
		String name="ȫ��";
		int age=20;
		double tall=192.2;
		System.out.println(String.format("name:%s", name));
		System.out.println("age:"+age);
		System.out.println("tall:"+tall);

		//3���̸�? ������ ����� �����Ͱ� ���� ������?
		//���� �ִ� �����͸� ��� ���ο� �ڷ����� ���� �����ذ�
		
		Human h=new Human();
		h.name="ȫ��";
		h.age=34;
		h.tall=123.34;
		System.out.println("name:"+h.name);
		System.out.println("age:"+h.age);
		System.out.println("tall:"+h.tall);
		
		Human h1=new Human();
		h1.name="����";
		h1.age=21;
		h1.tall=192.34;
		System.out.println("name:"+h1.name);
		System.out.println("age:"+h1.age);
		System.out.println("tall:"+h1.tall);
		
		
		//��� ���� �����͸� �����׼� �ִ� Ŭ���׸� ����� 2������ ���
		//hairColor,legCount,age
		String hairColor="green";
		double legCount=4563.44;
		int age1=123;
		System.out.println("hairColor:"+hairColor);
		System.out.println("legCount:"+legCount);
		System.out.println("age:"+age1);
		
		Animal cat=new Animal();
		cat.hairColor="red";
		cat.legCount=3.28;
		cat.age1=14;
		System.out.println("hairColor:"+cat.hairColor);
		System.out.println("legCount:"+cat.legCount);
		System.out.println("age:"+cat.age1);
		
		
		Animal dog=new Animal();
		dog.hairColor="blue";
		dog.legCount=7.28;
		dog.age1=1515;
		System.out.println("hairColor:"+dog.hairColor);
		System.out.println("legCount:"+dog.legCount);
		System.out.println("age:"+dog.age1);
		
		Animal dog2=new Animal();
		dog2.hairColor="yellow";
		dog2.legCount=9.28;
		dog2.age1=155;
		System.out.println("hairColor:"+dog2.hairColor);
		System.out.println("legCount:"+dog2.legCount);
		System.out.println("age:"+dog2.age1);
		
		
		
	}
	
//�ڵ��� �л� �ڵ��� ���������� ������ ������ ���ο� ��ü 5�� ���� ������
}

