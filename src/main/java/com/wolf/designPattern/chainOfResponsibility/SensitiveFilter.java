package com.wolf.designPattern.chainOfResponsibility;

public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		return msg.replaceAll("sensitive", "");
	}

}
