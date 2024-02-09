package Model;
import java.util.List;
import java.util.ArrayList;

public class Game {
    private List<List<Cell>> board;

    public List<List<Cell>> getBoard() {
        List<List<Cell>> copyBoard = new ArrayList<>();

        for (int i = 0; i < 3; i++)
            copyBoard.add(new ArrayList<>());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String copy_symbol = board.get(i).get(j).getCell_symbol();
                String copy_owner = board.get(i).get(j).getCell_owner();

                Cell cell = new Cell();
                cell.setCell_owner(copy_owner);
                cell.setCell_symbol(copy_symbol);
                copyBoard.get(i).add(cell);
            }
        }

        return copyBoard;
    }

    public void createBoard() {
        board = new ArrayList<>();

        for (int i = 0; i < 3; i++)
            board.add(new ArrayList<>());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.get(i).add(new Cell());
            }
        }
    }

    public void updateBoard(String playerSymbol, String playerName, int x, int y) {
        board.get(x).get(y).setCell_owner(playerName);
        board.get(x).get(y).setCell_symbol(playerSymbol);
    }
}
