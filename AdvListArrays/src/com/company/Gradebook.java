package com.company;

import java.util.ArrayList;

/**
 * Created by mh6900 on 2/21/2019.
 */
public class Gradebook {
    //Properties:
        private ArrayList<Sections> Sections;// Sections (Array)
            // create Sections class
        private String CurrentSection;// CurrentSection (String)
    //Constructors:
        public Gradebook(){
            Sections = new ArrayList<>();//create space for sections to be added to
            CurrentSection = "";//set the current section as ""
        }
    //Methods:
        public boolean changeSection(String sectionName){//sets the currently active section
            if(getCurrentSection().equals(sectionName)) {//else if sectionName already active...
                return false;//return false
            }
            int sectionIndex =  getSectionIndexBySectionName(sectionName);
            if(sectionIndex == -1){//if sectionName not found...
                return false;//return false
            }
            else {//else...
                CurrentSection = sectionName;//switch current section to searched section
                return true;//return true
            }
        }
        public boolean addSection(String sectionName){//creates a new section if there are not already 6 sections and sectionName isn't already used
            if(Sections.size()==6) {//if 6 sections already...
                return false;//return false
            }
            int sectionIndex = getSectionIndexBySectionName(sectionName);
            if(sectionIndex != -1) {//if sectionName used already...
                return false;//return false
            }
            else {//else...
                Sections.add(new Sections(sectionName));//create new section and add to sections list
                CurrentSection = sectionName;//set new section as the current section
                return true;//return true
            }
        }
        private int getSectionIndexBySectionName(String sectionName){//search if given section name is used already
            int index = 0;
            while (index < Sections.size()){
                if (sectionName.equalsIgnoreCase(Sections.get(index).getSectionName())){//if a section is found with the given section name...
                    return index;//return the found index
                }
                index++;
            }
            //if no section found with the given section name...
            return -1;//return -1
        }
        private Sections getCurrentSection() {//get current section
            int index = getSectionIndexBySectionName(CurrentSection);//get section index
            if(index == -1) {//if index == -1...
                return null;//return null
            }
            else {//else...
                return Sections.get(index);//return section at that index
            }
        }
        boolean addStudent(String firstName, String lastName, String username, long phoneNumber){//creates a new student
            if(Sections.size() == 0) {//if no sections...
                return false;//return false
            }
            Sections currSection = getCurrentSection();//get current section
            if (currSection == null){//if the currSection == null...
                return false;//return false
            }
            boolean retVal = currSection.addStudent(firstName, lastName, username, phoneNumber);//add student to active section
            return retVal;
        }
        boolean markTardy(String username){//adds 1 to the students tardy count
            if(Sections.size() == 0) {//if no sections...
                return false;//return false
            }
            Sections currSection = getCurrentSection();//get current section
            if (currSection == null){//if the currSection == null...
                return false;//return false
            }
            return currSection.markTardy(username);//mark the student tardy
        }
        boolean markAbsent(String username){//adds 1 to the students absent count
            if(Sections.size() == 0) {//if no sections...
                return false;//return false
            }
            Sections currSection = getCurrentSection();//get current section
            if (currSection == null){//if the currSection == null...
                return false;//return false
            }
            return currSection.markAbsent(username);//mark the student absent
        }
        int getTardyCount(String username){//returns number of times student was tardy
            if(Sections.size() == 0) {//if no sections...
                int tardyCount = -1;
                return tardyCount;//return tardyCount
            }
            Sections currSection = getCurrentSection();//get current section
            if (currSection == null){//if the currSection == null...
                int tardyCount = -1;
                return tardyCount;//return tardyCount
            }
            return currSection.getTardyCount(username);//get the student's tardy count
        }
}