package com.heran.spring1.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        //1. Create Spring IOC
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2. Get bean instance from IOC
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

        //3. call hello method
        helloWorld.hello();

//        HelloWorld helloworld = new HelloWorld();
//        helloworld.setName("Heran Guan");
//        helloworld.hello();

    }
}
