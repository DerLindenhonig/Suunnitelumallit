package visitor;

public class StateB extends State {

    private static StateB instance;

    public static StateB getInstance() {
        if(instance == null) {
            instance = new StateB();
        }
        return instance;
    }

    public String getState() {
        return "Raboot";
    }

    public void firstAction(Character c, int exp) {
        c.setExp(exp + 1);
        System.out.println("Flare Blitz");
    }

    public void secondAction(Character c, int exp) {
        System.out.println("Sucker Punch");
    }

    public void thirdAction(Character c, int exp) {
        System.out.println("U-turn");
    }

    void evolve(Character c) {
        changeState(c, StateC.getInstance());
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
