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
                    Assignments.add(new Assignments(assignmentName, pointsPossible));//create new assignment and add to assignments list
                    return true;//return true
                }
            }
        //set score:
            public boolean setScore(String assignmentName, int pointsEarned){
                int assignmentIndex = getAssignmentIndexByAssignmentName(assignmentName);
                if (assignmentIndex != -1) {//if assignment doesn't exists...
                    return false;//return false
                } else {//else...
                    Assignments searchedAssignment = Assignments.get(assignmentIndex);
                    boolean retVal = searchedAssignment.setScore(searchedAssignment,pointsEarned);
                    return retVal;//return retVal
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
            public double getOverallScore(Students currStudent){
                double overallScore = 0;
                int assignmentIndex = 0;
                while (assignmentIndex < currStudent.Assignments.size()){
                    Assignments currAssignment = currStudent.Assignments.get(assignmentIndex);
                    double currAssignmentPercent = currAssignment.getAssignmentScorePercent(currAssignment);
                    overallScore = overallScore + currAssignmentPercent;
                    assignmentIndex++;
                }
                overallScore = overallScore/(assignmentIndex+1);
                return overallScore;
            }
        //get assignment score:
            public boolean getAssignmentScorePercent(String username, String assignmentName){
                int assignmentIndex = getAssignmentIndexByAssignmentName(assignmentName);
                if (assignmentIndex != -1) {//if assignment doesn't exists...
                    return false;//return false
                } else {//else...
                    Assignments searchedAssignment = Assignments.get(assignmentIndex);
                    double scorePercent = (searchedAssignment.getAssignmentScorePercent(searchedAssignment))*100;
                    System.out.println(username + "'s " + assignmentName + " score: " + scorePercent + "%");
                    return true;
                }
            }
        //get assignment score avg:
            public double getAssignmentScoreAvg(String assignmentName){
                int assignmentIndex = getAssignmentIndexByAssignmentName(assignmentName);
                if (assignmentIndex != -1) {//if assignment doesn't exists...
                    return -1;//return -1
                } else {//else...
                    Assignments searchedAssignment = Assignments.get(assignmentIndex);
                    double scorePercent = (searchedAssignment.getAssignmentScorePercent(searchedAssignment))*100;
                    return scorePercent;
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