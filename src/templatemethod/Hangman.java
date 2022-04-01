package templatemethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Hangman extends Game {
    private int playersCount;
    private String inventedWord = "suunnittelumallit";                          // piirtäjän keksitty sana
    private char[] inventedLetters;                                             // piirtäjän keksitty sana char taulussa
    private ArrayList guessedLetters = new ArrayList();                         // kirjaimet, jotka arvaaja arvasi oikein
    private ArrayList wrongLetters = new ArrayList();                           // kirjaimet, jotka arvaaja arvasi väärin
    private char[] alphabet = "abcdefghijklmnopqrstuvwxyzöä".toCharArray();     // kirjaimet, jotkaa saa käyttää pelissä
    private ArrayList randNumbers = new ArrayList();
    private int round = 0;
    private final int maxRound = 19;
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
        String noDuplicatesLetters = Arrays.asList(inventedWord.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());

        if(wrongLetters.size() == maxRound || noDuplicatesLetters.length() == guessedLetters.size()) {
            if (noDuplicatesLetters.length() == guessedLetters.size()) {
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
        System.out.print("\n\nPELI LOPPUI");
        System.out.println(winner);
    }

    private void updateScreen() {
        System.out.println("\n\nHIRSIPUU: " + "\nVäärät kirjaimet: " + wrongLetters + "\nKeksitty sana:");

        /* Kirjoittaa keksityn sanan. Jos arvaaja ei arvannut kirjainta vielä, kirjoittaa "_" merkin sen sijään. */
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
            wrongLetters.add(alphabet[rand]);
        }
    }
}

