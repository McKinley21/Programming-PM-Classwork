package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Login application:

        //You are to create a program that can store login information. It should also allow users to "login"

        //Your program needs to do the following:

        Scanner console = new Scanner(System.in);
        ArrayList usernames = new ArrayList();
        ArrayList passwords = new ArrayList();
        while (true) {
            System.out.println("Would you like to (create account) or (login)?");//Ask the user if they want to "create account" or "login"
            String userInput = console.nextLine();
            if (userInput.equals("create account")) {//If they select create account you should...
                while (true) {
                    System.out.println("Enter Username:");//prompt them for a username
                    String enteredUsername = console.nextLine();
                    if (usernames.contains(enteredUsername)) {//If the username already exists in the system have them...
                        System.out.println("Username already used.");
                        continue;//re-enter a different user name.
                    } else {
                        System.out.println("Enter Password:");//After they have a username ask for for a password.
                        String enteredPassword = console.nextLine();
                        usernames.add(enteredUsername);//Your program should save this information
                        passwords.add(enteredPassword);//Your program should save this information
                        break;//go back to asking if they would like to "create an account" or "login"
                    }
                }
            }
            else if (userInput.equals("login")) {//If they choose to login...
                System.out.println("Enter Username:");//ask for a username
                String searchedUsername = console.nextLine();
                System.out.println("Enter Password:");//ask for a password
                String searchedPassword = console.nextLine();
                int usernamesIndex = usernames.indexOf(searchedUsername);
                int passwordsIndex = passwords.indexOf(searchedPassword);
                if (usernames.contains(searchedUsername) && passwords.contains(searchedPassword)) {//see if there is an account that matches the credentials.
                    if (usernamesIndex == passwordsIndex) {//If it matches...
                        System.out.println("Welcome, " + searchedUsername + "!");//print "Welcome, " + username + "!"
                        System.exit(0);//close the program
                    }
                    else {//If it does not match...
                        System.out.println("Sorry, account doesn't match records.");//print "sorry account does not match records"
                        continue;//return to asking if they would like to "create an account" or "login"
                    }
                }
                else {//If it does not match...
                    System.out.println("Sorry, account doesn't match records.");//print "sorry account does not match records"
                    continue;//return to asking if they would like to "create an account" or "login"
                }
            }
        }

        //Example:
        //Input          	Output
        //                  Would you like to (create account) or (login)?
        //login
        //                  Enter Username:
        //Bob
        //                  Enter Password:
        //Ross
        //                  Sorry, account doesn't match records.
        //                  Would you like to (create account) or (login)?
        //create account
        //                  Enter Username:
        //Bob
        //                  Enter Password:
        //Ross
        //                  Would you like to (create account) or (login)?
        //create account
        //                  Enter Username:
        //JamesBond007
        //                  Enter Password:
        //GoldenGun
        //                  Would you like to (create account) or (login)?
        //login
        //                  Enter Username:
        //Bob
        //                  Enter Password:
        //GoldenGun
        //                  Sorry, account doesn't match records.
        //                  Would you like to (create account) or (login)?
        //login
        //                  Enter Username:
        //Bob
        //                  Enter Password:
        //Ross
        //                  Welcome, Bob!
    }
}
