package java_hw_6;

public class OrderManager {

    public double calculateTotal(Order[] orders) {

        double sum = 0;

        for (int i = 0; i < orders.length; i++) {
            sum += orders[i].getPrice();
        }
        return sum;
    }
}
