package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    //Write a program that will write to console numbers
    // from zero to the number from method arguments using while loop, each on new line:
    public void naturalNumbersPrinter(int lastPrinted) {
        int number = 0;
        while(number <= lastPrinted){
            System.out.println(number++);
        }
    }
}
