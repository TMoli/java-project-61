package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static void startEngine(String gameExercise, String[][] rounds) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner1.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameExercise);
        for (String[] round : rounds) {
            System.out.println("Question: " + round[0]);
            System.out.print("Your answer: ");
            String answer = scanner1.next();
            if (round[1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + round[1] + "'." + "\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner1.close();
    }
}
