package LLD.Questions.TicTacToe.Player;

import LLD.Questions.TicTacToe.Piece.Piece;

public class Player {
    final private Piece piece;
    final private int place;

    public Player(Piece piece,int place) {
        this.piece = piece;
        this.place = place;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getPlace(){
        return place;
    }
}
