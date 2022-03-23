package decorator;

public class WithPineapple extends PizzaDecorator {
    public WithPineapple(Pizza pizza) {
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