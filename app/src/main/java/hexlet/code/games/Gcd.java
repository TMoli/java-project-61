package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    static final int RANDOM_NUMBER_MAX_INTERVAL = 101;

    public static int[] generateRoundData() {
        Random random = new Random();
        int[] data = new int[2];
        data[0] = random.nextInt(RANDOM_NUMBER_MAX_INTERVAL);
        data[1] = random.nextInt(RANDOM_NUMBER_MAX_INTERVAL);
        return data;
    }

    public static String[] doGcdFind() {
        int[] generatedData = generateRoundData();
        String[] results = new String[2];
        results[0] = generatedData[0] + " " + generatedData[1];
        int largerNumber;
        int smallerNumber;
        int calculation = 1;
        if (generatedData[0] > generatedData[1]) {
            largerNumber = generatedData[0];
            smallerNumber = generatedData[1];
        } else {
            largerNumber = generatedData[1];
            smallerNumber = generatedData[0];
        }
        while (calculation != 0) {
            calculation = largerNumber % smallerNumber;
            if (calculation != 0) {
                largerNumber = smallerNumber;
                smallerNumber = calculation;
            }
        }
        results[1] = Integer.toString(smallerNumber);
        return results;
    }

    public static String[][] collectRounds() {
        String[][] rounds = new String[Engine.ROUNDS_NUMBER][2];
        for (var i = 0; i != Engine.ROUNDS_NUMBER; i++) {
            String[] gcdResults = doGcdFind();
            rounds[i][0] = gcdResults[0];
            rounds[i][1] = gcdResults[1];
        }
        return rounds;
    }

    public static void startGame() {
        String gameExercise = "Find the greatest common divisor of given numbers.";
        Engine.startEngine(gameExercise, collectRounds());
    }
}
