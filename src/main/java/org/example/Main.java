package org.example;

import org.apache.commons.lang3.StringUtils;
import org.example.Exception.BadRequestException;

public class Main {
    static Employee[] employeeBook = new Employee[10];

    public static void main(String[] args) {
        employeeBook[0] = new Employee("любовь","иванова", 1, 35_000);
        employeeBook[1] = new Employee("иван","петров", 2, 43_000);
        employeeBook[2] = new Employee("павел","смирнов", 3, 50_000);
        employeeBook[4] = new Employee("артем","зайцев", 5, 80_000);
        employeeBook[3] = new Employee("мария","потапова", 4, 60_000);
        employeeBook[5] = new Employee("алена", "сидорова", 1, 120_000);
        employeeBook[6] = new Employee( "света", "миронова", 2, 45_000);
        employeeBook[7] = new Employee("максим","лапшин", 3, 80_000);
        employeeBook[8] = new Employee("дарья","волкова", 4, 65_000);
        employeeBook[9] = new Employee("михаил","ивакин", 5, 90_000);

        for (int i = 0; i < employeeBook.length; i++) {
            if (StringUtils.isEmpty(employeeBook[i].name) | StringUtils.isEmpty(employeeBook[i].surname) ) {
                throw new BadRequestException("Поля не могут быть пустыми");
            }
            employeeBook[i].name = StringUtils.capitalize(employeeBook[i].name);
            employeeBook[i].surname = StringUtils.capitalize(employeeBook[i].surname);
            employeeBook[i].checkSymbols();
            System.out.println(employeeBook[i]);
        }
    }
}