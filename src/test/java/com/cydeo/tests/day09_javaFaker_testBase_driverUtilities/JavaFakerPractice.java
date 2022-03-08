package com.cydeo.tests.day09_javaFaker_testBase_driverUtilities;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
        // Create a Faker object to reach methods
        Faker faker = new Faker();

        // name() method returns a random name from the library
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        // numerify() method returns random numbers in place of '#'
        System.out.println("faker.numerify(\"240-###-####\") = " + faker.numerify("240-###-####"));

        // letterify() method returns random letters in place of '?'
        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????"));

        // bothify
        System.out.println("faker.bothify(\"##?#-##?#-#?#?#-##??\") = " + faker.bothify("##?#-##?#-#?#?#-##??"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-", ""));
        // 6007224637046281

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", ""));
    }   // Knows the last digit of PI
}
