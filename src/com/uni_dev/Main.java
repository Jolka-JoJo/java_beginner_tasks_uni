package com.uni_dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("labas pasauli");
//        byte x_1; //8 bits
//        short x0; //16 b
//        int x = 10; //32 b   -2,147,483,648 ... 0 ... 2,147,483,647
//        long x1; //64b
//        int z = 5;
//
//        double y;
//        float f=15.32f;
//        y = x/3.0;
//        System.out.println(y);

//        int x = 10;
//        int z = 0;
//
//        Integer y = 10;
//        if (y==x){
//            System.out.println("Lygu");
//        }

        Scanner in = new Scanner(System.in);

        System.out.print("Įveskite vardą: ");
        String vardas = in.next();
        System.out.println("Jūs įvedėtė: " + vardas);

        String paieska = "Jonas";
        String vartotojas = "Jonas";
        if(vardas.equals(vartotojas)){
            System.out.println("lygu");
        }else {
            System.out.println("nelygu");
        }

    }

}
