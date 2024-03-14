package hexlet.code.games;

import hexlet.code.Engine;
public class Even {
    public static void startGame() {
        Engine.game = "Even";
        Engine.question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.startEngine();
    }

    public static void executeLogic() {
        int number1 = (int) (Math.random() * (100 + 1) + 1);
        Engine.exercise = Integer.toString(number1);
        if (number1 % 2 == 0) {
            Engine.exerciseResult = "yes";
        } else {
            Engine.exerciseResult = "no";
        }
    }
}
