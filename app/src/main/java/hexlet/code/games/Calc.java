package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc  {
    public static int calculate(int number1, int number2, char operator) {
        return switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new RuntimeException();
        };
    }

    public static String[] generateRoundData() {
        String[] generatedRound = new String[2];
        char[] operators = {'+', '-', '*'};
        int number1 = Utils.randomNumber();
        int number2 = Utils.randomNumber();
        char randomOperator = operators[Utils.randomNumber(operators.length)];
        generatedRound[0] = number1 + " " + randomOperator + " " + number2;
        generatedRound[1] = Integer.toString(calculate(number1, number2, randomOperator));
        return generatedRound;
    }

    public static String[][] fillRoundsArray() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i != Engine.ROUNDS_COUNT; i++) {
            String[] round = generateRoundData();
            rounds[i][0] = round[0];
            rounds[i][1] = round[1];
        }
        return rounds;
    }

    public static void startGame() {
        String exercise = "What is the result of the expression?";
        Engine.startEngine(exercise, fillRoundsArray());
    }
}



