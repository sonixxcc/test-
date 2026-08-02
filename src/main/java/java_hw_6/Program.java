package java_hw_6;

public class Program {
    public static void main(String[] args) {

        Order firstOrder = new CoffeeOrder("1", "small");
        Order secondOrder = new CoffeeOrder("2", "medium");
        Order thirdOrder = new TeaOrder("3", "black");
        Order fourthOrder = new DessertOrder("4", "Brownie");

        Order[] orders = {firstOrder, secondOrder, thirdOrder, fourthOrder};

        System.out.println(java.util.Arrays.toString(orders));

        for (int i = 0; i < orders.length; i++) {
            orders[i].printOrderInfo();
        }

        OrderManager helper = new OrderManager();

        double a = helper.calculateTotal(orders);
        System.out.println(a);
    }
}
