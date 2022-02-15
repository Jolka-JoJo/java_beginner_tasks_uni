package Task8;

import java.util.Scanner;

public class Task8Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Įveskite skaičių, kurį norite suapvalinti");
        double number = in.nextDouble();

        System.out.println("Iki kelinto skaičio norite suapvalinti");
        int digit = in.nextInt();

        System.out.println("Suapvalintas skaičius: " + round(number,digit));

    }

    public static double round(double number, int digit){

        number = number * Math.pow(10,digit);
        if(((int)(number*10))%10 > 4){
            number++;
        }
        int temp = (int) number;
        number = (double)temp/Math.pow(10,digit);
        return number;
    }
}
