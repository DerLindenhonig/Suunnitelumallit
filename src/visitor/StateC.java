package visitor;

public class StateC extends State {

    private static StateC instance;

    public static StateC getInstance() {
        if(instance == null) {
            instance = new StateC();
        }
        return instance;
    }

    public String getState() {
        return "Cinderace";
    }

    public void firstAction(Character c, int exp) {
        c.setExp(exp + 1);
        System.out.println("Pyro Ball");
    }

    public void secondAction(Character c, int exp) {
        System.out.println("Bulk Up");
    }

    public void thirdAction(Character c, int exp) {
        System.out.println("Sucker Punch");
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
