package com.ro.learn.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.Date;

/**
 * Created by rohan on 2017-03-31.
 */
public class MyProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        exchange.getIn().setBody("HeartBeat " + new Date());
    }
}
