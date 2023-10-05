package design5;

import java.util.Scanner;

import design2.PointCP2;
import design3.PointCP3;

//Abstract class with designs PointCP2.java and PointCP3.java as subclasses

public abstract class PointCP5 {

    // Instance variables
    protected double xOrRho;
    protected double yOrTheta;
    protected char typeCoord;

    // Constructors
    public PointCP5(char type, double xOrRho, double yOrTheta) {
        this.xOrRho = xOrRho;
        this.yOrTheta = yOrTheta;
        typeCoord = type;
    }

    // Instance methods
    public abstract double getX();

    public abstract double getY();

    public abstract double getRho();

    public abstract double getTheta();

    public abstract void convertStorageToPolar();

    public abstract void convertStorageToCartesian();

    public String toString() {
        return "Stored as " + (typeCoord == 'C' ? "Cartesian  (" + getX() + "," + getY() + ")"
                : "Polar (" + getRho() + "," + getTheta() + ")");
    }

    public static PointCP2 getInput() {
        Scanner input = new Scanner(System.in);
        char type = 'A';
        double a = 0;
        double b = 0;
        System.out.print("Enter the type of coordinates you are inputting ((C)artesian / (P)olar): ");
        String typeString = input.nextLine();
        if (typeString.equalsIgnoreCase("C")) {
            type = 'C';
            System.out.print("Enter the value of X: ");
            a = input.nextDouble();
            System.out.print("Enter the value of Y: ");
            b = input.nextDouble();
            return new PointCP2(type, a);
        } else if (typeString.equalsIgnoreCase("P")) {
            type = 'P';
            System.out.print("Enter the value of Rho: ");
            a = input.nextDouble();
            System.out.print("Enter the value of Theta: ");
            b = input.nextDouble();
            PointCP3 pointCP3 = new PointCP3(type, a, b);
            return new PointCP2(type, pointCP3.getX());
        }
        return null;
    }

}