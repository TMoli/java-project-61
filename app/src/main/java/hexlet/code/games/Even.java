package hexlet.code.games;

import hexlet.code.Engine;
public class Even {
    public static void startEven() {
        final int intervalMin = 1;
        final int intervalMax = 100;
        final int gameValuesRowsNumber = 3;
        String[][] gameValues = new String[2][gameValuesRowsNumber];
        for (var i = 0; i != gameValuesRowsNumber; i++) {
            int randomNumber = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
            gameValues[0][i] = Integer.toString(randomNumber);
            if (randomNumber % 2 == 0) {
                gameValues[1][i] = "yes";
            } else {
                gameValues[1][i] = "no";
            }
        }
        Engine.setGameExercise("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.setGameValues(gameValues);
        Engine.startEngine();
    }
}
