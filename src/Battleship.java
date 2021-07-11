import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        // Initial prompt
        System.out.println("Welcome to Battleship!\n");

        // Setup scanner object to get user input
        Scanner input = new Scanner(System.in); // Create scanner object

        // Player 1 - Get ship coordinates
        System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");
        board player1 = new board();  // Create new board object
        player1.showBoard();

        // Player 2 - Get ship coordinates
        System.out.println("PLAYER 2, ENTER YOUR SHIPS’ COORDINATES.");
        board player2 = new board();  // Create new board object


    }
}
