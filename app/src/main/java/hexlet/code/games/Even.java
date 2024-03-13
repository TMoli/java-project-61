package hexlet.code.games;

import hexlet.code.Engine;
public class Even {
    public static void startGame() {
        Engine.exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.game = "Even";
        Engine.startEngine();
    }
    public static void logicEven() {
        int number1 = (int) (Math.random() * (100 + 1) + 1);
        Engine.question = Integer.toString(number1);
        if (number1 % 2 == 0) {
            Engine.result = "yes";
        } else {
            Engine.result = "no";
        }
    }
}
