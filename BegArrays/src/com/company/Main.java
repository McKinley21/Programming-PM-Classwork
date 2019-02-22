package com.company;

public class Main {

    public static void main(String[] args) {
        ///////////Array Declaration//////////////////
            int[] intArray1 = new int[50];// Declare an array of 50 integers called intArray1
            int[] arrayOfNumbers = new int[3];// Declare an array of 3 integers called arrayOfNumbers
            int [] numbersArray = new int[5];// Declare an array of 5 integers called numbersArray

            double[] dblArray = new double[4];// Declare an array of 4 doubles called dblArray
            double[] arrayOfDoubles = new double[15];// Declare an array of 15 doubles called arrayOfDoubles
            double[] playerPoints = new double[39];// Declare an array of 39 doubles called playerPoints

            String[] stringArray1 = new String[20];// Declare an array of 20 Strings called stringArray1
            String[] arrayOfStrings = new String[25];// Declare an array of 25 Strings called arrayOfStrings
            String[] wordArray = new String[6];// Declare an array of 6 Strings called wordArray

        ////////setting values in array//////////////
            numbersArray[0] = 12;// set element 0 of numbersArray to be 12
            numbersArray[1] = 13;// set element 1 of numbersArray to be 13
            numbersArray[2] = 14;// set element 2 of numbersArray to be 14
            numbersArray[3] = 15;// set element 3 of numbersArray to be 15
            numbersArray[4] = 16;// set element 4 of numbersArray to be 16

            arrayOfNumbers[0] = 47;// set element 0 of arrayOfNumbers to be 47
            arrayOfNumbers[1] = 46;// set element 1 of arrayOfNumbers to be 46
            arrayOfNumbers[2] = 39;// set element 2 of arrayOfNumbers to be 39

            dblArray[0] = 12.43;// set element 0 of dblArray to be 12.43
            dblArray[1] = 5.12;// set element 1 of dblArray to be 5.12
            dblArray[2] = 43.21;// set element 2 of dblArray to be 43.21
            dblArray[3] = 1.34;// set element 3 of dblArray to be 1.34

            wordArray[0] = "What";// set element 0 of wordArray to be "What"
            wordArray[1] = "is";// set element 1 of wordArray to be "is"
            wordArray[2] = "Forrest";// set element 2 of wordArray to be "Forrest"
            wordArray[3] = "Gump's";// set element 3 of wordArray to be "Gump's"
            wordArray[4] = "password?";// set element 4 of wordArray to be "password?"
            wordArray[5] = "1Forrest1";// set element 5 of wordArray to be "1Forrest1"

        //////Reading values out of an Array///////
            System.out.println(numbersArray[0]);// Print out the value of the first element in numbersArray
            System.out.println(numbersArray[1]);// Print out the value of the second element in numbersArray
            System.out.println(numbersArray[2]);// Print out the value of element 2 in numbersArray
            System.out.println(numbersArray[3]);// Print out the value of element 3 in numbersArray

            System.out.println(wordArray[0]);// Print out the value of element 0 of wordArray
            System.out.println(wordArray[1]);// Print out the value of element 1 of wordArray
            System.out.println(wordArray[2]);// Print out the value of element 2 of wordArray
            System.out.println(wordArray[3]);// Print out the value of the fourth element in wordArray
            System.out.println(wordArray[4]);// Print out the value of the fifth element in wordArray
            System.out.println(wordArray[5]);// Print out the value of element 5 of wordArray
    }
}
