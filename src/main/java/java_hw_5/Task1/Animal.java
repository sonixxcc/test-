package java_hw_5.Task1;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("I'm eating");
    }

    public void sleep() {
        System.out.println("I'm sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + this.name + '\'' +
                '}';
    }
}
