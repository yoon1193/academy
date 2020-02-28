package com.academy.ex;

import java.util.Random;
import java.util.Scanner;

public class javaacademy10 {

	public static void main(String[] args) {
		//10번 반복 가위바위보
		int wCount=0,lCount=0,dCount=0;
		for(int i=0;i<10;i++) {

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
				 dCount++;
				break;
			case 1:
				com = "바위";
				whoWin = "컴터가 이김";
				lCount++;
				break;
			case 2:
				com = "보";
				whoWin = "사용자가 이김";
				wCount++;
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
				wCount++;
				break;
			case 1:
				com = "바위";
				whoWin = "비김";
				dCount++;
				break;
			case 2:
				com = "보";
				whoWin = "컴터가 이김";
				lCount++;
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
				lCount++;
				break;
			case 1:
				com = "바위";
				whoWin = "사용자가 이김";
				wCount++;
				break;
			case 2:
				com = "보";
				whoWin = "비김";
				dCount++;
				break;
			default:
				System.out.println("잘 못 입력");
			}
			break;

		default:
			System.out.println("잘 못 입력");
		}
		//System.out.println("사람:" + user + "\n컴퓨터:" + com + "\n승패:" + whoWin);
		System.out.println("승:"+wCount);
		System.out.println("비김:"+dCount);
		System.out.println("패:"+lCount);
		}
		
	}

}
