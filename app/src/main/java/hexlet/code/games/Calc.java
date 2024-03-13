package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {
    public static void startGame() {
        Engine.exercise = "What is the result of the expression?";
        Engine.game = "Calc";
        Engine.startEngine();
    }
    public static void logicCalc() {
        char[] operators = new char[]{'+', '-', '*'};
        char randOperator = operators[(int) (Math.random() * (2 + 1) + 0)];
        Engine.question = Engine.number1 + " " + randOperator + " " + Engine.number2;
        Engine.result = switch (randOperator) {
            case '+' -> Integer.toString(Engine.number1 + Engine.number2);
            case '-' -> Integer.toString(Engine.number1 - Engine.number2);
            case '*' -> Integer.toString(Engine.number1 * Engine.number2);
            default -> Integer.toString(0);
        };
    }
}



