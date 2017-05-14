package com.ro.learn;

import org.apache.camel.spring.Main;

/**
 * Created by rohan on 2017-03-17.
 */
public class StartCamel {
    public static void main(String[] args) throws Exception {
        StartCamel router = new StartCamel();
        router.boot();
    }

    public void boot() throws Exception {
        final Main main = new Main();
        main.setApplicationContextUri("app_context.xml");
        //main.enableHangupSupport();
        // run until you terminate the JVM
        System.out.println("Starting Camel. Use ctrl + c to terminate the JVM.\n");
        main.run();
    }
}
