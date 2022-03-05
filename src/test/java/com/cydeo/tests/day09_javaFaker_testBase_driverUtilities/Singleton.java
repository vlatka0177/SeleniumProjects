package com.cydeo.tests.day09_javaFaker_testBase_driverUtilities;

public class Singleton {

    // #1 Create a private constructor.
    private Singleton(){}

    // #2 Create private static String to prevent access and provide a getter method.
    private static String word;

    // This utility method returns the 'word' in the desired way.
    public static String getWord(){

        if (word == null){
            System.out.println("First time call. Word object is null." + " Assigning value to it now!");
            word = "something";
        }else{
            System.out.println("Word already has value.");
        }
        return word;
    }
}
