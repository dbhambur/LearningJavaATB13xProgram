package Ex_02_Java_Basics;

public class Lab024_printf {
    public static void main(String[] args) {

        int a =245;

        System.out.print("print command print without the new line" );
        System.out.println("Hello world");
        System.out.println("add the new line in the end");

        System.out.println(a);
        System.out.printf("your variable name is %d",a);

        //%d -> int,byte,long,short, - data type
        //%s -> String
        //%f -> float, double,
        //%b -> boolean

        int b =20;

        System.out.printf("%d + %d",a,b);

    }
}
