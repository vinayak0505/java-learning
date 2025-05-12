package AryanLLDCourse.TickTackToe.PlayerStrategy;

import java.util.Scanner;
import AryanLLDCourse.TickTackToe.Position;
import AryanLLDCourse.TickTackToe.Board;

public class HumanPlayerStrategy implements PlayerStrategy {
    private Scanner scanner;
    private String playerName;

    public HumanPlayerStrategy(String playerName) {
        this.playerName = playerName;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Position makeMove(Board board) {
        while (true) {
            System.err.print(playerName + ", enter you move");

            try {
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                Position move = new Position(row, col);

                if (board.isValidMove(move))
                    return move;

                System.out.println("Invalid move. Try again");

            } catch (Exception e) {
                System.err.println("Invalid input. please enter row and column as numbers.");
                scanner.nextLine();
            }
        }
    }
}
