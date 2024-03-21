package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    static String question = "";
    static String exercise;
    static String exerciseResult = "";
    static String userName = "";

    public static void setQuestion(String gameQuestion) {
        question = gameQuestion;
    }
    public static void startEngine() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner1.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(question);
        final int roundsNumber = 3;
        for (var i = 0; i < roundsNumber; i++) {
            switch (question) {
                case "Answer 'yes' if the number is even, otherwise answer 'no'." -> {
                    Even.executeLogic();
                    exercise = Even.getExercise();
                    exerciseResult = Even.getExerciseResult();
                }
                case "What is the result of the expression?" -> {
                    Calc.executeLogic();
                    exercise = Calc.getExercise();
                    exerciseResult = Calc.getExerciseResult();
                }
                case "Find the greatest common divisor of given numbers." -> {
                    Gcd.executeLogic();
                    exercise = Gcd.getExercise();
                    exerciseResult = Gcd.getExerciseResult();
                }
                case "What number is missing in the progression?" -> {
                    Progression.executeLogic();
                    exercise = Progression.getExercise();
                    exerciseResult = Progression.getExerciseResult();
                }
                case "Answer 'yes' if given number is prime. Otherwise answer 'no'." -> {
                    Prime.executeLogic();
                    exercise = Prime.getExercise();
                    exerciseResult = Prime.getExerciseResult();
                }
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
