package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        // Arrays.sort(array); // 14,15.....77
        int max_output = give_me_max(array);
        System.out.println(max_output);

    }

    static int give_me_max(int[] array) {
        int max = array[0];
        //logic
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}