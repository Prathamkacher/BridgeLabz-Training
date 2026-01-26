package com.annotationsandreflection.annotations.todoannotation;

class ProjectTasks {

    @Todo(
        task = "Implement login feature",
        assignedTo = "Pratham",
        priority = "HIGH"
    )
    public void loginFeature() {
        System.out.println("Login feature");
    }

    @Todo(
        task = "Add payment integration",
        assignedTo = "Krishna"
    )
    public void paymentFeature() {
        System.out.println("Payment feature");
    }

    public void completedFeature() {
        System.out.println("Already completed");
    }
}
