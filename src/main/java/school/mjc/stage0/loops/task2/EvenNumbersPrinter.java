package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        //Write a program that will write to console even numbers from zero to the
        // number from method arguments using while loop, each on new line:
        int number = 0;
        while(number <= printTillInclusive){
            System.out.println(number);
            number += 2;
        }
    }
}
