package com.regex.test;

import com.regex.assignments.RegExMain;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RegExTest {

    @BeforeClass
    public static void welcomeText() {
        System.out.println("Welcome to User Registration Problem");
    }

    @Test
    public void validateFirstNameTest() {
        RegExMain obj = new RegExMain();
        System.out.println("Valid first name of user");
        String firstName = "Sambit";
        Assert.assertTrue(obj.validateFirstName(firstName));
    }

    @Test
    public void validateFirstNameLowerCaseShouldFail() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid first name of user which contains only lowercase");
        String firstName = "sambit";
        Assert.assertFalse(obj.validateFirstName(firstName));
    }

    @Test
    public void validateFirstNameLessThanThree() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid first name of user which having only three characters");
        String firstName = "Sam";
        Assert.assertFalse(obj.validateFirstName(firstName));
    }
    @Test
    public void validateLastNameTest() {
        RegExMain obj = new RegExMain();
        System.out.println("Valid last name of user");
        String lastName = "Ranjan";
        Assert.assertTrue(obj.validateLastName(lastName));
    }

    @Test
    public void validateLastNameLowerCaseShouldFail() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid last name of user which contains only lowercase");
        String lastName = "ranjan";
        Assert.assertFalse(obj.validateLastName(lastName));
    }

    @Test
    public void validateLastNameLessThanThree() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid last name of user which having only three characters");
        String lastName = "Ran";
        Assert.assertFalse(obj.validateLastName(lastName));
    }
}
