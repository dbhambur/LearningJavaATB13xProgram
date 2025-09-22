package ex_30_Exceptions;

public class Lab229_JR_QA_VS_Sr_QA_3 {
    public static void main(String[] args) {

        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100/a;
            System.out.println(b);
        } catch (NumberFormatException |ArithmeticException|ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());;
        }
    }
}
