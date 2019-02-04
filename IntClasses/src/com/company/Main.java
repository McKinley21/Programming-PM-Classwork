package com.company;

public class Main {

    public static void main(String[] args) {
        //Test
        Student TestStudent = new Student();
        System.out.print("TestStudent's Overall Grade: ");
        TestStudent.printGrade();

        Student Joe = new Student("Joe", 1, 16);
        Joe.SetContentGrade(100);
        Joe.SetWorkHabitGrade(50);
        Joe.SetParticipation(70);
        System.out.print("Joe's Overall Grade: ");
        Joe.printGrade();
    }
}
