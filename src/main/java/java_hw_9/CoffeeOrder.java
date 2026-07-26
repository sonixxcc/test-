package java_hw_9;

public class CoffeeOrder extends Order {

    private CoffeeSize size;

    public CoffeeOrder(OrderStatus status, String orderNumber, CoffeeSize size) {
        super(status, orderNumber);
        this.size = size;
    }

    public CoffeeSize getSize() {
        return size;
    }

    public void setSize(CoffeeSize size) {
        this.size = size;
    }

    @Override
    public double getPrice() {
        if (size == CoffeeSize.SMALL) {
            return 3;
        } else if (size == CoffeeSize.MEDIUM) {
            return 5;
        } else if (size == CoffeeSize.LARGE) {
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
