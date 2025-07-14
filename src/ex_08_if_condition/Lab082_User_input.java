package ex_08_if_condition;

import java.util.Scanner;

public class Lab082_User_input {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner = new Scanner (System.in);

        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("Yes : Allowed to vote");}
            else {
                System.out.println("No: Not Allowed to Vote");}
        }
    }

