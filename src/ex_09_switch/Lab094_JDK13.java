package ex_09_switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {

        int itemcode = 006;

        switch (itemcode){

            case 001,002,003:
                System.out.println("All of them are electronic gadgets");
                break;
            case 004,005,006:
                System.out.println("These are all mechanical gadgets");
                break;
            default:
                System.out.println("None");
                break;

        }
    }
}
