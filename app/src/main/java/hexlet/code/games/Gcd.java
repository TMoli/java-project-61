package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    static String exercise;
    static String exerciseResult;

    public static void startGame() {
        Engine.setQuestion("Find the greatest common divisor of given numbers.");
        Engine.startEngine();
    }

    public static void executeLogic() {
        final int intervalMin = 1;
        final int intervalMax = 100;
        int randomNumber1 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
        int randomNumber2 = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
        exercise = randomNumber1 + " " + randomNumber2;
        int largerNumber;
        int smallerNumber;
        int calculation = 1;
        if (randomNumber1 > randomNumber2) {
            largerNumber = randomNumber1;
            smallerNumber = randomNumber2;
        } else {
            largerNumber = randomNumber2;
            smallerNumber = randomNumber1;
        }
        while (calculation != 0) {
            calculation = largerNumber % smallerNumber;
            if (calculation != 0) {
                largerNumber = smallerNumber;
                smallerNumber = calculation;
            }
        }
        exerciseResult = Integer.toString(smallerNumber);
    }

    public static String getExercise() {
        return exercise;
    }

    public static String getExerciseResult() {
        return exerciseResult;
    }
}
