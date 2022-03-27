package Homeworks;

public class MyMethodHW7<revName1> {
    public static String createAbbreviation(String sentence) {
        //sentence = " ";
        String newsent = "";
        String[] sentenceAfterSplit = sentence.toUpperCase().split(" ");
        //System.out.println("\n" + Arrays.toString(sentence1AfterSplit));
        for (int i = 0; i < sentenceAfterSplit.length; i++) {
            newsent = newsent + sentenceAfterSplit[i].charAt(0);
        }
        return newsent;

    }


    public static String titleCase(String ToTitleCase) {
        //String sent = " ";
        String[] sentAfterSplit = ToTitleCase.toLowerCase().split(" ");
        String result = "";
        // System.out.println(Arrays.toString(sentAfterSplit));
        for (int i = 0; i < sentAfterSplit.length; i++) {
            result += sentAfterSplit[i].substring(0, 1).toUpperCase() + sentAfterSplit[i].substring(1).toLowerCase() + " ";
        }
        return result.trim();

    }


    public int maxValue(int[] number) {
        int maxValue = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxValue) {
                maxValue = number[i];
            }
        }
        return maxValue;
    }

    public static String reverse(String revString) {
        //String reString = "";
        String[] stringAfterSplit = revString.split("");
        String revName = "";
        for (int i = 1; i <= stringAfterSplit.length; i++) {
            revName = revName + stringAfterSplit[stringAfterSplit.length - i];
        }
        return revName;
    }

    public static String reverse1(String revString1) {
        //String revString1 = " ";
        String[] revArray1 = revString1.split("");
        String revName1 = "";
        for (int i = revArray1.length - 1; i >= 0; i--) {
            revName1 += revArray1[i];
        }
        return revName1;
    }

    public static Boolean palindrome (String toCheck){
        boolean result = reverse1(toCheck).equals(toCheck);
        //System.out.println(result);
        return result;
    }

    public String longestString (String[] words) {
        //String[] words = {"i am a great programmer", "Don't give up", "You can do it" , "well done"};
        String longstr = words[0];
        for (int i = 0; i<words.length; i++) {
            if (words[i].length()>longstr.length()) {
                longstr = words[i];
            }
        }
        return longstr;
    }

}













