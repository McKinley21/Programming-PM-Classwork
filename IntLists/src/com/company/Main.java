package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ///////////////In C#,Java:////////////////////////////////////
            ArrayList<Integer> integerList = new ArrayList<>();// Declare a list of Integers called integerList
            ArrayList<Integer> listOfInts = new ArrayList<>();// Declare a list of Integers called listOfInts
            ArrayList<Integer> testScores = new ArrayList<>();// Declare a list of Integers called testScores

            ArrayList<Double> dblList = new ArrayList<>();// Declare a list of Doubles called dblList
            ArrayList<Double> listOfDoubles = new ArrayList<>();// Declare a list of Doubles called listOfDoubles
            ArrayList<Double> playerPoints = new ArrayList<>();// Declare a list of Doubles called playerPoints

            ArrayList<String> stringList = new ArrayList<>();// Declare a list of Strings called stringList
            ArrayList<String> listOfStrings = new ArrayList<>();// Declare a list of Strings called listOfStrings
            ArrayList<String> studentName = new ArrayList<>();// Declare a list of Strings called studentName

            ArrayList<Integer> intList = new ArrayList<>();// Declare a List of integers called intList
            ArrayList<Double> dblList2 = new ArrayList<>();// Declare a List of doubles  called dblList2
            ArrayList<String> strList = new ArrayList<>();// Declare a List of strings  called strList

        ///////////////Changes to intList///////////////////////////
            intList.add(12);// add 12 to intList
            intList.add(5);// add 5 to intList
            intList.add(7);// add 7 to intList
            intList.add(3);// add 3 to intList

            int intElement = intList.get(0);// read the first element (element 0)of intList into a new variable called intElement
            System.out.println(intElement);// print out intElement
            intElement = intList.get(1);// read the second element (element 1)of intList into intElement
            System.out.println(intElement);// print out intElement
            intElement = intList.get(2);// read the third element (element 2)of intList into intElement
            System.out.println(intElement);// print out intElement
            intElement = intList.get(3);// read the fourth element (element 3)of intList into intElement
            System.out.println(intElement);// print out intElement

            intList.set(0,13);// modify element 0 of intList to be 13
            intList.set(3,8);// modify element 3 of intList to be 8

            intElement = intList.get(0);// read the first element (element 0)of intList into intElement
            System.out.println(intElement);// print out intElement
            intElement = intList.get(1);// read the second element (element 1)of intList into intElement
            System.out.println(intElement);// print out intElement
            intElement = intList.get(2);// read the third element (element 2)of intList into intElement
            System.out.println(intElement);// print out intElement
            intElement = intList.get(3);// read the fourth element (element 3)of intList into intElement
            System.out.println(intElement);// print out intElement

        ///////////////Changes to dblList/////////////////////////////
            dblList.add(12.1);// add 12.1 to dblList
            dblList.add(5.2);// add 5.2 to dblList
            dblList.add(7.3);// add 7.3 to dblList

            double dblElement = dblList.get(0);// read the first element (element 0)of dblList into a new variable called dblElement
            System.out.println(dblElement);// print out dblElement
            dblElement = dblList.get(1);// read the second element (element 1)of dblList into dblElement
            System.out.println(dblElement);// print out dblElement
            dblElement = dblList.get(2);// read the third element (element 2)of dblList into dblElement
            System.out.println(dblElement);// print out dblElement

            dblList.set(1,13.1);// modify element 1 of dblList to be 13.1
            dblList.set(2,8.2);// modify element 2 of dblList to be 8.2

            dblElement = dblList.get(0);// read the first element (element 0)of dblList into dblElement
            System.out.println(dblElement);// print out dblElement
            dblElement = dblList.get(1);// read the second element (element 1)of dblList into dblElement
            System.out.println(dblElement);// print out dblElement
            dblElement = dblList.get(2);// read the third element (element 2)of dblList into dblElement
            System.out.println(dblElement);// print out dblElement

        ///////////////Changes to strList/////////////////////////////
            strList.add("Hi");// add "Hi" to strList
            strList.add("How");// add "How"  to strList
            strList.add("Are");// add "Are"  to strList
            strList.add("You?");// add "You?"  to strList

            String strElement = strList.get(0);// read the first element (element 0)of strList into a new variable called strElement
            System.out.println(strElement);// print out strElement
            strElement = strList.get(1);// read the second element (element 1)of strList into strElement
            System.out.println(strElement);// print out strElement
            strElement = strList.get(2);// read the third element (element 2)of strList into strElement
            System.out.println(strElement);// print out strElement
            strElement = strList.get(3);// read the fourth element (element 3)of strList into strElement
            System.out.println(strElement);// print out strElement

            strList.set(1,"good");// modify element 1 of strList to be "good"
            strList.set(2,"thanks");// modify element 2 of strList to be "thanks"

            strElement = strList.get(0);// read the first element (element 0)of strList into strElement
            System.out.println(strElement);// print out strElement
            strElement = strList.get(1);// read the second element (element 1)of strList into strElement
            System.out.println(strElement);// print out strElement
            strElement = strList.get(2);// read the third element (element 2)of strList into strElement
            System.out.println(strElement);// print out strElement
            strElement = strList.get(3);// read the fourth element (element 3)of strList into strElement
            System.out.println(strElement);// print out strElement
    }
}