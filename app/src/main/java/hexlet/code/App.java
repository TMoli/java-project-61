package hexlet.code;

import java.util.Scanner;
import java.util.StringJoiner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        StringJoiner gamesList = new StringJoiner("\n");
        gamesList.add("Please enter the game number and press Enter.");
        gamesList.add("1 - Greet");
        gamesList.add("2 - Even");
        gamesList.add("3 - Calc");
        gamesList.add("4 - Gcd");
        gamesList.add("5 - Progression");
        gamesList.add("6 - Prime");
        gamesList.add("0 - Exit");
        System.out.println(gamesList);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String choice = scanner.next();
        switch (choice) {
            case "1":
                Cli.getUserName();
                break;
            case "2":
                Even.startGame();
                break;
            case "3":
                Calc.startGame();
                break;
            case "4":
                Gcd.startGame();
                break;
            case "5":
                Progression.startGame();
                break;
            case "6":
                Prime.startGame();
                break;
            default:
                break;
        }
        scanner.close();
    }
}
