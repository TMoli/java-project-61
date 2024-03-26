package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void startGcd() {
        final int intervalMin = 1;
        final int intervalMax = 100;
        final int gameValuesRowsNumber = 3;
        String[][] gameValues = new String[2][gameValuesRowsNumber];
        for (var i = 0; i != gameValuesRowsNumber; i++) {
            int randomNumber1 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
            int randomNumber2 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
            gameValues[0][i] = randomNumber1 + " " + randomNumber2;
            int largerNumber;
            int smallerNumber;
            int calculation = 1;
            if (randomNumber1 > randomNumber2) {
                largerNumber = randomNumber1;
                smallerNumber = randomNumber2;
            } else {
                largerNumber = randomNumber2;
                smallerNumber = randomNumber1;
            }
            while (calculation != 0) {
                calculation = largerNumber % smallerNumber;
                if (calculation != 0) {
                    largerNumber = smallerNumber;
                    smallerNumber = calculation;
                }
            }
            gameValues[1][i] = Integer.toString(smallerNumber);
        }
        Engine.setGameExercise("Find the greatest common divisor of given numbers.");
        Engine.setGameValues(gameValues);
        Engine.startEngine();
    }
}
