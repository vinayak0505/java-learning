package AryanLLDCourse.TickTackToe.GameState;

public class OWonState implements GameState {

    @Override
    public void next(GameContext context) {

    }

    @Override
    public boolean isGameOver() {
        return true;
    }

}