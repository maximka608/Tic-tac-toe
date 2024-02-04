package View;
import Model.Board;

public class BoardView {
    public static void printBoard(Board board) {
        System.out.println(board.getCell_symbolCell() + " " + board.getCell_owner());
    }
}
