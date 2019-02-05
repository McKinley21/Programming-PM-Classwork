package com.company;

/**
 * Created by mh6900 on 2/5/2019.
 */
public class Dog {//Class Name: Dog
    //Properties:
        String species;//species (string)
        String name;//name (string)
        boolean dockedTail;//dockedTail (boolean)

    //Constructor:
        public Dog(String Name, boolean DockedTail) {
            species = "Dog";//should set species to be "Dog"
            name = Name;
            dockedTail = DockedTail;
        }//should take 1 string and a boolean inputs and set the 1 other properties accordingly

    //Methods:
        public void MakeSound() {//Name: MakeSound
            //Inputs: none
            System.out.println("Woof");//What it should do: print "Woof" to the screen
            //returns: nothing
        }

        public void PrintName() {//Name: PrintName
            //Inputs: none
            System.out.println(name);//What it should do: print the name property to the screen
            //returns: nothing
        }

        public void PlayFetch() {//Name: PlayFetch
            //Inputs: none
            System.out.println("*chases ball 5 times then quits*");//What it should do: print "*chases ball 5 times then quits*" to the screen
            //returns: nothing
        }

        public boolean getDockedTail() {//Name: getDockedTail
            //Inputs: none
            return dockedTail;//What it should do: returns the dockedTail property
        }
}