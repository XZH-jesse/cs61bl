package game2048logic;

import game2048rendering.Side;
import static game2048logic.MatrixUtils.rotateLeft;
import static game2048logic.MatrixUtils.rotateRight;

/**
 * @author  Josh Hug
 */
public class GameLogic {
    /** Moves the given tile up as far as possible, subject to the minR constraint.
     *
     * @param board the current state of the board
     * @param r     the row number of the tile to move up
     * @param c -   the column number of the tile to move up
     * @param minR  the minimum row number that the tile can land in, e.g.
     *              if minR is 2, the moving tile should move no higher than row 2.
     * @return      if there is a merge, returns the 1 + the row number where the merge occurred.
     *              if no merge occurs, then return minR.
     */
    public static int moveTileUpAsFarAsPossible(int[][] board, int r, int c, int minR) {
        //up task2
        int row = r;
        while (row - 1 >= 0 && board[row - 1][c] == 0 && row - 1 >= minR) { //task4
            row -= 1;
        }
        int swapValue = board[r][c];
        board[r][c] = board[row][c];
        board[row][c] = swapValue;

        //merge task3
        if (row - 1 >= 0 && board[row - 1][c] == board[row][c] && row - 1 >= minR) { //task4
            board[row][c] = 0;
            board[row - 1][c] *= 2;
            return row;
        }
        return minR;
    }

    /**
     * Modifies the board to simulate the process of tilting column c
     * upwards.
     *
     * @param board     the current state of the board
     * @param c         the column to tilt up.
     */
    public static void tiltColumn(int[][] board, int c) {
        int minR = 0; //minR记录合并的位置+1，这个位置就是下一个方块限制到达的最远的位置
        for (int r = 0; r < board.length; r += 1) {
            minR = Math.max(minR, moveTileUpAsFarAsPossible(board, r, c, minR));
        }
        return;
    }

    /**
     * Modifies the board to simulate tilting all columns upwards.
     *
     * @param board     the current state of the board.
     */
    public static void tiltUp(int[][] board) {
        for (int c = 0; c < board.length; c += 1) {
            tiltColumn(board, c);
        }
        return;
    }

    /**
     * Modifies the board to simulate tilting the entire board to
     * the given side.
     *
     * @param board the current state of the board
     * @param side  the direction to tilt
     */
    public static void tilt(int[][] board, Side side) {
        if (side == Side.NORTH) {
            tiltUp(board);
            return;
        } else if (side == Side.EAST) {
            rotateLeft(board);
            tiltUp(board);
            rotateRight(board);
            return;
        } else if (side == Side.SOUTH) {
            rotateLeft(board);
            rotateLeft(board);
            tiltUp(board);
            rotateRight(board);
            rotateRight(board);
            return;
        } else if (side == Side.WEST) {
            rotateRight(board);
            tiltUp(board);
            rotateLeft(board);
            return;
        } else {
            System.out.println("Invalid side specified");
        }
    }
}
