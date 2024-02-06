import Model.*;
import View.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.setUsername("Max");
        System.out.println(player1.getUsername());

        player1.setSymbol("X");
        System.out.println(player1.getSymbol());

        Board board = new Board();
        List<List<Board>> arr_board = board.createBoard();

        BoardView.printBoard(arr_board);
    }
}