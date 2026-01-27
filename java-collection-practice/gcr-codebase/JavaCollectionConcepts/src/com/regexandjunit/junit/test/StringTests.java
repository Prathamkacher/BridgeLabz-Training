package com.regexandjunit.junit.test;

import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.teststringmethods.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

public class StringTests {

    @Test
    void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("madam", StringUtils.reverse("madam"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("JAVA", StringUtils.toUpperCase("java"));
    }
}
