package com.annotationsandreflection.annotations.supressunchecked;

import java.util.ArrayList;

public class ArrayMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayData ds = new ArrayData();

        ArrayList data = ds.getData();   // unchecked assignment warning suppressed
        System.out.println(data);
    }
}
