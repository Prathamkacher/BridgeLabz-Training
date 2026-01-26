package com.annotationsandreflection.reflections.proxy;

import java.lang.reflect.Proxy;

public class ProxyMain {

    public static void main(String[] args) {

        Greeting realObj = new GreetingImpl();

        Greeting proxyObj = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LogHandle(realObj)
        );

        proxyObj.sayHello();
    }
}