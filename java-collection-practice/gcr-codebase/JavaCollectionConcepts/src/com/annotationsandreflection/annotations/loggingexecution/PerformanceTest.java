package com.annotationsandreflection.annotations.loggingexecution;

class PerformanceTest {

    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1_000; i++) {
            // small task
        }
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 1_000_000; i++) {
            // bigger task
        }
    }

    public void normalMethod() {
        System.out.println("Not logged");
    }
}
