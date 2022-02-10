package Task1;

import java.util.Scanner;

public class Task1Main {

    public static Double AreaCount(Integer edge1, Integer edge2, Integer edge3) {

        Double area;
        Double halfPer = (edge1+edge2+edge3)/2.0;
        area = Math.sqrt(halfPer*(halfPer-edge1.doubleValue())*(halfPer-edge2.doubleValue())*(halfPer-edge3.doubleValue()));

        return area;
    }

    public static void main(String[] args) {
        System.out.println("Įveskite tris trikampio kraštines");
        Scanner in = new Scanner(System.in);

        System.out.println("Pirma kraštinė: ");
        Integer edge1 = in.nextInt();

        System.out.println("Antra kraštinė: ");
        Integer edge2 = in.nextInt();

        System.out.println("Trečia kraštinė: ");
        Integer edge3 = in.nextInt();

        System.out.println(AreaCount(edge1, edge2, edge3));
    }
}
