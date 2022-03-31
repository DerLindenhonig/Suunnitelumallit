package templatemethod;

/** Pelin idea: Piirtäjä keksii sanan. Arvaaja arpoo kirjaimia. */

public class Main {
    public static void main(String[] args) {
        Game hangman = new Hangman();
        hangman.playOneGame(2);
    }
}
