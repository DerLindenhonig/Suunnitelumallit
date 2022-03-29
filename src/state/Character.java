package state;

/** This is the context class.*/

public class Character {
    private State state;
    private int exp;

    public Character() {
        state = StateA.getInstance();
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

            System.out.println("\nPokemon " + state.getState() + " gets " + exp + "/10 EXP");

            if(exp == 5 || exp == 10) {
                state.evolve(this);
            }
        }
    }
}
