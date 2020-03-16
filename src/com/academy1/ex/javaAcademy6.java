package com.academy1.ex;

import java.util.Random;
import java.util.Scanner;

public class javaAcademy6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand=new Random();
		
		//p.7문제10 무한루프
		//p.8문제1 97
		//p.8문제2 무한루프
		//p.9문제3
		/*System.out.println("하나의 수를 입력하세요");
		int input=sc.nextInt();
		int a=1;
		int b=0;
		for(int i=1;i<input;i++) {
			b+=a;
			if(b>input) {
				break;
			}
			a++;
			
			System.out.println(b);
		}
		//p.9문제5 몰르
		//p.10문제3
		int sum=0;
		int i2=0;
		while(i2<5) {
			System.out.println("정수를 입력하라");
			int num=sc.nextInt();
			if(num<0) {
				num=-num;
			}
			sum+=num;
			i2++;
		}
		System.out.println("다섯 개 정수의 합:"+sum);
		//p.11문제4
		System.out.println("값을 입력하세요");
		int inputNum=sc.nextInt();
		int num1=inputNum;
		int num2=0;
		int count=0;
		while(num1>=num2) {
			num1=num1-2;
			num2=num2+3;
			count++;
			if(num1-num2<0) {
				System.out.println("num1값은:"+num1);
				System.out.println("num2값은:"+num2);	
				System.out.println("num1-num2<0 때까지의 횟수는:"+count);
			}
		}
		
		//p.12문제3
		int num3=0,num4=0;
		int result=0;
		String s="";
		while(!s.equals("3")) {
			System.out.println("1.숫자입력\n2연산선택\n3.종료");
		s=sc.next();
		switch(s) {
		case"1":
			System.out.println("첫번째 수를 입력하세요:");
			num3=sc.nextInt();
			System.out.println("두번째 수를 입력하세요:");
			num4=sc.nextInt();
			break;
		case"2":
			System.out.println("연산 선택(+,-,*,/)");
			String s1="";//여기서 이렇게 써도 되는지?
			s1=sc.next();
			if(s1.equals("+")) {
				result=num3+num4;
			}
			else if(s1.equals("-")) {
				result = num3-num4;
			}
			else if(s1.equals("*")) {
				result = num3*num4;
			}
			else if(s1.equals("/")) {
				result = num3/num4;
			}
			else {
				System.out.println("잘못입력");
				break;
			}
			System.out.println(s1+ "연산입니다." +num3+s1+num4+ "결과값은="+result);
			//아무키나 눌러주세요
			break;
		case"3":
			System.out.println("종료되었습니다 감사합니다");
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			break;
		}
		}
		
		//p.13문제4
		//p.13문제1 1번
		//p.13문제2 1번
		//p.13문제3 1번
		//p.14문제9 
		//p.14문제-
		//Random rand=new Random();
		System.out.println("0~9까지 숫자를 입력하세요.");
		int com=rand.nextInt(10);
		System.out.println(com);
		boolean isOk=false;
		for(int j=0;j<10;j++) {
			System.out.println(j+1+"번 쨰 도전");
			int user=sc.nextInt();
			if(user>com) {
				System.out.println(user+"보다 작습니다");
			}
			else if(user<com) {
				System.out.println(user+"보다 큽니다");
			}
			else if(user==com) {
				System.out.println("우와!정확합니다."+" "+(j+1)+"번째만에 맞췄군요!");
				isOk=true;
				break;
			}
		}
		if(isOk==false) {
			System.out.println("10번 안에 맞추지 못함");
			}
		
		//p.15문제1
		int i3;
		int sum1=0;
		for(i3=0;i3<100;i3++) {
			sum1+=i3;
		}
		System.out.println(sum1);
		
		//p.16문제4(a) 10번
		//p.16문제4(b) 10번
		//p.16문제4(c) 11번
		//p.17문제1
		int i4;
		for(i4=1;i4<=10;i4++) {
			if(i4%2==0) {
				System.out.println(i4);
			}
		}
		
		//p.17문제2
		System.out.println("시험 점수를 입력하세요");
		int sum2=0;
		int rand1=rand.nextInt();
		while(true) {
			int num5=sc.nextInt();
			if(num5==0) {		
				break;
			}
			sum2+=num5;
		}	
		System.out.println("시험 점수의 합계는"+sum2+"점 입니다.");
		
		//p.18문제
		System.out.println("1부터 덧셈하는 프로그램");
		System.out.println("마지막 값을 입력하세요");
		int lastNum=sc.nextInt();
		int sum3=0;
		for(int i5=1; i5<=lastNum;i5++) {
			sum3+=i5;
			System.out.println("["+(i5-1)+"]행 TotalNumber의 값="+sum3);
		}
		System.out.println("1부터"+lastNum+"까지의 총합은"+sum3+"입니다.");
		
		//p.19문제1
		int i6;
		for(i6=60;i6>=0;i6--) {
			System.out.println(i6+"초");
			if(i6==0) {
				System.out.println("발사!");
			}
		}
		
		//p.19문제2
		System.out.println("몇 번 반복 할까요?");
		int count1=sc.nextInt();
		for(int i7=0;i7<count1;i7++) {
			System.out.println("안녕하세요?");
		}
	
		//p.20문제6
		for(int num6=1;num6<=100;num6++) {
			if(num6%3==0) {
				System.out.println(num6);
			}
		}
		
		//p.20문제2
		int sum4=0;
		int c=0;
		int i7;
		System.out.println("첫 번쨰 수를 입력하세요");
		int firstNum=sc.nextInt();
		System.out.println("두 번쨰 수를 입력하세요");
		int secondNum=sc.nextInt();
		for(i7=firstNum;i7<=secondNum;i7++) {
			sum4+=i7;
		}
		for(i7=secondNum;i7<=firstNum;i7++) {
			sum4+=i7;
		}
		System.out.println(sum4);
		
		//p.21문제3
		int count2=0;
		System.out.println("하나의 수를 입력해라");
		int randNum=sc.nextInt();
		for(int num7=2;num7<randNum;num7++) {
			if(randNum%num7==0) {
				count2++;
			}
		}
		if(count2==0) 
			System.out.println(randNum+"은/는 소수 입니다");	
		else
			System.out.println(randNum+"은/는 소수가 아닙니다.");
		
		//p.21문제7
		for(int i8=1;i8<=100;i8++) {
			if(i8%3==0||i8%5==0) {
				System.out.println(i8);
			}
		}
		
		//p.21문제8	
		System.out.println("시작정수=");
		int stratNum=sc.nextInt();
		System.out.println("종료정수");
		int endNum=sc.nextInt();
		int sum5=0;
		for(int i9=stratNum;i9<=endNum;i9++) {
			sum5+=i9;
		}
		System.out.println("Sum of "+stratNum+" to " +endNum+ " = " +sum5);
	
		//p.22문제4
		int c;
		System.out.println("첫 번째 숫자 입력");
		int a1=sc.nextInt();
		System.out.println("두 번째 숫자 입력");
		int b1=sc.nextInt();
		System.out.println(a1+"의 배수 "+b1+"번 출력");
		for(c=1;c<=b1;c++) {
			System.out.println(c*a1);
		}
		
		//p.22문제5 4번
		//p.23문제6
		System.out.println("출력할 단을 입력하세요.");
		int num = sc.nextInt();
		for(int i=9;i>=1;i--) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		
		//p.23문제9
		System.out.println("정수를 입력하시여");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		//p.23문제
		int count=0;
		int sum=0;
		System.out.println("하나의 수를 입력");
		int num=sc.nextInt();
		for(int i=1;i<=1000;i++) {
			if(i%num==0) {
				sum+=i;
				count++;
			}
		}
		System.out.println("1부터 1000까지 "+num+"의 배수의 개수="+count+" 합="+sum)

		//p.24문제
		System.out.println();
		int num=sc.nextInt();
		while(num!=0) {
			if(num>0) {
				System.out.println("양수입니다. 절대값은 "+num+"입니다");
			break;
			}
			else if(num<0) {
				System.out.println("음수입니다. 절대값은 "+(-num)+"입니다");
			break;
			}
		}
		System.out.println("0 입니다.");
		
		//p.24문제10
		//(화씨온도 - 32) ÷ 1.8 = 섭씨온도
		double a=0;
		System.out.println("화씨온도"+"\t"+"섭씨온도");
		for(int i=0;i<=100;i++) {
			if(i%10==0) {
			    a=(i-32)/1.8;
				int a1=(int)a;
				System.out.println(i+"\t"+a1);
			}
		}
		
		//p.25문제12
		for(int i=0;i<10;i++) {
			System.out.println("데이터를 입력하시요");
			int a=sc.nextInt();
			if(a<=50) {
			for(int j=1;j<=a;j++) {
				System.out.print("*");
			}
			}
			else {
			System.out.println("50이 넘습니다");
			}
		}
		
		//p.25문제14
		System.out.println("n의 값을 입력하세요");
		int a=sc.nextInt();
		int sum=0;
		int result=0;
		for(int i=1;i<=a;i++) {
			result=i*i;
			sum+=result;
		}
		System.out.println(sum);
		
		//p.26문제16
		int a=1000;
		int result=0;
		System.out.println("초기 연료량="+a+"리터");
		while(a>=100) {
			System.out.println("연료 충전은 +, 소모는 -로 입력해주세요.:");
			int p=sc.nextInt();
			a=(a+p);
			System.out.println("현재 남아있는 양은 "+a+"L 입니다");
		}
		System.out.println("(경고) 연료가 10% 미만입니다.");
		
		//p.26문제17
		boolean isOk=true;
		System.out.println("하나의 수를 입력해라");
		int inputNum=Integer.parseInt(sc.nextLine());
		for(int i=2;i<inputNum;i++) {
			if(inputNum%i==0) {
				isOk=false;
				break;
			}
		}
		if(isOk==true) {
			System.out.println("소수");
		}
		else {
			System.out.println("소수x");
		}
		
		//p.27문제5
		for(int i=1;i<=1000;i++) {
			System.out.print(i+" ");
			if(i%10==0) {
				System.out.println("");
			}
		}
		
		//p.27문제2
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int num=0;
		do {
			System.out.println("하나의 숫자를 입력하세요(0입력종료)");
			num = sc.nextInt();
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
			if(num==0) {
				break;
			}
		}while(num!=0 ); 
		System.out.println("가장 큰수는="+max);
		System.out.println("가장 작은수는="+min);
		//p.28문제3
		int a=0;
		int b=1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
		//p.28문제 지그재그
		int i;
		int j;
		for(i=0;i<5;i++) {
			if(i%2==0) {
				for(j=1;j<=5;j++) {
					System.out.print(5*i+j);
				}
			}
			else {
				for(j=1;j<=5;j++) {
					System.out.print((5*(i+1)-j)+1);
				}
			}
			System.out.println();
		}
		//다른 풀이
		int lineMax=0;
		int lineRev=0;
		for(int i=0;i<25;i++) {
			if(i%5==0) {
				System.out.println("");
				lineMax=i+5;
				lineRev++;
			}
			if(lineRev%2!=0) {
				System.out.print("\t"+(i+1));
			}
			else {
				System.out.print("\t"+(lineMax-i%5));
			}
		}
		
		//p.30 문제 달력
		int startDay = 3;
		int day;
		int month = 31;
		System.out.println("======================");
		System.out.println("  월  화  수  목  금  토 일 ");
		System.out.println("======================");

		for (day = 0; day < startDay; day++) {
			System.out.print("   ");
		}
		for (int date = 1; date <= month; date++) {
			if (day == 7) {
				day = 0;
				System.out.print("\n");
			}
			day++;
			System.out.print(String.format("%3d", date));

		}
		System.out.print("\n");
		System.out.println("======================");
		
		//p.33문제1 3번 1번실행
		//p.33문제2 1번 4번
		//p.33문제3 0번 
		//p.33문제4 (a)0369 (b)036912 (c)2468 (d)109876543210	
				  //(e)*********(f) error
		//p.34문제5 (a)
		//(a)
		int i =10;
		while(i>=0) {
			System.out.println(i);
			i--;
		}
		//(b)
		for(i=10;i>=0;i-=3) {
			System.out.println(i);
		}
		//p.34문제6 (a) 11 (b)10
		//p.34문제7 (a) i++ (b) i<10 (c) i-- > i++ (d) double (e) 초기값x
		 
		//p.35문제 동전던지기
		int r=rand.nextInt(2);
		System.out.println("동전 던지기 게임을 시작합니다.");
		if(r==0) {
			System.out.println("앞면 입니다");
		}
		else {
			System.out.println("뒷면 입니다");
		}
		
		//p.36문제 주사위
		int dice=rand.nextInt(6)+1;
		int count=0;
		while(true) {
			System.out.println("1에서 6까지의 숫자를 입력하세요!");
			int a=sc.nextInt();
			if(dice==a) {
				System.out.println("주사위를 맞췄습니다!"+"\n**주사위:"+dice+" User:"+a+"**"+"\n반복횟수는 "+count+"회 입니다!");
			break;
			}
			else {
				System.out.println("실패!"+"\n주사위:"+dice+" User:"+a+"\n다시 시작 할게요");
				count++;
			}	
		}
		
		//p.37 문제
		int count=0;
		int count2=0;
		System.out.println("산수 문제를 자동으로 출제합니다.");
		while(true) {
			int randNum=rand.nextInt(100);
			int randNum2=rand.nextInt(100);
			System.out.println(randNum+"+"+randNum2+"=");
			int result=randNum+randNum2;
			int a=sc.nextInt();
			if(a==result) {
				System.out.println("맞았습니다");
				count++;
				break;
			}
			else {
				System.out.println("틀렸습니다");
				count2++;		
			}
			if(count2==3) {
				break;
			}
		}
		System.out.println("총 맞춘 개수는="+count+" 틀린 개수는="+count2);*/
	}
}
