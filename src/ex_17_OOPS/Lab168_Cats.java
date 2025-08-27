package ex_17_OOPS;

public class Lab168_Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        new Cat(); // Example of object -> new CAT()
        Cat c2;  // c2 is a reference of another cat

        c1.running();
        //c2.running();  // Note : if object is not created behavior is not available

        new Cat().running();  // this will work because object is created



    }
}

class  Cat{
    String name;

    void running(){
        System.out.println("Running");
    }
        }