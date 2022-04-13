package builder.builders;

import builder.burgers.HesburgerBurger;

public class HesburgerBuilder implements IBurgerBuilder {
    private HesburgerBurger burger;

    @Override
    public void createNewBurgerProduct() {
        burger = new HesburgerBurger();
    }

    @Override
    public HesburgerBurger getBurger() {
        return burger;
    }

    @Override
    public void buildSampyla() {
        burger.setSampyla("Sämpylä");
    }

    @Override
    public void buildKastike() {
        burger.setKastike("Kurkkumajoneesi");
    }

    @Override
    public void buildPihvi() {
        burger.setPihvi("Naudanlihapihvi");
    }
}
