package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void startGame() {
        Engine.game = "Prime";
        Engine.question = "Answer 'yes' if given number is prime. Otherwise answer 'no'";
        Engine.startEngine();
    }

    public static void executeLogic() {
        int number1 = (int) (Math.random() * (100 + 1) + 1);
        Engine.exercise = Integer.toString(number1);
        if (number1 == 2) {
            Engine.exerciseResult = "yes";
            return;
        }
        if (number1 % 2 == 0) {
            Engine.exerciseResult = "no";
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
            Engine.exerciseResult = "no";
        } else {
            Engine.exerciseResult = "yes";
        }
    }
}
