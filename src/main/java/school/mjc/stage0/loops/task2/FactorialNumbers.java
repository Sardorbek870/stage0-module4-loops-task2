package school.mjc.stage0.loops.task2;

import java.util.ArrayList;
import java.util.List;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        //Write a program that will write to console all numbers from factorial row,
        // from 0 up to input from method arguments using while loop, each on new line:

            int i = 0;
            while(i <= printToInclusive){
                System.out.println(factoria(i));
                i++;

        }


    }

    private int factoria(int i) {
        if(i == 0 ) return 1;
        int sum = 1;
        for (int j = 1; j <= i; j++) {
            sum *= j;
        }
        return sum;
    }
}
