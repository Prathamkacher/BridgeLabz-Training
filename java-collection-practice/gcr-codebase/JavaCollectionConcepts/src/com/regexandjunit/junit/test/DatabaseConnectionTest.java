package com.regexandjunit.junit.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.testingannotations.DatabaseConnection;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();  // runs before each test
    }

    @AfterEach
    void tearDown() {
        db.disconnect();  // runs after each test
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(db.isConnected());
    }

    @Test
    void testConnectionIsClosedAfterDisconnect() {
        db.disconnect();
        assertFalse(db.isConnected());
    }
}
