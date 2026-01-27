package com.regexandjunit.junit.test;

import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.testpasswordstrength.PasswordValidator;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("JavaTest1"));
    }

    @Test
    void testTooShortPassword() {
        assertFalse(validator.isValid("J1ava"));
    }

    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("javatest1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("JavaTest"));
    }
}
