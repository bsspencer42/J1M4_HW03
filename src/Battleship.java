import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        // Initial prompt
        System.out.println("Welcome to Battleship!\n");

        // Player 1 - Get ship coordinates
        System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");
        Scanner input = new Scanner(System.in); // Create scanner object
        System.out.println("Enter ship 1 location:");

        int counter = 0;
        int xCoord;
        int yCoord;

        while (counter < 5) {
            System.out.println(counter);
            if (input.hasNextInt()) {
                xCoord = input.nextInt();
                if (input.hasNextInt()) {
                    yCoord = input.nextInt();
                    input.nextLine();
                    // Check to see if X/Y coordinate is already occupied

                    // Add X/Y coordinate to battleship board

                    // Increment counter
                    counter++;
                }
                else {
                    System.out.println("Invalid coordinates. Choose different coordinates");
                    input.nextLine();
                }
            }
            else {
                System.out.println("Invalid coordinates. Choose different coordinates");
                input.nextLine();
            }

        }
    }
}
