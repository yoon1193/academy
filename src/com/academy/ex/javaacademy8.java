package com.academy.ex;

import java.util.Random;
import java.util.Scanner;

public class javaacademy8 {

	public static void main(String[] args) {

		
		 /* Scanner sc=new Scanner(System.in); Random rand=new Random();
		 * 
		 * System.out.println("가위 바위 보 중 하나 입력하시오:"); String user=sc.next();
		 * 
		 * int com = rand.nextInt(3) switch(com) { case 0: System.out.println("가위");
		 * if(user.equals("가위")) { System.out.println("비겼습니다."); } else
		 * if(user.equals("바위")) { System.out.println("사용자가 이겼습니다."); } else
		 * if(user.equals("보")) { System.out.println("사용자가 졌습니다"); } else {
		 * System.out.println("잘못입력했음"); } break; case 1: System.out.println("바위");
		 * if(user.equals("가위")) { System.out.println("사용자가 졌습니다."); } else
		 * if(user.equals("바위")) { System.out.println("비겼습니다."); } else
		 * if(user.equals("보")) { System.out.println("사용자가 이겼습니다"); } else {
		 * System.out.println("잘못입력했음"); } break; case 2: System.out.println("보");
		 * if(user.equals("가위")) { System.out.println("사용자가 이겼습니다."); } else
		 * if(user.equals("바위")) { System.out.println("사용자가 졌습니다."); } else
		 * if(user.equals("보")) { System.out.println("비겼습니다"); } else {
		 * System.out.println("잘못입력했음"); } break;
		 * 
		 * default: System.out.println("잘못입력"); break; }*/
		 

		// 다른코드
		// 1.데이터 세팅 MVC패턴
		// 2.데이터 처리
		// 3.데이터 출력
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("가위 바위 보 중 하나 입력하시오:");
		String user = sc.next();
		int comNum = rand.nextInt(3);
		String com = "";
		String whoWin="";
		// 사용자 입력선랙 컴퓨토입력선택 결정
		switch (user) {
		case "가위":
			switch (comNum) {
			case 0:
				com = "가위";
				whoWin = "비김";
				break;
			case 1:
				com = "바위";
				whoWin = "컴터가 이김";
				break;
			case 2:
				com = "보";
				whoWin = "사용자가 이김";
				break;
			default:
				System.out.println("잘 못 입력");
			}
			break;
		case "바위":
			switch (comNum) {
			case 0:
				com = "가위";
				whoWin = "사용자가 이김";
				break;
			case 1:
				com = "바위";
				whoWin = "비김";
				break;
			case 2:
				com = "보";
				whoWin = "컴터가 이김";
				break;
			default:
				System.out.println("잘 못 입력");
			}
			break;

		case "보":
			switch (comNum) {
			case 0:
				com = "가위";
				whoWin = "컴터가 이김";
				break;
			case 1:
				com = "바위";
				whoWin = "사용자가 이김";
				break;
			case 2:
				com = "보";
				whoWin = "비김";
				break;
			default:
				System.out.println("잘 못 입력");
			}
			break;

		default:
			System.out.println("잘 못 입력");
		}
		System.out.println("사람:" + user + "\n컴퓨터:" + com + "\n승패:" + whoWin);

	}

}
