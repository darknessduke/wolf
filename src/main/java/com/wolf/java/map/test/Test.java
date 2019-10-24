package com.wolf.java.map.test;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<String, Object> m = new HashMap<String, Object>();
		int a;
		
		m.put(null, "value1");
		
		m.put("key1", "value2");
		System.out.println(m.get(null));
	}
}
