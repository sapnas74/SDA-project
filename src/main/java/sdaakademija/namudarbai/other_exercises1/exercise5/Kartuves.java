package other_exercises1.exercise5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Kartuves {
    private static final String FILE_LOCATION_WORDS = "C:\\Users\\stkas\\IdeaProjects\\NamuDarbai-Basics-Refactored\\src\\other_exercises1\\exercise5\\Words";

    public static void main(String[] args) {
        String randomWord = chooseRandomWord();
        boolean inGame = true;
        CharReturningFromString finalChar = new CharReturningFromString();
        char workoutChar;
        char[] wordCharMassive = randomWord.toCharArray();
        char[] emptyMassive = new char[wordCharMassive.length];

        System.out.printf("%n");
        System.out.print("Atspekite zodi : ");
        for (int i = 0; i < wordCharMassive.length; i++) {
            System.out.print("_");
            System.out.print(" ");
            emptyMassive[i] = '_';
        }

        while (inGame) {
            System.out.printf("%n");
            workoutChar = finalChar.returnChar();
// Cia klausymas
            for (int i = 0; i < wordCharMassive.length; i++) {
                if (workoutChar == wordCharMassive[i]) {
                    emptyMassive[i] = workoutChar;
                }
            }
            for (int i = 0; i < wordCharMassive.length; i++) {
                System.out.print(emptyMassive[i]);
                System.out.print(" ");
            }
            if (Arrays.equals(wordCharMassive, emptyMassive)) {
                System.out.printf("%n");
                System.out.println("Sveikiname , Jus atspejote zodi !!! ");
                inGame = false;
            }
        }
    }

    private static String chooseRandomWord() {
        Random randomLinePosition = new Random();
        int linePosition = randomLinePosition.nextInt(4) + 1;
        String line = "";
        String randomLine = "";
        int i = 1;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION_WORDS))) {
            while (line != null) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                if (i == linePosition) {
                    randomLine = line;
                }
                i = i + 1;
            }
        } catch (IOException e) {
            System.out.println("KLAIDA !");
        }
        return randomLine;
    }
}
