package com.company;

import java.util.ArrayList;

/**
 * Created by mh6900 on 2/20/2019.
 */
public class Students {
    //Properties:
    private ArrayList<Assignments> Assignments;// Assignments (List)
    //create Assignments class
    private String firstName;// firstName (String)
    private String lastName;// lastName (String)
    private String username;// username (String)
    private long phoneNumber;// phoneNumber (long)
    private int daysAbsent;//daysAbsent (int)
    private int daysTardy;//daysTardy (int)

    //Constructors:
    public Students(String firstName, String lastName, String username, long phoneNumber) {
        this.firstName = firstName;//set firstName
        this.lastName = lastName;//set lastName
        this.username = username;//set username
        this.phoneNumber = phoneNumber;//set phoneNumber
        daysAbsent = 0;//set daysAbsent as 0
        daysTardy = 0;//set daysTardy as 0
        Assignments = new ArrayList<>();//create space for assignments to be added to
    }

    //Methods:
    //add assignment to student:
    public boolean addAssignmentToStudent(String assignmentName, int pointsPossible) {
        int assignmentIndex = getAssignmentIndexByAssignmentName(assignmentName);
        if (assignmentIndex != -1) {//if assignment exists...
            return false;//return false
        } else {//else...
            return Assignments.add(new Assignments(assignmentName, pointsPossible));//create new assignment and add to assignments list
        }
    }

    //set score:
    public int setScore(String assignmentName, int pointsEarned) {
        int assignmentIndex = getAssignmentIndexByAssignmentName(assignmentName);
        if (assignmentIndex != -1) {//if assignment exists...
            Assignments currAssignment = Assignments.get(assignmentIndex);
            return currAssignment.setScore(currAssignment, pointsEarned);//sets the score for the specified assignment
        } else {//else...
            return -2;//return -2 false
        }
    }

    //mark tardy:
    public void markTardy() {
        daysTardy++;//marks a student tardy
    }

    //mark absent:
    public void markAbsent() {
        daysAbsent++;//marks a student absent
    }

    //get overall score:
    public double getOverallScore(Students currStudent) {
        double overallScore = 0;
        int assignmentIndex = 0;
        if (Assignments.size() == 0) {
            overallScore = 100;
            return overallScore;
        } else if (Assignments.size() == 1) {
            Assignments currAssignment = currStudent.Assignments.get(0);
            overallScore = (currAssignment.getAssignmentScorePercent(currAssignment));
            return overallScore;
        }
        while (assignmentIndex < currStudent.Assignments.size()) {
            Assignments currAssignment = currStudent.Assignments.get(assignmentIndex);
            double currAssignmentPercent = currAssignment.getAssignmentScorePercent(currAssignment);
            overallScore = overallScore + currAssignmentPercent;
            assignmentIndex++;
        }
        overallScore = (overallScore / Assignments.size());
        return overallScore;
    }

    //get assignment score:
    public double getAssignmentScorePercent(String assignmentName) {
        if (Assignments.size() == 0){
            return -5;
        }
        int assignmentIndex = getAssignmentIndexByAssignmentName(assignmentName);
        if (assignmentIndex != -1) {//if assignment exists...
            Assignments currAssignment = Assignments.get(assignmentIndex);
            return currAssignment.getAssignmentScorePercent(currAssignment);//sets the score for the specified assignment
        } else {//else...
            return -2;//return -2 if false
        }
    }

    //get tardy count:
    public int getDaysTardy() {
        return daysTardy;//gets a student's tardy count
    }

    //get absent count:
    public int getDaysAbsent() {
        return daysAbsent;//gets a student's absent count
    }

    //other methods:
    private int getAssignmentIndexByAssignmentName(String assignmentName) {//search if given assignmentName is used already
        int index = 0;
        while (index < Assignments.size()) {
            if (assignmentName.equalsIgnoreCase(Assignments.get(index).getAssignmentName())) {//if a assignment is found with the given assignmentName...
                return index;//return the found index
            }
            index++;
        }
        //if no assignment found with the given assignmentName...
        return -1;//return -1
    }

    public String getUsername() {
        return username;
    }
}