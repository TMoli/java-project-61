package hexlet.code.games;

import hexlet.code.Engine;
import java.util.StringJoiner;

public class Progression {
    public static void startGame() {
        Engine.game = "Progression";
        Engine.question = "What number is missing in the progression?";
        Engine.startEngine();
    }

    public static void executeLogic() {
        final int intervalMax1 = 100;
        final int intervalMax2 = 10;
        final int intervalMin1 = 1;
        final int intervalMin2 = 2;
        final int intervalMin3 = 5;
        int randomNumbersLength = (int) (Math.random() * (intervalMax2 - intervalMin3 + 1) + intervalMin3);
        int firstNumber = (int) (Math.random() * (intervalMax1 - intervalMin1 + 1) + intervalMin1);
        int randomStep = (int) (Math.random() * (intervalMax2 - intervalMin2 + 1) + intervalMin2);
        int lastNumber = firstNumber;
        int[] randomNumbers = new int[randomNumbersLength];
        for (var i = 0; i < randomNumbersLength; i++) {
            randomNumbers[i] = lastNumber + randomStep;
            lastNumber = randomNumbers[i];
        }
        int randomElement = (int) (Math.random() * (randomNumbersLength) + 0);
        StringJoiner joiner = new StringJoiner(" ");
        String[] numbersToString = new String[randomNumbersLength];
        for (var i = 0; i < randomNumbersLength; i++) {
            if (i == randomElement) {
                Engine.exerciseResult = Integer.toString(randomNumbers[i]);
                numbersToString[i] = "..";
            } else {
                numbersToString[i] = Integer.toString(randomNumbers[i]);
            }
            joiner.add(numbersToString[i]);
        }
        Engine.exercise = (joiner.toString());
    }
}
