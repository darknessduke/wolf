package com.wolf.camel;

import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;

public class DirectCamel {
    public static void main(String[] args) throws Exception {
        ModelCamelContext camelCtx = new DefaultCamelContext();
        camelCtx.start();
        camelCtx.addRoutes(new DirectRouteA());
        camelCtx.addRoutes(new DirectRouteB());
        
        synchronized (DirectCamel.class) {
        	DirectCamel.class.wait();
        }
    }
}
