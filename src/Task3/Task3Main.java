package Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Task3Main {

    public static void ArmstrongNumbers(int n){

        for (int number = 100; number < n; number++){
            int digit1 = number / 100;
            int digit2 = (number - digit1 * 100) / 10;
            int digit3 = number % 10;
            double digitSum = Math.pow(digit1, 3.0) + Math.pow(digit2, 3.0) + Math.pow(digit3, 3.0);

            if(digitSum == number){
                System.out.print(number+" ");
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("src/Task3/data.txt");
        Scanner data = new Scanner(f);
        int n = data.nextInt();
        data.close();

        System.out.println("Visi triženkliai Armstrongo skaičiai iki " + n + ":");
        ArmstrongNumbers(n);
    }
}
