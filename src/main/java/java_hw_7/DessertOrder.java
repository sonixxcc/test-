package java_hw_7;

public class DessertOrder extends Order {

    private String dessertName;

    public DessertOrder(String orderNumber, String dessertName) {
        super(orderNumber);
        this.dessertName = dessertName;
    }

    public String getDessertName() {
        return dessertName;
    }

    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    @Override
    public double getPrice() {
        if ("Brownie".equals(dessertName)) {
            return 7;
        } else if ("Cheesecake".equals(dessertName)) {
            return 7;
        } else if ("Ice cream".equals(dessertName)) {
            return 5;
        }
        return 0;
    }

    @Override
    public void printOrderInfo() {
        System.out.println(getOrderNumber() + " " + getDessertName() + " " + getStatus());
    }

    @Override
    public String toString() {
        return "DessertOrder{" +
                "orderNumber='" + getOrderNumber() + '\'' +
                ", status='" + getStatus() + '\'' +
                ", dessertName='" + dessertName + '\'' +
                '}';
    }
}
