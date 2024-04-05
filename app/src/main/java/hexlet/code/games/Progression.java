package hexlet.code.games;

import hexlet.code.Engine;
import java.util.StringJoiner;
import hexlet.code.Utils;

public class Progression {
    public static String[] doProgression(int[] data) {
        String[] results = new String[2];
        int lastNumber = data[0];
        StringJoiner joiner = new StringJoiner(" ");
        int currentNumber;
        for (var k = 0; k < data[2]; k++) {
            currentNumber = lastNumber + data[3];
            if (k == data[1]) {
                results[1] = Integer.toString(currentNumber);
                joiner.add("..");
            } else {
                joiner.add(Integer.toString(currentNumber));
            }
            lastNumber = currentNumber;
        }
        results[0] = joiner.toString();
        return results;
    }

    public static String[][] generateRoundData() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i != Engine.ROUNDS_COUNT; i++) {
            rounds[i] = doProgression(Utils.randomData(55, 10, 5));
        }
        return rounds;
    }

    public static void startGame() {
        String gameExercise = "What number is missing in the progression?";
        Engine.startEngine(gameExercise, generateRoundData());
    }
}
