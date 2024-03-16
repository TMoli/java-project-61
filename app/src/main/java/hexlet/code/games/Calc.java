package hexlet.code.games;

import hexlet.code.Engine;
public class Calc  {
    public static void startGame() {
        Engine.game = "Calc";
        Engine.question = "What is the result of the expression?";
        Engine.startEngine();
    }

    public static void executeLogic() {
        int intervalMin = 1;
        int intervalMax = 100;
        int randomNumber1 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
        int randomNumber2 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
        char[] operators = new char[]{'+', '-', '*'};
        char randomOperator = operators[(int) (Math.random() * (2 + 1) + 0)];
        Engine.exercise = randomNumber1 + " " + randomOperator + " " + randomNumber2;
        Engine.exerciseResult = switch (randomOperator) {
            case '+' -> Integer.toString(randomNumber1 + randomNumber2);
            case '-' -> Integer.toString(randomNumber1 - randomNumber2);
            case '*' -> Integer.toString(randomNumber1 * randomNumber2);
            default -> Integer.toString(0);
        };
    }
}



