package java_hw_10;

import java.util.*;

public class Robot implements Attackable {

    private String name;
    private int hp = 100;

    private Set<AttackButton> activeButtons = new HashSet<>();
    private Set<AttackButton> usedButtons = new HashSet<>();

    public Robot(String name) {
        this.name = name;
        generateActiveButtons();
    }

    private void generateActiveButtons() {
        List<AttackButton> list = new ArrayList<>(Arrays.asList(AttackButton.values()));
        Collections.shuffle(list);

        for (int i = 0; i < 5; i++) {
            activeButtons.add(list.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public void attack(AttackButton button) throws GameException {

        if (usedButtons.contains(button)) {
            throw new GameException("Button already used!");
        }

        usedButtons.add(button);

        if (activeButtons.contains(button)) {
            hp -= 20;
            System.out.println("HIT -20 HP");
        } else {
            System.out.println("Button not active");
        }

        if (hp < 0) {
            hp = 0;
        }
    }

    public void printStatus() {
        System.out.println(name + " HP: " + hp);
    }
}