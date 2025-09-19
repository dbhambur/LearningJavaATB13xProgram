package ex_26_IIB;

public class Lab203_IIB {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
    }

    //..
    //IIB
    //Instance initilaization block == IB
    //I will be executed when object is created.
    //..
}

class A {
    A(){
        System.out.println("DC");
    }
    {
        System.out.println("Hi, I am IIB"); // Instance initialization block
        System.out.println("If you want to execute the call something when object is created");
        // mysql connection
        //read a csv, xslx file
        //read JSON, xml.
        //read a text file or env file
    }
}


