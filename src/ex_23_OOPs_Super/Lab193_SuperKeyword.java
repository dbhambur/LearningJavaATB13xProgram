package ex_23_OOPs_Super;

import java.sql.SQLOutput;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display ();

    }
}

class Vehicle {
    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("Default Const");
    }
    Vehicle(int a){
        System.out.println("Param const");

    }

    // Method Overloading - Same, same name function with different arguments.
    void message (int a){
        System.out.println("Type 2");
    }

    void message(){
        System.out.println("Type 1");
    }
    int message(String a){
        System.out.println("Type 4");
        return 0;
    }

    void display(){
        System.out.println("Vehicle parent");
    }
}

class Car extends Vehicle {
    private int maxspeed = 281;

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }
    Car(){
        super(); // calling parents default const

    }
    Car(int a ){
      super(10) ; // calling parents param const

    }

    @Override
    void display() {
        System.out.println(super.maxSpeed); // instance varible call
        System.out.println(this.maxspeed); // This means my variable call
        System.out.println("Hi Override !");
    }
}



