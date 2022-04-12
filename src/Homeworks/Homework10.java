package Homeworks;

import java.util.*;

public class Homework10 {
    public static void main(String[] args) {
        /**
         * Question 1:
         * Create a method that can return if a given-String-Array has duplicate values or not.
         *
         * Input: String-Array
         * Return type: boolean
         *
         * create String-List using given-String-Array
         * create a String-Set using String-List
         * compare size of Set and List
         */

        /**
         * Question 2:
         * Create a method that would return the duplicate values of a given-String-Array (ignore the case)
         *
         * Input: String-Array
         * Return type: (Array, List, Set)
         */

        String[] words = {"Madina", "Masrur", "George", "Gunel", "Madina"};
        String[] words1 = {"is a great programmer", "happy", "achievement", "laugh", "IS a grEat proGRaMmer", "technosoft"};

        List varName = returnDuplicate(words);
        List varName1 = returnDuplicate(words1);

        System.out.println(varName);
        System.out.println(varName1);

    }
    //1
    public static boolean isDuplicate (String[] input){
        ArrayList<String> input1 = new ArrayList<>(Arrays.asList(input));
        Set<String> dp = new HashSet<>(input1);
       boolean dd = (input1.size() == dp.size());
        return dd;
    }
    //2
    public static ArrayList<String> returnDuplicate (String[] inputString){
        ArrayList<String> newArrayList = new ArrayList<>();
        for (int i = 0; i < inputString.length; i++) {
            for (int j = i+1; j < inputString.length; j++) {
                if (inputString[i].equalsIgnoreCase(inputString[j])){
                    newArrayList.add(inputString[i]);
                }
            }
        }
        return newArrayList;
    }




    }



