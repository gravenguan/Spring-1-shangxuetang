package com.heran.spring1.demo.factory;

// 直接调用某一类的静态方法就可以返回Bean的实例

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {

    private static Map<String,Car> cars = new HashMap<String,Car>();

    static{
        cars.put("Audi",new Car("audi",300000.0));
        cars.put("Ford",new Car("ford",400000.0));
    }

    public static Car getCar(String name){
        return cars.get(name);
    }
}
