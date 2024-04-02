package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static int generateRoundData() {
        Random random = new Random();
        return random.nextInt(101);
    }

    public static String[] doEvenCheck() {
        int generatedData = generateRoundData();
        String[] results = new String[2];
        results[0] = Integer.toString(generatedData);
        if (generatedData % 2 == 0) {
            results[1] = "yes";
        } else {
            results[1] = "no";
        }
        return results;
    }

    public static String[][] collectRounds() {
        String[][] rounds = new String[Engine.ROUNDS_NUMBER][2];
        for (var i = 0; i != Engine.ROUNDS_NUMBER; i++) {
            String[] evenResults = doEvenCheck();
            rounds[i][0] = evenResults[0];
            rounds[i][1] = evenResults[1];
        }
        return rounds;
    }

    public static void startGame() {
        String gameExercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.startEngine(gameExercise, collectRounds());
    }
}
