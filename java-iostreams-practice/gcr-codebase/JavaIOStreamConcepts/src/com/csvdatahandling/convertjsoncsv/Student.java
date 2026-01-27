package com.csvdatahandling.convertjsoncsv;

public class Student {
    int id;
    String name;
    int age;
    int marks;

    Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    String toCSV() {
        return id + "," + name + "," + age + "," + marks;
    }

    String toJSON() {
        return "{\"id\":" + id +
               ",\"name\":\"" + name +
               "\",\"age\":" + age +
               ",\"marks\":" + marks + "}";
    }
}
