package Homeworks;

public class Homework3 {

    public static void main(String[] args) {

        /**
         * Convert degree-Celsius into deg-Fahrenheit
         *
         * fT = cT × 9/5 + 32
         * T(K) = T(°C) + 273.15
         * T(°C) = (T(°F) - 32) × 5/9
         * T(K) = (T(°F) + 459.67)× 5/9
         * T(°C) = T(K) - 273.15
         * T(°F) = T(K) × 9/5 - 459.67
         */
        double cTemp = 8;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println("\n" + cTemp + "˚C is equal to " + fTemp + "°F");

        cTemp = 8;
        double kTemp = cTemp + 273.15;
        System.out.println("\n" + cTemp + "˚C is equal to " + kTemp + " ˚K");


        fTemp = 42;
        cTemp = (fTemp -32) * 5/9;
        System.out.println("\n" + fTemp + "°F is equal to " + cTemp + "˚C");

        kTemp = 350;
        kTemp = (fTemp + 459.67)* 5/9;
        System.out.println("\n" + fTemp + "°F is equal to " + kTemp + "˚K");


        cTemp = kTemp - 273.15;
        System.out.println("\n" + kTemp + "˚K is equal to " + cTemp + "˚C");

        fTemp = kTemp *9/5 - 459.67;
        System.out.println("\n" + kTemp + "˚K is equal to " + fTemp + "˚F");














    }











}
