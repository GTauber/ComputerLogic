package com.week1and2.tauber;

import com.week1and2.tauber.model.People;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String date = JOptionPane.showInputDialog(null, "What is your\n" +
                        "birthdate? use \"/\" to divide month, day, year.\n" +
                "example: mm/dd/yyyy", JOptionPane.QUESTION_MESSAGE);

        People p = new People(Integer.parseInt(date.split("/")[0]),
                Integer.parseInt( date.split("/")[1]),
                Integer.parseInt(date.split("/")[2]));


        System.out.println(p.convertAgeToDays(p));
    }
}
