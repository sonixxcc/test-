package java_hw_9;

public class TeaOrder extends Order {

    private TeaType type;

    public TeaOrder(OrderStatus status, String orderNumber, TeaType type) {
        super(status, orderNumber);
        this.type = type;
    }

    public TeaType getType() {
        return type;
    }

    public void setType(TeaType type) {
        this.type = type;
    }

    @Override
    public double getPrice() {
        if (type == TeaType.BLACK) {
            return 2.50;
        } else if (type == TeaType.GREEN) {
            return 2.70;
        } else if (type == TeaType.HERBAL) {
            return 2.90;
        }

        return 0;
    }

    @Override
    public void printOrderInfo() {
        System.out.println(getOrderNumber() + " " + getType() + " " +  getStatus());
    }

    @Override
    public String toString() {
        return "TeaOrder{" +
                "orderNumber='" + getOrderNumber() + '\'' +
                ", status='" + getStatus() + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
