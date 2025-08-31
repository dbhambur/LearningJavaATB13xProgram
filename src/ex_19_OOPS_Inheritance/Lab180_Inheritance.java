package ex_19_OOPS_Inheritance;

public class Lab180_Inheritance {

    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk2();
        s1.bhk3();

    }
}

class Father {
    int gold_f =1000; // Attribute | Data variables | Property

    void bhk2(){ // Behavior | Method | Function |Data members
        System.out.println("Father - 2BHK");

    }
}

class Son extends Father {

    void bhk3(){
        System.out.println("3bhk Son");
    }
}