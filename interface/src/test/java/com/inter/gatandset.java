package com.inter;

import org.testng.annotations.Test;

public class gatandset {
private String name;
public String getName() {
	
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
private String pass;
	public static void main(String[] args) {
		

	}
	public class A{
		@Test
		void set() {
		gatandset set=new gatandset();
		set.setName("asma");
		System.out.println(set.getName());
	}

}
	
	public class B{
		
		void T() {
		gatandset test=new gatandset();
		
		System.out.println(test.getName());
		}
	}
	}
