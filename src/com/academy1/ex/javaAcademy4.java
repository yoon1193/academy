package com.academy1.ex;

import java.util.Scanner;

public class javaAcademy4 {

	public static void main(String[] args) {
		//�ݺ��� 1~10 ��
		int sum=0;
		int sum1=0;
		int count=1;   //�ʱⰪ
		while(count<=10) {//��
			sum=sum+count;
			count++;    //��ȯ
		}
		System.out.println(sum);
		
		for(int i=1;i<=10;i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		
		//do while
		int sum2=0;
		int i3=1;
		do {
			sum2=sum2+i3;
			i3++;
		}
		while(i3<=10);
		System.out.println(sum2);
		
		for(int i4=0;i4<10;i4++) {
			
			if(i4==2) {
				break;//�ݺ����� ����������
			}		
			System.out.println(i4);
		}
		for(int i5=0;i5<10;i5++) {
			
			if(i5==5) {
				continue;//�ǳʶ�
			}	
			System.out.println(i5);
		}
			
		
	}

}
