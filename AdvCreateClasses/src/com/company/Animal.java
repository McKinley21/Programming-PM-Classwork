package com.company;

/**
 * Created by mh6900 on 2/5/2019.
 */
public class Animal {//Class Name: Animal
    //Properties:
        String species;//species (string)
        String name;//name (string)

    //Constructor:
        public Animal(String Species, String Name) {
            species = Species;
            name = Name;
        }//should take 2 string inputs and set the 2 properties accordingly

    //Methods:
        public void MakeSound() {//Name: MakeSound
            //Inputs: none
            System.out.println("Grrr");//What it should do: print "Grrr" to the screen
            //returns: nothing
        }

        public void PrintName() {//Name: PrintName
            //Inputs: none
            System.out.println(name);//What it should do: print the name property to the screen
            //returns: nothing
        }
}