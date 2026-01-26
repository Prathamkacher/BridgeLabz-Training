package com.annotationsandreflection.annotations.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)   // needed for reflection
@Target(ElementType.METHOD)            // annotation can be used on methods
@interface TaskInfo {

    int priority();
    String assignedTo();
}
