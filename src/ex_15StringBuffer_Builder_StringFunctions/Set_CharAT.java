package ex_15StringBuffer_Builder_StringFunctions;

public class Set_CharAT {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.setCharAt(1,'a');
        System.out.println(sb);
    }
}
