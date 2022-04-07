package visitor;

public interface IVisitor {
    void visit(StateA a);
    void visit(StateB b);
    void visit(StateC c);
}
