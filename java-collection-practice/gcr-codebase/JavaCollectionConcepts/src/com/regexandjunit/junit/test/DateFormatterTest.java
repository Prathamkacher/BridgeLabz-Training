package com.regexandjunit.junit.test;

import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.testdateformatter.DateFormatter;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("26-01-2026", formatter.formatDate("2026-01-26"));
    }

    @Test
    void testAnotherValidDate() {
        assertEquals("01-12-2025", formatter.formatDate("2025-12-01"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("26/01/2026");
        });
    }

    @Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2026-13-40");
        });
    }
}
