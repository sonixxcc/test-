package java_hw_7;

public abstract class Order implements Pricable, Printable {

    private String orderNumber;

    private String status;

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
        this.status = "NEW";
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                '}';
    }
}
