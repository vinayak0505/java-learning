package LLD.Questions.TicTacToe.Piece;

public class PieceX extends Piece {
    public PieceX() {
        super(PieceType.X);
    }

    @Override
    public String getPieceValue() {
        return "X";
    }
}
