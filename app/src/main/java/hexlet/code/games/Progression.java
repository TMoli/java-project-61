package hexlet.code.games;

import hexlet.code.Engine;
import java.util.StringJoiner;

public class Progression {
    static String exercise;
    static String exerciseResult;

    public static void startGame() {
        Engine.setQuestion("What number is missing in the progression?");
        Engine.startEngine();
    }

    public static void executeLogic() {
        final int intervalMax1 = 100;
        final int intervalMax2 = 10;
        final int intervalMin1 = 1;
        final int intervalMin2 = 2;
        final int intervalMin3 = 5;
        int progressionLength = (int) (Math.random() * (intervalMax2 - intervalMin3 + 1) + intervalMin3);
        int firstNumber = (int) (Math.random() * (intervalMax1 - intervalMin1 + 1) + intervalMin1);
        int randomStep = (int) (Math.random() * (intervalMax2 - intervalMin2 + 1) + intervalMin2);
        int lastNumber = firstNumber;
        StringJoiner joiner = new StringJoiner(" ");
        int randomElement = (int) (Math.random() * (progressionLength) + 0);
        int result;
        for (var i = 0; i < progressionLength; i++) {
            result = lastNumber + randomStep;
            if (i == randomElement) {
                exerciseResult = Integer.toString(result);
                joiner.add("..");
            } else {
                joiner.add(Integer.toString(result));
            }
            lastNumber = result;
        }
        exercise = (joiner.toString());
    }

    public static String getExercise() {
        return exercise;
    }

    public static String getExerciseResult() {
        return exerciseResult;
    }
}
