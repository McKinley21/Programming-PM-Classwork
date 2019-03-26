package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Gradebook Gradebook = new Gradebook();
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("Type one of the following commands:");
            System.out.println("change section");
            System.out.println("add section");
            System.out.println("add student");
            System.out.println("add assignment to student");
            System.out.println("add assignment to section");
            System.out.println("set score");
            System.out.println("mark tardy");
            System.out.println("mark absent");
            System.out.println("get overall score");
            System.out.println("get overall score avg");
            System.out.println("get assignment score");
            System.out.println("get assignment score avg");
            System.out.println("get tardy count");
            System.out.println("get absent count");
            String command = console.nextLine();
            if (command.equals("change section")) {
                //FIXME
            } else if (command.equals("add section")) {
                while (true) {
                    System.out.println("Enter new section name:");
                    String sectionName = console.nextLine();
                    boolean newSection = Gradebook.addSection(sectionName);
                    if (newSection = true) {
                        break;
                    } else if (newSection = false) {
                        continue;//FIXME
                    }
                }
            }
        }
        // The gradebook needs to keep track of different "sections"
        // It should also keep track of what section is currently active ("being viewed")
        // Each section will have a section name to identify it.
        // Each section will have a different set of students.
        // The gradebook needs to keep track of all of the assignments assigned to each student
        // It needs to track the number of points possible, the name of the assignment and the number of points earned by the student for each assignment.
        // It should also track the number of days a student has been absent and number of days tardy
        // It should also track the student's first and last name, student username, and phone number.

        //Classes:
            // 1.Gradebook
            // 2.Sections
            // 3.Students
            // 4.Assignments

        //Methods:
            //changeSection(String sectionName); //sets the currently active section
            //boolean addSection(String sectionName) //creates a new section if there are not already 6 sections and sectionName isn't already used
            //double getOverallScoreAvg(String sectionName) //returns overall score as a percentage for a section
            //boolean addAssignmentToSection(String assignmentName, int pointsPossible) //creates a new assignment for a section
            //double getAssignmentScoreAvg(String assignmentName) //returns score as a percentage for current section
            //boolean addStudent(String firstName, String lastName, string username, long phoneNumber); //creates a new student
            //double getOverallScore(String username) //returns overall score as a percentage for specified student
            //boolean addAssignmentToStudent(String username, String assignmentName, int pointsPossible) //creates a new assignment for a specified student
            //double getAssignmentScorePercent(String username, String assignmentName) //returns score as a percentage for student in current section
            //boolean markTardy(String username) //adds 1 to the students tardy count
            //boolean markAbsent(String username) //adds 1 to the students absent count
            //int getTardyCount(String username)  //returns number of times student was tardy
            //int getAbsentCount(String username) //returns number of times student was absent
            //boolean setScore(String username, String assignmentName, int pointsEarned) //set a score for a specified assignment
    }
}