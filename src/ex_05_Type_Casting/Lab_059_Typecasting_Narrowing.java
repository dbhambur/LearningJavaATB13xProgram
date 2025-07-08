package ex_05_Type_Casting;

public class Lab_059_Typecasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;

      //  byte b = val; // Narrowing (int -> byte)  - implicit casting is not allowed .
        byte b1 = (byte)val; // Narrowing (int -> byte) - explicit casting is not allowed.
        //Data loss

        System.out.println(b1);


    }
}
