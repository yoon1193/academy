package com.academy1.ex;

import java.util.Arrays;
import java.util.Scanner;
class Cat{
	public int age=0;
	public String name="����";
	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + "]";
	}
	
//	
}
public class javaAcademy3 {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,10};
		//0~4  arr1[5]x
		//arr1={2,3,4}; �ʱ�ȭ�� ������ ���� �����Ҷ� 1�� �� �� �ִ�. ������ x
		//arr1=new int[3];// �������� ���� �Ҵ� �� �� �ִ�.
		//arr1=new int[5];//���� �Ҵ��ϸ� ���������͸� arr1���� ������ �� ����.
		int arr2[]=arr1;
		arr2=arr1;
		arr1[0]=100;
		arr2[1]=200;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//���� ���� �и��Ǿ� �����Ѵ� �迭�� ������
		int ar1[]= {1,2,3};
		//int ar2[]=new int[3];
		//.length�� �迭�� ũ�⸦ �ǹ��Ѵ�.
		int ar2[]=new int[ar1.length];
		ar2[0]=ar1[0];
		ar2[1]=ar1[1];
		ar2[2]=ar1[2];
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		ar1[2]=10;
		ar2[1]=20;
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		
		Cat cat1=new Cat();
		cat1.name="��1";
		cat1.age=18;
		Cat cat2=cat1;
		
		cat2.name="��2";
		cat2.age=19;
		Cat cat3=new Cat();
		cat3.name="��3";
		cat3.age=20;
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		//Cat Ŭ���� array�� ����� ����غ���.
		Cat cArr[]=new Cat[3];
		//Cat a; ���ؿ� �ּҸ� ���� �� �� �ִ� ����
		//Cat a=new Cat(); ���ؿ� �ּҸ� ���� �� �� �ִ� ���� a�� ������, ���� ����� �����͸� ���� �� �� �ִ� ������ ������ ����
		//cArr[0].age=10;//null point exception
		cArr[0]=new Cat();
		cArr[0].age=11;
		cArr[0].name="��1";
		cArr[1]=cat1;
		cArr[2]=cat2;
		System.out.println(Arrays.toString(cArr));
	}

}
