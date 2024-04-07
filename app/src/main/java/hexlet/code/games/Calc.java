package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc  {
    public static int calculate(int number1, int number2, String operator) {
        return switch (operator) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> throw new RuntimeException();
        };
    }

    public static String[][] generateRoundData() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        char[] operators = {'+', '-', '*'};
        for (var i = 0; i != Engine.ROUNDS_COUNT; i++) {
            String[] operations = Utils.randomData(operators);
            rounds[i][0] = operations[0] + " " + operations[2] + " " + operations[1];
            rounds[i][1] = Integer.toString(calculate(Integer.parseInt(operations[0]), Integer.parseInt(operations[1]),
                    operations[2]));
        }
        return rounds;
    }

    public static void startGame() {
        String exercise = "What is the result of the expression?";
        Engine.startEngine(exercise, generateRoundData());
    }
}



