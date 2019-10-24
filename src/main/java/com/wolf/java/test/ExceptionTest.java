package com.wolf.java.test;

public class ExceptionTest {
	public static void main(String[] args) {
		test();
	}
	
	private static void test() {
		for (int cnt = 0; cnt < 6; cnt++) {
			if (cnt > 4)
				throw new NumberFormatException("format exception");
			else
				System.out.println("counter:" + cnt);
		}
	}
}
