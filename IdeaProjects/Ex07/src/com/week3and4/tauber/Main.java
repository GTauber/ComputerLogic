package com.week3and4.tauber;

import com.week3and4.tauber.model.Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner in = new Scanner(System.in);
        System.out.println("Whats your name?");
        emp.setName(in.nextLine());
        System.out.println("What company you work for?");
        emp.setCompany(in.nextLine());
        System.out.println("What is your salary?");
        emp.setSalary(in.nextDouble());
        emp.calcDeduction(emp.getSalary());
        System.out.println("Your current deduction is: " + emp.getDeduction());
    }
}
