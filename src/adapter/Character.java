package adapter;

public class Character {
    private State state;

    private int exp;

    public Character() {
        state = Vulpix.getInstance();
        exp = 0;
    }

    protected void changeState (State s) {
        state = s;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void fight() {
        for(int i = 0; i <= 10; i++) {
            System.out.println("\nPokemon " + state.getState() + " does actions:");

            state.firstAction(this, exp);
            state.secondAction(this, exp);
            state.thirdAction(this, exp);
            state.fourthAction(this, exp);

            System.out.println("\nPokemon " + state.getState() + " gets " + exp + " EXP");

            if(exp == 42) {
                state.evolve(this);
            }
        }
    }
}