package ex_09_switch;

import java.util.Scanner;

public class Lab086_switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the day num 1to 7");

        int day = scanner.nextInt();

        switch (day){
            case 1:
            System.out.println("Mon");

            case 2:
                System.out.println("Tue");

        }

    }
}
