package Homeworks;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Homework8 {
    public static void main(String[] args) {
        timeLine1(11);

//        timeLine(5);
    }

    public static void timeLine1(int timeInput) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("ha");
        System.out.println("Now");
        for (int i = 0; i < timeInput; i++) {
            cal.add(Calendar.HOUR, 2);
            Date dtFormat = cal.getTime();
            System.out.print(" " + sdf.format(dtFormat).toLowerCase());
        }
    }


//    public static void timeLine (int timeInput) {
//        Date tm =new Date();
//        System.out.println(tm);
//       SimpleDateFormat sdf = new SimpleDateFormat("k");
//       int hour = Integer.valueOf(sdf.format(tm));
//        System.out.println("Now");
//        for(int i=0; i<timeInput-1; i++){
//            hour+=2;
//            if(hour>=1 && hour <12){
//                System.out.println(hour%12 + "am");
//            }else if(hour>12 && hour <24){
//                System.out.println(hour % 12 + "pm");
//            }else if (hour == 12){
//                System.out.println("12pm");
//            }else if (hour == 24){
//                System.out.println("12am");
//                hour = 0;
//            }else if (hour > 24) {
//                System.out.println(hour % 12 + " AM");
//                hour = hour % 12;
//            }
//        }
//
//    }

    //       public static void timeLineg(int tInput){
    //        Date now = new Date();
//        Calendar cal = Calendar.getInstance();
//        SimpleDateFormat sdf = new SimpleDateFormat("hha");
//        SimpleDateFormat startHourFormat = new SimpleDateFormat("H");
//        int startHour = Integer.parseInt(startHourFormat.format(cal.getTime()));
//
//        for (int i = startHour; i < startHour + 22; i += 2) {
//            cal.set(Calendar.HOUR_OF_DAY, i);
//            System.out.print(sdf.format(cal.getTime()));
//        }
//}
}









