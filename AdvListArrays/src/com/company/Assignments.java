package com.company;

/**
 * Created by mh6900 on 2/20/2019.
 */
public class Assignments {
    //Properties:
        private String assignmentName;// assignmentName (String)
        private int pointsPossible;// pointsPossible (int)
        private int pointsEarned;// pointsEarned (int)
    //Constructors:
        public Assignments(String assignmentName, int pointsPossible) {
            this.assignmentName = assignmentName;//set assignmentName
            this.pointsPossible = pointsPossible;//set pointsPossible
            this.pointsEarned = 0;//set pointsEarned to 0
        }
    //Methods:
        //set score:
            public boolean setScore(Assignments searchedAssignment, int pointsEarned){
                searchedAssignment.pointsEarned = pointsEarned;
                return true;
            }
        //get assignment score:
            public double getAssignmentScorePercent(Assignments searchedAssignment){
                double pointsEarned = searchedAssignment.pointsEarned;
                double pointsPossible = searchedAssignment.pointsPossible;
                double score = pointsEarned/pointsPossible;
                return score;
            }
        //other methods:
            public String getAssignmentName() {
                return assignmentName;
            }
}
