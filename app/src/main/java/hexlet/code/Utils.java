package hexlet.code;

import java.util.Random;

public class Utils {
    static final int RANDOM_NUMBER_MAX_INTERVAL = 101;
    static Random random = new Random();

    public static int randomNumber(int intervalMax) {
        return random.nextInt(intervalMax);
    }
    public static int randomNumber() {
        return random.nextInt(RANDOM_NUMBER_MAX_INTERVAL);
    }

    public static String[] randomData(char[] operators) {
        String[] randomData = new String[3];
        randomData[0] = Integer.toString(randomNumber());
        randomData[1] = Integer.toString(randomNumber());
        randomData[2] = Character.toString(operators[random.nextInt(operators.length)]);
        return randomData;
    }
    public static int[] randomData(int firstNumber, int progressionLength, int progressionStep) {
        int[] randomData = new int[4];
        randomData[0] = firstNumber;
        randomData[1] = randomNumber(progressionLength);
        randomData[2] = progressionLength;
        randomData[3] = progressionStep;
        return randomData;
    }

}
