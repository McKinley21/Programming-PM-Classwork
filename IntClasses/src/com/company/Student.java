package com.company;

/**
 * Created by mh6900 on 2/4/2019.
 */
public class Student {
    //properties
    int studentID;
    String name;
    double contentGrade;
    double workHabitGrade;
    double participation;
    int age;

    //constructors
    public Student(String Name, int ID, int Age) {
        name = Name;
        studentID = ID;
        age = Age;
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;
    }

    public Student() {
        name = "TestStudent";
        studentID = -1;
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;
        age = 18;
    }

    //methods
    public void SetContentGrade(int grade) {
        contentGrade = grade;
    }
    public void SetWorkHabitGrade(int grade) {
        workHabitGrade = grade;
    }
    public void SetParticipation(int grade) {
        participation = grade;
    }
    public double GetGrade() {
        double overallGrade = .35 * workHabitGrade + .4 * contentGrade + .25 * participation;
        return overallGrade;
    }
    public void printGrade() {
        double overallGrade = GetGrade();
        System.out.println(overallGrade);
    }
}