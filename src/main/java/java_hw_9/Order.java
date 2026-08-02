package java_hw_9;

public abstract class Order implements Pricable, Printable {

    private String orderNumber;

    private OrderStatus status;

    public Order(OrderStatus status, String orderNumber) {
        this.status = OrderStatus.NEW;
        this.orderNumber = orderNumber;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", status=" + status +
                '}';
    }
}

