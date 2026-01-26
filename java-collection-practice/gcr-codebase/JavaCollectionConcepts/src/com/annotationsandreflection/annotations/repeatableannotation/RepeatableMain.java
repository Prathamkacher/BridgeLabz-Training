package com.annotationsandreflection.annotations.repeatableannotation;

import java.lang.reflect.Method;

public class RepeatableMain {
    public static void main(String[] args) throws Exception {

        BugTracker bt = new BugTracker();

        Method method = bt.getClass().getMethod("process");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}
