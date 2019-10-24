package com.wolf.designPattern.singleton;

public class SingletonClass {
	private static class SingletonClassInstance {
		private static final SingletonClass instance = new SingletonClass();
		}

	public synchronized static SingletonClass getInstance() {
		return SingletonClassInstance.instance;
	}
}