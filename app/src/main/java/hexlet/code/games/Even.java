package hexlet.code.games;

import hexlet.code.Engine;
public class Even {
    static String exercise;
    static String exerciseResult;

    public static void startGame() {
        Engine.setQuestion("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.startEngine();
    }

    public static void executeLogic() {
        final int intervalMin = 1;
        final int intervalMax = 100;
        int randomNumber = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
        exercise = Integer.toString(randomNumber);
        if (randomNumber % 2 == 0) {
            exerciseResult = "yes";
        } else {
            exerciseResult = "no";
        }
    }

    public static String getExercise() {
        return exercise;
    }

    public static String getExerciseResult() {
        return exerciseResult;
    }
}
