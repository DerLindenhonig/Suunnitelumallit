package visitor;

public class StateA extends State {

    private static StateA instance;

    public static StateA getInstance() {
        if(instance == null) {
            instance = new StateA();
        }
        return instance;
    }

    public String getState() {
        return "Scorbunny";
    }

    public void firstAction(Character c, int exp) {
        c.setExp(exp + 1);
        System.out.println("Blaze Kick");
    }

    public void secondAction(Character c, int exp) {
        System.out.println("Gunk Shot");
    }

    public void thirdAction(Character c, int exp) {
        System.out.println("High Jump Kick");
    }

    void evolve(Character c) {
        changeState(c, StateB.getInstance());
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public void bonus() {
        System.out.println("\nYou get bonus!");
    }
}
