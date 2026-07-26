package java_hw_8;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private List<Order> orders = new ArrayList<>();

    public double calculateTotal() {
        double sum = 0;

        for (int i = 0; i < orders.size(); i++) {
            if ("NEW".equals(orders.get(i).getStatus())) {
                sum += orders.get(i).getPrice();
            }
        }

        return sum;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrderByNumber(String orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber().equals(orderNumber)) {
                orders.remove(i);
                break;
            }
        }
    }

    public List<Order> getOrdersByStatus(String status) {
        List<Order> result = new ArrayList<>();

        for (int i = 0; i < orders.size(); i++) {
            if (status.equals(orders.get(i).getStatus())) {
                result.add(orders.get(i));
            }
        }

        return result;
    }

    public Order findOrderByNumber(String orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber().equals(orderNumber)) {
                return orders.get(i);
            }
        }

        return null;
    }

    public void findAndPrintOrder(String orderNumber) {
        Order order = findOrderByNumber(orderNumber);

        if (order != null) {
            order.printOrderInfo();
        } else {
            System.out.println("null");
        }
    }
}