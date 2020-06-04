package com.liveincode.hello;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class HelloApplicationTest {
	
	@Test
	public void isTextEqualHelloWorld() {
		
		// Ensure Hello World text equals "Hello World!"
		assertTrue(HelloApplication.getHelloWorldText().equalsIgnoreCase("Hello World!"));
	}
}
