package design2;

public class PointCP2 {
    // Store Polar coordinates only
    private double rho;
    private double theta;

    public PointCP2(double rho, double theta) {
        this.rho = rho;
        this.theta = theta;
    }

    public double getRho() {
        return Math.cos(Math.toRadians(theta));
    }

    public double getTheta() {
        return Math.sin(Math.toRadians(theta));
    }

    public void convertStorageToPolar() {
        // Nothing to do
    }

    public void convertStorageToCartesian() {
        if (rho < 0) {
            rho = (Math.sqrt(Math.pow(rho, 2) + Math.pow(theta, 2)));
            theta = Math.toDegrees(Math.atan2(theta, rho));
        }
    }

    public String toString() {
        return "Stored as Polar (" + getRho() + "," + getTheta() + ")";
    }

}
