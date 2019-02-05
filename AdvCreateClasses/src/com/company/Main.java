package com.company;

public class Main {

    public static void main(String[] args) {
        //Test Animal
            Animal Barry = new Animal("Bear","Barry");//create animal
            Barry.PrintName();//call PrintName
            Barry.MakeSound();//call MakeSound
        System.out.println("");

        //Test Dog
            Dog Doug = new Dog("Doug",true);//create dog
            Doug.PrintName();//call PrintName
            Doug.MakeSound();//call MakeSound
            Doug.PlayFetch();//call PlayFetch
            Doug.getDockedTail();//call getDockedTail
        System.out.println("");

        //Test Cat
            Cat Kitty = new Cat("Kitty");//create cat
            Kitty.PrintName();//call PrintName
            Kitty.MakeSound();//call MakeSound
            Kitty.SeeLaser();//call SeeLaser
            Kitty.BeHappy();//call BeHappy
        System.out.println("");

        //Test Orange Tabby
            OrangeTabby Tabitha = new OrangeTabby("Tabitha");//create orange tabby
            Tabitha.PrintName();//call PrintName
            Tabitha.MakeSound();//call MakeSound
            Tabitha.LayOnLap();//call LayOnLap
            Tabitha.SeeLaser();//call SeeLaser
            Tabitha.BeHappy();//call BeHappy
        System.out.println("");

        //Test Russian Blue
            RussianBlue Russel = new RussianBlue("Russel");//create russian blue
            Russel.PrintName();//call PrintName
            Russel.MakeSound();//call MakeSound
            Russel.SeeLaser();//call SeeLaser
            Russel.BeHappy();//call BeHappy
        System.out.println("");

        //Test Garfield
            Garfield Garfield = new Garfield();//create garfield
            Garfield.PrintName();//call PrintName
            Garfield.MakeSound();//call MakeSound
            Garfield.LayOnLap();//call LayOnLap
            Garfield.SeeLaser();//call SeeLaser
            Garfield.BeHappy();//call BeHappy
        System.out.println("");
    }
}