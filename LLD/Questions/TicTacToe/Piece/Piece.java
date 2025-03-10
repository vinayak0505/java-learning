package LLD.Questions.TicTacToe.Piece;

public abstract class Piece {
    public final PieceType pieceType;

    public Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    PieceType getPieceType(){
        return pieceType;
    }

    abstract public String getPieceValue();

}
