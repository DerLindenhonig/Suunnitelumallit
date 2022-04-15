package adapter;

public interface State {
    String getState();

    void firstAction(Character c, int exp);
    void secondAction(Character c, int exp);
    void thirdAction(Character c, int exp);
    void fourthAction(Character c, int exp);

    void evolve(Character c);
}
