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
            int sectionIndex =  getSectionIndexBySectionName(sectionName);
            if(sectionIndex == -1){//if sectionName not found...
                System.out.println("Section not found.");
                return false;//return false
            }
            if(getCurrentSection().equals(sectionName)) {//else if sectionName already active...
                System.out.println(sectionName + " is already active.");
                return false;//return false
            }
            //FIXME
            //else...
                //switch current section to searched section
                //return true
        }
        public boolean addSection(String sectionName){//creates a new section if there are not already 6 sections and sectionName isn't already used
            if(Sections.size()==6) {//if 6 sections already...
                System.out.println(sectionName + " cannot be added(There are already 6 sections added).");
                return false;//return false
            }
            int sectionIndex = getSectionIndexBySectionName(sectionName);
            if(sectionIndex != -1) {//if sectionName used already...
                System.out.println(sectionName + " is already added.");
                return false;//return false
            }
            else {//else...
                Sections.add(new Sections(sectionName));//create new section and add to sections list
                System.out.println(sectionName + " has been added.");
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

        public String getCurrentSection() {
            return CurrentSection;
        }
}