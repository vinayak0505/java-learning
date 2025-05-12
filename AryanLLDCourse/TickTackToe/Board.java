package AryanLLDCourse.TickTackToe;

import AryanLLDCourse.TickTackToe.GameState.GameContext;

public class Board {
    private final int rows;
    private final int columns;
    private Pieces[][] grid;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        grid = new Pieces[rows][columns];
    }

    public boolean isValidMove(Position pos) {
        return pos.isValid(rows, columns) && grid[pos.getRow()][pos.getCol()] == null;
    }

    public void makeMove(Position pos, Pieces piece) {
        grid[pos.getRow()][pos.getCol()] = piece;
    }

    public void checkGameState(GameContext context) {
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] != null && isWinningLine(grid[i])) {
                context.next();
                return;
            }
        }

        for (int i = 0; i < columns; i++) {
            Pieces[] column = new Pieces[rows];
            for (int j = 0; j < rows; j++) {
                column[j] = grid[j][i];
            }

            if (column[0] != null && isWinningLine(column)) {
                context.next();
                return;
            }
        }

        Pieces[] diagonal1 = new Pieces[Math.min(rows, columns)];
        Pieces[] diagonal2 = new Pieces[Math.min(rows, columns)];

        for(int i = 0; i < Math.min(rows, columns); i++){
            diagonal1[i] = grid[i][i];
            diagonal2[i] = grid[i][columns - 1 - i];
        }

        if(diagonal1[0] != null && isWinningLine(diagonal1)){
            context.next();
            return;
        }

        if(diagonal2[0] != null && isWinningLine(diagonal2)){
            context.next();
            return;
        }
    }

    private boolean isWinningLine(Pieces[] pieces) {
        for(Pieces piece: pieces){
            if(piece != pieces[0]) return false;
        }
        return true;
    }

    public void printBoard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printBoard'");
    }
}
