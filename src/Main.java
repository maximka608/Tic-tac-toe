import Model.*;
import View.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Are you ready play a game? Please Enter Y/N ...");
        Scanner userInput = new Scanner(System.in);

        String userAnswer = userInput.nextLine();

        if (userAnswer.equals("Y")){
            System.out.println("Great, you are ready");
        } else {
            System.out.println("Great, you are not ready");
            System.exit(0);
        }

        String username;
        String player_symbol;

        System.out.println("Input your username!!!");
        username = userInput.nextLine();
        System.out.println("Please, choose X or 0!!!!");
        player_symbol = userInput.nextLine();


    }
}