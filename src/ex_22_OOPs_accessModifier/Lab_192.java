package ex_22_OOPs_accessModifier;

public class Lab_192 {

}

class Father{
    private int gold = 10;
    int car = 1;
    public int bhk3 = 1;
}

class Son extends Father{
    void weCanuse(){
       // System.out.println(gold); Note : we cannot use gold as it is Private
        System.out.println(car); // We can use car as it is default and can be used in the same class
        System.out.println(bhk3);// We can use bhk3 as it is public
    }
}
