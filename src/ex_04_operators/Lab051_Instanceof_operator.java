package ex_04_operators;

import java.sql.SQLOutput;

public class Lab051_Instanceof_operator {
    public static void main(String[] args) {
        String s1 = new String ("Pramod");
        System.out.println(s1 instanceof String);
        System.out.println(s1 instanceof Object);
        // System.out.println(s1 instanceof Integer); instance of will work only with String and Object

    }
}
