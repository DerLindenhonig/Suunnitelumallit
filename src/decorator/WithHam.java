package decorator;

public class WithHam extends PizzaDecorator {
    public WithHam(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", kinkku";
    }
}