package decorator;

public class Main {
    public static  void print(Pizza pizza) {
        System.out.println("\nAinekset: " + pizza.getIngredients() + "\nHinta: " + pizza.getCost());
    }

    public static void main(String[] args) {
        Pizza pizza = new SimplePizza();
        print(pizza);

        Pizza pizzaWithPineapple = new WithPineapple(pizza);
        print(pizzaWithPineapple);

        Pizza pizzaWithHam = new WithHam(pizzaWithPineapple);
        print(pizzaWithHam);

        Pizza pizzaWithSalami2 = new WithSalami(pizzaWithPineapple);
        print(pizzaWithSalami2);

        Pizza pizzaWithSalami = new WithSalami(pizzaWithHam);
        print(pizzaWithSalami);
    }
}
