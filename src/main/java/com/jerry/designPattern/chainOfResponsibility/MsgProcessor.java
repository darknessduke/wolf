package com.jerry.designPattern.chainOfResponsibility;

public class MsgProcessor {
	FilterChain fc;
	
	public FilterChain getFc() {
		return fc;
	}

	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

	public String doFilter(String msg) {
		return fc.doFilter(msg);
	}

}
