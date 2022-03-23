package decorator;

public class WithSalami extends PizzaDecorator {
    public WithSalami(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", salami";
    }
}