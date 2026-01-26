package com.annotationsandreflection.reflections.invokeprivatemethod;

import java.lang.reflect.Method;

public class InvokePrivateMain {

    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();

        Class c = calc.getClass();
        Method method = c.getDeclaredMethod("multiply", int.class, int.class);

        method.setAccessible(true);          // allow private access
        int result = (int) method.invoke(calc, 3, 4);

        System.out.println("Result: " + result);
    }
}
