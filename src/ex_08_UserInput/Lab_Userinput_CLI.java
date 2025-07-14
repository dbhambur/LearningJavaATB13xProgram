package ex_08_UserInput;

public class Lab_Userinput_CLI {
    public static void main(String[] args) {

        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        System.out.println(age_string);

        String CanIVote = age >= 18 ? "Yes" : "No";

        System.out.println(CanIVote);
    }
}
