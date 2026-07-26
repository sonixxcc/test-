package java_hw_9;

public class Program {
    public static void main(String[] args) {

        OrderManager manager = new OrderManager();

        Order firstOrder = new CoffeeOrder(OrderStatus.NEW, "001", CoffeeSize.LARGE);
        Order secondOrder = new TeaOrder(OrderStatus.NEW, "002", TeaType.HERBAL);
        Order thirdOrder = new DessertOrder(OrderStatus.NEW, "003", "Cheesecake");

        firstOrder.printOrderInfo();
        secondOrder.printOrderInfo();
        thirdOrder.printOrderInfo();

        try {
            manager.addOrder(firstOrder);
        } catch (DuplicateOrderException e) {
            System.out.println(e.getMessage());
        }

        try {
            manager.addOrder(firstOrder);
        } catch (DuplicateOrderException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            manager.removeOrderByNumber("0000202");
        } catch (OrderNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

