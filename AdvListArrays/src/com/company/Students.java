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
        public void markTardy(){
            daysTardy++;//marks a student tardy
        }
        public void markAbsent(){
            daysAbsent++;//marks a student absent
        }
        public int getDaysTardy() {
            return daysTardy;
        }

    //double getOverallScore(String username){
            //returns overall score as a percentage for specified student
        //}
        //boolean addAssignmentToStudent(String username, String assignmentName, int pointsPossible){
            //creates a new assignment for a specified student
        //}
        //double getAssignmentScorePercent(String username, String assignmentName){
            //returns score as a percentage for student in current section
        //}
        //int getAbsentCount(String username){
            //returns number of times student was absent
        //}
        public String getUsername() {
            return username;
        }
}
