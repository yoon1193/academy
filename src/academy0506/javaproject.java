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
				System.out.println("경찰청창살");
				String s = "경찰청창살";
				String answer = sc.nextLine();
				if(s.equals(answer)) {
					System.out.println("정답");
					count+=1;
				}else {
					System.out.println("오답");
				}
				
			}
			else if(quest==2)  {
				System.out.println("가나다");
				String s = "가나다";
				String answer = sc.nextLine();
				if(s.equals(answer)) {
					System.out.println("정답");
					count+=1;
				}else {
					System.out.println("오답");
				}
				
			}
			else if(quest==3)  {
				System.out.println("한국");
				String s = "한국";
				String answer = sc.nextLine();
				if(s.equals(answer)) {
					System.out.println("정답");
					count+=1;
				}else {
					System.out.println("오답");
				}
				 
			}
			else if(quest==4)  {
				System.out.println("미국");
				String s = "미국";
				String answer = sc.nextLine();
				if(s.equals(answer)) {
					System.out.println("정답");
					count+=1;
				}else {
					System.out.println("오답");
				}
			}	
		}
		System.out.println("끝 ㅅㄱ");
	}

}
