package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        //Write a program that will write to console multiplied numbers by input from zero
        // to the number from method arguments using while
        // loop, each on new line(program should also be able to work with negatives):
        if (multiplyByAndToInclusive == 0) {
            System.out.print("");
        } else {
            int i = 0;
            while (Math.abs(multiplyByAndToInclusive) >= i) {
                System.out.println(i * multiplyByAndToInclusive);
                i++;
            }
        }
    }
}
