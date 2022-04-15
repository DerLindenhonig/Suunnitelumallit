package adapter.items;

public class FoodAdapter implements Medicine {
    Food food;

    public FoodAdapter(Food food) {
        this.food = food;
    }

    @Override
    public String getName() {
        return food.getName();
    }

    @Override
    public int getHealth() {
        return food.getBonusExp();
    }
}
