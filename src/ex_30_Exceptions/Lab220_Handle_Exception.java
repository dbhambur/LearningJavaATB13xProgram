package ex_30_Exceptions;

public class Lab220_Handle_Exception {
    public static void main(String[] args) {
        int a= 0;
        try {
            a= 10/0; // java.lang.Arithmetic exception
        } catch (Exception e) {
            System.out.println("Div by zero not allowed!");

        }
        System.out.println(a);


    }
}
