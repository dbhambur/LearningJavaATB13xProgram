package ex_05_Type_Casting;

public class Lab_060_Typecasting {
    public static void main(String[] args) {
        long phone = 9763122063l;
        //short s = phone; // Implicit narrow ?
        short s1 = (short)phone; // Explicit narrow

        System.out.println(s1);

    }
}
