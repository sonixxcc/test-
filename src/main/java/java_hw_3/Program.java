package java_hw_3;

public class Program {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 0;

        for (int i = 0; i < array.length; i++) {
            a = a + array[i];
        }
        System.out.println(a);
    }
}
