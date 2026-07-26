package java_hw_4.Task3;

public class CurrentCircle {
    public static void main(String[] args) {
        Circle newCircle1 = new Circle(11);
        Circle newCircle2 = new Circle(10);
        Circle newCircle3 = new Circle(1);
        Circle newCircle4 = new Circle(2);
        Circle newCircle5 = new Circle(3);
        int a = 0;

        Circle[] newArray = {newCircle1, newCircle2, newCircle3, newCircle4, newCircle5};
        for (int i = 0; i < newArray.length; i++) {
            a++;
            System.out.println(a + " Circle circumference : " + newArray[i].circumferenceCaclulation());
            System.out.println(a + " Circle area : " + newArray[i].areaCalculation());

        }
    }
}
