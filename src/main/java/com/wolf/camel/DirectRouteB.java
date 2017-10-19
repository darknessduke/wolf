package com.wolf.camel;

import org.apache.camel.builder.RouteBuilder;

public class DirectRouteB extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("jetty:http://0.0.0.0:8282/directCamel")
		.to("direct:directRouteB")
		.to("log:DirectRouteA?showExchangeId=true");
	}
	
}
