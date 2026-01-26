package com.annotationsandreflection.annotations.usedepricated;

public class LegacyMain {
    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        api.oldFeature();   // ⚠ Deprecated method
        api.newFeature();   // ✅ Recommended method
    }
}
