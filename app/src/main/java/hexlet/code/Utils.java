package hexlet.code;

import java.util.Random;

public class Utils {
    static final int RANDOM_NUMBER_MAX_INTERVAL = 101;
    static final int RANDOM_DATA_LENGTH1 = 3;
    static final int RANDOM_DATA_LENGTH2 = 4;
    static final int RANDOM_DATA_ELEMENT3 = 3;

    static final Random RANDOM = new Random();

    public static int randomNumber(int intervalMax) {

        return RANDOM.nextInt(intervalMax);
    }
    public static int randomNumber() {
        return RANDOM.nextInt(RANDOM_NUMBER_MAX_INTERVAL);
    }

    public static String[] randomData(char[] operators) {
        String[] randomData = new String[RANDOM_DATA_LENGTH1];
        randomData[0] = Integer.toString(randomNumber());
        randomData[1] = Integer.toString(randomNumber());
        randomData[2] = Character.toString(operators[RANDOM.nextInt(operators.length)]);
        return randomData;
    }
    public static int[] randomData(int firstNumber, int progressionLength, int progressionStep) {
        int[] randomData = new int[RANDOM_DATA_LENGTH2];
        randomData[0] = firstNumber;
        randomData[1] = randomNumber(progressionLength);
        randomData[2] = progressionLength;
        randomData[RANDOM_DATA_ELEMENT3] = progressionStep;
        return randomData;
    }

}
