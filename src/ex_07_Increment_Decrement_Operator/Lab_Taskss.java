package ex_07_Increment_Decrement_Operator;

public class Lab_Taskss {
    public static void main(String[] args) {

        int x = 5;
        int y = x++ + ++x+x++ + ++x;
        System.out.println("x="+x + "y="+y);
    }
}
