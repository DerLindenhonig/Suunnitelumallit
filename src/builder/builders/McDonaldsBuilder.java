package builder.builders;

import builder.burgers.McDonaldsBurger;
import builder.osat.Bun;
import builder.osat.Patty;
import builder.osat.Sauce;

public class McDonaldsBuilder implements IBurgerBuilder {
    private McDonaldsBurger burger;

    @Override
    public void createNewBurgerProduct() {
        burger = new McDonaldsBurger();
    }

    @Override
    public McDonaldsBurger getBurger() {
        return burger;
    }

    @Override
    public void buildSampyla() {
        burger.setSampyla(new Bun());
    }

    @Override
    public void buildKastike() {
        burger.setKastike(new Sauce());
    }

    @Override
    public void buildPihvi() {
        burger.setPihvi(new Patty());
    }
}
