package ex_08_UserInput;

import java.util.Scanner;

public class Lab_Userinput_Scanner_02 {
    public static void main(String[] args) {

        System.out.println("Enter the string");
        Scanner scanner = new Scanner (System.in);
        String s =scanner.next();
        System.out.println(s);

        System.out.println("Enter the Int");
        int a = scanner.nextInt();


        System.out.println("Enter the Double");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);






    }
}
