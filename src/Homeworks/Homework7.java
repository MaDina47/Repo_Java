package Homeworks;

public class Homework7 {
    public static void main(String[] args) {
        // Due Date: Mar 27 2022
        /**
         * Q1:
         * Create a method to make abbreviation for a given sentence
         * Method should return
         * Questions to answer before creating a method:
         *  1. what is the purpose of the method?   -   makeAbbreviation
         *  2. do I need any input from user?   -   1 (String)
         *  3. should we return any value in the end of method? - Yes
         *      If yes, then what is the datatype of returned value? - String
         *
         * public static String makeAbbreviation(String inputStr) {
         *      // code}
         */
        String s1 = "Beautiful Day";
        String s2 = "Estimated time arrIVAl";
        String s3 = "You only live ones";
        String s4 = "do it yourself";

        System.out.println(MyMethodHW7.createAbbreviation(s1));
        System.out.println(MyMethodHW7.createAbbreviation(s2));
        System.out.println(MyMethodHW7.createAbbreviation(s3));
        System.out.println(MyMethodHW7.createAbbreviation(s4));

        /**
         * Q2:
         * Create a method that will change the given sentence in Titlecase
         * Method should return
         */
        String s5 = "in mY huMBLE OPINION";
        String s6 = "i am a great programmer";
        String s7 = "dON'T gIVE uP";

        System.out.println(MyMethodHW7.titleCase(s5));
        System.out.println(MyMethodHW7.titleCase(s6));
        System.out.println(MyMethodHW7.titleCase(s7));

        /**
         * Q3:
         * Create method to find the maximum value from given int-array
         * Method should return
         *
         * Questions to answer before creating a method:
         *  1. what is the purpose of the method? - findMaxInArray
         *  2. do I need any input from user? - 1 (int[])
         *  3. should we return any value in the end of method? - yes
         *      If yes, then what is the datatype of returned value? - int
         *
         * int maxNum = inputArray[0]
         */
        int[] numbers1 = {20050, 6040, 5000, 100001, 1001};
        int[] numbers2 = {99, 0, 56, 540};
        int[] numbers3 = {0, -100, 100};

        MyMethodHW7 objectMax = new MyMethodHW7();

        System.out.println(objectMax.maxValue(numbers1));
        System.out.println(objectMax.maxValue(numbers2));
        System.out.println(objectMax.maxValue(numbers3));

        /**
         * Q4:
         * Create a method to find if the given string is palindrome (DO NOT ignore case)
         * Method should return (boolean)
         *
         * "hello" -> "olleh"   (not palindrome)
         * "eye" -> "eye"       (palindrome)
         * "level" -> true
         * "eye" -> true
         * "fall" -> false
         * "Level" -> false
         * "eYe" -> true
         * Eye -> false
         */
       String rev = "hello";
       String rev1 = "level";
       String rev2 = "eye";
       String rev3 = "fall";
       String rev4 = "Level";
       String rev5 = "eYe";
       String rev6 = "Eye";

        System.out.println(MyMethodHW7.palindrome(rev));
        System.out.println(MyMethodHW7.palindrome(rev1));
        System.out.println(MyMethodHW7.palindrome(rev2));
        System.out.println(MyMethodHW7.palindrome(rev3));
        System.out.println(MyMethodHW7.palindrome(rev4));
        System.out.println(MyMethodHW7.palindrome(rev5));
        System.out.println(MyMethodHW7.palindrome(rev6));

//        String newRev = MyMethodHW7.reverse((rev));
//        boolean trueOrFalse = newRev.equals(rev);
//        System.out.println("Is 'hello' a palindrome word --> " + trueOrFalse);
//
//        String newRev1 = MyMethodHW7.reverse(rev1);
//        boolean tOF1 =newRev1.equals(rev1);
//        System.out.println("Is 'level' a palindrome word --> " + tOF1);
//
//        String newRev2 = MyMethodHW7.reverse(rev2);
//        boolean tOF2 = newRev2.equals(rev2);
//        System.out.println("Is 'eye' a palindrome word --> " + tOF2);
//
//        String newRev3 = MyMethodHW7.reverse(rev3);
//        boolean tOF3 = newRev3.equals(rev3);
//        System.out.println("Is 'fall' a palindrome word --> " + tOF3);
//
//        String newRev4 = MyMethodHW7.reverse1(rev4);
//        boolean tOF4 = newRev4.equals(rev4);
//        System.out.println(tOF4);
//
//        String newRev5 = MyMethodHW7.reverse1(rev5);
//        boolean tOF5 = newRev5.equals(rev5);
//        System.out.println(tOF5);
//
//        String newRev6 = MyMethodHW7.reverse1(rev6);
//        boolean tOF6 = newRev6.equals(rev6);
//        System.out.println(tOF6);

        /**
         * Q5:
         * Create a method to find the longest String in the given String-array
         * Method should return (String)
         *
         * ["i am a great programmer", "Don't give up", "You can do it", "well done"] -> "i am a great programmer"
         *
         * Questions to answer before creating a method:
         *  1. what is the purpose of the method? - findMaxString
         *  2. do I need any input from user? - 1 (String[])
         *  3. should we return any value in the end of method? - yes
         *      If yes, then what is the datatype of returned value? - String
         */
        MyMethodHW7 objLongString = new MyMethodHW7();
        String[] maxSt = {"I Am a Great Programmer!", "Don't Give Up", "You can do it", "well done"};
        System.out.println(objLongString.longestString(maxSt));
    }
}
