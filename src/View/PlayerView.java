package View;
import Model.Player;

public class PlayerView {

    public void printPlayer(Player player) {
        System.out.println("Name: " + player.getUsername());
        System.out.println("Symbol: " + player.getSymbol());
    }
}
