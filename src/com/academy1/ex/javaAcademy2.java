package com.academy1.ex;

import java.util.Arrays;
import java.util.Scanner;

public class javaAcademy2 {

	public static void main(String[] args) {
		//�迭=���� �ڷ����� ������ �����Ҷ� ���
		//int a1,a2,a3,a4,a5
		//int [] arrInt=new int[5];
		//�迭�� ���� �����Ϸ��� �ε����� ����Ѵ�.
		//arrInt[0] arrInt[1]
		//�ε����� 0���� �����Ѵ�.
		//new int[5]; 0~4   
		//[] �ֵ�������
		
		boolean b1=true;
		boolean b2=false;
		boolean [] bArray=new boolean[4];//0~3
		bArray [0]=false;
		bArray [1]=b1;
		bArray [2]=bArray[0];
		bArray [3]=true;
		System.out.println(bArray[0]+":"+bArray [1]+":"+bArray [2]+":"+bArray [3]);
		System.out.println(Arrays.toString(bArray));
		
		int i1=5;
		int i2=23;
		int iArray[]=new int[4];
		iArray[0]=1;
		iArray[1]=i1;
		iArray[2]=iArray[0]+iArray[1];
		iArray[3]=iArray[2]+4;
		System.out.println(iArray[0]+":"+iArray[1]+":"+iArray[2]+":"+iArray[3]);
		System.out.println(Arrays.toString(iArray));
	
		double d1=5.3;
		double d2=23.2;
		double dArray[]=new double[4];
		dArray[0]=1;
		dArray[1]=d1;
		dArray[2]=dArray[0]+dArray[1];
		dArray[3]=dArray[2]+4.4;
		System.out.println(dArray[0]+":"+dArray[1]+":"+dArray[2]+":"+dArray[3]);
		System.out.println(Arrays.toString(dArray));
		
		String str1="hello1";
		String str2=new String("hello2");
		String []sArray=new String [4];
		sArray[0]=str1;
		sArray[1]=str1+str2;
		sArray[2]=sArray[0];
		sArray[3]=sArray[0]+"world";
		System.out.println(sArray[0]+"\t"+sArray[1]+"\t"+sArray[2]+"\t"+sArray[3]);
		System.out.println(Arrays.toString(sArray));
	}

}
