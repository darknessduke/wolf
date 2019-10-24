package com.wolf.classBasicConcept;

public class Test {
	public static void main(String[] args) {
		Animal animal = new Dog();
		
		//animal can't bark here
		animal.fly();
		if (animal instanceof Animal) {
			System.out.println("It's an animal object");
		}
		
		if (animal instanceof Dog) {
			System.out.println("It's an dog object");
		}
	}
}
