package com.heran.spring1.demo.properties;

import com.heran.spring1.demo.collect.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException{
        ApplicationContext ctx= new ClassPathXmlApplicationContext("beans-properties.xml");

        DataSource dataSource= (DataSource) ctx.getBean("dataSource");

//        System.out.println(dataSource.getConnection());

    }
}
