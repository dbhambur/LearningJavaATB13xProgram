package ex_26_IIB;

public class Lab204_IIB {
    public static void main(String[] args) {
        new A1();
    }
}

class A1{
    A1(){
        System.out.println("DC");
    }
    {
        System.out.println("Hi,I am IIB");
        System.out.println("If you want to execute or call something when object is created");
    }
    {
        System.out.println("Hi,I am IIB 2");
        System.out.println("Hi, I am IIB 3");
    }
    static {
        System.out.println("1 - SSB");
    }
}
