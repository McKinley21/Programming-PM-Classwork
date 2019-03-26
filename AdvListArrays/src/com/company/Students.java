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
        public Students(String firstName, String lastName, String username, long phoneNumber, int daysAbsent, int daysTardy) {
            this.firstName = firstName;//set firstName
            this.lastName = lastName;//set lastName
            this.username = username;//set username
            this.phoneNumber = phoneNumber;//set phoneNumber
            this.daysAbsent = daysAbsent;//set daysAbsent
            this.daysTardy = daysTardy;//set daysTardy
            Assignments = new ArrayList<>();//create space for assignments to be added to
        }
    //Methods:
        //boolean addStudent(String firstName, String lastName, string username, long phoneNumber){
            //creates a new student
        //}
        //double getOverallScore(String username){
            //returns overall score as a percentage for specified student
        //}
        //boolean addAssignmentToStudent(String username, String assignmentName, int pointsPossible){
            //creates a new assignment for a specified student
        //}
        //double getAssignmentScorePercent(String username, String assignmentName){
            //returns score as a percentage for student in current section
        //}
        //boolean markTardy(String username){
            //adds 1 to the students tardy count
        //}
        //boolean markAbsent(String username){
            //adds 1 to the students absent count
        //}
        //int getTardyCount(String username){
            //returns number of times student was tardy
        //}
        //int getAbsentCount(String username){
            //returns number of times student was absent
        //}
}
