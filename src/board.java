import java.util.Scanner;

public class board {
    // Instance variables
    private String[][] myBoard;

    public board() {
        // Scanner object to collect user input
        Scanner input = new Scanner(System.in); // Create scanner object

        // Construct empty board
        this.myBoard = new String[][] {
                {" ", "0", "1", "2", "3", "4"},
                {"0", "-", "-", "-", "-", "-"},
                {"1", "-", "-", "-", "-", "-"},
                {"2", "-", "-", "-", "-", "-"},
                {"3", "-", "-", "-", "-", "-"},
                {"4", "-", "-", "-", "-", "-"},
                };

        // Get user input for board
        int counter = 1;
        int xCoord;
        int yCoord;

        while (counter < 6) {
            System.out.println("Enter ship " + counter + " location:");
            if (input.hasNextInt()) {
                xCoord = input.nextInt();
            }
            else {
                input.nextLine();
                System.out.println("Invalid coordinates. Choose different coordinates.");
                continue;
            }
            if (input.hasNextInt()) {
                yCoord = input.nextInt();
                input.nextLine();
            }
            else {
                input.nextLine();
                System.out.println("Invalid coordinates. Choose different coordinates.");
                continue;
            }

            // Check to see if X/Y coordinates out of bounds
            if ((xCoord > 4 || xCoord < 0) || (yCoord > 4 || yCoord < 0)) {
                System.out.println("Invalid coordinates. Choose different coordinates.");
                continue;
            }
            // Check if position already has ship
            if (myBoard[xCoord+1][yCoord+1] == "@"){
                System.out.println("Invalid coordinates. Choose different coordinates.");
                continue;
            }
            else {
                myBoard[xCoord+1][yCoord+1] = "@";
            }

            // Increment counter
            counter++;





        }



    }

    public void showBoard() {
        for (int x = 0; x < myBoard.length; x++) {
            for (int y = 0; y < myBoard[x].length;y++){
                System.out.print(" " + myBoard[x][y]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
