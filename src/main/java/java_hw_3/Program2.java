package java_hw_3;

public class Program2 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 22, 28, 3245, 34343, 111};

        int a = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > a) {
                a = array[i];
            }
        }

        System.out.println(a);
    }
}
