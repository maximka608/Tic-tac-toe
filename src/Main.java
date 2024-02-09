import Controller.*;
import Model.*;
import View.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Are you ready play a game? Please Enter Y/N ...");
        Scanner userInput = new Scanner(System.in);

        String userAnswer;
        int countIterations = 0, countAttempt = 0;
        do {
            if (countIterations >= 1) {
                System.out.println("Please, Enter Y/N");
            }
            userAnswer = userInput.nextLine();
            countIterations++;
        } while (!userAnswer.equals("Y") && !userAnswer.equals("N"));

        if (userAnswer.equals("Y")){
            System.out.println("Great, you are ready");
        } else {
            System.out.print("Great, you are not ready ((");
            System.exit(0);
        }

        String username;
        String player_symbol;

        System.out.println("Input your username!!!");
        username = userInput.nextLine();
        System.out.println("Please, choose X or 0!!!!");
        do {
            if (countAttempt >= 1) {
                System.out.println("Please, choose X or 0!!!!");
            }
            player_symbol = userInput.nextLine();
            countAttempt++;
        } while (!player_symbol.equals("X") && !player_symbol.equals("0"));

        PlayerController playerController = new PlayerController(new Player(), new PlayerView());
        playerController.setPlayerName(username);
        playerController.setPlayerSymbol(player_symbol);

        System.out.println("OK, your info");
        playerController.updateView();


    }
}