package com.jerry.designPattern.chainOfResponsibility;

public class HTMLFilter implements Filter {
	
	@Override
	public String doFilter(String msg) {
		return msg.replace('<', '[').replace('>', ']');
	}

}
