package adapter;

import adapter.items.*;

public class Vulpix implements State {
    private int health;
    HoneyCake honeyCake = new HoneyCake();
    Medicine calcium = new Calcium();
    Medicine foodAdapter = new FoodAdapter(honeyCake);

    private Vulpix() {
        health = 50;
    }

    private static Vulpix instance;

    public static Vulpix getInstance() {
        if(instance == null) {
            instance = new Vulpix();
        }
        return instance;
    }

    public String getState() {
        return "Vulpix";
    }

    public void firstAction(Character c, int exp) {
        c.setExp(exp + 1);
        health -= 20;
        System.out.println(getState() + " attacks. Health: " + health + "/50.");
    }

    public void secondAction(Character c, int exp) {
        health += calcium.getHealth();
        System.out.println(getState() + " uses medicine. Health: " + health + "/50.");
    }

    public void thirdAction(Character c, int exp) {
        c.setExp(exp + honeyCake.getBonusExp());
        System.out.println(getState() + " eats food. EXP: " + c.getExp());
    }

    public void fourthAction(Character c, int exp) {
        health += foodAdapter.getHealth();
        System.out.println(getState() + " eats food with medicine feature. Health: " + health + "/50.");
    }

    public void evolve(Character c) {
        System.out.println("\nCongratulations! Your " + getState() + " evolved into " + Ninetales.getInstance().getState() + "!");
        c.changeState(Ninetales.getInstance());
    }
}
