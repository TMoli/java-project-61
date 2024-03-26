package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void startPrime() {
        final int intervalMin = 1;
        final int intervalMax = 100;
        final int gameValuesRowsNumber = 3;
        String[][] gameValues = new String[2][gameValuesRowsNumber];
        for (var i = 0; i != gameValuesRowsNumber; i++) {
            int randomNumber = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
            gameValues[0][i] = Integer.toString(randomNumber);
            if (randomNumber == 2) {
                gameValues[1][i] = "yes";
            } else if (randomNumber % 2 == 0) {
                gameValues[1][i] = "no";
            } else {
                int count = 0;
                int lastNumber = randomNumber - 2;
                int result;
                while (count != 1 & lastNumber > 2) {
                    result = randomNumber % lastNumber;
                    lastNumber = lastNumber - 2;
                    if (result == 0) {
                        count++;
                    }
                }
                if (count == 1) {
                    gameValues[1][i] = "no";
                } else {
                    gameValues[1][i] = "yes";
                }
            }
        }
        Engine.setGameExercise("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.setGameValues(gameValues);
        Engine.startEngine();
    }
}
