package ex_20_OOPS_Poly_methodOverriding;

public class Lab189_Moverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();

    }

}

class Animal{

    void sound(){
        System.out.println("Default sound");
    }
}

class Dog extends Animal {

    @Override
    void sound (){
        System.out.println("Bark!!");
    }
}