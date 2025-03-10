package LLD.Questions.TicTacToe.Piece;

public class PieceY extends Piece {
    public PieceY() {
        super(PieceType.O);
    }

    @Override
    public String getPieceValue() {
        return "O";
    }
}
