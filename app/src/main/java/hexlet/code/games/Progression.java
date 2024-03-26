package hexlet.code.games;

import hexlet.code.Engine;
import java.util.StringJoiner;

public class Progression {
    public static void startProgression() {
        final int intervalMax1 = 100;
        final int intervalMax2 = 10;
        final int intervalMin1 = 1;
        final int intervalMin2 = 2;
        final int intervalMin3 = 5;
        final int gameValuesRowsNumber = 3;
        String[][] gameValues = new String[2][gameValuesRowsNumber];
        for (var i = 0; i != gameValuesRowsNumber; i++) {
            int progressionLength = (int) (Math.random() * (intervalMax2 - intervalMin3 + 1) + intervalMin3);
            int firstNumber = (int) (Math.random() * (intervalMax1 - intervalMin1 + 1) + intervalMin1);
            int randomStep = (int) (Math.random() * (intervalMax2 - intervalMin2 + 1) + intervalMin2);
            int lastNumber = firstNumber;
            StringJoiner joiner = new StringJoiner(" ");
            int randomElement = (int) (Math.random() * (progressionLength) + 0);
            int result;
            for (var k = 0; k < progressionLength; k++) {
                result = lastNumber + randomStep;
                if (k == randomElement) {
                    gameValues[1][i] = Integer.toString(result);
                    joiner.add("..");
                } else {
                    joiner.add(Integer.toString(result));
                }
                lastNumber = result;
            }
            gameValues[0][i] = (joiner.toString());
        }
        Engine.setGameExercise("What number is missing in the progression?");
        Engine.setGameValues(gameValues);
        Engine.startEngine();
    }
}
