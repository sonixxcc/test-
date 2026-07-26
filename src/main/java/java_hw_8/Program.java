package java_hw_8;

public class Program {
    public static void main(String[] args) {

        OrderManager manager = new OrderManager();

        Order secondOrder = new CoffeeOrder("002", "medium");
        Order thirdOrder = new TeaOrder("003", "herbal");
        Order fourthOrder = new DessertOrder("004", "Cheesecake");

        manager.addOrder(secondOrder);
        manager.addOrder(thirdOrder);
        manager.addOrder(fourthOrder);

        secondOrder.printOrderInfo();
        thirdOrder.printOrderInfo();
        fourthOrder.printOrderInfo();

        secondOrder.setStatus("CANCELED");

        manager.removeOrderByNumber("003");

        manager.findAndPrintOrder("004");

        System.out.println(manager.getOrdersByStatus("NEW"));

        double total = manager.calculateTotal();
        System.out.println(total);
    }
}
