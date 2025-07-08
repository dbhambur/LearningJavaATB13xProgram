package ex_06_Ternary_operator;

public class Lab_067_Nested_Ternary {
    public static void main(String[] args) {
        // whenever we have a multiple condition, we will use nested ternary operator
        // age = 23
        // age < 18 -> Minor
        // 18 < age < 65 -> Adult
        // age > 65 -> Senior citizen

        int age = 23;

        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";

        System.out.println(result);
    }
}
