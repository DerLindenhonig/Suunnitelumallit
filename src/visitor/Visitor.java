package visitor;

public class Visitor implements IVisitor {
    public void visit(StateA a) {
        a.bonus();
    }

    public void visit(StateB b) {
        b.bonus();
    }

    public void visit(StateC c) {
        c.bonus();
    }
}
