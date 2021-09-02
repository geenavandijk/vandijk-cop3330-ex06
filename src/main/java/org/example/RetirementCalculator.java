/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */


package org.example;

import java.time.Year;

import java.util.Scanner;

public class RetirementCalculator {

    public static void main (String[] agrs){

        Scanner input = new Scanner(System.in);

        int year;
        year = Year.now().getValue();

        System.out.println("What is your current age?");

        int age = input.nextInt();

        System.out.println("At what age would you like to retire?");

        int retireAge = input.nextInt();

        int years = retireAge - age;

        System.out.println("you have " + years+ " left until you can retire.");

        System.out.printf("It's %d, so you can retire in %d", year,year+years);

    }//End of method
}//End of class
