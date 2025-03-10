package LLD.Questions.TicTacToe.Player;

import LLD.Questions.TicTacToe.Piece.PieceX;
import LLD.Questions.TicTacToe.Piece.PieceY;
import LLD.Questions.TicTacToe.Piece.PieceZ;

public class PlayerFactory {
    private int count;

    public PlayerFactory() {
        count = 0;
    }

    public Player getPlayer() throws Exception {
        switch (count) {
            case 0:
                count++;
                return new Player(new PieceX(), count);
            case 1:
                count++;
                return new Player(new PieceY(), count);
            case 2:
                count++;
                return new Player(new PieceZ(), count);
            default:
                throw new RuntimeException("No more players");
        }
    }
}
