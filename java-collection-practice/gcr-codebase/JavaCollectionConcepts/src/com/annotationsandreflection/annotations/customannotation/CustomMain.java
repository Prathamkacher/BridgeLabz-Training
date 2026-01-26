package com.annotationsandreflection.annotations.customannotation;

import java.lang.reflect.Method;

public class CustomMain {
    public static void main(String[] args) throws Exception {

        TaskManager tm = new TaskManager();

        Method method = tm.getClass().getMethod("completeTask");

        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        System.out.println("Priority: " + taskInfo.priority());
        System.out.println("Assigned To: " + taskInfo.assignedTo());
    }
}
