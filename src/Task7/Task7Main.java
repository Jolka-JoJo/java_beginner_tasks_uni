package Task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Task7Main {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("src/Task7/data.txt");
        Scanner data = new Scanner(f);
        int subjectNumberAll = data.nextInt();
        int studentNumberAll = data.nextInt();

        Double [] studentsAverage = new Double[studentNumberAll+1];
        Double averageAll;
        Double gradesAll = 0.0;
        boolean [] unprogressiveStudents = new boolean[studentNumberAll+1];

        System.out.println("Studento Nr.  Vidurkis");
        for (int studentNr = 1; studentNr <= studentNumberAll; studentNr++){

            double gradeSum = 0;
            for (int subjectNr = 0; subjectNr < subjectNumberAll; subjectNr++){

                int grade = data.nextInt();
                gradeSum += grade;
                if(grade < 5 && !unprogressiveStudents[studentNr]){
                        unprogressiveStudents[studentNr]=true;
                }
            }

            studentsAverage[studentNr] = gradeSum/subjectNumberAll;
            gradesAll += studentsAverage[studentNr];
            System.out.println(studentNr + "             " + studentsAverage[studentNr]);
        }
        averageAll = gradesAll/studentNumberAll;
        System.out.println("Visos grupės vidurkis: " + averageAll);


        System.out.println("Geriausiai besimokančio studento nr. " + BestStudent(studentNumberAll,studentsAverage));
        UnprogressiveList (studentNumberAll, unprogressiveStudents);

    }

        public static int BestStudent(int studentNumberAll, Double studentsAverage[]){

        int bestStudentNr = 1;

            for (int studentNr = 2; studentNr <= studentNumberAll; studentNr++) {

                    if(studentsAverage[bestStudentNr]<studentsAverage[studentNr]){
                        bestStudentNr = studentNr;
                    }
            }

            return bestStudentNr;
        }

        public static void UnprogressiveList (int studentNumberAll, boolean unprogressiveStudents[]){
            System.out.print("Nepažangių studentų numeriai: ");
            for (int i = 1; i<=studentNumberAll; i++){
                if (unprogressiveStudents[i]){
                    System.out.print(i + " ");
                }
            }


        }
}
