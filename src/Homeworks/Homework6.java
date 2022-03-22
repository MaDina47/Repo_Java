package Homeworks;

import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args) {
        // Due date: Mar 22, 2022
        /**
         * Q1:
         * Create the abbreviation
         * Beautiful Day-> BD
         * Estimated time arrIVAl -> ETA
         * You only live ones -> YOLO
         * do it yourself -> DIY
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         */
        //1
        String sentence1 = "Beautiful Day";
        String newsent1 = "";
        String[] sentence1AfterSplit = sentence1.toUpperCase().split(" ");
        //System.out.println("\n" + Arrays.toString(sentence1AfterSplit));
        for (int i = 0; i < sentence1AfterSplit.length; i++) {
            newsent1 = newsent1 + " " + sentence1AfterSplit[i].charAt(0);
        }
        System.out.println("\n" + newsent1);

        //2
        String sentence2 = "Estimated time arrIVAl";
        String newsent2 = "";
        String[] sentence2AfterSplit = sentence2.toUpperCase().split(" ");
        //System.out.println("\n" + Arrays.toString(sentence2AfterSplit));
        for (int i = 0; i < sentence2AfterSplit.length; i++) {
            newsent2 = newsent2 + " " + sentence2AfterSplit[i].charAt(0);
        }
            System.out.println("\n" + newsent2);

        //3
        String sentence3 = "You only live ones";
        String newsent3 = "";
        String[] sentence3AfterSplit = sentence3.toUpperCase().split(" ");
        //System.out.println("\n" + Arrays.toString(sentence3AfterSplit));
        for (int i = 0; i < sentence3AfterSplit.length; i++) {
            newsent3 = newsent3 + " " + sentence3AfterSplit[i].charAt(0);
        }
            System.out.println("\n" + newsent3);

        //4
        String sentence4 = "do it yourself";
        String newsent4 = "";
        String[] sentence4AfterSplit = sentence4.toUpperCase().split(" ");
        //System.out.println("\n" + Arrays.toString(sentence4AfterSplit));
        for (int i = 0; i < sentence4AfterSplit.length; i++) {
            newsent4 = newsent4 + " " + sentence4AfterSplit[i].charAt(0);
        }
        System.out.println("\n" + newsent4);


        /**
         * Q2:
         * Reverse the given String
         * For your information -> information your for
         * Luck -> kcul
         * HAppy nEw Year -> year new happy
         */
        //1
        String revString = "";
        String string = "For your information";
        String[] stringtAfterSplit = string.toLowerCase().split(" ");
        for (int i=1; i<=stringtAfterSplit.length; i++){
            revString = revString + " " + stringtAfterSplit[stringtAfterSplit.length-i];
        }
        revString=revString.trim();
        System.out.println("Reversed string ----> " + revString);

        //2
        String revString1 = "";
        String string1 = "Luck";
        String[] string1AfterSplit = string1.toLowerCase().split(" ");
        // System.out.println(Arrays.toString(sent1AfterSplit));
        for (int i=1; i<=string1AfterSplit.length; i++){
            revString1 += " " + string1AfterSplit[string1AfterSplit.length-i];
        }
        revString1 = revString1.trim();
        System.out.println("Reversed string ----> " + revString1);

        //3
        String revString2 = "";
        String string3 = "HAppy nEw Year";
        String[] string3AfterSplit = string3.toLowerCase().split(" ");
        //System.out.println(Arrays.toString(string3AfterSplit));
        for (int i=1; i<=string3AfterSplit.length; i++){
            revString2 += " " + string3AfterSplit[string3AfterSplit.length-i];
        }
        revString2 = revString2.trim();
        System.out.println("Reversed string ----> " + revString2);

        /**
         * Q3:
         * Convert the String value in to Titlecase
         * in mY huMBLE OPINION -> In My Humble Opinion
         * i am a great programmer -> I Am A Great Programmer
         * dON'T gIVE uP -> Don't Give Up
         */
        //1

        String sent = "in mY huMBLE OPINION";
        String[] sentAfterSplit = sent.toLowerCase().split(" ");
        String result = "";
        // System.out.println(Arrays.toString(sentAfterSplit));
        for (int i=0; i<sentAfterSplit.length; i++) {
            result += sentAfterSplit[i].substring(0,1).toUpperCase()  + sentAfterSplit[i].substring(1).toLowerCase()+ " ";
        }

        System.out.println("\n" + result);

        String sent1 = "i am a successful pRogrammer";
        String result1 = "";
        String[] sent1AfterSplit = sent1.split(" ");
        //System.out.println(Arrays.toString(sent1AfterSplit));
       for (int i=0; i<sent1AfterSplit.length; i++){
           result1 += sent1AfterSplit[i].substring(0,1).toUpperCase() + sent1AfterSplit[i].substring(1).toLowerCase() + " ";
        }
        System.out.println(result1);

        String sent2 = "dON'T gIVE uP";
        String[] sent2AfterSplit = sent2.split(" ");
        String result2 = "";
        // System.out.println(Arrays.toString(sent2AfterSplit));
        for (int i=0; i<sent2AfterSplit.length; i++) {
            result2 += sent2AfterSplit[i].substring(0,1).toUpperCase()  + sent2AfterSplit[i].substring(1).toLowerCase()+ " ";
        }
        System.out.println(result2);


        /**
         * Q4:
         * Find the minimum value from the given array
         * int[] numbers = {-1, 1};     ->  -1
         * int[] numbers = {1, 21, 87, 23};     -> 1
         * int[] numbers = {87, 23, 89, 0, 54, 23}; -> 0
         */
        int[] numbers1 = {20050, 6040, 5000, 100001, 1001};
        int[] numbers2 = {99, 0, 56, 540};
        int[] numbers3 = {0, -100, 100};

        int minValue1 = numbers1[0];
        //1
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] < minValue1) {
                minValue1 = numbers1[i];}
        }
            System.out.println("\nMin value ---> " + minValue1);
        //2
        int minValue2 = numbers2[0];
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] < minValue2){
                minValue2 = numbers2[i];}
        }
                System.out.println("Min value ---> " + minValue2);
        //3
        int minValue3 = numbers3[0];
        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] < minValue3){
                minValue3 = numbers3[i];}
        }
                   System.out.println("Min value ---> " + minValue3);


    }
}


























