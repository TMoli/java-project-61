package hexlet.code.games;

import hexlet.code.Engine;
public class Calc  {
    public static void startCalc() {
        final int intervalMin = 1;
        final int intervalMax = 100;
        final int gameValuesRowsNumber = 3;
        char[] operators = new char[]{'+', '-', '*'};
        String[][] gameValues = new String[2][gameValuesRowsNumber];
        for (var i = 0; i != gameValuesRowsNumber; i++) {
            int randomNumber1 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
            int randomNumber2 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
            char randomOperator = operators[(int) (Math.random() * (2 + 1) + 0)];
            gameValues[0][i] = randomNumber1 + " " + randomOperator + " " + randomNumber2;
            gameValues[1][i] = switch (randomOperator) {
                case '+' -> Integer.toString(randomNumber1 + randomNumber2);
                case '-' -> Integer.toString(randomNumber1 - randomNumber2);
                case '*' -> Integer.toString(randomNumber1 * randomNumber2);
                default -> Integer.toString(0);
            };
        }
        Engine.setGameExercise("What is the result of the expression?");
        Engine.setGameValues(gameValues);
        Engine.startEngine();
    }
}



