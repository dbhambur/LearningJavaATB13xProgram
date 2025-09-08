package ex_23_OOPs_Super;

public class Lab194_Super {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.Sound();
    }
}

class God{
    public int gold = 100;
    void Sound(){
        System.out.println("God!!");
    }
    God(){
        System.out.println("God DC");
    }

}

class Animal extends God {
    @Override
    void Sound() {
        super.Sound();
    }
    Animal(){
        super();
    }
    Animal(int a, int b){
        System.out.println(a+b);
    }
    void test (){
        System.out.println(super.gold);
    }
}