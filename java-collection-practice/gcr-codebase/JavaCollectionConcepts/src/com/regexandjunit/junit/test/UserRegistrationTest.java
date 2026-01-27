package com.regexandjunit.junit.test;

import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.testuserregestration.UserRegistration;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    UserRegistration reg = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertTrue(reg.registerUser("Aryaman", "aryaman@mail.com", "pass123"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            reg.registerUser("", "user@mail.com", "pass123");
        });
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            reg.registerUser("User", "usermail.com", "pass123");
        });
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            reg.registerUser("User", "user@mail.com", "123");
        });
    }
}
