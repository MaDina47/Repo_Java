package Homeworks;

public class Homework2 {

    /**
     * 1. number of minutes in 1 hour
     * 2. max no. of days in a year
     * 3. total number of employees in an organization
     * 4. Population in a country
     * 5. Mortgage rate
     * 6. Balance in a bank account
     * 7. does the sun rise from the West?
     * 8. Initials of your name (Use: char)
     * 9. Store your full name (Use: String)
     */
    //1.

    public static void main(String[] args) {

        byte numberOfMinutesInOneHour = 60;

        System.out.println("There is " + numberOfMinutesInOneHour + " minutes in one hour.");

    //2
        short daysInLeapYear =366;

        System.out.println("\nThe maximum number days in a year is " + daysInLeapYear + " and it's called a Leap Year");

    //3
        int numberOfEmployees = 1608000;

        System.out.println("\nIn 2021 Amazon employed " + numberOfEmployees + " full and part-time employees.");

    //4
       int theWorldLargestPopulation = 1448678882;

        System.out.println("\nChina has the the world's largest population, with " + theWorldLargestPopulation + " billion people.");

    //5

        float averageMortgageRate = 4.302F;

        System.out.println("\nAverage mortgage rate in US for 30 year is " + averageMortgageRate + "%");

    //6

        double bankAccountBalance = 100000.99;

        System.out.println("\nThe current balance on my bank account is $" + bankAccountBalance);

    //7
        boolean technosoftStudent = true;

        System.out.println("\nAre you Technosoft student? ----> " + technosoftStudent);

    //8

        char myFirstNameInitial = 'M';
        char myLastNameInitial = 'B';

        System.out.println("\nMy name initials are " + myFirstNameInitial + myLastNameInitial);

    //9

        String myName = "Madina";
        String myLastName = "Berdova";

        System.out.println("\nMy full name is " + myName +" "+ myLastName);

    }









}
