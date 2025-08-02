package ex_15StringBuffer_Builder_StringFunctions;

public class String_Buffer_Insert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer ("Hello");
        sb.insert(5," Java");
        System.out.println(sb); // Output : Hello Java
    }
}
