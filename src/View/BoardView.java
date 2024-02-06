package View;
import Model.Cell;
import java.util.List;

public class BoardView {
    public static void printBoard(List<List<Cell>> board) {
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {
                String cellSymbol = board.get(i).get(j).getCell_symbol();
                if (cellSymbol == null) {
                    System.out.print("[  ] ");
                }
                else {
                    System.out.print("[ " + cellSymbol + " ]");
                }
            }
            System.out.println();
        }
    }
}
