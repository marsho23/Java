package com.qa.helloworld;

public class HelloWorld {
	
	
	
	public static void printMessage(String message) {
		System.out.println(message); 
	}
	
	public static void main (String[] args) {
		printMessage("Hello World!");
		boolean bool=true;
		byte bytes=8;
		char character='A';
		short number=16;
		int anotherNumber=32;
		long aLongNumber=64L;
		float decimalNumber=3.2f;
		double anotherDecimalNumber=6.4d;
	}
	
	static public int methodName() {
		return 0;
	}
	static public boolean methodName1() {
		return true;
	}
	static public char methodName2() {
		return 'P';
	}
	static public long methodName3() {
		return 52L;
	}
	static public float methodName4() {
		return 0.6f;
	}
	static public String methodName5() {
		return "Hi there";
	}
	static public void methodName6() {
		//no return
	}
}
