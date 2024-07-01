package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.ArrayList;
import java.util.List;

public class EmployeeProcessingImperative {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John Doe", 50000, true),
                new Employee("Jane Smith", 65000, true),
                new Employee("Alice Johnson", 45000, false),
                new Employee("Bob Brown", 54000, true)
        );

        List<Employee> filtered = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.isActive && employee.salary > 50000) {
                employee.salary *= 1.1;  // Increase salary by 10%
                filtered.add(employee);
            }
        }

        List<String> names = new ArrayList<>();
        for (Employee employee : filtered) {
            names.add(employee.name);
        }

        System.out.println("Filtered and Updated Employees:");
        for (Employee employee : filtered) {
            System.out.println(employee.name + " - $" + employee.salary);
        }

        System.out.println("Total number of filtered employees: " + filtered.size());
    }
}