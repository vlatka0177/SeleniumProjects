package com.cydeo.tests.day09_javaFaker_testBase_driverUtilities;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test
    public void singleton_understand_test1() {

        String str1 = Singleton.getWord();
        System.out.println("str1 = " + str1);
        // First time call. Word object is null. Assigning value to it now!
        // str1 = something

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2);
        // Word already has value.
        // str2 = something

        String str3 = Singleton.getWord();
        System.out.println("str3 = " + str3);
        // Word already has value.
        // str3 = something
    }

    @Test
    public void singleton_understanding_test2(){
        String str4 = Singleton.getWord();
        System.out.println("str4 = " + str4); 
        // Word already has value.
        // str4 = something
    }
}
