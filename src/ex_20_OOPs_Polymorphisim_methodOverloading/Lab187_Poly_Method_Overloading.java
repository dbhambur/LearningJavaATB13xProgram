package ex_20_OOPs_Polymorphisim_methodOverloading;

public class Lab187_Poly_Method_Overloading {
    public static void main(String[] args) {

        Mathoperations m1 = new Mathoperations();
        int r1 = m1.add(3,4);
        int r2 = m1.add(3,4,6);
        double r3 = m1.add(3.14,4.16);
        String r4 = m1.add ("vijay","Dutta");



    }

}

class Mathoperations{
  // In the same class, when you have method
  // Same name methods but different arguments and different return type.

    int add (int a , int b){
        return a+b;
    }

    int add (int a,int b ,int c){
        return a+b+c;
    }

    double add (double a, double b ) {
        return a+b;

    }
    String add (String a, String b){
        return a+b;

    }

}
