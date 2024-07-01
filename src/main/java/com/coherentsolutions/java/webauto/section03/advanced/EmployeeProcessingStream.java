package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeProcessingStream {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John Doe", 50000, true),
                new Employee("Jane Smith", 65000, true),
                new Employee("Alice Johnson", 45000, false),
                new Employee("Bob Brown", 54000, true)
        );

        List<Employee> processed = employees.stream()
                .filter(e -> e.isActive && e.salary > 50000)
                .peek(e -> e.salary *= 1.1)  // Increase salary by 10%
                .collect(Collectors.toList());

        System.out.println("Filtered and Updated Employees:");
        processed.forEach(e -> System.out.println(e.name + " - $" + e.salary));

        System.out.println("Total number of filtered employees: " + processed.size());
    }
}