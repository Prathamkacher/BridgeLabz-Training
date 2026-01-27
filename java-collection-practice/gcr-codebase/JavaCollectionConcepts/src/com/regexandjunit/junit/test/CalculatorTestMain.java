package com.regexandjunit.junit.test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.testcalculatorclass.Calculator;

public class CalculatorTestMain {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calc.add(6, 4));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calc.subtract(6, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(24, calc.multiply(6, 4));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(8, 4));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });
    }
}