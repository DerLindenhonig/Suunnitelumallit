package decorator;

public class Main {
    public static  void print(Pizza pizza) {
        System.out.println("\nAinekset: " + pizza.getIngredients() + "\nHinta: " + pizza.getCost());
    }

    public static void main(String[] args) {
        Pizza pizza = new SimplePizza();
        print(pizza);

        Pizza pizza2 = new WithAnanas(pizza);
        print(pizza2);
    }
}
