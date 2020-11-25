package com.inter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Cow implements Animal {
	WebDriver dr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal.Eat x=new Animal.Eat();
		//x.eat();
		Eat e=new Eat();
		e.eat();
		System.out.println(120000);

	}
@Test
	public void loging(String name) {
	name="as";
	dr.findElement(By.id("")).sendKeys(name);
	
	

	System.out.println(password+username);
	System.out.println(120);
		
	}

}
