package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    public static String game;
    public static String exercise;
    public static String question = "";
    public static String result = "";

    public static void startEngine() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner1.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(exercise);

        for (var i = 0; i < 3; i++) {
            switch (game) {
                case "Even" -> Even.logicEven();
                case "Calc" -> Calc.logicCalc();
                case "Gcd" -> Gcd.logicGcd();
                case "Progression" -> Progression.logicProgression();
                case "Prime" -> Prime.logicPrime();
                default -> {
                }
            }
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner1.next();
            if (result.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'."
                        + "\nLet's try again, " + userName);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner1.close();
    }
}
