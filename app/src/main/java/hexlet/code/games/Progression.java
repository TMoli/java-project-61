package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.StringJoiner;

public class Progression {
    static final int INTERVAL_MIN1 = 2;
    static final int INTERVAL_MIN2 = 5;
    static final int INTERVAL_MAX = 10;

    public static int[] generateRoundData() {
        Random random = new Random();
        int[] data = new int[4];
        data[0] = random.nextInt(INTERVAL_MAX - INTERVAL_MIN2 + 1) + INTERVAL_MIN2; //progression length
        data[1] = random.nextInt(101); //first number
        data[2] = random.nextInt(INTERVAL_MAX - INTERVAL_MIN1 + 1) + INTERVAL_MIN1; //random step
        data[3] = random.nextInt(data[0]); //random element
        return data;
    }

    public static String[] generateProgression() {
        int[] generatedData = generateRoundData();
        String[] results = new String[2];
        int lastNumber = generatedData[1];
        StringJoiner joiner = new StringJoiner(" ");
        int currentNumber;
        for (var k = 0; k < generatedData[0]; k++) {
            currentNumber = lastNumber + generatedData[2];
            if (k == generatedData[3]) {
                results[1] = Integer.toString(currentNumber);
                joiner.add("..");
            } else {
                joiner.add(Integer.toString(currentNumber));
            }
            lastNumber = currentNumber;
            results[0] = (joiner.toString());
        }
        return results;
    }


    public static String[][] collectRounds() {
        String[][] rounds = new String[Engine.ROUNDS_NUMBER][2];
        for (var i = 0; i != Engine.ROUNDS_NUMBER; i++) {
            String[] progressionResults = generateProgression();
            rounds[i][0] = progressionResults[0];
            rounds[i][1] = progressionResults[1];
        }
        return rounds;
    }

    public static void startGame() {
        String gameExercise = "What number is missing in the progression?";
        Engine.startEngine(gameExercise, collectRounds());
    }
}
