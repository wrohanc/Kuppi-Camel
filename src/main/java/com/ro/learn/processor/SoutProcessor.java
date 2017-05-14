package com.ro.learn.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.Date;

/**
 * Created by rohan on 2017-05-01.
 */
public class SoutProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getIn().getBody(String.class));
        exchange.getIn().setBody(new Date() + " " + exchange.getIn().getBody(String.class));
    }
}
