package Controller;

import Model.Player;
import View.PlayerView;

public class PlayerController {
    private Player model;
    private PlayerView view;

    public PlayerController(Player model, PlayerView view) {
        this.model = model;
        this.view = view;
    }

    public void setPlayerName(String name) {
        model.setUsername(name);
    }

    public String getPlayerName() {
        return model.getUsername();
    }

    public void setPlayerSymbol(String symbol) {
        model.setSymbol(symbol);
    }

    public String getPlayerSymbol() {
        return model.getSymbol();
    }

    public void updateView() {
        view.printPlayer(model.getUsername(), model.getSymbol());
    }
}
