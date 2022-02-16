package Task10;

import java.io.File;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Task10Main {
    public static void main(String[] args) {

        File f = new File("C:\\Users");
        Scanner in = new Scanner(System.in);
        System.out.println("Įveskite failo ar katalogo pavadinimą ar jo dalį");
        String nameFile = in.nextLine();
        searchFile(f, nameFile);

    }
    public static void searchFile(File f, String nameFile){

        if (f.list() != null){
            for (String n: Objects.requireNonNull(f.list())
            ) {
                File sub = new File(f +"\\" + n);
                if(sub.isDirectory()){
                    if (n.toLowerCase(Locale.ROOT).contains(nameFile.toLowerCase(Locale.ROOT))){
                        System.out.println("Katalogas " + n);
                    }
                    searchFile(sub,nameFile);

                }else{
                    if (n.toLowerCase(Locale.ROOT).contains(nameFile.toLowerCase(Locale.ROOT))){
                        System.out.println("Failas " + n);
                    }
                }
            }
        }
    }

}
