package java_hw_5.Task2;

public class Car extends Vehicle{

    private int passengerCapacity;

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move(){
        System.out.println("The vehicle " + getName() + " moves with a speed of " + getSpeed() + " km/h with " + passengerCapacity + " passengers");
    }
}
