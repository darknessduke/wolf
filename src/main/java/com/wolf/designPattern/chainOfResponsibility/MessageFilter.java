package com.wolf.designPattern.chainOfResponsibility;

public class MessageFilter {

	public static void main(String[] args) {
		String msg = "<scrip>,sensitive, I am a newbie,:)";
		
		//Filter[] filters = {new HTMLFilter(), new SensitiveFilter(), new FaceFilter()};
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter()).addFilter(new FaceFilter());
		MsgProcessor mp = new MsgProcessor();
		mp.setFc(fc);
		
		msg = mp.doFilter(msg);
		System.out.print(msg);
	}

}
