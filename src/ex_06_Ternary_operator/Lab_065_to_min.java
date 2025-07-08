package ex_06_Ternary_operator;

public class Lab_065_to_min {
    public static void main(String[] args) {
        int x= 10;
        int y = 20;

        int min = x < y ? x:y ;   // The "smaller than" sign is < and the "greater than" sign is >.
                                 // These symbols are used to show the relationship between two numbers, indicating which is smaller and which is larger

        System.out.println(min);
    }
}
