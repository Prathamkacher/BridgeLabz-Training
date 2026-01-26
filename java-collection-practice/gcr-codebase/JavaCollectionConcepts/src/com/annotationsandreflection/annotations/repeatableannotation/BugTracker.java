package com.annotationsandreflection.annotations.repeatableannotation;

class BugTracker {

    @BugReport(description = "NullPointerException on login")
    @BugReport(description = "UI breaks on small screens")
    public void process() {
        System.out.println("Processing bugs");
    }
}
