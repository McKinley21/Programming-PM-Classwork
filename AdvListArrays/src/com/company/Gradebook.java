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
    public Gradebook() {
        Sections = new ArrayList<>();//create space for sections to be added to
        CurrentSection = "";//set the current section as ""
    }

    //Methods:
    //change section
    public int changeSection(String sectionName) {//sets the currently active section
        if (getCurrentSection().getSectionName().equals(sectionName)) {//else if sectionName already active...
            return 0;//return 0 if false
        }
        int sectionIndex = getSectionIndexBySectionName(sectionName);
        if (sectionIndex == -1) {//if sectionName not found...
            return -1;//return -1 if false
        } else {//else...
            CurrentSection = sectionName;//switch current section to searched section
            return 1;//return 1 if true
        }
    }

    //add section
    public int addSection(String sectionName) {//creates a new section if there are not already 6 sections and sectionName isn't already used
        if (Sections.size() == 6) {//if 6 sections already...
            return 0;//return 0 if false
        }
        int sectionIndex = getSectionIndexBySectionName(sectionName);
        if (sectionIndex != -1) {//if sectionName used already...
            return -1;//return -1 if false
        } else {//else...
            Sections.add(new Sections(sectionName));//create new section and add to sections list
            CurrentSection = sectionName;//set new section as the current section
            return 1;//return 1 if true
        }
    }

    //add student
    public int addStudent(String firstName, String lastName, String username, long phoneNumber) {//creates a new student
        if (Sections.size() == 0) {//if no sections...
            return 0;//return 0 if false
        }
        Sections currSection = getCurrentSection();//get current section
        if (currSection == null) {//if the currSection == null...
            return -2;//return -2 if false
        }
        int retVal = currSection.addStudent(firstName, lastName, username, phoneNumber);//add student to active section
        return retVal;
    }

    //add assignment to student
    public int addAssignmentToStudent(String username, String assignmentName, int pointsPossible) {//creates a new assignment for a specified student
        if (Sections.size() == 0) {//if no sections...
            return 0;//return 0 if false
        }
        Sections currSection = getCurrentSection();//get current section
        if (currSection == null) {//if the currSection == null...
            return -2;//return -2 if false
        }
        int retVal = currSection.addAssignmentToStudent(username, assignmentName, pointsPossible);//add assignment to the specified student
        return retVal;
    }

    //add assignment to section
    public int addAssignmentToSection(String assignmentName, int pointsPossible) {//creates a new assignment for a section
        if (Sections.size() == 0) {//if no sections...
            return 0;//return 0 if false
        }
        Sections currSection = getCurrentSection();//get current section
        if (currSection == null) {//if the currSection == null...
            return -3;//return -3 if false
        }
        int retVal = currSection.addAssignmentToSection(currSection, assignmentName, pointsPossible);//add assignment to the specified section
        return retVal;
    }

    //set score
    public int setScore(String username, String assignmentName, int pointsEarned) {//set a score for a specified assignment
        if (Sections.size() == 0) {//if no sections...
            return 0;//return 0 if false
        }
        Sections currSection = getCurrentSection();//get current section
        if (currSection == null) {//if the currSection == null...
            return -4;//return -4 if false
        }
        int retVal = currSection.setScore(username, assignmentName, pointsEarned);//add assignment to the specified section
        return retVal;
    }

    //mark tardy
    public int markTardy(String username) {//adds 1 to the students tardy count
        if (Sections.size() == 0) {//if no sections...
            return 0;//return 0 if false
        }
        Sections currSection = getCurrentSection();//get current section
        if (currSection == null) {//if the currSection == null...
            return -2;//return -2 if false
        }
        return currSection.markTardy(username);//mark the student tardy
    }

    //mark absent
    public int markAbsent(String username) {//adds 1 to the students absent count
        if (Sections.size() == 0) {//if no sections...
            return 0;//return 0 if false
        }
        Sections currSection = getCurrentSection();//get current section
        if (currSection == null) {//if the currSection == null...
            return -2;//return -2 if false
        }
        return currSection.markAbsent(username);//mark the student absent
    }

    //get overall score
    public int getOverallScore(String username) {//returns overall score as a percentage for specified student
        if (Sections.size() == 0) {//if no sections...
            return 0;//return 0 if false
        }
        Sections currSection = getCurrentSection();//get current section
        if (currSection == null) {//if the currSection == null...
            return -2;//return false
        }
        return currSection.getOverallScore(username);//get the specified student's overall score
    }

    //get overall score avg
    public int getOverallScoreAvg(String sectionName) {//returns overall score as a percentage for a section
        if (Sections.size() == 0) {//if no sections...
            return 0;//return 0 if false
        }
        Sections currSection = getCurrentSection();//get current section
        if (currSection == null) {//if the currSection == null...
            return -2;//return false
        }
        int sectionIndex = getSectionIndexBySectionName(sectionName);
        if (sectionIndex == -1) {//if sectionName not found...
            return -1;//return -1 if false
        } else {//if sectionName is found...
            double overallScoreAvg = currSection.getOverallScoreAvg(currSection);//get the specified section's overall score
            System.out.println(sectionName + "'s Overall Score Avg: " + overallScoreAvg + "%");
            return 1;
        }
    }

    //get assignment score
    public int getAssignmentScorePercent(String username, String assignmentName) {//returns score as a percentage for student in current section
        if (Sections.size() == 0) {//if no sections...
            return 0;//return 0 if false
        }
        Sections currSection = getCurrentSection();//get current section
        if (currSection == null) {//if the currSection == null...
            return -4;//return -4 if false
        }
        return currSection.getAssignmentScorePercent(username,assignmentName);//get the specified student's assignment score
    }

    //get assignment score avg
    public int getAssignmentScoreAvg(String sectionName, String assignmentName) {//returns score as a percentage for current section
        if (Sections.size() == 0) {//if no sections...
            return 0;//return 0 if false
        }
        Sections currSection = getCurrentSection();//get current section
        if (currSection == null) {//if the currSection == null...
            return -4;//return false
        }
        int sectionIndex = getSectionIndexBySectionName(sectionName);
        if (sectionIndex == -1) {//if sectionName not found...
            return -1;//return -1 if false
        } else {//if sectionName is found...
            double assignmentScoreAvg = currSection.getAssignmentScoreAvg(currSection, assignmentName);//get the specified section's overall score
            if (assignmentScoreAvg == -5) {
                return 0;
            }
            if (assignmentScoreAvg == -2) {
                return -2;
            }
            System.out.println(sectionName + "'s Avg " + assignmentName + " score: " + assignmentScoreAvg + "%");
            if (assignmentScoreAvg == 0){
                return -3;
            }
            return 1;
        }
    }

    //get tardy count
    public int getTardyCount(String username) {//returns number of times student was tardy
        if (Sections.size() == 0) {//if no sections...
            int tardyCount = -1;
            return tardyCount;//return tardyCount
        }
        Sections currSection = getCurrentSection();//get current section
        if (currSection == null) {//if the currSection == null...
            int tardyCount = -3;
            return tardyCount;//return tardyCount
        }
        return currSection.getTardyCount(username);//get the student's tardy count
    }

    //get absent count
    public int getAbsentCount(String username) {//returns number of times student was absent
        if (Sections.size() == 0) {//if no sections...
            int absentCount = -1;
            return absentCount;//return absentCount
        }
        Sections currSection = getCurrentSection();//get current section
        if (currSection == null) {//if the currSection == null...
            int absentCount = -3;
            return absentCount;//return absentCount
        }
        return currSection.getAbsentCount(username);//get the student's absent count
    }

    //other methods
    private int getSectionIndexBySectionName(String sectionName) {//search if given section name is used already
        int index = 0;
        while (index < Sections.size()) {
            if (sectionName.equalsIgnoreCase(Sections.get(index).getSectionName())) {//if a section is found with the given section name...
                return index;//return the found index
            }
            index++;
        }
        //if no section found with the given section name...
        return -1;//return -1
    }

    private Sections getCurrentSection() {//get current section
        int index = getSectionIndexBySectionName(CurrentSection);//get section index
        if (index == -1) {//if index == -1...
            return null;//return null
        } else {//else...
            return Sections.get(index);//return section at that index
        }
    }

    public String getCurrentSectionName() {
        return CurrentSection;
    }
}