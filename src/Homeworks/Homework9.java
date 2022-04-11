package Homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Homework9 {
    public static void main(String[] args) {
        /**
         * Q1:
         *  Create method that will count (and return) the number of times a given String (ignoring the case) is present in given ArrayList
         *  name : getCount
         *  inputs : 2 (String, ArrayList<String>)
         *  return type : int
         */
        // public static int getCount(String valToCheck, ArrayList<String> arrayList) {
        //     // code
        // }

        ArrayList<String> names = new ArrayList<>();
        names.add("Happy");
        names.add("GroW");
        names.add("LeaRN");
        names.add("PeaCEfUL");
        names.add("Learning");
        names.add("HAPPy");
        names.add("Growing");
        names.add("ListeN");
        names.add("PEACE");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");
        names.add("QUeeN");
        names.add("YouNG");
        names.add("OLD");
        names.add("HAPPy");
        names.add("Growing");
        names.add("ListeN");
        names.add("PEACE");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");
        names.add("HAPPY");

        System.out.println("'Happy' occurs " + (arrayList("Happy", names) + " times in the given string"));

        /**
         * Q2:
         *  Create method that will return the number of ArrayList-values contains the given String (ignoring the case)
         *  name : getCount
         *  inputs : 2 (String, ArrayList<String>)
         *  return type : int
         */
        // public static int getContainsCount(String valToCheck, ArrayList<String> arrayList) {
        // // code
        // }

        System.out.println(contains("H",names));
        System.out.println(contains("HA",names));
        System.out.println(contains("ea",names));

        /**
         * Q3:
         * Create a method to return an int-array after removing input-int-value from an input-int-array
         *
         * -> How to create List using Array and vice-versa
         *
         * create a List using values of input-int-array
         * remove the input-int-value from List
         * create an int-array using List-values
         * return int-array
         *
         * int[] --> arrayList<Integer> --> remove(); --> int[]
         *
         */

        int[] numArray = {5,3,97,69,45,332};
        System.out.println(Arrays.toString(removeInt(numArray,332)));

    }

               // 1
   public static int arrayList (String checkVal, ArrayList<String> namesArr){
       int total =0;
      for ( int i=0; i<namesArr.size(); i++ ){
          if(namesArr.get(i).equalsIgnoreCase(checkVal)){
              total++;
          }
      }
      return total;
   }
                // 2
   public static int contains (String checkVal, ArrayList<String> namesArrContains){
       int total =0;
       for ( int i=0; i<namesArrContains.size(); i++ ){
           if(namesArrContains.get(i).contains(checkVal.toLowerCase())){
               total++;
           }
       }
       return total;
   }

                 // 3
       public static int[] removeInt (int[] input, int remove){

          ArrayList<Integer> integer = new ArrayList<Integer>();
         // List<Integer> integer1 = Arrays.stream(input).boxed().collect(Collectors.toList());

           for (int i = 0; i < input.length; i++) {
               integer.add(input[i]);
           }
           //integer.remove(remove);
           integer.remove(new Integer(remove));
           int[] newInt = new int[integer.size()];
           for (int i = 0; i < integer.size(); i++) {
               newInt[i] = integer.get(i);
           }
           return newInt;
       }













}
