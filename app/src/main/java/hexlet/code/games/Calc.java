package hexlet.code.games;

import hexlet.code.Engine;
public class Calc  {
    public static void startGame() {
        final int intervalMin = 1;
        final int intervalMax = 100;
        final int gameValuesLength = 3;
        String exercise;
        String exerciseResult;
        char[] operators = new char[]{'+', '-', '*'};
        String[][] gameValues = new String[2][3];
        for (var i = 0; i != gameValuesLength; i++) {
            int randomNumber1 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
            int randomNumber2 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
            char randomOperator = operators[(int) (Math.random() * (2 + 1) + 0)];
            exercise = randomNumber1 + " " + randomOperator + " " + randomNumber2;
            exerciseResult = switch (randomOperator) {
                case '+' -> Integer.toString(randomNumber1 + randomNumber2);
                case '-' -> Integer.toString(randomNumber1 - randomNumber2);
                case '*' -> Integer.toString(randomNumber1 * randomNumber2);
                default -> Integer.toString(0);
            };
            gameValues[0][i] = exercise;
            gameValues[1][i] = exerciseResult;
        }
        Engine.setGameExercise("What is the result of the expression?");
        Engine.setGameValues(gameValues);
        Engine.startEngine();
    }
}



