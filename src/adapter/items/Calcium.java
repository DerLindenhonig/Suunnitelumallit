package adapter.items;

public class Calcium implements Medicine {
    @Override
    public String getName() {
        return "Calcium";
    }

    @Override
    public int getHealth() {
        return 10;
    }
}
