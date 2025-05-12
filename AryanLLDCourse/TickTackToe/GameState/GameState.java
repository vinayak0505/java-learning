package AryanLLDCourse.TickTackToe.GameState;

public interface GameState {
    void next(GameContext context);
    boolean isGameOver();
}
