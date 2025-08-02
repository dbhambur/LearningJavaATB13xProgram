package ex_15StringBuffer_Builder_StringFunctions;

public class Replace_a_Substring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer ("Hello World");
        sb.replace(6,11," Java");
        System.out.println(sb); // Output : Hello Java
    }

}
