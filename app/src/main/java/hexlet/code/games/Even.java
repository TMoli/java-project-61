package hexlet.code.games;

import hexlet.code.Engine;
public class Even {
    public static void startGame() {
        Engine.game = "Even";
        Engine.question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.startEngine();
    }

    public static void executeLogic() {
        final int intervalMin = 1;
        final int intervalMax = 100;
        int randomNumber = (int) (Math.random() * (intervalMax - intervalMin + 1) + intervalMin);
        Engine.exercise = Integer.toString(randomNumber);
        if (randomNumber % 2 == 0) {
            Engine.exerciseResult = "yes";
        } else {
            Engine.exerciseResult = "no";
        }
    }
}
