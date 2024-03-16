package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    public static String game;
    public static String question = "";
    public static String exercise;
    public static String exerciseResult = "";
    public static String userName = "";

    public static void startEngine() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner1.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(question);
        int roundsNumber = 3;
        for (var i = 0; i < roundsNumber; i++) {
            switch (game) {
                case "Even" -> Even.executeLogic();
                case "Calc" -> Calc.executeLogic();
                case "Gcd" -> Gcd.executeLogic();
                case "Progression" -> Progression.executeLogic();
                case "Prime" -> Prime.executeLogic();
                default -> {
                }
            }
            System.out.println("Question: " + exercise);
            System.out.print("Your answer: ");
            String answer = scanner1.next();
            if (exerciseResult.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + exerciseResult + "'." + "\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner1.close();
    }
}
