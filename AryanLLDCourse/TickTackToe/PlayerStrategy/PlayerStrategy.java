package AryanLLDCourse.TickTackToe.PlayerStrategy;

import AryanLLDCourse.TickTackToe.Board;
import AryanLLDCourse.TickTackToe.Position;

public interface PlayerStrategy {
    Position makeMove(Board board);
}