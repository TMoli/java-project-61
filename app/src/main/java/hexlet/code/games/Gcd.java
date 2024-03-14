package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void startGame() {
        Engine.game = "Gcd";
        Engine.question = "Find the greatest common divisor of given numbers.";
        Engine.startEngine();
    }

    public static void executeLogic() {
        int number1 = (int) (Math.random() * (100 + 1) + 1);
        int number2 = (int) (Math.random() * (100 + 1) + 1);
        Engine.exercise = number1 + " " + number2;
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
        Engine.exerciseResult = Integer.toString(smallerNumber);
    }
}
