import java.util.Scanner;

public class GasMileage {
    static void main() {
        Scanner in = new Scanner(System.in);
        double tankCapacity = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        boolean done = false;

        do { // tankCapacity
            IO.print("Enter the tank capacity in gallons: ");
            if (in.hasNextDouble()) {
                tankCapacity = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.nextLine();
                IO.println("You must enter a valid tank capacity in gallons, not \"" + trash + "\"");
            }
        } while (!done);

        done = false;
        do { // mpg
            IO.print("Enter your car's miles per gallon (mpg): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.nextLine();
                IO.println("You must enter a valid miles per gallon, not \"" + trash + "\"");
            }
        } while (!done);

        done = false;
        do { // pricePerGallon
            IO.print("What is the price per gallon of fuel?: $");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.nextLine();
                IO.println("You must enter a valid dollar amount, not \"" + trash + "\"");
            }
        } while (!done);

        final double ONE_HUNDRED_MILES = 100 / mpg * pricePerGallon;
        System.out.printf("> At %.2f mpg and $%.2f/gallon, the cost to drive 100 miles will be $%.2f.\n",
                mpg, pricePerGallon, ONE_HUNDRED_MILES);

        final double FULL_TANK_MILES = tankCapacity * mpg;
        System.out.printf("> At a tank capacity of %.2f gallons and %.2f mpg, your car can drive for %.2f miles on a full tank of gas.",
                tankCapacity, pricePerGallon, FULL_TANK_MILES);
    }
}