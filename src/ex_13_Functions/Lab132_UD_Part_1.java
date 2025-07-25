package ex_13_Functions;

public class Lab132_UD_Part_1 {
    // user defined functions

    //1. without parameters and without return type
    //2. without parameters but with return type
    //3. with parameters and without return type
    //4. with parameters and with return type

    public static void main (String[]args) {

        // 1. Without Argument/Parameters and without return type.
        wp_wr_greet();
        //2. without parameters but with return type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);
        //3. with parameters and without return type
        greet_with_details("Pramod",65,100);
        greet_with_details("Ankit",100,120);
        //4. with parameters and with return type
       int sum = sum_of_two_numbers(3,4);
       int sum2 = sum_of_two_numbers(190,900);
        int sum3 = sum_of_two_numbers(300,456);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);



    }
    //1. without parameters and without return type. (Declare)/Define
    static void wp_wr_greet(){
        System.out.println("Type 1 ->without parameters and without return type");
        System.out.println("Hi,How are you");
    }
    //2. without parameters but with return type

    static String greet_with_hello_wp_with_RT(){
        System.out.println("--Type 2 : Without parameter but with return type--");
        System.out.println("wp_with_RT");
        return "Hi,How are you?";
    }
    //3. with parameters and without return type
    static void greet_with_details(String name, int age,double salary){
        System.out.println("your name is ->" + name +"\nYour age is" +age + "\nYour salary is" + salary);
    }
    //4. with parameters and with return type
    static int sum_of_two_numbers(int a,int b) {
        return a+b;
    }
}
