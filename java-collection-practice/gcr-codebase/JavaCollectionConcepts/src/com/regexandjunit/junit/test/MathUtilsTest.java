package com.regexandjunit.junit.test;

import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.testexception.MathUtils;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils math = new MathUtils();

    @Test
    void testDivideNormal() {
        assertEquals(5, math.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        ArithmeticException exception =
                assertThrows(ArithmeticException.class, () -> {
                    math.divide(10, 0);
                });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
