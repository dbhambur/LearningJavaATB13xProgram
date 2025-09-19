package ex_27_Static;

public class Lab206_Static {
    public static void main(String[] args) {
        A ref1 = new A(10);
        A ref2 = new A(12);
        System.out.println(ref1.a);
        System.out.println(A.b);

        ref1.displayValue();
        ref2.displayValue();

        A.staticMethod();

    }
}

class A {
    int a;// non static - instance variable
    static int b = 20; // statis this is shared between - object

    A(int a ){
        this.a = a;
    }

    void displayValue(){
        System.out.println(this.a);
        System.out.println(b); // static variable in instance method allowed
    }

    static void staticMethod(){
        System.out.println("I will be called when class is loaded");
       // System.out.println(this.a); // Methods cannot access non-static variables in the functions
    }
}
