package AryanLLDCourse.TickTackToe;

public class Position {
    private int row;
    private int col;
    public Position(int row, int col){
        this.row = row;
        this.col = col;
    }

    public boolean isValid(int rows, int cols){
        return row >= 0 && col >= 0 && row < rows && col < cols;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }
}
