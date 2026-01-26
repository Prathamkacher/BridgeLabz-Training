package com.annotationsandreflection.annotations.supressunchecked;

import java.util.ArrayList;

public class ArrayData {

    ArrayList getData() {     // raw type returned
        ArrayList list = new ArrayList();
        list.add(100);
        list.add("Java");
        list.add(5.5);
        return list;
    }
}
