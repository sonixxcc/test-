
package java_hw_3;

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {

        Scanner aa = new Scanner(System.in);

        int a = aa.nextInt();

        String result = dayOfTheWeek(a);

        System.out.println(result);
    }

    public static String dayOfTheWeek(int a) {

        if (a == 1) {
            return "Monday";

        } else if (a == 2) {
            return "Tuesday";

        } else if (a == 3) {
            return "Wednesday";

        } else if (a == 4) {
            return "Thursday";

        } else if (a == 5) {
            return "Friday";

        } else if (a == 6) {
            return "Saturday";

        } else if (a == 7) {
            return "Sunday";

        } else {
            return "Better if today was Friday";
        }
    }
}