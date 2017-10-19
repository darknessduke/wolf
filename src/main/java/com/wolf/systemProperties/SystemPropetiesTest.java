package com.wolf.systemProperties;

import java.util.Properties;

public class SystemPropetiesTest {

	public static void main(String[] args) {
		System.out.println("OS:" + System.getProperty("windir"));
		System.out.println(System.getenv("windir"));
		System.out.println(System.getenv("jem.output"));
		System.out.println(System.getProperty("jem.output"));
		Properties p = System.getProperties();
		for (Object key : p.keySet()) {
			System.out.println(key + ":" + p.getProperty((String)key));
		}
		System.out.println(System.getProperty("jem.abc", "def"));
	}
	

}
