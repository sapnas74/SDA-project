package sdaakademija.fundamentals.practicalexercises.kartuves;

import java.util.Scanner;

public class WordGuessMain {
    public static void main(String[] args) {

        boolean unguessed = false;
        String wordToGuess = "respublika";
        char[] wordToGuessChar = wordToGuess.toCharArray();

        for (int i = 0; i < wordToGuessChar.length; i++) {
            System.out.print("_ ");
        }

        System.out.print("\n");

        String enteredWOC = getGuessedWordOrChar("Atspekite zodi is " + wordToGuessChar.length + " raidziu, spekite raide ");

        char[] enteredWordToChar = enteredWOC.toCharArray();

        }

    private static String getGuessedWordOrChar(String message) {
        Scanner enteredWordOrChar = new Scanner(System.in);
        System.out.println(message);
        return enteredWordOrChar.nextLine();


    }
}
