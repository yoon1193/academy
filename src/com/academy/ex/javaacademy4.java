package com.academy.ex;

public class javaacademy4 {

	public static void main(String[] args) {
		//if ���ǹ�
		/*if(����) {
			//������ ���϶� ����
		}
		else {
			//������ �����ϋ� ����
		}
		���ǽ����� �� �� �ִ°��� �������� boolean�� ���
		(true false �񱳿����� ��������)
		
		if(true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");				
		}*/
		
		
		if(true) 
			System.out.println("true");
		
		else 
			System.out.println("false");//����ΰ� 1���̸� �߰�ȣ ��������
		System.out.println("����");//�� �ڵ�� if�� �ۿ��ִ� �ڵ�
		
		//else�κ� ��ü�� ��������
		if(10<40) { 
			System.out.println("true");
		}
		
		int a=10;
		if(a==10) {
			System.out.println("true");
		}
		if(a!=7) {//a�� 10�� �ƴϸ�
			System.out.println("true");
		}
		//true,false 1,0 �Ϲ����� ���� 0�� �ƴϸ� true ���.
		//if(1){} ���ǽ��� ����
		//if(0){} ���ǽ��� ���� �ȵ�
		//if(23){} ���ǽ��� ����
		//�ڷ��� �⺻�ڷ��� �����ڷ���
		//�⺻�ڷ��� �� ==  ������ ����Ű�� ����
		//�����ڷ����� .equals ������ ����Ű�� �ּҿ� �ִ� ����
		
		String s1="ȫ�浿";
		String s2="ȫ�浿";
		String s3=new String("ȫ�浿");
		String s4=new String("ȫ�浿");
		if(s3==s4) {
			System.out.println("== �̿��� ���� ���");
		}
		if(s3.equals(s4)) {
			System.out.println("equals �̿��� ���� ���");
		}
		
		
		

	}

}
