package com.inter;

public class Loop {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		int fabo;
		for(int i=3;i<10;i++) {
			
			fabo=first+second;
			first=second;
			second=fabo;
			System.out.print("\t"+" "+fabo);
			
			
		}
	}

}
