package com.academy.ex;

import java.util.Random;
import java.util.Scanner;

public class javaacademy10 {

	public static void main(String[] args) {
		//10�� �ݺ� ����������
		int wCount=0,lCount=0,dCount=0;
		for(int i=0;i<10;i++) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("���� ���� �� �� �ϳ� �Է��Ͻÿ�:");
		String user = sc.next();
		int comNum = rand.nextInt(3);
		String com = "";
		String whoWin="";
		// ����� �Է¼��� ��ǻ���Է¼��� ����
		switch (user) {
		case "����":
			switch (comNum) {
			case 0:
				com = "����";
				whoWin = "���";
				 dCount++;
				break;
			case 1:
				com = "����";
				whoWin = "���Ͱ� �̱�";
				lCount++;
				break;
			case 2:
				com = "��";
				whoWin = "����ڰ� �̱�";
				wCount++;
				break;
			default:
				System.out.println("�� �� �Է�");
			}
			break;
		case "����":
			switch (comNum) {
			case 0:
				com = "����";
				whoWin = "����ڰ� �̱�";
				wCount++;
				break;
			case 1:
				com = "����";
				whoWin = "���";
				dCount++;
				break;
			case 2:
				com = "��";
				whoWin = "���Ͱ� �̱�";
				lCount++;
				break;
			default:
				System.out.println("�� �� �Է�");
			}
			break;

		case "��":
			switch (comNum) {
			case 0:
				com = "����";
				whoWin = "���Ͱ� �̱�";
				lCount++;
				break;
			case 1:
				com = "����";
				whoWin = "����ڰ� �̱�";
				wCount++;
				break;
			case 2:
				com = "��";
				whoWin = "���";
				dCount++;
				break;
			default:
				System.out.println("�� �� �Է�");
			}
			break;

		default:
			System.out.println("�� �� �Է�");
		}
		//System.out.println("���:" + user + "\n��ǻ��:" + com + "\n����:" + whoWin);
		System.out.println("��:"+wCount);
		System.out.println("���:"+dCount);
		System.out.println("��:"+lCount);
		}
		
	}

}
