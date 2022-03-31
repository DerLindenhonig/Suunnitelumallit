package templatemethod;

import java.util.ArrayList;

public class Hangman extends Game {
    private int playersCount;
    private String inventedWord = "kissa";
    private char[] inventedLetters;
    private ArrayList guessedLetters = new ArrayList();
    private char[] alphabet = "abcdefghijklmnopqrstuvwxyzöä".toCharArray();
    private ArrayList randNumbers = new ArrayList();
    private int round = 0;
    private final int maxRound = 20;
    private String winner;

    void initializeGame() {
        playersCount = 2;
        round = 0;
        makeWordArray();
        updateScreen();
    }

    void makePlay(int player) {
        giveLetter();
        updateScreen();
    }

    boolean endOfGame() {
        round++;
        if(round == maxRound || guessedLetters.size() == inventedWord.length()-1) {
            if (guessedLetters.size() == inventedWord.length()-1) {
                winner = "\nArvaaja voittaa";
            } else {
                winner = "\nPiirtäjä voittaa";
            }
            return true;
        } else {
            return false;
        }
    }

    void printWinner() {
        System.out.print("\n----------------------------");
        System.out.println("\n----------------------------");
        System.out.print("PELI LOPPUI");
        System.out.println(winner);
    }

    private void updateScreen() {
        System.out.println(
                "\n\nHIRSIPUU: " + (round+1) + "/" + maxRound +
                        "\nSana:");

        /* Kirjoittaa keksityn sanan. Jos kirjainta ei löydy, kirjoittaa "_" merkin. */
        int i = 0;
        while(i < inventedLetters.length){
            boolean guessed = false;

            for(int a = 0; a < guessedLetters.size(); a++) {
                if(guessedLetters.get(a).equals(inventedLetters[i])) {
                    System.out.print(inventedLetters[i] + " ");
                    guessed = true;
                    break;
                }
            }
            if(guessed == false) {
                System.out.print("_ ");
            }
            guessed = false;
            i++;
        }
    }

    private void makeWordArray() {
        inventedLetters = new char[inventedWord.length()];
        for(int i=0; i<inventedWord.length(); i++) {
            inventedLetters[i] = inventedWord.charAt(i);
        }
    }

    private void giveLetter() {
        /* Sattunainen kirjain */
        int rand = (int)(Math.random()*(27-0+1));

        while(randNumbers.contains(rand)) {
            rand = (int)(Math.random()*(27-0+1));
        }

        System.out.println("\n\nArvaaja ehdottaa: " + alphabet[rand]);
        randNumbers.add(rand);

        /* Tarkistaa, löytyykö kirjain sanasta */
        if (inventedWord.contains(Character.toString(alphabet[rand]))) {
            guessedLetters.add(alphabet[rand]);
            System.out.println("Piirtäjä sanoo: Oikein!");
        } else {
            System.out.println("Piirtäjä sanoo: Väärin!");
        }
    }
}

