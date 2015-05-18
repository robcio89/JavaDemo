package com.robert;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Employees\n\n");

        Manager boss = new Manager("Adam Nowak", 45000, 2013, 12, 06);
        boss.setBonus(12000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Piotr Kwiatkowski", 36000, 2014, 2, 26);
        staff[2] = new Employee("Anna Nowak", 36000, 2015, 1, 21);

        for (Employee e: staff)
        {
            System.out.println("Name: " + e.getName() + ", salary: " + e.getSalary());
        }
    }
}
