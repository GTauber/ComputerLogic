package com.week3and4.tauber.main;

import com.week3and4.tauber.model.People;
import com.week3and4.tauber.model.Student;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(JOptionPane.showInputDialog(null, "What is your\n" +
                "name?" , JOptionPane.QUESTION_MESSAGE));
        student.setLastName(JOptionPane.showInputDialog(null, "What is your\n" +
                "last name?" , JOptionPane.QUESTION_MESSAGE));

        student.setCourse(JOptionPane.showInputDialog(null, "What course are " +
                "you doing?" , JOptionPane.QUESTION_MESSAGE));
        student.getExams().add(JOptionPane.showInputDialog(null, "What were your" +
                "grade at first exam? 0-100" , JOptionPane.QUESTION_MESSAGE));
        student.getExams().add(JOptionPane.showInputDialog(null, "What were your" +
                "grade at Second exam? 0-100" , JOptionPane.QUESTION_MESSAGE));
        student.getExams().add(JOptionPane.showInputDialog(null, "What were your" +
                "grade at third exam? 0-100" , JOptionPane.QUESTION_MESSAGE));

        student.setMedia(((Integer)student.getExams().get(0) + (Integer)student.getExams().get(1)
        + (Integer)student.getExams().get(2) + (Integer)student.getExams().get(3)) / 2);

        if(student.getMedia() >= 70) student.setApproved(true);
        else student.setApproved(false);

        System.out.println("Student: " + student.getName() + " " + student.getLastName() +
                "from the course " + student.getCourse() + " And his is ");
        System.out.println(student.getApproved() ? "Approved!!" : "");

    }
}
