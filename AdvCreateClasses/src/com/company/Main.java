package com.company;

public class Main {

    public static void main(String[] args) {
        //Test Animal
            Animal Barry = new Animal("Bear","Barry");//create animal
            System.out.print("Bear's Name: ");
            Barry.PrintName();//call PrintName
            System.out.print("Bear's Sound: ");
            Barry.MakeSound();//call MakeSound
        System.out.println("");

        //Test Dog
            Dog Doug = new Dog("Doug",true);//create dog
            System.out.print("Dog's Name: ");
            Doug.PrintName();//call PrintName
            System.out.print("Dog's Sound: ");
            Doug.MakeSound();//call MakeSound
            Doug.PlayFetch();//call PlayFetch
            System.out.println("Docked Tail: " + Doug.getDockedTail());//call getDockedTail
        System.out.println("");

        //Test Cat
            Cat Kitty = new Cat("Kitty");//create cat
            System.out.print("Cat's Name: ");
            Kitty.PrintName();//call PrintName
            System.out.print("Cat's Sound: ");
            Kitty.MakeSound();//call MakeSound
            Kitty.SeeLaser();//call SeeLaser
            Kitty.BeHappy();//call BeHappy
        System.out.println("");

        //Test Orange Tabby
            OrangeTabby Tabitha = new OrangeTabby("Tabitha");//create orange tabby
            System.out.print("Orange Tabby's Name: ");
            Tabitha.PrintName();//call PrintName
            System.out.print("Orange Tabby's Sound: ");
            Tabitha.MakeSound();//call MakeSound
            Tabitha.LayOnLap();//call LayOnLap
            Tabitha.SeeLaser();//call SeeLaser
            Tabitha.BeHappy();//call BeHappy
        System.out.println("");

        //Test Russian Blue
            RussianBlue Russel = new RussianBlue("Russel");//create russian blue
            System.out.print("Russian Blue's Name: ");
            Russel.PrintName();//call PrintName
            System.out.print("Russian Blue's Sound: ");
            Russel.MakeSound();//call MakeSound
            Russel.SeeLaser();//call SeeLaser
            Russel.BeHappy();//call BeHappy
        System.out.println("");

        //Test Garfield
            Garfield Garfield = new Garfield();//create garfield
            System.out.print("Garfield's Name: ");
            Garfield.PrintName();//call PrintName
            System.out.print("Garfield's Sound: ");
            Garfield.MakeSound();//call MakeSound
            Garfield.LayOnLap();//call LayOnLap
            Garfield.SeeLaser();//call SeeLaser
            Garfield.BeHappy();//call BeHappy
        System.out.println("");
    }
}