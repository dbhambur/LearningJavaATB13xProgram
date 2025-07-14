package ex_08_if_condition;

public class Lab081_if_P1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18){
            System.out.println("Yes you can go to Goa");
        }
        else {
            System.out.println("No you cannot go to Goa");}
    }
}
