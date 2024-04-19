package hexlet.code;

import java.util.Random;

public class Utils {
    static final int RANDOM_NUMBER_MAX_INTERVAL = 101;
    static final Random RANDOM = new Random();

    public static int randomNumber(int intervalMin, int intervalMax) {
        return RANDOM.nextInt(intervalMax - intervalMin + 1) + intervalMin;
    }

    public static int randomNumber(int intervalMax) {
        return RANDOM.nextInt(intervalMax);
    }

    public static int randomNumber() {
        return RANDOM.nextInt(RANDOM_NUMBER_MAX_INTERVAL);
    }

    public static String correctAnswer(boolean checkResult) {
        String answer;
        if (checkResult) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return answer;
    }
}
