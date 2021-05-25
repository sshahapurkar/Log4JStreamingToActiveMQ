package com.hsbc.ttr.fsa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jJmsAppenderHelloWorld {
    private static Logger logger = LoggerFactory.getLogger(Log4jJmsAppenderHelloWorld.class);
    public static void main(String[] args){
        System.out.println("Reached here ...");
        logger.info("Sending this message to ActiveMQ");
    }
}