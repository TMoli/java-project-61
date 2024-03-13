package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void startGame() {
        Engine.exercise = "Find the greatest common divisor of given numbers.";
        Engine.game = "Gcd";
        Engine.startEngine();
    }
    public static void logicGcd() {
        Engine.question = Engine.number1 + " " + Engine.number2;
        int largerNumber;
        int smallerNumber;
        int calculation = 1;
        if (Engine.number1 > Engine.number2) {
            largerNumber = Engine.number1;
            smallerNumber = Engine.number2;
        } else {
            largerNumber = Engine.number2;
            smallerNumber = Engine.number1;
        }
        while (calculation != 0) {
            calculation = largerNumber % smallerNumber;
            if (calculation != 0) {
                largerNumber = smallerNumber;
                smallerNumber = calculation;
            }
        }
        Engine.result = Integer.toString(largerNumber);
    }
}
