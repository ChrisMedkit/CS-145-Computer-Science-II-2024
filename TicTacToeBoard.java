import java.util.Arrays;

public class TicTacToeBoard {
    private char[][] grid = new char[3][3];

    /**
     * Makes a new Tic Tac Toe board with an empty grid.
     */
    public TicTacToeBoard() {
        for (char[] row : grid) {
            Arrays.fill(row, ' ');
        }
    }

    /**
     * Checks whether a position is on the board and empty.
     *
     * @param row The row index (0-2).
     * @param col The column index (0-2).
     * @return true if the position is valid and unoccupied, false otherwise.
     */
    public boolean isEmpty(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && grid[row][col] == ' ';
    }

    /**
     * Plays a move for the given player.
     *
     * @param player The player's character ('X' or 'O').
     * @param row The row index (0-2) where the move should be played.
     * @param col The column index (0-2) where the move should be played.
     */
    public void play(char player, int row, int col) {
        if (isEmpty(row, col)) {
            grid[row][col] = player;
        }
    }

    /**
     * Checks if every square on the board is filled.
     *
     * @return true if the board is full, false otherwise.
     */
    public boolean isFull() {
        for (char[] row : grid) {
            for (char cell : row) {
                if (cell == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if someone has won.
     *
     * @return true if there is a winner, false if there isn't.
     */
    public boolean haveWinner() {
        for (int i = 0; i < 3; i++) {
            // row i
            if (grid[i][0] != ' ' && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
                return true;
            }
            // column i
            if (grid[0][i] != ' ' && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
                return true;
            }
        }
        // diagonals
        if ((grid[0][0] != ' ' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2])
                || (grid[0][2] != ' ' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0])) {
            return true;
        }
        return false;
    }

    /**
     * Prints the current state of the game board.
     */
    public void printGrid() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + grid[row][col] + " | ");
            }
            System.out.println();
            if (row < 2) {
                System.out.println("--------------");
            }
        }
    }
}