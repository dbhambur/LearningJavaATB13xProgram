package ex_08_UserInput;

import java.util.Scanner;

public class Lab_Userinput_Scanner_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the age");

        int age = scanner.nextInt();
        String CanIVote = age > 18 ? "yes" : "no";
        System.out.println(CanIVote);

    }
}

//Scanner scanner = new Scanner (System.in);
//        System.out.println("Enter the age");
//
//        int age = scanner.nextInt();
//        String CanIVote = age > 18 ? "yes":"no";
//        System.out.println(CanIVote);