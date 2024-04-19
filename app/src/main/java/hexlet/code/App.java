package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
public class App {
    public static void main(String[] args) {
        System.out.printf("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - Gcd
                5 - Progression
                6 - Prime
                0 - Exit%n""");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String choice = scanner.next();
        switch (choice) {
            case "1" -> Cli.getUserName();
            case "2" ->  Even.startGame();
            case "3" ->  Calc.startGame();
            case "4" ->  Gcd.startGame();
            case "5" ->  Progression.startGame();
            case "6" ->  Prime.startGame();
            default -> {
            }
        }
        scanner.close();
    }
}
