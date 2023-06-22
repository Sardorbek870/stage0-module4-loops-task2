package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        //Write a program that will write to console all simple numbers from 0 up to input
        // from method arguments using while loop, each on new line:
        int i = 2;
         while(i <= printToInclusive){
             if (isPrime(i)) {
                 System.out.println(i);
             }
             i++;
         }
    }

    private static boolean isPrime(int n) {

        for (int i = 2; i < Math.sqrt(n + 1); i++) {
            if(n % i == 0){
                return false;
        }
        }
        return true;
    }
}
