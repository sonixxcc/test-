package java_hw_7;

public class Program {
    public static void main(String[] args) {

        Order firstOrder = new CoffeeOrder ("001", "small");
        Order secondOrder = new CoffeeOrder("002", "medium");
        Order thirdOrder = new TeaOrder("003","herbal");
        Order fourthOrder = new DessertOrder("004","Cheesecake");

        Order[] orders = {firstOrder, secondOrder, thirdOrder, fourthOrder};

        System.out.println(java.util.Arrays.toString(orders));

        for (int i = 0; i < orders.length; i++) {
            orders[i].printOrderInfo();
        }

        secondOrder.setStatus("CANCELED");

        thirdOrder.setStatus("COMPLETED");

        System.out.println(java.util.Arrays.toString(orders));

        OrderManager helper1 = new OrderManager();

        double a = helper1.calculateTotal(orders);
        System.out.println(a);
    }
}
