package ex_06_Ternary_operator;

public class Lab068_to_Three_max {
    public static void main(String[] args) {
        // Find the maximum between the three numbers.
        //Now we will be using the logic building formula


        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        // step 1 find inputs/outputs
        //I/O -> n1,n2,n3 - int
        // o/p -> string -> max number

        //Step -2 rough logic, think about it
        // n1 > n2 and n1 > n3 -> n1
        //n2 > n1 and n2 > n3 _> n2
        //n3


        //step 3

        int max = (n1 > n2 ) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;

        System.out.println(max);





    }
}
