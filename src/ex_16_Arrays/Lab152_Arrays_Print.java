package ex_16_Arrays;

import java.util.Arrays;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {
        int[]marks = {51,100,91,87,90};
        System.out.println("__________");

        for(int i =0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }

            Arrays.sort(marks);
        for (int i = 0; i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}
