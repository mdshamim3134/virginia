package com.inter;
import org.apache.commons.lang3.RandomStringUtils;
public class random {

	public static void main(String[] args) {
	String ran=	RandomStringUtils.randomAlphabetic(5);
	String ran1=RandomStringUtils.randomAlphabetic(6);
	String ran2=	RandomStringUtils.randomNumeric(7);
	System.out.println(ran);
	System.out.println(ran2);

	}

}
