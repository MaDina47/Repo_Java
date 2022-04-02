package CodeTest;

import java.util.Arrays;

public class CodeTest {
    public static void main(String[] args) {

        //1
        int[] numbers = new int[]{32, 54, 12, 67, 2, 5};
        int[] numbers1 = new int[]{5, 4, 3, 1, 2};
        int[] numbers2 = new int[]{90, 34, 12, 4};

        System.out.println(Arrays.toString(sortArray(numbers)));
        System.out.println(Arrays.toString(sortArray(numbers1)));
        System.out.println(Arrays.toString(sortArray(numbers2)));

        //2
        int num = 123;
        int num1 = 323;
        int num2 = 90;

        CodeTest newVal = new CodeTest();
        System.out.println(newVal.total(num));
        System.out.println(newVal.total(num1));
        System.out.println(newVal.total(num2));

        //3
//        input -> 23, {23, 54, 67, 12, 34, 23, 56}
//        returned array -> {54, 67, 12, 34, 56}
        int[] a = new int[] {23, 54, 67, 12, 34, 23, 56};
        int b = 23;

//        input -> 5, {23, 5, 67, 87, 10, 5, 34, 98, 66, 55}
//        returned array -> {23, 67, 87, 10, 34, 98, 66, 55}
        int[] c = new int[] {23, 5, 67, 87, 10, 5, 34, 98, 66, 55};
        int d = 5;

//        input -> 11, {22, 11, 33, 44, 55}
//        returned array -> {22, 33, 44, 55}
        int[] e = new int[] {22, 11, 33, 44, 55};
        int f = 11;

        System.out.println(Arrays.toString(CodeTest.removeNumberFromArray(a,b)));
        System.out.println(Arrays.toString(CodeTest.removeNumberFromArray(c,d)));
        System.out.println(Arrays.toString(CodeTest.removeNumberFromArray(e,f)));

        //4
        String[] ab = {"i Am", "king", "great", "living standard", "programmer"};
        String[] cd = {"programmer", "king kong", "GREAT", "PEACE", "I AM"};
        commonString(ab,cd);
    }

    // My Methods

        public static int[] sortArray (int[] inputArrays) {
            int temp;
            for (int i = 0; i < inputArrays.length; i++) {
                for (int j = i + 1; j < inputArrays.length; j++) {
                    if (inputArrays[i] > inputArrays[j]) {
                        temp = inputArrays[i];
                        inputArrays[i] = inputArrays[j];
                        inputArrays[j] = temp;
                    }
                }
            }
            return inputArrays;
        }


        public int total (int values) {
        String num = String.valueOf(values);
        String[] newNum = num.split("");
        int total = 0;
        for (int i = 0; i < newNum.length; i++) {
            total += Integer.valueOf(newNum[i]);
        }
        return total;
    }

     //3
//        input -> 23, {23, 54, 67, 12, 34, 23, 56}
//       * returned array -> {54, 67, 12, 34, 56}

    public static int[] removeNumberFromArray (int[] numberArray, int input){
        int number=0;
        for (int i = 0; i < numberArray.length; i++) {
            if (input != numberArray[i]) {
                number++;
            }
        }
        int[] outputArray = new int[number];
        int temp = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (input != numberArray[i]){
                outputArray[temp] = numberArray[i];
                temp++;
            }
        }
        return outputArray;
    }

    public static void commonString (String[] word, String[] anotherWord){
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < anotherWord.length; j++) {
                if (word[i].equalsIgnoreCase(anotherWord[j])){
                    System.out.println(word[i].toLowerCase());
                }
            }
        }
    }


}