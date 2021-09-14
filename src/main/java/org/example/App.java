package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;
import java.util.Calendar;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        // Calculates what year user will retire using user input
        System.out.print("What is your current age? ");
        int age = input.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retire = input.nextInt();

        int retireyr = retire - age;

        System.out.println("You have " + retireyr + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " + (year + retireyr));
    }
}
