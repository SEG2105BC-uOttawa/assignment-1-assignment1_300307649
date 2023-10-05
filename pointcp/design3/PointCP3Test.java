package design3;

import java.util.Scanner;

public class PointCP3Test {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Entrez la valeur de x : ");

            double x = scanner.nextDouble();

            System.out.print("Entrez la valeur de y : ");

            double y = scanner.nextDouble();

            PointCP3 point = new PointCP3(x, y, y);

            System.out.println("Coordonnées du point : " + point);

        }

    }

}
