package ex_09_switch;

public class Lab093_JDK13above {
    public static void main(String[] args) {

        int itemcode = 003;  // No need of break keyword

        switch (itemcode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            default  -> System.out.println("Default");
        }
    }
}
