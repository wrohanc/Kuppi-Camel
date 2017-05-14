package com.ro.learn.aggregate;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

/**
 * Created by rohan on 2017-05-01.
 */
public class MyAggregator implements AggregationStrategy {
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (newExchange == null) {
            return oldExchange;
        }
        String oldContent = oldExchange.getIn()
                .getBody(String.class);
        String newContent = newExchange.getIn()
                .getBody(String.class);
        String mergedContent = oldContent + "\n" + newContent;
        oldExchange.getIn().setBody(mergedContent);

        return oldExchange;

    }
}
