package java_hw_7;

public class OrderManager {

    public double calculateTotal(Order[] orders) {

        double sum = 0;

        for (int i = 0; i < orders.length; i++) {

            if ("NEW".equals(orders[i].getStatus())) {
                sum += orders[i].getPrice();

            } else if ("CANCELED".equals(orders[i].getStatus())) {
                continue;

            } else if ("COMPLETED".equals(orders[i].getStatus())) {
                continue;
            }
        }
        return sum;
    }
}