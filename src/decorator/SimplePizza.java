package decorator;

public class SimplePizza implements Pizza{
    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String getIngredients() {
        return "Pizzapohja";
    }
}
