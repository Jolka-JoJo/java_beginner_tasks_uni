package Task2;

import java.util.Scanner;

public class Task2Main {

    public static boolean LeapYear (Integer year){
        boolean isLeapYear = false;
        if (year%400==0){
            isLeapYear = true;
        }else if(year%100!=0 & year%4==0) {
            isLeapYear = true;
        }

        return isLeapYear;
    }

    public static void main(String[] args) {

        System.out.println("Įveskite metus:");

        Scanner in = new Scanner(System.in);
        Integer year = in.nextInt();

        if (LeapYear(year))
        {
            System.out.println("Tai keliamieji metai");
        } else{
            System.out.println("Tai nėra keliamieji metai");
        }


    }
}
