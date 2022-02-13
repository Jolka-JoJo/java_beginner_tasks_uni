package Task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task6Main {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("src/Task6/data.txt");
        Scanner data = new Scanner(f);
        String all_numbers = data.nextLine();
        String [] numberString  = all_numbers.split(" ");
        Integer [] numbersInt = new Integer[numberString.length];

        Integer sum = 0;

        for (int i=0; i < numberString.length; i++){
            sum += Integer.parseInt(numberString[i]);
            numbersInt[i] = Integer.parseInt(numberString[i]);
        }

        Double average = sum.doubleValue()/numbersInt.length;
        Arrays.sort(numbersInt);

        System.out.println("Nuskaitytų skaičių vidurkis: " + average);
        System.out.print("Nuskaitytų skaičių mediana: ");

        if(numbersInt.length%2==0){
            Double mediana = (numbersInt[numbersInt.length/2]+numbersInt[numbersInt.length/2-1])/2.0;
            System.out.println(mediana);
        }else {
            System.out.println(numbersInt[numbersInt.length/2]);
        }

    }
}
