package academy0506;

import java.util.Random;
import java.util.Scanner;

public class javaproject {

	public static void main(String[] args) {
//		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int count  = 0;
		while(count!=4) {
			int quest=(int)(Math.random()*5+1);
			if(quest==1) {
				System.out.println("����ûâ��");
				String s = "����ûâ��";
				String answer = sc.nextLine();
				if(s.equals(answer)) {
					System.out.println("����");
					count+=1;
				}else {
					System.out.println("����");
				}
				
			}
			else if(quest==2)  {
				System.out.println("������");
				String s = "������";
				String answer = sc.nextLine();
				if(s.equals(answer)) {
					System.out.println("����");
					count+=1;
				}else {
					System.out.println("����");
				}
				
			}
			else if(quest==3)  {
				System.out.println("�ѱ�");
				String s = "�ѱ�";
				String answer = sc.nextLine();
				if(s.equals(answer)) {
					System.out.println("����");
					count+=1;
				}else {
					System.out.println("����");
				}
				 
			}
			else if(quest==4)  {
				System.out.println("�̱�");
				String s = "�̱�";
				String answer = sc.nextLine();
				if(s.equals(answer)) {
					System.out.println("����");
					count+=1;
				}else {
					System.out.println("����");
				}
			}	
		}
		System.out.println("�� ����");
	}

}
