package igor.javoviny;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    // instance fields of Employee class
    private final String name;
    private double salary;
    private final LocalDate hireDay;

    private static int nextId = 1;
    private int id;

    // Employee constructor
    public Employee(String n, double s, int year, int month, int day) {
        Objects.requireNonNull(n, "The name cannot be null");   // secures that n != NULL
        // similar logic to the line above -> if (n == null) this.name = "unknown"; else this.name = n;
        this.name = n;
        this.salary = s;
        this.hireDay = LocalDate.of(year, month, day);
    }

    // accessor methods of Employee class
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public int getId() {
        return id;
    }

    // method that raises salary by 'byPercent'%
    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    // unit tester
    public static void main(String[] args) {
        Employee e = new Employee("Harry", 50000, 2000, 7, 14);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}