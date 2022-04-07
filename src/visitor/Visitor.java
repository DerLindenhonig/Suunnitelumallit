package visitor;

public class Visitor implements IVisitor {
    public void visit(StateA a) {
        System.out.println("\nNew achievement unlocked!");
    }

    public void visit(StateB b) {
        System.out.println("\nNew achievement unlocked! Your pokemon evolved for the first time.");
    }

    public void visit(StateC c) {
        System.out.println("\nNew achievement unlocked! Your pokemon reached max level.");
    }
}
