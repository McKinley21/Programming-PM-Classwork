package com.company;

/**
 * Created by mh6900 on 2/5/2019.
 */
public class Garfield {//Class Name: Garfield
    //Properties:
        String species;//species (string)
        String name;//name (string)

    //Constructor:
        public Garfield() {//takes no inputs
            species = "Cat";
            name = "Garfield";//sets species to be "Cat" and name to be "Garfield"
        }

    //Methods:
        public void MakeSound() {//Name: MakeSound
            //Inputs: none
            System.out.println("mmmm, lasagna");//What it should do: print "mmmm, lasagna" to the screen
            //returns: nothing
        }

        public void PrintName() {//Name: PrintName
            //Inputs: none
            System.out.println(name);//What it should do: print the name property to the screen
            //returns: nothing
        }

        public void BeHappy() {//Name: BeHappy
            //Inputs: none
            //What it should do:
            LayOnLap();//calls LayOnLap method
            System.out.println("*takes a nap*");//print "*takes a nap*"
            //returns: nothing
        }

        public void LayOnLap() {//Name: LayOnLap
            //Inputs: none
            //What it should do:
            System.out.println("*cuddles on owner's lap*");//print "*cuddles on owner's lap*"
            //returns: nothing
        }

        public void SeeLaser() {//Name: SeeLaser
            //Inputs: none
            BeHappy();//What it should do: calls the BeHappy method
            //returns: nothing
        }
}