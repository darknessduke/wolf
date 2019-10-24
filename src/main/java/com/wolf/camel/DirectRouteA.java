package com.wolf.camel;

import org.apache.camel.builder.RouteBuilder;

public class DirectRouteA extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("direct:directRouteB")
        .to("log:DirectRouteB?showExchangeId=true");
	}
}
