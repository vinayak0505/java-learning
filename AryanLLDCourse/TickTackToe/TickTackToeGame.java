package AryanLLDCourse.TickTackToe;

import AryanLLDCourse.TickTackToe.GameState.GameContext;
import AryanLLDCourse.TickTackToe.GameState.GameState;
import AryanLLDCourse.TickTackToe.GameState.OWonState;
import AryanLLDCourse.TickTackToe.GameState.XWonState;
import AryanLLDCourse.TickTackToe.PlayerStrategy.PlayerStrategy;

public class TickTackToeGame {
    private Board board;
    private Player playerX;
    private Player playerO;
    private Player curPlayer;
    private GameContext gameContext;

    public TickTackToeGame(PlayerStrategy xStrategy, PlayerStrategy yStrategy, int rows, int cols) {
        board = new Board(rows, cols);
        playerX = new Player(Pieces.X, xStrategy);
        playerO = new Player(Pieces.O, yStrategy);
        curPlayer = playerX;
        gameContext = new GameContext();
    }

    public void play() {
        do {
            board.printBoard();
            Position move = curPlayer.makeMove(board);
            board.makeMove(move, curPlayer.getPiece());

            board.checkGameState(gameContext);
            switchPlayer();
        } while (gameContext.isGameOver() == false);
        
        announceResult();
    }

    private void switchPlayer() {
        if (curPlayer == playerX) {
            curPlayer = playerO;
        } else {
            curPlayer = playerX;
        }
    }

    private void announceResult(){
        GameState state = gameContext.getCurrentState();

        if(state instanceof XWonState){
            System.out.println("Player X Won");
        } else if(state instanceof OWonState){
            System.out.println("Player O Wins");
        } else {
            System.out.println("Its a draw");
        }
    }

}
