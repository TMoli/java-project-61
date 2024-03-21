package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    static String exercise;
    static String exerciseResult;

    public static void startGame() {
        Engine.setQuestion("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.startEngine();
    }

    public static void executeLogic() {
        final int intervalMin = 1;
        final int intervalMax = 100;
        int randomNumber = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
        exercise = Integer.toString(randomNumber);
        if (randomNumber == 2) {
            exerciseResult = "yes";
            return;
        }
        if (randomNumber % 2 == 0) {
            exerciseResult = "no";
            return;
        }
        int count = 0;
        int lastNumber = randomNumber - 2;
        int result;
        while (count != 1 & lastNumber > 2) {
            result = randomNumber % lastNumber;
            lastNumber = lastNumber - 2;
            if (result == 0) {
                count++;
            }
        }
        if (count == 1) {
            exerciseResult = "no";
        } else {
            exerciseResult = "yes";
        }
    }

    public static String getExercise() {
        return exercise;
    }

    public static String getExerciseResult() {
        return exerciseResult;
    }
}
