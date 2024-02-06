package Model;
import java.util.ArrayList;
import java.util.List;

public class Cell {
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

}
