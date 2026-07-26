package java_hw_3;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = 0;
        int[] firstAarray = {1, 2, 3, 1, 1, 1, 1, 3};

        for (int i = 0; i < firstAarray.length; i++) {
            if (b == firstAarray[i]) {
                c++;
            }
        }
        System.out.println("The entered number appears " + c + " times in the array");
    }
}
