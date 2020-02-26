package com.academy.ex;

 

public class javaacademy7 {

 

	public static void main(String[] args) {

		java.util.Scanner sc=new java.util.Scanner(System.in);

		

		  int max,min=0;

		  int i;

		  max=Integer.MIN_VALUE;

		  min=Integer.MAX_VALUE;

		  

		  for(i=0;i<5;i++) {
			

		  System.out.println("수입력");

		  i=Integer.parseInt(sc.nextLine());

		  }

		  if(max<i){

		  max=i;

		  }

		  if(min>i){

		  }

		  System.out.println("큰수:"+max+"작은수:"+min);

		 

		

			

			

	

		

		

		

	

 

	}

 

 

}