void main() {
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    final int randomNum = rand.nextInt(10) + 1;
    int guess = 0;
    boolean done = false;

    do {
        IO.print("What is your guess? (1-10) ");

        if (in.hasNextInt()) {
            guess = in.nextInt();
            in.nextLine();

            if (guess > 10 || guess < 1) {
                IO.println("Guess must be between 1-10, not " + guess);
            } else {
                done = true;
            }
        } else {
            String trash = in.nextLine();
            IO.println("Expected integer, got \"" + trash + "\"");
        }
    } while (!done);

    if (guess > randomNum) {
        IO.print("You were above the money! Number: " + randomNum);
    } else if (guess == randomNum) {
        IO.print("You were on the money! Number: " + randomNum);
    } else {
        IO.print("You were below the money! Number: " + randomNum);
    }
}