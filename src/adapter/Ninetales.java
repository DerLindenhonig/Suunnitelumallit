package adapter;

import adapter.items.*;

public class Ninetales implements State {
    private int health;
    HoneyCake honeyCake = new HoneyCake();
    Medicine calcium = new Calcium();
    Medicine foodAdapter = new FoodAdapter(honeyCake);

    private Ninetales() {
        health = 100;
    }

    private static Ninetales instance;

    public static Ninetales getInstance() {
        if(instance == null) {
            instance = new Ninetales();
        }
        return instance;
    }

    public String getState() {
        return "Ninetales";
    }

    public void firstAction(Character c, int exp) {
        c.setExp(exp + 2);
        health -= 30;
        System.out.println(getState() + " attacks. Health: " + health + "/100.");
    }

    public void secondAction(Character c, int exp) {
        health += calcium.getHealth();
        System.out.println(getState() + " uses medicine. Health: " + health + "/100.");
    }

    public void thirdAction(Character c, int exp) {
        c.setExp(exp + honeyCake.getBonusExp());
        System.out.println(getState() + " eats food. EXP: " + c.getExp());
    }

    public void fourthAction(Character c, int exp) {
        health += foodAdapter.getHealth();
        System.out.println(getState() + " eats food with medicine feature. Health: " + health + "/100.");
    }

    public void evolve(Character c) {
        System.out.println("Your pokemon already got max upgrade");
    }
}