package com.company;

/**
 * Created by mh6900 on 2/5/2019.
 */
public class OrangeTabby {//Class Name: OrangeTabby
    //Properties:
        String species;//species (string)
        String name;//name (string)

    //Constructor:
        public OrangeTabby(String Name) {
            species = "Cat";//sets species property to be "Cat"
            name = Name;
        }//should take 1 string input and sets name property accordingly


    //Methods:
        public void MakeSound() {//Name: MakeSound
            //Inputs: none
            System.out.println("Meow");//What it should do: print "Meow" to the screen
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
            System.out.println("*cat pounces*");//What it should do: print "*cat pounces*"
            //returns: nothing
        }
}