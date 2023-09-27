package com.team1.views;

import java.util.Scanner;

public class Page {

    private static final Scanner scanner = new Scanner(System.in);

    public static int showHomePage() {
        System.out.println("EMPLOYEE MANAGEMENT\n");

        System.out.println("==============================");
        System.out.println("Employee List");
        System.out.println("No | Name | Salary | Department");
        System.out.println("1 | Alfrendo | 12000 | IT ");
        System.out.println("2 | Alfre | 12000 | IT ");
        System.out.println("3 | Al | 12000 | Keuangan ");
        System.out.println("==============================\n");

        System.out.println("1) Create New Employee");
        System.out.println("2) Edit Employee");
        System.out.println("3) Delete Employee");
        System.out.println("4) Create New Department");
        System.out.println("5) Show All Employee By Department");
        System.out.print("> ");
        return scanner.nextInt();
    }

    public static void showPageByOption() {
        int option = showHomePage();

        if (option == 1) {
            // pindah ke page create new employee
            showCreateNewEmployeePage();
        } else if (option == 2) {
            // edit
        } else if (option == 3) {
            // delete
        } else if (option == 4) {
            // new department
        } else if (option == 5) {
            // employee by department
        }
    }

    public static void showCreateNewEmployeePage() {

        System.out.println("Create New Employee\n");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Salary: ");
        int salary = scanner.nextInt();

        System.out.println("Available Department");

    }

}
