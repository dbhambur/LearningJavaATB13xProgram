package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial program\nEnter the number");
        if(!scanner.hasNextInt()){
            System.out.println("Enter the int you fool");
            return;
        }
        int number = scanner.nextInt();

        int factorial =1;
        if (number < 0){
            System.out.println("Negative factorial is not allowed");
            return;
        }

        if (number<=0){
            System.out.println(factorial);
        } else {
            //calculte the factorial
            for (int i=1;i<=number;i++){
                factorial = factorial * i;
            }
        }
        System.out.println("Factorial is ->" +factorial);
    }

}
