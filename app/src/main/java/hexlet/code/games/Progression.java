package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;

public class Progression {
    public static final int PROGRESSION_LENGTH_MIN = 5;
    public static final int PROGRESSION_LENGTH_MAX = 10;
    public static final int PROGRESSION_STEP_MIN = 2;
    public static final int PROGRESSION_STEP_MAX = 10;

    public static String[] generateProgression(int firstNumber, int length, int step) {
        String[] generatedProgression = new String[length];
        int lastNumber = firstNumber;
        int currentNumber;
        for (var i = 0; i < length; i++) {
            currentNumber = lastNumber + step;
            generatedProgression[i] = Integer.toString(currentNumber);
            lastNumber = currentNumber;
        }
        return generatedProgression;
    }

    public static String[] generateRoundData() {
        String[] generatedRound = new String[2];
        int progressionFirstNumber = Utils.randomNumber();
        int progressionLength = Utils.randomNumber(PROGRESSION_LENGTH_MIN, PROGRESSION_LENGTH_MAX);
        int progressionStep = Utils.randomNumber(PROGRESSION_STEP_MIN, PROGRESSION_STEP_MAX);
        String[] progression = generateProgression(progressionFirstNumber, progressionLength, progressionStep);
        int hiddenNumber = Utils.randomNumber(progressionLength - 1);
        generatedRound[1] = progression[hiddenNumber];
        progression[hiddenNumber] = "..";
        generatedRound[0] = Arrays.toString(progression).replace("[", "").replace("]",
                "").replace(",", "");
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
        String exercise = "What number is missing in the progression?";
        Engine.startEngine(exercise, fillRoundsArray());
    }
}
