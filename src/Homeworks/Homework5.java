package Homeworks;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {

        // Class 11 Due date: Sunday Mar 20
        /**
         * Q1:
         * Store a country name in a variable.
         * Print the name of country
         * Print the length of country name (NOTE: you CANNOT use length()-method from String class)
         *
         * Hint: you need to use split() method and length-variable (from Array)
         */ // System.out.println("Country name length = " + country.length());    // <-- CANNOT do it.


        String country = "Tajikistan";
        System.out.println("Country = " + country);
        String[] countryAfterSplit = country.split("");
        int lenOfCountry = countryAfterSplit.length;
        System.out.println("Length of the word Tajikistan = " + lenOfCountry);
        // System.out.println(Arrays.toString(countryAfterSplit));


        /**
         * Q2:
         * Print the number of words in the sentence-value
         */

        String sentence = "Never Give Up Because Great Things Take Time";
        String[] sentence_AfterSplitBySpace = sentence.split(" ");
        System.out.println("\n" + Arrays.toString(sentence_AfterSplitBySpace));

        int length = sentence_AfterSplitBySpace.length;
        System.out.println(length + " words in the sentence 'Never Give Up Because Great Things Take Time'");


        /**
         * Q3:
         * Create the abbreviation
         *
         * LaughIng OUT loud -> LOL
         * As soon as Possible -> ASAP
         * For Your Information -> FYI
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         */
        //1.
        String sentence1 = "LaughIng OUT loud ";
        String sentence1_UC = sentence1.toUpperCase();
        String[] sentence1AfterSplit = sentence1_UC.split(" ");
        System.out.println("\n" + Arrays.toString(sentence1AfterSplit));

        char charAtIndex0 = sentence1_UC.charAt(0);
        char charAtIndex9 = sentence1_UC.charAt(9);
        char charAtIndex13 = sentence1_UC.charAt(13);
        System.out.println("\n" + charAtIndex0 + charAtIndex9 + charAtIndex13);

        //second way using substring
        String sentence1_1 = "LaughIng OUT loud ";
        String sentence1_1_UC = sentence1_1.toUpperCase();
        String[] sentence1_1AfterSplit = sentence1_1_UC.split(" ");
        System.out.println(sentence1_1AfterSplit[0].substring(0, 1) + sentence1_1AfterSplit[1].substring(0, 1) + sentence1_1AfterSplit[2].substring(0, 1));

        //2.
        String sentence2 = "As soon as Possible";
        String sentence2_UP = sentence2.toUpperCase();
        String[] sentence2AfterSplit = sentence2_UP.split(" ");
        System.out.println("\n" + Arrays.toString(sentence2AfterSplit));

        char stnc2AtIndex0 = sentence2_UP.charAt(0);
        char stnc2AtIndex3 = sentence2_UP.charAt(3);
        char stnc2AtIndex8 = sentence2_UP.charAt(8);
        char stnc2AtIndex11 = sentence2_UP.charAt(11);
        System.out.println("\n" + stnc2AtIndex0 + stnc2AtIndex3 + stnc2AtIndex8 + stnc2AtIndex11);

        //second way using substring
        String sentence2_2 = "As soon as Possible";
        String sentence2_2_UC = sentence2_2.toUpperCase();
        String[] sentence2_2AfterSplit = sentence2_2_UC.split(" ");
        System.out.println(sentence2_2AfterSplit[0].substring(0, 1) + sentence2_2AfterSplit[1].substring(0, 1) + sentence2_2AfterSplit[2].substring(0, 1) + sentence2_2AfterSplit[3].substring(0, 1));


        //3.
        String sentence3 = "For Your Information";
        String sentence3_UP = sentence3.toUpperCase();
        String[] sentence3AfterSplit = sentence3_UP.split(" ");
        System.out.println("\n" + Arrays.toString(sentence3AfterSplit));

        char stnc3AtIndex0 = sentence3_UP.charAt(0);
        char stnc3AtIndex4 = sentence3_UP.charAt(4);
        char stnc3AtIndex9 = sentence3_UP.charAt(9);
        System.out.println("\n" + stnc3AtIndex0 + stnc3AtIndex4 + stnc3AtIndex9);

        //third way using substring
        String sentence3_3 = "For Your Information";
        String sentence3_3_UC = sentence3_3.toUpperCase();
        String[] sentence3_3AfterSplit = sentence3_3_UC.split(" ");
        System.out.println(sentence3_3AfterSplit[0].substring(0, 1) + sentence3_3AfterSplit[1].substring(0, 1) + sentence3_3AfterSplit[2].substring(0, 1));

        /**
         * Q4:
         * Create an int-variable and store any value in it
         * if the value is divisible by 5, print "divisible by 5"
         * if the value is divisible by 3, print "divisible by 3"
         * if the value is divisible by 5 and 3, print "divisible by 5 and 3"
         * if the value is NOT divisible by 5 and 3, print "NOT divisible by 5 and 3"
         *
         */
        int x = 27;
        if (x % 5 == 0) {
            System.out.println("\n" + x + " is not divisible by 5");

        } else if (x % 3 == 0) {
            System.out.println("\n" + x + " is divisible by 3");

        } else if (x % 5 == 0 && x % 3 == 0) {
            System.out.println("\nDivisible by 5 & 3");

        } else {
            System.out.println("Not divisible by 5 and 3");
        }


        /**
         * Q5:
         * Create two variables to store student-score and max-score (max score a student can get)
         * based on student percentage, print the grade:
         *
         * 91-100%      -> Grade A
         * 81-90.99%    -> Grade B
         * 71-80.99%    -> Grade C
         * 61-70.99%    -> Grade D
         * below 60.99% -> Grade E
         *
         * double studentScore = -5 (studentScore <= maxScore)
         * int maxScore = -1 (maxScore > 0)
         *
         * (studentScore/maxScore)*100 = 92.2
         *
         * Your grade = A, percentage = 92.2
         * if student-score is invalid, print "Invalid student score entered"
         * if max-score is invalid,  print "Invalid max score entered"
         *
         */
/**
 int maxScore = 100;
 double student1 = 99.2;
 double student2 = -1;
 double student3 = 69.9;



 double studScore = (92.2/maxScore)*100;
 System.out.println(studScore);


 // double studentScore =  (studscore <= maxScore);


 /**
 * Q6:
 * String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"}
 * print the values which has length greater than 5 and starts with l
 *
 * expected ans:
 * learning
 * living standard
 *
 */

        String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live", "give", "living standard", "life"};

           for (int i = 0; i < words.length; i++) {
            //System.out.println("\n" + words[i]);
            if (words[i].length() >5 && words[i].startsWith("l")){
                System.out.println(words[i]);
            }

        }



        }

    }






