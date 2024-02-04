import Model.*;
import View.*;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.setUsername("Max");
        System.out.println(player1.getUsername());

        player1.setSymbol("X");
        System.out.println(player1.getSymbol());

        Board board = new Board();
        board.setCell_symbol(player1.getSymbol());
        board.setCell_owner(player1.getUsername());

        BoardView.printBoard(board);
    }
}