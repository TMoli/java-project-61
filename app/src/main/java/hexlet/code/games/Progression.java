package hexlet.code.games;

import hexlet.code.Engine;
import java.util.StringJoiner;

public class Progression {
    public static void startGame() {
        Engine.exercise = "What number is missing in the progression?";
        Engine.game = "Progression";
        Engine.startEngine();
    }
    public static void logicProgression() {
        int numbersLength = (int) (Math.random() * (10 + 1) + 5);
        int firstNumber = (int) (Math.random() * (100 + 1) + 1);
        int randomStep = (int) (Math.random() * (10 + 1) + 2);
        int lastNumber = firstNumber;
        int[] randomNumbers = new int[numbersLength];
        for (var i = 0; i < numbersLength; i++) {
            randomNumbers[i] = lastNumber + randomStep;
            lastNumber = randomNumbers[i];
        }
        int randomElement = (int) (Math.random() * (numbersLength) + 0);
        StringJoiner joiner = new StringJoiner(" ");
        String[] numbersToString = new String[numbersLength];
        for (var i = 0; i < numbersLength; i++) {
            if (i == randomElement) {
                Engine.result = Integer.toString(randomNumbers[i]);
                numbersToString[i] = "..";
            } else {
                numbersToString[i] = Integer.toString(randomNumbers[i]);
            }
            joiner.add(numbersToString[i]);
        }
        Engine.question = (joiner.toString());
    }
}