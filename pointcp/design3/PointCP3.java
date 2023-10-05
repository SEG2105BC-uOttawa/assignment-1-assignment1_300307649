
package design3;

public class PointCP3 {
    // Store Cartesian coordinates only
    private double x;
    private double y;

    public PointCP3(double x, double y, double b) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double getY() {
        return Math.toDegrees(Math.atan2(y, x));
    }

    public void convertStorageToPolar() {
        if (x < 0) {
            double temp = getX();
            y = getY();
            x = temp;
        }
    }

    public String toString() {
        return "Stored as Cartesian (" + getX() + "," + getY() + ")";
    }

}
