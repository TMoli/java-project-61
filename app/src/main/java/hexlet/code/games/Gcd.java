package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void startGame() {
        Engine.exercise = "Find the greatest common divisor of given numbers.";
        Engine.game = "Gcd";
        Engine.startEngine();
    }
    public static void logicGcd() {
        int number1 = (int) (Math.random() * (100 + 1) + 1);
        int number2 = (int) (Math.random() * (100 + 1) + 1);
        Engine.question = number1 + " " + number2;
        int largerNumber;
        int smallerNumber;
        int calculation = 1;
        if (number1 > number2) {
            largerNumber = number1;
            smallerNumber = number2;
        } else {
            largerNumber = number2;
            smallerNumber = number1;
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
