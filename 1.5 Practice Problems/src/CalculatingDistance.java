public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles

    */


    public static void main(String[] args) {
        double milesPerHour = 90.0;
        double hoursPassed = .8;

        double distanceTraveled = milesPerHour/hoursPassed;

        System.out.println("You have traveled: " + distanceTraveled + " miles");
    }
}
