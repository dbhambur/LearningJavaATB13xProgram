package ex_08_if_condition;

import java.util.Scanner;

public class Lab080_if_condition {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner = new Scanner (System.in);

        int age = scanner.nextInt();

      if (age > 18){
          System.out.println("You are allowed to vote");
        }
    }
}
