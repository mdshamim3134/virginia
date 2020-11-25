package com.inter;

import java.util.Scanner;

public class Timetable {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number;
		System.out.println("enter the number please");
		number=input.nextInt();
		System.out.print("******-----this is the auto generated time table*****-----");
		for(int i=1;i<11;i++) {
			 int x=number*i;
			
			System.out.print("\t"+x);
		}

	}

}
