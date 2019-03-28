package com.company;

import java.util.ArrayList;

/**
 * Created by mh6900 on 2/19/2019.
 */
public class Sections {
    //Properties:
        private ArrayList<Students> Students;// Students (List)
            //create Students class
        private String sectionName;// sectionName (String)
    //Constructors:
        public Sections(String sectionName) {
            this.sectionName = sectionName;//set sectionName
            Students = new ArrayList<>();//create space for students to be added to
        }
    //Methods:
        //public double getOverallScoreAvg(String sectionName){
            //returns overall score as a percentage for a section
        //}
        //public double getAssignmentScoreAvg(String assignmentName){
            //returns score as a percentage for current section
        //}

        public String getSectionName() {
            return sectionName;
        }
        public boolean addStudent(String firstName, String lastName, String username, long phoneNumber){
            int studentIndex = getStudentIndexByUsername(username);
            if (studentIndex !=-1) {//if username exists...
                return false;//return false
            }
            else {//else...
                Students.add(new Students(firstName, lastName, username, phoneNumber));//create new student and add to students list
                return true;//return true
            }
        }
        public boolean addAssignmentToStudent(String username, String assignmentName, int pointsPossible){
            Students currStudent = getCurrentStudent(username);//get the student specified by username
            if(currStudent == null) {//if student not found...
                return false;//return false
            }
            else {//else...
                currStudent.addAssignmentToStudent(username,assignmentName,pointsPossible);//add a assignment to the specified student
                return true;//return true
            }
        }
        public boolean setScore(String username, String assignmentName, int pointsEarned){
            Students currStudent = getCurrentStudent(username);//get the student specified by username
            if(currStudent == null) {//if student not found...
                return false;//return false
            }
            else {//else...
                currStudent.setScore(username,assignmentName,pointsEarned);//set the score for the student's assignment
                return true;//return true
            }
        }
        public boolean markTardy(String username){
            Students currStudent = getCurrentStudent(username);//get the student specified by username
            if(currStudent == null) {//if student not found...
                return false;//return false
            }
            else {//else...
                currStudent.markTardy();//add 1 to the specified student's tardy count(mark as tardy)
                return true;//return true
            }
        }
        public boolean markAbsent(String username){
            Students currStudent = getCurrentStudent(username);//get the student specified by username
            if(currStudent == null) {//if student not found...
                return false;//return false
            }
            else {//else...
                currStudent.markAbsent();//add 1 to the specified student's absent count(mark as absent)
                return true;//return true
            }
        }
        int getTardyCount(String username){//returns number of times student was tardy
            Students currStudent = getCurrentStudent(username);//get the student specified by username
            if(currStudent == null) {//if student not found...
                int tardyCount = -1;
                return tardyCount;//return tardyCount
            }
            else {//else...
                int tardyCount = currStudent.getDaysTardy();//get the specified student's tardy count
                return tardyCount;
            }
        }
        int getAbsentCount(String username){//returns number of times student was absent
            Students currStudent = getCurrentStudent(username);//get the student specified by username
            if(currStudent == null) {//if student not found...
                int absentCount = -1;
                return absentCount;//return absentCount
            }
            else {//else...
                int absentCount = currStudent.getDaysAbsent();//get the specified student's absent count
                return absentCount;
            }
        }
        private int getStudentIndexByUsername(String username){//search if given username is used already
            int index = 0;
            while (index < Students.size()){
                if (username.equalsIgnoreCase(Students.get(index).getUsername())){//if a student is found with the given username...
                    return index;//return the found index
                }
                index++;
            }
            //if no student found with the given username...
            return -1;//return -1
        }
        private Students getCurrentStudent(String username) {//get current student
            int index = getStudentIndexByUsername(username);//get student index
            if(index == -1) {//if index == -1...
                return null;//return null
            }
            else {//else...
                return Students.get(index);//return student at that index
            }
        }
}