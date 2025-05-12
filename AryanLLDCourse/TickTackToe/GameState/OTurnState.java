package AryanLLDCourse.TickTackToe.GameState;

public class OTurnState implements GameState{
    @Override
    public void next(GameContext context){
        context.setState(new XTurnState());
    }

    @Override
    public boolean isGameOver(){
        return false;
    }
}
