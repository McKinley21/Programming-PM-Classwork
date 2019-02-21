package com.company;

public class Main {

    public static void main(String[] args) {
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
            //changeSection(string sectionName); sets the currently active section
            //boolean AddStudent(String firstName, String lastName, string username, long phoneNumber); creates a new student
            //double getOverallScore(String username); returns overall score as a percentage for specified student
            //double getOverallScoreAvg(String sectionName); returns overall score as a percentage for a section
            //boolean addAssignmentToStudent(String username, String assignmentName, int pointsPossible)
            //boolean addAssignmentToSection(String assignmentName, int pointsPossible)
            //boolean setScore(String username, String assignmentName, int pointsEarned)
            //double getAssignmentScorePercent(String username, String assignmentName); returns score as a percentage for student in current section
            //double getAssignmentScoreAvg(String assignmentName); returns score as a percentage for current section
            //boolean addSection(String sectionName); creates a new section if there are not already 6 sections and sectionName isnt already used
            //boolean markTardy(String username); adds 1 to the students tardy count
            //boolean markAbsent(String username); adds 1 to the students absent count
            //int getTardyCount(String username); returns number of times student was tardy
            //int getAbsentCount(String username); returns number of times student was absent
    }
}
