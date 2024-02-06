package Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private String cell_symbol;
    private String cell_owner;

    public void setCell_symbol(String s) {
        this.cell_symbol = s;
    }

    public String getCell_symbol() {
        return this.cell_symbol;
    }

    public void setCell_owner(String cell_owner) {
        this.cell_owner = cell_owner;
    }

    public String getCell_owner() {
        return this.cell_owner;
    }

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
