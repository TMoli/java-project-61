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
                Even.startEven();
                break;
            case "3":
                Calc.startCalc();
                break;
            case "4":
                Gcd.startGcd();
                break;
            case "5":
                Progression.startProgression();
                break;
            case "6":
                Prime.startPrime();
                break;
            default:
                break;
        }
        scanner.close();
    }
}
