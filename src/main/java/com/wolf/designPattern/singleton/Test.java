package com.wolf.designPattern.singleton;

public class Test {
	public static void main(String[] args) {
		SingletonClass o1 = SingletonClass.getInstance();
		SingletonClass o2 = SingletonClass.getInstance();
		
		System.out.println(o1==o2);
	}
}
