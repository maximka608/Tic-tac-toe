package Model;
import java.util.List;
import java.util.ArrayList;

public class Game {
    public List<List<Board>> createBoard() {
        List<List<Board>> board = new ArrayList<>();

        for (int i = 0; i < 3; i++)
            board.add(new ArrayList<>());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.get(i).add(new Board());
            }
        }

        return board;
    }
}
