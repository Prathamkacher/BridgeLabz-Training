package com.annotationsandreflection.annotations.usedepricated;

public class LegacyAPI {

    @Deprecated
    void oldFeature() {
        System.out.println("Old feature is running");
    }

    void newFeature() {
        System.out.println("New feature is running");
    }
}
