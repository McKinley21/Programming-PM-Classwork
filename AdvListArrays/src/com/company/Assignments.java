package com.company;

import sun.invoke.empty.Empty;

/**
 * Created by mh6900 on 2/20/2019.
 */
public class Assignments {
    //Properties:
    private String assignmentName;//assignmentName (String)
    private int pointsPossible;//pointsPossible (int)
    private int pointsEarned;//pointsEarned (int)

    //Constructors:
    public Assignments(String assignmentName, int pointsPossible) {
        this.assignmentName = assignmentName;//set assignmentName
        this.pointsPossible = pointsPossible;//set pointsPossible
        this.pointsEarned = 0;//set pointsEarned to 0
    }

    //Methods:
    //set score:
    public int setScore(Assignments searchedAssignment, int pointsEarned) {
        if (pointsEarned > pointsPossible) {
            return -3;//return -3 if false
        } else {
            searchedAssignment.pointsEarned = pointsEarned;//set pointsEarned accordingly
            return 1;//return 1 if true
        }
    }

    //get assignment score:
    public double getAssignmentScorePercent(Assignments searchedAssignment) {
        double score = ((double) searchedAssignment.pointsEarned / searchedAssignment.pointsPossible);
        double scorePercent = (score * 100);
        return scorePercent;//return score percent
    }

    //other methods:
    public String getAssignmentName() {
        return assignmentName;//return assignmentName
    }

    public int getPointsPossible() {
        return pointsPossible;//return pointsPossible
    }
}