package com.annotationsandreflection.annotations.customannotation;

class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Aryaman")
    public void completeTask() {
        System.out.println("Task completed");
    }
}
