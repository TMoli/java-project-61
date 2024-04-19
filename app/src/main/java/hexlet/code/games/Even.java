package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String[] generateRoundData() {
        String[] generatedRound = new String[2];
        int number = Utils.randomNumber();
        generatedRound[0] = Integer.toString(number);
        if (isEven(number)) {
            generatedRound[1] = "yes";
        } else {
            generatedRound[1] = "no";
        }
        return generatedRound;
    }

    public static String[][] fillRoundsArray() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i != Engine.ROUNDS_COUNT; i++) {
            String[] round = generateRoundData();
            rounds[i][0] = round[0];
            rounds[i][1] = round[1];
        }
        return rounds;
    }

    public static void startGame() {
        String exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.startEngine(exercise, fillRoundsArray());
    }
}
