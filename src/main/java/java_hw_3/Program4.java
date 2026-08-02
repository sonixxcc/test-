package java_hw_3;

import java.util.Arrays;

public class Program4 {
    public static void main(String[] args) {

        int[] array = {1, -2, 1, -2, 1, -2};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
