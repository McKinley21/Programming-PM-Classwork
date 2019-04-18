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
            System.out.println("get overall score avg");//10
            System.out.println("get assignment score");//11
            System.out.println("get assignment score avg");//12
            System.out.println("get tardy count");//13
            System.out.println("get absent count");//14
            String command = console.nextLine();
            if (command.equals("change section")) {//change section
                System.out.println("Enter Section Name:");
                String sectionName = console.nextLine();
                int currentSection = Gradebook.changeSection(sectionName);
                if (currentSection == 1){//true
                    System.out.println("Current Section: " + sectionName);
                }
                else if (currentSection == 0){//false
                    System.out.println(sectionName + " is already active.");
                }
                else if (currentSection == -1){//false
                    System.out.println("Section Not Found.");
                }
                continue;
            }
            else if (command.equals("add section")) {//add section
                System.out.println("Enter new section name:");
                String sectionName = console.nextLine();
                int newSection = Gradebook.addSection(sectionName);
                if (newSection == 1){//true
                    System.out.println(sectionName + " has been added.");
                }
                else if (newSection == 0){//false
                    System.out.println(sectionName + " cannot be added(There are already 6 sections added).");
                }
                else if (newSection == -1){//false
                    System.out.println(sectionName + " is already added.");
                }
                continue;
            }
            else if (command.equals("add student")){//add student
                String currentSection = Gradebook.getCurrentSectionName();
                while (true) {
                    System.out.println("Enter the Student's First Name:");
                    String firstName = console.nextLine();
                    if (firstName.contains("0") || firstName.contains("1") || firstName.contains("2") || firstName.contains("3") || firstName.contains("4") || firstName.contains("5") || firstName.contains("6") || firstName.contains("7") || firstName.contains("8") || firstName.contains("9")) {//if first name contains numbers
                        System.out.println("First Name can't include numbers.");
                        continue;
                    }
                    else {
                        while (true) {
                            System.out.println("Enter the Student's Last Name:");
                            String lastName = console.nextLine();
                            if (lastName.contains("0") || lastName.contains("1") || lastName.contains("2") || lastName.contains("3") || lastName.contains("4") || lastName.contains("5") || lastName.contains("6") || lastName.contains("7") || lastName.contains("8") || lastName.contains("9")) {//if last name contains numbers
                                System.out.println("Last Name can't include numbers.");
                                continue;
                            } else {
                                System.out.println("Enter the Student's Username:");
                                String username = console.nextLine();
                                while (true) {
                                    System.out.println("Enter the Student's Phone Number:");
                                    try {
                                        long phoneNumber = Long.parseLong(console.nextLine());
                                        int length = String.valueOf(phoneNumber).length();
                                        if (length < 10){
                                            System.out.println("Phone Number can't have less than 10 digits.");
                                            continue;
                                        }
                                        else if (length > 10){
                                            System.out.println("Phone Number can't have more than 10 digits.");
                                            continue;
                                        }
                                        else if (length == 10) {
                                            int addStudent = Gradebook.addStudent(firstName, lastName, username, phoneNumber);
                                            if (addStudent == 1) {//true
                                                System.out.println(firstName + " " + lastName + " has been added to " + currentSection + ".");
                                            } else if (addStudent == 0) {//false
                                                System.out.println("Can't add student(There are 0 sections to add them to).");
                                            } else if (addStudent == -1) {//false
                                                System.out.println("The entered Username, " + username + ", is already used.");
                                            }
                                        }
                                    } catch (NumberFormatException wordsSymbols) {
                                        System.out.println("Phone Number can't include words and symbols.");
                                        continue;
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }

            }
            else if (command.equals("add assignment to student")) {//add assignment to student
                System.out.println("Enter Student Username:");
                String username = console.nextLine();
                System.out.println("Enter Assignment Name:");
                String assignmentName = console.nextLine();
                while (true) {
                    System.out.println("Enter Max Amount of Points Possible:");
                    try {
                        int pointsPossible = Integer.parseInt(console.nextLine());
                        if (pointsPossible < 0){
                            System.out.println("Invalid Amount of Points Possible.");
                            continue;
                        }
                        else if (pointsPossible > 0){
                            int addAssignmentToStudent = Gradebook.addAssignmentToStudent(username, assignmentName, pointsPossible);
                            if (addAssignmentToStudent == 1) {//true
                                System.out.println(username + " has a new assignment: " + assignmentName);
                            } else if (addAssignmentToStudent == 0) {//false
                                System.out.println("Can't add assignment(" + username + " not found).");
                            }else if (addAssignmentToStudent == -1){//false
                                System.out.println(assignmentName + " is already added to " + username + ".");
                            }
                        }
                    } catch (NumberFormatException words) {
                        System.out.println("Invalid Amount of Points Possible.");
                        continue;
                    }
                    break;
                }
            }
            else if (command.equals("add assignment to section")) {//add assignment to section
                System.out.println("Enter Section Name:");
                String sectionName = console.nextLine();
                System.out.println("Enter Assignment Name:");
                String assignmentName = console.nextLine();
                while (true) {
                    System.out.println("Enter Max Amount of Points Possible:");
                    try {
                        int pointsPossible = Integer.parseInt(console.nextLine());
                        if (pointsPossible < 0){
                            System.out.println("Invalid Amount of Points Possible.");
                            continue;
                        }
                        else if (pointsPossible > 0) {
                            int addAssignmentToSection = Gradebook.addAssignmentToSection(assignmentName, pointsPossible);
                            if (addAssignmentToSection == 1) {//true
                                System.out.println(sectionName + " has a new assignment: " + assignmentName);
                            } else if (addAssignmentToSection == 0) {//false
                                System.out.println("Can't add assignment(" + sectionName + " not found).");
                            }else if (addAssignmentToSection == -1){//false
                                System.out.println(assignmentName + " is already added to " + sectionName + ".");
                            }else if (addAssignmentToSection == -2) {//false
                                System.out.println("Can't add assignment(There are 0 students in " + sectionName + " to add it to).");
                            }
                        }
                    } catch (NumberFormatException words) {
                        System.out.println("Invalid Amount of Points Possible.");
                        continue;
                    }
                    break;
                }
            }
            else if (command.equals("set score")) {//set score
                System.out.println("Enter Student Username:");
                String username = console.nextLine();
                System.out.println("Enter Assignment Name:");
                String assignmentName = console.nextLine();
                while (true) {
                    System.out.println("Enter Points Earned:");
                    try {
                        int pointsEarned = Integer.parseInt(console.nextLine());
                        if (pointsEarned < 0) {
                            System.out.println("Invalid Amount of Points Earned.");
                            continue;
                        } else if (pointsEarned > 0) {
                            int setScore = Gradebook.setScore(username, assignmentName, pointsEarned);
                            if (setScore == 1) {//true
                                System.out.println(username + "'s " + assignmentName + " has been graded.");
                                break;
                            } else if (setScore == 0) {//false
                                System.out.println(username + " has 0 assignments.");
                                break;
                            } else if (setScore == -1) {//false
                                System.out.println(username + " not found.");
                                break;
                            } else if (setScore == -2) {//false
                                System.out.println(assignmentName + " not found.");
                                break;
                            } else if (setScore == -3) {//false
                                System.out.println("Invalid Amount of Points Earned.");
                                continue;
                            }
                        }
                    } catch (NumberFormatException words) {
                        System.out.println("Invalid Amount of Points Earned.");
                        continue;
                    }
                }
            }
            else if (command.equals("mark tardy")) {//mark tardy
                while (true) {
                    System.out.println("Enter Student Username:");
                    String username = console.nextLine();
                    int markTardy = Gradebook.markTardy(username);
                    if (markTardy == 1) {//true
                        System.out.println(username + " has been marked tardy.");
                        break;
                    } else if (markTardy == 0) {//false
                        System.out.println("Can't mark a student tardy(There are 0 students to add it to).");
                        break;
                    } else if (markTardy == -1) {//false
                        System.out.println(username + " not found.");
                        continue;
                    }
                }
                continue;
            }
            else if (command.equals("mark absent")) {//mark absent
                while (true) {
                    System.out.println("Enter Student Username:");
                    String username = console.nextLine();
                    int markAbsent = Gradebook.markAbsent(username);
                    if (markAbsent == 1) {//true
                        System.out.println(username + " has been marked absent.");
                        break;
                    } else if (markAbsent == 0) {//false
                        System.out.println("Can't mark a student absent(There are 0 students to add it to).");
                        break;
                    } else if (markAbsent == -1) {//false
                        System.out.println(username + " not found.");
                        continue;
                    }
                }
                continue;
            }
            else if (command.equals("get overall score")) {//get overall score
                while (true) {
                    System.out.println("Enter Student Username:");
                    String username = console.nextLine();
                    int getOverallScore = Gradebook.getOverallScore(username);
                    if (getOverallScore == 1) {//true
                        break;
                    }
                    else if (getOverallScore == 0) {//false
                        System.out.println("Can't get overall score(There are 0 students to search for).");
                        break;
                    } else if (getOverallScore == -1) {//false
                        System.out.println(username + " not found.");
                        continue;
                    }
                }
                continue;
            }
            else if (command.equals("get overall score avg")) {//get overall score avg
                while (true) {
                    System.out.println("Enter Section Name:");
                    String sectionName = console.nextLine();
                    int getOverallScoreAvg = Gradebook.getOverallScoreAvg(sectionName);
                    if (getOverallScoreAvg == 1) {//true
                        break;
                    } else if (getOverallScoreAvg == 0) {//false
                        System.out.println("Can't get overall score avg(There are 0 sections to search for).");
                        break;
                    } else if (getOverallScoreAvg == -1) {//false
                        System.out.println(sectionName + " not found.");
                        continue;
                    }
                }
                continue;
            }
            else if (command.equals("get assignment score")) {//get assignment score
                System.out.println("Enter Student Username:");
                String username = console.nextLine();
                while (true) {
                    System.out.println("Enter Assignment Name:");
                    String assignmentName = console.nextLine();
                    int getAssignmentScorePercent = Gradebook.getAssignmentScorePercent(username, assignmentName);
                    if (getAssignmentScorePercent == 1) {//true
                        break;
                    } else if (getAssignmentScorePercent == 0) {//false
                        System.out.println("Can't get assignment score(There are 0 assignments to get it from).");
                        break;
                    } else if (getAssignmentScorePercent == -1) {//false
                        System.out.println(username + " not found.");
                        break;
                    } else if (getAssignmentScorePercent == -2) {//false
                        System.out.println(assignmentName + " not found.");
                        continue;
                    } else if (getAssignmentScorePercent == -3) {//false
                        System.out.println("(" + username + "'s " + assignmentName + " may not have been scored.)");
                        break;
                    }
                }
                continue;
            }
            else if (command.equals("get assignment score avg")) {//get assignment score avg
                System.out.println("Enter Section Name:");
                String sectionName = console.nextLine();
                while (true) {
                    System.out.println("Enter Assignment Name:");
                    String assignmentName = console.nextLine();
                    int getAssignmentScoreAvg = Gradebook.getAssignmentScoreAvg(sectionName,assignmentName);
                    if (getAssignmentScoreAvg == 1) {//true
                        break;
                    } else if (getAssignmentScoreAvg == 0) {//false
                        System.out.println("Can't get assignment score(There are 0 assignments to get it from).");
                        break;
                    } else if (getAssignmentScoreAvg == -1) {//false
                        System.out.println(sectionName + " not found.");
                        break;
                    } else if (getAssignmentScoreAvg == -2) {//false
                        System.out.println(assignmentName + " not found.");
                        continue;
                    } else if (getAssignmentScoreAvg == -3) {//false
                        System.out.println("(" + sectionName + "'s " + assignmentName + " may not have been scored.)");
                        break;
                    }
                }
                continue;
            }
            else if (command.equals("get tardy count")) {//get tardy count
                while (true) {
                    System.out.println("Enter Student Username:");
                    String username = console.nextLine();
                    int getTardyCount = Gradebook.getTardyCount(username);
                    if (getTardyCount > -1) {
                        System.out.println(username + "'s tardy count: " + getTardyCount);
                        break;
                    } else if (getTardyCount == -1) {
                        System.out.println("Can't get a student's tardy count(There are 0 students to get it from).");
                        break;
                    } else if (getTardyCount == -2) {
                        System.out.println(username + " not found.");
                        continue;
                    }
                }
                continue;
            }
            else if (command.equals("get absent count")) {//get absent count
                while (true) {
                    System.out.println("Enter Student Username:");
                    String username = console.nextLine();
                    int getAbsentCount = Gradebook.getAbsentCount(username);
                    if (getAbsentCount > -1) {
                        System.out.println(username + "'s tardy count: " + getAbsentCount);
                        break;
                    } else if (getAbsentCount == -1) {
                        System.out.println("Can't get a student's tardy count(There are 0 students to get it from).");
                        break;
                    } else if (getAbsentCount == -2) {
                        System.out.println(username + " not found.");
                        continue;
                    }
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