package ex_09_switch;

public class Lab092_duplicate_case {
    public static void main(String[] args) {
        int a = 98;
        switch (a){
            case 98:
                System.out.println("98");
          //  case 98:
                System.out.println("98");   // cannot use duplicate case number
        }
    }
}
