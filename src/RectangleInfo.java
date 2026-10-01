void main() {
    Scanner in = new Scanner(System.in);
    double width = 0;
    double height = 0;
    boolean done = false;

    do { // width
        IO.print("Enter the width: ");

        if (in.hasNextDouble()) {
            width = in.nextDouble();
            in.nextLine();
            done = true;
        } else {
            String trash = in.nextLine();
            IO.println("You must enter a valid width value, not \"" + trash + "\".");
        }
    } while (!done);

    done = false;
    do { // height
        IO.print("Enter the height: ");

        if (in.hasNextDouble()) {
            height = in.nextDouble();
            in.nextLine();
            done = true;
        } else {
            String trash = in.nextLine();
            IO.println("You must enter a valid height value, not \"" + trash + "\".");
        }
    } while (!done);

    final double area = width * height;
    final double perimeter = width + width + height + height;
    System.out.printf("> Area: %.02f | Perimeter: %.02f\n", area, perimeter);

    final double diagonalLength = Math.sqrt(width * width + height * height);
    IO.print("> Diagonal Length (hypotenuse): " + diagonalLength);
}