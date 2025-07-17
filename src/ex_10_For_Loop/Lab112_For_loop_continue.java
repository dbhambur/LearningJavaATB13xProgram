package ex_10_For_Loop;

public class Lab112_For_loop_continue {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){

            if (i==5){
                continue; // skip the code and move next to top
            }
            else  {
                System.out.println(i);
            }
        }
    }
}
