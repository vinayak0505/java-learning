package AryanLLDCourse.TickTackToe.GameState;

public class GameContext {
    private GameState currentState;

    public GameContext(){
        currentState = new XTurnState();
    }

    public void setState(GameState state){
        currentState = state;
    }

    public void next(){
        currentState.next(this);
    }

    public boolean isGameOver(){
        return currentState.isGameOver();
    }

    public GameState getCurrentState(){
        return currentState;
    }
}
