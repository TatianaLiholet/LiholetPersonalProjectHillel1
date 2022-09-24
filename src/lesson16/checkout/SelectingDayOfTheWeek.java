package lesson16.checkout;

import java.util.Scanner;

public class SelectingDayOfTheWeek {

    public static void selectDay(DayOfWeak day) {
        day = DayOfWeak.valueOf(String.valueOf(day));
        switch (day) {
            case MONDAY:
                System.out.println("You will receive your order in Monday from 9 00 - 19 00.");
                break;
            case TUESDAY:
                System.out.println("You will receive your order in TUESDAY from 9 00 - 19 00.");
                break;
            case WEDNESDAY:
                System.out.println("You will receive your order in  WEDNESDAY from 9 00 - 19 00.");
                break;
            case THURSDAY:
                System.out.println("You will receive your order in  THURSDAY from 9 00 - 19 00.");
                break;
            case FRIDAY:
                System.out.println("You will receive your order in  FRIDAY from 9 00 - 19 00.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends. You will receive your order in Monday from 9 00 - 19 00");
                break;

            default:
                throw new IllegalArgumentException("Invalid name of product" + day);
        }
    }
}



