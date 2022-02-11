package Task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task5Main {


    public static void main(String[] args) throws FileNotFoundException {
        int allNumb = 0;
        int [] numbArray = new int[10];
        File f = new File("src/Task5/data.txt");
        Scanner data = new Scanner(f);
        while(data.hasNext()){
            numbArray[data.nextInt()]++;
            allNumb++;
        }

        System.out.println("Moksleivis sugalvojo " + allNumb + " skaičius");
        System.out.println("Skaičius Kiekis");
        for (int i = 0; i < 10; i++){
            System.out.println("  " + i + "        " + numbArray[i]);
        }
    }
}
