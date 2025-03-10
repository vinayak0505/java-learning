package LLD.Questions.TicTacToe.Board;

import java.util.List;

import LLD.Questions.TicTacToe.Piece.Piece;

public class Board {
    private final Piece board[][];
    private final int totalSpace;
    private int usedSpace = 0;

    public boolean canAdd(List<Integer> points) {
        if (points.size() < 2)
            return false;
        int x = board.length;
        if (x == 0)
            return false;
        int y = board[0].length;
        if (points.get(0) >= x || points.get(0) < 0)
            return false;
        if (points.get(1) >= y || points.get(1) < 0)
            return false;
        return board[points.get(0)][points.get(1)] == null;
    }

    public Board(int size) {
        board = new Piece[size][size];
        totalSpace = size * size;
    }

    public void add(Piece piece, List<Integer> points) {
        if (!canAdd(points))
            return;
        board[points.get(0)][points.get(1)] = piece;
        usedSpace++;
    }

    public boolean hasWon(Piece piece) {
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == piece)
                    count++;
            }
            if (count == board.length)
                return true;
        }

        for (int i = 0; i < board[0].length; i++) {
            int count = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == piece)
                    count++;
            }
            if (count == board.length)
                return true;
        }

        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == piece)
                count++;
        }
        if (count == board.length)
            return true;

        count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][board[0].length - 1 - i] == piece)
                count++;
        }
        if (count == board.length)
            return true;
        return false;
    }

    public void printBoardState() {
        StringBuilder stringBuilder = new StringBuilder();
        if (board.length == 0)
            return;
        for (int i = 0; i < board[0].length + board[0].length - 1; i++) {
            stringBuilder.append('-');
        }
        String dash = stringBuilder.toString();
        for (int i = 0; i < board.length + board[0].length - 1; i++) {
            if (i % 2 == 1) {
                System.out.println(dash);
                continue;
            }
            for (int j = 0; j < board[i / 2].length + board[i / 2].length - 1; j++) {
                if (j % 2 == 1) {
                    System.out.print('|');
                    continue;
                }
                if (board[i / 2][j / 2] == null) {
                    System.out.print(' ');
                } else {
                    System.out.print(board[i / 2][j / 2].getPieceValue());
                }
            }
            System.out.println();
        }
    }

    public boolean hasDrawn() {
        return totalSpace <= usedSpace;
    }
}
