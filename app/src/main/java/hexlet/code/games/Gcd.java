package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Gcd {

    public static int findGcd(int number1, int number2) {
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
        return smallerNumber;
    }

    public static String[][] generateRandomData() {
        int number1 = Utils.randomNumber();
        int number2 = Utils.randomNumber();
        int gcd = findGcd(number1, number2);
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i != Engine.ROUNDS_COUNT; i++) {
            rounds[i][0] = number1 + " " + number2;
            rounds[i][1] = Integer.toString(gcd);
        }
        return rounds;
    }

    public static void startGame() {
        String exercise = "Find the greatest common divisor of given numbers.";
        Engine.startEngine(exercise, generateRandomData());
    }
}
