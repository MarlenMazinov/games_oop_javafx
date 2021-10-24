package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && checkLine(board, i) || checkColumn(board, i)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean checkColumn(int[][] board, int column) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkLine(int[][] board, int row) {
        boolean result = true;
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}

