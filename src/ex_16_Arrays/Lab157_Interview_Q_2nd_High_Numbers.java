package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Numbers {
    public static void main(String[] args) {
        // Find second largest number in Array

        int[] numbers = {12,34,10,1,100,3,4,32};
        // 100,34

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

    }
}
