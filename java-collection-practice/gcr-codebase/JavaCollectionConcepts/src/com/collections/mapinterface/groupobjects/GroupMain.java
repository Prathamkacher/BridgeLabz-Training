package com.collections.mapinterface.groupobjects;

import java.util.*;

public class GroupMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : employees) {

            if (!map.containsKey(e.department)) {
                map.put(e.department, new ArrayList<>());
            }

            map.get(e.department).add(e);
        }

        System.out.println("HR: " + map.get("HR"));
        System.out.println("IT: " + map.get("IT"));
    }
}
