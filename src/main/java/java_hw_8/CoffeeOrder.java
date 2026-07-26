package java_hw_8;

public class CoffeeOrder extends Order {

    private String size;

    public CoffeeOrder(String orderNumber, String size) {
        super(orderNumber);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double getPrice() {
        if ("small".equals(size)) {
            return 3;
        } else if ("medium".equals(size)) {
            return 5;
        } else if ("large".equals(size)) {
            return 7;
        }
        return 0;
    }

    @Override
    public void printOrderInfo() {
        System.out.println(getOrderNumber() + " " + getSize() + " " + getStatus());
    }

    @Override
    public String toString() {
        return "CoffeeOrder{" +
                "orderNumber='" + getOrderNumber() + '\'' +
                ", status='" + getStatus() + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
