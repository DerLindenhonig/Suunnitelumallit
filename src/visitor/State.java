package visitor;

abstract class State {
    String getState() { return ""; }

    void firstAction(Character c, int exp) {}
    void secondAction(Character c, int exp) {}
    void thirdAction(Character c, int exp) {}

    void evolve(Character c) {}
    void changeState(Character c, State s) {
        c.changeState(s);
    }
    void accept(IVisitor v) {}

    void bonus() {}
}
