package LLD.Questions.TicTacToe.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LLD.Questions.TicTacToe.Board.Board;
import LLD.Questions.TicTacToe.Player.Player;
import LLD.Questions.TicTacToe.Player.PlayerFactory;

public class Game {
    final private Board board;
    final private Player players[];

    private int turn = 0;
    private boolean hasWon = false;

    public Game(int size, int playersCount) throws Exception {
        board = new Board(size);
        players = new Player[playersCount];
        PlayerFactory playerFactory = new PlayerFactory();
        for (int i = 0; i < playersCount; i++) {
            players[i] = playerFactory.getPlayer();
        }
    }

    public Game(int size) throws Exception {
        this(size, 2);
    }

    public Game() throws Exception {
        this(3, 2);
    }

    private List<Integer> getNextInput(Player player, Scanner scanner) {
        System.out.println("Enter the points for player " + player.getPlace());
        String input = scanner.nextLine();
        List<Integer> list = new ArrayList<Integer>(2);
        String points[] = input.split(",");
        list.add(0, Integer.parseInt(points[0]));
        list.add(1, Integer.parseInt(points[1]));
        return list;
    }

    public void startGame() throws Exception {
        if (hasWon) {
            throw new RuntimeException("Already Completed Game Called");
        }
        Scanner scanner = new Scanner(System.in);
        do {
            List<Integer> points = getNextInput(players[turn], scanner);

            if (!board.canAdd(points)) {
                System.out.println("Point Already Occupied");
                continue;
            }

            board.add(players[turn].getPiece(), points);
            board.printBoardState();
            if (board.hasWon(players[turn].getPiece())) {
                System.out.println("Player " + players[turn].getPlace() + " Won the match");
                hasWon = true;
                return;
            }
            if (board.hasDrawn()) {
                System.out.println("Tie");
                hasWon = true;
                return;
            }
            turn = (turn + 1) % players.length;
        } while (true);

    }
}
