package ex_12_Do_while;

import java.util.Scanner;

public class Lab128_Vowel_Consonants {
    public static void main(String[] args) {

        Scanner scanner =new Scanner (System.in);
        System.out.println("Enter the single char");

        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
            System.out.println(ch +" is vowel");
        }else if(ch >='a' && ch<='z'){
            System.out.println(ch +"  is consonants");
        } else {
            System.out.println("Invalid char!");
        }

    }
}
