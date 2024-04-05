package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        } else {
            int count = 0;
            int lastNumber = number - 2;
            int result;
            while (count != 1 & lastNumber > 2) {
                result = number % lastNumber;
                lastNumber = lastNumber - 2;
                if (result == 0) {
                    count++;
                }
            }
            return count != 1;
        }
    }

    public static String[][] generateRoundData() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i != Engine.ROUNDS_COUNT; i++) {
            int number = Utils.randomNumber();
            rounds[i][0] = Integer.toString(number);
            if (isPrime(number)) {
                rounds[i][1] = "yes";
            } else {
                rounds[i][1] = "no";
            }
        }
        return rounds;
    }

    public static void startGame() {
        String gameExercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.startEngine(gameExercise, generateRoundData());
    }
}
