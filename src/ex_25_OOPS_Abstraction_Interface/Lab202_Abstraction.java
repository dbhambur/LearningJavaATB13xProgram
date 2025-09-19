package ex_25_OOPS_Abstraction_Interface;

public class Lab202_Abstraction {
}

abstract class Incomplete_abstract{
    int a =10;  // here we can change the value
    abstract void display1();
    void display2(){
        System.out.println("print");
    }
}

interface Incomplete_Interface{
    int a = 10;// final - we cannot change the value
    void display();

    default void display2(){
        System.out.println("Default is allowed");
    }

    static void display3(){
        System.out.println("Default is allowed");
    }
}
