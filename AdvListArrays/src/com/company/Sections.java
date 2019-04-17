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
    //add student:
    public int addStudent(String firstName, String lastName, String username, long phoneNumber) {
        int studentIndex = getStudentIndexByUsername(username);
        if (studentIndex != -1) {//if username exists...
            return -1;//return false
        } else {//else...
            Students.add(new Students(firstName, lastName, username, phoneNumber));//create new student and add to students list
            return 1;//return true
        }
    }

    //add assignment to student:
    public int addAssignmentToStudent(String username, String assignmentName, int pointsPossible) {
        Students currStudent = getCurrentStudent(username);//get the student specified by username
        int addAssignment = 0;
        if (currStudent == null) {//if student not found...
            return 0;//return false
        } else {//else...
            boolean bool = currStudent.addAssignmentToStudent(assignmentName, pointsPossible);//add a assignment to the specified student
            if (bool = false) {
                addAssignment = -1;
            } else {
            }
            return 1;
        }
    }

    //add assignment to section:
    public int addAssignmentToSection(Sections currSection, String assignmentName, int pointsPossible) {
        if (currSection.Students.isEmpty()) {//if students not found...
            return -2;//return -2 if false
        } else {//else...
            int studentIndex = 0;
            while (studentIndex < currSection.Students.size()) {
                Students currStudent = currSection.Students.get(studentIndex);
                if (currStudent == null) {//if student not found...
                    return -3;//return -3 if false
                } else {//else...
                    currStudent.addAssignmentToStudent(assignmentName, pointsPossible);//add a assignment to each student in the current section
                }
                studentIndex++;
            }
            return 1;//return 1 if true
        }
    }

    //set score:
    public int setScore(String username, String assignmentName, int pointsEarned) {
        Students currStudent = getCurrentStudent(username);//get the student specified by username
        if (currStudent == null) {//if student not found...
            return -1;//return -1 if false
        } else {//else...
            return currStudent.setScore(assignmentName, pointsEarned);//sets the score for the specified assignment
        }
    }

    //mark tardy:
    public int markTardy(String username) {
        Students currStudent = getCurrentStudent(username);//get the student specified by username
        if (currStudent == null) {//if student not found...
            return -1;//return -1 if false
        } else {//else...
            currStudent.markTardy();//add 1 to the specified student's tardy count(mark as tardy)
            return 1;//return 1 if true
        }
    }

    //mark absent:
    public int markAbsent(String username) {
        Students currStudent = getCurrentStudent(username);//get the student specified by username
        if (currStudent == null) {//if student not found...
            return -1;//return -1 if false
        } else {//else...
            currStudent.markAbsent();//add 1 to the specified student's absent count(mark as absent)
            return 1;//return if true
        }
    }

    //get overall score:
    public int getOverallScore(String username) {
        Students currStudent = getCurrentStudent(username);//get the student specified by username
        if (currStudent == null) {//if student not found...
            return -1;//return -1 if false
        } else {//else...
            double overallScorePercent = currStudent.getOverallScore(currStudent);//get the overall score as a percentage for specified student
            System.out.println(username + "'s Overall Score: " + overallScorePercent + "%");
            return 1;//return 1 if true
        }
    }

    //get overall score avg:
    public double getOverallScoreAvg(Sections currSection) {
        double overallScoreAvg = 0;
        int studentIndex = 0;
        while (studentIndex < currSection.Students.size()) {
            Students currStudent = currSection.Students.get(studentIndex);
            double currStudentOverallPercent = currStudent.getOverallScore(currStudent);
            overallScoreAvg = overallScoreAvg + currStudentOverallPercent;
            studentIndex++;
        }
        return overallScoreAvg;
    }

    //get assignment score:
    public int getAssignmentScorePercent(String username, String assignmentName) {
        Students currStudent = getCurrentStudent(username);//get the student specified by username
        if (currStudent == null) {//if student not found...
            return -1;//return -1 if false
        } else {//else...
            double assignmentScorePercent = currStudent.getAssignmentScorePercent(username,assignmentName);//get the assignment score as a percentage for specified student
            System.out.println(username + "'s " + assignmentName +" Score: " + assignmentScorePercent + "%");
            return 1;//return 1 if true
        }
    }

    //get assignment score avg:
    public boolean getAssignmentScoreAvg(Sections currSection, String assignmentName) {
        //FIXME
        return false;
    }

    //get tardy count:
    public int getTardyCount(String username) {//returns number of times student was tardy
        Students currStudent = getCurrentStudent(username);//get the student specified by username
        if (currStudent == null) {//if student not found...
            int tardyCount = -2;
            return tardyCount;//return tardyCount
        } else {//else...
            int tardyCount = currStudent.getDaysTardy();//get the specified student's tardy count
            return tardyCount;
        }
    }

    //get absent count:
    public int getAbsentCount(String username) {//returns number of times student was absent
        Students currStudent = getCurrentStudent(username);//get the student specified by username
        if (currStudent == null) {//if student not found...
            int absentCount = -2;
            return absentCount;//return absentCount
        } else {//else...
            int absentCount = currStudent.getDaysAbsent();//get the specified student's absent count
            return absentCount;
        }
    }

    //other methods:
    private int getStudentIndexByUsername(String username) {//search if given username is used already
        int index = 0;
        while (index < Students.size()) {
            if (username.equalsIgnoreCase(Students.get(index).getUsername())) {//if a student is found with the given username...
                return index;//return the found index
            }
            index++;
        }
        //if no student found with the given username...
        return -1;//return -1
    }

    private Students getCurrentStudent(String username) {//get current student
        int index = getStudentIndexByUsername(username);//get student index
        if (index == -1) {//if index == -1...
            return null;//return null
        } else {//else...
            return Students.get(index);//return student at that index
        }
    }

    public String getSectionName() {
        return sectionName;
    }
}