package java_hw_5.Task2;

public class Truck extends Vehicle {

    private double loadCapacity;

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {
        System.out.println("The vehicle " + getName() + " with a load capacity of " + loadCapacity + " tons moves with a speed of " + getSpeed() + " km/h");
    }
}
