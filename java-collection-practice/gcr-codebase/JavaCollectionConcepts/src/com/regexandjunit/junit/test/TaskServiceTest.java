package com.regexandjunit.junit.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.regexandjunit.junit.performancetesting.TaskService;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    TaskService service = new TaskService();

    @Test
    @Timeout(2)  // Test fails if execution takes more than 2 seconds
    void testLongRunningTask() throws InterruptedException {
        String result = service.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
