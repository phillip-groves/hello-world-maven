package com.liveincode.hello;


public class HelloApplication {
	
	private static final String HELLO_WORLD_TEXT = "Hello World!";
	
	public static void main(String[] args){
		System.out.println(HELLO_WORLD_TEXT);
	}
	
	public static String getHelloWorldText() {
		return HELLO_WORLD_TEXT;
	}
}
