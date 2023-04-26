package org.example;

import org.apache.commons.lang3.StringUtils;

public class Employee {
    protected String name;
    protected String surname;
    private int department;
    private double salary;
    private static int total;
    private int id;

    public Employee(String name, String surname, int department, double salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        id = ++total;
    }

    public boolean checkSymbols() {
        if (!name.matches("\\w+") | !surname.matches("\\w+")) {
            System.out.println("Используются некорректные символы");
            return false;
        }
        return true;
    }
/*    public String checkName() {
        StringUtils.capitalize(name);
        return name;
    }*/
/*    public String checkSurname() {
        StringUtils.capitalize(surname);
        return surname;
    }*/

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public double getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ФИО работника: " + getName() + " " + getSurname() + ", отдел: " + getDepartment() + ", з/п: " + getSalary() + ", id:  " + getId();
    }
}
