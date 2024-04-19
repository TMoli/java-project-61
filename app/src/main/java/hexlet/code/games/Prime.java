package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        int result = 0;
        if (number > 2 && number % 2 != 0) {
            int lastNumber = number - 2;
            while (lastNumber > 2) {
                result = number % lastNumber;
                lastNumber = lastNumber - 2;
                if (result == 0) {
                    break;
                }
            }
        }
        return result != 0;
    }

    public static String[] generateRoundData() {
        String[] generatedRound = new String[2];
        int number = Utils.randomNumber();
        generatedRound[0] = Integer.toString(number);
        generatedRound[1] = Utils.correctAnswer(isPrime(number));
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
        String exercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.startEngine(exercise, fillRoundsArray());
    }
}
