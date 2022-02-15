package Task9;

import java.util.Scanner;

public class Task9Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Įveskite sveikąjį skaičių");
        int number = in.nextInt();

        System.out.println("Apverstas skaičius: " + flipNumber(number));
    }

    public static int flipNumber(int number){
        int length = String.valueOf(number).length();
        int newNumber = 0;
        for (int i = length-1; i >= 0; i--){
            int spot = (int)Math.pow(10,i);
            int digit =number % 10;
            newNumber += digit*spot;
            number -= digit;
            number /= 10;
        }

        return newNumber;
    }
}
