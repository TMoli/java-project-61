package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.StringJoiner;

public class Progression {
    static final int RANDOM_NUMBER_MAX_INTERVAL = 101;
    static final int PROGRESSION_INTERVAL_MIN = 5;
    static final int PROGRESSION_INTERVAL_MAX = 10;
    static final int RANDOM_STEP_INTERVAL_MIN = 2;
    static final int RANDOM_STEP_INTERVAL_MAX = 10;

    public static int[] generateRoundData() {
        Random random = new Random();
        int[] data = new int[4];
        data[0] = random.nextInt(PROGRESSION_INTERVAL_MAX - PROGRESSION_INTERVAL_MIN + 1)
                + PROGRESSION_INTERVAL_MIN; //progression length
        data[1] = random.nextInt(RANDOM_NUMBER_MAX_INTERVAL); //first number
        data[2] = random.nextInt(RANDOM_STEP_INTERVAL_MAX - RANDOM_STEP_INTERVAL_MIN + 1)
                + RANDOM_STEP_INTERVAL_MIN; //random step
        data[3] = random.nextInt(data[0]); //random element from 0 to progression length
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
