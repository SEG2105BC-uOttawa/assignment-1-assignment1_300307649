package design2;

import java.util.Scanner;

public class PointCP2Test {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the value of rho : ");
            double rho = scanner.nextDouble();
            System.out.print("Enter the value of theta: ");
            double theta = scanner.nextDouble();
            PointCP2 point = new PointCP2(rho, theta);
            System.out.println(point);

        }

    }

}
