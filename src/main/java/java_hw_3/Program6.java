package java_hw_3;

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);

        int b = aa.nextInt();
        int c = aa.nextInt();
        int d = aa.nextInt();

        String result = triangleCreation(b, c, d);
        System.out.println(result);
    }

    public static String triangleCreation(int b, int c, int d) {
        if (b + c > d && b + d > c && c + d > b) {
            return "Triangle creation is possible";
        } else {
            return "Triangle creation is not possible";
        }
    }
}