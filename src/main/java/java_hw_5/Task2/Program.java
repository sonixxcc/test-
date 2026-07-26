package java_hw_5.Task2;

public class Program {
    public static void main(String[] args) {

        Car car = new Car ("Bumble Bee", 200, 4);
        Truck truck = new Truck("Optimus Prime", 110, 100);

        car.move();
        car.stop();
        truck.move();
        truck.stop();
    }
}
