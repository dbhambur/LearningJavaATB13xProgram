package ex_30_Exceptions;

public class Lab217_Exceptions_Explained {
    public static void main(String[] args) {
        System.out.println("Starting the program!");
        String input_user = args[0];
        Integer a = Integer.parseInt(input_user);
        Integer output = 100/a;
        System.out.println(output);
        System.out.println("End of the program!");
    }
}
