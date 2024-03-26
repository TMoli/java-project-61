package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String gameExercise;
    private static String[][] gameValues;

    public static void setGameExercise(String exercise) {
        gameExercise = exercise;
    }

    public static void setGameValues(String[][] values) {
        gameValues = values;
    }

    public static void startEngine() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner1.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameExercise);
        final int roundsNumber = 3;
        for (var i = 0; i < roundsNumber; i++) {
            System.out.println("Question: " + gameValues[0][i]);
            System.out.print("Your answer: ");
            String answer = scanner1.next();
            if (gameValues[1][i].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + gameValues[1][i] + "'." + "\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner1.close();
    }
}
