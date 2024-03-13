package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {
    public static void startGame() {
        Engine.exercise = "What is the result of the expression?";
        Engine.game = "Calc";
        Engine.startEngine();
    }
    public static void logicCalc() {
        int number1 = (int) (Math.random() * (100 + 1) + 1);
        int number2 = (int) (Math.random() * (100 + 1) + 1);
        char[] operators = new char[]{'+', '-', '*'};
        char randOperator = operators[(int) (Math.random() * (2 + 1) + 0)];
        Engine.question = number1 + " " + randOperator + " " + number2;
        Engine.result = switch (randOperator) {
            case '+' -> Integer.toString(number1 + number2);
            case '-' -> Integer.toString(number1 - number2);
            case '*' -> Integer.toString(number1 * number2);
            default -> Integer.toString(0);
        };
    }
}



