package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == 1) {
                return checkColumn(board, j);
            }
        }
        return checkLine(board);
    }

    public static boolean checkColumn(int[][] board, int column) {
        for (int i = 1; i < board.length; i++) {
            if (board[i][column] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkLine(int[][] board) {
        for (int i = 1; i < board.length; i++) {
            boolean rsl = true;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    rsl = false;
                    break;
                }
            }
            if (rsl) return rsl;
        }
        return false;
    }
}

