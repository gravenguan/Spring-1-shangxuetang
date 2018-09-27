package com.heran.spring1.demo.scope;

import com.heran.spring1.demo.collect.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");

        Car car = (Car) ctx.getBean("car");
        Car car2 = (Car) ctx.getBean("car");

        System.out.println(car == car2);


    }
}