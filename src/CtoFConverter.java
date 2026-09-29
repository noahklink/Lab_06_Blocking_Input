import java.util.Scanner;

public class CtoFConverter {
    void main() {
        Scanner in = new Scanner(System.in);

        double cVal = 0;
        double fVal = 0;
        boolean done = false;

        do {
            IO.print("Enter the Celsius value: ");

            if (in.hasNextDouble()) {
                cVal = in.nextDouble();
                fVal = cVal * 9.0/5 + 32;
                done = true;
            } else {
                String trash = in.nextLine();
                IO.println("Incorrect response. Expected Celsius, got \"" + trash + "\"");
            }
        } while (!done);

        IO.print("Your Celsius value (" + cVal + "C) is equal to " + fVal + "F");
    }
}
