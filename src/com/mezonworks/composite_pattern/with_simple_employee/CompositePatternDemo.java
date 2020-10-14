package com.mezonworks.composite_pattern.with_simple_employee;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("Azamat", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sales", 20000);

        Employee headMarketing = new Employee("Michael", "Head Marketing", 20000);

        Employee clark1 = new Employee("Laura", "Marketing", 10000);
        Employee clark2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clark1);
        headMarketing.add(clark2);

        // Print all employees of the organisation
        System.out.println(CEO + "\n");

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
            System.out.println();
        }
    }
}
