package hexlet.code.games;

import hexlet.code.Engine;
public class Calc  {
    static String exercise;
    static String exerciseResult;

    public static void startGame() {
        Engine.setQuestion("What is the result of the expression?");
        Engine.startEngine();
    }

    public static void executeLogic() {
        final int intervalMin = 1;
        final int intervalMax = 100;
        int randomNumber1 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
        int randomNumber2 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
        char[] operators = new char[]{'+', '-', '*'};
        char randomOperator = operators[(int) (Math.random() * (2 + 1) + 0)];
        exercise = randomNumber1 + " " + randomOperator + " " + randomNumber2;
        exerciseResult = switch (randomOperator) {
            case '+' -> Integer.toString(randomNumber1 + randomNumber2);
            case '-' -> Integer.toString(randomNumber1 - randomNumber2);
            case '*' -> Integer.toString(randomNumber1 * randomNumber2);
            default -> Integer.toString(0);
        };
    }

    public static String getExercise() {
        return exercise;
    }

    public static String getExerciseResult() {
        return exerciseResult;
    }
}



