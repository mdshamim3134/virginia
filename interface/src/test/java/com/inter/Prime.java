package com.inter;

import java.util.Scanner;

public class Prime {
      static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("please enter the prime number of");
		int number=input.nextInt();
		int i;
		for(i=2;i<number;i++) {
			if(number%i==0) {
				count++;
				break;
			}}
			 if(count==0) {
			System.out.println("prime number");
				
			}
			
			else {
				System.out.println("not prime number");
			}
		
		
		

	}

}
