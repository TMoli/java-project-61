package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void startGame() {
        final int intervalMin = 1;
        final int intervalMax = 100;
        final int gameValuesLength = 3;
        String exercise;
        String exerciseResult;
        String[][] gameValues = new String[2][3];
        for (var i = 0; i != gameValuesLength; i++) {
            int randomNumber1 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
            int randomNumber2 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
            exercise = randomNumber1 + " " + randomNumber2;
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
            exerciseResult = Integer.toString(smallerNumber);
            gameValues[0][i] = exercise;
            gameValues[1][i] = exerciseResult;
        }
        Engine.setGameExercise("Find the greatest common divisor of given numbers.");
        Engine.setGameValues(gameValues);
        Engine.startEngine();
    }
}
