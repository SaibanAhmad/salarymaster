package com.loveablejerk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter Employee's Name: ");
        String employeeName = new Scanner(System.in).next();

        System.out.println("What is your Basic Monthly Salary: ");
        int basicSalary = new Scanner(System.in).nextInt();

        System.out.println("how many sales did you made in this month: ");
        int salesMade = new Scanner(System.in).nextInt();


        Employee myEmployee = new Employee(employeeName,basicSalary,salesMade);

    }
}
