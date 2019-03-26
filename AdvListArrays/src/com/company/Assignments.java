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
        public Assignments(String assignmentName, int pointsPossible, int pointsEarned) {
            this.assignmentName = assignmentName;//set assignmentName
            this.pointsPossible = pointsPossible;//set pointsPossible
            this.pointsEarned = pointsEarned;//set pointsEarned to 0
        }
    //Methods:
        //boolean setScore(String username, String assignmentName, int pointsEarned){
            //set a score for a specified assignment
        //}
}
