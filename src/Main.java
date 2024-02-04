import Model.*;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.setUsername("Max");
        System.out.println(player1.getUsername());

        player1.setSymbol("X");
        System.out.println(player1.getSymbol());
    }
}