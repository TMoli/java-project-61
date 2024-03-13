package hexlet.code.games;

import hexlet.code.Engine;
public class Even {
    public static void startGame() {
        Engine.exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.game = "Even";
        Engine.startEngine();
    }
    public static void logicEven() {
        Engine.question = Integer.toString(Engine.number1);
        if (Engine.number1 % 2 == 0) {
            Engine.result = "yes";
        } else {
            Engine.result = "no";
        }
    }
}
