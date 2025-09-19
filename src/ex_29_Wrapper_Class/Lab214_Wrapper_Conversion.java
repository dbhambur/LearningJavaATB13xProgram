package ex_29_Wrapper_Class;

public class Lab214_Wrapper_Conversion {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;// this boxing -> automatically JVM will store the value
        //Primitive to wrapper -> AutoBoxing
        System.out.println(b.intValue());
        System.out.println(Integer.MIN_VALUE);

        Integer a2 = 42;

        int v =a2; // unboxing -> wrapper is removed,attribute, behavior
        System.out.println(v);

    }
}
