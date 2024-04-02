package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    static final int RANDOM_NUMBER_MAX_INTERVAL = 101;

    public static int generateRoundData() {
        Random random = new Random();
        return random.nextInt(RANDOM_NUMBER_MAX_INTERVAL);
    }

    public static String[] doPrimeCheck() {
        int generateData = generateRoundData();
        String[] results = new String[2];
        results[0] = Integer.toString(generateData);
        if (generateData == 2) {
            results[1] = "yes";
        } else if (generateData % 2 == 0) {
            results[1] = "no";
        } else {
            int count = 0;
            int lastNumber = generateData - 2;
            int result;
            while (count != 1 & lastNumber > 2) {
                result = generateData % lastNumber;
                lastNumber = lastNumber - 2;
                if (result == 0) {
                    count++;
                }
            }
            if (count == 1) {
                results[1] = "no";
            } else {
                results[1] = "yes";
            }
        }
        return results;
    }

    public static String[][] collectRounds() {
        String[][] rounds = new String[Engine.ROUNDS_NUMBER][2];
        for (var i = 0; i != Engine.ROUNDS_NUMBER; i++) {
            String[] primeResults = doPrimeCheck();
            rounds[i][0] = primeResults[0];
            rounds[i][1] = primeResults[1];
        }
        return  rounds;
    }

    public static void startGame() {
        String gameExercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.startEngine(gameExercise, collectRounds());
    }
}
