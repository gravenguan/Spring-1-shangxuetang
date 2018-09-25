package com.heran.spring1.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        //1. Create Spring IOC
        //ApplicationContext IOC container
        //ClasspathXmlApplicationContext: 是ApplicationContext 接口实现类，从类路径下载config file
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2. Get bean instance from IOC
        //用id定位到IOC 容器的bean
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

        //3. call hello method
        helloWorld.hello();

        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        car = (Car) ctx.getBean("car2");
        System.out.println(car);



        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

    }
}
