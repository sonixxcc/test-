package java_hw_5.Task1;

public class Program {
    public static void main(String[] args) {
        Bird bird = new Bird("Kesha");
        Fish fish = new Fish("Dory");
        Dog bobik = new Dog("Bobik");

        bird.eat();
        bird.sleep();
        bird.fly();

        fish.eat();
        fish.sleep();
        fish.swim();

        bobik.eat();
        bobik.sleep();
        bobik.bark();
    }
}
