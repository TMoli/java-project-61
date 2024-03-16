package hexlet.code.games;

import hexlet.code.Engine;

final public class Prime {
    public static void startGame() {
        Engine.game = "Prime";
        Engine.question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.startEngine();
    }

    public static void executeLogic() {
        final int intervalMin = 1;
        final int intervalMax = 100;
        int randomNumber = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
        Engine.exercise = Integer.toString(randomNumber);
        if (randomNumber == 2) {
            Engine.exerciseResult = "yes";
            return;
        }
        if (randomNumber % 2 == 0) {
            Engine.exerciseResult = "no";
            return;
        }
        int count = 0;
        int lastNumber = randomNumber - 2;
        int result;
        while (count != 1 & lastNumber > 2) {
            result = randomNumber % lastNumber;
            lastNumber = lastNumber - 2;
            if (result == 0) {
                count++;
            }
        }
        if (count == 1) {
            Engine.exerciseResult = "no";
        } else {
            Engine.exerciseResult = "yes";
        }
    }
}
