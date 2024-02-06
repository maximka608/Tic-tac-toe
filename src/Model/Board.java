package Model;
import java.util.ArrayList;
import java.util.List;

public class Board {

    public List<List<Cell>> createBoard() {
        List<List<Cell>> board = new ArrayList<>();

        for (int i = 0; i < 3; i++)
            board.add(new ArrayList<>());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.get(i).add(new Cell());
            }
        }

        return board;
    }
}
