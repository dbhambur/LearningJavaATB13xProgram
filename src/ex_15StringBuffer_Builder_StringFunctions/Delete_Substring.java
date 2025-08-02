package ex_15StringBuffer_Builder_StringFunctions;

public class Delete_Substring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer ("Hello Java");
        sb.delete(6,10);
        System.out.println(sb); // Output -> Hello
    }
}
