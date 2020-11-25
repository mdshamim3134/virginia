package com.inter;

import java.io.File;

import org.testng.annotations.Test;

public class childclass extends superclass {
	void child() {
		File file=new File(System.getProperty("user.dir"+"//com.inter//shamim.properties"));
		/*super.A();*/
		System.out.println(2);
		
	}
	@Test
	void test() {
		this.child();
		this.A();
	}

}
