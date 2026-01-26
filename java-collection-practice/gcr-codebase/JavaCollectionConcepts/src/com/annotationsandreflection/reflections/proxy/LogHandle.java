package com.annotationsandreflection.reflections.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandle implements InvocationHandler {

    private Object target;

    public LogHandle(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {

        System.out.println("Calling method: " + method.getName());
        return method.invoke(target, args);
    }
}