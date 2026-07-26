package java_hw_10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for Robot 1: ");
        Robot r1 = new Robot(scanner.nextLine());

        System.out.print("Enter name for Robot 2: ");
        Robot r2 = new Robot(scanner.nextLine());

        Robot current = r1;
        Robot enemy = r2;

        while (r1.isAlive() && r2.isAlive()) {

            System.out.println("A shot at the robot : " + enemy.getName());

            System.out.println("Buttons : Q W E A S D Z X C");
            System.out.println("Press P to exit");
            System.out.print("Your step : ");
            System.out.println();

            String input = scanner.nextLine().toUpperCase();

            if (input.equals("P")) {
                System.out.println("Game stopped");
                break;
            }

            AttackButton button;

            try {
                button = AttackButton.valueOf(input);
            } catch (Exception e) {
                System.out.println("Invalid button!");
                continue;
            }

            try {
                enemy.attack(button);
            } catch (GameException e) {
                System.out.println(e.getMessage());
            }

            r1.printStatus();
            r2.printStatus();
            System.out.println();

            if (!enemy.isAlive()) {
                System.out.println(enemy.getName() + " is destroyed!");
                System.out.println("Winner: " + current.getName());
                break;
            }

            Robot temp = current;
            current = enemy;
            enemy = temp;
        }

        scanner.close();
    }
}