package com.company;

/**
 * Created by mh6900 on 2/4/2019.
 */
public class Animal {
    //properties
    String species;
    String name;
    String color;
    int age;

    //constructors
    public Animal(String Color, String Name, String Species){
        species = Species;
        name = Name;
        color = Color;
        age = 0;
    }

    //methods
    public void MakeSound(){
        System.out.println("Grrrrr");
    }
    public void SetAge(int newAge){
        age = newAge;
    }
    public void PrintDescription(){
        System.out.println(name + " is a " + age + " year old, " + color + " " + species);
    }
}
