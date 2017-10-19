package com.jerry.designPattern.chainOfResponsibility;

public class FaceFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		return msg.replace(":","^*^");
	}

}
