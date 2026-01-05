package MethodOverriding;

import java.util.Scanner;

class Employee {
    public void m1() {
        System.out.println("this is m1 method-- (Employee class)");
    }


    public void calsal() {
        System.out.println("this is calculate salary method (Employee class)");
    }
}

class Manager extends Employee {
    public void m2() { // special method of Manager class
        System.out.println("Manager class m2 method");
    }

    @Override
    public void calsal() {
        System.out.println("Manager class calsal method");
    }
}

class SalesMgr extends Employee {
    public void m3() {
        System.out.println("this is Sales Manager m3 method");
    }

    @Override
    public void calsal() {
        System.out.println("Sales Manager calsal method");
    }
}

public class MenueDrivenRtti {

    public static void display(Employee e1) {
        e1.m1();
        e1.calsal();

        // RTTI - Run Time Type Identification
        if (e1 instanceof Manager)
            ((Manager) e1).m2();

        if (e1 instanceof SalesMgr)
            ((SalesMgr) e1).m3();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = null;

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Employee");
            System.out.println("2. Manager");
            System.out.println("3. Sales Manager");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    e1 = new Employee();
                    display(e1);
                    break;

                case 2:
                    e1 = new Manager();
                    display(e1);
                    break;

                case 3:
                    e1 = new SalesMgr();
                    display(e1);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}
