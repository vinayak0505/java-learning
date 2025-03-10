package LLD.Questions.TicTacToe;

import LLD.Questions.TicTacToe.Game.Game;

public class Main {
    public static void main(String[] args) {
        try {
            
            Game game = new Game();
            game.startGame();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
