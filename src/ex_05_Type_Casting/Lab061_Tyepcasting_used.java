package ex_05_Type_Casting;

public class Lab061_Tyepcasting_used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;

        //int total = course + GST ; //Narrow implicit
        int total1 = course + (int)GST; //Narrow explicit
        System.out.println(total1); // Note: if we take int variable, there is data loss of .45, so we will select float inorder to give correct data.

        float total2 = course+GST; // widening - auto -implicit
        float total3 = (float)course + GST; // Widening explicit
        System.out.println(total2);
        System.out.println(total3);


    }
}
