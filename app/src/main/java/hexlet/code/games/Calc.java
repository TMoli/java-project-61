package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc  {
    static final char[] OPERATORS = new char[]{'+', '-', '*'};

    public static String[] generateRoundData() {
        Random random = new Random();
        String[] data = new String[3];
        data[0] = Integer.toString(random.nextInt(101));
        data[1] = Integer.toString(random.nextInt(101));
        data[2] = Character.toString(OPERATORS[random.nextInt(3)]);
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



