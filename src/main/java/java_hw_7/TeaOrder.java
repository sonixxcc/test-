package java_hw_7;

public class TeaOrder extends Order {

    private String type;

    public TeaOrder(String orderNumber, String type) {
        super(orderNumber);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getPrice() {
        if ("black".equals(type)) {
            return 2.50;
        } else if ("green".equals(type)) {
            return 2.70;
        } else if ("herbal".equals(type)) {
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
