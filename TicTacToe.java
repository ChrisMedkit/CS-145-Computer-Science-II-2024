import java.util.Scanner;

public class TicTacToe {
    private TicTacToeBoard board;
    private char currentPlayer = 'X';
    private boolean gameWon = false;

    /**
     * Makes a new TicTacToe game.
     */
    public TicTacToe() {
        board = new TicTacToeBoard();
    }

    /**
     * Attempts to play a move for the current player.
     *
     * @param row The row index of the move (0-2).
     * @param col The column index of the move (0-2).
     * @return true if the move was successful, false otherwise.
     */
    public boolean makeMove(int row, int col) {
        if (!board.isEmpty(row, col)) {
            return false;
        }
        board.play(currentPlayer, row, col);
        gameWon = board.haveWinner();
        if (!gameWon) {
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        return true;
    }

    /**
     * Prints the game board.
     */
    public void printBoard() {
        board.printGrid();
    }

    /**
     * Checks if the game has been won.
     *
     * @return true if the game has been won, false if it hasn't
     */
    public boolean checkIfWon() {
        return gameWon;
    }

    /**
     * Checks if the game board is full.
     *
     * @return true if the board is full, false if it's not
     */
    public boolean isBoardFull() {
        return board.isFull();
    }

    /**
     * Reads an integer from the scanner, re-prompting until the input is a number.
     */
    private static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /**
     * Main method to start the game.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        while (!game.checkIfWon() && !game.isBoardFull()) {
            game.printBoard();

            boolean validMove = false;
            while (!validMove) {
                System.out.println("Player " + game.currentPlayer
                        + ", enter your move (row[0-2] column[0-2]): ");
                int row = readInt(scanner);
                int col = readInt(scanner);
                validMove = game.makeMove(row, col);
                if (!validMove) {
                    System.out.println("Invalid move. Try again.");
                }
            }
        }

        game.printBoard();
        if (game.checkIfWon()) {
            System.out.println("Player " + game.currentPlayer + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
        scanner.close();
    }
}