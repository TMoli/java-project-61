package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc  {
    static final char[] OPERATORS = new char[]{'+', '-', '*'};
    static final int RANDOM_NUMBER_MAX_INTERVAL = 101;
    static final int RANDOM_OPERATORS_MAX_INTERVAL = 3;
    static final int DATA_LENGTH = 3;


    public static String[] generateRoundData() {
        Random random = new Random();
        String[] data = new String[DATA_LENGTH];
        data[0] = Integer.toString(random.nextInt(RANDOM_NUMBER_MAX_INTERVAL));
        data[1] = Integer.toString(random.nextInt(RANDOM_NUMBER_MAX_INTERVAL));
        data[2] = Character.toString(OPERATORS[random.nextInt(RANDOM_OPERATORS_MAX_INTERVAL)]);
        return data;
    }

    public static String[] doCalculation() {
        String[] generatedData = generateRoundData();
        String[] results = new String[2];
        results[0] = generatedData[0] + " " + generatedData[2] + " " + generatedData[1];
        results[1] = switch (generatedData[2]) {
            case "+" -> Integer.toString(Integer.parseInt(generatedData[0]) + Integer.parseInt(generatedData[1]));
            case "-" -> Integer.toString(Integer.parseInt(generatedData[0]) - Integer.parseInt(generatedData[1]));
            case "*" -> Integer.toString(Integer.parseInt(generatedData[0]) * Integer.parseInt(generatedData[1]));
            default -> throw new RuntimeException();
        };
        return results;
    }

    public static String[][] collectRounds() {
        String[][] rounds = new String[Engine.ROUNDS_NUMBER][2];
        for (var i = 0; i != Engine.ROUNDS_NUMBER; i++) {
            String[] calculationResults = doCalculation();
            rounds[i][0] = calculationResults[0];
            rounds[i][1] = calculationResults[1];
        }
        return rounds;
    }

    public static void startGame() {
        String gameExercise = "What is the result of the expression?";
        Engine.startEngine(gameExercise, collectRounds());
    }
}



