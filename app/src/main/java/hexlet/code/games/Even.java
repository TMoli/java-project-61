package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String[][] generateRoundData() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i != Engine.ROUNDS_COUNT; i++) {
            int number = Utils.randomNumber();
            rounds[i][0] = Integer.toString(number);
            if (isEven(number)) {
                rounds[i][1] = "yes";
            } else {
                rounds[i][1] = "no";
            }
        }
        return rounds;
    }

    public static void startGame() {
        String exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.startEngine(exercise, generateRoundData());
    }
}
