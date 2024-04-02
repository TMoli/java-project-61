package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;
    public static void startEngine(String gameExercise, String[][] roundsData) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner1.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameExercise);
        for (String[] roundData : roundsData) {
            System.out.println("Question: " + roundData[0]);
            System.out.print("Your answer: ");
            String answer = scanner1.next();
            if (roundData[1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + roundData[1] + "'." + "\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner1.close();
    }
}
