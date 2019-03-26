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
        //public boolean addAssignmentToSection(String assignmentName, int pointsPossible){
            //creates a new assignment for a section

        //}
        //public double getAssignmentScoreAvg(String assignmentName){
            //returns score as a percentage for current section
        //}

        public String getSectionName() {
            return sectionName;
        }
}