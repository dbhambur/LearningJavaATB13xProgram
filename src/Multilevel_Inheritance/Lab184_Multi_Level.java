package Multilevel_Inheritance;

public class Lab184_Multi_Level {
    public static void main(String[] args) {


        //Son s1 = new Father();  --> Not possible
        //Son s1 = new Grandfather(); --> Not possible

        Son amit = new Son();
        System.out.println(amit.gold_gf);
        amit.gf();

        GrandFather grandFather = new Son();
        grandFather.home();

    }
}
