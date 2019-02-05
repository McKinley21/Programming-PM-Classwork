package com.company;

/**
 * Created by mh6900 on 2/5/2019.
 */
public class RussianBlue {//Class Name: RussianBlue
    //Properties:
        String species;//species (string)
        String name;//name (string)

    //Constructor:
        public RussianBlue(String Name) {
            species = "Cat";//sets species property to be "Cat"
            name = Name;
        }//should take 1 string input and sets name property accordingly

    //Methods:
        public void MakeSound() {//Name: MakeSound
            //Inputs: none
            System.out.println("Hisss");//What it should do: print "Hisss" to the screen
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
            System.out.println("purrrr");//print "purrrr"
            SeeLaser();//call SeeLaser method
            //returns: nothing
        }

        public void SeeLaser() {//Name: SeeLaser
            //Inputs: none
            System.out.println("*cat pounces*");//What it should do: print "*cat pounces*"
            //returns: nothing
        }
}