package decorator;

public class WithAnanas extends PizzaDecorator {
    public WithAnanas(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", ananas";
    }
}
