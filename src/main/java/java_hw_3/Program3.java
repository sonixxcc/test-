package java_hw_3;

public class Program3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 11};
        int a = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                a++;
            }
        }

            System.out.println(a);
        }
    }
