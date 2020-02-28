package com.academy1.ex;

import java.util.Arrays;
import java.util.Scanner;
class Cat{
	public int age=0;
	public String name="없음";
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
		//arr1={2,3,4}; 초기화는 상위와 같이 선언할때 1번 할 수 있다. 선언후 x
		//arr1=new int[3];// 선언이후 새로 할당 할 수 있다.
		//arr1=new int[5];//새로 할당하면 기존데이터를 arr1으로 접급할 수 없다.
		int arr2[]=arr1;
		arr2=arr1;
		arr1[0]=100;
		arr2[1]=200;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//서로 같이 분리되어 복사한는 배열을 만들어보자
		int ar1[]= {1,2,3};
		//int ar2[]=new int[3];
		//.length는 배열의 크기를 의미한다.
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
		cat1.name="고1";
		cat1.age=18;
		Cat cat2=cat1;
		
		cat2.name="고2";
		cat2.age=19;
		Cat cat3=new Cat();
		cat3.name="고3";
		cat3.age=20;
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		//Cat 클래스 array를 만들어 사용해보자.
		Cat cArr[]=new Cat[3];
		//Cat a; 스텍에 주소를 저장 할 수 있는 공간
		//Cat a=new Cat(); 스텍에 주소를 저장 할 수 있는 공간 a도 잡히고, 실제 고양이 데이터를 저장 할 수 있는 공간이 힙에도 잡힘
		//cArr[0].age=10;//null point exception
		cArr[0]=new Cat();
		cArr[0].age=11;
		cArr[0].name="고1";
		cArr[1]=cat1;
		cArr[2]=cat2;
		System.out.println(Arrays.toString(cArr));
	}

}
