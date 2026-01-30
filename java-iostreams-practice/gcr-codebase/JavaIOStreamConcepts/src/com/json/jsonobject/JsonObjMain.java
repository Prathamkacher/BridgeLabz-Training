package com.json.jsonobject;

import com.google.gson.Gson;
import java.io.FileReader;

public class JsonObjMain {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();
        FileReader reader = new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\jsonobject\\student.json");

        Student student = gson.fromJson(reader, Student.class);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSubjects());
    }
}
