package adapter.items;

public class HoneyCake implements Food {
    @Override
    public String getName() {
        return "Honey Cake";
    }

    @Override
    public int getBonusExp() {
        return 5;
    }
}
