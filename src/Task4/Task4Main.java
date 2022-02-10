package Task4;

import java.util.Scanner;

public class Task4Main {

    public static void countDigits(String number){

        int even = 0, uneven = 0;
        for (int i = 0; i < number.length(); i++){
            char digit = number.charAt(i);
            if(Character.getNumericValue(digit)%2==0){
                even++;
            }
            else{
                uneven++;
            }
        }
        System.out.println("Skaičių sudaro " + even + " iš lyginių ir "+ uneven +" iš nelyginių skaičių");

    }

    public static void main(String[] args) {

        System.out.println("Įveskite skaičių: ");
        Scanner in = new Scanner(System.in);
        String number = in.next();

        countDigits(number);

    }
}
