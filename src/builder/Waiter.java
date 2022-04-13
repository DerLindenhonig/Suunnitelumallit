package builder;

/* Director */

import builder.builders.IBurgerBuilder;

public class Waiter {
    private IBurgerBuilder burgerBuilder;
    public void setBurgerBuilder(IBurgerBuilder bb) { burgerBuilder = bb; }
    public void constructBurger() {
        burgerBuilder.createNewBurgerProduct();
        burgerBuilder.buildSampyla();
        burgerBuilder.buildKastike();
        burgerBuilder.buildPihvi();
    }
}