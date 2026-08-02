package qa;

public class smth {

    public static int maxValue (int [] newArray) {

        int max = newArray[0];

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > max) {
                max = newArray[i] ;
            }
        }
        return max ;

    }
    public static void main(String[] args) {

        int[] newArray = {-1, -2, -3, -4};
        maxValue (newArray) ;
        System.out.println(maxValue (newArray));


    }
}
