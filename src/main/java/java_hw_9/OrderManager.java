package java_hw_9;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private List<Order> orders = new ArrayList<>();

    public double calculateTotal() {
        if (orders.isEmpty()) {
            throw new NoOrdersException("No orders to calculate");
        }
        double sum = 0;

        for (Order order : orders) {
            if (order.getStatus() == OrderStatus.NEW) {
                sum += order.getPrice();
            }
        }
        return sum;
    }

    public void removeOrderByNumber(String orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber().equals(orderNumber)) {
                orders.remove(i);
                return;
            }
        }

        throw new OrderNotFoundException("Order not found");
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
        throw new OrderNotFoundException("Order not found");
    }

    public void addOrder(Order order) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber().equals(order.getOrderNumber())) {
                throw new DuplicateOrderException("Order with this number already exists");
            }
        }
        orders.add(order);
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
