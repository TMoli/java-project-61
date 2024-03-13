package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void startGame() {
        Engine.exercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'";
        Engine.game = "Prime";
        Engine.startEngine();
    }
    public static void logicPrime() {
        int number1 = (int) (Math.random() * (100 + 1) + 1);
        Engine.question = Integer.toString(number1);
        if (number1 == 2) {
            Engine.result = "yes";
            return;
        }
        if (number1 % 2 == 0) {
            Engine.result = "no";
            return;
        }
        int count = 0;
        int lastNumber = number1 - 2;
        int result;
        while (count != 1 & lastNumber > 2) {
            result = number1 % lastNumber;
            lastNumber = lastNumber - 2;
            if (result == 0) {
                count++;
            }
        }
        if (count == 1) {
            Engine.result = "no";
        } else {
            Engine.result = "yes";
        }
    }
}
