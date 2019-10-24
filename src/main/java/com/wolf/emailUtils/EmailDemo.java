package com.wolf.emailUtils;

public class EmailDemo {

	public static void main(String[] args) {
		Customer c = new CommonCustomer();
		EmailSender eSender = new EmailSender();
		eSender.send(c);
	}

}
