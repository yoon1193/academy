package com.academy.ex;

import java.util.Random;
import java.util.Scanner;

public class javaacademy8 {

	public static void main(String[] args) {

		
		 /* Scanner sc=new Scanner(System.in); Random rand=new Random();
		 * 
		 * System.out.println("���� ���� �� �� �ϳ� �Է��Ͻÿ�:"); String user=sc.next();
		 * 
		 * int com = rand.nextInt(3) switch(com) { case 0: System.out.println("����");
		 * if(user.equals("����")) { System.out.println("�����ϴ�."); } else
		 * if(user.equals("����")) { System.out.println("����ڰ� �̰���ϴ�."); } else
		 * if(user.equals("��")) { System.out.println("����ڰ� �����ϴ�"); } else {
		 * System.out.println("�߸��Է�����"); } break; case 1: System.out.println("����");
		 * if(user.equals("����")) { System.out.println("����ڰ� �����ϴ�."); } else
		 * if(user.equals("����")) { System.out.println("�����ϴ�."); } else
		 * if(user.equals("��")) { System.out.println("����ڰ� �̰���ϴ�"); } else {
		 * System.out.println("�߸��Է�����"); } break; case 2: System.out.println("��");
		 * if(user.equals("����")) { System.out.println("����ڰ� �̰���ϴ�."); } else
		 * if(user.equals("����")) { System.out.println("����ڰ� �����ϴ�."); } else
		 * if(user.equals("��")) { System.out.println("�����ϴ�"); } else {
		 * System.out.println("�߸��Է�����"); } break;
		 * 
		 * default: System.out.println("�߸��Է�"); break; }*/
		 

		// �ٸ��ڵ�
		// 1.������ ���� MVC����
		// 2.������ ó��
		// 3.������ ���
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
				break;
			case 1:
				com = "����";
				whoWin = "���Ͱ� �̱�";
				break;
			case 2:
				com = "��";
				whoWin = "����ڰ� �̱�";
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
				break;
			case 1:
				com = "����";
				whoWin = "���";
				break;
			case 2:
				com = "��";
				whoWin = "���Ͱ� �̱�";
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
				break;
			case 1:
				com = "����";
				whoWin = "����ڰ� �̱�";
				break;
			case 2:
				com = "��";
				whoWin = "���";
				break;
			default:
				System.out.println("�� �� �Է�");
			}
			break;

		default:
			System.out.println("�� �� �Է�");
		}
		System.out.println("���:" + user + "\n��ǻ��:" + com + "\n����:" + whoWin);

	}

}
