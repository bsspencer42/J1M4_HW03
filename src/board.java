import java.util.Scanner;

public class board {
    // Instance variables

    public board() {
        Scanner input = new Scanner(System.in); // Create scanner object

        int counter = 1;
        int xCoord;
        int yCoord;

        while (counter < 6) {
            System.out.println("Enter ship " + counter + " location:");
            if (input.hasNextInt()) {
                xCoord = input.nextInt();
            }
            else {
                System.out.println("Invalid coordinates. Choose different coordinates");
                input.nextLine();
                continue;
            }
            if (input.hasNextInt()) {
                yCoord = input.nextInt();
                input.nextLine();
            }
            else {
                System.out.println("Invalid coordinates. Choose different coordinates");
                input.nextLine();
                continue;
            }
            // Check to see if X/Y coordinate is already occupied

            // Add X/Y coordinate to battleship board

            // Increment counter
            counter++;





        }
    }

}
