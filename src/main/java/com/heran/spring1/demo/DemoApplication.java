package com.heran.spring1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        HelloWorld helloworld = new HelloWorld();
        helloworld.setName("Heran Guan");
        helloworld.hello();

    }
}
