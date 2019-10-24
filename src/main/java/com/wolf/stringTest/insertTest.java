package com.wolf.stringTest;

public class insertTest {
	private  String b = "jliu" ;
	
	public void func() {
		b = "jerry";
	}
	
	public static void main(String[] args) {
		String str = "abc";
		String test="abc<test></test>";
		
		//func();
		
		String result = test.replace("<test>", "<test><location>uuid here</location>");
		
		System.out.println(result);
		
	}

}
