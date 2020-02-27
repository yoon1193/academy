package com.academy.ex;

 

public class javaacademy6 {

 

	public static void main(String[] args) {

		java.util.Scanner sc=new java.util.Scanner(System.in);

		//연습문제1

		System.out.println("숫자를 입력하시오:");

		int a,b,c,d,e=0;

		a=sc.nextInt();

		if(a%2==0) {

			System.out.println(a+"는 짝수입니다");

		}

		else {

			System.out.println(a+"는 홀수입니다");

		}

		

		//문제

		System.out.println("정수를 입력하시오");

		a=sc.nextInt();

		if(a%3==0) {

			System.out.println("3의 배수입니다");

		}

		if(a%4==0) {

			System.out.println("4의 배수입니다");

		}

		

		if(a%7==0) {

			System.out.println("7의배수입니다");

		}

		

		

		

		//연습문제2

		System.out.println("두 정수를 입력하시오:");

		a=sc.nextInt();

		b=sc.nextInt();

		if(a==b) {

			System.out.println("두 수의 값은 같은 값입니다.");

		}

		else if(a<b) {

			System.out.println(a+"보다"+b+"이 큰 값입니다");

		}

		else {

			System.out.println(b+"보다"+a+"이 큰 값입니다");

		}

		

		//문제2

		System.out.println("첫번째 정수를 입력하시오:");

		a=sc.nextInt();

		System.out.println("두번째 정수를 입력하시오:");

		b=sc.nextInt();

		if(a%b==0) {

			System.out.println("약수입니다");

		}

		else {

			System.out.println("약수가 아닙니다");

		}

		

		//문제3(0~10ture,그 외 false)

		System.out.println("정수를 입력하시오:");

		a=sc.nextInt();

		if(a>=0 &&a<=10) {

			System.out.println("정답입니다.");

		}

		else {

			System.out.println("틀렸습니다.");

		}

		

		//문제

		System.out.println("정수를 입력하시오:");

		a=sc.nextInt();

		if(a<0){

			System.out.println(a+"는 음수 입니다.");

		}

		else {

			System.out.println(a+"는 음수가 아닙니다.");

		}

		

		//문제4

		sc.nextLine();

		System.out.println("A~C 까지의 문자를 입력하시오");

		

		String s=sc.nextLine();//혹은 위에 sc 지우고 String s=sc.next();

		if(s.equals("A")){

			System.out.println("정답입니다.");

		}		

		else if(s.equals("B")){

			System.out.println("정답입니다.");

		}

		else if(s.equals("c")){

			System.out.println("정답입니다.");

		}

		else {	

			System.out.println("틀렸습니다");

		}

		

		//문제8

		System.out.println("현재 시간과 나이를 입력하시오:");

		a=sc.nextInt();

		b = sc.nextInt();

		if(a<17) {

			if(b>12) {

				System.out.println("요금은 34,000원 입니다");

			

			}

			else {

				System.out.println("요금은 25,000원 입니다");

			}

		}

		else {

			System.out.println("요금은 10,000원 입니다.");	

		}

		

		//문제4

		System.out.println("국 영 수 점수를 입력하시오:");

		a=sc.nextInt();

		b=sc.nextInt();

		c=sc.nextInt();

		double avg=(a+b+c)/3;

		if(avg>=80) {

			System.out.println(+avg+":"+"합격 입니다");			

		}

		else {

			System.out.println("불합격 입니다");

		}

		

		//문제6

		/*

		 * int max,min=0;

		 * max=integer.MIN_VALUE;

		 * min=Integer.MAX_VALUE;

		 * 

		 * for(int i=0;i<5;i++)

		 * System.out.println("수입력");

		 * Integer.parseInt(sc.nextLine());

		 * if(max<input){

		 * max=input;

		 * }

		 * if(min>input){

		 * }

		 * sysout("큰수:"+max+"작은수:"+min);

		 */

		int max,min;

		System.out.println("첫 번째 수를 입력하세요:");

		a=sc.nextInt();

		System.out.println("두 번째 수를 입력하세요:");

		b=sc.nextInt();

		System.out.println("세 번째 수를 입력하세요:");

		c=sc.nextInt();

		System.out.println("네 번째 수를 입력하세요:");

		d=sc.nextInt();

		System.out.println("다섯 번째 수를 입력하세요:");

		e=sc.nextInt();

		

		max=a;

		min=a;

		if(b>max) {

			max=b;

		}

		if(c>max) {

			max=c;

		}

        

		if(d>max) {

			max=d;

		}

        

		if(e>max) {

			max=e;

		}

		if(b<min) {

			min=b;

		}

		if(c<min) {

			min=c;

		}

        

		if(d<min) {

			min=d;

		}

        

		if(e<min) {

			min=e;

		}

		System.out.println("최댓값은"+max+"최솟값은"+min);

        

		

        

 

 

		

		//문제5

		System.out.println("두 개의 정수를 입력하시오");

		a=sc.nextInt();

		b=sc.nextInt();

		if(a>0) {

			a=a;

		}

		else {

			a=-a;

		}

		if(b>0) {

			b=b;

		}

		else {

			b=-b;

		}

		

		System.out.println("두 수의 절댓값의 합:"+(a+b));

 

		//문제9

		System.out.println("수를 입력하시오");

		double x=sc.nextDouble();

		double x1=(x*x*x)-(9*x)+2;

		double x2=(7*x)+2;

		if(x>=0) {

			System.out.println(x1);

			

		}

		else {

			System.out.println(x2);

		}

		

		

		//문제10//비만도=체중/(신장*신장)

		System.out.println("뭄무게를 입력하세요:");

		x=sc.nextDouble();

		System.out.println("키를 입력하세요:");

		x1=sc.nextDouble();

		x1=x1/100;

		double bmi=x/(x1*x1);

		if(bmi<20) {

			System.out.println("저체중");

		}

		else if(bmi>=20 && bmi<25) {
			System.out.println("표준");

		

		}

		else {

			System.out.println("과체중");

		}

			

		//문제11

		System.out.println("키를 입력하시오:");

		x=sc.nextDouble();

		if(x>=175) {

			System.out.println("\n키가"+x+"이시군요.\n키가 크시군요");

		}

		else {

			System.out.println("\n\n키가"+x+"이시군요");

		}

		

		sc.close();

	}
 
 
}