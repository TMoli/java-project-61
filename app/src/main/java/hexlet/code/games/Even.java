package hexlet.code.games;

import hexlet.code.Engine;
public class Even {
    public static void startGame() {
        final int intervalMin = 1;
        final int intervalMax = 100;
        final int gameValuesLength = 3;
        String exercise;
        String exerciseResult;
        String[][] gameValues = new String[2][3];
        for (var i = 0; i != gameValuesLength; i++) {
            int randomNumber = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
            exercise = Integer.toString(randomNumber);
            if (randomNumber % 2 == 0) {
                exerciseResult = "yes";
            } else {
                exerciseResult = "no";
            }
            gameValues[0][i] = exercise;
            gameValues[1][i] = exerciseResult;
        }
        Engine.setGameExercise("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.setGameValues(gameValues);
        Engine.startEngine();
    }
}
