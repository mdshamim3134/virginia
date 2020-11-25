package com.inter;

import java.util.Scanner;

import org.testng.annotations.Test;

public class test {
	
	void A() {
		useCons use=new useCons("shamim",40);
	}
	@Test
	void re() {
		useCons d=new useCons("valo",20);
		int a=d.A();
		System.out.println(a+" love dhaka");
		System.out.println(a+"\tI love\tdhaka");
		System.out.println(a+"\tI love\tdhaka");
		Scanner input=new Scanner(System.in);
		System.out.println("enter any num");
	boolean b=	input.hasNextShort();
	System.out.println("enter any number is"+" "+b);
		
	}
		

}
