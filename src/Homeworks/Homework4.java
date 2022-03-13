package Homeworks;

import java.util.Locale;

public class Homework4 {
    public static void main(String[] args) {

        /**
         * Task -1
         * using Ternary operator assign value to int-variable
         *
         * Variable -> result1
         * if the length of sentence1-String is greater or equals to 5
         *      value in result1 should be 10
         * else
         *      value in result should be 15
         *
         * print:
         *      value of sentence1
         *      length of sentence1
         *      value of result1
         */
        // variable = condition(s) ? valueIfTrue : valueIfFalse

        String sentence1 = "Spring is in the air";

        System.out.println(sentence1);
        System.out.println(sentence1.length());
        int result1 = sentence1.length();

        int  result2 = result1 >= 5 ? 10 : 15;
        System.out.println(result2);

        /**
         * Task - 2
         *
         * Create a String Variable and store your full name in it.
         * Print the following values:
         *  1. length of your full name
         *  2. check if your name ends with "a" (ignore the case)
         *  3. check if your name contains with "a" (ignore the case)
         *
         */
         String myFullName = "Madina Berdova";
         int lengthOFMyFullName = myFullName.length();
         System.out.println("\n Length of my full name " + lengthOFMyFullName);

        boolean myNameEndsWith_a = myFullName.endsWith("a");
        System.out.println("\n My name ends with 'a' ---> " + myNameEndsWith_a);

        boolean myNameContains_a = myFullName.contains("a");
        System.out.println("\n My name contains 'a' ---> " + myNameContains_a);

        /** Task 3
        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        /**
         * Print the results for:
         *  1. task3-value contains "king" (ignore cases)
         *  2. index of first occurrence of "EW" (ignore cases)
         */
        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";

        String task3LowerCase = task3.toLowerCase();
        System.out.println("\n" + task3LowerCase);
        boolean task3ContainsKing = task3LowerCase.contains("king");
        System.out.println("\n" + task3ContainsKing);


        String task4 = "kINg";
        String task5 = "QUEEN";
        /**
         * Convert the value in task4 variable into Titlecase
         *      (FirstCharacterUppercase and rest all in lowercase)
         *
         * "kINg" -> "King"
         * "QUEEN" -> "Queen"
         */
        String task4_LC = task4.toLowerCase();
        System.out.println("\n" + task4_LC);
        String task4With_UpCK = task4_LC.replace("k","K");
        System.out.println("\n" + task4With_UpCK);

        String task5_LC = task5.toLowerCase();
        String task5With_UpCK = task5_LC.replace("q","Q");
        System.out.println("\n" + task5With_UpCK);


    }
}
