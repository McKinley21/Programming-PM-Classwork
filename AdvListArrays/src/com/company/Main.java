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
            if (command.equals("change section")) {//change section
                System.out.println("Enter Section Name:");
                String sectionName = console.nextLine();
                boolean currentSection = Gradebook.changeSection(sectionName);
                if (currentSection = true){
                    System.out.println("Current Section: " + sectionName);
                }
                continue;
            }else if (command.equals("add section")) {//add section
                System.out.println("Enter new section name:");
                String sectionName = console.nextLine();
                boolean newSection = Gradebook.addSection(sectionName);
                if (newSection = true){
                    System.out.println(sectionName + " has been added.");
                }
                continue;
            }else if (command.equals("add student")){//add student
                String currentSection = Gradebook.getCurrentSectionName();
                System.out.println("Enter the Student's First Name:");
                String firstName = console.nextLine();
                System.out.println("Enter the Student's Last Name:");
                String lastName = console.nextLine();
                System.out.println("Enter the Student's Username:");
                String username = console.nextLine();
                System.out.println("Enter the Student's Phone Number:");
                long phoneNumber = Long.parseLong(console.nextLine());
                boolean addStudent = Gradebook.addStudent(firstName, lastName, username, phoneNumber);
                if (addStudent = true){
                    System.out.println(firstName + " " + lastName + " has been added to " + currentSection + ".");
                }
                continue;
            }else if (command.equals("add assignment to student")) {//add assignment to student
                System.out.println("Enter Student Username:");
                String username = console.nextLine();
                System.out.println("Enter Assignment Name:");
                String assignmentName = console.nextLine();
                System.out.println("Enter Max Amount of Points Possible:");
                int pointsPossible = Integer.parseInt(console.nextLine());
                boolean addAssignmentToStudent = Gradebook.addAssignmentToStudent(username,assignmentName,pointsPossible);
                if (addAssignmentToStudent = true){
                    System.out.println(username + " has a new assignment: " + assignmentName);
                }
                continue;
            }else if (command.equals("add assignment to section")) {//add assignment to section
                System.out.println("Enter Section Name:");
                String sectionName = console.nextLine();
                System.out.println("Enter Assignment Name:");
                String assignmentName = console.nextLine();
                System.out.println("Enter Max Amount of Points Possible:");
                int pointsPossible = Integer.parseInt(console.nextLine());
                boolean addAssignmentToSection;//FIXME
                if (addAssignmentToSection = true){
                    System.out.println( sectionName + " has a new assignment: " + assignmentName);
                }
                continue;
            }else if (command.equals("set score")) {//set score
                System.out.println("Enter Student Username:");
                String username = console.nextLine();
                System.out.println("Enter Assignment Name:");
                String assignmentName = console.nextLine();
                System.out.println("Enter Points Earned:");
                int pointsEarned = Integer.parseInt(console.nextLine());
                boolean setScore = Gradebook.setScore(username,assignmentName,pointsEarned);
                if (setScore = true){
                    System.out.println(username + "'s " + assignmentName + " has been graded: " + pointsEarned + "/" + "GET_POINTS_POSSIBLE");//FIXME
                }
            }else if (command.equals("mark tardy")) {//mark tardy
                System.out.println("Enter Student Username:");
                String username = console.nextLine();
                boolean markTardy = Gradebook.markTardy(username);
                if (markTardy = true){
                    System.out.println(username + " has been marked tardy.");
                }
                continue;
            }else if (command.equals("mark absent")) {//mark absent
                System.out.println("Enter Student Username:");
                String username = console.nextLine();
                boolean markAbsent = Gradebook.markAbsent(username);
                if (markAbsent = true){
                    System.out.println(username + " has been marked absent.");
                }
                continue;
            }
            //get overall score
            //get overall score avg
            //get assignment score
            //get assignment score avg
            else if (command.equals("get tardy count")) {//get tardy count
                System.out.println("Enter Student Username:");
                String username = console.nextLine();
                int getTardyCount = Gradebook.getTardyCount(username);
                if (getTardyCount !=-1){
                    System.out.println(username + "'s tardy count: " + getTardyCount);
                }
                continue;
            } else if (command.equals("get absent count")) {//get absent count
                System.out.println("Enter Student Username:");
                String username = console.nextLine();
                int getAbsentCount = Gradebook.getAbsentCount(username);
                if (getAbsentCount !=-1){
                    System.out.println(username + "'s tardy count: " + getAbsentCount);
                }
                continue;
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