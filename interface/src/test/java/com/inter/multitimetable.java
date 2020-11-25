package com.inter;

import java.util.Scanner;

public class multitimetable {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the time table of");
		System.out.println("then press enter please");
		int timetableof=input.nextInt();
		System.out.println("please enter the starting number");
		System.out.println("then press enter please");
		int start=input.nextInt();
		System.out.println("please enter ending number");
		System.out.println("then press enter please");
		int end=input.nextInt();
		for(int i=start;i<=end;i++) {
			System.out.print("\t"+timetableof*i);
		}
		

	}

}
