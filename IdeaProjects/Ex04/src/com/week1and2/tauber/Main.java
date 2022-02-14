package com.week1and2.tauber;

import com.week1and2.tauber.model.Employee;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    /*
    - Receba o nome, o sobrenome, a idade, o salário e o desconto do funcionário.
    - Exiba a seguinte frase: "O funcionário aaa bbb nasceu em ccc e ganha R$ddd". Onde:
    - aaa é o nome do funcionário e bbb é o sobrenome;
    - ccc é o ano de nascimento do funcionário;
    - ddd é o salário líquido = salário - desconto.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee people = new Employee();
        System.out.println("Whats your name?");
        people.setName(in.nextLine());

        System.out.println("What's your last name?");
        people.setLastName(in.nextLine());

        System.out.println("How old are you?");
        people.setAge(in.nextInt());

        System.out.println("What's your current paycheck?");
        people.setSalary(in.nextInt());

        System.out.println("What's the discount in your salary?");
        people.setDiscount(in.nextInt());

        System.out.println("The Employee " + people.getName() + " " + people.getLastName()
        + " born in " + ((Calendar.getInstance().get(Calendar.YEAR)) - people.getAge()) + " And receives: $ "
        + (people.getSalary() - people.getDiscount()) + "USD");

    }
}
