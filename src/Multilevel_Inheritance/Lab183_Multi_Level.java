package Multilevel_Inheritance;

public class Lab183_Multi_Level {
    public static void main(String[] args) {

        Son amit = new Son();
        //Son s1 = new Father();
        //Son s1 = new Grandfather();

        GrandFather g1 = new Son();
        g1.gf();
        g1.home();

    }
}
